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
public class Ejercicio15 {
    //representar el algoritmo que nos calcule la suma de los N primeros números naturales. 
    //N se leerá por teclado. 
    //Ejemplo, si ingresamos 4, hacer: 1+2+3+4 = 10. 

static int pedirNumero(){
int numero;
    Scanner lector = new Scanner(System.in);  
    System.out.println("Ingresar Numero");
    numero = lector.nextInt();
return numero;
}

static int sumaNaturales(int numero){
int suma=0;

    for (int i = 1; i <= numero; i++) {
        
      suma+=i;  
    }

return suma;
}
    public static void main(String[] args) {
        int numero;
        int suma;        
        numero=pedirNumero();
        suma=sumaNaturales(numero);        
        System.out.println("Suma " + suma);
        
        
    }
}
