//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.26 at 01:45:50 PM BST 
//


package info.psidev.psi.pi.mzquantml._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProteinListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProteinListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Protein" type="{http://psidev.info/psi/pi/mzQuantML/0.1}ProteinType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QuantLayer" type="{http://psidev.info/psi/pi/mzQuantML/0.1}QuantLayerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProteinListType", propOrder = {
    "protein",
    "quantLayer"
})
public class ProteinListType {

    @XmlElement(name = "Protein")
    protected List<ProteinType> protein;
    @XmlElement(name = "QuantLayer")
    protected List<QuantLayerType> quantLayer;

    /**
     * Gets the value of the protein property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protein property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtein().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinType }
     * 
     * 
     */
    public List<ProteinType> getProtein() {
        if (protein == null) {
            protein = new ArrayList<ProteinType>();
        }
        return this.protein;
    }

    /**
     * Gets the value of the quantLayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantLayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantLayerType }
     * 
     * 
     */
    public List<QuantLayerType> getQuantLayer() {
        if (quantLayer == null) {
            quantLayer = new ArrayList<QuantLayerType>();
        }
        return this.quantLayer;
    }

}
