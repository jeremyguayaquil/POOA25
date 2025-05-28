public class App {
    public static void main(String[] args) throws Exception {
        int incremento = 1;
        do {
            System.out.println("Número incrementado   " + incremento);
            incremento++;
        } while (incremento <= 100);

        int decremento = 100;
        while (decremento > 0) {
            System.out.println("Número decremento    " + decremento);
            decremento--;
        }
    }
}
