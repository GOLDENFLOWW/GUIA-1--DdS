package paseo_2_final;

import java.util.Scanner;

public class paseo_2_final {
    
    // Esta funcion se encarga de calcular el número de buses que son necesarios
    public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        //1 gordo = 2 sillas / 1 flaco = 1 silla
        int sillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;
        
        int busesNecesarios = (int) Math.ceil((double) sillasNecesarias / sillasPorBus);
        
        return busesNecesarios;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // se solicita  número de sillas por bus
        System.out.print("Ingrese el numero de sillas por bus: ");
        int sillasPorBus = scanner.nextInt();
        
        // se solicita el número de estudiantes gordos
        System.out.print("Ingrese el numero de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();
        
        // se solicita el número de estudiantes flacos
        System.out.print("Ingrese el numero de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();
        
        // aqui se calcula el número de que son necesarios de  buse 
        int busesNecesarios = calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        
        
        System.out.println("Numero de buses necesarios: " + busesNecesarios);
        
        
        scanner.close();
    }
}

   