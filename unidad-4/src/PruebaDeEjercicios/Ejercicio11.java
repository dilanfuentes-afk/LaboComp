package PruebaDeEjercicios;

import Ejercicios.CuentaBancaria;

public class Ejercicio11 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(102000);
        cuenta.calcularInteres();
    }
}
