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
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Juan D.M
 */
public class ControlVAccesorios implements ActionListener{
    private VAccesorios accesorios;
    private Usuario usuario;
    
    public ControlVAccesorios(VAccesorios va) {
        accesorios = va;
        inicializar();
    }
    
    public ControlVAccesorios(VAccesorios va, Usuario user) {
        usuario = user;
        accesorios = va;
        inicializar();
    }
    
    public void inicializar(){
        accesorios.getBRegresar().addActionListener(this);
        accesorios.setVisible(true);  
        accesorios.setLocationRelativeTo(null);
        //Buscar las imagenes de la categoria de accesorios
        //Conexion.buscar(tabla, dato, nombreDato);
        ImageIcon imagen = new ImageIcon("icono1.jpg"); 
        accesorios.getBoton().setIcon(imagen);       
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(accesorios.getBRegresar() == evento.getSource()){
          if(usuario==null){
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          accesorios.setVisible(false);
          }
          else{
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home,usuario);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          accesorios.setVisible(false);
          }
         
        }
    }
}
