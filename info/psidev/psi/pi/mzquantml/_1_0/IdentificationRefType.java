//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.16 at 11:33:56 PM BST 
//


package info.psidev.psi.pi.mzquantml._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to an external identification file defined in the document, plus a unique identifier for the object in that file, such as an ID of a SpectrumIdentificationItem, ProteinDetectionHypothesis or ProteinAmbiguityGroup in mzIdentML. 
 * 
 * <p>Java class for IdentificationRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IdentificationFile_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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

    @XmlAttribute(name = "id_ref", required = true)
    protected String idRef;
    @XmlAttribute(name = "IdentificationFile_ref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object identificationFileRef;

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
     * Gets the value of the identificationFileRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdentificationFileRef() {
        return identificationFileRef;
    }

    /**
     * Sets the value of the identificationFileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdentificationFileRef(Object value) {
        this.identificationFileRef = value;
    }

}
