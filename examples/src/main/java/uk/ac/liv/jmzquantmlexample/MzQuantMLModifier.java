
package uk.ac.liv.jmzquantmlexample;

/**
 *
 * @author Da Qi
 * @institute University of Liverpool
 * @time 19-Jun-2013 12:32:41
 */
import java.io.File;
import java.util.Arrays;
import java.util.List;
import uk.ac.liv.jmzqml.MzQuantMLElement;
import uk.ac.liv.jmzqml.model.mzqml.*;
import uk.ac.liv.jmzqml.xml.io.MzQuantMLMarshaller;
import uk.ac.liv.jmzqml.xml.io.MzQuantMLUnmarshaller;

public class MzQuantMLModifier {

    public static void main(String[] args) {

        File mzqFile = new File("CPTAC-Progenesis-small-example.mzq");

        // create an MzQuantMLUnmarsahller object
        MzQuantMLUnmarshaller um = new MzQuantMLUnmarshaller(mzqFile);

        // unmarshal the original MzQuantML object
        MzQuantML mzq = um.unmarshal(MzQuantMLElement.MzQuantML);

        // accession of the protein whose normalised abundance will be modified
        String protAcc = "YPR148C";
        String protId = "";

        // populate these new abundance value to the specified protein in AssayQuantLayer
        String[] newValueArray = {"14361.336", "5463.827", "9691.717", "15983.442", "6562.106", "6711.486", "11038.94", "10559.844",
            "4985.336", "11644.993", "10002.761", "8683.371"};
        List<String> newValueList = Arrays.asList(newValueArray);

        // unmarshal the <ProteinList>
        ProteinList proteinList = um.unmarshal(MzQuantMLElement.ProteinList);

        // find the protein ID based on accession
        List<Protein> proteins = proteinList.getProtein();
        for (Protein protein : proteins) {
            if (protein.getAccession().equals(protAcc)) {
                protId = protein.getId();
                break;
            }
        }

        // get the correct <AssayQuantLayer>
        List<QuantLayer> assayQuantLayers = proteinList.getAssayQuantLayer();
        QuantLayer assayQuantLayer = assayQuantLayers.get(0);

        // get the <DataMatrix> from <AssayQuantLayer>
        DataMatrix dm = assayQuantLayer.getDataMatrix();
        List<Row> rows = dm.getRow();
        for (Row row : rows) {
            if (row.getObjectRef().equals(protId)) {
                // replace the old data with new data
                row.getValue().clear();
                row.getValue().addAll(newValueList);
            }
        }

        // set the ProteinList to MzQuantML
        mzq.setProteinList(proteinList);

        // output the modified mzQuantML file
        MzQuantMLMarshaller marshaller = new MzQuantMLMarshaller("modifiedMzQuantML.mzq");
        marshaller.marshall(mzq);
    }

}