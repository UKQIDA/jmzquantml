/*
 * Date: 14-May-2013
 * Author: Da Qi
 * File: uk.ac.liv.pgb.jmzqml.xml.jaxb.resolver.RatioQuantLayerRefResolver.java
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

package uk.ac.liv.pgb.jmzqml.xml.jaxb.resolver;

import java.util.ArrayList;
import java.util.List;
import uk.ac.liv.pgb.jmzqml.MzQuantMLElement;
import uk.ac.liv.pgb.jmzqml.model.mzqml.Ratio;
import uk.ac.liv.pgb.jmzqml.model.mzqml.RatioQuantLayer;
import uk.ac.liv.pgb.jmzqml.xml.io.MzQuantMLObjectCache;
import uk.ac.liv.pgb.jmzqml.xml.xxindex.MzQuantMLIndexer;

/**
 *
 * @author Da Qi
 * @institute University of Liverpool
 * @time 14-May-2013 23:09:04
 */
public class RatioQuantLayerRefResolver extends AbstractReferenceResolver<RatioQuantLayer> {

    /**
     *
     * @param index MzQuantMLIndexer
     * @param cache MzQuantMLObjectCache
     */
    public RatioQuantLayerRefResolver(final MzQuantMLIndexer index,
                                      final MzQuantMLObjectCache cache) {
        super(index, cache);
    }

    /**
     *
     * @param object RatioQuantLayer
     */
    @Override
    public final void updateObject(final RatioQuantLayer object) {

        //ColumnIndex
        List<String> refs1 = object.getColumnIndex();

        List<Ratio> refObjects1 = new ArrayList<>();
        for (String ref1 : refs1) {
            Ratio refObject1 = this.unmarshal(ref1, Ratio.class);
            refObjects1.add(refObject1);
        }
        object.setColumnIndex(refObjects1);
    }

    /**
     * Method to perform the afterUnmarshal operation if the resolver
     * applies to the specified object.
     *
     * @param target the object to modify after unmarshalling.
     * @param parent object referencing the target. Null if target is root
     *               element.
     */
    @Override
    public final void afterUnmarshal(final Object target, final Object parent) {
        if (RatioQuantLayer.class.isInstance(target)
                && MzQuantMLElement.RatioQuantLayer.
                isAutoRefResolving()) {
            updateObject((RatioQuantLayer) target);
        } // else, not business of this resolver
    }

}
