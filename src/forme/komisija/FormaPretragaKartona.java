/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.komisija;

import domen.Kandidat;
import domen.Karton;
import domen.Zadatak;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;

import modeli.ModelTabelePretragaKartona;
import pomoc.Boja;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author PC
 */
public class FormaPretragaKartona extends javax.swing.JFrame {

    Karton karton;
    int[] redniBrojevi;

    /**
     * Creates new form FormaPretragaKartona
     */
    public FormaPretragaKartona() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = tk.getScreenSize().width;
        int y = tk.getScreenSize().height;
        setSize(x, y);
        panelZaNestajanje.setVisible(false);
        panelZaNestajanje2.setVisible(false);
        btnUnosCentralneKomisije.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlavni = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKartonskiBroj = new javax.swing.JTextField();
        btnNadjiKarton = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();
        panelZaNestajanje = new javax.swing.JPanel();
        lblIme = new javax.swing.JLabel();
        lblPrezime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSifraPrijave = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblGrupaZadataka = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaZadataka = new javax.swing.JTable();
        lblTest = new javax.swing.JLabel();
        panelZaNestajanje2 = new javax.swing.JPanel();
        lblIme2 = new javax.swing.JLabel();
        lblPrezime2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSifraPrijave2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGrupaZadataka2 = new javax.swing.JLabel();
        lblTest2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaZadataka2 = new javax.swing.JTable();
        btnUnosCentralneKomisije = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGlavni.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Molimo unesite kartonski broj:");

        btnNadjiKarton.setText("Nadji karton");
        btnNadjiKarton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNadjiKartonActionPerformed(evt);
            }
        });

        btnNazad.setText("Nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        jLabel2.setText("Sifra prijave:");

        lblSifraPrijave.setText("jLabel3");

        jLabel3.setText("Grupa zadataka:");

        lblGrupaZadataka.setText("jLabel4");

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

        lblTest.setText("jLabel4");

        javax.swing.GroupLayout panelZaNestajanjeLayout = new javax.swing.GroupLayout(panelZaNestajanje);
        panelZaNestajanje.setLayout(panelZaNestajanjeLayout);
        panelZaNestajanjeLayout.setHorizontalGroup(
            panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblGrupaZadataka)
                        .addGap(36, 36, 36)
                        .addComponent(lblTest))
                    .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(lblSifraPrijave))
                    .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                        .addComponent(lblIme)
                        .addGap(28, 28, 28)
                        .addComponent(lblPrezime))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelZaNestajanjeLayout.setVerticalGroup(
            panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme)
                    .addComponent(lblPrezime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSifraPrijave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblGrupaZadataka)
                    .addComponent(lblTest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jLabel4.setText("Sifra prijave:");

        lblSifraPrijave2.setText("jLabel5");

        jLabel5.setText("Grupa zadataka:");

        lblGrupaZadataka2.setText("jLabel6");

        lblTest2.setText("jLabel6");

        tabelaZadataka2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaZadataka2);

        javax.swing.GroupLayout panelZaNestajanje2Layout = new javax.swing.GroupLayout(panelZaNestajanje2);
        panelZaNestajanje2.setLayout(panelZaNestajanje2Layout);
        panelZaNestajanje2Layout.setHorizontalGroup(
            panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZaNestajanje2Layout.createSequentialGroup()
                .addGroup(panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelZaNestajanje2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelZaNestajanje2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblGrupaZadataka2)
                                .addGap(18, 18, 18)
                                .addComponent(lblTest2))
                            .addGroup(panelZaNestajanje2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lblIme2)
                                .addGap(28, 28, 28)
                                .addGroup(panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrezime2)
                                    .addComponent(lblSifraPrijave2)))
                            .addComponent(jLabel4)))
                    .addGroup(panelZaNestajanje2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelZaNestajanje2Layout.setVerticalGroup(
            panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZaNestajanje2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme2)
                    .addComponent(lblPrezime2))
                .addGap(28, 28, 28)
                .addGroup(panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSifraPrijave2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelZaNestajanje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblGrupaZadataka2)
                    .addComponent(lblTest2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        btnUnosCentralneKomisije.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUnosCentralneKomisije.setText("Unesi ispravan karton");
        btnUnosCentralneKomisije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosCentralneKomisijeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlavniLayout = new javax.swing.GroupLayout(panelGlavni);
        panelGlavni.setLayout(panelGlavniLayout);
        panelGlavniLayout.setHorizontalGroup(
            panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlavniLayout.createSequentialGroup()
                .addGroup(panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlavniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelZaNestajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnUnosCentralneKomisije)
                        .addGap(18, 18, 18)
                        .addComponent(panelZaNestajanje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlavniLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtKartonskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnNadjiKarton)
                        .addGap(51, 51, 51)
                        .addComponent(btnNazad)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGlavniLayout.setVerticalGroup(
            panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlavniLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKartonskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNadjiKarton)
                    .addComponent(btnNazad))
                .addGroup(panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlavniLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelZaNestajanje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelZaNestajanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(panelGlavniLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnUnosCentralneKomisije, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        // TODO add your handling code here:
        FormaZaKomisiju fzk = new FormaZaKomisiju();
        fzk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNazadActionPerformed

    private void btnNadjiKartonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNadjiKartonActionPerformed
        // TODO add your handling code here:
        String kb = txtKartonskiBroj.getText();
        int kartonskiBroj = Integer.parseInt(kb);
//       
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setParametar(kartonskiBroj);
        kz.setOperacija(Operacije.VRATI_KARTONE_PROVERA);

        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);

        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        ArrayList<Karton> kartoni = (ArrayList<Karton>) so.getOdgovor();

        if (kartoni != null) {
            btnUnosCentralneKomisije.setVisible(true);
            karton = kartoni.get(0);
            ArrayList<Zadatak> zadaciKartona = karton.getListaOdg();
            Karton karton2 = kartoni.get(1);
            ArrayList<Zadatak> zadaciKartona2 = karton2.getListaOdg();
            int brojOdgovora = zadaciKartona.size();
            int brojNeispravnih = 0;
            for (int m = 0; m < brojOdgovora; m++) {
                if (zadaciKartona.get(m).getOdgovor() != zadaciKartona2.get(m).getOdgovor()) {
                    brojNeispravnih++;
                }
            }
            
            if(brojNeispravnih ==0){
                btnUnosCentralneKomisije.setEnabled(false);
            }
            redniBrojevi = new int[brojNeispravnih];
            int i = 0;
            for (int m = 0; m < brojOdgovora; m++) {
                if (zadaciKartona.get(m).getOdgovor() != zadaciKartona2.get(m).getOdgovor()) {
                    redniBrojevi[i] = zadaciKartona.get(m).getRbZadatka() - 1;
                    i++;
                }
            }

            Kandidat kand = karton.getKandidat();
            if (kand == null) {
                lblSifraPrijave.setText("Karton jos uvek nije spojen sa kandidatom!");
            } else {
                lblIme.setText(kand.getIme());
                lblPrezime.setText(kand.getPrezime());
                lblSifraPrijave.setText(kand.getSifraPrijave());
            }
            panelZaNestajanje.setVisible(true);
            lblGrupaZadataka.setText(karton.getGrupaZadataka().getBrGrupe() + "");
            lblTest.setText(karton.getGrupaZadataka().getTest().getNazivTesta());

            ModelTabelePretragaKartona mtr = new ModelTabelePretragaKartona();
            mtr.setZadaci(zadaciKartona);
            tabelaZadataka.setModel(mtr);
            TableColumn col = tabelaZadataka.getColumnModel().getColumn(1);
            col.setCellRenderer(new Boja(redniBrojevi));

            Kandidat kand2 = karton.getKandidat();
            if (kand2 == null) {
                lblSifraPrijave2.setText("Karton jos uvek nije spojen sa kandidatom!");
            } else {
                lblIme2.setText(kand2.getIme());
                lblPrezime2.setText(kand2.getPrezime());
                lblSifraPrijave2.setText(kand2.getSifraPrijave());
            }

            panelZaNestajanje2.setVisible(true);
            lblGrupaZadataka2.setText(karton2.getGrupaZadataka().getBrGrupe() + "");
            lblTest2.setText(karton2.getGrupaZadataka().getTest().getNazivTesta());

            ModelTabelePretragaKartona mtr2 = new ModelTabelePretragaKartona();
            mtr2.setZadaci(zadaciKartona2);
            tabelaZadataka2.setModel(mtr2);
            TableColumn col2 = tabelaZadataka2.getColumnModel().getColumn(1);
            col2.setCellRenderer(new Boja(redniBrojevi));
        } else {
            JOptionPane.showMessageDialog(this, "Kartoni sa takvim kratonskim brojevima ne postoje u bazi!");
            return;
        }


    }//GEN-LAST:event_btnNadjiKartonActionPerformed

    private void btnUnosCentralneKomisijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosCentralneKomisijeActionPerformed
        // TODO add your handling code here:
        FormaCentralnaKomisija fck = new FormaCentralnaKomisija();
        fck.setKarton(karton);
        fck.setRedniBrojevi(redniBrojevi);
        fck.srediSve();
        this.setVisible(false);
        fck.setVisible(true);
    }//GEN-LAST:event_btnUnosCentralneKomisijeActionPerformed

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
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaPretragaKartona().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNadjiKarton;
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnUnosCentralneKomisije;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGrupaZadataka;
    private javax.swing.JLabel lblGrupaZadataka2;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblIme2;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JLabel lblPrezime2;
    private javax.swing.JLabel lblSifraPrijave;
    private javax.swing.JLabel lblSifraPrijave2;
    private javax.swing.JLabel lblTest;
    private javax.swing.JLabel lblTest2;
    private javax.swing.JPanel panelGlavni;
    private javax.swing.JPanel panelZaNestajanje;
    private javax.swing.JPanel panelZaNestajanje2;
    private javax.swing.JTable tabelaZadataka;
    private javax.swing.JTable tabelaZadataka2;
    private javax.swing.JTextField txtKartonskiBroj;
    // End of variables declaration//GEN-END:variables
}
