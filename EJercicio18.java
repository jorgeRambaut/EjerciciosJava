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
public class EJercicio18 {
    
    static int pedirNumero(){
    int numero;
    Scanner lector = new Scanner(System.in);
    System.out.println("ingresar numero");
    numero=lector.nextInt();    
    return numero;
    }
    
    static int factorial(int numero){
    int factoriado=numero;
        for (int i = 0; i < numero; i++) {
           factoriado*= --numero;
        }
    
    return factoriado;
    }
    
    public static void main(String[] args) {
        int numero;
        int factorial;
        numero = pedirNumero();
        factorial = factorial(numero);
        System.out.println("Factorial " + factorial);
        
    }
}
