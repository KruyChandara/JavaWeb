import java.sql.*;

public class PostgresHelper {

    public Connection getPostgresConnection(){
        String url = "jdbc:postgresql://localhost:5432/odoo8A2A?user=darapg&password=root";
        String user = "darapg";
        String password = "root";
        try {
            return DriverManager.getConnection(url, user, password);
        }catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        return null;
    }

    public ResultSet getDatafromDB(Connection con){
        try {
            Statement stt = con.createStatement();
            return stt.executeQuery("SELECT login FROM RES_USERS LIMIT 5;");
        }catch (SQLException s){
            System.out.println(s.getMessage());
        }
        return null;
    }


}

