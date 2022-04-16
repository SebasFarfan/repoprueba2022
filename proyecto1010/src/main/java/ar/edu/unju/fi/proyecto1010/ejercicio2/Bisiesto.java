package ar.edu.unju.fi.proyecto1010.ejercicio2;

import java.util.Scanner;

public class Bisiesto {
    // private int anio;

    public boolean esBisiesto(int anio){
        
        return (((anio % 4)==0 && !((anio % 100)==0)) || ((anio % 400)==0));
    }


    // public int getAnio() {
    //     return this.anio;
    // }

    // public void setAnio(int anio) {
    //     this.anio = anio;
    // }

    public void determinarBisiesto(){
        Scanner entrada = new Scanner(System.in);
        int anio = 0;
        System.out.println("**************** Determinar si un año es bisieto ****************");
        String resp = "";
        while (!(resp.equalsIgnoreCase("n"))) {
            System.out.print("Ingrese un año: ");
            try {
                anio = entrada.nextInt();
                if (esBisiesto(anio)) {
                    System.out.println("El año "+ anio + " es Bisiesto !!");
                } else {
                System.out.println("El año "+ anio + " NO es Bisiesto");
                }
                System.out.println("¿Desea Verificar otro año? S/N");
                resp = entrada.next().toLowerCase();
                
            } catch (Exception e) {
                System.out.println("El valor ingresado no es valido!!");
                break;
            }                        
        }
        
        entrada.close();
    }
    
}
