import java.util.Date;

public class Curso {
    public String modalidad;
    public Date fechaVigencia;

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
