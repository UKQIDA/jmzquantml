//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.28 at 10:54:59 AM BST 
//


package info.psidev.psi.pi.mzquantml._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A raw mass spectrometry output file that has been analysed e.g. in mzML format. The same raw file can be referenced in multiple assays, for example if it contains multiple samples differentially labelled or tagged. Note, the name raw file does not necessarily imply that the file has not been processed, since in some quant methods, processed peak list formats such as MGF or dta can be used, which could be referenced here.  
 * 
 * <p>Java class for RawFileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawFileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}ExternalDataType">
 *       &lt;group ref="{http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2}ParamGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attribute name="methodFile_ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawFileType", propOrder = {
    "paramGroup"
})
public class RawFileType
    extends ExternalDataType
{

    @XmlElements({
        @XmlElement(name = "cvParam", type = CVParamType.class),
        @XmlElement(name = "userParam", type = UserParamType.class)
    })
    protected List<AbstractParamType> paramGroup;
    @XmlAttribute(name = "methodFile_ref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object methodFileRef;

    /**
     * Additional parameters about the raw file.Gets the value of the paramGroup property.
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
     * Gets the value of the methodFileRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMethodFileRef() {
        return methodFileRef;
    }

    /**
     * Sets the value of the methodFileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMethodFileRef(Object value) {
        this.methodFileRef = value;
    }

}
