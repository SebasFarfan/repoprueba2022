package ar.edu.unju.fi.proyecto1010.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
    
    private LocalDate fecha1;
    private LocalDate fecha2;
    private LocalTime time1;
    private LocalTime time2;
    private LocalDateTime dateTime1;
    private LocalDateTime dateTime2;


    public ProcesoFecha() {
    }

    /**
     * Constructor sobrecargado con parametros de tipo LocalDate
     * @param fecha1
     * @param fecha2
     */
    public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
    }

    /**
     * Constructor sobrecargado con parámetros de tipo LocalTime
     * @param time1
     * @param time2
     */
    public ProcesoFecha(LocalTime time1, LocalTime time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    /**
     * Constructor sobrecargado con parámetros de tipo LocalDateTime
     * @param dateTime1
     * @param dateTime2
     */    
    public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        this.dateTime1 = dateTime1;
        this.dateTime2 = dateTime2;
    }

    public LocalDate getFecha1() {
        return this.fecha1;
    }

    public void setFecha1(LocalDate fecha1) {
        this.fecha1 = fecha1;
    }

    public LocalDate getFecha2() {
        return this.fecha2;
    }

    public void setFecha2(LocalDate fecha2) {
        this.fecha2 = fecha2;
    }

    public LocalTime getTime1() {
        return this.time1;
    }

    public void setTime1(LocalTime time1) {
        this.time1 = time1;
    }

    public LocalTime getTime2() {
        return this.time2;
    }

    public void setTime2(LocalTime time2) {
        this.time2 = time2;
    }

    public LocalDateTime getDateTime1() {
        return this.dateTime1;
    }

    public void setDateTime1(LocalDateTime dateTime1) {
        this.dateTime1 = dateTime1;
    }

    public LocalDateTime getDateTime2() {
        return this.dateTime2;
    }

    public void setDateTime2(LocalDateTime dateTime2) {
        this.dateTime2 = dateTime2;
    }

    /**
     * Método que muestra la cantidad de años, meses y días que han
     * transcurrido entre fecha1 y fecha2.

     * @return Period
     */
    public Period contarTiempoTranscurrido() {
        
        return Period.between(this.fecha1, this.fecha2);
    }
    
    /**
     * Método que devuelve una cadena de texto con el valor de alguna 
     * fecha de tipo LocalDAte formateado con el siguiente formato dd/MM/yyyy.
     * @param fecha de tipo LocalDate
     * @return String
     */
    public String formatearFecha(LocalDate fecha){
        String fechaFormateada="";
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechaFormateada=fecha.format(formato);
        return fechaFormateada;
    }

    /**
     * Método que compara dos fechas LocalDate fecha1 y LocalDate fecha2.
     * Si fecha1 es mayor que fecha2, mostrar el mensaje 
     * “La fecha fecha1 es posterior a la fecha fecha2”.
     * Si fecha1 no es mayor que fechas2 entonces mostrar 
     * “La fecha1 es anterior a fecha2”, si no se cumple alguno 
     * de los casos, son iguales.
     * @return String
     */
    public String compararFechas(){
        String salida = "";
        if (this.fecha1.isAfter(this.fecha2))
            salida = this.formatearFecha(this.fecha1)+" es Mayor a "+this.formatearFecha(this.fecha2);
        else if(this.fecha1.isBefore(this.fecha2))
            salida = this.formatearFecha(this.fecha1)+" es Menor a "+this.formatearFecha(this.fecha2);
        else if(this.fecha1.isEqual(this.fecha2))
            salida = this.formatearFecha(this.fecha1)+" es Igual a "+this.formatearFecha(this.fecha2);
        return salida;
    }

}
