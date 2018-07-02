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
public abstract class Producto {
    protected String id;
    protected String nombre;
    protected double precioVenta;
    protected double precioCompra;
    protected String descripcion;
    protected int noArticulos=0;
    protected String marca;
    protected int idCategoria;
    protected String informacionCategoria;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCategoria() {
        return idCategoria;
    }

    public void setCategoria(int categoria) {
        this.idCategoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    
    public String getInformacionCategoria() {
        return informacionCategoria;
    }

    public abstract void setInformacionCategoria();
    
    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precio) {
        this.precioVenta = precio;
    }
    
    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precio) {
        this.precioCompra = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public int getNoArticulos() {
        return noArticulos;
    }

    public void setNoArticulos(int noArticulos) {
        this.noArticulos = noArticulos;
    }

    public void reducirNoArticulos(){
        this.noArticulos --;       
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }
}