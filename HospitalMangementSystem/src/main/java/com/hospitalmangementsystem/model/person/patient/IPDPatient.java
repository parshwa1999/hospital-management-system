/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.person.patient;

import com.hospitalmangementsystem.model.person.Person;

/**
 *
 * @author user
 */
public class IPDPatient extends Person {

    private String height;
    private String weight;
    private String date;
    private String bedNo;
    private String dischargeDate;

    public IPDPatient(String height, String weight, String date, String bedNo, String id, String firstName, String lastName, String phoneNo, String address, String description, String dateOfBirth) {
        super(id, firstName, lastName, phoneNo, address, description, dateOfBirth);
        this.height = height;
        this.weight = weight;
        this.date = date;
        this.bedNo = bedNo;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

}
