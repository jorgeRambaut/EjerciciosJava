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
public class Ejercicio20 {
    
    static int pedirLado(){
    int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Tamaño Lado");
        numero=lector.nextInt();    
    return numero ; 
    }
    
    static void dibujar(int altura){        
        
        for (int numeroasteriscos=altura;numeroasteriscos>0;numeroasteriscos--){
                        //Este bucle pinta los asteriscos en cada fila
            for(int i=numeroasteriscos;i>0;i--){
                System.out.print("*");
            }
                        //Saltamos de linea
            System.out.println("");
        }
        }        
   
    
    
    public static void main(String[] args) {
        int lado;
           
        lado = pedirLado();
        dibujar(lado);
        
        
    }
    
    
    
}
