
package Control;

import Modelo.Login;
import Modelo.Producto;
import Modelo.Usuario;
import View.VCarrito;
import View.VHome;
import View.VPedido;
import View.VProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControlVCarrito implements ActionListener {
    private VCarrito vCarrito;
    private  Usuario usuario;
    private ArrayList <Producto> productos;
    private JTable tabla;
    private Producto producto=null;
    
    public ControlVCarrito(VCarrito vCarrito, Usuario usuario) {
        this.usuario = usuario; 
        this.vCarrito = vCarrito;  
        inicializar();
    }
    /*public ControlVCarrito(VCarrito vCarrito, Usuario usuario, Producto producto) {
        this.producto = producto;
        this.usuario = usuario; 
        this.vCarrito = vCarrito;
        inicializar();        
    }    */
    public void inicializar(){
        vCarrito.getbComprar().addActionListener(this);
        vCarrito.getbEliminar().addActionListener(this);
        vCarrito.getbReturn().addActionListener(this);          
        try{          
            tabla=vCarrito.getTablaCarrito();
            productos = usuario.getCarrito().getProductos();
            llenarTabla(tabla,productos);            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay elementos en el carrito");        
        }        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        //Condicional si se presiona el boton "Comprar"  
        if(vCarrito.getbComprar() == evento.getSource()){
            vCarrito.setVisible(false);
            VPedido ventanaPedido =new VPedido();
            ventanaPedido.setLocationRelativeTo(null);
            ventanaPedido.setVisible(true);
            ControlVPedido CP = new ControlVPedido(ventanaPedido,usuario,productos);            
        }
        //Condicional si se presiona el boton "Eliminar"  
        if(vCarrito.getbEliminar() == evento.getSource()){
            eliminarElementoTabla(tabla,productos); 
            
        }
        //Condicional si se presiona el boton "Return"  
        if(vCarrito.getbReturn() == evento.getSource()){
            vCarrito.setVisible(false);
            if(producto!=null){
                VProducto vProducto = new VProducto();
                vProducto.setVisible(true);
                vProducto.setLocationRelativeTo(null);
                ControlVProducto cvProducto = new ControlVProducto(vProducto,usuario, producto.getCategoria(), producto);                
            }else{
                VHome home = new VHome();
                home.setLocationRelativeTo(null);
                home.setVisible(true);
                ControlVHome cHome = new ControlVHome(home, usuario);                       
            }        
        }
    }
    public void llenarTabla(JTable tabla,ArrayList <Producto> productos ){
        String []columnas = {"Producto",
        "   Unidades","   Precio individual",
        "   Precio Total"};
        DefaultTableModel dtm=new DefaultTableModel(null,columnas){
        @Override
        public boolean isCellEditable(int row, int column) {
        return false;}};
        double total =0;
        if(productos.isEmpty()){
            vCarrito.getbEliminar().setVisible(false);
            DecimalFormat decimales = new DecimalFormat("0.00");             
            vCarrito.getLabelTotal().setText("$ "+decimales.format(total));
            tabla.setModel(dtm);
        }else{
            for(int i=0;i<productos.size();i++){
                String dato1= productos.get(i).getNombre();
                String dato2=Integer.toString(productos.get(i).getNoArticulos());
                String dato3=Double.toString(productos.get(i).getPrecioVenta());
                String dato4=Double.toString(productos.get(i).getPrecioVenta()*productos.get(i).getNoArticulos());
                String[]filasContenido={dato1,dato2,dato3,dato4};
                dtm.addRow(filasContenido);   
                total = total+productos.get(i).getPrecioVenta()*productos.get(i).getNoArticulos();                
            }
            DecimalFormat decimales = new DecimalFormat("0.00");             
            vCarrito.getLabelTotal().setText("$ "+decimales.format(total));
            tabla.setModel(dtm); 
        }
    }
      
    public void eliminarElementoTabla(JTable tabla,ArrayList <Producto> productos){       
        try{
        //DefaultTableModel dtm = (DefaultTableModel)tabla.getModel();
        //dtm.removeRow(tabla.getSelectedRow()); 
            productos.remove(tabla.getSelectedRow());
            JOptionPane.showMessageDialog(null,"Eliminado correctamente");
            llenarTabla(tabla,productos); 
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, " No has selecionado un producto");
        }
    }
      
}


