import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;

public class ReportGenerator {


    public void generateDOCReport(HttpServletResponse response, ResultSet rs){

        try{
            String info = "";
            while (rs.next()){
                info += rs.getString(1)+'\n';
            }
            byte [] infoBytes = info.getBytes();
            String fileName = "data.doc";
            response.addHeader("Content-Disposition", "filename=" + fileName);
            response.setContentLength(infoBytes.length);
            OutputStream responseOutputStream = response.getOutputStream();
            responseOutputStream.write(infoBytes);
            responseOutputStream.close();
        }catch (Exception s){
            System.out.println(s.getMessage());
        }
    }

    public void generatePDFReport(HttpServletResponse response, ResultSet rs){
        String info = "";
        try{
            while (rs.next()){
                info += rs.getString(1) +'\n';
            }
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            document.add(new Paragraph(info));
            document.close();
        }catch (Exception s){
            System.out.println(s.getMessage());
        }
    }
}
