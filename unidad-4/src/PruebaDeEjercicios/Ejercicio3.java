package PruebaDeEjercicios;

import Ejercicios.Asignatura;

public class Ejercicio3 {
    public static void main(String[] args) {
        Asignatura materia1 = new Asignatura();

        materia1.nombre = "Matematica";
        materia1.calificaciones = 10;

        System.out.println(materia1.estaAprobada());
    }
}
