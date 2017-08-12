package Task_13;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HTMLToPdf {
    public static void main(String[] args) throws IOException, DocumentException {
        Document document = new Document();

        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/java/Task_13/pdf.pdf"));

        document.open();

        XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream("src/main/java/Task_13/index.html"));
        document.close();

        System.out.println("PDF file was created");
    }
}
