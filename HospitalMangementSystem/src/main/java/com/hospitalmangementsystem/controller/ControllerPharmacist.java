/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewPharmacist;
import main.java.com.hospitalmangementsystem.view.ViewPharmacistGiveMedicine;

/**
 *
 * @author user
 */
public class ControllerPharmacist {

    ViewPharmacist view;

    public ControllerPharmacist(ViewPharmacist view) {
        this.view = view;

        view.setButtonBehaviour(new btnPharmacistListner());
    }

    class btnPharmacistListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Give Medicines")) {
                System.out.println("12345");
                ViewPharmacistGiveMedicine viewPharmacistGiveMedicine = new ViewPharmacistGiveMedicine();

            } else if (e.getActionCommand().equals("View Medicine Data")) {
                System.out.println("12345688");

            } else if (e.getActionCommand().equals("Insert New Medicine")) {
                System.out.println("1234599999");

            }
        }

    }
}
