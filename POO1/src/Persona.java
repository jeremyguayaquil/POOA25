public class Persona {

    public String nombre;
    private int edad;
    public String hobbie;
    private int identificacion;
    public double estatura;
    private String direccion;
    private String saludadFisica;
    public String saludEmocional;
    private int telefono;
    public String correo;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSaludadFisica() {
        return saludadFisica;
    }

    public void setSaludadFisica(String saludadFisica) {
        this.saludadFisica = saludadFisica;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
