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
public class Ejercicio3 {
    
    int numero1,numero2,numero3;
    
    static int pedirNumero() {

        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar Numero ");
        numero = scanner.nextInt();

        return numero;
    }
    
    static void evaluar(int a, int b, int c ){
    
        if (a>b && a >c) {
            System.out.println("el Mayor es " + a );  
        } else if (b>c) {
            System.out.println("el mayor es " + b);            
        }
        else {            
            System.out.println("el mayor es " + c );        
        }
    
    
    
}
    public static void main(String[] args) {
        int a,b,c;
        Ejercicio3 ejercicio3 = new Ejercicio3();
        a = ejercicio3.numero1=pedirNumero();
        b = ejercicio3.numero2=pedirNumero();
        c = ejercicio3.numero3=pedirNumero();
        
        evaluar(a,b,c);
        
        
        
    }
    
    
    
    
    
}