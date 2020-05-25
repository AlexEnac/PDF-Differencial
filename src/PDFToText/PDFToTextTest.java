package PDFToText;

import PDFManager.PDFManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import static PDFToText.PDFToText.*;

public class PDFToTextTest {

    protected static PrintStream writer;

    public static void main(String[] args) throws IOException {
        PDFManager pdfManager = new PDFManager();
        pdfManager.setFilePath("..\\PDF-Differential\\resources\\PDFToText\\test.pdf");
        try {
            writer = new PrintStream(new File("..\\PDF-Differential\\resources\\PDFToText\\pdfToText.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printToTxt(pdfManager, writer);
        printToTxt(pdfManager, System.out);
        System.out.println(getFirstEmailFromPDFIfAny(pdfManager).toString());
        System.out.println(PDFToText.getEmailFromPDFIfAny(pdfManager).toString());

        try {
            writer = new PrintStream(new File("..\\PDF-Differential\\resources\\PDFToText\\listOfEmailOutput.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pdfManager.setFilePath("..\\PDF-Differential\\resources\\PDFToText\\listOfEmails.pdf");
        printToTxt(pdfManager, writer);

    }
}
