package ar.edu.unju.fi.proyecto1010.ejercicio13;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        e.setNombre("Farfán, Sebastián");
        e.setFechaIngreso(LocalDate.of(2020, 9, 15));
        e.setLegajo(4773);
        e.setEmail("sebas.654@gmail.com");
        e.setHorasTrabajo(180);
        e.determinarSueldo();
        System.out.println("------------ Empleado ------------");
        System.out.println("Nombre: "+e.getNombre());
        System.out.println("Fecha Ingreso: "+ e.getFechaIngreso());
        System.out.println("Legajo: "+e.getLegajo());
        System.out.println("Correo: "+e.getEmail());
        System.out.println("Horas de Trabajo: "+e.getHorasTrabajo());
        System.out.println("Sueldo: "+e.getSueldo());


    }
}
