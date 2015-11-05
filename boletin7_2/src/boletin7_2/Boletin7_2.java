/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short num1 = Short.parseShort (JOptionPane.showInputDialog("Introduce un numero"));
        short num2 = Short.parseShort (JOptionPane.showInputDialog("Introduce otro numero"));
        short resultado;
        if (num1 >= num2){
        resultado =(short) (num1-num2) ; 
        } else {
        resultado = (short) (num1 + num2);
        } JOptionPane.showMessageDialog (null, " El resultado es "+resultado);
    }
    
}
