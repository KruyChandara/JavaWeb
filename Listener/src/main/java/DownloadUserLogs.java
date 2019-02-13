import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "DownloadUserLogs")
public class DownloadUserLogs extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileType = request.getParameter("fileType");
        performTask(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        String remoteAdd = request.getRemoteAddr();
        String reqURI =  request.getRequestURI();
        byte [] remoteAddByte = remoteAdd.getBytes();
        byte [] reqURIByte = reqURI.getBytes();

        String pdfFileName = "user_logs.pdf";
        response.setContentType("application/pdf");
        response.addHeader("Content-Disposition", "inline; filename=" + pdfFileName);
        response.setContentLength(remoteAddByte.length+reqURIByte.length);
        try {
            // step 1
            Document document = new Document();
            // step 2
            PdfWriter.getInstance(document, response.getOutputStream());
            // step 3
            document.open();
            // step 4
            document.add(new Paragraph("Hello World"));
            document.add(new Paragraph(new Date().toString()));
            // step 5
            document.close();
        } catch (Exception de) {
            System.out.println("error");
        }


//        OutputStream responseOutputStream = response.getOutputStream();
//        responseOutputStream.write(remoteAddByte);
//        responseOutputStream.write(reqURIByte);
//        responseOutputStream.close();

    }

}
