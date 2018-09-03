/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Resenje;
import domen.Zadatak;
import forme.komisija.FormaUnosKartona;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ModelTabeleZadataka extends AbstractTableModel{
    ArrayList<Zadatak> lz;
    FormaUnosKartona fuk;
    public ModelTabeleZadataka() {
        lz = new ArrayList<>();
    }

    public ModelTabeleZadataka( FormaUnosKartona fuk) {
        lz = new ArrayList<>();
        this.fuk = fuk;
    }

    
    
    
    @Override
    public int getRowCount() {
        return lz.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zadatak r = lz.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return r.getRbZadatka();
            case 1:
                return r.getOdgovor();
            default:
                return "";
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Redni broj zadatka";
            case 1:
                return "Odgovor";
            default:
                return "";
        }
    }

    public void dodajResenje(int redBr, char odg) {
        lz.add(new Zadatak(redBr, odg));
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Zadatak r = lz.get(rowIndex);
        switch (columnIndex) {
            case 0:
                String br = (String) aValue;
                int b = Integer.parseInt(br);
                r.setRbZadatka(b);
                break;
            case 1:
                String odg = (String) aValue;
                String o =odg.toUpperCase().trim();
                if(o.length()>1){
                     fuk.obavestiLength();
                }
                if(o.charAt(0)=='A' || o.charAt(0)=='B'  || o.charAt(0)=='C'  || o.charAt(0)=='D' || o.charAt(0)=='E' || o.charAt(0)=='N' ){
                    r.setOdgovor(o.charAt(0));
                    
                  } else {
                    fuk.obavesti();
                    return;
                }
                
                //System.out.println("Unesen je!");
                break;
        }

    }

    public ArrayList<Zadatak> vraiResenja() {
        return lz;
    }
    
}
