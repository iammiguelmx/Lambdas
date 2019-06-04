/*
 Solo se peude desde Java 9
 */
package com.miguel.operations;

import java.util.Scanner;

/**
 *
 * @author SOMA
 */
public class TestForOperations {

    public static void main(String[] args) {
        //Inicio del programa 
        System.out.println("Hola estas iniciando con lambdas");
        //Declaracion de Scanner para leer por consola
        Scanner scanner = new Scanner(System.in);
        //Declaracion de variables a utilizar
        int n1, n2;
        System.out.println("Numero 1:");
        n1 = scanner.nextInt();
        System.out.println("Numero 2");
        n2 = scanner.nextInt();

        //Definiendo la interfaz con el metodo abstracto
        OperationsSuma sumar = (a, b) -> n1 + n2;
        System.out.println("La suma es de: " + sumar.suma(n1, n2));

        //Interface para restar 
        OperarionsResta resta = (a, b) -> n1 - n2;
        System.out.println("La resta es de: " + resta.resta(n1, n2));

        //Interface para multiplicar 
        OperarionsMultiplicacion multiplicacion = (a, b) -> n1 * n2;
        System.out.println("La multiplicacion es de: " + multiplicacion.multiplicacion(n1, n2));

        //Interface para dividir 
        OperarionsDivision division = (a, b) -> n1 /  n2;
        System.out.println("La division es de: " + division.division(n1, n2));
    }
}
