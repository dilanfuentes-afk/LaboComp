import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingresar numero para transformar: ");
        int numero = ent.nextInt();
        if (numero >= 0) {
            System.out.println("El valor absoluto es " + numero);
        }   else {
            int numero1 = 0 - numero;
            System.out.println("El valor absoluto es " + numero1);
        }
    }
}
