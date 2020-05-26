package PDFToText;

import PDFManager.PDFManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import static PDFToText.PDFToText.*;

public class PDFToTextTest {

    private static PrintStream writer;
    private static PDFManager pdfManager = new PDFManager();

    static void PDFToText_test() throws IOException {
        pdfManager.setFilePath("..\\PDF-Differential\\resources\\PDFToText\\test.pdf");
        try {
            writer = new PrintStream(new File("..\\PDF-Differential\\resources\\PDFToText\\pdfToText.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printToTxt(pdfManager, writer);
    }

    static void PDFGetListOfEmails_test() throws IOException {
        pdfManager.setFilePath("..\\PDF-Differential\\resources\\PDFToText\\listOfEmails.pdf");
        try {
            writer = new PrintStream(new File("..\\PDF-Differential\\resources\\PDFToText\\listOfEmailOutput.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printToTxt(pdfManager, writer);
    }

    static void EmptyPDF_text() throws IOException {
        pdfManager.setFilePath("..\\PDF-Differential\\resources\\PDFToText\\EmptyPDF.pdf");
        try {
            writer = new PrintStream(new File("..\\PDF-Differential\\resources\\PDFToText\\EmptyPDFOutput.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printToTxt(pdfManager, writer);
        writer.append("Nothing to print");
    }

    public static void main(String[] args) throws IOException {

        PDFToText_test();
        printToTxt(pdfManager, System.out);
        System.out.println(getFirstEmailFromPDFIfAny(pdfManager).toString());
        System.out.println(PDFToText.getEmailFromPDFIfAny(pdfManager).toString());
        PDFGetListOfEmails_test();
        EmptyPDF_text();
    }
}
