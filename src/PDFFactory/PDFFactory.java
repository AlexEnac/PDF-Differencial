package PDFFactory;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.jetbrains.annotations.NotNull;

import java.io.File;
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
        PDDocument newPdf = createEmptyPDFWithNumberOfPages(pdfPath,1);
        PDPage firstPage = newPdf.getPage(0);
        PDPageContentStream contentStream = new PDPageContentStream(newPdf, firstPage);
        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 16 );
        contentStream.newLineAtOffset(25, 500);
        contentStream.showText(pdfContent);
        contentStream.endText();
        System.out.println("Content added");
        contentStream.close();
        newPdf.save(new File(pdfPath));
        return newPdf;
    }

}
