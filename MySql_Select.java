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
