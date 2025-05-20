import java.util.Scanner;

/**
 * Escribe un programa en que dado un número del 1 a 7 escriba
 * el correspondiente nombre del día de la semana
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número ");
        int dia = teclado.nextInt();
        if (dia == 1) {
            System.out.println("lunes");
        } else if (dia == 2) {
            System.out.println("martes");
        } else if (dia == 3) {
            System.out.println("miercoles");
        } else if (dia == 4) {
            System.out.println("jueves");
        } else if (dia == 5) {
            System.out.println("viernes");
        } else if (dia == 6) {
            System.out.println("sabado");
        } else if (dia == 7) {
            System.out.println("domingo");
        } else {
            System.out.println("no se puede evaluar el día ingresado ");
        }

        System.out.println(" =============================================  ");
        System.out.println(" =============================================  ");
        System.out.println(" =============================================  ");

        switch (dia) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("no se puede evaluar el día ingresado ");
                break;
        }

        System.out.println("Fin del programa");
        /**
         * System.out.println("Ingresar un número por teclado");
         * int numero = teclado.nextInt();
         * if (numero % 2 == 0) {
         * System.out.println("Es par");
         * } else {
         * System.out.println("Es inpar");
         * }
         */

    }
}
