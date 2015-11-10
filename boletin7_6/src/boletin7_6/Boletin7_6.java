/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_6;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float ventas = Float.parseFloat (JOptionPane.showInputDialog("Introduce el numero de ventas"));
        VendasAnuais VendasAnuais1 = new VendasAnuais(ventas);
        JOptionPane.showMessageDialog (null, "O artigo é de clase "+VendasAnuais1.comparar());
    }
    
}
