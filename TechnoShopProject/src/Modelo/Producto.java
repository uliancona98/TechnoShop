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
public class Producto {
    protected String Nombre;
    protected int precioVenta;
    protected int precioCompra;
    protected String Descripcion;
    protected int NoArticulo=0;
    protected String Marca;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precio) {
        this.precioVenta = precio;
    }
    
    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precio) {
        this.precioCompra = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNoArticulos() {
        return NoArticulo;
    }

    public void setNoArticulos(int NoArticulo) {
        this.NoArticulo = NoArticulo+ this.NoArticulo;
    }

    public void reducirNoArticulos(){
        this.NoArticulo --;       
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
}
