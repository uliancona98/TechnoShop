
package Control;

import Modelo.Producto;
import Modelo.Usuario;
import View.VCarrito;
import View.VPedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JTable tabla;
    
    public ControlVCarrito(VCarrito vCarrito, Usuario usuario) {
        tabla=vCarrito.getTablaCarrito();
        this.usuario = usuario;
        productos = usuario.getCarrito().getProductos();
        this.vCarrito = vCarrito;
        this.vCarrito.getbComprar().addActionListener(this);
        this.vCarrito.getbEliminar().addActionListener(this);
        this.vCarrito.getbReturn().addActionListener(this);
        try{
            llenarTabla(tabla,usuario.getCarrito().getProductos());            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay elementos en el carrito");        
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        //Condicional si se presiona el boton "Comprar"  
        if(vCarrito.getbComprar() == evento.getSource()){
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
        if(productos.isEmpty()){
            vCarrito.getbEliminar().setVisible(false);
            tabla.setModel(dtm);
        }else{
            for(int i=0;i<productos.size();i++){
                String dato1= productos.get(i).getNombre();
                String dato2=Integer.toString(productos.get(i).getNoArticulos());
                String dato3=Double.toString(productos.get(i).getPrecioVenta());
                String dato4=Double.toString(productos.get(i).getPrecioVenta()*productos.get(i).getNoArticulos());
                String[]filasContenido={dato1,dato2,dato3,dato4};
                dtm.addRow(filasContenido);        
            }
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


