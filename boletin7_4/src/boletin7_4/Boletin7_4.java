/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float diferencia;
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso"));
        String nombre1 =JOptionPane.showInputDialog("Introduce el nombre");
        float num2 = Float.parseFloat (JOptionPane.showInputDialog ("Introduce el peso"));
        String nombre2 =JOptionPane.showInputDialog("Introduce el nombre");
        if (num1> num2){
        diferencia = num1 -num2;
        //JOptionPane.showMessageDialog(null, "Pesa mas "+nombre1 +" La diferencia de peso es "+diferencia);
        } else {
        diferencia = num1-num2;
        }JOptionPane.showMessageDialog(null, "Pesa mas "+nombre1 +" La diferencia de peso es "+diferencia);
    }
    
}
