package PruebaDeEjercicios;

import Ejercicios.Resistor;

public class Ejercicio12 {
    public static void main(String[] args) {
            Resistor[] resistores = {
                    new Resistor(100),
                    new Resistor(200),
                    new Resistor(300)
            };

            System.out.println("en serie: " + Resistor.calcularEquivalenteSerie(resistores));
            System.out.println("en paralelo: " + Resistor.calcularEquivalenteParalelo(resistores));
        }
}