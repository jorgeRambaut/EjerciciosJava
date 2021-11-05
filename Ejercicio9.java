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
public class Ejercicio9 {
    int mes;
    
    static int pedirMes(){
        int mes;
        System.out.println("Ingresar mes");
        Scanner lector = new Scanner(System.in);
        mes = lector.nextInt();                
        
    return mes;   
    
    }
   static int validarMes(int mes){
       int mesvalidado;
       Scanner lector = new Scanner(System.in);
       mesvalidado=mes;
       while (mesvalidado<0 | mesvalidado >12) {
           System.out.println("Ingresar Mes Correcto (1-12) ");
           mesvalidado=lector.nextInt();
       }
   return mesvalidado;
   }
    static void determinarMes(int mes){
    
    switch(mes){
        case 1:
            System.out.println("Enero");
            
            break;
        
    
    case 2:
        
        System.out.println("Febrero");
            break;
            
    case 3:
        System.out.println("Marzo");
            break;        
    
    
   case 4:
       
       System.out.println("Abril");
            break; 
   
    case 5:
        
        System.out.println("Mayo");
            break; 
            
    case 6:
        
        System.out.println("Junio");
            break;              
            
    case 7:
        
        System.out.println("Julio");
            break;
            
            
    case 8:
        
        System.out.println("Agosto");
            break;    
            
    case 9:
        System.out.println("Septiembre");
        
        
            break; 
            
            
            
    case 10:
        System.out.println("Octubre");         
                 
    break; 
    
    case 11:
             System.out.println("Noviembre");    
    break; 
            
            
   case 12:
       
       System.out.println("Diciembre");
                 
                 
                 
   break; 
    
   //sin default porque ya lo validamos 
    }
    
    
    }
    
    public static void main(String[] args) {
        int mes;
        Ejercicio9 ejercicio9 = new Ejercicio9();
        
        mes = ejercicio9.mes=pedirMes();
        mes = validarMes(mes);
        determinarMes(mes);
        
        
    }
    
    
}
