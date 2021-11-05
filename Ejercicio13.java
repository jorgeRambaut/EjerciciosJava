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
public class Ejercicio13 {
    
    static int pedirNumero(){
    int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Numero");
        numero=lector.nextInt();
    
    return numero;
    
    
    }
    
    static int exponente(int b , int e){
    int exponencial=b;
    
        for (int i = 1; i <e; i++) {
            
            exponencial*=b;
            
        }
    
    
    return exponencial;
    }
    
    public static void main(String[] args) {
        int b,e,exponencial;
        
        b=pedirNumero();
        e=pedirNumero();
        exponencial =exponente(b,e);
        System.out.println("Resultado "+exponencial);
    }
    
}
