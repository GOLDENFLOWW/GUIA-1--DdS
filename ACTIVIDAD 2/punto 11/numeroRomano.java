public class numeroRomano {
    
    // calcula las decena de un numero 
    public static int calculoDecenas(int numero) {
        return numero / 10;

    }
    
    // devuelve el restante de la division entre 10, con %
    public static int calculoUnidades(int numero) {
        return numero % 10;
    }

    //convierte a numero romano la unidad
    public static String convertirRomanoUnidad(int numero) {
        String[] romanosUni = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; //lista
        return romanosUni[numero];
    }
    // convierte a numero romano la decena
      public static String convertirRomanoDecena(int numero) {
        String[] romanosDec = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; //lista
        return romanosDec[numero];
    }
}
