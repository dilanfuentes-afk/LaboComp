import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingresar cuantos numeros se van a promediar: ");
        int bucle = ent.nextInt();
        int divisor = bucle;

        if (bucle <= 0){
            System.out.println("La cantidad de numeros deben ser menor a 0");
            return;
        }

        double numero;
        double promedio = 0;
        while (bucle > 0){
            bucle--;
            System.out.print("Ingrese numero para promediar: ");
            numero = ent.nextDouble();
            promedio = numero + promedio;
        }
        promedio = promedio/divisor;
        System.out.println("El promedio es " + promedio);
    }
}