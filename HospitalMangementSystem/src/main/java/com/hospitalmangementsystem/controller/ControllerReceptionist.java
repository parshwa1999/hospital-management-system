/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import com.hospitalmangementsystem.model.person.patient.OPDPatient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewCreateOpdPatient;
import main.java.com.hospitalmangementsystem.view.ViewPatientOpdHistory;
import main.java.com.hospitalmangementsystem.view.ViewReceptionist;

/**
 *
 * @author user
 */
public class ControllerReceptionist {

    private ViewReceptionist view;

    public ControllerReceptionist(ViewReceptionist view) {
        this.view = view;
        view.setButtonBehaviour(new BtnPatientListener());
    }

    class BtnPatientListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Create OPD Patient")) {
                ViewCreateOpdPatient viewCreateOPDPatient = new ViewCreateOpdPatient();
            } else if (e.getActionCommand().equals("Create IPD Patient")) {

            } else if (e.getActionCommand().equals("View Patient Information")) {

                String patId = view.getTxtPatientId();

                ViewPatientOpdHistory viewPatientOpdHistory = new ViewPatientOpdHistory();
                new OPDPatient().viewPatient(patId, viewPatientOpdHistory);
                viewPatientOpdHistory.setVisiblity(true);
                ControllerPatientHistory controlPatientHistory = new ControllerPatientHistory(viewPatientOpdHistory, patId);

            }
        }

    }

}
