
package Control;


import Modelo.Carrito;
import Modelo.Producto;
import Modelo.Usuario;
import View.VCarrito;
import View.VProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControlVCarrito implements ActionListener {
    
    private VCarrito vCarrito;
     private  Usuario usuario;
    private Carrito carrito;
    private ArrayList <Producto> productos;
    public ControlVCarrito(VCarrito cArrito) {
        
        vCarrito = cArrito;
        vCarrito.getbComprar().addActionListener(this);
        vCarrito.getbEliminar().addActionListener(this);
        vCarrito.getbReturn().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        //Condicional si se presiona el boton "Comprar"  
        if(vCarrito.getbComprar() == evento.getSource()){
            
            
        }
        
        //Condicional si se presiona el boton "Eliminar"  
        if(vCarrito.getbEliminar() == evento.getSource()){
            
            
        }
        
        //Condicional si se presiona el boton "Return"  
        if(vCarrito.getbReturn() == evento.getSource()){
            vCarrito.setVisible(false);
            
        }
        
        
    }
    
}


