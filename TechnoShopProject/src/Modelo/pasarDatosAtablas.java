
package Modelo;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class pasarDatosAtablas {
     public static TableRowSorter<TableModel> tr; 
     
    public static void llenarTabla(JTable tabla, ArrayList <Producto> productos){
        String []columnas = {"                     Producto",
        "                    Unidades","                    Precio individual","                   Precio Total"};
      
      DefaultTableModel dtm=new DefaultTableModel(null,columnas);
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
    
    public static void llenarTabla(JTable tabla, Producto producto){
        
        String []columnas = {"                     Producto",
        "                    Unidades","                    Precio individual","                   Precio Total"};
          DefaultTableModel dtm=new DefaultTableModel(null,columnas);
            String dato1=producto.getNombre();
            String dato2=Integer.toString(producto.getNoArticulos());
            String dato3=Double.toString(producto.getPrecioVenta());
            String dato4=Double.toString(producto.getPrecioVenta()*producto.getNoArticulos());
            String[]filasContenido={dato1,dato2,dato3,dato4};
            dtm.addRow(filasContenido);
            tabla.setModel(dtm); 
        tr=new TableRowSorter<>(dtm);
        tabla.setRowSorter(tr);     
    }
}
