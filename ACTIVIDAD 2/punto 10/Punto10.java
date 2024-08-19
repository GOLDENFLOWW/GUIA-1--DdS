package punto10;

import java.util.Scanner;

public class operador_asimetrico_final {
        // Función que aplica la operacion aritmetica correspondiente
    public static double aplicarOperacion(int num1, int num2, String operador) {
        double resultado = 0;

        switch (operador) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> {
                // Asegurarse de que no haya division por cero
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error:Division por cero no permitida");
                }
            }
            case "%" -> resultado = num1 % num2;
            case "**" -> resultado = Math.pow(num1, num2);
            default -> System.out.println("Operador no valido");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        // Leer el operador aritmetico
        System.out.print("Ingrese el operador aritmetico (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Aplicar la operacion y obtener el resultado
        double resultado = aplicarOperacion(num1, num2, operador);

        
        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}
        
