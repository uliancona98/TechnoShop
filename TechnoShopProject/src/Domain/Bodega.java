/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author Juan D.M
 */
public class Bodega {
    Producto list;
    ArrayList<Producto> listaproductos = new ArrayList(); 
    
    public void AnadirProducto(){
    list = new Producto();
    list.setNombre("ThinkPad T440p");
    list.getNombre();
    list.setPrecio(9000);
    list.getPrecio();
    listaproductos.add(list);    
    }
    
    public void RemoverProducto(){
    listaproductos.remove(list);
    }

    public Producto getListaDeProductos() {
        for(int i=0; i<listaproductos.size(); i++){
            System.out.println(listaproductos.get(i).getNombre());
        }
        return list;
    }
    
    
}
