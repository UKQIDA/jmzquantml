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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The provider of the document in terms of the Contact and the software the produced the document instance. 
 * 
 * <p>Java class for ProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}IdentifiableType">
 *       &lt;sequence>
 *         &lt;element name="ContactRole" type="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}ContactRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="analysisSoftware_ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderType", propOrder = {
    "contactRole"
})
public class ProviderType
    extends IdentifiableType
{

    @XmlElement(name = "ContactRole")
    protected ContactRoleType contactRole;
    @XmlAttribute(name = "analysisSoftware_ref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object analysisSoftwareRef;

    /**
     * Gets the value of the contactRole property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRoleType }
     *     
     */
    public ContactRoleType getContactRole() {
        return contactRole;
    }

    /**
     * Sets the value of the contactRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRoleType }
     *     
     */
    public void setContactRole(ContactRoleType value) {
        this.contactRole = value;
    }

    /**
     * Gets the value of the analysisSoftwareRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnalysisSoftwareRef() {
        return analysisSoftwareRef;
    }

    /**
     * Sets the value of the analysisSoftwareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnalysisSoftwareRef(Object value) {
        this.analysisSoftwareRef = value;
    }

}
