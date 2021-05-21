package com.backend.diamantindustrie;

import java.sql.*;

public class SelectQuery {

    public ResultSet GetResultSet(String query) {
        ResultSet rs = null;
        String url = "jdbc:mysql://37.59.55.185:3306/YXSEnyGGAQ";

        String user = "YXSEnyGGAQ";
        String password = "39m6L8WXdh";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is successful to the database " + url);
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(query);
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }
}
