import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;


@WebServlet(name = "DownloadUserLogs")
public class DownloadUserLogs extends HttpServlet {

    private static String info= "";
    private static short hostNumber=0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileType = request.getParameter("fileType");
        HttpSession hs = request.getSession();
        InetAddress inetAddress = InetAddress.getByName(request.getRemoteAddr());
        String computerName = java.net.InetAddress.getLocalHost().getCanonicalHostName();
        if (hs.getAttribute("old") == null){
            hs.setAttribute("old",true);
            hostNumber+=1;
            info+="Host->"+hostNumber+"\nRequest URI: " + request.getRequestURI()  + "\nIP Address: " + request.getRemoteAddr()+'\n'+"Computer Name: "+java.net.InetAddress.getLocalHost().getCanonicalHostName()+'\n';
        }
        if (info!=null){
            printReport(request,response,fileType);
        }
    }

    private void printReport(HttpServletRequest request, HttpServletResponse response, String fileType) throws ServletException,
            IOException {

        byte [] infoBytes = info.getBytes();
        response.setContentType("application/"+fileType);
        if (!(fileType.equals("pdf"))){
            String pdfFileName = "user_logs."+fileType;
            response.addHeader("Content-Disposition", "inline; filename=" + pdfFileName);
            response.setContentLength(infoBytes.length);
            OutputStream responseOutputStream = response.getOutputStream();
            responseOutputStream.write(infoBytes);
            responseOutputStream.close();
        }
        else {
            try {
                Document document = new Document();
                PdfWriter.getInstance(document, response.getOutputStream());
                document.open();
                document.add(new Paragraph(info));
                document.close();
            } catch (Exception de) {
                System.out.println("error");
            }
        }
    }

}
