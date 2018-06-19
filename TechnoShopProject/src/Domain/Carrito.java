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
public class Carrito {
    private Producto list;
    ArrayList<Producto> carro = new ArrayList();
    
    public void agregarProducto(){
    list = new Producto();
    carro.add(list);
    }
    
    public void getProducto(){
        
    }
}
