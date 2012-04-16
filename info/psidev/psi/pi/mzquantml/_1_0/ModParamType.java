//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.16 at 11:33:56 PM BST 
//


package info.psidev.psi.pi.mzquantml._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The modification searched for, sourced from e.g. UniMod and the mass delta
 * 
 * <p>Java class for ModParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvParam" type="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}CVParamType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="massDelta" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="residues" type="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}listOfChars" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModParamType", propOrder = {
    "cvParam"
})
public class ModParamType {

    @XmlElement(required = true)
    protected CVParamType cvParam;
    @XmlAttribute(name = "massDelta")
    protected Float massDelta;
    @XmlAttribute(name = "residues")
    protected List<String> residues;

    /**
     * Gets the value of the cvParam property.
     * 
     * @return
     *     possible object is
     *     {@link CVParamType }
     *     
     */
    public CVParamType getCvParam() {
        return cvParam;
    }

    /**
     * Sets the value of the cvParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVParamType }
     *     
     */
    public void setCvParam(CVParamType value) {
        this.cvParam = value;
    }

    /**
     * Gets the value of the massDelta property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMassDelta() {
        return massDelta;
    }

    /**
     * Sets the value of the massDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMassDelta(Float value) {
        this.massDelta = value;
    }

    /**
     * Gets the value of the residues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResidues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResidues() {
        if (residues == null) {
            residues = new ArrayList<String>();
        }
        return this.residues;
    }

}
