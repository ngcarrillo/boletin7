/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero"));
        float num2 = Float.parseFloat (JOptionPane.showInputDialog("Introduce un numero"));
        float num3 = Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero"));
        Comparar comparar1 = new Comparar(num1,num2,num3);
        
        JOptionPane.showMessageDialog(null,"El numero mayor es "+comparar1.mayor());
       
    }

   
    
}
