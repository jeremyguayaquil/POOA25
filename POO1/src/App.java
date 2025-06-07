import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        String mensaje = "";

        Curso matematica = new Curso();
        matematica.modalidad = "Presencial";
        matematica.fechaVigencia = new Date();

        mensaje = matematica.dictar("de matematica");
        System.out.println(mensaje);

        Curso ingles = new Curso();
        ingles.modalidad = "Virtual";
        ingles.fechaVigencia = new Date();

        mensaje = ingles.dictar("de ingles");
        System.out.println(mensaje);
    }
}
