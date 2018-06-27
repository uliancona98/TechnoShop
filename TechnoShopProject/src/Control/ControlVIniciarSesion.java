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
public class ControlVIniciarSesion implements ActionListener{
    private VIniciarSesion iniciarSesion;
    private int bandera=0;
    
    public ControlVIniciarSesion(VIniciarSesion vIniciarSesion, int bandera) {
        this.bandera = bandera;
        iniciarSesion = vIniciarSesion;
        iniciarSesion.getBotonAcceder().addActionListener(this);
    }
    //bandera=0 se accede a los usuarios
    //bandera =1 se accede a los administradores
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(iniciarSesion.getBotonAcceder() == evento.getSource()){
            if(bandera==1){
                if (Login.validarCuenta(iniciarSesion.getUsuarioCampo().getText(), iniciarSesion.getContrasenaCampo().getPassword(), "Administradores")){
                    System.out.println("Iniciado sesion");
                    iniciarSesion.setVisible(false);
                    VAdministrador vAdmin = new VAdministrador();
                    vAdmin.setLocationRelativeTo(null);
                    vAdmin.setVisible(true);
                    ControlVAdministrador Chome = new ControlVAdministrador(vAdmin, Login.getAdministrador());                    
                }                 
            }else if(bandera==0){
                if (Login.validarCuenta(iniciarSesion.getUsuarioCampo().getText(), iniciarSesion.getContrasenaCampo().getPassword(), "Usuarios")){
                    System.out.println("Iniciado sesion");
                    iniciarSesion.setVisible(false);
                    VHome home = new VHome(Login.getUsuario());
                    home.setLocationRelativeTo(null);
                    home.setVisible(true);
                    ControlVHome Chome = new ControlVHome(home);                    
                    
                }                 
            }
        }
    }  
}
