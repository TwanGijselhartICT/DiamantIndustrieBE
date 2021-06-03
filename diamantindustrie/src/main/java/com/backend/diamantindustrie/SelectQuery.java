package com.backend.diamantindustrie;

import java.sql.*;

public class SelectQuery {

    public String GetResultSet(String query) {
        ResultSet rs = null;
        String url = "jdbc:mysql://37.59.55.185:3306/YXSEnyGGAQ";

        String user = "YXSEnyGGAQ";
        String password = "39m6L8WXdh";
        String JsonObject = "{\t\t\n\"fields\": [\n";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is successful to the database " + url);
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(query);
            int ColumnCount = rs.getMetaData().getColumnCount();

            while (rs.next()){
                JsonObject += "{\n";
                for (int i= 1; i<= ColumnCount; i++){
                    JsonObject += "\"" + rs.getMetaData().getColumnName(i) + "\": \""  + rs.getString(rs.getMetaData().getColumnName(i)) + "\",";
                }
                JsonObject = JsonObject.substring(0, JsonObject.length() - 1);
                JsonObject += "\n},\n";
            }
            JsonObject = JsonObject.substring(0, JsonObject.length() - 2);
            JsonObject += "\n]\n}";


            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return JsonObject;
    }
}
