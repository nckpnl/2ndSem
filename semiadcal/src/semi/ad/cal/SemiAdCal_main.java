/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semi.ad.cal;

import javax.swing.JFrame;

/**
 *
 * @author Acer
 */
public class SemiAdCal_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        semiadcal cal = new semiadcal();
        cal.setVisible(true);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setResizable(false);
        
        quadratic qd = new quadratic();
        qd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        qd.setResizable(false);
        
        areacal ar = new areacal();
        ar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ar.setResizable(false);
        
        NewJFrame facto = new NewJFrame();
        facto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        facto.setResizable(false);
        
    }
    
}
