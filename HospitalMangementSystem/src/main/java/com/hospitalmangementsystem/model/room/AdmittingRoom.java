/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.room;

/**
 *
 * @author user
 */
public class AdmittingRoom {

    private boolean iCUOrOperationTheater;
    private int costPerDay;
    private String dateOfAdmission;

    public AdmittingRoom(boolean iCUOrOperationTheater, int costPerDay, String dateOfAdmission) {
        this.iCUOrOperationTheater = iCUOrOperationTheater;
        this.costPerDay = costPerDay;
        this.dateOfAdmission = dateOfAdmission;
    }

    public boolean isiCUOrOperationTheater() {
        return iCUOrOperationTheater;
    }

    public void setiCUOrOperationTheater(boolean iCUOrOperationTheater) {
        this.iCUOrOperationTheater = iCUOrOperationTheater;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

}
