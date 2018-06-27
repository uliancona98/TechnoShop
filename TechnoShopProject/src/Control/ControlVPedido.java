
package Control;
import Modelo.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ControlVPedido implements ActionListener {
    private VPedido pedido;
    
    public ControlVPedido(VPedido pedido){
        this.pedido=pedido;
        pedido.getetiquetaFechaPedido().setText(FechaActual());
    }
    
    public static String FechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYy");
        return formatoFecha.format(fecha);
    }
    
    
 
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        
        
    }
    
}
