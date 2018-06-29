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
    
    public ControlVProducto(VProducto producto) {
        this.Vproducto=producto;
    }
    public ControlVProducto(VProducto producto, Usuario usuario) {
        this.Vproducto=producto;
        this.usuario=usuario;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
         if(Vproducto.getBAnadirCarro() == evento.getSource()){
             
         } 
         if(Vproducto.getBComprar() == evento.getSource()){
             
         } 
         if(Vproducto.getBVolver() == evento.getSource()){
             
         } 
         
         if(Vproducto.getBComprar() == evento.getSource()){
             VPedido ventanaPedido =new VPedido();
             ventanaPedido.setLocationRelativeTo(null);
             ventanaPedido.setVisible(true);
             //producto.setVisible(false);
             ControlVPedido CP = new ControlVPedido(ventanaPedido,usuario,producto);
  
         }
    }
}
