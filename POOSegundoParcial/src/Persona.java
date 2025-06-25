public class Persona {

    public String nombre;
    private int edad;
    public String hobbie;
    private int identificacion;
    public double estatura;
    private String direccion;
    private String saludFisica;
    public String saludEmocional;
    private int telefono;
    public String correo;

    // Constructor
    public Persona(int edadRecibido) {
        this.edad = 60;
        this.nombre = "Karina";
    }

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

    public String getSaludFisica() {
        return saludFisica;
    }

    public void setSaludFisica(String saludFisica) {
        this.saludFisica = saludFisica;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String disciplina(Persona persona, String cadenaTexto) {
        return "La disciplina de " + persona.nombre + " es " + cadenaTexto;
    }

    public String aprender(Persona persona, String mensaje) {
        return "El estudiante con identificación  " + persona.identificacion + " esta " + mensaje;
    }

    public String reprobar(Persona persona, String mensaje) {
        return "El estudiante  " + persona.nombre + " esta reprobando " + mensaje;
    }

    public String logroAcademico(Persona persona) {
        return "El estudiante " + persona.nombre + " ha conseguido un logro académico ";
    }

    public String respirar(Persona persona) {
        return "El estudiante " + persona.nombre + " este respirando ";
    }

    public String recrear(Persona persona) {
        return "El estudiante " + persona.nombre + " se esta recreando ";
    }
}
