/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Login {
    public static Usuario usuario;
    public static Administrador admin;
    
    public static boolean validarCuenta(String correo, char[] contrasenaChar, String tabla){
        String contrasena = "";
        for(int i=0;i<contrasenaChar.length;i++){
            contrasena = contrasena+contrasenaChar[i];
        }
        ArrayList<String[]>resultado = Conexion.buscar(tabla, correo, "correo");
        if(resultado.size()>0){
            String []res = resultado.get(0);            
            if(contrasena.equals(res[3])){
                System.out.println("Contrasena correcta, has iniciado sesion");
                if(tabla.equals("Usuarios")){
                    usuario = new Usuario();
                    usuario.setCorreo(res[0]);
                    usuario.setNombre(res[1]); 
                    usuario.setApellido(res[2]);
                    usuario.setContraseña(res[3]);         
                    Membresia membresia = new Membresia();
                    membresia.setTipo(res[4]);
                    membresia.setPuntos(Double.parseDouble(res[5]));
                    membresia.setValorCompras(Double.parseDouble(res[6]));
                    usuario.setMembresia(membresia);              
                }else if(tabla.equals("Administradores")){
                    admin = new Administrador();
                    admin.setCorreo(res[0]);
                    admin.setNombre(res[1]);
                    admin.setApellido(res[2]);
                    admin.setContraseña(res[3]);
                }
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Contrasena incorrecta, vuelve a intentar");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No existe cuenta asociada con este correo");
        }
        return false;
    }        
}
