package PDFFactory;

import java.io.IOException;

public class PDFFactoryTest {

    private static PDFFactory pdfFactory = new PDFFactory();
    protected static final String PATH_TO_PDF_FACTORY_RESOURCES_FOLDER = "../PDF-Differential/resources/PDFFactory/";

    public static void main(String[] args) throws IOException {
        pdfFactory.createEmptyPDF(PATH_TO_PDF_FACTORY_RESOURCES_FOLDER + "empty.pdf");
        pdfFactory.createEmptyPDFWithNumberOfPages(PATH_TO_PDF_FACTORY_RESOURCES_FOLDER + "emptyPDFWith5Pages.pdf", 5);
    }
}
