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
public class Institucion implements Serializable {
    private String nombre;
    private boolean afiliada;
    public Institucion(String nombre, boolean afiliada){
        this.nombre = nombre;
        this.afiliada = afiliada;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean isAfiliada(){
        return afiliada;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setAfiliada(boolean afiliada){
        this.afiliada=afiliada;
   
    }
    public boolean esAfiliada(){
        return afiliada;
    }
}
