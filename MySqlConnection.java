import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection=null;
        try {

            connection=helper.getConnection();
            System.out.println("bağlantı gerçekleşti");
        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            connection.close();
        }
    }
}
/////////////////////////////////////////
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class DbHelper {
    private String userName="*****";
    private String password="******";
    private String dbUrl="jdbc:mysql://localhost:3306/world";//sql-type,localhost(or ip)/dbname
    //TIME ZONE ISSUE
    //jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    //SSL ISSUE
    //dbName?useSSL=false&

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error :"+exception.getMessage());
        System.out.println("Error code"+exception.getErrorCode());
    }

}
