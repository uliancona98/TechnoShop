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
public class ControlVSoftware implements ActionListener{
    private VSoftware software;
    private Usuario usuario;
    private Integer ID=2;
    
    public ControlVSoftware(VSoftware Vs) {
        software = Vs;
        software.getBRegresar().addActionListener(this);
    }
    
    public ControlVSoftware(VSoftware Vs, Usuario user) {
        usuario = user;
        software = Vs;
        software.getBRegresar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(software.getBRegresar() == evento.getSource()){
          if(usuario==null){
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          software.setVisible(false);
          }
          else{
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home,usuario);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          software.setVisible(false);
          }
        }
    }
}
