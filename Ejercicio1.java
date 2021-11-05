/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosIntegradoresr;

import java.util.Scanner;

/**
 *
 * @author jorge
 */

public class Ejercicio1 {

    int numero1, numero2, numero3;

    static int pedirNumero() {

        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar Numero ");
        numero = scanner.nextInt();

        return numero;
    }

    static int evaluar(int a, int b, int c) {
        int operacion = 0;

        if (a < 0) {
            operacion = a * b * c;

        } else {
            operacion = a + b + c;

        }

        return operacion;

    }

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int a, b, c;
        int operacion;
        a = ejercicio1.numero1 = pedirNumero();
        b = ejercicio1.numero2 = pedirNumero();
        c = ejercicio1.numero3 = pedirNumero();

        operacion = evaluar(a, b, c);

        if (a < 0) {

            System.out.println("Primer Numero " + a);

            System.out.println("Multiplicacion   " + operacion);
        } else {

            System.out.println("Primer Numero " + a);

            System.out.println("Suma " + operacion);
        }

    }

}


