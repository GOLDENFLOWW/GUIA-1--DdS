import java.util.Scanner;

public class Hermano_Mayor_final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del primer hermano: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la edad del primer hermano: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); 
 // Consumir el salto de línea

        System.out.print("Ingrese el nombre del segundo hermano: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la edad del segundo hermano: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); 
 // Consumir el salto de línea

        System.out.print("Ingrese el nombre del tercer hermano: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese la edad del tercer hermano: ");
        int edad3 = scanner.nextInt(); 


        String hermanoMayor = encontrarHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

        System.out.println("El hermano mayor es: " + hermanoMayor);

        scanner.close();
    }

    // Función encontrarHermanoMayor 
    public static String encontrarHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        String hermanoMayor = nombre1;
        int edadMayor = edad1;

        if (edad2 > edadMayor) {
            hermanoMayor = nombre2;
            edadMayor = edad2;
        }

        if (edad3 > edadMayor) {
            hermanoMayor = nombre3;
        }

        return hermanoMayor;
    }
}