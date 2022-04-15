package ar.edu.unju.fi.proyecto1010.ejercicio01;

import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args) {
        int n;
        double resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un Nro:");
        n=entrada.nextInt();
        resultado=1;
        if (n!=0) {
            for (int i = n; i > 0; i--) {
                resultado*=i;
            }    
        }
        entrada.close();
        System.out.println("El Factorial de "+n+" es:"+resultado);
    }
}
