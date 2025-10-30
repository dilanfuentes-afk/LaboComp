package Ejercicios;

public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private double altura;


    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nAltura: %f",nombre,edad,altura);
    }

    public boolean esMayorDeEdad (){
        if (edad >= 18) return true;
        else return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

