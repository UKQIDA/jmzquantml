//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.29 at 03:03:28 PM BST 
//


package info.psidev.psi.pi.mzquantml._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All methods files associated with this quantitation analysis to be referenced elsewhere, for example used to describe TraML files used in SRM analysis.
 * 
 * <p>Java class for MethodFilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodFilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MethodFile" type="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}MethodFileType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodFilesType", propOrder = {
    "methodFile"
})
public class MethodFilesType {

    @XmlElement(name = "MethodFile", required = true)
    protected List<MethodFileType> methodFile;

    /**
     * Gets the value of the methodFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodFileType }
     * 
     * 
     */
    public List<MethodFileType> getMethodFile() {
        if (methodFile == null) {
            methodFile = new ArrayList<MethodFileType>();
        }
        return this.methodFile;
    }

}
