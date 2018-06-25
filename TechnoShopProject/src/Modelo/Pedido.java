/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author A13003988
 */
public class Pedido {

    private int NoPedido;
    private Producto list;
    private String fecha;
    
    public int getNoPedido() {
        return NoPedido;
    }

    public void asignarNoPedido(int NoPedido) {
        this.NoPedido = NoPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha() {
        // prints "Sep 6, 2009 9:03:20 PM"
        DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
        fecha = dateTimeInstance.format(Calendar.getInstance().getTime());    
    }
}
