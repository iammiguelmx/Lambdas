package com.miguel.lamnda;

/**
 * @author Mike
 * @version 1.0
 */
public class Lambda {

    public static void main(String[] args) {
        //Clase anomima
        MiNombre miNombreAnonima = new MiNombre() {
            @Override
            public String miNombre() {
                return "Migue Anonimo";
            }
        };
        System.out.println(miNombreAnonima.miNombre());

        MiNombre miNombreLammda = () -> "Miguel Lamnda";
        System.out.println(miNombreLammda.miNombre());

        //Clase anonima
        Sumar sumar = new Sumar() {
            @Override
            public int Suma(int a, int b) {
                return a + b;
            }
        };
        System.out.println(sumar.Suma(3, 3));

        Sumar suma1 = (a, b) -> a + b;
        System.out.println(suma1.Suma(4, 8));

        Sumar suma2 = (a, b) -> {
            a = b * b;
            a = a + b;
            System.out.println("Mensaje dentro de lamnba");
            return a;
        };
        System.out.println(suma2.Suma(2, 3));

    }
}
