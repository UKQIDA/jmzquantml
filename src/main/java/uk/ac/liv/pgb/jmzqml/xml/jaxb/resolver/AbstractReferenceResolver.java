/*
 * Date: 21-Jun-2012
 * Author: Da Qi
 * File: uk.ac.liv.pgb.jmzqml.xml.jaxb.resolver.AbstractReferenceResolver.java
 *
 * jmzquantml is Copyright 2012 University of Liverpool.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.liv.pgb.jmzqml.xml.jaxb.resolver;

import java.io.StringReader;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import org.apache.log4j.Logger;
import org.xml.sax.InputSource;
import uk.ac.liv.pgb.jmzqml.MzQuantMLElement;
import uk.ac.liv.pgb.jmzqml.model.MzQuantMLObject;
import uk.ac.liv.pgb.jmzqml.model.mzqml.AbstractContact;
import uk.ac.liv.pgb.jmzqml.model.mzqml.Organization;
import uk.ac.liv.pgb.jmzqml.model.mzqml.Person;
import uk.ac.liv.pgb.jmzqml.xml.io.MzQuantMLObjectCache;
import uk.ac.liv.pgb.jmzqml.xml.jaxb.unmarshaller.UnmarshallerFactory;
import uk.ac.liv.pgb.jmzqml.xml.jaxb.unmarshaller.filters.MzQuantMLNamespaceFilter;
import uk.ac.liv.pgb.jmzqml.xml.xxindex.MzQuantMLIndexer;

/**
 *
 * @param <T> extends {@link uk.ac.liv.pgb.jmzqml.model.MzQuantMLObject}.
 *
 * @author Da Qi
 * @institute University of Liverpool
 * @time 21-Jun-2012 23:35:15
 */
public abstract class AbstractReferenceResolver<T extends MzQuantMLObject>
        extends Unmarshaller.Listener {

    private static final Logger LOG = Logger.getLogger(
            AbstractReferenceResolver.class);
    private final MzQuantMLIndexer index;
    private final MzQuantMLObjectCache cache;

    /**
     * Constructor of AbstractReferenceResolver.
     *
     * @param indexp MzQuantMLIndexer
     * @param cachep MzQuantMLObjectCache
     *
     */
    protected AbstractReferenceResolver(final MzQuantMLIndexer indexp,
                                        final MzQuantMLObjectCache cachep) {
        this.index = indexp;
        this.cache = cachep;
    }

    /**
     * Unmarshal one object for the specified class according to the reference
     * id.
     * Note: The class has to refer to MzQuantMLObject elements.
     *
     * @param <R>   extends {@link uk.ac.liv.pgb.jmzqml.model.MzQuantMLObject}.
     * @param refId the reference id of the object.
     * @param cls   the type of class of the object.
     *
     * @return an object of the specified class.
     */
    public final <R extends MzQuantMLObject> R unmarshal(final String refId,
                                                         final Class<R> cls) {
        R retVal;
        Class<R> clz = cls;

        // check if we have a cache to look up, if so see if it contains the
        // referenced object already
        //        if (cache != null) {
        //            retVal = cache.getCachedObject(refId, cls);
        //        }
        // if the referenced object/element is not yet in the cache (or no cache
        // is available) create it from the XML using the index and ID maps
        LOG.debug("AbstractReferenceResolver.unmarshal for id: " + refId);
        // first retrieve the XML snippet representing the referenced object/element
        String xml;
        // special case for ContactRole.class as we can either have a
        // Person.class or a Organisation.class

        if (cls == AbstractContact.class) {
            LOG.debug("SPECIAL CASE: ContactRole");
            // see if the ID fits a Person
            String personXML = index.getXmlString(refId, Person.class);
            // see if the ID fits an Organisation
            String organisationXML = index.getXmlString(refId,
                                                        Organization.class);
            if (personXML != null && organisationXML == null) {
                xml = personXML;
                clz = MzQuantMLElement.Person.getClazz();
            } else if (personXML == null && organisationXML != null) {
                xml = organisationXML;
                clz = MzQuantMLElement.Organization.getClazz();
            } else {
                throw new IllegalStateException(
                        "Could not uniquely resolve ContactRole reference "
                        + refId);
            }
        } else {
            xml = index.getXmlString(refId, cls);
        }

        try {
            // required for the addition of namespaces to top-level objects
            MzQuantMLNamespaceFilter xmlFilter = new MzQuantMLNamespaceFilter();

            // initializeUnmarshaller will assign the proper reader to the xmlFilter
            Unmarshaller unmarshaller = UnmarshallerFactory.getInstance().
                    initializeUnmarshaller(index, cache, xmlFilter);

            // need to do it this way because snippet does not have a XmlRootElement annotation
            JAXBElement<R> holder = unmarshaller.unmarshal(new SAXSource(
                    xmlFilter, new InputSource(new StringReader(xml))), clz);
            retVal = holder.getValue();

            /*
             * if (originalClass == ContactRole.class) {
             * ContactRole contact = new ContactRole();
             * contact.setPersonOrOrganization((AbstractContact) retVal);
             * return (R) contact;
             * }
             */
            // add it to the cache, if we there is one (as it was not in there)
            // the cache may accept this object or not depending on the settings in MzIdentMLElement
//                if (cache != null) {
//                    cache.putInCache(refId, retVal);
//                }
        } catch (JAXBException e) {
            LOG.error("AbstractReferenceResolver.unmarshal", e);
            throw new IllegalStateException(
                    "Could not unmarshall refId: " + refId
                    + " for element type: " + cls);
        }

        // finally return the referenced object
        return retVal;
    }

    /**
     * Get index.
     *
     * @return index
     */
    protected final MzQuantMLIndexer getIndexer() {
        return this.index;
    }

    /**
     * Update the target object.
     *
     * @param object the object to modify after unmarshalling.
     */
    public abstract void updateObject(T object);

}
