/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorevento;

/**
 *
 * @author luanm
 */
public class Ponente extends Persona{
    public static final double TARIFA_AFILIADA=0.0;
    public static final double TARIFA_PLENA=0.0;
    
    private String hojaDeVida;
    private Charla charla;
    public Ponente(String cedula, String nombre, String correo, String telefono, Institucion institucion, String hojaDeVida, Charla charla){
        super(cedula,nombre,correo,telefono,institucion);
        this.hojaDeVida=hojaDeVida;
        this.charla=charla;
    }
    @Override
    public double calcularValorInscripcion(){
        if(institucion != null && institucion.esAfiliada()){
            return TARIFA_AFILIADA;
            
        } else{
            return TARIFA_PLENA;
        }
    }
    @Override
    public String getRol(){
        return "Ponente ";
    }
    @Override
    public String generarContenidoCertificado(Evento e){
        return "Certificamos que " + nombre
                + " participo como ponente en el evento "
                + e.getNombre();
    }

    public String getHojaDeVida() {
        return hojaDeVida;
    }

    public Charla getCharla() {
        return charla;
    }

    public void setHojaDeVida(String hojaDeVida) {
        this.hojaDeVida = hojaDeVida;
    }

    public void setCharla(Charla charla) {
        this.charla = charla;
    }
    
    
    
}
