package Ejercicios;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidad;

    @Override
    public String toString() {
        return String.format("Marca: %s\nModelo: %s\nVelocidad: %d", marca,modelo,velocidad);
    }

    public int acelerar(int kmh){
        velocidad = velocidad + kmh;
        return velocidad;
    }

    public int frenar(int kmh){
        velocidad = velocidad - kmh;
        return velocidad;
    }
}
