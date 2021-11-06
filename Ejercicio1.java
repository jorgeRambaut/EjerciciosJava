/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosarrays2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio1 {
     public static void main(String[] args) {
      int[] vector = new int[5];
        
     Scanner lector = new Scanner(System.in);
        
        
        for (int i = 0; i <5; i++) {
            System.out.println("Ingrear Numero");
            vector[i]=lector.nextInt();
            
        }
        
        System.out.println(Arrays.toString(vector));
    }
    
}
