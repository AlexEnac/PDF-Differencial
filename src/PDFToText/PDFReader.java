package PDFToText;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import PDFManager.PDFManager;

public class PDFReader {
    static BufferedWriter writer;

    static {
        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\Enche\\IdeaProjects\\PDF-Differential\\resources\\PDFToText\\pdfToText.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        PDFManager pdfManager = new PDFManager();
        pdfManager.setFilePath("C:\\Users\\Enche\\IdeaProjects\\PDF-Differential\\resources\\PDFToText\\test.pdf");
        try {
            String text = pdfManager.toText();
            writer.write(text);

        } catch (IOException ex) {
            Logger.getLogger(PDFReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer.close();
    }
}
