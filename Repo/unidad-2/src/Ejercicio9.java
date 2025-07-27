import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese el valor en que se va a repetir el bucle: ");
        int bucle = ent.nextInt();
        while (bucle > 0){
            System.out.println("10");
            bucle--;
        }
        System.out.println("Se acabo el bucle");
    }
}
