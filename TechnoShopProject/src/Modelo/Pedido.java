/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author A13003988
 */
public class Pedido {

    private int NoPedido;
    private ArrayList<Producto> productos = new ArrayList();
    private String fecha;
    private double total;
    /**
     * En este metodo se devuelve el total de pago respecto al pedido
     * @return double
     */
    public double getTotal() {
        return total;
    }
    /**
     * En este metodo se define o declara el total de pago respecto al pedido
     * @param total 
     */
    public void setTotal(double total) {
        this.total = total;
    }
    /**
     * En este metodo se devuelve el atributo NoPedido
     * @return integer
     */
    public int getNoPedido() {
        return NoPedido;
    }
    /**
     * En este metodo se define y agrega producto al pedido
     * @param producto 
     */
    public void setProducto(Producto producto){
        productos.add(producto);
    }
    /**
     * En este metodo se devuelve el arreglo de productos
     * @return ArrayList
     */
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    /**
     * En este metodo se define el NoPedido
     * @param NoPedido 
     */
    public void setNoPedido(int NoPedido) {
        this.NoPedido = NoPedido;
    }
    /**
     * En este metodo devuelve la fecha del pedido
     * @return 
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * En este metodo se define la fecha del pedido
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
