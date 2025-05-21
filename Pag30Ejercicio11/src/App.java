import java.util.Scanner;

/**
 * Realiza un conversor de Kb a Mb.
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa la cantidad en kb");
        Scanner teclado = new Scanner(System.in);
        double unidad = teclado.nextDouble();

        double conversion = unidad / 1024;
        System.out.println("El resultado en Mb es " + conversion);
    }
}
