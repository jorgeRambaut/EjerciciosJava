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
public class Ejercicio14 {
    
    static int pedirNumero(){
    int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Tamaño");
        numero=lector.nextInt();    
    return numero ;   
          
            
    }
    static String pedirSimbolo(){
    String simbolo;
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Simbolo");
        simbolo=lector.next(); 
        
    return simbolo;
    
    
    }
    
    static void dibujar(int numero, String simbolo){        
    
        for (int i = 0; i < numero; i++) {            
            for (int j = 0; j < numero; j++) {
                System.out.print(simbolo); 
            }
 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numero;
        String simbolo;
        
        numero = pedirNumero();
        simbolo = pedirSimbolo();
        dibujar(numero,simbolo);
        
        
    }
  
}
