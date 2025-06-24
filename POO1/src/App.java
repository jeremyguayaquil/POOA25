import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        String mensaje = "";

        Curso poo = new Curso("En la calle");
        // poo.modalidad = "en la buseta";
        mensaje = poo.dictar("programacion orientada a objeto");
        System.out.println(mensaje);

        Curso matematica = new Curso("Virtual", new Date());

        mensaje = matematica.dictar("matematicas");
        System.out.println(mensaje);

        mensaje = matematica.dictar("matematicas", "Guayaquil");
        System.out.println(mensaje);

        Curso geografia = new Curso();
        geografia.modalidad = "Presencial";

        mensaje = geografia.dictar("geografía");
        System.out.println(mensaje);

        Curso ingles = new Curso();
        ingles.modalidad = "Semi-Presencial";

        mensaje = ingles.dictar("inglés");
        System.out.println(mensaje);

        Persona roberto = new Persona();
        roberto.nombre = "Roberto";
        roberto.setEdad(22);
        roberto.setIdentificacion(242422);
        roberto.hobbie = "futbol";

        System.out.println("La persona " + roberto.nombre + " tiene " + roberto.getEdad() + " años.");

        Alumno nadya = new Alumno();
        nadya.nombre = "Nadya";
        nadya.hobbie = "Bailar";

        Profesor walther = new Profesor();
        walther.nombre = "Joao";
        walther.hobbie = "Nadar";
        System.out.println(
                "El nombre del profesor es " + walther.nombre + " el hobbie que practica es " + walther.hobbie);
    }
}
