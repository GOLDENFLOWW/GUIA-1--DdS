import java.util.*;


public class funcion_algebraica_final {

    
    public funcion_algebraica_final() {
    }

     //calcula el duadrado de x, y que esta en la funcion
    public static int calcular_cuadrado( int numero) {
        return numero * numero;
        
    }

     //calcula toda la funcion
    public static int calcular_funcion(int x, int y) {
        return calcular_cuadrado(x) + 2 * x * y + calcular_cuadrado(y);
    }

    public static void main(String[] args) {
        //scanner para ingresar los datos del usuario
        Scanner lectura = new Scanner(System.in);

        //pide insertar un valor de x
        System.out.print("Ingrese valor de x: ");
        int x = lectura.nextInt(); //nextInt establece que el valor insertado es un numero entero

        //valor de y
        System.out.print("Ingrese valor de y: ");
        int y = lectura.nextInt();

        int resultado = calcular_funcion(x, y);

        System.out.println("f(" + x + ", " + y + ") vale : " + resultado);

    }

}