/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Juan D.M
 */
public class Carrito {
    private ArrayList<Producto> productos = new ArrayList();
    /**
     * Metodo que permite agregar productos al carrito
     * @param producto 
     */
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    /**
     * Metodo en el que se obtiene dato del arreglo de productos
     * @return ArrayList
     */
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    /**
     * Metodo que permite eliminar productos del carrito
     * @param indice 
     */
    public void removerProducto(int indice){
        try{
            productos.remove(indice);
        }catch(Exception e){
            System.out.println("No se puede remover el producto");
        }
    }
}
