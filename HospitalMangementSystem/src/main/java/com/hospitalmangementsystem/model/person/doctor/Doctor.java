/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.person.doctor;

import com.hospitalmangementsystem.model.person.Person;
import java.sql.Connection;
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
public class Doctor extends Person {

    private String type;
    private String specialization;
    boolean surgeon;
    boolean assistant;

    public Doctor(String type, String specialization, boolean surgeon, boolean assistant, String id, String firstName, String lastName, String phoneNo, String address, String description, String dateOfBirth) {
        super(id, firstName, lastName, phoneNo, address, description, dateOfBirth);
        this.type = type;
        this.specialization = specialization;
        this.surgeon = surgeon;
        this.assistant = assistant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String isSurgeon() {
        if (surgeon) {
            return "Yes";
        }

        return "NO";
    }

    public void setSurgeon(boolean surgeon) {
        this.surgeon = surgeon;
    }

    public String isAssistant() {
        if (assistant) {
            return "Yes";
        }

        return "NO";
    }

    public void setAssistant(boolean assistant) {
        this.assistant = assistant;
    }

    public void storeDoctor() {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;

            sql = "Insert into HospitalMngt.tblDoctor values ('" + this.getId() + "','";
            sql += this.getFirstName() + "','";
            sql += this.getLastName() + "','";
            sql += this.getPhoneNo() + "','";
            sql += this.getAddress() + "','";
            sql += this.getDateOfBirth() + "','";
            sql += this.getDescription() + "','";
            sql += this.getSpecialization() + "','";
            sql += this.type + "','";
            sql += this.isSurgeon() + "','";
            sql += this.isAssistant() + "');";

            stmt.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
