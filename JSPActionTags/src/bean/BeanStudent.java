package bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BeanStudent {
    private final String url = "jdbc:postgresql://localhost:5432/odoo8A2A?user=darapg&password=root";
    private final String user = "darapg";
    private final String password = "root";

    private String id;
    private String name;
    private BeanStudent(){
        super();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Connection connect() {
        Connection conn = null;
        try {
            System.out.println("000");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println("==========");
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        BeanStudent app = new BeanStudent();
        app.connect();
    }

}