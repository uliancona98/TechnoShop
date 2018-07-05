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
public class ControlVDispositivos implements ActionListener{
    private VDispositivos ventanaDispositivos;
    private Usuario usuario;
    private Integer ID=1;
    private ArrayList<Dispositivo> dispositivos;
    /**
     * Constructor con parametro de la vista dispositivos
     * @param VD nombre del parametro que representa la vista dispositivos
     */   
    public ControlVDispositivos(VDispositivos VD) {
        ventanaDispositivos = VD;
        inicializar();
    }
    /**
     * Constructor con parametros de la vista dispositivos y el usuario en caso
     * de este haya iniciado su sesion
     * @param VD nombre del parametro que representa la vista dispositivos
     * @param user nombre del parametro que representa el usuario
     */
    public ControlVDispositivos(VDispositivos VD, Usuario user) {
        usuario = user;
        ventanaDispositivos = VD;
        inicializar();
    }
    /**
     * Metodo en el cual se inicia la vista dispositivos y sus elementos
     */
    public void inicializar(){
        for(int i=0;i<ventanaDispositivos.getBotonesProductos().size();i++){
            ventanaDispositivos.getBotonesProductos().get(i).addActionListener(this);
        }
        dispositivos= new ArrayList();
        ventanaDispositivos.getBRegresar().addActionListener(this);
        ventanaDispositivos.setVisible(true);  
        ventanaDispositivos.setLocationRelativeTo(null);
        //Buscar las imagenes de la categoria de dispositivo
        ArrayList<String[]>busqueda = Conexion.buscar("productos", ID, "id_tipoproducto");
        if(Conexion.elementoBuscado){
            for(int i=0;i<busqueda.size();i++){
                String[] busquedaArray = busqueda.get(i);
                Dispositivo dispositivo = new Dispositivo();                
                dispositivo.setId(busquedaArray[0]);  
                dispositivo.setNombre(busquedaArray[1]);   
                dispositivo.setPrecioVenta(Double.parseDouble(busquedaArray[2]));                
                dispositivo.setPrecioCompra(Double.parseDouble(busquedaArray[3]));                
                dispositivo.setDescripcion(busquedaArray[4]); 
                dispositivo.setNoArticulos(Integer.parseInt(busquedaArray[5]));                
                dispositivo.setMarca(busquedaArray[6]);                
                dispositivo.setCategoria(Integer.parseInt(busquedaArray[7]));
                dispositivos.add(dispositivo);         
            } 
            mostrarProductos();
        }else{
            for(int i=0;i<ventanaDispositivos.getBotonesProductos().size();i++){
                ventanaDispositivos.getBotonesProductos().get(i).setEnabled(false);              
            }
            JOptionPane.showMessageDialog(null, "Error al cargar los productos");
        }
    }
     /**
     * Metodo que llama a una subventana que muestras los productos existentes
     */
    public void mostrarProductos(){
        System.out.println(ventanaDispositivos.getBotonesProductos().size()+"----");
        for(int i=0;i<ventanaDispositivos.getBotonesProductos().size();i++){
            if(i<dispositivos.size()){
                ventanaDispositivos.getlabelsProductos().get(i).setText(dispositivos.get(i).getNombre());
                String id = dispositivos.get(i).getId();
                ImageIcon imagen = new ImageIcon("IconsP\\"+id+".jpg");
                if(imagen.getImageLoadStatus()==4){
                    JOptionPane.showMessageDialog(null, "No se encontro la imagen");
                    ventanaDispositivos.getBotonesProductos().get(i).setEnabled(false);
                }else{
                    ventanaDispositivos.getBotonesProductos().get(i).setIcon(imagen);                       
                }                 
            }else{
                i=ventanaDispositivos.getBotonesProductos().size()-1;
            }
        }             
    }    
     /**
     * Metodo para recibir peticiones del usuario con respecto a la vista Dispositivos
     * @param evento parametro que inicia el ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventanaDispositivos.getBRegresar() == evento.getSource()){
            if(usuario==null){
                VHome home = new VHome();
                ControlVHome Chome = new ControlVHome(home);
                home.setLocationRelativeTo(null);
                home.setVisible(true);
                ventanaDispositivos.setVisible(false);
            }else{
                VHome home = new VHome();
                ControlVHome Chome = new ControlVHome(home,usuario);
                home.setLocationRelativeTo(null);
                home.setVisible(true);
                ventanaDispositivos.setVisible(false);
            }
        }
        if(ventanaDispositivos.getBotonP1()== evento.getSource()){
            ventanaDispositivos.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)dispositivos.get(0));
                Producto pro = (Producto)dispositivos.get(0);
                System.out.println(pro.getId()+ pro.getNombre());
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)dispositivos.get(0));                         
            }
        }
        if(ventanaDispositivos.getBotonP2()== evento.getSource()){
            ventanaDispositivos.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)dispositivos.get(1));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)dispositivos.get(1));                         
            }
        }
        if(ventanaDispositivos.getBotonP3()== evento.getSource()){
            ventanaDispositivos.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)dispositivos.get(2));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)dispositivos.get(2));                         
            }            
        }
        if(ventanaDispositivos.getBotonP4()== evento.getSource()){
            ventanaDispositivos.setVisible(false);
            VProducto vProducto = new VProducto();
            vProducto.setVisible(true);
            vProducto.setLocationRelativeTo(null);
            if(usuario==null){
                //Se abre la ventana del producto sin el usuario
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, ID, (Producto)dispositivos.get(3));                
            }else{
                ControlVProducto controlVProducto = new ControlVProducto(vProducto, usuario, ID, (Producto)dispositivos.get(3));                         
            }
        }           
    }
}
