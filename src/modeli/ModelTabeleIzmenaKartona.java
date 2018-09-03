/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Zadatak;
import forme.komisija.FormaIzmenaKartona;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ModelTabeleIzmenaKartona extends AbstractTableModel{
    ArrayList<Zadatak> zadaci;
    FormaIzmenaKartona fik;

    public ModelTabeleIzmenaKartona() {
        zadaci = new ArrayList<>();
    }
    
    public ModelTabeleIzmenaKartona(FormaIzmenaKartona fik){
        
        zadaci = new ArrayList<>();
        this.fik = fik;
    }
    
    

    @Override
    public int getRowCount() {
        return zadaci.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zadatak z = zadaci.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return z.getRbZadatka();
            case 1:
                return z.getOdgovor();
            default:
                return "";
        }
    }
    
    
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

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
          if (columnIndex == 1) {
            return true;
        }
        return false;
    }

    public void setZadaci(ArrayList<Zadatak> zadaci) {
        this.zadaci = zadaci;
        fireTableDataChanged();
    }

    public ArrayList<Zadatak> getZadaci() {
        return zadaci;
    }
    
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Zadatak r = zadaci.get(rowIndex);
       r.setRbZadatka(rowIndex + 1);
                String odg = (String) aValue;
                String o =odg.toUpperCase().trim();
                if(o.length()>1){
                     fik.obavestiLength();
                }
                if(o.charAt(0)=='A' || o.charAt(0)=='B'  || o.charAt(0)=='C'  || o.charAt(0)=='D' || o.charAt(0)=='E' || o.charAt(0)=='N' ){
                    r.setOdgovor(o.charAt(0));
                    zadaci.set(rowIndex, r);
                    fireTableDataChanged();
                  } else {
                    fik.obavesti();
                    return;
                }
              
    }
    
    
    
     
     
    
}
