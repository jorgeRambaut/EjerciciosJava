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
public class Ejercicio27 {
    
 static int pedirDato(){
    int dato=0;
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Dato");      
        dato = lector.nextInt();
    return dato;
    }
  static int  suma(int a , int b ){
      int suma = 0;        
      suma = a + b; 
      
      return suma;  
  } 
   
  static void validar(int a , int b){
   int suma = 0;
      while (a !=0 && b !=0) {
          
          a = pedirDato();
          b = pedirDato();
          suma +=suma(a,b);        
          
      }
         System.out.println("Suma es " + suma);        
  
  }
  
    public static void main(String[] args) {
        int a,b;        
        a = pedirDato();
        b = pedirDato();
        validar(a,b);
        
    }
}
