/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Usuario;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Emmanuel
 */
public class ControlVHome implements ActionListener{
    private VHome home;
    private Usuario usuario = null;
    
    public ControlVHome(VHome h){
        //Aqui se llaman los parametros, atributos y las acciones de los elementos del jframe VHome
        home = h;
        home.getBotonAccesory().addActionListener(this);
        home.getBotonAdministrador().addActionListener(this);
        home.getBotonDevice().addActionListener(this);
        home.getBotonRegistrese().addActionListener(this);
        home.getBotonSesion().addActionListener(this);
        home.getBotonSoftware().addActionListener(this);
    }
    public ControlVHome(VHome h, Usuario user){
        //Aqui se llaman los parametros, atributos y las acciones de los elementos del jframe VHome
        this.usuario = user;
        home = h;
        home.getBotonAccesory().addActionListener(this);
        home.getBotonAdministrador().addActionListener(this);
        home.getBotonDevice().addActionListener(this);
        home.getBotonRegistrese().addActionListener(this);
        home.getBotonSesion().addActionListener(this);
        home.getBotonSoftware().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(home.getBotonAdministrador() == evento.getSource()){
            System.out.println("ADMIN");
        //Condicional si se presiona el boton "Administrar tienda"  
           VIniciarSesion I = new VIniciarSesion();         
           I.setLocationRelativeTo(null);
           I.setVisible(true);
           home.setVisible(false);
           ControlVIniciarSesion CI = new ControlVIniciarSesion(I,1);
        }
        if(home.getBotonSesion() == evento.getSource()){
        //Condicional si se presiona el boton "Iniciar Sesion"    
        //Condicional si se presiona el boton "Administrar tienda"  
           VIniciarSesion I = new VIniciarSesion();
           I.setLocationRelativeTo(null);
           I.setVisible(true);
           home.setVisible(false);
           ControlVIniciarSesion CI = new ControlVIniciarSesion(I,0);
        }
        if(home.getBotonRegistrese() == evento.getSource()){
        //Condicional si se presiona el boton "Registrese"
           VRegistrese ventanaRegistro = new VRegistrese();
           ventanaRegistro.setLocationRelativeTo(null);
           ventanaRegistro.setVisible(true);
           home.setVisible(false);
           ControlVRegistrese CR = new ControlVRegistrese(ventanaRegistro);
           
        }
        if(home.getBotonDevice() == evento.getSource()){
        //Condicional si se presiona el boton "Dispositivos"
           if(usuario==null){
           //En caso de que no haya ninguna sesion iniciada
           VDispositivos d = new VDispositivos();
           ControlVDispositivos cd = new ControlVDispositivos(d);
           }
           else{
           //Cuando se haya ya ingresado un usuario
           VDispositivos d = new VDispositivos();
           ControlVDispositivos cd = new ControlVDispositivos(d,usuario); 
           }
        }
        if(home.getBotonAccesory() == evento.getSource()){
        //Condicional si se presiona el boton "Accesorios"
           if(usuario==null){
           //En caso de que no haya ninguna sesion iniciada
           VAccesorios a = new VAccesorios();
           ControlVAccesorios ca = new ControlVAccesorios(a);
           }
           else{
           //Cuando se haya ya ingresado un usuario
           VAccesorios a = new VAccesorios();
           ControlVAccesorios ca = new ControlVAccesorios(a,usuario);
           }
        }
        if(home.getBotonSoftware() == evento.getSource()){
        //Condicional si se presiona el boton "Software"
           if(usuario==null){
           //En caso de que no haya ninguna sesion iniciada
           VSoftware s = new VSoftware();
           ControlVSoftware cs = new ControlVSoftware(s);
           }
           else{
           //Cuando se haya ya ingresado un usuario
           VSoftware s = new VSoftware();
           ControlVSoftware cs = new ControlVSoftware(s,usuario);
           }
        }
    }
    }

