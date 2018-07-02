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

    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
    public int getNoPedido() {
        return NoPedido;
    }
    
    public void setProducto(Producto producto){
        productos.add(producto);
    }
    
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    
    public void setNoPedido(int NoPedido) {
        this.NoPedido = NoPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
