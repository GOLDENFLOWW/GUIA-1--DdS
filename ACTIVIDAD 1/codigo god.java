class Universidad {
    private String nombre;
    private String nombreDelRector;
    private String ciudad;

    // Constructor, getters y setters
}

class Facultad {
    private String nombre;
    private int codigo;
    private Universidad universidad;

    // Constructor, getters y setters
}

class Persona {
    private String cedula;
    private String nombre;
    private Date fechaDeNacimiento;
    private String ciudadDeNacimiento;
    private String departamentoDeNacimiento;
    private String paisDeNacimiento;

    // Constructor, getters y setters
}

class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private double sueldo;
    private Facultad   
 facultad;

    // Constructor, getters y setters
}

class Estudiante extends Persona {
    private String colegioDeBachillerato;
    private Date fechaDeIngreso;

    // Constructor, getters y setters
}

class Carrera {
    private String nombre;
    private int numeroDeCreditos;
    private int numeroDeSemestres;
    private String nivel; // Enum: PREGRADO, POSTGRADO
    private Facultad facultad;

    // Constructor, getters y setters
}

class Curso {
    private int codigo;
    private String nombre;
    private int numeroDeCreditos;
    private int numeroDeSalon;
    private String nombreDelEdificio;
    private Carrera carrera;

    // Constructor, getters y setters
}