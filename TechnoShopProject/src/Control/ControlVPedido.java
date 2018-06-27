
package Control;
import Modelo.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ControlVPedido implements ActionListener {
    private VPedido pedido;
    private  Usuario usuario;
    private Producto producto;
    public ControlVPedido(VPedido pedido, Usuario usuario, Producto producto){
        this.pedido=pedido;
        this.usuario=usuario;
        this.producto=producto;
        pedido.getetiquetaFechaPedido().setText(FechaActual());
    }
    
    public static String FechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYy");
        return formatoFecha.format(fecha);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(pedido.getbotonCancelar()== evento.getSource()){
            pedido.setVisible(false);
        }
        if(pedido.getbotonAgregarTarjeta()== evento.getSource()){
            VTarjeta VT = new VTarjeta();
            VT.setLocationRelativeTo(null);
            VT.setVisible(true);
            ControlVTarjeta CT= new ControlVTarjeta();
        }
        
        
        
        
    }
    
}
