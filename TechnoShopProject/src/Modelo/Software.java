/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 */
public class Software extends Producto{
    /**
    * Constructor que llama al constructor de la superclase Producto
    */
    public Software() {
        super();
    }
    /**
     * Metodo heredado de la superclase Producto
     */
    @Override
    public void setInformacionCategoria(){
        informacionCategoria = "Videojuegos y peliculas";
    }
}
