/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.view;

import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class ViewPrescriptionData extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrescriptionData
     */
    public ViewPrescriptionData() {
        initComponents();

        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblmed1 = new javax.swing.JLabel();
        lblmed2 = new javax.swing.JLabel();
        lblmed3 = new javax.swing.JLabel();
        lblmed4 = new javax.swing.JLabel();
        lblmed5 = new javax.swing.JLabel();
        lblDosage5 = new javax.swing.JLabel();
        lblDosage1 = new javax.swing.JLabel();
        lblDosage2 = new javax.swing.JLabel();
        lblDosage3 = new javax.swing.JLabel();
        lblDosage4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPrescriptionNo = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblRemarks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Prescription");

        jLabel2.setText("Patient ID");

        jLabel3.setText("Date");

        jLabel11.setText("Remarks");

        btnOk.setText("OK");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Medicines"));

        jLabel4.setText("med 1 ");

        jLabel5.setText("med 2");

        jLabel6.setText("med 3");

        jLabel7.setText("med 4");

        jLabel8.setText("med 5");

        jLabel9.setText("Med ID");

        jLabel10.setText("Dosage");

        lblmed1.setText("jLabel13");

        lblmed2.setText("jLabel14");

        lblmed3.setText("jLabel15");

        lblmed4.setText("jLabel16");

        lblmed5.setText("jLabel17");

        lblDosage5.setText("jLabel17");

        lblDosage1.setText("jLabel13");

        lblDosage2.setText("jLabel14");

        lblDosage3.setText("jLabel15");

        lblDosage4.setText("jLabel16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblmed1)
                    .addComponent(lblmed2)
                    .addComponent(lblmed3)
                    .addComponent(lblmed4)
                    .addComponent(lblmed5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDosage1)
                        .addComponent(lblDosage2)
                        .addComponent(lblDosage3)
                        .addComponent(lblDosage4)
                        .addComponent(lblDosage5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblmed1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblmed2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblmed3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblmed4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblmed5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDosage1)
                        .addGap(18, 18, 18)
                        .addComponent(lblDosage2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDosage3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDosage4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDosage5)))
                .addContainerGap())
        );

        jLabel12.setText("Prescription No");

        lblPrescriptionNo.setText("jLabel23");

        lblPatientID.setText("jLabel24");

        lblDate.setText("jLabel25");

        lblRemarks.setText("jLabel26");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrescriptionNo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDate)
                                    .addComponent(lblPatientID))))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRemarks)
                        .addGap(120, 120, 120))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnOk)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblPrescriptionNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPatientID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblRemarks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setLblDate(String lblDate) {
        this.lblDate.setText(lblDate);
    }

    public void setLblDosage1(String lblDosage1) {
        this.lblDosage1.setText(lblDosage1);
    }

    public void setLblDosage2(String lblDosage2) {
        this.lblDosage2.setText(lblDosage2);
    }

    public void setLblDosage3(String lblDosage3) {
        this.lblDosage3.setText(lblDosage3);
    }

    public void setLblDosage4(String lblDosage4) {
        this.lblDosage4.setText(lblDosage4);
    }

    public void setLblDosage5(String lblDosage5) {
        this.lblDosage5.setText(lblDosage5);
    }

    public void setLblPatientID(String lblPatientID) {
        this.lblPatientID.setText(lblPatientID);
    }

    public void setLblPrescriptionNo(String lblPrescriptionNo) {
        this.lblPrescriptionNo.setText(lblPrescriptionNo);
    }

    public void setLblRemarks(String lblRemarks) {
        this.lblRemarks.setText(lblRemarks);
    }

    public void setLblmed1(String lblmed1) {
        this.lblmed1.setText(lblmed1);
    }

    public void setLblmed2(String lblmed2) {
        this.lblmed2.setText(lblmed2);
    }

    public void setLblmed3(String lblmed3) {
        this.lblmed3.setText(lblmed3);
    }

    public void setLblmed4(String lblmed4) {
        this.lblmed4.setText(lblmed4);
    }

    public void setLblmed5(String lblmed5) {
        this.lblmed5.setText(lblmed5);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDosage1;
    private javax.swing.JLabel lblDosage2;
    private javax.swing.JLabel lblDosage3;
    private javax.swing.JLabel lblDosage4;
    private javax.swing.JLabel lblDosage5;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPrescriptionNo;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblmed1;
    private javax.swing.JLabel lblmed2;
    private javax.swing.JLabel lblmed3;
    private javax.swing.JLabel lblmed4;
    private javax.swing.JLabel lblmed5;
    // End of variables declaration//GEN-END:variables
}