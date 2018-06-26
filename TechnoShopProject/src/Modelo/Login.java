/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Login {
    private static Usuario usuario;
    private static Administrador admin;
    
    public static boolean validarCuenta(String correo, char[] contrasenaChar, String tabla){
        String contrasena = "";
        for(int i=0;i<contrasenaChar.length;i++){
            contrasena = contrasena+contrasenaChar[i];
        }
        if(correo.equals("uliancona@hotmail.com")){
            if(contrasena.equals("123")){
                System.out.println("Sesion iniciada");
                
                if(tabla.equals("Administradores")){
                    admin = new Administrador();
                    String apellido = "Ancona"; //*****
                    String nombre = "Ulises"; //******+

                    admin.setApellido(apellido);
                    admin.setContraseña(contrasena);
                    admin.setCorreo(correo);
                    admin.setNombre(nombre);
                }else{
                    usuario = new Usuario();
                    String apellido = "Ancona"; //*****
                    String nombre = "Ulises"; //******+

                    usuario.setApellido(apellido);
                    usuario.setContraseña(contrasena);
                    usuario.setCorreo(correo);
                    usuario.setNombre(nombre);    
                    //Buscar en la tabla de membresia y de pedidos
                }
                return true;
            }else{
                System.out.println("Password incorrecto");
            }
        }else{
            System.out.println("Correo incorrecto");
        }
        return false;
    }
    
    public static Usuario getUsuario(){
        return usuario;
    }
    
    public static Administrador getAdministrador(){
        return admin;
    }
    
}
