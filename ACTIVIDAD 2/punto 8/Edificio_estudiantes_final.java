public class Edificio_estudiantes_final {

    //atributos
    private int numEstudiantes;
    private int capacidadSalon;
    private int salonesPorPiso;

    // constructor con parametros
    public Edificio(int numEstudiantes, int capacidadSalon, int salonesPorPiso) {
        this.numEstudiantes = numEstudiantes;
        this.capacidadSalon = capacidadSalon;
        this.salonesPorPiso = salonesPorPiso;
    }

    
    // para calcular el numero de salones
    // divide los estudiantes por capacidad de salon, redondea el resultado con Math.ceil
    public int calcularSalones() {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    // para calcular el numero de pisos
    public int calcularPisos() {
        int numSalonesTotales = calcularSalones();
        return (int) Math.ceil((double) numSalonesTotales / salonesPorPiso);
    }

    // Método para imprimir los resultados
    public void imprimirResultados() {
        System.out.println("Numero de salones: " + calcularSalones());
        System.out.println("Numero de pisos: " + calcularPisos());
    }
}