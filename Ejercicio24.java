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
public class Ejercicio24 {
    
    static int pedirDato(){
    int dato;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Dato");
        dato = lector.nextInt();
        
     return dato ;  
    }
    
    static void pedirDatoConPregunta(){
    int dato = pedirDato();
    int cantidadPares =0;
    String respuesta="";
    Scanner lector = new Scanner(System.in);
    System.out.println("¿Desea ingresar otro número? [S/N]");    
    respuesta = lector.next();
    
        while (!respuesta.equalsIgnoreCase("N")) {
           dato = pedirDato();
                        
            if (dato%2==0) {
                cantidadPares++;
            }
           System.out.println("¿Desea ingresar otro número? [S/N]");
            respuesta = lector.next();        
        }
        System.out.println("Cantidad Pares Ingresados " +cantidadPares);
    
    
    
    
    }
    
    public static void main(String[] args) {
        pedirDatoConPregunta();
        
    }
}
