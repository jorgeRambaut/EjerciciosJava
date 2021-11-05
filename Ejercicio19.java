/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosIntegradoresr;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio19 {
    
    static int pedirLado(){
    int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Tamaño Lado");
        numero=lector.nextInt();    
    return numero ; 
    }
      
    
    static void dibujar(int lado){        
        
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
         System.out.println();
        
        for (int i = 0; i < lado-2; i++) {
            for (int j = 0; j < lado-2; j++) {
               System.out.print("*"); 
            }   
            System.out.println();
        }       
        
         for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        
        
        }        
   
    
    
    public static void main(String[] args) {
        int lado;
           
        lado = pedirLado();
        dibujar(lado);
        
        
    }
  
}
