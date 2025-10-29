package Ejercicios;

public class Estudiantes {
    public String nombre;
    public Asignatura [] asignaturas;


    public double calcularPromedio() {
        double a = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            a = a + asignaturas[i].calificacion;
        }
        return a / asignaturas.length;
    }

    void estadoDeLasAsignaturas() {
        System.out.println("Estado de las asignaturas de " + nombre + ":");
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i].estaAprobada()) {
                System.out.println("- " + asignaturas[i].nombre + ": Aprobada");
            } else {
                System.out.println("- " + asignaturas[i].nombre + ": Desaprobada");
            }
        }
    }
}
