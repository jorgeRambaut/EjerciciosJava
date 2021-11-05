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
public class Ejercicio26 {
    static String usuario = "admin";
    static String clave = "1234";
    
  static void validarUsuario(){
  String usuario,clave;
  Scanner lector = new Scanner(System.in);
      System.out.println("Ingresar Usuario");
      usuario=lector.next();      
      System.out.println("Ingresar Clave");
      clave = lector.next();  
      while (!usuario.equals(Ejercicio26.usuario)&& !clave.equals(Ejercicio26.clave)) {
            System.out.println("Ingresar Usuario");
            usuario=lector.next();      
            System.out.println("Ingresar Clave");
            clave = lector.next(); 
      }
  
  
  
  }  
    
    public static void main(String[] args) {
        validarUsuario();
    }
 
    
}
