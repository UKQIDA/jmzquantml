
package uk.ac.liv.jmzqml.model.mzqml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.ac.liv.jmzqml.model.MzQuantMLObject;


/**
 * Description of the way in which a particular software package was used to analyse data and for example produce different quant layers or lists in the file.
 * 
 * <p>Java class for DataProcessingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProcessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InputObject_refs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
 *         &lt;element name="OutputObject_refs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
 *         &lt;element name="ProcessingMethod" type="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc3}ProcessingMethodType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="software_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProcessingType", propOrder = {
    "inputObjectRefs",
    "outputObjectRefs",
    "processingMethod"
})
public class DataProcessing
    implements Serializable, MzQuantMLObject
{

    private final static long serialVersionUID = 100L;
    @XmlList
    @XmlElement(name = "InputObject_refs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> inputObjectRefs;
    @XmlList
    @XmlElement(name = "OutputObject_refs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> outputObjectRefs;
    @XmlElement(name = "ProcessingMethod", required = true)
    protected List<ProcessingMethod> processingMethod;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "software_ref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object softwareRef;
    @XmlAttribute(name = "order", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger order;

    /**
     * Gets the value of the inputObjectRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputObjectRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputObjectRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getInputObjectRefs() {
        if (inputObjectRefs == null) {
            inputObjectRefs = new ArrayList<Object>();
        }
        return this.inputObjectRefs;
    }

    /**
     * Gets the value of the outputObjectRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputObjectRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputObjectRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOutputObjectRefs() {
        if (outputObjectRefs == null) {
            outputObjectRefs = new ArrayList<Object>();
        }
        return this.outputObjectRefs;
    }

    /**
     * Gets the value of the processingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingMethod }
     * 
     * 
     */
    public List<ProcessingMethod> getProcessingMethod() {
        if (processingMethod == null) {
            processingMethod = new ArrayList<ProcessingMethod>();
        }
        return this.processingMethod;
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

    /**
     * Gets the value of the softwareRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSoftwareRef() {
        return softwareRef;
    }

    /**
     * Sets the value of the softwareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSoftwareRef(Object value) {
        this.softwareRef = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
