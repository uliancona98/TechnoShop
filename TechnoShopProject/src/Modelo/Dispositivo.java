/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Asus
 */
public class Dispositivo extends Producto{

    public Dispositivo() {
        super();
    }
    
    
    @Override
    public void setInformacionCategoria(){
        informacionCategoria = "Computadoras y celulares";
    }
}
