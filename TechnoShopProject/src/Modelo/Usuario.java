/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author A13003988
 */
public class Usuario extends Cuenta {
   private Membresia membresia;
   private Carrito carrito=null;
   private Tarjeta tarjeta=null;
   private ArrayList <Pedido> pedidos=null;
    /**
     * Metodo donde se obtiene la membresia del usuario
     * @return membresia
     */
    public Membresia getMembresia() {
        return membresia;
    }
    /**
     * Metodo donde se agrega producto al carrito por parte del usuario, si el
     * carrito esta vacio se crea una nueva instancia de el, si existe alguno
     * solo se agrega un producto a el.
     * @param producto 
     */
    public void setCarritoProducto(Producto producto){
        if(carrito==null){
            carrito=new Carrito();
            carrito.agregarProducto(producto);
        }else{
            carrito.agregarProducto(producto);
        }
        
    }
    /**
     * Metodo que devuelve el carrito del usuario
     * @return carrito
     */
    public Carrito getCarrito(){
        return carrito;
    }
    /**
     * Metodo donde se define la membresia del usuario
     * @param membresia 
     */
    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
    /**
     * Metodo donde se devuelve una lista de los pedidos por parte del usuario
     * @return ArrayList
     */
    public ArrayList <Pedido> getPedidos() {
        return pedidos;
    }
    /**
     * Metodo donde se agregan los pedidos, si no hay ninguno se crea una nueva
     * instancia de esta lista, sino simplemente se agrega un nuevo pedido
     * @param pedido 
     */
    public void addPedido(Pedido pedido) {
        if(pedidos==null){
            pedidos = new ArrayList();
            pedidos.add(pedido);
        }else{
            pedidos.add(pedido);
        }
    }
    /**
     * Metodo en el que se define la tarjeta del usuario
     * @param tarjeta 
     */
    public void setTarjeta(Tarjeta tarjeta){
        this.tarjeta=tarjeta;
    }
    /**
     * Metodo en que devuelve la tarjeta del usuario
     * @return 
     */
    public Tarjeta getTarjeta(){
        return tarjeta;
    }
   
}
