/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.view;

import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author test account
 */
public class ViewReceptionist extends javax.swing.JFrame {

    /**
     * Creates new form viewReceptionist
     */
    public ViewReceptionist() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCreateIPDPatient = new javax.swing.JButton();
        btnViewPatientInformation = new javax.swing.JButton();
        btnCreateOPDPatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();

        jButton3.setText("jButton1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Receptionist");

        btnCreateIPDPatient.setText("Create IPD Patient");
        btnCreateIPDPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateIPDPatientActionPerformed(evt);
            }
        });

        btnViewPatientInformation.setText("View Patient Information");
        btnViewPatientInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientInformationActionPerformed(evt);
            }
        });

        btnCreateOPDPatient.setText("Create OPD Patient");
        /*
        btnCreateOPDPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOPDPatientActionPerformed(evt);
            }
        });
        */

        jLabel2.setText("Patient Id");

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateIPDPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewPatientInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateOPDPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(198, 198, 198)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateOPDPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateIPDPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(btnViewPatientInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOPDPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOPDPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateOPDPatientActionPerformed

    private void btnViewPatientInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientInformationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewPatientInformationActionPerformed

    private void btnCreateIPDPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateIPDPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateIPDPatientActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    public String getTxtPatientId() {
        return txtPatientId.getText();
    }

    public void setButtonBehaviour(ActionListener listner) {
        btnCreateOPDPatient.addActionListener(listner);
        btnViewPatientInformation.addActionListener(listner);
        btnCreateIPDPatient.addActionListener(listner);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateIPDPatient;
    private javax.swing.JButton btnCreateOPDPatient;
    private javax.swing.JButton btnViewPatientInformation;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables
}
