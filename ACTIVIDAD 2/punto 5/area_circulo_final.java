import java.util.Scanner;

public class area_circulo_final {
  public static void main(String[] args) {
      //pide el Radio Grande (R)
      Scanner entrada = new Scanner(System.in);
      System.out.print("Ingrese el radio grande (R): ");
      double radioGrande = entrada.nextDouble();

      //pide el Radio pequenio (r)
      System.out.print("Ingrese el radio pequeño (r): ");
      double radioPequenio = entrada.nextDouble();
      
      //llama a la funcion calcularAreaCirculo tomando el dato del scanner de radio pequenio (r)
    double area_r = CalcularArea(radioPequenio);

    //llama a la funcion calcularAreaCirculo tomando el dato del scanner de radio pequenio (r)
    double area_R = CalcularArea(radioGrande);
    //llama a  radio pequenio (r)
    System.out.println("area r " + area_r );
    //llama a  radio Grande (R)
    System.out.println("area R " + area_R );
    //Resta Radio Grande (R) a  radio pequenio (r)
    System.out.println("Resultado " + (area_R - area_r) );
  }
  //Función de calcular area
  public static double CalcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
