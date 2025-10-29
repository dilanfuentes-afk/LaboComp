package Ejercicios;

public class Persona {
    //Atributos
    public String nombre;
    public int edad;
    public double altura;


    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nAltura: %f",nombre,edad,altura);
    }

    public boolean esMayorDeEdad (){
        if (edad >= 18) return true;
        else return false;
    }
}

