/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.utilidades;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Tony C
 */
public class Logica {

    public void generarPDF(String html) {
        try {
            String k = "<html><body> Hola mundo! </body></html>";
            if (html != null && !html.equalsIgnoreCase("")) {
                k = html;
            }
            try (OutputStream file = new FileOutputStream(new File("C:\\Reporte.pdf"))) {
                Document document = new Document();
                PdfWriter writer = PdfWriter.getInstance(document, file);
                document.open();
                InputStream is = new ByteArrayInputStream(k.getBytes());
                XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
                document.close();
            }
            
        } catch (DocumentException | IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
