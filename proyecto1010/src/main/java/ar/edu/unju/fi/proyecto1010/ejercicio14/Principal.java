package ar.edu.unju.fi.proyecto1010.ejercicio14;

import java.time.LocalDate;

import ar.edu.unju.fi.proyecto1010.ejercicio13.Empleado;

public class Principal {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Farfan, Sebastián", LocalDate.of(2020, 12, 10),180);
        Empleado e3 = new Empleado("Flores Eduardo", 1889, 160);
        Empleado e4 = new Empleado("Rodriguez Juan", 170);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
    }
}
