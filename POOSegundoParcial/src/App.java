public class App {
    public static void main(String[] args) throws Exception {
        Persona guayaquil = new Persona(70);
        String valor1 = guayaquil.nombre;
        guayaquil.setEdad(30);
        guayaquil.setIdentificacion(555555);
        valor1 = "Joao";
        System.out.println("el atributo nombre es " + valor1 + " y la edad es " + guayaquil.getEdad());
        String mensaje = guayaquil.disciplina(guayaquil, "excelente");
        System.out.println(mensaje);
        mensaje = guayaquil.aprender(guayaquil, "aprendiendo ingles");
        System.out.println(mensaje);

        // ============================================
        // ============================================
        // ============================================

        Alumno electrodomestico = new Alumno(80);
        mensaje = electrodomestico.hacerDeberes(electrodomestico);
        System.out.println(mensaje);
    }
}
