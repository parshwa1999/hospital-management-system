/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem;

/**
 *
 * @author user
 */
public class treatsIPD {

    private String doctorId1;
    private String doctorId2;
    private String doctorId3;
    private String doctorId4;
    private String doctorId5;
    private String patientId;

    public treatsIPD(String doctorId1, String patientId) {
        this.doctorId1 = doctorId1;
        this.patientId = patientId;
    }

    public treatsIPD(String doctorId1, String doctorId2, String patientId) {
        this.doctorId1 = doctorId1;
        this.doctorId2 = doctorId2;
        this.patientId = patientId;
    }

    public treatsIPD(String doctorId1, String doctorId2, String doctorId3, String patientId) {
        this.doctorId1 = doctorId1;
        this.doctorId2 = doctorId2;
        this.doctorId3 = doctorId3;
        this.patientId = patientId;
    }

    public treatsIPD(String doctorId1, String doctorId2, String doctorId3, String doctorId4, String patientId) {
        this.doctorId1 = doctorId1;
        this.doctorId2 = doctorId2;
        this.doctorId3 = doctorId3;
        this.doctorId4 = doctorId4;
        this.patientId = patientId;
    }

    public treatsIPD(String doctorId1, String doctorId2, String doctorId3, String doctorId4, String doctorId5, String patientId) {
        this.doctorId1 = doctorId1;
        this.doctorId2 = doctorId2;
        this.doctorId3 = doctorId3;
        this.doctorId4 = doctorId4;
        this.doctorId5 = doctorId5;
        this.patientId = patientId;
    }

    public String getDoctorId1() {
        return doctorId1;
    }

    public void setDoctorId1(String doctorId1) {
        this.doctorId1 = doctorId1;
    }

    public String getDoctorId2() {
        return doctorId2;
    }

    public void setDoctorId2(String doctorId2) {
        this.doctorId2 = doctorId2;
    }

    public String getDoctorId3() {
        return doctorId3;
    }

    public void setDoctorId3(String doctorId3) {
        this.doctorId3 = doctorId3;
    }

    public String getDoctorId4() {
        return doctorId4;
    }

    public void setDoctorId4(String doctorId4) {
        this.doctorId4 = doctorId4;
    }

    public String getDoctorId5() {
        return doctorId5;
    }

    public void setDoctorId5(String doctorId5) {
        this.doctorId5 = doctorId5;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

}
