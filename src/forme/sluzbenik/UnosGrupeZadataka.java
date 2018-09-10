/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.sluzbenik;

import domen.GrupaZadatka;
import domen.Resenje;
import domen.Test;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;

import modeli.ModelTabeleResenjaZadataka;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author PC
 */
public class UnosGrupeZadataka extends javax.swing.JFrame {

    /**
     * Creates new form UnosGrupeZadataka
     */
    public UnosGrupeZadataka() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        setSize(x, y);
        srediKomboBox();
        srediTabelu();
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
        jLabel4 = new javax.swing.JLabel();
        cmbTest = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaZadataka = new javax.swing.JTable();
        btnResenja = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSifraGrupeZadataka = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resenja zadataka"));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Test:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 40, 80, 17);

        cmbTest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTestActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTest);
        cmbTest.setBounds(400, 30, 524, 30);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 100, 499, 331);

        btnResenja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnResenja.setForeground(new java.awt.Color(102, 102, 102));
        btnResenja.setText("Sacuvaj resenja");
        btnResenja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResenjaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResenja);
        btnResenja.setBounds(910, 453, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Mladenovic_Marija_42014\\MojaAplikacijaKlijentt\\src\\images\\s1.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 20, 1410, 640);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" "));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Sifra grupe zadataka:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(26, 30, 150, 17);
        jPanel2.add(txtSifraGrupeZadataka);
        txtSifraGrupeZadataka.setBounds(200, 30, 464, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Izadji");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(899, 30, 170, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Mladenovic_Marija_42014\\MojaAplikacijaKlijentt\\src\\images\\s1.jpg")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 1410, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResenjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResenjaActionPerformed
        ModelTabeleResenjaZadataka mtr = (ModelTabeleResenjaZadataka) tabelaZadataka.getModel();
        ArrayList<Resenje> listr = mtr.vraiResenja();
        for (Resenje resenje : listr) {
            if(resenje.getOdgovor()==' '){
                JOptionPane.showMessageDialog(this, "Unesite sve odgovore!");
                return;
            }
        }
        String brR = txtSifraGrupeZadataka.getText();
        String regex = "[1-9][0-9]*";
        if(!brR.matches(regex)){
            JOptionPane.showMessageDialog(this, "Unesite BROJ za polje sifra grupe zadataka!");
            txtSifraGrupeZadataka.setText("");
                return;
        }
        int sifraGZ = Integer.parseInt(brR);
        Test t = (Test) cmbTest.getSelectedItem();
        GrupaZadatka gz = new GrupaZadatka(sifraGZ, listr, t);
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.UNOS_GRUPE_ZADATAKA, gz);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        
        if(so.getOdgovor().equals("!")){
            JOptionPane.showMessageDialog(this,so.getPoruka());
               
        }else {
            JOptionPane.showMessageDialog(this,so.getPoruka());
             
        }
    }//GEN-LAST:event_btnResenjaActionPerformed

    private void cmbTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTestActionPerformed
        srediTabelu();
    }//GEN-LAST:event_cmbTestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FormaZaSluzbenika fzs = new FormaZaSluzbenika();
       fzs.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UnosGrupeZadataka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosGrupeZadataka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosGrupeZadataka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosGrupeZadataka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnosGrupeZadataka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResenja;
    private javax.swing.JComboBox cmbTest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaZadataka;
    private javax.swing.JTextField txtSifraGrupeZadataka;
    // End of variables declaration//GEN-END:variables

    private void srediKomboBox() {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.VRATI_TEST, null);
        
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        ArrayList<Test> listaT = (ArrayList<Test>) so.getOdgovor();
        cmbTest.removeAllItems();

        for (Test test : listaT) {
            cmbTest.addItem(test);
        }
    }

    private void srediTabelu() {
        ModelTabeleResenjaZadataka mtrs = new ModelTabeleResenjaZadataka();
        mtrs.setUfz(this);
        tabelaZadataka.setModel(mtrs);
        Test t = (Test) cmbTest.getSelectedItem();
        if(t!=null) {
        if (t.getTestID() == 1) {
            for (int i = 0; i < 20; i++) {
                mtrs.dodajResenje(i + 1, ' ');

            }
        } else {
            for (int i = 0; i < 30; i++) {
                mtrs.dodajResenje(i + 1, ' ');

            }
        }
        }
    }

    public void obavesti() {
      JOptionPane.showMessageDialog(this, "Mozete uneti A, B, C, D, E ili N");
      return;
    }

    public void obavestiLength() {
        JOptionPane.showMessageDialog(this, "Mozete uneti samo jednu vrednost!");
      return;
    }

}
