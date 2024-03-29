/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import com.toedter.calendar.JDateChooser;
import dao.daoAnimal;
import dao.daoPersonne;
import factory.Factory;
import java.awt.Component;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.TableModelPersonneAnimal;
import objet.Personne;

/**
 *
 * @author Super-Afg
 */
public class JDUpdatePersonne extends javax.swing.JDialog {

    /**
     * Creates new form JDInsertPersonne
     */
    public JDUpdatePersonne(java.awt.Frame parent, boolean modal, Personne myPers) {
        super(parent, modal);
        initComponents();
        fillcomponents(myPers);
        myPersonne = myPers;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNom = new javax.swing.JTextField();
        tfPrenom = new javax.swing.JTextField();
        tfTelephone = new javax.swing.JTextField();
        tfMail = new javax.swing.JTextField();
        chk_listRouge = new javax.swing.JCheckBox();
        chk_membre = new javax.swing.JCheckBox();
        chkDonateur = new javax.swing.JCheckBox();
        chkVolontaire = new javax.swing.JCheckBox();
        chk_autre_refuge = new javax.swing.JCheckBox();
        chk_refuge = new javax.swing.JCheckBox();
        chkRevendeur = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        taAdresse = new java.awt.TextArea();
        taNote = new java.awt.TextArea();
        jDateChooserDateViste = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEnregister = new javax.swing.JButton();
        chk_home = new javax.swing.JCheckBox();
        tfMobile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCode_postal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfVille = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personne");

        jLabel1.setText("Nom :");

        jLabel2.setText("Prénom :");

        jLabel3.setText("Adresse :");

        jLabel4.setText("Telephone :");

        jLabel5.setText("Mail :");

        chk_listRouge.setText("Liste rouge");
        chk_listRouge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_listRougeActionPerformed(evt);
            }
        });

        chk_membre.setText("Membre");

        chkDonateur.setText("Donateur");

        chkVolontaire.setText("Volontaire");

        chk_autre_refuge.setText("Autre refuge");

        chk_refuge.setText("Travail au refuge");

        chkRevendeur.setText("Revendeur");

        jLabel6.setText("Note du visite :");

        taNote.setEditable(false);

        jDateChooserDateViste.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserDateViste.setDate(new java.util.Date(1397463682000L));
        jDateChooserDateViste.setDateFormatString("dd-MM-yyyy");
        jDateChooserDateViste.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserDateVistePropertyChange(evt);
            }
        });

        jLabel7.setText("Date du visite:");

        jLabel8.setText("Visite à domicile du propriétaire :");

        btnEnregister.setText("Enregistrer");
        btnEnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregisterActionPerformed(evt);
            }
        });

        chk_home.setText("Reçu visite");
        chk_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_homeActionPerformed(evt);
            }
        });

        jLabel9.setText("Mobile :");

        jLabel10.setText("Code postal :");

        jLabel11.setText("Ville :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCode_postal)
                            .addComponent(tfVille)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNom)
                            .addComponent(tfPrenom)
                            .addComponent(taAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(tfTelephone)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfMail)
                            .addComponent(tfMobile))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_membre)
                            .addComponent(chkDonateur)
                            .addComponent(chkRevendeur)
                            .addComponent(chk_home))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkVolontaire)
                            .addComponent(chk_refuge)
                            .addComponent(chk_autre_refuge)
                            .addComponent(chk_listRouge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jDateChooserDateViste, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(taNote, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnEnregister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(222, 222, 222)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNom, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(chk_membre)
                            .addComponent(tfPrenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkDonateur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkRevendeur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk_home))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(taAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfVille, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(chkVolontaire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_autre_refuge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_refuge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_listRouge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfCode_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taNote, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserDateViste, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnregister)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Information détailé sur la personne", jPanel1);

        jTable1.setModel(myTablePersonneAnimal);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("La liste des animeaux refuge", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_listRougeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_listRougeActionPerformed
        /*est vous sur de vouloir mettre la personne dans la liste rouge ?*/
    }//GEN-LAST:event_chk_listRougeActionPerformed

    private void btnEnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregisterActionPerformed

        myPersonne.setNom(tfNom.getText());
        myPersonne.setPrenom(tfPrenom.getText());
        myPersonne.setAdress(taAdresse.getText());
        myPersonne.setTel(tfTelephone.getText());
        myPersonne.setMail(tfMail.getText());
        myPersonne.setDate_chk(jDateChooserDateViste.getDate());
        myPersonne.setNote(taNote.getText());
        myPersonne.setMobile(tfMobile.getText());
        myPersonne.setVille(tfVille.getText());
        myPersonne.setCode_postal(Integer.parseInt(tfCode_postal.getText()));
        /* la method getchkBox renvoir 1 ou 0*/
        myPersonne.setCkh_home(getchkBox(chk_home.isSelected()));
        myPersonne.setEst_autre_refuge(getchkBox(chk_autre_refuge.isSelected()));
        myPersonne.setEst_bannie(getchkBox(chk_listRouge.isSelected()));
        myPersonne.setEst_renvendeur(getchkBox(chkRevendeur.isSelected()));
        myPersonne.setEst_volontaire(getchkBox(chkVolontaire.isSelected()));
        myPersonne.setEst_autre_refuge(getchkBox(chk_autre_refuge.isSelected()));
        myPersonne.setEst_donateur(getchkBox(chkDonateur.isSelected()));
        myPersonne.setEst_refuge_pers(getchkBox(chk_refuge.isSelected()));

        boolean ok = daoPers.updatePersonne(myPersonne);
        if (!ok) {
            JOptionPane.showMessageDialog(null, "Mise à jour impossible !", "Avertissement", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Mise à jour effectuée avec succés !", null, WIDTH);
        }
        this.dispose();
    }//GEN-LAST:event_btnEnregisterActionPerformed

    private void chk_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_homeActionPerformed
        if (chk_home.isSelected() == true) {
            taNote.setEditable(true);
        } else {
            taNote.setEditable(false);
        }
    }//GEN-LAST:event_chk_homeActionPerformed

    private void jDateChooserDateVistePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserDateVistePropertyChange
        testAllDate(jDateChooserDateViste);
    }//GEN-LAST:event_jDateChooserDateVistePropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnregister;
    private javax.swing.JCheckBox chkDonateur;
    private javax.swing.JCheckBox chkRevendeur;
    private javax.swing.JCheckBox chkVolontaire;
    private javax.swing.JCheckBox chk_autre_refuge;
    private javax.swing.JCheckBox chk_home;
    private javax.swing.JCheckBox chk_listRouge;
    private javax.swing.JCheckBox chk_membre;
    private javax.swing.JCheckBox chk_refuge;
    private com.toedter.calendar.JDateChooser jDateChooserDateViste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private java.awt.TextArea taAdresse;
    private java.awt.TextArea taNote;
    private javax.swing.JTextField tfCode_postal;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfMobile;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfPrenom;
    private javax.swing.JTextField tfTelephone;
    private javax.swing.JTextField tfVille;
    // End of variables declaration//GEN-END:variables
  private Personne myPersonne;
    private int idPersonne;
    private int nbtest = 0;

    private void resizeColumnWidth() {
        final TableColumnModel columnModel = jTable1.getColumnModel();
        for (int column = 0; column < jTable1.getColumnCount(); column++) {
            int width = 50; // Min width
            for (int row = 0; row < jTable1.getRowCount(); row++) {
                TableCellRenderer renderer = jTable1.getCellRenderer(row, column);
                Component comp = jTable1.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width, width);
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
        CenterText();
    }

    private void CenterText() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1
                .setDefaultRenderer(String.class, centerRenderer);
    }

    private daoAnimal daoAni = Factory.getdaoAnimal();
    private TableModelPersonneAnimal myTablePersonneAnimal = new TableModelPersonneAnimal(daoAni.selectPersonneAnimal(idPersonne));

    private void refreshModel() {

        myTablePersonneAnimal.setMyList(daoAni.selectPersonneAnimal(idPersonne));
        //OrganiseMaTable();
        resizeColumnWidth();
    }

    private int getchkBox(boolean ok) {
        int rep;
        if (ok == true) {
            rep = 1;
        } else {
            rep = 0;
        }
        return rep;
    }
    private daoPersonne daoPers = Factory.getdaoPersonne();

    private void fillcomponents(Personne myPersonne) {
        tfNom.setText(myPersonne.getNom());
        tfPrenom.setText(myPersonne.getPrenom());
        tfMail.setText(myPersonne.getMail());
        tfTelephone.setText(myPersonne.getTel());
        taAdresse.setText(myPersonne.getAdress());
        taNote.setText(myPersonne.getNote());
        tfMobile.setText(myPersonne.getMobile());
        tfCode_postal.setText("" + myPersonne.getCode_postal());
        tfVille.setText(myPersonne.getVille());
        jDateChooserDateViste.setDate(myPersonne.getDate_chk());
        chkDonateur.setSelected(getchkBoxSelect(myPersonne.getEst_donateur()));
        chkRevendeur.setSelected(getchkBoxSelect(myPersonne.getEst_renvendeur()));
        chkVolontaire.setSelected(getchkBoxSelect(myPersonne.getEst_volontaire()));
        chk_autre_refuge.setSelected(getchkBoxSelect(myPersonne.getEst_autre_refuge()));
        chk_home.setSelected(getchkBoxSelect(myPersonne.getCkh_home()));
        chk_listRouge.setSelected(getchkBoxSelect(myPersonne.getEst_bannie()));
        chk_membre.setSelected(getchkBoxSelect(myPersonne.getEst_membre()));
        chk_refuge.setSelected(getchkBoxSelect(myPersonne.getEst_refuge_pers()));
        idPersonne = myPersonne.getId_p();
        refreshModel();
    }

    private boolean getchkBoxSelect(int select) {
        boolean rep;
        if (select == 1) {
            rep = true;
        } else {
            rep = false;
        }
        return rep;
    }

    private void testAllDate(JDateChooser chooser) {

        Date now = new Date();

        if (chooser.getDate().compareTo(now) == 1) {
            JOptionPane.showMessageDialog(null, "Veuillez choisir une date valide, vous ne pouvez pas sélectionner une date future");
            chooser.setDate(now);
        } else {
            chk_home.setSelected(true);
            taNote.setEditable(true);
        }
    }
}
