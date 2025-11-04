package PruebaDeEjercicios;

import Ejercicios.Resistor;

import java.util.ArrayList;

public class Ejercicio18 {
    public static ArrayList<Resistor> generarArrayResistivo(double[] nums) {

        ArrayList<Resistor> lista = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            Resistor resistencia = new Resistor(nums[i]);
            lista.add(resistencia);
        }
        return lista;
    }
    public static void main(String[] args) {

    }
}
