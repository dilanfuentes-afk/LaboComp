import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Ingrese su altura: ");
        Double altura = ent.nextDouble();
        System.out.print("Ingrese su edad: ");
        int edad = ent.nextInt();
        System.out.print("Ingrese su nombre: ");
        ent.nextLine();
        String nombre = ent.nextLine();


        System.out.println("Mi informacion es:");
        System.out.print("Mi nombre es ");
        System.out.print(nombre);
        System.out.print(", tengo ");
        System.out.print(edad);
        System.out.print(" y mi altura es ");
        System.out.print(altura);
    }
}
