/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author master
 */
public class JornadaLaboral {
    int horaInicio, minInicio;
    int horaFin, minFin;
    LocalDate fecha = LocalDate.now();
    
    //otra forma de fecha
    
    Date fecha1 = new Date();
    
    
    
    public JornadaLaboral(int horaInicio, int minInicio, int horaFin, int minFin){
    
        
        this.horaInicio = horaInicio;
        this.minInicio = minInicio;
        this.horaFin = horaFin;
        this.minFin = minFin;
        
        LocalTime horarioInicio = LocalTime.of(horaInicio, minInicio);
        LocalTime horarioFin = LocalTime.of(horaFin, minFin);
        
        System.out.println("Hora de Inicio: " + horarioInicio);
        System.out.println("Hora de Fin: " + horarioFin);
        System.out.print("Fecha: ");
        fechaToString();
        
        
        
        
        
    }
    
    private void fechaToString(){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String fecha1_str = sdf.format(fecha1);
    System.out.println(fecha1_str);
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getMinInicio() {
        return minInicio;
    }

    public void setMinInicio(int minInicio) {
        this.minInicio = minInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public int getMinFin() {
        return minFin;
    }

    public void setMinFin(int minFin) {
        this.minFin = minFin;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Date getFecha1() {
        return fecha1;
    }

    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }
    
    
    
}
