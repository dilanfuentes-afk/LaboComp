package PruebaDeEjercicios;

import Ejercicios.Resistor;

public class Ejercicio12 {
    public static void main(String[] args) {
            Resistor[] resistores = {
                    new Resistor(100),
                    new Resistor(200),
                    new Resistor(300)
            };

            System.out.println("Equivalente en serie: " + Resistor.calcularEquivalenteSerie(resistores) + " Ω");
            System.out.println("Equivalente en paralelo: " + Resistor.calcularEquivalenteParalelo(resistores) + " Ω");
        }
}