package PruebaDeEjercicios;

import Ejercicios.Asignatura;
import Ejercicios.Estudiantes;

public class Ejercicio4 {
    public static void main(String[] args) {

        Asignatura[] materias = {
                new Asignatura("Matemática", 8),
                new Asignatura("Lengua", 5),
                new Asignatura("Historia", 7)
        };


        Estudiantes estudiante = new Estudiantes("Dilan", materias);

        double promedio = estudiante.calcularPromedio();
        System.out.println("Promedio general: " + promedio);

        estudiante.estadoDeLasAsignaturas();
    }

    }
