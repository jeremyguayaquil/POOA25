/*
 Realiza un programa que pida una hora por teclado y que muestre luego buenos
 días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 horas, los minutos no se deben introducir por teclado.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la hora");
        int numero = teclado.nextInt();

        if (numero < 1 || numero > 24) {
            System.out.println("Estimado usuario el número ingresado no puede ser evaluado");
        } else if (numero >= 6 && numero <= 12) {
            System.out.println("Buenos días");
        } else if (numero >= 13 && numero <= 20) {
            System.out.println("Buenos tardes");
        } else {
            System.out.println("Buenos noches");
        }
    }
}
