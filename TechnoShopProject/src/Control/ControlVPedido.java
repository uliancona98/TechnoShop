
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
    private VPedido vPedido;
    private  Usuario usuario;
    private ArrayList <Producto> productos;//para que es el array? que recibe?
    private double totalCompra=0;
    
    private Producto producto;
    Tarjeta tarjeta;
    String precioTotal;//para convertir el totalCompra a string e imprimirlo en etiqueta Total
    
    public ControlVPedido(VPedido pedido, Usuario usuario, Producto producto){
        this.vPedido=pedido;
        this.usuario=usuario;
        this.producto=producto;
        pasarDatosAtablas.llenarTabla(vPedido.gettablaProductos(), producto);
        this.totalCompra=producto.getPrecioVenta()*producto.getNoArticulos();//multiplio el precio del producto por el numero deproductos
         precioTotal=String.valueOf(totalCompra);//para poner el precio total en la ventana
       
         pedido.getetiquetaTotalaPagar().setText(precioTotal);//imprimo el precio total en la vetana
         pedido.getetiquetaTotal().setText(precioTotal);
         
        this.vPedido.getbotonAceptar().addActionListener(this);
        
        this.vPedido.getbotonAgregarTarjeta().addActionListener(this);
        this.vPedido.getbotonCancelar().addActionListener(this);
        this.vPedido.getbotonPagarPuntos().addActionListener(this);
        
        pedido.getetiquetaFechaPedido().setText(FechaActual());
    }
    
    
    
    public ControlVPedido(VPedido pedido, Usuario usuario,ArrayList <Producto> productos){
        this.productos=new ArrayList();
        
        for(int i=0;i<productos.size();i++){
            this.totalCompra=productos.get(i).getPrecioVenta()*productos.get(i).getNoArticulos()+totalCompra;
        }
         precioTotal=String.valueOf(totalCompra);//para pasar el precio a string 
         pedido.getetiquetaTotalaPagar().setText(precioTotal);//para imprimir el precio en la vetana
         pedido.getetiquetaTotal().setText(precioTotal);
        this.vPedido=pedido;
        this.usuario=usuario;
        this.productos=productos;
       pasarDatosAtablas.llenarTabla(vPedido.gettablaProductos(), productos);
        this.vPedido.getbotonAceptar().addActionListener(this);
        this.vPedido.getbotonAgregarTarjeta().addActionListener(this);
        this.vPedido.getbotonCancelar().addActionListener(this);
        this.vPedido.getbotonPagarPuntos().addActionListener(this);
    }
    
    
    
    public static String FechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YY");
        return formatoFecha.format(fecha);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vPedido.getbotonCancelar()== evento.getSource()){
            vPedido.setVisible(false);
        }
        if(vPedido.getbotonAgregarTarjeta()== evento.getSource()){
            vPedido.getVentanaTarjeta().setVisible(true);
            vPedido.getVentanaTarjeta().setBounds(0, 0, 494, 218);
            vPedido.getVentanaTarjeta().setLocationRelativeTo(null);
        }
        if(vPedido.getbotonAceptar()== evento.getSource()){
            int numeroCompra;
            
            numeroCompra = (int) (Math.random() * 100) + 1;
            JOptionPane.showMessageDialog(null, " Compra realizada con exito " + 
                    " Tu numero de compra es " + numeroCompra);
        }
        //usuario.getMembresia().getPuntos();
        if(vPedido.getbotonPagarPuntos()==evento.getSource()){
            double puntosNuevos;
            if(usuario.getMembresia().getPuntos()>0){
                double numeroPuntosUtilizar=Double.parseDouble(JOptionPane.showInputDialog(null, "Tienes" +usuario.getMembresia().getPuntos()+ "puntos "+"¿Cuantos puntos deseas usar?"));
                System.out.println(numeroPuntosUtilizar);
               puntosNuevos=usuario.getMembresia().getPuntos()-numeroPuntosUtilizar;
               usuario.getMembresia().setPuntos(puntosNuevos);
                totalCompra=totalCompra-numeroPuntosUtilizar;
                precioTotal=String.valueOf(totalCompra);
                vPedido.getetiquetaTotalaPagar().setText(precioTotal);
                //una vez que reduce el precio cuando usa sus puntos, imprime el nuevo saldo en la ventana.
                usuario.getMembresia().acumularPuntos(totalCompra);
                
            }else{
                JOptionPane.showMessageDialog(null, "No cuentas con suficientes puntos");
            }
            
            
            if(vPedido.getbotonAceptarTarjeta()==evento.getSource()){
                if(vPedido.getTTitularTarjeta().getText() !=" "   && vPedido.getTNumeroTarjeta().getText() !=" " ){
                    tarjeta.setNoTarjeta(vPedido.getTNumeroTarjeta().getText());
                    usuario.setTarjeta(tarjeta);//le agrego una tarjeta al usuario
                    JOptionPane.showMessageDialog(null, "Tarjeta Agregada");
                    vPedido.getVentanaTarjeta().setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                }
                
            }
            
        }
    }
    
    
    
    
}
