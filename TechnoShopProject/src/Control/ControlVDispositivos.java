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
public class ControlVDispositivos implements ActionListener{
    private VDispositivos ventanaDispositivos;
    private Usuario usuario;
    private Integer ID=1;
    private ArrayList<Dispositivo> Dispositivos;
      
    public ControlVDispositivos(VDispositivos VD) {
    ventanaDispositivos = VD;
    ventanaDispositivos.getBRegresar().addActionListener(this);
    inicializar();
    }
    
    public ControlVDispositivos(VDispositivos VD, Usuario user) {
    usuario = user;
    ventanaDispositivos = VD;
    ventanaDispositivos.getBRegresar().addActionListener(this);
    inicializar();
    }
    
    public void inicializar(){
        Dispositivos= new ArrayList();
        ventanaDispositivos.getBRegresar().addActionListener(this);
        ventanaDispositivos.setVisible(true);  
        ventanaDispositivos.setLocationRelativeTo(null);
        //Buscar las imagenes de la categoria de dispositivos
        ArrayList<String[]>busqueda = Conexion.buscar("productos", 3, "id_tipoproducto");
        for(int i=0;i<busqueda.size();i++){
            String[] busquedaArray = busqueda.get(i);
            Dispositivo dispositivo = new Dispositivo();                
            dispositivo.setId(Integer.parseInt(busquedaArray[0]));  
            dispositivo.setNombre(busquedaArray[1]);   
            dispositivo.setPrecioVenta(Double.parseDouble(busquedaArray[2]));                
            dispositivo.setPrecioCompra(Double.parseDouble(busquedaArray[3]));                
            dispositivo.setDescripcion(busquedaArray[4]); 
            dispositivo.setNoArticulos(Integer.parseInt(busquedaArray[5]));                
            dispositivo.setMarca(busquedaArray[6]);                
            dispositivo.setCategoria(busquedaArray[7]);
            Dispositivos.add(dispositivo);
        }
        }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventanaDispositivos.getBRegresar() == evento.getSource()){
          if(usuario==null){
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          ventanaDispositivos.setVisible(false);
          }
          else{
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home,usuario);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          ventanaDispositivos.setVisible(false);
          }
        }
    }
}
