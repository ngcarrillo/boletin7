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
public class VendasAnuais {
    private float ventas;
    private String a = "baixo";
    private String b = "medio";
    private String c = "alto";
    private String d = "primeira necesitade";
    
    public VendasAnuais (float ventas){
    this.ventas = ventas;
    }
    public String comparar(){
    if (ventas <= 100){
        return a;
    } else if (ventas > 100 && ventas >= 500){
        return b;
        
    } else if (ventas > 500 && ventas <=1000){
        return c;
    
    }else {
        return d;
    }
   
}}
    
