/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.person.patient;

import com.hospitalmangementsystem.model.person.Person;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.com.hospitalmangementsystem.connectivity.Connectivity;
import main.java.com.hospitalmangementsystem.model.login.Login;
import main.java.com.hospitalmangementsystem.view.ViewPatientOpdHistory;

/**
 *
 * @author user
 */
public class OPDPatient extends Person {

    private String height;
    private String weight;

    public OPDPatient() {
    }

    public OPDPatient(String height, String weight, String id, String firstName, String lastName, String phoneNo, String address, String description, String dateOfBirth) {
        super(id, firstName, lastName, phoneNo, address, description, dateOfBirth);
        this.height = height;
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void viewPatient(String patId, ViewPatientOpdHistory view) {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;

            sql = "Select * from HospitalMngt.tblOPDPatient ";

            stmt.execute(sql);

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("patId" + patId);

            while (rs.next()) {

                if (patId.equals(rs.getString("Id"))) {
                    view.setLblAddress(rs.getString("Address"));
                    view.setLblDateOfBirth(rs.getString("dateOfBirth"));
                    view.setLblDescription(rs.getString("Description"));
                    view.setLblFirstName(rs.getString("FirstName"));
                    view.setLblLastName(rs.getString("Surname"));
                    view.setLblPhoneNo(rs.getString("PhoneNo"));
                    view.setLblHeight(rs.getString("Height"));
                    view.setLblWeight(rs.getString("Weight"));

                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void storeOPDPatient() {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;

            sql = "Insert into HospitalMngt.tblOPDPatient values ('" + this.getFirstName() + "', '" + this.getLastName() + "', '" + this.getId();
            sql += "', '" + this.getPhoneNo() + "', '" + this.getAddress() + "', '" + getDateOfBirth() + "', '" + getHeight() + "', '" + getWeight() + "', '" + getDescription() + "');";
            stmt.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
