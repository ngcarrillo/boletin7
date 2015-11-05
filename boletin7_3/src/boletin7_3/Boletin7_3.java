/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = Integer.parseInt (JOptionPane.showInputDialog("Introduce un numero"));
        if (num1 > 0) {
        JOptionPane.showMessageDialog (null, "+");
        
        }else if (num1 == 0){
            JOptionPane.showMessageDialog (null, "0");
        } else {
             JOptionPane.showMessageDialog (null, "-");
            }
    }
    
}
