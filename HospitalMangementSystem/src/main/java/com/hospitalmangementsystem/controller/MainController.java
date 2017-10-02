/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import main.java.com.hospitalmangementsystem.view.ViewAccountant;
import main.java.com.hospitalmangementsystem.view.ViewDoctor;
import main.java.com.hospitalmangementsystem.view.ViewLogin;
import main.java.com.hospitalmangementsystem.view.ViewManager;
import main.java.com.hospitalmangementsystem.view.ViewPharmacist;
import main.java.com.hospitalmangementsystem.view.ViewReceptionist;

/**
 *
 * @author user
 */
public class MainController {

    private static String Id;

    public static void main(String[] args) {

        ViewLogin viewLogin = new ViewLogin();

        while (ControllerLogin.getLoginStatus() == -1) {
            System.out.println("                                                            ");
        }

        Id = viewLogin.getTxtLoginId();

        switch (ControllerLogin.getLoginStatus()) {
            case 1:
                ViewDoctor viewDoctor = new ViewDoctor();
                new ControllerDoctor(viewDoctor);

                break;

            case 2:
                ViewAccountant viewAccountant = new ViewAccountant();
                new ControllerAccounts(viewAccountant);

                break;

            case 3:
                ViewPharmacist viewPharmacist = new ViewPharmacist();

                new ControllerPharmacist(viewPharmacist);

                break;

            case 4:
                ViewReceptionist viewReceptionist = new ViewReceptionist();
                new ControllerReceptionist(viewReceptionist);

                break;

            case 5:
                ViewManager viewManger = new ViewManager();
                new ControllerManager(viewManger);
            case 0:

                break;

        }

    }

    public static String getId() {
        return Id;
    }

}
