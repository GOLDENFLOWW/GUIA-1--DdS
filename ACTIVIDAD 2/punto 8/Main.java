import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salon: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el numero de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        Edificio edificio = new Edificio(numEstudiantes, capacidadSalon, salonesPorPiso);
        edificio.imprimirResultados();
    }
}