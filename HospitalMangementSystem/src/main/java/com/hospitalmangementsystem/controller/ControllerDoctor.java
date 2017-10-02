/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import com.hospitalmangementsystem.model.person.patient.OPDPatient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewDoctor;
import main.java.com.hospitalmangementsystem.view.ViewPatientOpdHistory;
import main.java.com.hospitalmangementsystem.view.ViewPrescription;

/**
 *
 * @author user
 */
public class ControllerDoctor {

    private ViewDoctor view;

    public ControllerDoctor(ViewDoctor view) {
        this.view = view;

        view.setButtonBehaviour(new DocBtnListener());
    }

    class DocBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Give Prescription")) {
                ViewPrescription viewPrescription = new ViewPrescription();
            } else if (e.getActionCommand().equals("Patient History")) {

                String patId = view.getTxtPatientId();

                ViewPatientOpdHistory viewPatientOpdHistory = new ViewPatientOpdHistory();
                new OPDPatient().viewPatient(patId, viewPatientOpdHistory);
                viewPatientOpdHistory.setVisiblity(true);
                ControllerPatientHistory controlPatientHistory = new ControllerPatientHistory(viewPatientOpdHistory, patId);

            }
        }
    }

}
