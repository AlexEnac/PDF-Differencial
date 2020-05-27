package PDFComparator;

import PDFManager.PDFManager;

public class PDFComparator {

    private PDFManager firstPDFManager;
    private PDFManager secondPDFManager;

    public PDFComparator(String firstPDFPath, String secondPDFPath){
        this.firstPDFManager = new PDFManager();
        firstPDFManager.setFilePath(firstPDFPath);
        this.secondPDFManager = new PDFManager();
        secondPDFManager.setFilePath(secondPDFPath);
    }

    public void setFirstPDFManager(String firstPDFPath) {
        this.firstPDFManager = new PDFManager();
        firstPDFManager.setFilePath(firstPDFPath);
    }

    public void setSecondPDFManager(String secondPDFPath) {
        this.secondPDFManager = new PDFManager();
        secondPDFManager.setFilePath(secondPDFPath);
    }

    public PDFManager getFirstPDFManager() {
        return firstPDFManager;
    }

    public PDFManager getSecondPDFManager() {
        return secondPDFManager;
    }

    //TODO: Multithreading open the pdf and write them to txt
    public void compareTwoPDFs() {

    }
}
