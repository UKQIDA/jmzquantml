
package uk.ac.liv.pgb.jmzqml.model.mzqml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import uk.ac.liv.pgb.jmzqml.model.MzQuantMLObject;

/**
 * The role that a Contact plays in an organization or with respect to the
 * associating class. A Contact may have several Roles within scope, and as
 * such,
 * associations to ContactRole allow the use of a Contact in a certain manner.
 * Examples
 * might include a provider, or a data analyst.
 *
 * <p>
 * Java class for ContactRoleType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ContactRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{http://psidev.info/psi/pi/mzQuantML/1.0.0}RoleType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="contact_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRoleType", propOrder = {
    "role"
})
public class ContactRole
        implements Serializable, MzQuantMLObject {

    private final static long serialVersionUID = 100L;
    /**
     *
     */
    @XmlElement(name = "Role", required = true)
    protected Role role;
    /**
     *
     */
    @XmlAttribute(name = "contact_ref", required = true)
    protected String contactRef;
    /**
     *
     */
    @XmlTransient
    protected AbstractContact contact;

    /**
     *
     * @return person
     */
    public Person getPerson() {
        if (contact instanceof Person) {
            return (Person) contact;
        } else {
            return null;
        }
    }

    /**
     *
     * @return organization
     */
    public Organization getOrganization() {
        if (contact instanceof Organization) {
            return (Organization) contact;
        } else {
            return null;
        }
    }

    /**
     * Gets the value of the role property.
     *
     * @return
     *         possible object is
     *         {@link Role }
     *
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     *
     * @param value
     *              allowed object is
     *              {@link Role }
     *
     */
    public void setRole(Role value) {
        this.role = value;
    }

    /**
     * Gets the value of the contactRef property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getContactRef() {
        return contactRef;
    }

    /**
     *
     * @return abstract contact
     */
    public AbstractContact getContact() {
        return contact;
    }

    /**
     * Set contact. contactRef is also updated.
     *
     * @param contact abstract contact
     */
    public void setContact(AbstractContact contact) {
        if (contact == null) {
            this.contactRef = null;
        } else {
            String refId = contact.getId();
            if (refId == null) {
                throw new IllegalArgumentException(
                        "Referenced object does not have an identifier.");
            }
            this.contactRef = refId;
        }
        this.contact = contact;
    }

}
