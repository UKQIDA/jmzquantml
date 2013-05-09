/*
 * Date: 06-Jul-2012
 * Author: Da Qi
 * File: uk.ac.liv.jmzqml.xml.Constants.java
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

package uk.ac.liv.jmzqml.xml;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import uk.ac.liv.jmzqml.MzQuantMLElement;

/**
 *
 * @author Da Qi
 * @institute University of Liverpool
 * @time 06-Jul-2012 11:26:26
 */
public class Constants {

    public static final String JAXB_ENCODING_PROPERTY = "jaxb.encoding";
    public static final String JAXB_FORMATTING_PROPERTY = "jaxb.formatted.output";
    public static final String JAXB_SCHEMALOCATION_PROPERTY = "jaxb.schemaLocation";
    public static final String JAXB_FRAGMENT_PROPERTY = "jaxb.fragment";
    
    private static Set<String> xpathsToIndex = new HashSet<String>();

    static {
        for (MzQuantMLElement element : MzQuantMLElement.values()) {
            if (element.isIndexed()) {
                xpathsToIndex.add(element.getXpath());
            }
        }
        //finally make the set unmordifiable
        xpathsToIndex = Collections.unmodifiableSet(xpathsToIndex);
    }

    public static final Set<String> XML_INDEXED_XPATHS = xpathsToIndex;
}
