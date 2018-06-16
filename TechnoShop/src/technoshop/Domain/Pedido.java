/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author A13003988
 */
public class Pedido {

    private int NoPedido;
    private String Fecha;

    public int getNoPedido() {
        return NoPedido;
    }

    public void asignarNoPedido(int NoPedido) {
        this.NoPedido = NoPedido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

}
