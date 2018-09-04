/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.komisija;

import domen.Karton;
import domen.PomocIzmena;
import domen.Zadatak;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;
import modeli.ModelTabeleIzmenaKartona;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author PC
 */
public class FormaCentralnaKomisija extends javax.swing.JFrame {
    int kartonID;
    Karton karton;

    /**
     * Creates new form FormaCentralnaKomisija
     */
    public FormaCentralnaKomisija() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = tk.getScreenSize().width;
        int y = tk.getScreenSize().height;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBrojKartona = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblGrupaZadataka = new javax.swing.JLabel();
        btnSacuvajIzmene = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaZadataka = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ISPRAVKA OD STRANE CENTRALNE KOMISIJE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Broj kartona: ");

        lblBrojKartona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBrojKartona.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Grupa zadataka:");

        lblGrupaZadataka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGrupaZadataka.setText("jLabel4");

        btnSacuvajIzmene.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSacuvajIzmene.setText("Sacuvaj izmene");
        btnSacuvajIzmene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajIzmeneActionPerformed(evt);
            }
        });

        btnNazad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNazad.setText("Nazad na glavnu formu");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        tabelaZadataka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaZadataka);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNazad)
                    .addComponent(btnSacuvajIzmene)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblGrupaZadataka))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(lblBrojKartona)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblBrojKartona))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblGrupaZadataka))
                        .addGap(51, 51, 51)
                        .addComponent(btnSacuvajIzmene)
                        .addGap(34, 34, 34)
                        .addComponent(btnNazad)
                        .addGap(0, 152, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        // TODO add your handling code here:
        FormaZaKomisiju fzk = new FormaZaKomisiju();
        this.setVisible(false);
        fzk.setVisible(true);
    }//GEN-LAST:event_btnNazadActionPerformed

    private void btnSacuvajIzmeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajIzmeneActionPerformed
        // TODO add your handling code here:
        PomocIzmena pi = new PomocIzmena();
        pi.setKratonId(kartonID);
        ModelTabeleIzmenaKartona mtik = (ModelTabeleIzmenaKartona) tabelaZadataka.getModel();
        pi.setZadaciZaIzmenu(mtik.getZadaciZaIzmenu());
        
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.IZMENI_ZADATKE);
        kz.setParametar(pi);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        JOptionPane.showMessageDialog(this, so.getPoruka());
        return;
    }//GEN-LAST:event_btnSacuvajIzmeneActionPerformed

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
            java.util.logging.Logger.getLogger(FormaCentralnaKomisija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaCentralnaKomisija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaCentralnaKomisija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaCentralnaKomisija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaCentralnaKomisija().setVisible(true);
            }
        });
    }

    public void setKarton(Karton karton) {
        this.karton = karton;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnSacuvajIzmene;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrojKartona;
    private javax.swing.JLabel lblGrupaZadataka;
    private javax.swing.JTable tabelaZadataka;
    // End of variables declaration//GEN-END:variables

    public void srediSve() {
        
            kartonID = karton.getKartonID();
            lblGrupaZadataka.setText(karton.getGrupaZadataka().getBrGrupe()+"");
            lblBrojKartona.setText(karton.getBrKartona()+"");
            
            ArrayList<Zadatak> zadaciKartona = karton.getListaOdg();
            ModelTabeleIzmenaKartona mtr = new ModelTabeleIzmenaKartona();
            mtr.setZadaci(zadaciKartona);
            tabelaZadataka.setModel(mtr);
    }
}