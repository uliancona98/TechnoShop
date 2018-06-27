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
public class ControlVDispositivos implements ActionListener{
    private VDispositivos dispositivos;
    private Usuario usuario;
    
    public ControlVDispositivos(VDispositivos VD) {
    dispositivos = VD;
    dispositivos.getBRegresar().addActionListener(this);
    }
    
    public ControlVDispositivos(VDispositivos VD, Usuario user) {
    usuario = user;
    dispositivos = VD;
    dispositivos.getBRegresar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(dispositivos.getBRegresar() == evento.getSource()){
          if(usuario==null){
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          dispositivos.setVisible(false);
          }
          else{
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home,usuario);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          dispositivos.setVisible(false);
          }
        }
    }
}
