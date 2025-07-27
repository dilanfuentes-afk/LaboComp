import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;

        System.out.print("Ingresa el primer numero: ");
        num1 = ent.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2 = ent.nextInt();
        System.out.print("La suma de los dos numero es ");
        resultado = num1 + num2;
        System.out.println(resultado);
    }
}
