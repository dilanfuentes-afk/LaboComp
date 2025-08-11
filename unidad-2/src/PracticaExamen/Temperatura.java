package PracticaExamen;

import java.util.Scanner;

public class Temperatura {
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);

        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int dentroRango = 0;
        int fueraRango = 0;

        System.out.print("Elegir cuántas mediciones quieres ingresar: ");
        int cantidad = ent.nextInt();

        for(int i = 0; i < cantidad; i++){
            System.out.print("Elegir temperatura: ");
            double temperatura = ent.nextDouble();

            // Actualizar mayor y menor
            if (temperatura > mayor){
                mayor = temperatura;
            }
            if (temperatura < menor){
                menor = temperatura;
            }

            // Contar dentro/fuera de rango
            if (temperatura >= 18 && temperatura <= 27){
                dentroRango++;
            } else {
                fueraRango++;
            }
        }

        // Resumen final
        System.out.println("\nResultados:");
        System.out.println("Dentro del rango: " + dentroRango);
        System.out.println("Fuera del rango: " + fueraRango);
        System.out.println("Temperatura mayor: " + mayor + " °C");
        System.out.println("Temperatura menor: " + menor + " °C");

        ent.close();
    }
}