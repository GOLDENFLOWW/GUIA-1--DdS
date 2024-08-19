import java.util.Scanner;

public class Aumento_Salario_final { 

    public static double calcularAumento(double sueldoActual) {
        double aumento = 0.0;

        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10; // 10% de aumento
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08; // 8% de aumento
        } else {
            aumento = sueldoActual * 0.05; // 5% de aumento
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();  


        double aumento = calcularAumento(sueldoActual); // Llamada a la función corregida
        double nuevoSalario = sueldoActual + aumento;

        System.out.println("El aumento para este empleado es: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);

        scanner.close();
    }
}