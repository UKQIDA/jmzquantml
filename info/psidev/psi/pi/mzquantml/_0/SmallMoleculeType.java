//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.14 at 02:09:14 PM BST 
//


package info.psidev.psi.pi.mzquantml._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An element to represent a unique identifier of a small molecule for which quantitative values are reported.
 * 
 * <p>Java class for SmallMoleculeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmallMoleculeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Modification" type="{http://psidev.info/psi/pi/mzQuantML/0.1}SmallMolModificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DBIdentificationRef" type="{http://psidev.info/psi/pi/mzQuantML/0.1}DBIdentificationRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MatchedFeature_refs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
 *         &lt;group ref="{http://psidev.info/psi/pi/mzQuantML/0.1}ParamGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmallMoleculeType", propOrder = {
    "modification",
    "dbIdentificationRef",
    "matchedFeatureRefs",
    "paramGroup"
})
public class SmallMoleculeType {

    @XmlElement(name = "Modification")
    protected List<SmallMolModificationType> modification;
    @XmlElement(name = "DBIdentificationRef")
    protected List<DBIdentificationRefType> dbIdentificationRef;
    @XmlList
    @XmlElement(name = "MatchedFeature_refs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> matchedFeatureRefs;
    @XmlElements({
        @XmlElement(name = "cvParam", type = CVParamType.class),
        @XmlElement(name = "userParam", type = UserParamType.class)
    })
    protected List<AbstractParamType> paramGroup;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the modification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmallMolModificationType }
     * 
     * 
     */
    public List<SmallMolModificationType> getModification() {
        if (modification == null) {
            modification = new ArrayList<SmallMolModificationType>();
        }
        return this.modification;
    }

    /**
     * Gets the value of the dbIdentificationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbIdentificationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDBIdentificationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBIdentificationRefType }
     * 
     * 
     */
    public List<DBIdentificationRefType> getDBIdentificationRef() {
        if (dbIdentificationRef == null) {
            dbIdentificationRef = new ArrayList<DBIdentificationRefType>();
        }
        return this.dbIdentificationRef;
    }

    /**
     * Gets the value of the matchedFeatureRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchedFeatureRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchedFeatureRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getMatchedFeatureRefs() {
        if (matchedFeatureRefs == null) {
            matchedFeatureRefs = new ArrayList<Object>();
        }
        return this.matchedFeatureRefs;
    }

    /**
     * Additional parameters or values about this small molecule.Gets the value of the paramGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVParamType }
     * {@link UserParamType }
     * 
     * 
     */
    public List<AbstractParamType> getParamGroup() {
        if (paramGroup == null) {
            paramGroup = new ArrayList<AbstractParamType>();
        }
        return this.paramGroup;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
