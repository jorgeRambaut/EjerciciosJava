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
public class Ejercicio23 {
    static int numero=0;    
    static int menor,mayor,promedio;
    static  int contador=0;
 static int pedirNumero(){
 int numero=0;
     Scanner lector = new Scanner(System.in);
     System.out.println("Ingresar Numero");
     numero=lector.nextInt();
     return numero;
 }   
    
 static void pedirNumeroHastaCero(int numero){
 Scanner lector = new Scanner(System.in); 
 menor=numero;
     while (numero !=0) {         
         
         if (numero >mayor) {
             mayor = numero;
         } 
         if (numero<=menor){
         menor = numero;         
         }
         contador++;
         promedio+=numero;
         System.out.println("ingresar numero");
         numero=lector.nextInt();
                  
     }
     
     promedio = promedio/contador;
 
     System.out.println("Mayor " + mayor);
     System.out.println("Menor " + menor);
     System.out.println("Promedio " + promedio);
 }   
    
    
    public static void main(String[] args) {
        int numero = pedirNumero();
        pedirNumeroHastaCero(numero);
    }
 
    
    
    
}
