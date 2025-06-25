public class Profesor extends Persona {

    public String nivelAcademico;

    public Profesor(int edadRecibido) {
        super(edadRecibido);
        this.setIdentificacion(101010101);
    }

    public String planificar(Profesor teacher) {
        return "El profesor " + teacher.nombre + " esta planificando";
    }

}
