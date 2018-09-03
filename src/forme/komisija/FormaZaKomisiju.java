/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.komisija;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author PC
 */
public class FormaZaKomisiju extends javax.swing.JFrame {

    /**
     * Creates new form FormaZaKomisiju
     */
    public FormaZaKomisiju() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        setSize(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cbmUnosKartona = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        cbVerifikacija = new javax.swing.JCheckBoxMenuItem();
        cbSpajanjeKartona = new javax.swing.JCheckBoxMenuItem();
        cbPretraga = new javax.swing.JCheckBoxMenuItem();
        cbIzmenaKartona = new javax.swing.JCheckBoxMenuItem();
        cbIzracunajPoene = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1166, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jMenu1.setText("Glavni meni");

        cbmUnosKartona.setSelected(true);
        cbmUnosKartona.setText("Unos kartona-Unos prvi");
        cbmUnosKartona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmUnosKartonaActionPerformed(evt);
            }
        });
        jMenu1.add(cbmUnosKartona);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Unos kartona-Unos drugi");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        cbVerifikacija.setSelected(true);
        cbVerifikacija.setText("Verifikacija kartona");
        cbVerifikacija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVerifikacijaActionPerformed(evt);
            }
        });
        jMenu1.add(cbVerifikacija);

        cbSpajanjeKartona.setSelected(true);
        cbSpajanjeKartona.setText("Spajanje kartona");
        cbSpajanjeKartona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSpajanjeKartonaActionPerformed(evt);
            }
        });
        jMenu1.add(cbSpajanjeKartona);

        cbPretraga.setSelected(true);
        cbPretraga.setText("Pretraga kartona");
        cbPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPretragaActionPerformed(evt);
            }
        });
        jMenu1.add(cbPretraga);

        cbIzmenaKartona.setSelected(true);
        cbIzmenaKartona.setText("Izmena kartona");
        cbIzmenaKartona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIzmenaKartonaActionPerformed(evt);
            }
        });
        jMenu1.add(cbIzmenaKartona);

        cbIzracunajPoene.setSelected(true);
        cbIzracunajPoene.setText("Izracunaj poene");
        cbIzracunajPoene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIzracunajPoeneActionPerformed(evt);
            }
        });
        jMenu1.add(cbIzracunajPoene);

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("Kreiranje rang liste");
        jMenu1.add(jCheckBoxMenuItem7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSpajanjeKartonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSpajanjeKartonaActionPerformed
        // TODO add your handling code here:
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.SPOJ_KARTONE);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        
        JOptionPane.showMessageDialog(this, so.getPoruka());
        return;
    }//GEN-LAST:event_cbSpajanjeKartonaActionPerformed

    private void cbVerifikacijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVerifikacijaActionPerformed
        FormaZaVerifikacijuKartona fzv = new FormaZaVerifikacijuKartona();
        fzv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cbVerifikacijaActionPerformed

    private void cbPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPretragaActionPerformed
        // TODO add your handling code here:
        FormaPretragaKartona fpk = new FormaPretragaKartona();
        fpk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cbPretragaActionPerformed

    private void cbmUnosKartonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmUnosKartonaActionPerformed
        FormaUnosKartona fuk = new FormaUnosKartona();
        fuk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cbmUnosKartonaActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        FormaUnosKartona fuk = new FormaUnosKartona();
        fuk.postaviUnosK();
        fuk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void cbIzmenaKartonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIzmenaKartonaActionPerformed
        // TODO add your handling code here:
        FormaIzmenaKartona fik = new FormaIzmenaKartona();
        fik.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cbIzmenaKartonaActionPerformed

    private void cbIzracunajPoeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIzracunajPoeneActionPerformed
        // TODO add your handling code here:
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.IZRACUNAJ_POENE);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        
        JOptionPane.showMessageDialog(this, so.getPoruka());
        return;
    }//GEN-LAST:event_cbIzracunajPoeneActionPerformed

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
            java.util.logging.Logger.getLogger(FormaZaKomisiju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaZaKomisiju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaZaKomisiju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaZaKomisiju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaZaKomisiju().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cbIzmenaKartona;
    private javax.swing.JCheckBoxMenuItem cbIzracunajPoene;
    private javax.swing.JCheckBoxMenuItem cbPretraga;
    private javax.swing.JCheckBoxMenuItem cbSpajanjeKartona;
    private javax.swing.JCheckBoxMenuItem cbVerifikacija;
    private javax.swing.JCheckBoxMenuItem cbmUnosKartona;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
