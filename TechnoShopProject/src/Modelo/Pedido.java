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
     * @return double devuelve el total 
     */
    public double getTotal() {
        return total;
    }
    /**
     * En este metodo se define o declara el total de pago respecto al pedido
     * @param total recibe el total
     */
    public void setTotal(double total) {
        this.total = total;
    }
    /**
     * En este metodo se devuelve el atributo NoPedido
     * @return integer retorna el numero de pedido
     */
    public int getNoPedido() {
        return NoPedido;
    }
    /**
     * En este metodo se define y agrega producto al pedido
     * @param producto recibe el producto
     */
    public void setProducto(Producto producto){
        productos.add(producto);
    }
    /**
     * En este metodo se devuelve el arreglo de productos
     * @return ArrayList retorna la lista de productos
     */
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    /**
     * En este metodo se define el NoPedido
     * @param NoPedido recibe el numero de pedido
     */
    public void setNoPedido(int NoPedido) {
        this.NoPedido = NoPedido;
    }
    /**
     * En este metodo devuelve la fecha del pedido
     * @return String devuelve la fecha del pedido
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * En este metodo se define la fecha del pedido
     * @param fecha recibe como parametro la fecha del pedido
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
