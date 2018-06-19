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
public class Usuario extends Cuenta {
   private Membresia membresia;
   private Pedido list;

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Pedido getList() {
        return list;
    }

    public void setList(Pedido list) {
        this.list = list;
    }
   
   
}
