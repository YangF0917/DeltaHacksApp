/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorand.appservicegui;

import com.algorand.app.service.core.Agreement;
import com.algorand.app.service.core.TransactionEnvelope;
import com.algorand.app.service.core.TransactionPrototype;
import com.algorand.app.service.core.TransactionTypeEnum;
import java.util.Date;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ericgieseke
 */
public class CreateTransaction extends javax.swing.JFrame {

    private Logger log = LoggerFactory.getLogger("WalletRESTClientController");

    private static final String APP_SERVICE_HOST = "app-service-toronto-hackathon-1811157952.us-east-2.elb.amazonaws.com";
    private static final int APP_SERVICE_PORT = 80;       
    private static final String SUBMIT_UNSIGNED_TRANSACTION_URL = "http://" + APP_SERVICE_HOST + ":" + APP_SERVICE_PORT + "/transaction-envelope/submit-unsigned-transaction";

    /**
     * Creates new form CreateTransaction
     */
    public CreateTransaction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        payerAddressTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        receiverAddressTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        feeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        agreementTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        noteFieldTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        transactionIDTextField = new javax.swing.JTextField();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        amountTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amountTextField.setText("8");
        amountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Amount (Algos)");

        payerAddressTextField.setText("EZG6H7XKLBMWRJ2OX47J5LZA672BTCUESIQVCZZ7BEWLQO2GPW5XKJKBLE");
        payerAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerAddressTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Payer");

        jLabel3.setText("Create Standard Transaction");

        receiverAddressTextField.setText("KV2XGKMXGYJ6PWYQA5374BYIQBL3ONRMSIARPCFCJEAMAHQEVYPB7PL3KU");
        receiverAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiverAddressTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Receiver");

        feeTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        feeTextField.setText("1000");
        feeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Fee (uAlgos)");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        agreementTextArea.setColumns(20);
        agreementTextArea.setRows(5);
        agreementTextArea.setText("Philz Coffee \n\nMint Mohito Iced Coffee    $4.50\nNew Manhattan (Small)      $3.50\n--------------------------\nTotal:                                 $8.00\n\nPhilz Coffee Inc.\n681 Blossum Hill Rd., Suite 102\nLos Gatos, CA 95032\n408-356-5046\n\nProcessed by Algorand Transaction Services");
        jScrollPane1.setViewportView(agreementTextArea);

        jLabel6.setText("Receipt:");

        jLabel7.setText("Note Field: ");

        noteFieldTextField.setText("Note field text...");
        noteFieldTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteFieldTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("ID");

        transactionIDTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        transactionIDTextField.setText("10010");
        transactionIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionIDTextFieldActionPerformed(evt);
            }
        });

        logoLabel.setText("Algorand");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noteFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton)
                                .addGap(10, 10, 10))
                            .addComponent(jScrollPane1)
                            .addComponent(receiverAddressTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(payerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountTextField)
                                    .addComponent(feeTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transactionIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(251, 251, 251)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(transactionIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(feeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiverAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noteFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(submitButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextFieldActionPerformed

    private void receiverAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiverAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiverAddressTextFieldActionPerformed

    private void feeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        processCreateTransactionEnvelope();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void payerAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payerAddressTextFieldActionPerformed

    private void noteFieldTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteFieldTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteFieldTextFieldActionPerformed

    private void transactionIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionIDTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTransaction().setVisible(true);
            }
        });
    }

    public Agreement createAgreement(TransactionEnvelope transactionEnvelope, int amount, int fee) {
        Agreement agreement = new Agreement();
        agreement.setIdentifier("agreement-" + transactionEnvelope.getId());
        agreement.setTime(new Date());
        agreement.setType("receipt");
        StringBuilder contents = new StringBuilder();
        contents.append("receipt\n");
        contents.append("date: ").append(transactionEnvelope.getDate().toString()).append("\n");
        contents.append("you agree to pay ").append(amount).append(" algos, with fee of ").append(fee).append(" microAlogs");
        contents.append("\n ----------------- \n ").append(this.agreementTextArea.getText()).append("\n -----------------");
        agreement.setContents(contents.toString());
        agreement.setSignature("signature of agreement by the application: ".getBytes());
        agreement.setType("pay");  
        return agreement;
    }
    
    
    private void processCreateTransactionEnvelope() {

        int amount = Integer.parseInt(amountTextField.getText());
        int fee = Integer.parseInt(feeTextField.getText());
        String transactionId =  transactionIDTextField.getText();
         
        TransactionEnvelope transactionEnvelope = new TransactionEnvelope();
        transactionEnvelope.setApplicationId("TEST_APP");
        transactionEnvelope.setId(transactionId);
        

        transactionEnvelope.setDate(new Date());
        transactionEnvelope.setName("transaction-envelope-" + transactionId);
        transactionEnvelope.setDescription("Sample transaction envelope");
        transactionEnvelope.setApplicationId("PoS App");

        transactionEnvelope.setId(transactionId);
 
        transactionEnvelope.setAgreement(createAgreement(  transactionEnvelope,  amount,   fee));
        TransactionPrototype tp = new TransactionPrototype();
        tp.setTransactionType(TransactionTypeEnum.STANDARD);
        tp.setAmount(amount);
        tp.setFee(fee);
        tp.setPayer(payerAddressTextField.getText());
        tp.setReceiver(receiverAddressTextField.getText());
        tp.setNoteField(noteFieldTextField.getText().getBytes());
        tp.setApplicationTransactionId(transactionIDTextField.getText());
        transactionEnvelope.setTransactionPrototype(tp);
        log.info("created transaction envelope: " + transactionEnvelope);

        submitUnsignedTransactionEnvelope(transactionEnvelope);
    }

    private void submitUnsignedTransactionEnvelope(TransactionEnvelope transactionEnvelope) {
        log.info("creating unsigned transaction: " + transactionEnvelope);
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(SUBMIT_UNSIGNED_TRANSACTION_URL);

        Invocation invocation = webTarget.request(MediaType.APPLICATION_JSON).buildPost(Entity.entity(transactionEnvelope, MediaType.APPLICATION_JSON));

        Response response = invocation.invoke();
        log.info("submit unsigned transaction response: " + response);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea agreementTextArea;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JTextField feeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JTextField noteFieldTextField;
    private javax.swing.JTextField payerAddressTextField;
    private javax.swing.JTextField receiverAddressTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField transactionIDTextField;
    // End of variables declaration//GEN-END:variables
}
