/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.person.accountant;

import com.hospitalmangementsystem.model.person.Person;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.com.hospitalmangementsystem.connectivity.Connectivity;
import main.java.com.hospitalmangementsystem.model.login.Login;

/**
 *
 * @author user
 */
public class Accountant extends Person {

    private String moneyGivenBy;
    private int accountGiven;
    private String date;

    public Accountant() {
    }

    public Accountant(String id, String firstName, String lastName, String phoneNo, String address, String description, String dateOfBirth) {
        super(id, firstName, lastName, phoneNo, address, description, dateOfBirth);

    }

    public Accountant(String moneyGivenBy, int accountGiven, String date) {
        this.moneyGivenBy = moneyGivenBy;
        this.accountGiven = accountGiven;
        this.date = date;
    }

    public String getMoneyGivenBy() {
        return moneyGivenBy;
    }

    public int getAccountGiven() {
        return accountGiven;
    }

    public String getDate() {
        return date;
    }

    public void viewMoneyRecived(String date) {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;
            sql = "select * from HospitalMngt.tblAccountsData where date = '";
            sql += date;
            sql += "' ;";

            stmt.execute(sql);

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                this.date = date;
                this.accountGiven = rs.getInt("AmountGiven");
                this.moneyGivenBy = rs.getString("MoneyGivenBy");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void storeMoneyRecived() {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;
            sql = "insert into HospitalMngt.tblAccountsData values ('";
            sql += date;
            sql += "', '";
            sql += moneyGivenBy;
            sql += "', '";
            sql += accountGiven;
            sql += "' );";

            stmt.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
