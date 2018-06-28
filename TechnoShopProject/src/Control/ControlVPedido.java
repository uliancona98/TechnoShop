
package Control;
import Modelo.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class ControlVPedido implements ActionListener {
    private VPedido pedido;
    private  Usuario usuario;
    private ArrayList <Producto> productos;
    public double totalCompra=0;
    private Producto producto;
    public ControlVPedido(VPedido pedido, Usuario usuario, Producto producto){
        this.pedido=pedido;
        this.usuario=usuario;
        this.producto=producto;
        this.totalCompra=producto.getPrecioVenta();
        this.pedido.getbotonAceptar().addActionListener(this);
        this.pedido.getbotonAgregarTarjeta().addActionListener(this);
        this.pedido.getbotonCancelar().addActionListener(this);
        this.pedido.getbotonPagarPuntos().addActionListener(this);
      
        pedido.getetiquetaFechaPedido().setText(FechaActual());
    }
    public ControlVPedido(VPedido pedido, Usuario usuario,ArrayList <Producto> productos){
        this.productos=new ArrayList();
        
        for(int i=0;i<productos.size();i++){
            this.totalCompra=productos.get(i).getPrecioVenta()+totalCompra;
        }
        this.pedido=pedido;
        this.usuario=usuario;
        this.productos=productos;
        
        this.pedido.getbotonAceptar().addActionListener(this);
        this.pedido.getbotonAgregarTarjeta().addActionListener(this);
        this.pedido.getbotonCancelar().addActionListener(this);
        this.pedido.getbotonPagarPuntos().addActionListener(this);
    }
    
    
    
    public static String FechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YY");
        return formatoFecha.format(fecha);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(pedido.getbotonCancelar()== evento.getSource()){
            pedido.setVisible(false);
        }
        if(pedido.getbotonAgregarTarjeta()== evento.getSource()){
            pedido.getVentanaTarjeta().setVisible(true);
            pedido.getVentanaTarjeta().setBounds(0, 0, 494, 218);
            pedido.getVentanaTarjeta().setLocationRelativeTo(null);
        }
        if(pedido.getbotonAceptar()== evento.getSource()){
            int numeroCompra;
            
            numeroCompra = (int) (Math.random() * 100) + 1;
            JOptionPane.showMessageDialog(null, " Compra realizada con exito " + 
                    " Tu numero de compra es " + numeroCompra);
        }
        usuario.getMembresia().getPuntos();
        if(pedido.getbotonPagarPuntos()==evento.getSource()){
            double puntosNuevos;
            if(usuario.getMembresia().getPuntos()>0){
                double numeroPuntosUtilizar=Double.parseDouble(JOptionPane.showInputDialog(null, "Tienes" +usuario.getMembresia().getPuntos()+ "puntos "+"¿Cuantos puntos deseas usar?"));
                System.out.println(numeroPuntosUtilizar);
               puntosNuevos=usuario.getMembresia().getPuntos()-numeroPuntosUtilizar;
               usuario.getMembresia().setPuntos(puntosNuevos);
                totalCompra=totalCompra-numeroPuntosUtilizar;
                usuario.getMembresia().acumularPuntos(totalCompra);
            }else{
                JOptionPane.showMessageDialog(null, "No cuentas con suficientes puntos");
            }
        }
        
        
        
        
    }
    
}
