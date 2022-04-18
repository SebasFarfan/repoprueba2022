package ar.edu.unju.fi.proyecto1010.ejercicio15;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método que determina la cantidad de años que tiene una persona según su fecha
     * de nacimiento.
     * 
     * @return int
     */
    public int determinarCantidadAños() {
        Period tiempo = Period.between(this.fechaNacimiento, LocalDate.now());
        return tiempo.getYears();
    }

    /**
     * Método que determina el signo del zodiaco según fecha de nacimiento
     * 
     * @return string
     */
    public String determinarSignoZodiaco() {
        String signo = "";
        int anio = this.fechaNacimiento.getYear();
        if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 3, 20))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 4, 21)))
            signo = "Aries";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 4, 20))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 5, 22)))
            signo = "Tauro";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 5, 21))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 6, 22)))
            signo = "Geminis";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 6, 21))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 7, 23)))
            signo = "Cancer";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 7, 22))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 8, 24)))
            signo = "Leo";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 8, 23))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 9, 24)))
            signo = "Virgo";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 9, 23))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 10, 24)))
            signo = "Libra";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 10, 23))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 11, 23)))
            signo = "Escorpio";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 11, 22))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 12, 22)))
            signo = "Sagitario";
        // else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 12, 21))
        // && this.fechaNacimiento.isBefore(LocalDate.of(anio+1, 1, 21)))
        // signo = "Capricornio";
        else if ((this.fechaNacimiento.isAfter(LocalDate.of(anio, 12, 21))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio + 1, 1, 1))) ||
                (this.fechaNacimiento.isAfter(LocalDate.of(anio - 1, 12, 31)) &&
                        this.fechaNacimiento.isBefore(LocalDate.of(anio, 1, 21))))
            signo = "Capricornio";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 1, 20))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 2, 19)))
            signo = "Acuario";
        else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 2, 18))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 3, 21)))
            signo = "Piscis";

        return signo;

    }

    /**
     * Método que determina la estación del año según la fecha de nacimiento.
     * 
     * @return string
     */
    public String determinarEstacion() {
        String estacion = "";
        int anio = this.fechaNacimiento.getYear();
        if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 3, 20))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 6, 21))) {
            estacion = "Otoño";

        } else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 6, 20))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 9, 21))) {
            estacion = "Invierno";
        } else if (this.fechaNacimiento.isAfter(LocalDate.of(anio, 9, 20))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio, 12, 21))) {
            estacion = "Primavera";
        } else if ((this.fechaNacimiento.isAfter(LocalDate.of(anio, 12, 20))
                && this.fechaNacimiento.isBefore(LocalDate.of(anio+1, 1, 1))) ||
                (this.fechaNacimiento.isAfter(LocalDate.of(anio-1,12,31)) && 
                this.fechaNacimiento.isBefore(LocalDate.of(anio, 3, 21)))){
            estacion = "Verano";
        }

    return estacion;
}

}
