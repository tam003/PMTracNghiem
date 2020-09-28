


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author apple
 */
public class Connect {

    /**
     *
     */
    public String connectionUrl;
    
    public Connection con = null;

    public Connect() {
        this.connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=PMTracNghiem";
    }
    
    public void initconnect(){
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection(connectionUrl,"sa", "123456");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
