/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pomoc;

import domen.Zadatak;
import java.awt.Color;
import java.awt.Component;
import java.util.logging.Logger;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author PC
 */
public class Boja extends DefaultTableCellRenderer{
    
    int[] redovi;

    public Boja(int[] redovi) {
        this.redovi = redovi;
    }
    
    
    

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean uNizuJe = false;
        for (int i = 0; i < redovi.length; i++) {
            if(row==redovi[i]){
                uNizuJe = true;
                break;
            }
        }
        
        if(uNizuJe){
            c.setBackground(Color.red);
            c.setForeground(Color.black);
        }else{
            c.setBackground(Color.white);
            c.setForeground(Color.black);
        }
        return c;
    }
    
}
