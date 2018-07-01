/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Juan D.M
 */
public class ControlVProducto implements ActionListener{
    private VProducto Vproducto;
    private Producto producto;
    private Usuario usuario=null;
    private int idCategoria;
    public ControlVProducto(VProducto producto, int idCategoria) {
        this.Vproducto=producto;
        this.idCategoria=idCategoria;
    }
    public ControlVProducto(VProducto producto, Usuario usuario,int idCategoria) {
        this.Vproducto=producto;
        this.usuario=usuario;
        this.idCategoria=idCategoria;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
         if(Vproducto.getBAnadirCarro() == evento.getSource()){
             //producto=new Producto();
             //usuario.setCarritoProducto(producto);
             
             if(idCategoria==1){
                 Dispositivo dispositivo=new Dispositivo();
                 Producto producto=(Producto)dispositivo;
                 
             }else if(idCategoria==2){
                 Software soft=new Software();
                  Producto producto=(Producto)soft;
             }else if(idCategoria==3){
                 Accesorio acce=new Accesorio();
                  Producto producto=(Producto)acce;
             }
             
             
         } 
 
         if(Vproducto.getBVolver() == evento.getSource()){
             
         } 
         
         if(Vproducto.getBComprar() == evento.getSource()){
             
             
             
             int noArticulos=(Integer)Vproducto.getspinnerCantidadProductos().getValue();
             
             producto.setNoArticulos(noArticulos);
             VPedido ventanaPedido =new VPedido();
             ventanaPedido.setLocationRelativeTo(null);
             ventanaPedido.setVisible(true);
             //producto.setVisible(false);
             ControlVPedido CP = new ControlVPedido(ventanaPedido,usuario,producto);
  
         }
         
         if(Vproducto.getbotonVerCarrito()== evento.getSource()){
             VCarrito cArrito= new VCarrito();
              cArrito.setLocationRelativeTo(null);
              cArrito.setVisible(true);
              
         }
         
         
    }
    public boolean validarArticulosDisponibles(){
        return true;
    }
}
