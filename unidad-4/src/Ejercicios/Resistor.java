package Ejercicios;

import java.util.ArrayList;

public class Resistor {
    private double resistencia;

    public Resistor(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getResistencia() {
        return resistencia;
    }

    public static double calcularEquivalenteSerie(Resistor[] resistores) {
        double equivalente = 0;
        for (int i = 0; i < resistores.length; i++) {
            equivalente = equivalente + resistores[i].getResistencia();
        }
        return equivalente;
    }

    public static double calcularEquivalenteSerie(ArrayList<Resistor> resistores) {
        double equivalente = 0;
        for (int i = 0; i < resistores.length; i++) {
            equivalente = equivalente + resistores.get(i).getResistencia();
        }
        return equivalente;
    }

    public static double calcularEquivalenteParalelo(Resistor[] resistores) {
        double suma = 0;
        double temp;
        for (int i = 0; i < resistores.length; i++) {
            temp = 1/(resistores[i].resistencia);
            suma = suma + temp;
        }
        return 1/suma;
    }

    public static ArrayList<Resistor> generarArrayResistivo(double[] nums) {

        ArrayList<Resistor> lista = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            Resistor resistencia = new Resistor(nums[i]);
            lista.add(resistencia);
        }
        return lista;
    }


}
