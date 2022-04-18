package ar.edu.unju.fi.proyecto1010.ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalculoMatematico cm = new CalculoMatematico();
        Scanner entrada = new Scanner(System.in);
        int n = 0;

        try {
            System.out.print("Ingrese el valor de n=");
            n = entrada.nextInt();
            cm.setN(n);
            System.out.println("La sumatoria es: " + cm.calcularSumatoria());
            System.out.println("La productoria es: " + cm.calcularProductoria());

        } catch (InputMismatchException e) {
            System.out.println("No valido");            
        }

        entrada.close();
    }
}
