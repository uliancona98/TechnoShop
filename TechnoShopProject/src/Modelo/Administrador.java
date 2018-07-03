/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author A13003988
 */
public class Administrador extends Cuenta{

    private Bodega bodega = new Bodega();
    /**
     * @deprecated metodo que no se esta utilizando en este momento
     */
    public void AnadirProducto(){
        bodega.AnadirProducto();
    }
    /**
     * @deprecated metodo que no se esta utilizando en este momento
     */
    public void RetirarProducto(){
        bodega.RemoverProducto();
    }
    /**
     * @deprecated metodo que no se esta utilizando en este momento
     */
    public void PedirLista(){
        //bodega.getListaDeProductos();
    }
}
