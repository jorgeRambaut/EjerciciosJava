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
public class Ejercicio25 {
    static String clave = "1234";
    
    static void pedirClave(){
    String clave;
        Scanner lector = new Scanner(System.in);
        System.out.println("ingresar clave");
     clave = lector.next();
     
        while (!clave.equals(Ejercicio25.clave)) {
            System.out.println("Clave incorrecta ");
            System.out.println("ingresar clave");
            clave = lector.next();            
            
        }
    
    }
    
    public static void main(String[] args) {
        pedirClave();
    }
    
    
}
