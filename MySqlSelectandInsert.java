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
  
    public static void selectDemo() throws SQLException{
        DbHelper helper = new DbHelper();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet;
        try {
            connection=helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries=new ArrayList<Country>();

            while(resultSet.next()){
                countries.add(new Country
                        (
                                resultSet.getString("Code"),
                                resultSet.getString("Name"),
                                resultSet.getString("Continent"),
                                resultSet.getString("Region")
                        ));
            }

        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            connection.close();
        }
    }


}
