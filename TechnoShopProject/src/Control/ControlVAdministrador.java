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
 * @author Usuario
 */
public class ControlVAdministrador implements ActionListener {
    private VAdministrador administradorV;
    private Administrador admin;
    
    ControlVAdministrador(VAdministrador vAdmin, Administrador a){
        this.administradorV = vAdmin;
        this.admin = a;
        vAdmin.getBotonAceptar().addActionListener(this);
        vAdmin.getBotonCancelar().addActionListener(this);
        vAdmin.getBotonNewProducto().addActionListener(this);
        vAdmin.getBotonRemoveProducto().addActionListener(this);
        vAdmin.getBotonReporte().addActionListener(this);
        vAdmin.getBotonSalir().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
         if(administradorV.getBotonNewProducto() == evento.getSource()){
             
         }
         if(administradorV.getBotonRemoveProducto() == evento.getSource()){
              
         }
         if(administradorV.getBotonReporte() == evento.getSource()){
             
         }
         if(administradorV.getBotonSalir() == evento.getSource()){
         }
    }
    
}
