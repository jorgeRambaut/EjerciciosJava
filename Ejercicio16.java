/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosIntegradoresr;

/**
 *
 * @author jorge
 */
public class Ejercicio16 {
    
    static void sumarMultiplos(){
    int suma=0;
    
        for (int i = 1; i <= 100; i++) {
            if (i%2==0|i%3==0) {
                suma+=i;
                System.out.println("Numero Multiplo " +i);    
                
            }
        }
        
        //System.out.println("la suma es " + suma);
        
    }
    public static void main(String[] args) {
       
        sumarMultiplos();
        
    }
}
