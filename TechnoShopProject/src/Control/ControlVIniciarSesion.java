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
    private int banderaCuenta=0;
    private Producto producto = null;
    /**
     * Constructor con parametros de la vista IniciarSesion y bandera
     * inicializa tambien los eventos
     * @param vIniciarSesion
     * @param bandera 
     */
    public ControlVIniciarSesion(VIniciarSesion vIniciarSesion, int bandera) {
        this.banderaCuenta = bandera;
        iniciarSesion = vIniciarSesion;
        iniciarSesion.getBotonAcceder().addActionListener(this);
        iniciarSesion.getBotonCancelar().addActionListener(this);
    }
    /**
     * Constructor con parametros de la vista IniciarSesion y el producto
     * inicializa tambien los eventos
     * @param vIniciarSesion
     * @param producto 
     */
    public ControlVIniciarSesion(VIniciarSesion vIniciarSesion, Producto producto) {
        this.producto = producto;
        iniciarSesion = vIniciarSesion;
        iniciarSesion.getBotonAcceder().addActionListener(this);
        iniciarSesion.getBotonCancelar().addActionListener(this);
    }    
    /**
     * Dependientos de las peticiones del usuario o administrador sucederan tales eventos
     * Si bandera=0 se accede a los usuarios
     * Si bandera =1 se accede a los administradores
     * @param evento 
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(iniciarSesion.getBotonAcceder() == evento.getSource()){
            if(banderaCuenta==1){
                if (Login.validarCuenta(iniciarSesion.getUsuarioCampo().getText(), iniciarSesion.getContrasenaCampo().getPassword(), "Administradores")){
                    System.out.println("Iniciado sesion");
                    iniciarSesion.setVisible(false);
                    VAdministrador vAdmin = new VAdministrador();
                    vAdmin.setLocationRelativeTo(null);
                    vAdmin.setVisible(true);
                    ControlVAdministrador cAdmin = new ControlVAdministrador(vAdmin, Login.admin);                         
                }
            }else if(banderaCuenta==0){
                if (Login.validarCuenta(iniciarSesion.getUsuarioCampo().getText(), iniciarSesion.getContrasenaCampo().getPassword(), "Usuarios")){
                    System.out.println("Iniciado sesion");
                    iniciarSesion.setVisible(false);
                    if(producto==null){
                        //Ir al menu
                        VHome home = new VHome();
                        home.setLocationRelativeTo(null);
                        home.setVisible(true);
                        ControlVHome cHome = new ControlVHome(home, Login.usuario);                        
                    }else{
                        //Ir al producto
                        VProducto vProducto = new VProducto();
                        vProducto.setVisible(true);
                        vProducto.setLocationRelativeTo(null);
                        ControlVProducto cvProducto = new ControlVProducto(vProducto,Login.usuario, producto.getCategoria(), producto);                  
                    }
                }
            }
        }
        if(iniciarSesion.getBotonCancelar() == evento.getSource()){
            iniciarSesion.setVisible(false);
            if(producto!=null){
                VProducto vProducto = new VProducto();
                vProducto.setVisible(true);
                vProducto.setLocationRelativeTo(null);
                ControlVProducto cvProducto = new ControlVProducto(vProducto, producto.getCategoria(), producto);                    
            }else{
                VHome home = new VHome();
                home.setLocationRelativeTo(null);
                home.setVisible(true);
                ControlVHome cHome = new ControlVHome(home);                      
            }
        }
    }  
}
