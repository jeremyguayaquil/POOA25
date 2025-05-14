import java.util.Scanner;

/**
 * Ejemplo de uso de la clase Scanner para leer datos desde la consola.
 * Este programa solicita al usuario que ingrese su nombre y lo compara con un
 * nombre predefinido.
 * Si el nombre ingresado coincide, se imprime un saludo; de lo contrario, se
 * indica que no es el mismo nombre.
 */

public class App {
    // Declarar una constante
    final static String nombre = "Juan";
    final static int edad = 18;

    public static void main(String[] args) throws Exception {

        /*
         * Scanner teclado = new Scanner(System.in);
         * System.out.println("Ingresa tu nombre: ");
         * String consola = teclado.nextLine();
         * if (consola.equals(nombre)) {
         * System.out.println("Hola " + nombre);
         * } else {
         * System.out.println("No eres " + nombre);
         * }
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int numero = teclado.nextInt();
        if (numero != edad) {
            System.out.println("Tienes una edad distinta de  18 anios");
        } else {
            System.out.println("Tienes 18 anios");
        }
    }
}
