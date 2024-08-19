package punto4;

import java.util.Scanner;

public class problem_sueldo_pedro_final {
    // Función para calcular el gasto en arriendo (40% del sueldo)
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;
    }

    // Función para calcular el gasto en comida (15% del sueldo)
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // sueldo de Pedro
        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcula los gastos en arriendo y comida
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);

        // Calcula cuánto dinero le queda a Pedro después de pagar arriendo y comida
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

        
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);

        scanner.close();
    }
}
        
   