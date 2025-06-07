import java.util.Date;

public class Curso {
    public String modalidad;
    public Date fechaVigencia;

    public String dictar(String texto) {
        return "Se ha dictado el curso " + texto +
                " la modalidad es " + this.modalidad +
                " la fecha de vigencia es " + this.fechaVigencia;
    }
}
