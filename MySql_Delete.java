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
