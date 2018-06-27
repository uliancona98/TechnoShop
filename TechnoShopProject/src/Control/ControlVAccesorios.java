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
public class ControlVAccesorios implements ActionListener{
    private VAccesorios accesorios;
    private Usuario usuario;
    
    public ControlVAccesorios(VAccesorios va) {
    accesorios = va;
    accesorios.getBRegresar().addActionListener(this);
    }
    
    public ControlVAccesorios(VAccesorios va, Usuario user) {
    usuario = user;
    accesorios = va;
    accesorios.getBRegresar().addActionListener(this);
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
