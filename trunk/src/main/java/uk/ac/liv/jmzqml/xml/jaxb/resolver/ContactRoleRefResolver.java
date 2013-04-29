/*
 * Date: 29-Apr-2013
 * Author: Da Qi
 * File: uk.ac.liv.jmzqml.xml.jaxb.resolver.ContactRoleRefResolver.java
 *
 * jmzquantml is Copyright 2013 University of Liverpool.
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

package uk.ac.liv.jmzqml.xml.jaxb.resolver;

import uk.ac.liv.jmzqml.model.mzqml.AbstractContact;
import uk.ac.liv.jmzqml.model.mzqml.ContactRole;
import uk.ac.liv.jmzqml.xml.io.MzQuantMLObjectCache;
import uk.ac.liv.jmzqml.xml.xxindex.MzQuantMLIndexer;

/**
 *
 * @author Da Qi
 * @institute University of Liverpool
 * @time 29-Apr-2013 14:11:27
 */
public class ContactRoleRefResolver extends AbstractReferenceResolver<ContactRole>{

    public ContactRoleRefResolver(MzQuantMLIndexer index, MzQuantMLObjectCache cache){
        super(index, cache);
    }
    
    public void updateObject(ContactRole object){
        AbstractContact ac = (AbstractContact) object.getContactRef();
        String ref = ac.getId();
        if (ref!=null){
            AbstractContact refObject = this.unmarshal(ref, AbstractContact.class);
            object.setContactRef(refObject);
        }
    }
}
