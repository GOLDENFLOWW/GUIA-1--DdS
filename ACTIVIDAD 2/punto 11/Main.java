import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

       System.out.print("Ingrese un numero de dos cifras: ");
        int numero = leer.nextInt();

        //validacion de que el numero ingresado este entre 0 y 99
        // 0 <= numero      ----> numero es mayor o igual a 0
        // &&               ----> operador AND
        // numero <= 99     ----> numero es menor o igual a 99 
        if (0 <= numero && numero <= 99) { 

        // obtener las decenas y unidades del numero ingresado por los metodos de la clase numeroRomano
        int decena = numeroRomano.calculoDecenas(numero);
        int unidad = numeroRomano.calculoUnidades(numero);

        //convertir a numero romano
        String romDecena = numeroRomano.convertirRomanoDecena(decena);
        String romUnidad = numeroRomano.convertirRomanoUnidad(unidad);

        // imprimir en pantalla 
        System.out.println(numero + " en numero romano es " + romDecena + romUnidad);

        // en caso que no se cumpla la condicion de estar entre 0 y 99 el numero ingresado
        } else {
            System.err.println("ERROR. numero invalido");
        }
    }
}
