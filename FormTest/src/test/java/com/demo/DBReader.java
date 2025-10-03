package com.demo;

import java.sql.*;

public class DBReader {
    public static String[] getUserDataFromDB() {
        String[] data = new String[5];
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formtest", "root", "your_password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users LIMIT 1");
            if (rs.next()) {
                data[0] = rs.getString("first_name");
                data[1] = rs.getString("last_name");
                data[2] = rs.getString("email");
                data[3] = rs.getString("phone");
                data[4] = rs.getString("password");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}