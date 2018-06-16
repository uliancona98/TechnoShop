/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author A13003988
 */
public class Cuenta {
    protected String Nombre;
    protected String Apellido;
    protected String Correo;
    protected String Contraseña;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
}
