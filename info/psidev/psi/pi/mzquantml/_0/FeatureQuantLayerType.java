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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * All the data types generated about the raw features e.g. prior to
 * 				feature matching.
 * 
 * <p>Java class for FeatureQuantLayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureQuantLayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureColumnIndex" type="{http://psidev.info/psi/pi/mzQuantML/0.1}FeatureColumnIndexType"/>
 *         &lt;element name="DataMatrix" type="{http://psidev.info/psi/pi/mzQuantML/0.1}DataMatrixType"/>
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
@XmlType(name = "FeatureQuantLayerType", propOrder = {
    "featureColumnIndex",
    "dataMatrix"
})
public class FeatureQuantLayerType {

    @XmlElement(name = "FeatureColumnIndex", required = true)
    protected FeatureColumnIndexType featureColumnIndex;
    @XmlElement(name = "DataMatrix", required = true)
    protected DataMatrixType dataMatrix;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the featureColumnIndex property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureColumnIndexType }
     *     
     */
    public FeatureColumnIndexType getFeatureColumnIndex() {
        return featureColumnIndex;
    }

    /**
     * Sets the value of the featureColumnIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureColumnIndexType }
     *     
     */
    public void setFeatureColumnIndex(FeatureColumnIndexType value) {
        this.featureColumnIndex = value;
    }

    /**
     * Gets the value of the dataMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link DataMatrixType }
     *     
     */
    public DataMatrixType getDataMatrix() {
        return dataMatrix;
    }

    /**
     * Sets the value of the dataMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataMatrixType }
     *     
     */
    public void setDataMatrix(DataMatrixType value) {
        this.dataMatrix = value;
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