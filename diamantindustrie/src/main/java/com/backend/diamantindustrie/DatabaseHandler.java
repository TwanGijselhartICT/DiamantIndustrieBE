package com.backend.diamantindustrie;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseHandler implements CommandLineRunner {
    Connection connection = null;

    // String dbUrl = "jbdc:mysql://remotemysql.com:3306/YXSEnyGGAQ";
    // String dbUserName = "YXSEnyGGAQ";
    // String dbPassword = "39m6L8WXdh";

    ArrayList<PointOfInterest> pointOfInterests = null;
    PointOfInterest pointOfInterest = null;

    // public DatabaseHandler() {
    //     try {
    //         connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

    //     } catch (SQLException ex) {
    //         // handle any errors
    //         System.out.println("SQLException: " + ex.getMessage());
    //         System.out.println("SQLState: " + ex.getSQLState());
    //         System.out.println("VendorError: " + ex.getErrorCode());
    //     }
    // }

    @Override
    public void run(String... args) throws Exception {
        ResultSet resultSet = null;

        String query = "SELECT * From pointofinterest";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("Name");
                String text = resultSet.getString("Text");
                String address = resultSet.getString("Address");
                String longitude = resultSet.getString("Long");
                String latitude = resultSet.getString("Lat");
                String audioText = resultSet.getString("AudioText");

                pointOfInterest = new PointOfInterest(id, name, text, address, longitude, latitude, audioText);
                pointOfInterests.add(pointOfInterest);

                System.out.println(pointOfInterest);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
