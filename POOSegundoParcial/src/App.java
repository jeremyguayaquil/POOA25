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
        mensaje = guayaquil.reprobar(guayaquil, "POO");
        System.out.println(mensaje);

        mensaje = guayaquil.logroAcademico(guayaquil);
        System.out.println(mensaje);

        mensaje = guayaquil.respirar(guayaquil);
        System.out.println(mensaje);

        mensaje = guayaquil.recrear(guayaquil);
        System.out.println(mensaje);
        // ============================================
        // ============================================
        // ============================================

        Alumno electrodomestico = new Alumno(80);
        mensaje = electrodomestico.hacerDeberes(electrodomestico);
        System.out.println(mensaje);

        mensaje = electrodomestico.respirar(electrodomestico);
        System.out.println(mensaje);

        // ============================================
        // ============================================
        // ============================================

        Profesor walther = new Profesor(0);
        mensaje = walther.aprender(walther, " aprendiendo docker");
        System.out.println(mensaje);

        mensaje = walther.planificar(walther);
        System.out.println(mensaje);

        // ============================================
        // ============================================
        // ============================================

        Curso a25 = new Curso();
        mensaje = a25.dictar("Estamos dictando cursos en el año 2025");
        System.out.println(mensaje);

        boolean mensajeBooleano = a25.dictar(true);
        System.out.println(mensajeBooleano);

    }
}
