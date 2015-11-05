package boletin7_5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngarciacarrillo
 */
public class Comparar {
    private float num1;
    private float num2;
    private float num3;
    
    public Comparar (float num1,float num2,float num3){
      this.num1 = num1;
      this.num2 = num2;
      this.num3 = num3;
        
    }
    
    public float mayor (){
    if (num1>num2 && num1> num3){
     return num1;
    }else if (num2 > num1 && num2 > num3){
        return num2;
    }else {
        return num3;  
    }
    }
}