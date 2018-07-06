/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 * Clase que representa el carrito donde almacena los productos que el usuario
 * va ingresando
 */
public class Carrito {
    private ArrayList<Producto> productos = new ArrayList();
    /**
     * Metodo que permite agregar productos al carrito
     * @param producto es el parametro que se recibe en el arreglo
     */
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    /**
     * Metodo en el que se obtiene dato del arreglo de productos
     * @return ArrayList este metodo muestra la lista de productos
     */
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    /**
     * Metodo que permite eliminar productos del carrito
     * @param indice parametro que representa la posicion del producto en
     * el cual se eliminara
     */
    public void removerProducto(int indice){
        try{
            productos.remove(indice);
        }catch(Exception e){
            System.out.println("No se puede remover el producto");
        }
    }
}
