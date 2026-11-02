/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorevento;

/**
 *
 * @author luanm
 */
import java.io.Serializable;
import java.time.LocalDate;

public class Evento implements Serializable  {
    private String nombre;
    private String lugar;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String logoRuta;

    public Evento(String nombre, String lugar, LocalDate fechaInicio, LocalDate fechaFin, String logoRuta) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.logoRuta = logoRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getLogoRuta() {
        return logoRuta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setLogoRuta(String logoRuta) {
        this.logoRuta = logoRuta;
    }
    public String getRangofechas(){
        return fechaInicio + " - " + fechaFin;
    }
}
