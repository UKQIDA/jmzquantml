/**
 * JAXB-based Marshaller for a mzQuantML file.
 */
package info.psidev.psi.pi.mzquantml.io;

import info.psidev.psi.pi.mzquantml._1_0.MzQuantMLType;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

/**
 * Class for marshalling a MzQuantMLFile.
 * @author Gerhard Mayer, MPC, Ruhr-University of Bochum
 */
public class MzQuantMLMarshaller {

    /**
     * Constants.
     */
    private static final String ENCODING = "UTF-8";
    private static final String MZQUANTML = "MzQuantML";

    private static final String MZQUANTML_NS = "http://psidev.info/psi/pi/mzQuantML/1.0.0-rc2";
    private static final String MZQUANTML_REL_PATH = " ../../schema/mzQuantML_1_0_0-rc2.xsd";
    private static final String MZQUANTML_SCHEMA_LOCATION_RC2 = MZQUANTML_NS + MZQUANTML_REL_PATH;
    
    /**
     * Members.
     */
    private Marshaller marsh = null;
    private Writer fw = null;

    /**
     * Constructor.
     * @param fullFileName
     */
    public MzQuantMLMarshaller(String fullFileName) {
        try {
            this.fw = new FileWriter(fullFileName);
        }
        catch (IOException ioex) {
            ioex.printStackTrace(System.err);            
        }

        try {
            JAXBContext context = JAXBContext.newInstance(MzQuantMLType.class);
            this.marsh = context.createMarshaller();

            this.marsh.setProperty(Marshaller.JAXB_ENCODING, ENCODING);
            this.marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            this.marsh.setProperty(Marshaller.JAXB_FRAGMENT, true);
            this.marsh.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, MZQUANTML_SCHEMA_LOCATION_RC2);
        }
        catch (JAXBException jaxbex) {
            jaxbex.printStackTrace(System.err);
        }
    }

    /**
     * Marshalling of a whole MzQuantML object.
     * @param mzQuantML
     */
    public void marshall(MzQuantMLType mzQuantML) {
        try {
            if (this.fw != null) {
                JAXBElement<MzQuantMLType> jaxbElement = new JAXBElement<MzQuantMLType>(new QName(MZQUANTML_NS, MZQUANTML), MzQuantMLType.class, mzQuantML);
                this.marsh.marshal(jaxbElement, this.fw);
                this.fw.flush();
                this.fw.close();
            }
        }
        catch (JAXBException jaxbex) {
            jaxbex.printStackTrace(System.err);
        }
        catch (IOException ioex) {
            ioex.printStackTrace(System.err);
        }
    }
}
