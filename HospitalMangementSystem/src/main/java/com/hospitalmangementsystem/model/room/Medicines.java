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
public class Medicines {

    private String id;
    private String name;
    private String companyName;
    private int cost;
    private int quantity;
    private String drugDescription;

    public Medicines(String id, String name, String companyName, int cost, int quantity, String drugDescription) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.cost = cost;
        this.quantity = quantity;
        this.drugDescription = drugDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDrugDescription() {
        return drugDescription;
    }

    public void setDrugDescription(String drugDescription) {
        this.drugDescription = drugDescription;
    }

}
