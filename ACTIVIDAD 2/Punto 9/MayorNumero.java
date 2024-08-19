import java.util.Scanner;

public class MayorNumero {

    // Función para encontrar el mayor (la misma que antes)
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner 
 = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        int 
 mayor = encontrarMayor(primerNumero, segundoNumero);
        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }
}