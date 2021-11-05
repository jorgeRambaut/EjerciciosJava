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
public class Ejercicio28 {
    
    static int  validarNumero(int numero ){
        
        while (numero ==0) {
            Scanner lector = new Scanner(System.in);
            System.out.println("ingresar numero mayor a 0 ");
            numero = lector.nextInt();           
            
        }
    
    return numero;
    
    
    }
    
    static double division(int a , int b){
    double division;
    
    division = a/b;
    
    return division; 
    
    }
    
    static int pedirNumero(){
    int numero;
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Numero ");
    numero = lector.nextInt();
    return numero;
    }
    
    public static void main(String[] args) {
        int a,b;
        double resultado;
       a=pedirNumero();
       b = pedirNumero();
       b = validarNumero(b);
       resultado = division(a,b);
        System.out.println("Resultado de a ="+a + 
                "/b="+ b+"= "+resultado);
              
    }
}
