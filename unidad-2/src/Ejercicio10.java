import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int bucle = 7;
        double numero;
        double promedio = 0;
        while (bucle > 0){
            bucle--;
            System.out.print("Ingrese numero para promediar: ");
            numero = ent.nextDouble();
            promedio = numero + promedio;
        }
        promedio = promedio / 7;
        System.out.println("El promedio es " + promedio);
    }
}
