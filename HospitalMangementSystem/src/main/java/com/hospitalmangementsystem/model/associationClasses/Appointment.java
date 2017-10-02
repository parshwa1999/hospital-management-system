/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.associationClasses;

/**
 *
 * @author user
 */
public class Appointment {

    private String dateAndTime;
    private String doctorId;
    private String patientId;

    public Appointment(String dateAndTime, String doctorId, String patientId) {
        this.dateAndTime = dateAndTime;
        this.doctorId = doctorId;
        this.patientId = patientId;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

}
