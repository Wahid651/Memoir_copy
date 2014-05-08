/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import factory.Factory;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 * I.E.P.S.C.F. - Uccle - PDSIG Travail de fin de module PROJET : (BD media.sql)
 *
 * @author Abdelmonim EL GUIR & Brahim BOUKOBBA
 * @version 1er semestre 2013-2014
 */
public class JDConnexionMySQL extends javax.swing.JDialog {

    /**
     * Creates new form JDConnexionMySQL
     */
    public JDConnexionMySQL() {
        initComponents();
        this.getRootPane().setDefaultButton(jBOuvrir);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBQuitter = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordPWD = new javax.swing.JPasswordField();
        jBOuvrir = new javax.swing.JButton();
        jTxtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAnnuler = new javax.swing.JButton();
        jTxtNomHote = new javax.swing.JTextField();
        jSpinnerPort = new javax.swing.JSpinner();
        jTxtBD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Connexion MySQL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Utilisateur:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Veuillez saisir les informations de connexion ...");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Mot de passe:");

        jBQuitter.setText("Quitter");
        jBQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Base de donnée: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Port:");

        jBOuvrir.setText("Ouvrir");
        jBOuvrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOuvrirActionPerformed(evt);
            }
        });

        jTxtUser.setText("root");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nom ou IP de l'hôte: ");

        jBAnnuler.setMnemonic(KeyEvent.VK_ESCAPE);
        jBAnnuler.setText("Annuler");
        jBAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnnulerActionPerformed(evt);
            }
        });

        jTxtNomHote.setText("127.0.0.1");

        jSpinnerPort.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(3306), null, null, Integer.valueOf(1)));
        jSpinnerPort.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinnerPort, ""));
        jSpinnerPort.setValue(3306);
        ((JSpinner.DefaultEditor)jSpinnerPort.getEditor()).getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinnerPortKeyTyped(evt);
            }         
        });

        jTxtBD.setText("tfe_memoir");
        jTxtBD.setToolTipText("BD media.sql");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerPort, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jBOuvrir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBAnnuler)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jTxtBD, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordPWD, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtUser, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtNomHote, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNomHote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordPWD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOuvrir)
                    .addComponent(jBAnnuler)
                    .addComponent(jBQuitter))
                .addGap(20, 20, 20))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitterActionPerformed
        //this.dispose();
        int rep = JOptionPane.showConfirmDialog(rootPane, "Voulez-vous vraiment quitter ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (Factory.getDAOConnexion() != null) {
                Factory.getDAOConnexion().close();
            }
            System.exit(0);
        }
    }//GEN-LAST:event_jBQuitterActionPerformed

    private void jBOuvrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOuvrirActionPerformed
        accept_Enter();
    }//GEN-LAST:event_jBOuvrirActionPerformed

    private void jBAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnnulerActionPerformed
        dispose();
    }//GEN-LAST:event_jBAnnulerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(rootPane, "Voulez-vous vraiment quitter ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (Factory.getDAOConnexion() != null) {
                Factory.getDAOConnexion().close();
            }
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    private void jSpinnerPortKeyTyped(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    private void accept_Enter() {
        String nomHost = jTxtNomHote.getText();
        String port = String.valueOf(jSpinnerPort.getValue());
        String bd = jTxtBD.getText();
        String uid = jTxtUser.getText();
        String pwd = String.valueOf(jPasswordPWD.getPassword());
        String chaineConn = "jdbc:mysql://" + nomHost + ":" + port + "/" + bd + "?user=" + uid + "&password=" + pwd;
        if (Factory.getDAOConnexion(chaineConn).isConnected()) {
            dispose();
            JOptionPane.showMessageDialog(null, "Succès : Connexion établie");
        } else {
            defaultConnection();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnnuler;
    private javax.swing.JButton jBOuvrir;
    private javax.swing.JButton jBQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordPWD;
    private javax.swing.JSpinner jSpinnerPort;
    private javax.swing.JTextField jTxtBD;
    private javax.swing.JTextField jTxtNomHote;
    private javax.swing.JTextField jTxtUser;
    // End of variables declaration//GEN-END:variables

    private void defaultConnection() {
        jTxtNomHote.setText("127.0.0.1");
        jSpinnerPort.setEnabled(false);
        jTxtUser.setText("root");
        jPasswordPWD.setText("");
    }
}