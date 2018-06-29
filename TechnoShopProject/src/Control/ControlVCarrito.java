/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Carrito;
import Modelo.Usuario;
import View.VCarrito;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author A13003862
 */
public class ControlVCarrito implements ActionListener{
    private VCarrito vCarrito;
    private  Usuario usuario;
    private Carrito carrito;
    
    
    public ControlVCarrito(VCarrito vCarrito, Usuario usuario){
        this.vCarrito=vCarrito;
        this.usuario=usuario;
        carrito = usuario.getCarrito();
        /*this.pedido.getbotonAceptar().addActionListener(this);
        this.pedido.getbotonAgregarTarjeta().addActionListener(this);
        this.pedido.getbotonCancelar().addActionListener(this);
        this.pedido.getbotonPagarPuntos().addActionListener(this);*/        
        inicializarCarrito();
    }
    public void inicializarCarrito(){
        //Se agregan los datos del carrito a la ventana
    }
    @Override
    public void actionPerformed(ActionEvent evento) {
    }    
}
