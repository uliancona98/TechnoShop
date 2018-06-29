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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan D.M
 */
public class ControlVRegistrese implements ActionListener{
    private VRegistrese registrese;
    public ControlVRegistrese(VRegistrese registrese) {
        this.registrese = registrese;
        registrese.getBotonRegistrarse().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(registrese.getBotonRegistrarse() == evento.getSource()){
            //Condicional si se presiona el boton "Registrarse"  
            boolean bandera1=false;
            boolean bandera2=false;
            boolean bandera3=false;
            Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            /*validarcorreo*/
            String nombre=registrese.getCampoRNombre().getText();
            String apellido=registrese.getCampoRApellido().getText();
            String correo=registrese.getCampoRCorreo().getText();
            String contrasena=new String(registrese.getCampoRContrasena().getPassword());
        
            Matcher mat = pat.matcher(correo);
            if ((nombre).matches("([a-z]|[A-Z]|\\s)+")) { 
                System.out.println("valido");
                bandera1=true;
            }
            if ((apellido).matches("([a-z]|[A-Z]|\\s)+")) {
                System.out.println("valido");
                bandera2=true;
            }
            if(mat.find()){
              System.out.println("Correo Válido");
              bandera3=true;
            }
            if(bandera1 && bandera2 && bandera3){
                Usuario usuario=new Usuario();
                Membresia membresia= new Membresia();
                usuario.setNombre(nombre);
                usuario.setApellido(apellido);
                usuario.setCorreo(correo);
                usuario.setContraseña(contrasena);
                membresia.setTipo("Nivel 1");
                usuario.setMembresia(membresia);
                String[] valores = new String[7];
                valores[0] = correo;
                valores[1] = nombre;
                valores[2] = apellido;
                valores[3] = contrasena;
                valores[4] = "Nivel 1";
                valores[5] = "0";
                valores[6] = "0";
                //Insertar a la base de datos
                Conexion.insert("Usuarios", valores);
                registrese.setVisible(false);
                VHome vHome = new VHome(usuario);
                vHome.setLocationRelativeTo(null);
                vHome.setVisible(true);
                ControlVHome Chome = new ControlVHome(vHome);
            }else{
                if(!bandera1){
                    JOptionPane.showMessageDialog(null, "Nombre Invalido");
                }
                if(!bandera2){
                    JOptionPane.showMessageDialog(null, "Apellido Invalido");
                }
                if(!bandera3){
                    JOptionPane.showMessageDialog(null, "Correo Invalido");
                }
            }            
        }        
    }
}
