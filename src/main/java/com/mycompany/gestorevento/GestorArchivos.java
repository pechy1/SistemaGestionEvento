/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorevento;

/**
 *
 * @author luanm
 */
import java.io.*;
import java.util.*;
public class GestorArchivos {
    private String rutaArchivo;
    
    public GestorArchivos(String rutaArchivo){
        
        this.rutaArchivo= rutaArchivo;
        
        File carpeta = new File(rutaArchivo);
        carpeta.mkdirs();
    }
    public void guardarPersonas(List<Persona> lista){
        guardarLista(lista, "personas.dat");
    }
    public void guardarTracks(List<Track> lista){
        guardarLista(lista, "tracks.dat");
     }
     public void guardarInscripciones(List<Inscripcion> lista){
        guardarLista(lista, "Inscripciones.dat");
     }
     private void guardarLista(List<?> Lista, String nombreArchivo){
         File archivo = new File(rutaArchivo, nombreArchivo);
         
         try (ObjectOutputStream salida=
                 new ObjectOutputStream(new FileOutputStream(archivo))){
             salida.writeObject(lista);
             System.out.println("Archivo guardado correctamente.");
             
         } catch(IOException e){
             System.out.println("Error al guardar: "+ e.getMessage());
         }
     }
     public List<Persona> cargarPersonas(){
         return cargarLista("persona.dat");
     }
     public List<Track> cargarTrack(){
         return cargarLista("tracks.dat");
     }
     public List<Inscripcion> cargarInscripciones(){
         return cargarLista("inscipciones.dat");
     }
     private <T> List<T> cargarLista(String nombreArchivo){
         File archivo = new File(rutaArchivo, nombreArchivo);
         if (!archivo.exists()){
             return new Arraylist<>();
             
         }
         try (ObjectInputStream entrada = new objectInputStream(new FileInputStream(archivo))){
             return (List<T>) entrada.readObject();
             
         } catch (IOException ClassNotFoundException e){
             System.out.println("Error al cargar: " + e.getMessage());
             return new Arraylist<>();
         }
     }
}

