import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet;
        try {
            connection=helper.getConnection();
            statement=connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values('Duzce','TUR','Duzce','50000')");
            statement.executeUpdate();

            System.out.println("Kayıt Eklendi");



        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
}
