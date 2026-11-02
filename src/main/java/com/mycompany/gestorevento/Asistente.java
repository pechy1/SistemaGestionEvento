/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorevento;

/**
 *
 * @author luanm
 */
import java.util.ArrayList;
import java.util.List;

public class Asistente extends Persona {
    private static final double TARIFA_AFILIADA=0.0;
    private static final double TARIFA_PLENA=0.0;
    private List<Track> tracksInscritos;
    private List<Charla> charlasSeleccionadas;
    public Asistente(String cedula, String nombre, String correo, String telefono, Institucion institucion){
        super(cedula,nombre,correo,telefono,institucion);
        this.tracksInscritos= new ArrayList<>();
        this.charlasSeleccionadas = new ArrayList<>();
    }
    @Override
    public String getRol(){
        return "Asistente";
    }
    @Override
    public String generarContenidoCertificado(Evento e){
        return "Certificamos que " + nombre
                + " participo en el evento " + e.getNombre()
                + " realizado en " + e.getLugar()
                + " durante las fechas " + e.getRangofechas();
    }
    public boolean agregarTrack(Track t){
        if (t != null && !tracksInscritos.contains(t)){
            tracksInscritos.add(t);
            return true;
                
        }
        return false;
    }
    public boolean agregarCharla(Charla c){
        if (c != null && !charlasSeleccionadas.contains(c)){
            charlasSeleccionadas.add(c);
            return true;
        }
        return false;
    }
    @Override
    public double calcularValorInscripcion(){
        if (institucion != null && institucion.esAfiliada()){
            return TARIFA_AFILIADA;
        } else{
            return TARIFA_PLENA;
        }
    
}
}
