public class Dia_Siguiente_final {

    // Función que recibe el nombre de un día y retorna el día siguiente
    public static String obtenerDiaSiguiente(String dia) {
        switch (dia.toLowerCase()) { // Convertir a minúsculas para evitar problemas de mayúsculas/minúsculas
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "Día inválido"; //entradas incorrectas
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el nombre de un día de la semana: ");
        String dia = scanner.nextLine();

        String diaSiguiente = obtenerDiaSiguiente(dia);
        System.out.println("El día siguiente es: " + diaSiguiente);

        scanner.close();
    }
}