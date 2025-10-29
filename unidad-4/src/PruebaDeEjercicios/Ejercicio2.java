package PruebaDeEjercicios;


import Ejercicios.Vehiculo;

public class Ejercicio2 {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();

        vehiculo1.velocidad = 100;
        vehiculo1.marca = "Renault";
        vehiculo1.modelo = "Clio";

        System.out.println(vehiculo1.acelerar(20));
        System.out.println(vehiculo1.velocidad);
        System.out.println(vehiculo1.frenar(30));
        System.out.println(vehiculo1.velocidad);
    }
}
