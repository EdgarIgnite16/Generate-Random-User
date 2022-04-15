package Ultilites;
import java.sql.*;

public class _Connection {
    private String hostname ;
    private String portNumber ;
    private String username ;
    private String password;
    private String dbName;
    private String tbName;

    private Connection conn;
    private Statement stm;
    private PreparedStatement pstm;
    private ResultSet rs;

    public _Connection(String dbName, String tbName) throws Exception {
        checkDriver();
        configDatabase(dbName, tbName);
        setConnection();
    }

    public void checkDriver() {
        // kiểm tra driver có được add vào phần mềm hay chưa
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // tên driver của database sử dụng
            System.out.println("Tim thay driver !");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("khong tim thay driver !");
        }
    }

    public void configDatabase(String dbName, String tbName) {
        this.hostname = "localhost";
        this.portNumber = "1433";
        this.username = "sa";
        this.password = "12345";
        this.dbName = dbName;
        this.tbName = tbName;
    }

    public void setConnection() throws Exception{
        try {
            String connectionURL = String.format(
                    "jdbc:sqlserver://%s:%s;databaseName=%s;encrypt=true;trustServerCertificate=true;",
                    hostname, portNumber, dbName);
            this.conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Ket noi database thanh cong !");
        } catch (Exception ex) {
            System.out.println("Ket noi database that bai !");
            throw new Exception();
        }
    }

    public void closeConnection() {
        try {
            if(conn != null) {
                conn.close();
            }
            if(stm != null) {
                stm.close();
            }
            if(pstm != null) {
                pstm.close();
            }
            System.out.println("Dong connection thanh cong !");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Dong connection that bai !");
        }
    }

    public Connection getConn() {
        return conn;
    }
}
