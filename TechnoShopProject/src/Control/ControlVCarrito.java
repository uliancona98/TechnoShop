
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
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 * Clase controlador que responde a los eventos de la vista Carrito al igual
 * que recibe ciertos datos del modelo como el carrito, productos entre otros.
 */
public class ControlVCarrito implements ActionListener {
    private VCarrito vCarrito;
    private  Usuario usuario;
    private ArrayList <Producto> productos;
    private JTable tabla;
    private Producto producto=null;
    /**
     * Constructor que inicializa la clase con parametros de la vista carrito y
     * el usuario ya ingresado
     * @param vCarrito nombre del parametro de la vista Carrito
     * @param usuario nombre del parametro del usuario
     */
    public ControlVCarrito(VCarrito vCarrito, Usuario usuario) {
        this.usuario = usuario; 
        this.vCarrito = vCarrito;  
        inicializar();
    }
    /**
     * Metodo que inicializa la vista Carrito y sus elementos
     */
    public void inicializar(){
        vCarrito.getbComprar().addActionListener(this);
        vCarrito.getbEliminar().addActionListener(this);
        vCarrito.getbReturn().addActionListener(this); 
        if(usuario.getCarrito()==null){
        vCarrito.getbComprar().setVisible(false);  
        }
        try{          
            tabla=vCarrito.getTablaCarrito();
            productos = usuario.getCarrito().getProductos();
            llenarTabla(tabla,productos);            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay elementos en el carrito");        
        }        
    }
    /**
     * Metodo que activa los eventos de las peticiones del usuario de la vista Carrito
     * @param evento Metodo que permite llenar el arreglo de productos
     */
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
    /**
     * Metodo que te permite llenar una arraylist de los productos del carrito
     * @param tabla parametro que representa la tabla especifica de la base de datos
     * @param productos parametro que recibe el arreglo de productos
     */
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
    /**
     * Metodo que permite eliminar elementos de la tabla
     * @param tabla parametro que representa la tabla especifica de la base de datos
     * @param productos parametro que recibe el arreglo de productos
     */
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


