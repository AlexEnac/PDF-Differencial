package PDFToText;

import java.io.*;
import java.util.Optional;

import PDFManager.PDFManager;
import org.jetbrains.annotations.NotNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PDFToText {

    protected static String listOfSeparators = " ,\n";
    /*https://stackoverflow.com/questions/15703704/find-emails-in-a-string*/
    protected static String emailRegex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+";
    protected static Pattern emailPatternRegex = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
    static void printToTxt(@NotNull PDFManager pdfManager, @NotNull PrintStream printStream) throws IOException {
        String text = pdfManager.toText();
        printStream.append(text);
    }
    //not using regex
    static Optional<String> getFirstEmailFromPDFIfAny(@NotNull PDFManager pdfManager) throws IOException {
        String content = pdfManager.toText();
        StringBuilder email = new StringBuilder();
        int indexOfEmailAt = content.indexOf('@');
        if(indexOfEmailAt == -1) return Optional.empty();
        for(int j = indexOfEmailAt - 1; j >= 0 && listOfSeparators.indexOf(content.charAt(j)) == -1; j--){
            email.append(content.charAt(j));
        }
        email = email.reverse();
        email.append('@');
        for(int j = indexOfEmailAt + 1; j < content.length() && listOfSeparators.indexOf(content.charAt(j)) == -1; j++){
            email.append(content.charAt(j));
        }
        return Optional.of(email.toString());
    }

    static Optional<String> getEmailFromPDFIfAny(PDFManager pdfManager) throws IOException{
        String content = pdfManager.toText();
        StringBuilder email = new StringBuilder();
        int indexOfEmailAt = content.indexOf('@');
        if(indexOfEmailAt == -1) return Optional.empty();
        Matcher matcher = emailPatternRegex.matcher(content);
        while (matcher.find()) {
            email.append(matcher.group());
        }
        return Optional.of(email.toString());
    }
}
