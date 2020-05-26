package PDFFactory;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class PDFFactory {

    public PDDocument createEmptyPDF(@NotNull String pdfPath) throws IOException {
        PDDocument newPdf = new PDDocument();
        newPdf.save(pdfPath);
        return newPdf;
    }

    public PDDocument createEmptyPDFWithNumberOfPages(@NotNull String pdfPath, int numberOfPages) throws IOException {
        PDDocument newPdf = new PDDocument();
        for(int i = 0; i < numberOfPages; i++)
            newPdf.addPage(new PDPage());
        newPdf.save(pdfPath);
        return newPdf;
    }

    public PDDocument createPDFWithContent(@NotNull String pdfPath, String pdfContent) throws IOException{
        return new PDDocument();
    }

}
