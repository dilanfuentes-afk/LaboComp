import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int bucle = 15;
        int menor = Integer.MAX_VALUE;
        while (bucle > 0){
            System.out.print("Ingresar numero seleccionado: ");
            int numero = ent.nextInt();
            if (menor > numero) {
                menor = numero;
            }
            bucle--;
        }
        System.out.println("El numero menor es " + menor);
    }
}