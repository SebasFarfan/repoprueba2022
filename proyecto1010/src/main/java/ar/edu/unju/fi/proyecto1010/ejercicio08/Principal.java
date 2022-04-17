package ar.edu.unju.fi.proyecto1010.ejercicio08;

public class Principal {
    public static void main(String[] args) {
        int resultado = 0;
        int i = 1;
        String salida = "";
        do {
            resultado = 4 * i;
            i += 1;
            salida += String.valueOf(resultado) + " ";
        } while (resultado < 100);
        System.out.println(salida);
    }
}
