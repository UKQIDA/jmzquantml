//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.26 at 01:45:50 PM BST 
//


package info.psidev.psi.pi.mzquantml._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id_ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="file_ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationRefType")
public class IdentificationRefType {

    @XmlAttribute(name = "id_ref")
    protected String idRef;
    @XmlAttribute(name = "file_ref")
    protected String fileRef;

    /**
     * Gets the value of the idRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRef() {
        return idRef;
    }

    /**
     * Sets the value of the idRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRef(String value) {
        this.idRef = value;
    }

    /**
     * Gets the value of the fileRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileRef() {
        return fileRef;
    }

    /**
     * Sets the value of the fileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileRef(String value) {
        this.fileRef = value;
    }

}