package ar.edu.unju.fi.proyecto1010.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        LocalDate f1 = LocalDate.of(2022, 1, 20);
        LocalDate f2 = LocalDate.of(2022, 1, 27);
        ProcesoFecha pf1 = new ProcesoFecha(f1, f2);
        System.out.println("Fecha1: " + pf1.formatearFecha(pf1.getFecha1()));
        System.out.println("Fecha2: " + pf1.formatearFecha(pf1.getFecha2()));
        // -------------------------------------------------------------------------------
        LocalTime h1 = LocalTime.of(22, 0);
        LocalTime h2 = LocalTime.of(19, 5);
        ProcesoFecha pf2 = new ProcesoFecha(h1, h2);
        pf2.setTime1(h1.plusHours(5));
        pf2.setTime2(h2.minusMinutes(20));
        System.out.println("Hora1:" + pf2.getTime1());
        System.out.println("Hora2:" + pf2.getTime2());
        // -------------------------------------------------------------------------------
        System.out.println(pf1.compararFechas());
        // -------------------------------------------------------------------------------
        LocalDateTime ldt1 = LocalDateTime.of(f1, h1);
        LocalDateTime ldt2 = LocalDateTime.of(f2, h2);
        ProcesoFecha pf3 = new ProcesoFecha(ldt1, ldt2);
        System.out.println("Fecha 1: " + pf3.getDateTime1());
        System.out.println("Fecha 2: " + pf3.getDateTime2());
        // -------------------------------------------------------------------------------
        LocalDate fechaNac=LocalDate.of(1982, 12, 26);
        LocalDate fechaActual=LocalDate.now();
        ProcesoFecha pf4 = new ProcesoFecha(fechaNac, fechaActual);
        Period tiempo=pf4.contarTiempoTranscurrido();
        System.out.println("Han transcurrido "+tiempo.getYears()+" años, "+tiempo.getMonths()+" meses y "+
        tiempo.getDays()+" días desde la fecha "+pf4.formatearFecha(pf4.getFecha1())+" hasta la fecha "+
        pf4.formatearFecha(pf4.getFecha2()));
        // -------------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String fecha = "";
        ProcesoFecha pf5=new ProcesoFecha();
        while (true) {
            try {
                System.out.print("Ingrese una fecha dd/MM/yyyy : ");
                fecha = entrada.next();
                LocalDate f = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                pf5.setFecha1(f);
                LocalDate fIncrementada=pf5.getFecha1().plusDays(365);
                System.out.println("Valor de Fecha Incrementada:"+pf5.formatearFecha(fIncrementada));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha Invalida!!");
                System.out.println("Intente de nuevo.");
                entrada.next();
            }
        }
        System.out.println("----------------------------------------------------------------------");
        while (true) {
            try {
                System.out.print("Ingrese una fecha dd/MM/yyyy : ");
                fecha = entrada.next();
                LocalDate fe2 = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                pf5.setFecha2(fe2);
                LocalDate fDecrementada=pf5.getFecha2().minusMonths(6);
                System.out.println("Valor de Fecha decrementada:"+pf5.formatearFecha(fDecrementada));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha Invalida!!");
                System.out.println("Intente de nuevo.");
                entrada.next();
            }            
        }
        entrada.close();
    }
}
