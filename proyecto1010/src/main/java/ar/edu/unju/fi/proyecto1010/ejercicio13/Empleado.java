package ar.edu.unju.fi.proyecto1010.ejercicio13;

import java.time.LocalDate;

public class Empleado {
    private String Nombre;
    private LocalDate fechaIngreso;
    private int legajo;
    private String email;
    private double sueldo;
    private int horasTrabajo;

    /**
     * Costructor por defecto
     */
    public Empleado() {
    }

    /**
     * Constructor con todos los parametros
     * 
     * @param Nombre
     * @param fechaIngreso
     * @param legajo
     * @param email
     * @param sueldo
     * @param horasTrabajo
     */
    public Empleado(String Nombre, LocalDate fechaIngreso, int legajo, String email, double sueldo, int horasTrabajo) {
        this.Nombre = Nombre;
        this.fechaIngreso = fechaIngreso;
        this.legajo = legajo;
        this.email = email;
        this.sueldo = sueldo;
        this.horasTrabajo = horasTrabajo;
    }

    /**
     * Constructor con todos los parametros excepto el sueldo.
     * 
     * @param Nombre
     * @param fechaIngreso
     * @param legajo
     * @param email
     * @param horasTrabajo
     */
    public Empleado(String Nombre, LocalDate fechaIngreso, int legajo, String email, int horasTrabajo) {
        this.Nombre = Nombre;
        this.fechaIngreso = fechaIngreso;
        this.legajo = legajo;
        this.email = email;
        this.horasTrabajo = horasTrabajo;
    }


    /**
     * Constructor con tres parámetros 
     * @param Nombre
     * @param legajo
     * @param horasTrabajo
     */
    public Empleado(String Nombre, int legajo, int horasTrabajo) {
        this.Nombre = Nombre;
        this.legajo = legajo;
        this.horasTrabajo = horasTrabajo;
        this.fechaIngreso = LocalDate.of(1900, 1, 1);
        this.email="";
    }


    /**
     * Constructor con 3 parámetros.
     * @param Nombre
     * @param fechaIngreso
     * @param horasTrabajo
     */
    public Empleado(String Nombre, LocalDate fechaIngreso, int horasTrabajo) {
        this.Nombre = Nombre;
        this.fechaIngreso = fechaIngreso;
        this.horasTrabajo = horasTrabajo;
        this.legajo = -9999;
        this.email="";
    }


    public Empleado(String Nombre, int horasTrabajo) {
        this.Nombre = Nombre;
        this.horasTrabajo = horasTrabajo;
        this.legajo = -9999;
        this.fechaIngreso = LocalDate.of(1900, 1, 1);
        this.email="";
    }




    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getLegajo() {
        return this.legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public int getHorasTrabajo() {
        return this.horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }


    public void determinarSueldo() {
        if (horasTrabajo <= 160) {
            this.sueldo = horasTrabajo * 600;
        } else {
            this.sueldo = 160 * 600 + (horasTrabajo - 160) * 650;
        }

    }


    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", fechaIngreso='" + getFechaIngreso() + "'" +
            ", legajo='" + getLegajo() + "'" +
            ", email='" + getEmail() + "'" +
            ", sueldo='" + getSueldo() + "'" +
            ", horasTrabajo='" + getHorasTrabajo() + "'" +
            "}";
    }


}
