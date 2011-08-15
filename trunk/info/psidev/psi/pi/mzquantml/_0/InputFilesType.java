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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All the raw files, identification files and databases used in the quantification
 * 
 * <p>Java class for InputFilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputFilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawFilesGroup" type="{http://psidev.info/psi/pi/mzQuantML/0.1}RawFilesGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IdentificationFiles" type="{http://psidev.info/psi/pi/mzQuantML/0.1}IdentificationFilesType" minOccurs="0"/>
 *         &lt;element name="SearchDatabase" type="{http://psidev.info/psi/pi/mzQuantML/0.1}SearchDatabaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SourceFile" type="{http://psidev.info/psi/pi/mzQuantML/0.1}SourceFileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputFilesType", propOrder = {
    "rawFilesGroup",
    "identificationFiles",
    "searchDatabase",
    "sourceFile"
})
public class InputFilesType {

    @XmlElement(name = "RawFilesGroup")
    protected List<RawFilesGroupType> rawFilesGroup;
    @XmlElement(name = "IdentificationFiles")
    protected IdentificationFilesType identificationFiles;
    @XmlElement(name = "SearchDatabase")
    protected List<SearchDatabaseType> searchDatabase;
    @XmlElement(name = "SourceFile")
    protected List<SourceFileType> sourceFile;

    /**
     * Gets the value of the rawFilesGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rawFilesGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRawFilesGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RawFilesGroupType }
     * 
     * 
     */
    public List<RawFilesGroupType> getRawFilesGroup() {
        if (rawFilesGroup == null) {
            rawFilesGroup = new ArrayList<RawFilesGroupType>();
        }
        return this.rawFilesGroup;
    }

    /**
     * Gets the value of the identificationFiles property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationFilesType }
     *     
     */
    public IdentificationFilesType getIdentificationFiles() {
        return identificationFiles;
    }

    /**
     * Sets the value of the identificationFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationFilesType }
     *     
     */
    public void setIdentificationFiles(IdentificationFilesType value) {
        this.identificationFiles = value;
    }

    /**
     * Gets the value of the searchDatabase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDatabase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchDatabase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchDatabaseType }
     * 
     * 
     */
    public List<SearchDatabaseType> getSearchDatabase() {
        if (searchDatabase == null) {
            searchDatabase = new ArrayList<SearchDatabaseType>();
        }
        return this.searchDatabase;
    }

    /**
     * Gets the value of the sourceFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceFileType }
     * 
     * 
     */
    public List<SourceFileType> getSourceFile() {
        if (sourceFile == null) {
            sourceFile = new ArrayList<SourceFileType>();
        }
        return this.sourceFile;
    }

}
