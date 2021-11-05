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
public class Ejercicio12 {
    
    static int pedirNumero(){
    int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Numero"); 
        numero = lector.nextInt();       
        
     return numero;      
    }
  
    static int suma(int a,int b,int c,int d,int e ){
    int total;
    total =a+b+c+d+e;
    return total;
    }
    
    
    public static void main(String[] args) {
        int a,b,c,d,e,suma;
        a=pedirNumero();
        b=pedirNumero();
        c=pedirNumero();
        d=pedirNumero();
        e=pedirNumero();
        suma=suma(a,b,c,d,e);
        System.out.println("La suma es "+suma);
        
    }
 
    
}
