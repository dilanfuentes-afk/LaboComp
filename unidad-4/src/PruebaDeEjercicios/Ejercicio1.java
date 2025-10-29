package PruebaDeEjercicios;

import Ejercicios.Persona;

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona Persona1 = new Persona();

        Persona1.nombre = "Dilan";
        Persona1.edad = 19;
        Persona1.altura = 1.75;

        System.out.println(Persona1.esMayorDeEdad());

    }
}
