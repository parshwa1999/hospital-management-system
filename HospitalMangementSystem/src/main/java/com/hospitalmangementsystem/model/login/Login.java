/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.model.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.com.hospitalmangementsystem.connectivity.Connectivity;

/**
 *
 * @author user
 */
public class Login {

    private String loginId;
    private String password;

    public Login(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public int checkLogin() {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;
            sql = "SELECT * FROM login;";
            stmt.execute(sql);

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("loginId");
                String pwd = rs.getString("password");

                if (id.equals(loginId) && pwd.equals(password)) {
                    if (loginId.contains("Doc")) {
                        //connnect.closeConnection(conn) ;
                        return 1;
                    } else if (loginId.contains("Acc")) {
                        return 2;
                    } else if (loginId.contains("Phar")) {
                        return 3;
                    } else if (loginId.contains("Rec")) {
                        return 4;
                    } else if (loginId.contains("Man")) {
                        return 5;
                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;

    }

    public void storeNewLogin() {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;
            sql = "Insert into HospitalMngt.login values('" + this.loginId + "','" + this.password + "');";

            stmt.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
