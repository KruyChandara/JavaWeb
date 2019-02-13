import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.ResultSet;

public class FacadeHelper {

    public static  Connection sql_conn = null;
    public static  Connection pg_conn = null;
    private static MysqlHelper mySqlHelper = new MysqlHelper();
    private static  PostgresHelper pgHelper = new PostgresHelper();
    private static ReportGenerator rg = new ReportGenerator();

    public static void printReport(String dbType, String reportType, HttpServletResponse response){

        switch (dbType){
            case "sql":
                sql_conn = mySqlHelper.getMySqlDBConnection();
                generateReport(reportType, response, mySqlHelper.getDatafromDB(sql_conn));
                break;
            case "postgres":
                pg_conn = pgHelper.getPostgresConnection();
                generateReport(reportType, response, pgHelper.getDatafromDB(pg_conn));
                break;
        }
    }

    private static void generateReport(String reportType, HttpServletResponse response, ResultSet datafromDB) {

        switch(reportType){
            case "pdf":
                rg.generatePDFReport(response, datafromDB);
                break;
            case "doc":
                rg.generateDOCReport(response, datafromDB);
                break;
        }
    }
}

