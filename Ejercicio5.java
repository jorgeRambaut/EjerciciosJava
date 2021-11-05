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
public class Ejercicio5 {
    double totalCompra;
    static double descuento = 0.15;
    String mes;
    
    static int ingresarMonto(){
      int monto;
      
        System.out.println("Ingresar Importe");
        Scanner lector = new Scanner(System.in);        
        monto=lector.nextInt();    
        
        return monto;
    
    }
    static String ingresarMes(){
      String mes;
      
        System.out.println("Ingresar Mes");
        Scanner lector = new Scanner(System.in);        
        mes=lector.next();    
        
        return mes;
    
    } 
    
    static void evaluarDescuento(double monto,String mes){
    double total;
    total=monto;
        if (mes.equalsIgnoreCase("Octubre")) {
            
            total = monto* descuento - monto;
        
            System.out.println("Precio con Descuento " + total);
            
        } else {
            
            System.out.println("No se hizo descuento el "
                    + "mes es "+ mes);            
            
        }
    
    }
    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();        
        double monto;
        
        String mes;
        monto = ejercicio5.totalCompra=ingresarMonto();
        mes = ejercicio5.mes=ingresarMes();
        evaluarDescuento(monto,mes);
        
    }
 
}
