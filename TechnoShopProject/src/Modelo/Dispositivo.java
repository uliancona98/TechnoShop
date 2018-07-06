/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 * Clase que representa un objeto Dispositivo, esta es una subclase de la clase producto
 */
public class Dispositivo extends Producto{
    /**
    * Constructor que llama al constructor de la superclase Producto
    */
    public Dispositivo() {
        super();
    }
    /**
    * Metodo heredado de la superclase Producto
    */
    @Override
    public void setInformacionCategoria(){
        informacionCategoria = "Computadoras y celulares";
    }
}
