/*
 * Date: 09-Apr-2013
 * Author: Da Qi
 * File: uk.ac.liv.pgb.jmzqml.model.CvParamCapable.java
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

package uk.ac.liv.pgb.jmzqml.model;

import uk.ac.liv.pgb.jmzqml.model.mzqml.CvParam;

/**
 *
 * @author Da Qi
 * @institute University of Liverpool
 * @time 09-Apr-2013 16:33:48
 */
public interface CvParamCapable {

    /**
     * Gets a CvParam object.
     *
     * @return a CvParam object.
     */
    public CvParam getCvParam();

    /**
     * Sets a CvParam object.
     *
     * @param param a CvParam object.
     */
    public void setCvParam(CvParam param);

}