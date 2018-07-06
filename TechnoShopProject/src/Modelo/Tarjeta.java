/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 */
public class Tarjeta {
    private String titular;
    private String noTarjeta;
    private String fechaVencimiento;
    /**
     * Metodo en el que se obtiene el titular de la tarjeta
     * @return String devuelve el titular de la tarjeta
     */
    public String getTitular() {
        return titular;
    }
    /**
     * Metodo donde se define el titular de la tarjeta
     * @param titular parametro que recibe el titular de la tarjeta
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }
    /**
     * Metodo en el que se obtiene la fecha de vencimiento
     * @return String devuelve la fecha de vencimiento de la tarjeta
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    /**
     * Metodo donde se define la fecha de vencimiento de la tarjeta
     * @param fechaVencimiento parametro que recibe la fecha de vencimiento de la tarjeta
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    /**
     * Metodo donde se devuelve el Numero de tarjeta
     * @return String devuelve el numero de la tarjeta
     */
    public String getNoTarjeta() {
        return noTarjeta;
    }
    /**
     * Metodo donde se define el Numero de tarjeta
     * @param noTarjeta parametro que recibe el numero de la tarjeta
     */
    public void setNoTarjeta(String noTarjeta) {
        this.noTarjeta = noTarjeta;
    }
}
