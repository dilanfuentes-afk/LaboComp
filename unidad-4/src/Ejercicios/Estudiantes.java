package Ejercicios;

public class Estudiantes {
    public String nombre;
    public Asignatura [] asignaturas;

    public Estudiantes(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    public double calcularPromedio() {
        double a = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            a = a + asignaturas[i].getCalificaciones();
        }
        return a / asignaturas.length;
    }

    public void estadoDeLasAsignaturas() {
        System.out.println("Estado de las asignaturas de " + nombre + ":");
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i].estaAprobada()) {
                System.out.println("- " + asignaturas[i].getNombre() + ": Aprobada");
            } else {
                System.out.println("- " + asignaturas[i].getNombre() + ": Desaprobada");
            }
        }
    }
}
