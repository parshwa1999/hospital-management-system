/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import main.java.com.hospitalmangementsystem.model.associationClasses.Prescitption;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewPrescription;

/**
 *
 * @author user
 */
public class ControllerPrescription {

    private ViewPrescription view;

    public ControllerPrescription(ViewPrescription view) {
        this.view = view;
        view.setBtnPrescription(new PrescriptionBtnListener());
    }

    class PrescriptionBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hi presc");

            Prescitption prescription = new Prescitption(view.getTxtPrescriptionNo(), view.getTxtPatientId(), view.getTxtMed1Id(), view.getTxtMed2Id(), view.getTxtMed3Id(), view.getTxtMed4Id(), view.getTxtMed5Id(), view.getTxtDosage1(), view.getTxtDosage2(), view.getTxtDosage3(), view.getTxtDosage4(), view.getTxtDosage5(), view.getTxtRemarks(), view.getTxtDate());

            prescription.storePrescription();
        }

    }

}
