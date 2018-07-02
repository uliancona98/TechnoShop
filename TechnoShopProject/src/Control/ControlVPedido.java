
package Control;
import Modelo.*;

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class ControlVPedido implements ActionListener {
    
    public static TableRowSorter<TableModel> tr;
    
    private VPedido vPedido;
    private  Usuario usuario;
    private ArrayList <Producto> productos;//para que es el array? que recibe?
    private double totalCompra=0;
    
    private Producto producto;
    
    String precioTotal;//para convertir el totalCompra a string e imprimirlo en etiqueta Total
    JTable tabla;
    public ControlVPedido(VPedido pedido, Usuario usuario, Producto producto){
        tabla=pedido.gettablaProductos();
        
        pedido.getetiquetaFechaPedido().setText(FechaActual());
        this.vPedido=pedido;
        
        this.usuario=usuario;
        this.producto=producto;
        System.out.println(producto.getId()+" popi ");
        llenarTabla(tabla, producto);
        
        this.totalCompra=producto.getPrecioVenta()*producto.getNoArticulos();//multiplio el precio del producto por el numero deproductos
         precioTotal=String.valueOf(totalCompra);//para poner el precio total en la ventana
       
         pedido.getetiquetaTotalaPagar().setText(precioTotal);//imprimo el precio total en la vetana
         pedido.getetiquetaTotal().setText(precioTotal);
         
        this.vPedido.getbotonAceptar().addActionListener(this);
        
        this.vPedido.getbotonAgregarTarjeta().addActionListener(this);
        this.vPedido.getbotonCancelar().addActionListener(this);
        this.vPedido.getbotonPagarPuntos().addActionListener(this);
        this.vPedido.getbotonAceptarTarjeta().addActionListener(this);
        this.vPedido.getbotonCancelar().addActionListener(this);
        
        
    }
    
    
    
    public ControlVPedido(VPedido pedido, Usuario usuario,ArrayList <Producto> productos){
         pedido.getetiquetaFechaPedido().setText(FechaActual());
        tabla=pedido.gettablaProductos();
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
        llenarTabla(tabla,productos);
        this.vPedido.getbotonAceptar().addActionListener(this);
        this.vPedido.getbotonAgregarTarjeta().addActionListener(this);
        this.vPedido.getbotonCancelar().addActionListener(this);
        this.vPedido.getbotonPagarPuntos().addActionListener(this);
        this.vPedido.getbotonAceptarTarjeta().addActionListener(this);
        
       
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
            
            
 
            
        }
        
        
                if(vPedido.getbotonAceptarTarjeta()==evento.getSource()){
                Tarjeta tarjeta= new Tarjeta();
                if(vPedido.getTTitularTarjeta().getText().length() !=0  && vPedido.getTNumeroTarjeta().getText().length()!=0 ){
                    tarjeta.setNoTarjeta(vPedido.getTNumeroTarjeta().getText());
                    usuario.setTarjeta(tarjeta);//le agrego una tarjeta al usuario
                    JOptionPane.showMessageDialog(null, "Tarjeta Agregada");
                    vPedido.getVentanaTarjeta().setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                }
                
            }
    }
    
    public void llenarTabla(JTable tabla, Producto producto){
          String []columnas = {"                     Producto",
        "                    Unidades","                    Precio individual","                   Precio Total"};
          DefaultTableModel dtm=new DefaultTableModel(null,columnas){
                     @Override
                    public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
    }
          };
            String dato1=producto.getNombre();
            String dato2=Integer.toString(producto.getNoArticulos());
            String dato3=Double.toString(producto.getPrecioVenta());
            String dato4=Double.toString(producto.getPrecioVenta()*producto.getNoArticulos());
            String[]filasContenido={dato1,dato2,dato3,dato4};
            System.out.println(dato1+dato2+dato3+dato4);
            dtm.addRow(filasContenido);
            tabla.setModel(dtm); 
        tr=new TableRowSorter<>(dtm);
        tabla.setRowSorter(tr);     
    }
    
    public void llenarTabla(JTable tabla, ArrayList <Producto> productos){
         String []columnas = {"                     Producto",
        "                    Unidades","                    Precio individual","                   Precio Total"};
      
      DefaultTableModel dtm=new DefaultTableModel(null,columnas){
                 @Override
                public boolean isCellEditable(int row, int column) {
                //all cells false
                    return false;
    }
      };
       for(int i=0;i<productos.size();i++){
           String dato1= productos.get(i).getNombre();
            String dato2=Integer.toString(productos.get(i).getNoArticulos());
            String dato3=Double.toString(productos.get(i).getPrecioVenta());
            String dato4=Double.toString(productos.get(i).getPrecioVenta()*productos.get(i).getNoArticulos());
            String[]filasContenido={dato1,dato2,dato3,dato4};
            dtm.addRow(filasContenido);
            
       }
       tabla.setModel(dtm); 
       tr=new TableRowSorter<>(dtm);
       tabla.setRowSorter(tr);  
    }
    
    
    
}
