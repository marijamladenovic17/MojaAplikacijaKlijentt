/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Stavka_Rang_Liste;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ModelTabeleRang extends AbstractTableModel{
    ArrayList<Stavka_Rang_Liste> stavke;

    public ModelTabeleRang() {
        stavke = new ArrayList<>();
    }

    public ArrayList<Stavka_Rang_Liste> getStavke() {
        return stavke;
    }

    public void setStavke(ArrayList<Stavka_Rang_Liste> stavke) {
        this.stavke = stavke;
    }
    
    
    

    @Override
    public int getRowCount() {
        return stavke.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Stavka_Rang_Liste srl = stavke.get(rowIndex);
        switch(columnIndex){
            case 0: return srl.getRedniBroj();
            case 1: return srl.getKandidat().getIme();
            case 2: return srl.getKandidat().getPrezime();
            case 3: return srl.getKandidat().getUkupanBrojPoena();
            default: return "betmen";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "rang";
            case 1: return "Ime";
            case 2: return "Prezime";
            case 3: return "Poeni";
            default: return "betmen";
        }
    }
    
    
    
    
}
