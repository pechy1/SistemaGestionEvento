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
public abstract class Persona implements Serializable {
    protected String cedula;
    protected String nombre;
    protected String correo;
    protected String telefono;
    protected Institucion institucion;

    public Persona(String cedula, String nombre, String correo, String telefono, Institucion institucion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.institucion = institucion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
    public abstract double calcularValorInscripcion();
    public abstract String getRol();
    public abstract String generarContenidoCertificado(Evento e);
}
