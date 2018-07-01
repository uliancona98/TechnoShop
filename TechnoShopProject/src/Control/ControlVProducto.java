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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author Juan D.M
 */
public class ControlVProducto implements ActionListener{
    private VProducto vProducto;
    private Producto producto;
    private Usuario usuario=null;
    private int idCategoria;
    public ControlVProducto(VProducto vProducto, int idCategoria, Producto producto ) {
        this.vProducto.getbotonVerCarrito().setVisible(false);
        
        this.vProducto=vProducto;
        this.idCategoria=idCategoria;
        this.producto = producto;
        this.vProducto.getBAnadirCarro().addActionListener(this);
        this.vProducto.getBVolver().addActionListener(this);
        this.vProducto.getBComprar().addActionListener(this);
        this.vProducto.getbotonVerCarrito().addActionListener(this);
        inicializar();
    }
    public ControlVProducto(VProducto vProducto, Usuario usuario,int idCategoria, Producto producto) {
        this.vProducto=vProducto;
        this.usuario=usuario;
        this.producto = producto;        
        this.idCategoria=idCategoria;
        this.vProducto.getBAnadirCarro().addActionListener(this);
        this.vProducto.getBVolver().addActionListener(this);
        this.vProducto.getBComprar().addActionListener(this);
        this.vProducto.getbotonVerCarrito().addActionListener(this);
        inicializar();
    }
    
    public void inicializar(){
        
        ImageIcon Imagen = new javax.swing.ImageIcon("productos\\"+producto.getId()+".jpg"); 
        JLabel Img = new javax.swing.JLabel(Imagen); 
        Img.setSize(884, 509); 
        vProducto.getPanelProducto().add(Img);        
    }
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vProducto.getBAnadirCarro() == evento.getSource()){
            //validarArticulosDisponibles();
            //Se verifican las unidades en la bases de datos *************************
            
            Carrito carrito = usuario.getCarrito();         
            for(int i=0;i< carrito.getProductos().size();i++){
                if(carrito.getProductos().get(i).getId().equals(producto.getId())){
                
                }else{
                    if(i==carrito.getProductos().size()-1){
                        
                    }
                }
            }
            if(idCategoria==1){
               Dispositivo dispositivo=new Dispositivo();
               producto=(Producto)dispositivo;
            }else if(idCategoria==2){
               Software soft=new Software();
               producto=(Producto)soft;
            }else if(idCategoria==3){
               Accesorio acce=new Accesorio();
               producto=(Producto)acce;
            }
            usuario.setCarritoProducto(producto);
        }
 
         if(vProducto.getBVolver() == evento.getSource()){
             if(idCategoria==1){
                 VDispositivos dispositivos = new VDispositivos();
                 dispositivos.setLocationRelativeTo(null);
                 dispositivos.setVisible(true);
             }else if(idCategoria==2){
                 VSoftware software=new VSoftware();
                 software.setLocationRelativeTo(null);
                 software.setVisible(true);
             }else if(idCategoria==3){
                 VAccesorios accesorios = new VAccesorios();
                 accesorios.setLocationRelativeTo(null);
                 accesorios.setVisible(true);
             }
         } 
         
         if(vProducto.getBComprar() == evento.getSource()){
             int noArticulos=(Integer)vProducto.getspinnerCantidadProductos().getValue();
             
             producto.setNoArticulos(noArticulos);
             VPedido ventanaPedido =new VPedido();
             ventanaPedido.setLocationRelativeTo(null);
             ventanaPedido.setVisible(true);
             //producto.setVisible(false);
             ControlVPedido CP = new ControlVPedido(ventanaPedido,usuario,producto);
  
         }
         
        if(vProducto.getbotonVerCarrito()== evento.getSource()){
            VCarrito vCarrito= new VCarrito();
            vCarrito.setLocationRelativeTo(null);
            vCarrito.setVisible(true);
            ControlVCarrito controlVCarrito = new ControlVCarrito(vCarrito, usuario);
              
        } 
    }
    public boolean validarArticulosDisponibles(){
        return true;
    }
}
