package ar.edu.unju.fi.proyecto1010.ejercicio15;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Persona p = new Persona("Sebastián", "Farfán", LocalDate.of(1982, 12, 26));
        System.out.println("Apellido y Nombre:"+p.getApellido()+", "+p.getNombre());
        System.out.println("Edad:"+p.determinarCantidadAños()+" años.");
        System.out.println("Signo del zodiaco: "+p.determinarSignoZodiaco());
        System.out.println("Estación: "+p.determinarEstacion());        
    }
}
