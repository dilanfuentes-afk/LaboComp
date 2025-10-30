package PruebaDeEjercicios;

import Ejercicios.CuentaBancaria;

public class Ejercicio10 {
    public static void main(String[] args) {
        CuentaBancaria banco = new CuentaBancaria();

        banco.setSaldo(1000);

        System.out.println(banco.toString());

        banco.depositar(100);
        banco.retirar(300);
        System.out.println(banco.toString());
    }
}
