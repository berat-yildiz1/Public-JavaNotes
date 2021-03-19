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
            String sql ="insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement=connection.prepareStatement(sql);
            statement.setString(1,"Duzce2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,117000);
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
