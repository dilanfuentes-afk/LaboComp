package PracticaExamen;

import java.util.Scanner;

public class EJE {
    public static void main(String[] args) {
        System.out.print("La cantida de vuelto en billetes es " + costo(5, 9, 7, 12));
    }
    public static int costo(int dL, int hL, int dS, int hS){
        if(dL == dS && hL == hS) return 0;
        return 2000 + costo(dL + (hL + 1)/24, (hL + 1)%24, dS, hS);
    }
}