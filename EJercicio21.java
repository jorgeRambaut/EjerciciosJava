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
public class EJercicio21 {
    //opcional 
    static int pedirNumero(){
    int numero=0;
    Scanner lector = new Scanner(System.in);    
    numero=lector.nextInt();
    return numero;
    }
    static double validar (double numero){
        double numeroValidado=numero;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("ingresar numero");
            numeroValidado=lector.nextInt();  
        } while (numeroValidado <0);      
        
       
    return numeroValidado;
    }
    
    static double raiz(double numero){
    double raiz=0;
    raiz = Math.sqrt(numero);
    
    return raiz;
    }
    public static void main(String[] args) {
        double numero=0;
        numero=validar(numero);        
        System.out.println("la raiz de " + numero);
        System.out.println("es " + String.format("%.2f",raiz(numero)));
        
    }
}
