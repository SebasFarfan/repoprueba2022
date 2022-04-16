package ar.edu.unju.fi.proyecto1010.ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {        
        int numero=0;
        Scanner entrada = new Scanner(System.in);
        int cont=1;
        System.out.println("--------- Ingrese 5 nuúmeros -----------------");
        while (cont<=5) {
            System.out.println("Ingresar el siguiente valor: ["+cont+"]");
            System.out.print("Ingrese un Nro: ");            
            try {
                numero = entrada.nextInt();
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es Par");
                } else {
                    System.out.println("El número " + numero + " No es Par");
                }
                cont+=1;
            } catch (InputMismatchException e) {
                System.out.println("No valido");                                
                System.out.println("Intente de nuevo ");
                entrada.next();
                
            }
        }        
        entrada.close();
    }
    
}
