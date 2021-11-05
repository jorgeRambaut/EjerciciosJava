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
public class Ejercicio30 {
    static double practica=0.10;    
    static double teoria = 0.40;
    static double problemas = 0.50;
    
 static double calcularNota(int nota1,int nota2,int nota3){
 double nota =0; 
 
 nota = (nota1  + nota2  + nota3)/3;
 
 return nota;
 }   
static int pedirNota(){
int nota=0;
Scanner lector = new Scanner(System.in);
    System.out.println("Ingresar nota");
nota = lector.nextInt();
return nota;
}   
static int validarNota(int nota){
Scanner lector = new Scanner(System.in);
    while (nota <0 || nota>11) {
        
        System.out.println("ingresar nota valida");
        nota = lector.nextInt();
        
    }
    
    
return nota;
}

    public static void main(String[] args) {
        String nombre ="";
        int nota1,nota2,nota3;
        double notaFinal;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar nombre");
        nombre = lector.next();
        
        while (!nombre.equalsIgnoreCase("")) {
            
            nota1=pedirNota();
            nota1 = validarNota(nota1);
            nota2=pedirNota();
            nota2 = validarNota(nota2);
            nota3=pedirNota();
            nota3 = validarNota(nota3);
            notaFinal=calcularNota(nota1,nota2,nota3);
            System.out.println("Alumno " + nombre +
            " Tiene una nota de " + notaFinal);           
            System.out.println("Ingresar nombre");
            nombre = lector.next();
        }
        
        
        
    }

}
