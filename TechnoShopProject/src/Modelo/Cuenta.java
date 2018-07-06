/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 */
public class Cuenta {
    protected String Nombre;
    protected String Apellido;
    protected String Correo;
    protected String Contrasena;
    /**
     * Metodo en el que se define el nombre del tipo de cuenta
     * @param Nombre nombre que se define
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     *  Metodo en el que se define el apellido del tipo de cuenta
     * @param Apellido apellido que se define
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /**
     *  Metodo en el que se define el correo del tipo de cuenta
     * @param Correo correo que se define
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    /**
     *  Metodo en el que se define la contraseña del tipo de cuenta
     * @param Contrasena contraseña que se define
     */
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    /**
     * Metodo en el que se devuelve el nombre del tipo de cuenta
     * @return String devuelve el nombre
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * Metodo en el que se devuelve el apellido del tipo de cuenta
     * @return String devuelve el apellido
     */
    public String getApellido() {
        return Apellido;
    }
    /**
     * Metodo en el que se devuelve el correo del tipo de cuenta
     * @return String devuelve el correo
     */
    public String getCorreo() {
        return Correo;
    }
    /**
     * Metodo en el que se devuelve la contraseña del tipo de cuenta
     * @return devuelve la contraseña
     */
    public String getContrasena() {
        return Contrasena;
    }
}
