/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Juan D.M
 */
public class Bodega {
    Producto producto;
    ArrayList<Producto> listaproductos = new ArrayList(); 
    
    public void AnadirProducto(){
    producto = new Producto();
    producto.setNombre("ThinkPad T440p");
    producto.getNombre();
    producto.setPrecioCompra(9000);
    producto.getPrecioCompra();
    listaproductos.add(producto);    
    }
    
    public void RemoverProducto(){
    listaproductos.remove(producto);
    }

    public Producto getListaDeProductos() {
        for(int i=0; i<listaproductos.size(); i++){
            System.out.println(listaproductos.get(i).getNombre());
        }
        return producto;
    }
    
    
}
