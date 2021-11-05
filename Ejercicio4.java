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
public class Ejercicio4 {
    
    int numero;
   
    
    static int leerNumero(){
     int numero;
        System.out.println("Ingresar Numero ");
        Scanner lector = new Scanner(System.in);   
        numero = lector.nextInt();       
     return numero ;

}
    static void evaluar(int numero){
       
        double raiz,cuadrado;
    
        if (numero <0 || numero == 0) {
            
            System.out.println("Error xfbe23455");
            
         System.exit(1);
         
         
        } 
        
        else {
            cuadrado = Math.pow(numero, 2); 
            raiz =    Math.sqrt(numero);
        System.out.println("Del número " + numero+" , "
                + "su potencia es " + cuadrado +" y su raíz "+ raiz);
            
        }
    
    
    
    }
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 =new Ejercicio4();
        int numero;
        
        numero = ejercicio4.numero=leerNumero();
        evaluar(numero);
        
        
    }
}
