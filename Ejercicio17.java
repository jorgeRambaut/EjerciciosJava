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
public class Ejercicio17 {
    
    static int pedirNumero(){
    int numero=0;
        System.out.println("ingresar tope");
    Scanner lector = new Scanner(System.in);
    numero=lector.nextInt();
     
    return numero;
    }
    static void pedirNumeros(int numero){
    int numeros=0;
    int mayor=0;
    int posicion=0;
    Scanner lector = new Scanner(System.in);
     
        for (int i = 1; i <=  numero; i++) {
            System.out.println("ingresar numero");
            numeros=lector.nextInt();
            
            if (numeros>mayor) {                
                mayor=numeros;  
                posicion = i;                
            }
            
       }    
   
     System.out.print("Mayor es " + mayor);
     System.out.print(" En Posicion " + posicion);
    //return mayor;
    } 
    public static void main(String[] args) {
        int tope;
        tope=pedirNumero();
        pedirNumeros(tope);     
        
    }
}
