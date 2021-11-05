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
public class Ejercicio2 {
    int numero;
    static int pedirNumero() {

        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar Numero ");
        numero = scanner.nextInt();

        return numero;
    }
    
    static void evaluar(int numero){
    
        if (numero>0) {
            System.out.println("positivo");  
        } else if (numero <0) {
            System.out.println("Negativo");
            
        }
        else {
            
            System.out.println(" es Cero");
        
        }
    
    
    
    }
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int numero;
        
        numero =ejercicio2.numero=pedirNumero();
        
        evaluar(numero);
        
        
    }
}
