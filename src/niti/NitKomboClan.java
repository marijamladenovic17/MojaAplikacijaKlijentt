/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import forme.sluzbenik.FormaUnosKomisije;
import forme.sluzbenik.FormaZaUnosClanova;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class NitKomboClan extends Thread{
    FormaZaUnosClanova fzc ;
    public static boolean kraj=true;

    public NitKomboClan(FormaZaUnosClanova fzc) {
        this.fzc = fzc;
    }

    @Override
    public void run() {
        while (kraj) {            
            fzc.srediKombo();
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NitKomboClan.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
    }
 
    
    
    
}
