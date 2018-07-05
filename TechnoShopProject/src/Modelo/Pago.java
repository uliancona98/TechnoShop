/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Juan D.M
 */
public abstract class Pago {
    protected double cantidad;
    /**
     * Metodo que devuelve la cantidad que se necesita pagar
     * @return double retorna la cantidad de pago
     */
    public double getCantidad() {
        return cantidad;
    }
/**
 * Metodo en el cual se define la cantidad que se necesita pagar
 * @param cantidad define la cantidad de pago
 */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
