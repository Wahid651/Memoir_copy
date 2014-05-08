/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import dao.daoVaccin;
import dao.daoVaccination;
import dao.daoVeterinaire;
import factory.Factory;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objet.Vaccin;
import objet.Vaccination;
import objet.Veterinaire;

/**
 *
 * @author Super-Afg
 */
public class JDVaccinInsert extends javax.swing.JDialog {

    /**
     * Creates new form JDVaccinInsert
     */
    public JDVaccinInsert(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        try {
            fillComponents();
        } catch (ParseException ex) {
            Logger.getLogger(JDVaccinInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
        idAnimal = id;

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
        jDateChooserDateVaccin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cbVeterinaire = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbVaccin = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAreaNote = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbNb = new javax.swing.JComboBox();
        cbDuree = new javax.swing.JComboBox();
        tfDateDeRappel = new javax.swing.JTextField();
        ajoutVet = new javax.swing.JButton();
        AjouterVac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Date de vaccination ");

        jLabel2.setText("Date de rappel");

        jDateChooserDateVaccin.setDateFormatString("dd-MM-yyyy");

        jLabel3.setText("Praticien");

        cbVeterinaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVeterinaireActionPerformed(evt);
            }
        });

        jLabel4.setText("Vaccin");

        cbVaccin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVaccinActionPerformed(evt);
            }
        });

        jLabel5.setText("Observations");

        jScrollPane1.setViewportView(tfAreaNote);

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Rappel dans  ");

        cbNb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        cbNb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNbActionPerformed(evt);
            }
        });

        cbDuree.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "an(s)", "mois" }));
        cbDuree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDureeActionPerformed(evt);
            }
        });

        tfDateDeRappel.setEditable(false);

        ajoutVet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ajouter-en-plus-icone-9315-16.png"))); // NOI18N
        ajoutVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutVetActionPerformed(evt);
            }
        });

        AjouterVac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ajouter-en-plus-icone-9315-16.png"))); // NOI18N
        AjouterVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterVacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbVeterinaire, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbVaccin, 0, 300, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDateVaccin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfDateDeRappel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajoutVet)
                    .addComponent(AjouterVac))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDateVaccin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDateDeRappel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVeterinaire, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajoutVet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AjouterVac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbVaccin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbVeterinaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVeterinaireActionPerformed
        if (cbVeterinaire.getSelectedIndex() != -1) {
            String selection = cbVeterinaire.getSelectedItem().toString();
            idVet = getidVet(selection);
        }

    }//GEN-LAST:event_cbVeterinaireActionPerformed

    private void cbVaccinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVaccinActionPerformed
        if (cbVaccin.getSelectedIndex() != -1) {
            String selection = cbVaccin.getSelectedItem().toString();
            idVacc = getidVac(selection);
        }
    }//GEN-LAST:event_cbVaccinActionPerformed

    private void cbNbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNbActionPerformed
        try {
            dateRappel(cbNb.getSelectedIndex() + 1, cbDuree.getSelectedItem().toString());
        } catch (ParseException ex) {
            Logger.getLogger(JDVaccinInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbNbActionPerformed

    private void cbDureeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDureeActionPerformed
        try {
            dateRappel(cbNb.getSelectedIndex() + 1, cbDuree.getSelectedItem().toString());
        } catch (ParseException ex) {
            Logger.getLogger(JDVaccinInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbDureeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Vaccination vacc = new Vaccination(null, null, null, idVacc, idVacc, idVet, null, null, null);
        vacc.setDate_vacc(jDateChooserDateVaccin.getDate());
        vacc.setDate_rappel(dateRappel);
        vacc.setObservation(tfAreaNote.getText());
        vacc.setId_a(idAnimal);
        vacc.setId_vet(idVet);
        vacc.setId_vaccin(idVacc);
        boolean ok = daoVaccin.insertVaccination(vacc);
        if (!ok) {
            JOptionPane.showMessageDialog(null, "Insertion impossible !", "Avertissement", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Insertion effectuée !", null, WIDTH);
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ajoutVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutVetActionPerformed
      JDInsertVeterinaire jd = new JDInsertVeterinaire(null, rootPaneCheckingEnabled);
      jd.setVisible(true);
        try {
            fillComponents();
        } catch (ParseException ex) {
            Logger.getLogger(JDVaccinInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ajoutVetActionPerformed

    private void AjouterVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterVacActionPerformed
 JDListVaccins jd = new JDListVaccins(null, rootPaneCheckingEnabled);
 jd.setVisible(true);
   try {
            fillComponents();
        } catch (ParseException ex) {
            Logger.getLogger(JDVaccinInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AjouterVacActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterVac;
    private javax.swing.JButton ajoutVet;
    private javax.swing.JComboBox cbDuree;
    private javax.swing.JComboBox cbNb;
    private javax.swing.JComboBox cbVaccin;
    private javax.swing.JComboBox cbVeterinaire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooserDateVaccin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane tfAreaNote;
    private javax.swing.JTextField tfDateDeRappel;
    // End of variables declaration//GEN-END:variables
private static daoVeterinaire daoVet = Factory.getdaoVeterinaire();
    private static daoVaccin daoVac = Factory.getdaoVaccin();
    private static daoVaccination daoVaccin = Factory.getdaoVaccination();
    private int idVacc;
    private int idVet;
    private int idAnimal;
    private Date dateRappel;

    private void fillComponents() throws ParseException {
        cbVeterinaire.removeAllItems();
        cbVaccin.removeAllItems();
        ArrayList<Veterinaire> vet = daoVet.selectVeterinaire();
        for (int i = 0; i < vet.size(); i++) {
            cbVeterinaire.addItem(((Veterinaire) vet.get(i)).getNom() + " " + vet.get(i).getPrenom());
        }

        ArrayList<Vaccin> vac = daoVac.selectVaccin();
        for (int i = 0; i < vac.size(); i++) {
            cbVaccin.addItem(((Vaccin) vac.get(i)).getNom_vaccin());
        }
        dateRappel(1, "an(s)");
    }

    private int getidVac(String var) {
        int retour = 0;
        ArrayList<Vaccin> vac = daoVac.selectVaccin();
        if (retour == 0) {
            for (int i = 0; i < vac.size(); i++) {
                if (vac.get(i).getNom_vaccin().compareToIgnoreCase(var) == 0) {
                    retour = vac.get(i).getId_vaccin();
                }
            }
        }

        return retour;
    }

    private int getidVet(String var) {
        int retour = 0;
        ArrayList<Veterinaire> vet = daoVet.selectVeterinaire();
        if (retour == 0) {
            for (int i = 0; i < vet.size(); i++) {
                String var2 = vet.get(i).getNom() + " " + vet.get(i).getPrenom();
                if (var2.compareToIgnoreCase(var) == 0) {
                    retour = vet.get(i).getId_vet();
                }
            }
        }

        return retour;
    }

    private void dateRappel(int nb, String duree) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        String output;
        if (duree.compareTo("mois") == 0) {
            c.setTime(new Date()); // Now use today date.
            c.add(Calendar.MONTH, nb); // Adding 5 days
            output = sdf.format(c.getTime());

        } else {
            c.add(Calendar.YEAR, nb); // Adding 5 days
            output = sdf.format(c.getTime());
        }
        tfDateDeRappel.setText(output);
        dateRappel = sdf.parse(output);
    }

}
