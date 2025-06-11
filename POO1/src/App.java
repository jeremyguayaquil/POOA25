import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        String mensaje = "";
        Curso matematica = new Curso();
        matematica.modalidad = "Virtual";
        matematica.fechaVigencia = new Date();

        mensaje = matematica.dictar("matematicas");
        System.out.println(mensaje);

        mensaje = matematica.dictar("matematicas", "Guayaquil");
        System.out.println(mensaje);

        Curso geografia = new Curso();
        geografia.modalidad = "Presencial";
        geografia.fechaVigencia = new Date();

        mensaje = geografia.dictar("geografía");
        System.out.println(mensaje);

        Curso ingles = new Curso();
        ingles.modalidad = "Semi-Presencial";
        ingles.fechaVigencia = new Date();

        mensaje = ingles.dictar("inglés");
        System.out.println(mensaje);

        Persona roberto = new Persona();
        roberto.nombre = "Roberto";
        roberto.setEdad(22);
        roberto.setIdentificacion(242422);
        roberto.hobbie = "futbol";

        System.out.println("La persona " + roberto.nombre + " tiene " + roberto.getEdad() + " años.");
    }
}
