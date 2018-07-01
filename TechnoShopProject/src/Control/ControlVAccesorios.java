/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//hola
package Control;

import Modelo.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author Juan D.M
 */
public class ControlVAccesorios implements ActionListener{
    private VAccesorios ventanaAccesorios;
    private Usuario usuario=null;
    private Integer ID=2;
    private ArrayList<Accesorio> accesorios;
    
    public ControlVAccesorios(VAccesorios va) {
        ventanaAccesorios = va;
        inicializar();
    }
    
    public ControlVAccesorios(VAccesorios va, Usuario user) {
        usuario = user;
        ventanaAccesorios = va;
        inicializar();
    }
    
    public void inicializar(){
        ventanaAccesorios.getBotonP1().addActionListener(this);
        ventanaAccesorios.getBotonP2().addActionListener(this);
        ventanaAccesorios.getBotonP3().addActionListener(this);
        ventanaAccesorios.getBotonP4().addActionListener(this);        
        accesorios = new ArrayList();
        ventanaAccesorios.getBRegresar().addActionListener(this);
        ventanaAccesorios.setVisible(true);
        ventanaAccesorios.setLocationRelativeTo(null);
        //Buscar las imagenes de la categoria de accesorios
        ArrayList<String[]>busqueda = Conexion.buscar("productos", ID, "id_tipoproducto");
        for(int i=0;i<busqueda.size();i++){
            String[] busquedaArray = busqueda.get(i);
            Accesorio accesorio = new Accesorio();                
            accesorio.setId(busquedaArray[0]);  
            accesorio.setNombre(busquedaArray[1]);   
            accesorio.setPrecioVenta(Double.parseDouble(busquedaArray[2]));                
            accesorio.setPrecioCompra(Double.parseDouble(busquedaArray[3]));                
            accesorio.setDescripcion(busquedaArray[4]); 
            accesorio.setNoArticulos(Integer.parseInt(busquedaArray[5]));                
            accesorio.setMarca(busquedaArray[6]);                
            accesorio.setCategoria(busquedaArray[7]);
            accesorios.add(accesorio);
        }
        mostrarProductos();  
    }
    public void mostrarProductos(){
        for(int i=0;i<ventanaAccesorios.getBotonesProductos().size();i++){
            if(i<accesorios.size()){
                ventanaAccesorios.getlabelsProductos().get(i).setText(accesorios.get(i).getNombre());
                String id = accesorios.get(i).getId();
                ImageIcon imagen = new ImageIcon("IconsP\\"+id+".jpg");
                if(imagen.getImageLoadStatus()==4){
                    System.out.println("Imagen no encontrada");
                }
                ventanaAccesorios.getBotonesProductos().get(i).setIcon(imagen);                    
            }else{
                i=ventanaAccesorios.getBotonesProductos().size()-1;
            }
        }             
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventanaAccesorios.getBRegresar() == evento.getSource()){
            ventanaAccesorios.setVisible(false);            
            if(usuario==null){
                VHome home = new VHome();
                ControlVHome Chome = new ControlVHome(home);
                home.setLocationRelativeTo(null);
                home.setVisible(true);
            }else{
                VHome home = new VHome();
                ControlVHome Chome = new ControlVHome(home,usuario);
                home.setLocationRelativeTo(null);
                home.setVisible(true);
            }
        }
        if(ventanaAccesorios.getBotonP1()== evento.getSource()){
            ventanaAccesorios.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario!=null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)accesorios.get(0));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)accesorios.get(0));                         
            }
        }
        if(ventanaAccesorios.getBotonP2()== evento.getSource()){
            ventanaAccesorios.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario!=null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)accesorios.get(1));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)accesorios.get(1));                         
            }
        }
        if(ventanaAccesorios.getBotonP3()== evento.getSource()){
            ventanaAccesorios.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario!=null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)accesorios.get(2));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)accesorios.get(1));                         
            }            
        }
        if(ventanaAccesorios.getBotonP4()== evento.getSource()){
            ventanaAccesorios.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario!=null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)accesorios.get(1));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)accesorios.get(3));                         
            }            
        }        
    }
}
