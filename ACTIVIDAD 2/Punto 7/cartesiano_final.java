import java.util.Scanner;

public class cartesiano_final {
  public static void main(String[] args) {
    
    Scanner lectura = new Scanner (System.in);
    
    System.out.println("Ingrese x1:");
    int x1 = lectura.nextInt();

    System.out.println("Ingrese y1:");
    int y1 = lectura.nextInt();

    System.out.println("Ingrese x2:");
    int x2 = lectura.nextInt();

    System.out.println("Ingrese y2:");
    int y2 = lectura.nextInt();

    
    calcularDistancia(x1, y1, x2, y2);
    calcularPendiente(x1, y1, x2, y2);
    
    
  }

  public static void calcularDistancia(int x1, int y1, int x2, int y2) {
    double d = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));

    System.out.println("Distancia: " + d); // Corrected output message
}

public static void calcularPendiente(int x1, int y1, int x2, int y2) {
    double m = (y2 - y1) / (x2 - x1);

    System.out.println("Pendiente: " + m); // Corrected output message
}
  
}