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
 * A reference to an object identified in the SearchDatabase object defined in this file.
 * 
 * <p>Java class for DBIdentificationRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBIdentificationRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SearchDatabase_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBIdentificationRefType")
public class DBIdentificationRefType {

    @XmlAttribute(name = "id_ref", required = true)
    protected String idRef;
    @XmlAttribute(name = "SearchDatabase_ref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object searchDatabaseRef;

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
     * Gets the value of the searchDatabaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSearchDatabaseRef() {
        return searchDatabaseRef;
    }

    /**
     * Sets the value of the searchDatabaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSearchDatabaseRef(Object value) {
        this.searchDatabaseRef = value;
    }

}
