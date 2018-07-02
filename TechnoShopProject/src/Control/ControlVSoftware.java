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
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan D.M
 */
public class ControlVSoftware implements ActionListener{
    private VSoftware ventanaSoftware;
    private Usuario usuario;
    private Integer ID=3;
    private ArrayList<Software> softwares;
    
    
    public ControlVSoftware(VSoftware Vs) {
        ventanaSoftware = Vs;
        ventanaSoftware.getBRegresar().addActionListener(this);
        inicializar();
    }
    
    public ControlVSoftware(VSoftware Vs, Usuario user) {
        usuario = user;
        ventanaSoftware = Vs;
        ventanaSoftware.getBRegresar().addActionListener(this);
        inicializar();
    }
    
    public void inicializar(){
        for(int i=0;i<ventanaSoftware.getBotonesProductos().size();i++){
            ventanaSoftware.getBotonesProductos().get(i).addActionListener(this);
        }           
        softwares= new ArrayList();
        ventanaSoftware.setVisible(true);  
        ventanaSoftware.setLocationRelativeTo(null);
        //Buscar las imagenes de la categoria de accesorios
        ArrayList<String[]>busqueda = Conexion.buscar("productos", ID, "id_tipoproducto");
        for(int i=0;i<busqueda.size();i++){
            String[] busquedaArray = busqueda.get(i);
            Software software = new Software();                
            software.setId(busquedaArray[0]);  
            software.setNombre(busquedaArray[1]);   
            software.setPrecioVenta(Double.parseDouble(busquedaArray[2]));                
            software.setPrecioCompra(Double.parseDouble(busquedaArray[3]));                
            software.setDescripcion(busquedaArray[4]); 
            software.setNoArticulos(Integer.parseInt(busquedaArray[5]));                
            software.setMarca(busquedaArray[6]);                
            software.setCategoria(Integer.parseInt(busquedaArray[7]));
            softwares.add(software);
        }
        mostrarProductos();        
    }
    public void mostrarProductos(){
        for(int i=0;i<ventanaSoftware.getBotonesProductos().size();i++){
            if(i<softwares.size()){
                ventanaSoftware.getlabelsProductos().get(i).setText(softwares.get(i).getNombre());
                String id = softwares.get(i).getId();
                ImageIcon imagen = new ImageIcon("IconsP\\"+id+".jpg");
                if(imagen.getImageLoadStatus()==4){
                    JOptionPane.showMessageDialog(null, "No se encontro la imagen");
                }else{
                    ventanaSoftware.getBotonesProductos().get(i).setIcon(imagen);                     
                }               
            }else{
                i=ventanaSoftware.getBotonesProductos().size()-1;
            }
        }             
    }        
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventanaSoftware.getBRegresar() == evento.getSource()){
            ventanaSoftware.setVisible(false);                
            if(usuario==null){
                System.out.println("ou");
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
        if(ventanaSoftware.getBotonP1()== evento.getSource()){
            ventanaSoftware.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)softwares.get(0));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)softwares.get(0));                         
            }
        }
        if(ventanaSoftware.getBotonP2()== evento.getSource()){
            ventanaSoftware.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)softwares.get(1));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)softwares.get(1));                         
            }
        }
        if(ventanaSoftware.getBotonP3()== evento.getSource()){
            ventanaSoftware.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario!=null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)softwares.get(2));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)softwares.get(2));                         
            }            
        }
        if(ventanaSoftware.getBotonP4()== evento.getSource()){
            ventanaSoftware.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)softwares.get(3));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)softwares.get(3));                         
            }            
        }
    }
}
