/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_7;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin7_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    JOptionPane.showMessageDialog(null,"Marca 1 para cuadrado, 2 para triangulo y 3 para circulo");
    int opcion = Integer.parseInt (JOptionPane.showInputDialog ("Introduce tu opcion"));
    
    Figura Figura1 = new Figura();
    
    switch (opcion){
        case 1:
           float lado= Float.parseFloat (JOptionPane.showInputDialog("Introduce o lado"));
           JOptionPane.showMessageDialog(null, "A area e "+Figura1.cadrado(lado));
           break;
        case 2:
            float base= Float.parseFloat (JOptionPane.showInputDialog("Introduce a base"));
            float altura= Float.parseFloat (JOptionPane.showInputDialog("Introduce a altura"));
           JOptionPane.showMessageDialog(null, "A area e "+Figura1.triangulo(base, altura));
            break;
        case 3:
           float radio= Float.parseFloat (JOptionPane.showInputDialog("Introduce o radio"));
           JOptionPane.showMessageDialog(null, "A area e "+Figura1.circulo(radio));
           break;
    }
    
    
    }
    
}
