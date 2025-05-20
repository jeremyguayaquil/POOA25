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
        String resultado = "";
        if (dia > 0 && dia < 8) {
            resultado = evaluacion(dia);
        } else {
            while (dia > 7) {
                System.out.println("Ingresa otro número ");
                dia = teclado.nextInt();
                resultado = evaluacion(dia);
            }
        }
        System.out.println(resultado);

    }

    public static String evaluacion(int numero) {
        switch (numero) {
            case 1:
                return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miercoles";
            case 4:
                return "jueves";
            case 5:
                return "viernes";
            case 6:
                return "sabado";
            case 7:
                return "domingo";
            default:
                return "no se puede evaluar el día ingresado ";
        }
    }
}
