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
public class Ejercicio10 {
    
    static void  menu(){     
        System.out.println("Menú de recomendaciones");
        System.out.println("1. Literatura");
        System.out.println("2. Cine");
        System.out.println("3. Música ");
        System.out.println("4. Videojuegos ");
        System.out.println("5. Salir ");
    }
    public static void limpiarPantalla(){
    
   try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
       
    }
    static int obtenerSeleccion(){
    int opcion;
    Scanner lector=new Scanner(System.in);
    opcion=lector.nextInt();
    return opcion;
    
    }
    
    
     static void  literatura(){
        System.out.println("+ Esperándolo a Tito y otros cuentos de fútbol (Eduardo Sacheri)");
        System.out.println("+ El juego de Ender (Orson Scott Card)");
        System.out.println("+ El sueño de los héroes (Adolfo Bioy Casares)");
        
    }
      static void  peliculas(){
        System.out.println("+ Matrix (1999)");
        System.out.println("+ El último samurai (2003)");
        System.out.println("+ Cars (2006)");
        
    }
      
        static void  discos(){
        System.out.println("+ Despedazado por mil partes (La Renga, 1996)");
        System.out.println("+ Bufalo (La Mississippi, 2008)");
        System.out.println("+ Gaia (Mägo de Oz, 2003)");
        
    }  
        
        static void  videojuegos(){
        System.out.println("+ Día del tentáculo (LucasArts, 1993)");
        System.out.println("+ Terminal Velocity (Terminal Reality/3D Realms, 1995)");
        System.out.println("+ Death Rally (Remedy/Apogee, 1996)");    
        
    } 
        
      static void  salida(){
        System.out.println("Adios");
        
    }  
      
static int validar(int opcion){
int opcionvalidada = opcion;

    while (opcionvalidada <0 || opcionvalidada >5) {        
        limpiarPantalla();
        System.out.println("Opcion no valida");       
        menu();        
        Scanner lector = new Scanner(System.in);
        opcionvalidada = lector.nextInt();
    }


return opcionvalidada;
}
        
  static void recomendaciones(int opcion){
  
      switch (opcion){
          case 1:
              limpiarPantalla();
              literatura();
              break;
          case 2:
              limpiarPantalla();
              peliculas();
              break;
          case 3:
              limpiarPantalla();
              discos();
              break;
          case 4:
              limpiarPantalla();
              videojuegos();
              break;
          case 5:
              limpiarPantalla();
              salida();
              break;
              
      }
  
  
  }
  
 
    public static void main(String[] args) {
        int opcion ;
        //Ejercicio10 ejercicio10 = new Ejercicio10();
        menu();
        opcion=obtenerSeleccion();
        opcion = validar(opcion);
        recomendaciones(opcion);
    }
  
}
