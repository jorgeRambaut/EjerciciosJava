/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosarrays2;

import java.util.Arrays;

/**
 *
 * @author jorge
 */
public class Ejercicio2 {
    
     public static void main(String[] args) {        
         double[] vector = {1,2,3,4};
         double [] vectorResultado = new double[vector.length];
        
         for (int i = 0; i < vector.length; i++) {
             vectorResultado[i] = vector[i]/2;
             
         }
         System.out.println(Arrays.toString(vectorResultado));   
    }
    
}
