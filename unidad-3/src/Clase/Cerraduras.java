package Clase;

public class Cerraduras {
    public static boolean cerradurasDefectuosas(int[] defectuosas) {
            int j = 0;
            for (int i = 0; i < defectuosas.length; i++) {
                if (defectuosas[i] < 30) {
                    j++;
                    if (j == 7) {
                        return true;
                    }
                } else {
                    j = 0;
                }
            }
            return false;
    }
}
