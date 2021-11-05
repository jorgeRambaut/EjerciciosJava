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
public class Ejercicio7 {
    int año;
    
    static int pedirAño(){
    int año;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Año");
        año = lector.nextInt();
      
    return año;
    }
   static void evaluarBisiesto(int año){
   
   if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
	System.out.println("El año es bisiesto " + año);
else
	System.out.println("El año no es bisiesto " + año);
   } 
    
    public static void main(String[] args) {
        int año;
        Ejercicio7 ejercicio7 = new Ejercicio7();
        año= ejercicio7.año=pedirAño();
        
        evaluarBisiesto(año);
    }
 
    
}
