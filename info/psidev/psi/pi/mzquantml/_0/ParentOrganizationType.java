//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.24 at 04:45:19 PM BST 
//


package info.psidev.psi.pi.mzquantml._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The containing organization (the university or business which a lab belongs to, etc.) 
 * 
 * <p>Java class for ParentOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="organization_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentOrganizationType")
public class ParentOrganizationType {

    @XmlAttribute(name = "organization_ref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object organizationRef;

    /**
     * Gets the value of the organizationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOrganizationRef() {
        return organizationRef;
    }

    /**
     * Sets the value of the organizationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrganizationRef(Object value) {
        this.organizationRef = value;
    }

}
