import java.util.Scanner;

public class escalera_final {

    // Función para calcular la longitud 
    public static double calcularLongitudEscalera(double altura, double angulo) {
        double anguloRadianes = Math.toRadians(angulo);
        double longitud = altura / Math.sin(anguloRadianes); 
        return longitud;
    }

    public static void main(String[] args) {
        Scanner 
 scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura que alcanza la escalera en la pared (metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el ángulo de inclinación de la escalera (grados): ");
        double angulo = scanner.nextDouble();

        double longitud = calcularLongitudEscalera(altura, angulo);
        System.out.println("La longitud de la escalera es: " + longitud + " metros");

        scanner.close();
    }
}