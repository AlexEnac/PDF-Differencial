import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PDFReader {
    static File outputFile = new File("C:\\Users\\Enche\\IdeaProjects\\PDF-Differential\\resources\\PDFToText\\pdfToText.txt");
    public static void main(String[] args) {
        PDFManager pdfManager = new PDFManager();
        pdfManager.setFilePath("C:\\Users\\Enche\\IdeaProjects\\PDF-Differential\\resources\\PDFToText\\test.pdf");
        try {
            String text = pdfManager.toText();
            outputFile.
        } catch (IOException ex) {
            Logger.getLogger(PDFReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
