/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosIntegradoresr;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio22 {
    static String clave = "eureka";
    static int intentos=3;
static String pedirClave(){
String clave;
Scanner lector = new Scanner(System.in);
    System.out.println("Ingresar Clave");
    clave = lector.next();
return clave;
}

static void validar(String clave){
int intentos = Ejercicio22.intentos;
Scanner lector = new Scanner(System.in);
--intentos;
    while (!(clave.equals(Ejercicio22.clave))) {
        --intentos;
        System.out.println("Clave Incorrecta");
        System.out.println("Ingresar Clave");
        clave=lector.next(); 
        if (intentos==0) {
            System.out.println("Se agotaron los intentos");  
            exit(0);
        }        
    }
    exit(0);

}
    public static void main(String[] args) {
        String clave;
        clave=pedirClave();
        validar(clave);      
        
    }
}
