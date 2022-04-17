package ar.edu.unju.fi.proyecto1010.ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        String nota = "";

        System.out.println("-------------------Determinar condición-------------");
        while (true) {
            try {
                System.out.print("Ingrese nota: ");
                numero = entrada.nextInt();
                if (numero == 6)
                    nota = "Alumno Regulariza";
                else if (numero >= 7 && numero <= 10)
                    nota = "Alumno Promociona";
                else if (numero >= 1 && numero < 6)
                    nota = "Alumno Desaprueba";
                else {
                    System.out.println("Valor no Permitido");
                    break;
                }
                System.out.println(nota);
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un Número.");
                System.out.println("Intente de nuevo");
                entrada.next();
            }
        }
        entrada.close();
    }

}
