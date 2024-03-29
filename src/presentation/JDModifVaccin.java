/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import dao.daoVaccin;
import factory.Factory;
import javax.swing.JOptionPane;
import objet.Vaccin;

/**
 *
 * @author Super-Afg
 */
public class JDModifVaccin extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public JDModifVaccin(java.awt.Frame parent, boolean modal, Vaccin vacc) {
        super(parent, modal);

        initComponents();
        fillComponents(vacc);
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
        jtfTitre = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDiscription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vaccin");

        jLabel1.setText("Titre :");

        jLabel2.setText("Discription :");

        jtfTitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTitreActionPerformed(evt);
            }
        });

        btnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ok.png"))); // NOI18N
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btnFermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Erase.png"))); // NOI18N
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        jtaDiscription.setColumns(20);
        jtaDiscription.setRows(5);
        jScrollPane1.setViewportView(jtaDiscription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFermer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(327, 327, 327))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 327, Short.MAX_VALUE))
                            .addComponent(jtfTitre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFermer, btnok});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnok)
                    .addComponent(btnFermer)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFermer, btnok});

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void fillComponents(Vaccin vacc) {
        jtfTitre.setText(vacc.getNom_vaccin());
        jtaDiscription.setText(vacc.getDiscrip_vaccin());

        id_vac = vacc.getId_vaccin();
    }
    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        Vaccin vac = new Vaccin(id_vac, null, null);
        vac.setNom_vaccin(jtfTitre.getText());
        String corrige = jtaDiscription.getText();
        corrige = corrige.replaceAll("'", " ");
        vac.setDiscrip_vaccin(corrige);

        boolean ok = daovac.updateVaccin(vac);
        if (!ok) {
            JOptionPane.showMessageDialog(null, "Modification impossible !", "Avertissement", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();

    }//GEN-LAST:event_btnokActionPerformed

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void jtfTitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTitreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTitreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDiscription;
    private javax.swing.JTextField jtfTitre;
    // End of variables declaration//GEN-END:variables
    private int id_vac;
    private daoVaccin daovac = Factory.getdaoVaccin();

}
