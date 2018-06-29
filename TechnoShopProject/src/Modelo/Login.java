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
    public static Usuario usuario;
    public static Administrador admin;
    
    public static boolean validarCuenta(String correo, char[] contrasenaChar, String tabla){
        String contrasena = "";
        for(int i=0;i<contrasenaChar.length;i++){
            contrasena = contrasena+contrasenaChar[i];
        }
        String []resultado = Conexion.buscar(tabla, correo, "correo");
        
        if(resultado!=null){
            if(contrasena.equals(resultado[3])){
                System.out.println("Contrasena correcta, has iniciado sesion");
                if(tabla.equals("Usuarios")){
                    usuario = new Usuario();
                    usuario.setCorreo(resultado[0]);
                    usuario.setNombre(resultado[1]); 
                    usuario.setApellido(resultado[2]);
                    usuario.setContraseña(resultado[3]);         
                    Membresia membresia = new Membresia();
                    membresia.setTipo(resultado[4]);
                    membresia.setPuntos(Double.parseDouble(resultado[5]));
                    membresia.setValorCompras(Double.parseDouble(resultado[6]));
                    usuario.setMembresia(membresia);              
                }else if(tabla.equals("Administradores")){
                    admin = new Administrador();
                    admin.setCorreo(resultado[0]);
                    admin.setNombre(resultado[1]);
                    admin.setApellido(resultado[2]);
                    admin.setContraseña(resultado[3]);
                }
                return true;
            }else{
                System.out.println("Contrasena incorrecta, vuelve a intentar");
            }
        }else{
            System.out.println("No existe cuenta asociada con este correo");
        }      
        return false;
    }        
}
