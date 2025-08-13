package PracticaExamen;

import java.util.Scanner;

public class Tornillos {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int numero = 1;
        int Cumplen = 0;
        int NoCumplen = 0;
        System.out.print("Coloque cuantos tornillos desea ingresar: ");
        int tornillos = ent.nextInt();
        for(int i = 0; i < tornillos; i++) {
            System.out.print("Coloca la medida del tornillo numero " + numero + " en mm: ");
            numero++;
            double medida = ent.nextDouble();

            if (medida >= 35 && medida <= 40) {
                Cumplen++;
            } else {
                NoCumplen++;
            }
        }
        System.out.println("Los tornillos que cumplerieron con la medida son " + Cumplen);
        System.out.println("Los tornillos que no cumplieron con la medida son " + NoCumplen);
    }
}
