package ar.edu.unju.fi.proyecto1010.ejercicio11;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        int i = 320;
        do {
            salida+=String.valueOf(i)+" ";
            i-=20;
        } while (i>=120);
        System.out.println(salida);
    }
}
