/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Connectivity {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/HospitalMngt";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "devyask47";

    private static Connection conn = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (conn != null) {
            return conn;
        } else {
            try {
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                //STEP 3: Open a connection
                //System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                return conn;
            } finally {
            }
        }
    }

    public static void closeConnection(Connection conn) throws SQLException {
        try {
            if (conn != null) {
                conn.close();
            }
        } finally {
        }
    }
}
