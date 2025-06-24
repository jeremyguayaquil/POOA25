import java.util.Date;

public class Curso {
    public String modalidad;
    public Date fechaVigencia;

    public Curso() {
        this.fechaVigencia = new Date();
    }

    public Curso(String modalidad) {
        this.modalidad = "EXCELENTE";
        this.fechaVigencia = new Date();
    }

    public Curso(String nombre1, Date nombre2) {
        this.modalidad = nombre1;
        this.fechaVigencia = nombre2;
    }

    public String dictar(String mensaje) {
        return "El curso dictado es " + mensaje +
                " en la modalidad " + this.modalidad +
                " y su fecha Vigencia es " + this.fechaVigencia;
    }

    public String dictar(String mensaje, String mensaje2) {
        return "El curso dictado es " + mensaje +
                " de la ciudad de " + mensaje2;
    }

    public String dictar(String mensaje, String mensaje2, String mensaje3) {
        return "El curso dictado es " + mensaje +
                " de la ciudad de " + mensaje2 +
                " de la provincia de " + mensaje3;
    }
}
