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
    private static Cuenta cuenta;
    
    public static boolean validarCuenta(String correo, char[] contrasenaChar, String tabla){
        String contrasena = "";
        for(int i=0;i<contrasenaChar.length;i++){
            contrasena = contrasena+contrasenaChar[i];
        }
        if(correo.equals("uliancona@hotmail.com")){
            if(contrasena.equals("123")){
                System.out.println("Sesion iniciada");
                cuenta = new Cuenta();
                String apellido = "Ancona"; //*****
                String nombre = "Ulises"; //******
                cuenta.setApellido(apellido);
                cuenta.setContraseña(contrasena);
                cuenta.setCorreo(correo);
                cuenta.setNombre(nombre);
                
                if(tabla.equals("Administradores")){
                    setCuenta(cuenta,1);
                }else if(tabla.equals("Usuarios")){
                    setCuenta(cuenta,0);
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
    public static void setCuenta(Cuenta cuenta, int bandera){
        if(bandera==0){
            //Tabla de usuarios
        }else{
            //Tabla de administradores
        }
    }
    
    public Cuenta getCuenta(){
        return cuenta;
    }
    
}
