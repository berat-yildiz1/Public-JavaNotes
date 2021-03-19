
import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
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

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void insert() throws SQLException {
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
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void update() throws SQLException {

        DbHelper helper = new DbHelper();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet;
        try {
            connection=helper.getConnection();
            String sql ="update city set Population=990000 where city.ID=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4081);
            statement.executeUpdate();
            System.out.println("Kayıt Guncellendi");
        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void delete() throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet;
        try {
            connection=helper.getConnection();
            String sql ="delete from city where city.ID=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4081);
            statement.executeUpdate();
            System.out.println("Kayıt silindi");
        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

}
