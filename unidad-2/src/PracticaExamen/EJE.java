package PracticaExamen;

public class EJE {
    public static void main(String[] args) {

        String nombre = "Progralabs";

        int longitud = nombre.length();
        // length() devuelve la cantidad de caracteres en el String → 10

        char letra = nombre.charAt(2);
        // charAt(pos) devuelve el caracter en la posición indicada (empieza en 0) → 'o'

        int indice = nombre.indexOf('s');
        // indexOf('x') devuelve la posición de la primera aparición del caracter → 9

        int ultimo = nombre.lastIndexOf('a');
        // lastIndexOf('x') devuelve la última posición donde aparece ese caracter → 6

        // nombre = nombre.toUpperCase();
        // toUpperCase() convierte todo el texto a mayúsculas → "PROGRALABS"

        // nombre = nombre.toLowerCase();
        // toLowerCase() convierte todo el texto a minúsculas → "progralabs"

        // nombre = nombre.trim();
        // trim() elimina espacios en blanco al inicio y al final del String

        // nombre = nombre.replace('a','e');
        // replace('x','y') reemplaza un caracter por otro en todo el String → "Progrel ebs"

        System.out.println(nombre);
        // imprime el contenido actual de la variable nombre
    }
}