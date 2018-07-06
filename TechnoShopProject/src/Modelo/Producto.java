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

    /**
     * Metodo donde se obtiene el dato del atributo id
     * @return String devuelve el id del producto
     */
    public String getId() {
        return id;
    }
    /**
     * Metodo donde se define el dato del atributo id
     * @param id parametro que recibe el id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Metodo donde se obtiene el dato del atributo idCategoria
     * @return Integer devuelve el id de categoria
     */
    public int getCategoria() {
        return idCategoria;
    }
    /**
     * Metodo donde se define el dato del atributo idCategoria
     * @param categoria parametro que recibe la categoria del producto
     */
    public void setCategoria(int categoria) {
        this.idCategoria = categoria;
    }
    /**
     * Metodo donde se obtiene el dato del atributo nombre
     * @return String devuelve el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo donde se define el dato del atributo nombre
     * @param Nombre parametro que recibe el nombre del producto
     */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    /**
     * Metodo donde se obtiene el dato del atributo informacionCategoria
     * @return String devuelve la informacion de la categoria
     */
    public String getInformacionCategoria() {
        return informacionCategoria;
    }
    /**
     * Metodo abstracto donde se define el dato del atributo informacionCategoria
     */
    public abstract void setInformacionCategoria();
    /**
     * Metodo donde se obtiene el dato del atributo precioVenta
     * @return double devuelve el precio de venta del producto
     */
    public Double getPrecioVenta() {
        return precioVenta;
    }
    /**
     * Metodo donde se define el dato del atributo precioVenta
     * @param precio parametro que define precio del producto
     */
    public void setPrecioVenta(double precio) {
        this.precioVenta = precio;
    }
    /**
     * Metodo donde se obtiene el dato del atrinuto precioCompra
     * @return double devuelve el precio de compra
     */
    public Double getPrecioCompra() {
        return precioCompra;
    }
    /**
     * Metodo donde se define el dato del atributo precioCompra
     * @param precio parametro que define el precio de compra
     */
    public void setPrecioCompra(double precio) {
        this.precioCompra = precio;
    }
    /**
     * Metodo donde se obtiene el dato del atributo descripcion
     * @return String devuelve la descripcion del producto
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Metodo donde se define el dato del atributo descripcion
     * @param Descripcion parametro que recibe la descripcion del producto
     */
    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
    /**
     * Metodo donde se obtiene el dato del atributo noArticulos
     * @return integer devuelve el numero de articulos
     */
    public int getNoArticulos() {
        return noArticulos;
    }
    /**
     * Metodo donde se define el dato del atributo noArticulos
     * @param noArticulos parametro que recibe el numero de articulos
     */
    public void setNoArticulos(int noArticulos) {
        this.noArticulos = noArticulos;
    }
    /**
     * Metodo donde se intenta reducir el numero de articulos
     */
    public void reducirNoArticulos(){
        this.noArticulos --;       
    }
    /**
     * Metodo donde se obtiene el dato del atributo marca
     * @return devuelve la marca del producto
     */
    public String getMarca() {
        return marca;
    }
/**
 * Metodo donde se define la marca
 * @param Marca parametro que recibe la marca del producto
 */
    public void setMarca(String Marca) {
        this.marca = Marca;
    }
}