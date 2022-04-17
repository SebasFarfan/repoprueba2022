package ar.edu.unju.fi.proyecto1010.ejercicio09;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        for (int i = 320; i >=120; i-=20) {
            salida += String.valueOf(i)+" ";
        }
        System.out.println(salida);
    }
    
}
