package Clase;

import java.util.Scanner;

public class Ejercicio2 {
    public static boolean lemonateChange(int [] bills){

        int billete5 = 0;
        int billete10 = 0;
        int billete20 = 0;

        for (int i = 0; i <bills.length; i++) {
            if (bills[i] == 5){
                billete5++;
            } else if (bills[i] == 10){
                billete10++;
                if (billete5 > 0){
                    billete5--;
                } else{
                    return false;
                }
            } else if (bills[i] == 20){
                billete20++;

                if (billete10 > 0){
                    billete10--;
                } else{
                    return false;
                }
                if (billete5 > 0){
                    billete5--;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
