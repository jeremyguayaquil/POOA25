import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Suma de 2 números");
        Scanner teclado = new Scanner(System.in);
        String texto = "Gracias por usar la calculadora";

        System.out.println("Ingrese el primer número:");
        float numero1 = teclado.nextFloat();
        System.out.println("Ingrese el segundo número:");
        int numero2 = teclado.nextInt();

        double resultado = numero1 + numero2;
        // Mascara en double para que me aparezca solo 2 decimales
        System.out.printf("El resultado es %.2f\n %s  ", resultado, texto);
    }
}
