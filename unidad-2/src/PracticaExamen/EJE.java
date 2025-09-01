package PracticaExamen;

import java.util.Scanner;

public class EJE {
    public static void main(String[] args) {
        System.out.print("La cantida de vuelto en billetes es " + ingreso(6,8));
    }

    public static int costo(int dL, int hL, int dS, int hS) {
        if (dL == dS && hL == hS) return 0;
        return 2000 + costo(dL + (hL + 1) / 24, (hL + 1) % 24, dS, hS);
    }

    public static int billete(int num) {
        int vuelto = 0;
        while(100 <= num){
            num = num - 100;
            vuelto++;
        }
        while(20 <= num){
            num = num - 20;
            vuelto++;
        }
        while(1 <= num){
            num = num - 1;
            vuelto++;
        }
        return vuelto;
    }


    public static int dinero(int fechaE, int horaE, int fechaS, int horaS){
        int fecha = fechaS - fechaE;
        if(fecha > 30 || fecha < 0){
            return -1;
        } else{
            int hora = fecha * 24;
            hora = hora + (horaS - horaE);
            int costo = hora * 500;
            if(hora >= 24 && hora <= 72){
                costo = costo - (costo * 10/100);
                return costo;
            }
            if(hora > 72){
                costo = costo -(costo * 20/100);
                return costo;
            }
            return costo;
        }



    }

public static boolean ingreso(int diaSemana, int hora){
        if(diaSemana >= 1 && diaSemana <= 5) {
            if (hora >= 8 && hora <= 18) {
                return true;
            }
        }
        return false;
}

}