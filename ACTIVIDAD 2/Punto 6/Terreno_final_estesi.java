import java.util.Scanner;

public class Terreno_final_estesi {

    // Función para calcular el área de un rectángulo
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular la hipotenusa de un triángulo rectángulo
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Función para calcular el área de un triángulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Función para calcular el perímetro del terreno
    public static double perimetroTerreno(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB + ladoC; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese las dimensiones de los lados
        System.out.print("Ingrese la longitud del lado A (base mayor del trapecio): ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B (base menor del trapecio): ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C (altura del trapecio): ");
        double ladoC = scanner.nextDouble();

        // Cálculo del área del rectángulo
        double areaRectangulo = areaRectangulo(ladoB, ladoC); 

        // Cálculo del área del triángulo
        double baseTriangulo = ladoA - ladoB; 
        double areaTriangulo = areaTriangulo(baseTriangulo, ladoC); 

        // Área total del terreno
        double areaTotal = areaRectangulo + areaTriangulo;

        // Cálculo del perímetro del terreno (calculamos la hipotenusa)
        double hipotenusa = hipotenusa(ladoC, baseTriangulo);
        double perimetro = perimetroTerreno(ladoA, ladoB, hipotenusa);

        // Mostramos los resultados
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Área total del terreno: " + areaTotal);
        System.out.println("Perímetro del terreno: " + perimetro);

        scanner.close();
    }
}
