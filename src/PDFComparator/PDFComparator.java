package PDFComparator;

import PDFManager.PDFManager;

public class PDFComparator {
    private PDFManager firstPDFManager;
    private PDFManager secondPDFManager;

    public PDFComparator(PDFManager firstPDFManager, PDFManager secondPDFManager) {
        this.firstPDFManager = firstPDFManager;
        this.secondPDFManager = secondPDFManager;
    }

    public PDFManager getFirstPDFManager() {
        return firstPDFManager;
    }

    public PDFManager getSecondPDFManager() {
        return secondPDFManager;
    }

    //TODO: Multithreading open the pdf and write them to txt
    public void compareTwoPDFs(String pathToFirstPDF, String PathToSecondPDF) {

    }
}
