/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.model.associationClasses.Prescitption;
import main.java.com.hospitalmangementsystem.view.ViewPatientOpdHistory;
import main.java.com.hospitalmangementsystem.view.ViewPrescriptionData;

/**
 *
 * @author user
 */
public class ControllerPatientHistory {

    private ViewPatientOpdHistory view;
    private String patId;

    public ControllerPatientHistory(ViewPatientOpdHistory view, String patId) {
        this.view = view;
        this.patId = patId;

        this.view.setButtonBehaviour(new PatientHistoryListner());

    }

    class PatientHistoryListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("hi");
            ViewPrescriptionData viewPrescriptionData = new ViewPrescriptionData();
            new Prescitption().viewPrescription(patId, view.getTxtDate(), viewPrescriptionData);
            viewPrescriptionData.setVisible(true);
        }

    }

}
