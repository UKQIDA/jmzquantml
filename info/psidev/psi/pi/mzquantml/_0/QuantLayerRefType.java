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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to QuantLayers about this object
 * 
 * <p>Java class for QuantLayerRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantLayerRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="quantLayer_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantLayerRefType")
public class QuantLayerRefType {

    @XmlAttribute(name = "quantLayer_ref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object quantLayerRef;

    /**
     * Gets the value of the quantLayerRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantLayerRef() {
        return quantLayerRef;
    }

    /**
     * Sets the value of the quantLayerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantLayerRef(Object value) {
        this.quantLayerRef = value;
    }

}