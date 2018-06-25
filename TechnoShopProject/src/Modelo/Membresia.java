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
public class Membresia {
    private String tipo;
    private double puntos=0;
    private double valorCompras=0;
    protected Membresia membresia;
    Pago pago=new Pago();
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    
    public void cambiarMembresia(){
        if(valorCompras>=2000 && tipo.equals("Nivel 1")){
            tipo="Nivel 2";
        }
        if(valorCompras>=5000 && tipo.equals("Nivel 2")){
            tipo="Nivel 3";
        }
    }
    public void pagoMenbresia(double puntosUtilizar){
        if(puntosUtilizar>puntos){
            JOptionPane.showMessageDialog(null,"No tiene suficientes puntos");
        }else if(puntosUtilizar<=puntos){
            puntos=puntos-puntosUtilizar;
        }
        
    }
    
    public void acumularPuntos(double pago)
    {       
        if(tipo.equals("Nivel 1")){
            puntos=puntos+(.05*pago);
            
        }
        if(tipo.equals("Nivel 2")){
            puntos=puntos+(.10*pago);
            
        }
        if(tipo.equals("Nivel ")){
            puntos=puntos+(.15*pago);
            
        }
        
    }
}
