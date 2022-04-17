package ar.edu.unju.fi.proyecto1010.ejercicio10;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        int i = 320;
        while (i>=120) {
            salida+=String.valueOf(i)+" ";
            i-=20;
        }
        System.out.println(salida);
    }
}
