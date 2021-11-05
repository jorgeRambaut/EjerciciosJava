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
public class Ejercicio6 {
    int numero;
    
    static int pedirNumero(){
    int numero;
    
        System.out.println("Ingresar Numero");
        Scanner lector = new Scanner(System.in);        
        numero=lector.nextInt();
    
    
    return numero;
    }
   static void evaluar(int numero){
   
       if (numero %2 ==0) {
           
           System.out.println("Es Par " + numero);
           
       } else {
           
           System.out.println("Es Impar " + numero);
       }
   
   
   } 
    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        int numero;
        numero = ejercicio6.numero=pedirNumero();
        evaluar(numero);
        
    }
}
