/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.model.associationClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.com.hospitalmangementsystem.connectivity.Connectivity;
import main.java.com.hospitalmangementsystem.controller.MainController;
import main.java.com.hospitalmangementsystem.model.login.Login;
import main.java.com.hospitalmangementsystem.view.ViewPrescriptionData;

/**
 *
 * @author user
 */
public class Prescitption {

    private String id;
    private String patientId;
    private String doctorId;
    private String medicineId1;
    private String medicineId2;
    private String medicineId3;
    private String medicineId4;
    private String medicineId5;
    private String dosage1;
    private String dosage2;
    private String dosage3;
    private String dosage4;
    private String dosage5;
    private String remarks;
    private String date;

    public Prescitption() {
    }

    public Prescitption(String id, String patientId, String medicineId1, String medicineId2, String medicineId3, String medicineId4, String medicineId5, String dosage1, String dosage2, String dosage3, String dosage4, String dosage5, String remarks, String date) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = MainController.getId();
        this.medicineId1 = medicineId1;
        this.medicineId2 = medicineId2;
        this.medicineId3 = medicineId3;
        this.medicineId4 = medicineId4;
        this.medicineId5 = medicineId5;
        this.dosage1 = dosage1;
        this.dosage2 = dosage2;
        this.dosage3 = dosage3;
        this.dosage4 = dosage4;
        this.dosage5 = dosage5;
        this.remarks = remarks;
        this.date = date;
    }

    public void storePrescription() {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;

            stmt = conn.createStatement();

            String sql;

            sql = "Insert into HospitalMngt.tblPrescription values ('";
            sql += patientId;
            sql += " ', '";
            sql += doctorId;
            sql += "', '";
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
            sql += dosage1;
            sql += "', '";
            sql += dosage2;
            sql += "', '";
            sql += dosage3;
            sql += "', '";
            sql += dosage4;
            sql += "', '";
            sql += dosage5;
            sql += "', '";
            sql += remarks;
            sql += "', '";
            sql += id;
            sql += "', '";
            sql += date;
            sql += "');";

            stmt.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void viewPrescription(String patId, String date, ViewPrescriptionData view) {
        Connectivity connnect = new Connectivity();

        try {
            Connection conn = connnect.getConnection();

            Statement stmt = null;
            System.out.println("ytytytyt");
            stmt = conn.createStatement();

            String sql;

            sql = "Select * from HospitalMngt.tblPrescription where date ='" + date + "';";

            stmt.execute(sql);

            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("asasasa");

            while (rs.next()) {
                System.out.println("qqqwww   " + rs.getString("PatientId"));
                System.out.println("ppppp   " + rs.getString("Date"));

                System.out.println("patId  " + patId);
                System.out.println("date  " + date);

                if (patId.equals(rs.getString("PatientId"))) {
                    System.out.println("qqqwww33434343");
                    System.out.println("dos  " + rs.getString("Dosage1"));
                    view.setLblDate(rs.getString("Date"));
                    view.setLblDosage1(rs.getString("Dosage1"));
                    view.setLblDosage2(rs.getString("Dosage2"));
                    view.setLblDosage3(rs.getString("Dosage3"));
                    view.setLblDosage4(rs.getString("Dosage4"));
                    view.setLblDosage5(rs.getString("Dosage5"));
                    view.setLblPatientID(patId);
                    view.setLblPrescriptionNo(rs.getString("PrescriptionId"));
                    view.setLblRemarks(rs.getString("Remarks"));
                    view.setLblmed1(rs.getString("Medicine1Id"));
                    view.setLblmed2(rs.getString("Medicine2Id"));
                    view.setLblmed3(rs.getString("Medicine3Id"));
                    view.setLblmed4(rs.getString("Medicine4Id"));
                    view.setLblmed5(rs.getString("Medicine5Id"));
                }

            }

            //    Connectivity.closeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
