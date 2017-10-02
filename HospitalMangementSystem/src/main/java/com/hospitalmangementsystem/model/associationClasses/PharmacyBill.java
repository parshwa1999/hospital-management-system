/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.associationClasses;

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
public class PharmacyBill {

    private String date;
    private String billNo;
    private String patientId;
    private String medicineId1, medicineId2, medicineId4, medicineId3, medicineId5;
    private String quantity1, quantity4, quantity2, quantity3, quantity5;

    public PharmacyBill(String date, String billNo, String patientId, String medicineId1, String medicineId2, String medicineId4, String medicineId3, String medicineId5, String quantity1, String quantity4, String quantity2, String quantity3, String quantity5) {
        this.date = date;
        this.billNo = billNo;
        this.patientId = patientId;
        this.medicineId1 = medicineId1;
        this.medicineId2 = medicineId2;
        this.medicineId4 = medicineId4;
        this.medicineId3 = medicineId3;
        this.medicineId5 = medicineId5;
        this.quantity1 = quantity1;
        this.quantity4 = quantity4;
        this.quantity2 = quantity2;
        this.quantity3 = quantity3;
        this.quantity5 = quantity5;
    }

    public String getDate() {
        return date;
    }

    public String getBillNo() {
        return billNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getMedicineId1() {
        return medicineId1;
    }

    public String getMedicineId2() {
        return medicineId2;
    }

    public String getMedicineId4() {
        return medicineId4;
    }

    public String getMedicineId3() {
        return medicineId3;
    }

    public String getMedicineId5() {
        return medicineId5;
    }

    public String getQuantity1() {
        return quantity1;
    }

    public String getQuantity4() {
        return quantity4;
    }

    public String getQuantity2() {
        return quantity2;
    }

    public String getQuantity3() {
        return quantity3;
    }

    public String getQuantity5() {
        return quantity5;
    }

    public void storePrescription() {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;

            sql = "Insert into HospitalMngt.PharmacyBill values ('";
            sql += date;
            sql += " ', '";
            sql += patientId;
            sql += " ', '";
            sql += billNo;
            sql += " ', '";
            sql += medicineId1;
            sql += "', '";
            sql += medicineId2;
            sql += "', '";
            sql += medicineId3;
            sql += "', '";
            sql += medicineId4;
            sql += "', '";
            sql += medicineId5;
            sql += "', '";
            sql += quantity1;
            sql += "', '";
            sql += quantity2;
            sql += "', '";
            sql += quantity3;
            sql += "', '";
            sql += quantity4;
            sql += "', '";
            sql += quantity5;
            sql += "');";

            System.out.println("sql is   " + sql);

            stmt.execute(sql);

            System.out.println("Stored   ------ ====");

            //    Connectivity.closeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
