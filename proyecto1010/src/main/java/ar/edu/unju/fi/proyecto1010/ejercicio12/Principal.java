package ar.edu.unju.fi.proyecto1010.ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        Scanner entrada = new Scanner(System.in);
        String resp = "s";
        double altura = 0;
        final double G = 9.91;        
        System.out.println("------------ Calculo de tiempo según altura ----------");
        while (resp.equalsIgnoreCase("s")) {
            try {
                System.out.print("Ingrese la altura: ");
                altura = entrada.nextDouble();
                altura = Math.abs(altura);
                salida = "El tiempo es: "+String.valueOf(Math.sqrt((2*altura)/G));
                System.out.println(salida);
                System.out.print("Desea Ingresar otra altura? S/N  ");
                resp=entrada.next();

            } catch (InputMismatchException e) {
                System.out.println("No valido");
                System.out.println("Ingrese otro");
                entrada.next();
            }
        }
        entrada.close();

    }
}
