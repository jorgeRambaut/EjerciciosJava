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
public class Ejercicio8 {
    int nota;
    
    static int pedirNota(){
    int nota;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Nota");
    nota = lector.nextInt();
    
    return nota ;
    }
  static int validar (int nota){
  int notaValidada ;
  notaValidada = nota;
      Scanner lector = new Scanner(System.in);
      while (notaValidada <0 || notaValidada >10) {          
          System.out.println("Ingresar Nota Valida");
          notaValidada=lector.nextInt();          
      }
   
  
  return notaValidada;
  }
  
  static void categorizarNota(int nota){
  
      switch(nota){
          case 10:
          case 9:
              System.out.println("Ha obtenido una calificación sobresaliente ");
              break;
      
          case 8:
          case 7:
              System.out.println("Ha obtenido una calificación notable ");
              break;
          case 6:
          case 5:
          case 4:
              System.out.println("Ha obtenido un aprobado ");
              break;
          case 3:
          case 2:
          case 1:
              System.out.println("Ha desaprobado ");
              break;
            
      }
  
  }
  
    public static void main(String[] args) {
        int nota;
        Ejercicio8 ejercicio8 = new Ejercicio8();        
        nota = ejercicio8.nota=pedirNota();
        nota=validar(nota);
        categorizarNota(nota);
        
    }
}
