package PDFComparator;

import PDFFactory.PDFFactory;

import java.io.IOException;

public class PDFComparatorTest {

    public static final String PATH_TO_FIRST_PDF = "resources/PDFComparator/firstPDF.pdf";
    public static final String PATH_TO_SECOND_PDF = "resources/PDFComparator/secondPDF.pdf";

    private static PDFComparator pdfComparator;

    public static void main(String[] args) throws IOException {
        String firstPDFContent = "This is the first PDF";
        String secondPDFContent = "This is the second PDF";
        PDFFactory pdfFactory = new PDFFactory();
        pdfFactory.createPDFWithContent(PATH_TO_FIRST_PDF, firstPDFContent);
        pdfFactory.createPDFWithContent(PATH_TO_SECOND_PDF, secondPDFContent);
        pdfComparator = new PDFComparator(PATH_TO_FIRST_PDF, PATH_TO_SECOND_PDF);
        System.out.println(pdfComparator.getFirstPDFManager().toText());
        System.out.println(pdfComparator.getSecondPDFManager().toText());
    }
}
