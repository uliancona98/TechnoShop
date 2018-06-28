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
        administradorV.getBotonAceptar().addActionListener(this);
        administradorV.getBotonCancelar().addActionListener(this);
        administradorV.getBotonNewProducto().addActionListener(this);
        administradorV.getBotonRemoveProducto().addActionListener(this);
        administradorV.getBotonReporte().addActionListener(this);
        administradorV.getBotonSalir().addActionListener(this);
        administradorV.getLabelBienvenida().setText("Bienvenid@ "+ a.getNombre()+" "+ a.getApellido());
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(administradorV.getBotonNewProducto() == evento.getSource()){
           administradorV.getVAnadirProducto2().setVisible(true);
           administradorV.getVAnadirProducto2().setBounds(0, 0, 400, 300);
           administradorV.getVAnadirProducto2().setLocationRelativeTo(null);   
        }
        if(administradorV.getBotonRemoveProducto() == evento.getSource()){
           administradorV.getVRemover().setVisible(true);
           administradorV.getVRemover().setBounds(0, 0, 400, 440);
           administradorV.getVRemover().setLocationRelativeTo(null);   
        }
        if(administradorV.getBotonReporte() == evento.getSource()){       
            administradorV.getVReporte().setVisible(true);
            administradorV.getVReporte().setBounds(0, 0, 709, 356);
            administradorV.getVReporte().setLocationRelativeTo(null);
        }
        if(administradorV.getBotonSalir() == evento.getSource()){
            VHome home = new VHome();
            home.setLocationRelativeTo(null);
            home.setVisible(true);
            ControlVHome cHome = new ControlVHome(home);         
        }
        if(administradorV.getBotonAceptar() == evento.getSource()){
            //Se añade el nuevo producto a la base
            //************
            administradorV.getVAnadirProducto().setVisible(false);
        }
        if(administradorV.getBotonCancelar() == evento.getSource()){
            //Se cancela la agregacion de nuevo producto
            administradorV.getVAnadirProducto().setVisible(false);
        }
        if(administradorV.getBotonAnadirExistente() == evento.getSource()){
            //Se selecciona la opcion de añadir existente, se abre 
            administradorV.getVAnadirProducto2().setVisible(false);
            administradorV.getVAumentarProducto().setVisible(true);
            administradorV.getVAumentarProducto().setBounds(0, 0, 400, 432);
            administradorV.getVAumentarProducto().setLocationRelativeTo(null);            
        }
        if(administradorV.getBotonAumentar()== evento.getSource()){
            //Se selecciona la opcion de añadir existente, se abre 
            administradorV.getVAumentarProducto().setVisible(false);       
        }
        if(administradorV.getBotonAnadirProducto2() == evento.getSource()){
            //Se selecciona la opcion de añadir existente 2, se abre la ventana del formulario del nuevo producto
            administradorV.getVAnadirProducto2().setVisible(false);
            administradorV.getVAnadirProducto().setVisible(true);
            administradorV.getVAnadirProducto().setBounds(0, 0, 555, 725);
            administradorV.getVAnadirProducto().setLocationRelativeTo(null);
        }
        if(administradorV.getBotonRetirar() == evento.getSource()){
            //Se seleccion la opcion de añadir existente 2
            administradorV.getVRemover().setVisible(false);
            System.out.println("Articulo removido de la tienda");
        }
        if(administradorV.getBImprimir()== evento.getSource()){
            System.out.println("Se imprime el reporte");
        }
        if(administradorV.getBRegresar()== evento.getSource()){
            administradorV.getVReporte().setVisible(false);
        }
        
    }
    
}
