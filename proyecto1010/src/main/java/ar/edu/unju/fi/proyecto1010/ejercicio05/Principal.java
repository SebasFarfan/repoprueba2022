package ar.edu.unju.fi.proyecto1010.ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes = 0;
        String resp = "s";
        String nombreMes = "";
        boolean noMes=false;

        System.out.println("------ Verificar Mes -------");
        while (resp.equalsIgnoreCase("s")) {
            try {
                System.out.print("Ingrese un Número:");
                mes = entrada.nextInt();
                switch (mes) {
                    case 1:
                        nombreMes = "Enero";
                        break;
                    case 2:
                        nombreMes = "Febrero";
                        break;
                    case 3:
                        nombreMes = "Marzo";
                        break;
                    case 4:
                        nombreMes = "Abril";
                        break;
                    case 5:
                        nombreMes = "Mayo";
                        break;
                    case 6:
                        nombreMes = "Junio";
                        break;
                    case 7:
                        nombreMes = "Julio";
                        break;
                    case 8:
                        nombreMes = "Agosto";
                        break;
                    case 9:
                        nombreMes = "Septiembre";
                        break;
                    case 10:
                        nombreMes = "Octubre";
                        break;
                    case 11:
                        nombreMes = "Noviembre";
                        break;
                    case 12:
                        nombreMes = "Diciembre";
                        break;                    
                    default:
                        System.out.println("No existe ese mes");
                        noMes=true;
                        break;
                }
                if (!noMes) {
                    System.out.println("Mes de: " + nombreMes);
                    System.out.println("----------------------------------------------");
                    System.out.print("Desea ingresar otro valor? S/N: ");
                    resp=entrada.next();
                } else {
                    break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("No valido");
                break;
            }
        }
        entrada.close();
    }
}
