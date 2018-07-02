/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class ControlVAdministrador implements ActionListener {
    private VAdministrador administradorV;
    private Administrador admin;
    private ArrayList<String> id = new ArrayList();
    private ArrayList<String[]> busquedaProductos;
    public TableRowSorter<TableModel> tr;
    
    ControlVAdministrador(VAdministrador vAdmin, Administrador a){
        this.administradorV = vAdmin;
        this.admin = a;
        administradorV.getBotonAceptar().addActionListener(this);
        administradorV.getBotonCancelar().addActionListener(this);
        administradorV.getBotonNewProducto().addActionListener(this);
        administradorV.getBotonRemoveProducto().addActionListener(this);
        administradorV.getBotonReporte().addActionListener(this);
        administradorV.getBotonSalir().addActionListener(this);
        administradorV.getBotonAnadirExistente().addActionListener(this);
        administradorV.getBotonAnadirProducto2().addActionListener(this);
        administradorV.getBotonAumentar().addActionListener(this);
        administradorV.getBotonRetirar().addActionListener(this);
        administradorV.getBotonImprimir().addActionListener(this);
        administradorV.getBotonRegresar().addActionListener(this);
        administradorV.getBotonRetirarVolver().addActionListener(this);
        administradorV.getBotonVolverAumentarProductos().addActionListener(this);
        administradorV.getLabelBienvenida().setText("Bienvenid@ "+ a.getNombre()+" "+ a.getApellido());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(administradorV.getBotonAnadirProducto2() == evento.getSource()){
            administradorV.getVAnadirProducto2().setVisible(false);
            administradorV.getVAnadirProducto().setVisible(true);
            administradorV.getVAnadirProducto().setBounds(0, 0, 555, 725);
            administradorV.getVAnadirProducto().setLocationRelativeTo(null);            
        }
        if(administradorV.getBotonNewProducto() == evento.getSource()){
           administradorV.getVAnadirProducto2().setVisible(true);
           administradorV.getVAnadirProducto2().setBounds(0, 0, 400, 300);
           administradorV.getVAnadirProducto2().setLocationRelativeTo(null);   
        }
        if(administradorV.getBotonRemoveProducto() == evento.getSource()){
           administradorV.getVRemover().setVisible(true);
           administradorV.getVRemover().setBounds(0, 0, 800, 550);
           administradorV.getVRemover().setLocationRelativeTo(null);
           llenarTablaProductos();
        }
        if(administradorV.getBotonReporte() == evento.getSource()){       
            administradorV.getVReporte().setVisible(true);
            administradorV.getVReporte().setBounds(0, 0, 800, 490);
     
            administradorV.getVReporte().setLocationRelativeTo(null);
        }
        if(administradorV.getBotonSalir() == evento.getSource()){
            VHome home = new VHome();
            home.setLocationRelativeTo(null);
            home.setVisible(true);
            ControlVHome cHome = new ControlVHome(home);         
        }
        if(administradorV.getBotonCancelar() == evento.getSource()){
            //Se cancela la agregacion de nuevo producto
            administradorV.getVAnadirProducto().setVisible(false);
        }
        if(administradorV.getBotonAnadirExistente() == evento.getSource()){
            //Se selecciona la opcion de añadir existente, se abre       
            administradorV.getVAnadirProducto2().setVisible(false);
            administradorV.getVAumentarProducto().setVisible(true);
            administradorV.getVAumentarProducto().setBounds(0, 0, 900, 800);
            administradorV.getVAumentarProducto().setLocationRelativeTo(null);
            //Se lee la base de datos y agrega al combo box
            llenarTablaProductosAumentar();
        }
        if(administradorV.getBotonAumentar()== evento.getSource()){
            agregarUnidadesNuevas();
            llenarTablaProductosAumentar();
            //Se selecciona la opcion de añadir existente, se abre 
        }
        if(administradorV.getBotonRetirar() == evento.getSource()){
            retirarProducto();
        }
        //Checar si dejarlo
        if(administradorV.getBotonImprimir()== evento.getSource()){
            System.out.println("Se imprime el reporte");
            administradorV.getVReporte().setVisible(false);
        }
        if(administradorV.getBotonRegresar()== evento.getSource()){
            administradorV.getVReporte().setVisible(false);
        }
        if(administradorV.getBotonRetirarVolver()== evento.getSource()){
            administradorV.getVRemover().setVisible(false);    
        }
        if(administradorV.getBotonVolverAumentarProductos()== evento.getSource()){
            administradorV.getVAumentarProducto().setVisible(false);
        }
        if(administradorV.getBotonAceptar() == evento.getSource()){
            //Se añade el nuevo producto a la base
            agregarNuevoProducto(); 
        }
    }
    public void agregarNuevoProducto(){
        try{
            String id = administradorV.getTextId().getText();
            String nombre = administradorV.getTextNombre().getText();
            double precio_venta = Double.parseDouble(administradorV.getTextPrecio().getText());          
            double precio_compra = Double.parseDouble(administradorV.getTextPrecioCompra().getText());
            String descripcion = administradorV.getTextDescripcion().getText();
            Integer no_articulos  = Integer.parseInt(administradorV.getTextCantidad().getText());
            String marca = administradorV.getTextMarca().getText();
            Integer id_categoria = administradorV.getComboBoxCategoria().getSelectedIndex();
            if(id.length()<13 || nombre.equals("") || precio_venta<0 || precio_compra<0 ||descripcion.equals("") || no_articulos<0 || marca.equals("") ){
                JOptionPane.showMessageDialog(null, "Datos erroneos");
            }else{
                System.out.println(nombre+" "+ precio_venta + " "+ precio_compra+ " "+ 
                descripcion+ " "+ no_articulos+" "+
                marca+" "+ id_categoria);
                Conexion con = new Conexion();
                Object[]valoresProducto = new Object [8];
                valoresProducto[0]=id;
                valoresProducto[1]=nombre;
                valoresProducto[2]=precio_venta;
                valoresProducto[3]=precio_compra;
                valoresProducto[4]=descripcion;
                valoresProducto[5]=no_articulos;
                valoresProducto[6]=marca;
                valoresProducto[7]=id_categoria+1;  
                con.insert("productos", valoresProducto);
                limpiarCampos(); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Datos erroneos");
        }
    }            

    public void agregarUnidadesNuevas(){
        String []camposModificar = new String [1];
        camposModificar[0]= "no_articulos";
        Object []datosNuevos = new Object[1];
        try{
            String [] cadenaArray = busquedaProductos.get(administradorV.getTablaAumentarProductos().getSelectedRow());
            datosNuevos[0]= Integer.parseInt(cadenaArray[5])+Integer.parseInt(administradorV.getTextAumentar().getText());
            Conexion.modificarTabla("productos", camposModificar, datosNuevos , "id", cadenaArray[0]);
            //administradorV.getVAumentarProducto().setVisible(false);  
            administradorV.getTextAumentar().setText(null);
        }catch(Exception e){
            administradorV.getTextAumentar().setText(null);
            JOptionPane.showMessageDialog(null, "No has seleccionado un elemento de la tabla");
        }        
    }
    public void limpiarCampos(){
        administradorV.getTextId().setText(null);
        administradorV.getTextCantidad().setText(null);
        administradorV.getTextDescripcion().setText(null);
        administradorV.getTextMarca().setText(null);
        administradorV.getTextNombre().setText(null);
        administradorV.getTextPrecio().setText(null);
        administradorV.getTextPrecioCompra().setText(null);
    }
    public void retirarProducto(){     
        try{
            String [] productoAEliminar = busquedaProductos.get(0);
            try{
                DefaultTableModel tm = (DefaultTableModel) administradorV.getTablaProductos().getModel();
                String idEliminar = busquedaProductos.get(administradorV.getTablaProductos().getSelectedRow())[0];
                Conexion.eliminar("productos", idEliminar);
                llenarTablaProductos();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, " No has selecionado una producto para retirar");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay elementos para agregar a la tabla");
        }
    }
    public void llenarTablaProductos(){
        String []columnas = {"                     Id",
        "                    Nombre","                    Unidades"};
        DefaultTableModel dtm=new DefaultTableModel(null,columnas){
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};
        try{
            busquedaProductos = Conexion.obtenerTabla("productos"); 
            for(int i=0;i<busquedaProductos.size();i++){
                String[] busquedaArray = busquedaProductos.get(i); 
                String dato1= busquedaArray[0];
                String dato2= busquedaArray[1];
                String dato3= busquedaArray[5];
                String[]filasContenido={dato1,dato2,dato3};
                dtm.addRow(filasContenido);                   
            }
            administradorV.getTablaProductos().setModel(dtm);    
            tr=new TableRowSorter<>(dtm);
            administradorV.getTablaProductos().setRowSorter(tr);            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay elementos para agregar a la tabla");
        }                
    }
    public void llenarTablaProductosAumentar(){
        String []columnas = {"                     Id",
        "                    Nombre","                    Unidades"};
        DefaultTableModel dtm=new DefaultTableModel(null,columnas){
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};
        try{
            busquedaProductos = Conexion.obtenerTabla("productos");
            int i;
            for(i=0;i<busquedaProductos.size();i++){
                String[] busquedaArray = busquedaProductos.get(i); 
                String dato1= busquedaArray[0];
                String dato2= busquedaArray[1];
                String dato3= busquedaArray[5];
                String[]filasContenido={dato1,dato2,dato3};
                dtm.addRow(filasContenido);                   
            }   

            administradorV.getTablaAumentarProductos().setModel(dtm);    
            tr=new TableRowSorter<>(dtm);
            administradorV.getTablaAumentarProductos().setRowSorter(tr);            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay elementos para agregar a la tabla");
        }        
    }
    public void llenarTablaReporte(){
    }
}
