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
    public static final String PATH_TO_PDF_TO_TEXT_RESOURCES_FOLDER = "../PDF-Differential/resources/PDFToText/";

    static void PDFToText_test() throws IOException {
        pdfManager.setFilePath(PATH_TO_PDF_TO_TEXT_RESOURCES_FOLDER + "test.pdf");
        try {
            writer = new PrintStream(new File(PATH_TO_PDF_TO_TEXT_RESOURCES_FOLDER + "pdfToText.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printToTxt(pdfManager, writer);
    }

    static void PDFGetListOfEmails_test() throws IOException {
        pdfManager.setFilePath(PATH_TO_PDF_TO_TEXT_RESOURCES_FOLDER + "listOfEmails.pdf");
        try {
            writer = new PrintStream(PATH_TO_PDF_TO_TEXT_RESOURCES_FOLDER + "listOfEmailOutput.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printToTxt(pdfManager, writer);
    }

    static void EmptyPDF_text() throws IOException {
        pdfManager.setFilePath(PATH_TO_PDF_TO_TEXT_RESOURCES_FOLDER + "EmptyPDF.pdf");
        try {
            writer = new PrintStream(new File(PATH_TO_PDF_TO_TEXT_RESOURCES_FOLDER + "EmptyPDFOutput.txt"));
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
