public class Alumno extends Persona {

    public String nivelAprendizaje;

    public Alumno(int edadRecibido) {
        super(edadRecibido);
    }

    public String hacerDeberes(Alumno alumno) {
        return "El alumno " + alumno.nombre + " esta haciendo deberes";
    }

}
