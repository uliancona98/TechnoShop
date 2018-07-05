/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author A13003988
 */
public class Membresia{
    private String tipo;
    private double puntos=0;
    private double valorCompras=0;
    /**
     * Devuelve el tipo de membresia
     * @return String retorna el tipo de membresia
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * En este metodo se define el tipo de membresia
     * @param tipo define el tipo de compra
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * En este metodo se define el atributo valorCompras
     * @param valorCompras parametro que define el valor de compras
     */
    public void setValorCompras(double valorCompras){
        this.valorCompras = valorCompras;
    }
    /**
     * En este metodo se devuelve el valorCompras
     * @return double devuelve el valor de compras
     */
    public double getValorCompras(){
        return valorCompras;
    }
    /**
     * En este metodo se devuelven los puntos de la membresia
     * @return double devuelve los puntos de la membresia
     */
    public double getPuntos() {
        return puntos;
    }
    /**
     * Metodo donde se definen los puntos de la membresia
     * @param puntos parametro que define los puntos de la membresia
     */
    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    /**
     * Actualiza si la membresia si el monto total de compras que ha hecho supera los $2000 a $5000 pesos
     */
    public void cambiarMembresia(){
        if(valorCompras>=2000 && tipo.equals("Nivel 1")){
            tipo="Nivel 2";
        }
        if(valorCompras>=5000 && tipo.equals("Nivel 2")){
            tipo="Nivel 3";
        }
    }
  /**
   * En este metodo acumula los puntos dependiendo del pago del pedido que haya hecho el cliente
   * @param pago parametro que recibe la cantidad de pago
   */
    public void acumularPuntos(double pago)
    {       
        valorCompras = valorCompras + pago;
        if(tipo.equals("Nivel 1")){
            puntos=puntos+(.05*pago);
        }
        if(tipo.equals("Nivel 2")){
            puntos=puntos+(.10*pago);
        }
        if(tipo.equals("Nivel ")){
            puntos=puntos+(.15*pago);  
        }
        cambiarMembresia();
        
    }
}
