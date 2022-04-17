package ar.edu.unju.fi.proyecto1010.ejercicio07;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        int i = 2;
        for (int j = 40; j > 0; j--) {
            salida += String.valueOf(i*j)+" ";
            i+=1;            
        }
        System.out.println(salida);
    }
    
}
