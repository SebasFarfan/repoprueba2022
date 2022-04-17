package ar.edu.unju.fi.proyecto1010.ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int mes = 0;
        String resp = "s";
        String nombreMes="";

        System.out.println("------ Verificar Mes -------");
        while (resp.equalsIgnoreCase("s")) {
            try {
                System.out.print("Ingrese un Número:");
                mes = entrada.nextInt();
                if (mes==1) 
                    nombreMes="Enero";
                else if (mes==2)
                    nombreMes="Febrero";
                else if (mes==3)
                    nombreMes="Marzo";
                else if (mes==4)
                    nombreMes="Abril";
                else if (mes==5)
                    nombreMes="Mayo";
                else if (mes==6)
                    nombreMes="Junio";
                else if (mes==7)
                    nombreMes="Julio";
                else if (mes==8)
                    nombreMes="Agosto";
                else if (mes==9)
                    nombreMes="Septiembre";
                else if (mes==10)
                    nombreMes="Octubre";
                else if (mes==11)
                    nombreMes="Noviembre";
                else if (mes==12)
                    nombreMes="Diciembre";
                else{
                    System.out.println("No existe ese Mes");
                    break;
                }                
                System.out.println("Mes: " + nombreMes);
                System.out.println("----------------------------------");
                System.out.println("¿Desea Ingresar otro mes? S/N");
                resp=entrada.next();

            } catch (InputMismatchException e) {
                System.out.println("No valido");                
                break;
            }

        }
        entrada.close();
    }

}
