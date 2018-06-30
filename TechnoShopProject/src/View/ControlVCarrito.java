
package Control;


import View.VCarrito;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class ControlVCarrito implements ActionListener {
    
    private VCarrito carrito;
    public ControlVCarrito(VCarrito c) {
        
        carrito = c;
        carrito.getbComprar().addActionListener(this);
        carrito.getbEliminar().addActionListener(this);
        carrito.getbReturn().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        //Condicional si se presiona el boton "Comprar"  
        if(carrito.getbComprar() == evento.getSource()){
            
            
        }
        
        //Condicional si se presiona el boton "Eliminar"  
        if(carrito.getbEliminar() == evento.getSource()){
            
            
        }
        
        //Condicional si se presiona el boton "Return"  
        if(carrito.getbReturn() == evento.getSource()){
            
            
        }
        
        
    }
    
}


