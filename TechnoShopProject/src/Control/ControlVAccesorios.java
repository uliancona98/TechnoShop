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
import javax.swing.JOptionPane;
/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 * Clase controlador que responde a los eventos de la vista Accesorios al igual
 * que recibe ciertos datos del modelo como los accesorios entre otros.
 */
public class ControlVAccesorios implements ActionListener{
    private VAccesorios ventanaAccesorios;
    private Usuario usuario=null;
    private Integer ID=2;
    private ArrayList<Accesorio> accesorios;
    /**
     * Constructor con parametro de la vista accesorios
     * @param va parametro que recibe la vista accesorios 
     */
    public ControlVAccesorios(VAccesorios va) {
        ventanaAccesorios = va;
        inicializar();
    }
    /**
     * Constructor con parametros de la vista accesorios y el usuario en caso
     * de que ya haya iniciado sesion
     * @param va parametro que recibe la vista accesorios
     * @param user parametro que recibe el usuario
     */
    public ControlVAccesorios(VAccesorios va, Usuario user) {
        usuario = user;
        ventanaAccesorios = va;
        inicializar();
    }
    /**
     * Metodo en el cual se inicia la vista accesorios y sus elementos
     */
    public void inicializar(){
        for(int i=0;i<ventanaAccesorios.getBotonesProductos().size();i++){
            ventanaAccesorios.getBotonesProductos().get(i).addActionListener(this);
        }        
        accesorios = new ArrayList();
        ventanaAccesorios.getBRegresar().addActionListener(this);
        ventanaAccesorios.setVisible(true);
        ventanaAccesorios.setLocationRelativeTo(null);
        //Buscar las imagenes de la categoria de accesorios
        ArrayList<String[]>busqueda = Conexion.buscar("productos", ID, "id_tipoproducto");
        if(Conexion.elementoBuscado){
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
                accesorio.setCategoria(Integer.parseInt(busquedaArray[7]));
                accesorios.add(accesorio);
            }
            mostrarProductos();                 
        }else{
            for(int i=0;i<ventanaAccesorios.getBotonesProductos().size();i++){
                ventanaAccesorios.getBotonesProductos().get(i).setEnabled(false);              
            }
            JOptionPane.showMessageDialog(null, "Error al cargar los productos");                
        }             
    }
    /**
     * Metodo que llama a una subventana que muestra los productos existentes
     */
    public void mostrarProductos(){
        for(int i=0;i<ventanaAccesorios.getBotonesProductos().size();i++){
            if(i<accesorios.size()){
                ventanaAccesorios.getBotonesProductos().get(i).setEnabled(true);                
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
    /**
     * Metodo para recibir peticiones del usuario con respecto a la vista Accesorios
     * @param evento parametro que inicia el ActionEvent
     */
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
            if(usuario==null){
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
            if(usuario==null){
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
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)accesorios.get(2));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)accesorios.get(2));                         
            }            
        }
        if(ventanaAccesorios.getBotonP4()== evento.getSource()){
            ventanaAccesorios.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)accesorios.get(3));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)accesorios.get(3));                         
            }            
        }        
    }
}
