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
