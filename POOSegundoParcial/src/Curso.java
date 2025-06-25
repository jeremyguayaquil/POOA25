import java.util.Date;

public class Curso {

    public String modalidad;
    public Date fechaVigencia;

    public String dictar(String valor) {
        return valor;
    }

    public int dictar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public boolean dictar(boolean esVerdad) {
        return !esVerdad;
    }
}
