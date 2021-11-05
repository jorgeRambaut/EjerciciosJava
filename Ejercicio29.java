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
public class Ejercicio29 {
    
    int dia,mes,año;
    static Scanner lector = new Scanner(System.in);
    static int pedirdato(){
    int dato = 0;
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingresar Dato");
    dato = lector.nextInt();    
    
       return dato;
       
    }
    
  static int validarAño(int año){
  Scanner lector = new Scanner(System.in);
  
      while (año <0) {
          System.out.println("ingresar año valida");
          año = lector.nextInt();          
      }
  
  return año;
  }  
  
  static int validarDia(int dia){
  
  while (dia <= 0 || dia>31) {
          System.out.println("ingresar dato valido");
          dia = lector.nextInt();          
      }
  
  return dia;
  }
  
  static int validarMes(int mes){
  
  
  while (mes <0 || mes>12) {
          System.out.println("ingresar dato valido");
          mes = lector.nextInt();          
      }  
  
  return mes;
  }
  
  static String convertirMes(int mes){
  String fecha="";
    switch (mes)
            {
            case 1:
                fecha ="enero";
                break;
            case 2 :
                 fecha ="febrero";
                break;
            case 3 : 
                 fecha ="marzo";
                break;
            case 4:
                 fecha ="abril";
                break;
            case 5 :
                 fecha ="mayo";
                break;
            case 6 : 
                 fecha ="junio";
                break;                
            case 7:
                 fecha ="julio";
                break;
            case 8 :
                 fecha ="agosto";
                break;
            case 9: 
                 fecha ="septiembre";
                break;
            case 10:
                 fecha ="octubre";
                break;
            case 11:
                 fecha ="noviembre";
                break;
            case 12 : 
                 fecha ="diciembre";
                break;    
    }
  
    
   return fecha;  
  }  
  static void imprimirFecha(int dia,String mes,int año){
  
      System.out.println(dia + " de "+ mes +" de " + año );
  
  }
    public static void main(String[] args) {
        int dia,mes,año;
        String fecha;
        dia = pedirdato();
        dia = validarDia(dia);
        mes = pedirdato(); 
        mes = validarMes(mes);
        año = pedirdato();
        año = validarAño(año);
        fecha = convertirMes(mes);
        imprimirFecha(dia,fecha,año);       
        
    }

}
