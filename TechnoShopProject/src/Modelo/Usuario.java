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
   private ArrayList <Pedido> pedidos;

    public Membresia getMembresia() {
        return membresia;
    }
    public void setCarritoProducto(Producto producto){
        if(carrito==null){
            carrito=new Carrito();
            carrito.agregarProducto(producto);
        }else{
            carrito.agregarProducto(producto);
        }
        
    }
    public Carrito getCarrito(){
        return carrito;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public ArrayList <Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        if(pedidos==null){
            pedidos = new ArrayList();
            pedidos.add(pedido);
        }else{
            pedidos.add(pedido);
        }
    }
    
    public void setTarjeta(Tarjeta tarjeta){
        this.tarjeta=tarjeta;
    }
    
    public Tarjeta getTarjeta(){
        return tarjeta;
    }
   
}
