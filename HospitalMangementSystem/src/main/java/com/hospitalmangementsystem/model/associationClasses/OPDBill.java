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
public class OPDBill {

    private int consultationCharge;

    public OPDBill(int consultationCharge) {
        this.consultationCharge = consultationCharge;
    }

    public int getCost() {
        return consultationCharge;
    }

    public void setCost(int consultationCharge) {
        this.consultationCharge = consultationCharge;
    }

}
