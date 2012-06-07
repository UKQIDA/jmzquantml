//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.07 at 05:05:23 PM BST 
//


package info.psidev.psi.pi.mzquantml._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The list of experimental conditions used to group results.
 * 
 * <p>Java class for StudyVariableListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudyVariableListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudyVariable" type="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}StudyVariableType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudyVariableListType", propOrder = {
    "studyVariable"
})
public class StudyVariableListType {

    @XmlElement(name = "StudyVariable", required = true)
    protected List<StudyVariableType> studyVariable;

    /**
     * Gets the value of the studyVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudyVariableType }
     * 
     * 
     */
    public List<StudyVariableType> getStudyVariable() {
        if (studyVariable == null) {
            studyVariable = new ArrayList<StudyVariableType>();
        }
        return this.studyVariable;
    }

}
