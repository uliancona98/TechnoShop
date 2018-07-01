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
/**
 *
 * @author Juan D.M
 */
public class ControlVSoftware implements ActionListener{
    private VSoftware ventanaSoftware;
    private Usuario usuario;
    private Integer ID=2;
    private ArrayList<Software> Softwares;
    
    
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
            Softwares= new ArrayList();
            ventanaSoftware.getBRegresar().addActionListener(this);
            ventanaSoftware.setVisible(true);  
            ventanaSoftware.setLocationRelativeTo(null);
            //Buscar las imagenes de la categoria de accesorios
            ArrayList<String[]>busqueda = Conexion.buscar("productos", 3, "id_tipoproducto");
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
                software.setCategoria(busquedaArray[7]);
                Softwares.add(software);
            }
        }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventanaSoftware.getBRegresar() == evento.getSource()){
            if(usuario==null){
            VHome home = new VHome();
            ControlVHome Chome = new ControlVHome(home);
            home.setLocationRelativeTo(null);
            home.setVisible(true);
            ventanaSoftware.setVisible(false);
            }
            else{
            VHome home = new VHome();
            ControlVHome Chome = new ControlVHome(home,usuario);
            home.setLocationRelativeTo(null);
            home.setVisible(true);
            ventanaSoftware.setVisible(false);
            }
        }
    }
}
