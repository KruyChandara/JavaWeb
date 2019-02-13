import java.sql.*;

public class MysqlHelper {

    public Connection getMySqlDBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
        }catch (Exception s){
            System.out.println("=============="+s.getMessage());
        }
        return null;
    }

    public ResultSet getDatafromDB(Connection con){
        try {
            Statement stt = con.createStatement();
            return stt.executeQuery("SELECT user FROM user;");
        }catch (SQLException s){
            System.out.println(s.getMessage());
        }
        return null;
    }

}
