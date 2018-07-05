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
    private ArrayList<String[]> busquedaProductos= new ArrayList();
    public TableRowSorter<TableModel> tr;
    /**
     * Constructor con parametros de la vista administrador y el administrador
     * @param vAdmin
     * @param a 
     */
    ControlVAdministrador(VAdministrador vAdmin, Administrador a){
        this.administradorV = vAdmin;
        this.admin = a;
        administradorV.getBotonAceptar().addActionListener(this);
        administradorV.getBotonCancelar().addActionListener(this);
        administradorV.getBotonNewProducto().addActionListener(this);
        administradorV.getBotonRemoveProducto().addActionListener(this);
        administradorV.getBotonModificar().addActionListener(this);
        administradorV.getBotonSalir().addActionListener(this);
        administradorV.getBotonAnadirExistente().addActionListener(this);
        administradorV.getBotonAnadirProducto2().addActionListener(this);
        administradorV.getBotonAumentar().addActionListener(this);
        administradorV.getBotonRetirar().addActionListener(this);
        administradorV.getBotonRegresar().addActionListener(this);
        administradorV.getBotonRetirarVolver().addActionListener(this);
        administradorV.getBotonVolverAumentarProductos().addActionListener(this);
        administradorV.getBotonAceptarModif().addActionListener(this);
        administradorV.getBotonMostrarModifProducto().addActionListener(this);
        administradorV.getLabelBienvenida().setText("Bienvenid@ "+ a.getNombre()+" "+ a.getApellido());
        administradorV.getTextModifId().setEditable(false);
        administradorV.getTextModifId().setEnabled(false);
    }
    /**
     * Metodo para recibir peticiones del usuario con respecto a la vista administrador
     * @param evento 
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(administradorV.getBotonAnadirProducto2() == evento.getSource()){
            administradorV.getVAnadirProducto2().setVisible(false);
            administradorV.getVAnadirProducto().setVisible(true);
            administradorV.getVAnadirProducto().setBounds(0, 0, 555, 730);
            administradorV.getVAnadirProducto().setLocationRelativeTo(null);            
        }
        if(administradorV.getBotonNewProducto() == evento.getSource()){
            administradorV.setVisible(false);
            administradorV.getVAnadirProducto2().setVisible(true);
            administradorV.getVAnadirProducto2().setBounds(0, 0, 400, 300);
            administradorV.getVAnadirProducto2().setLocationRelativeTo(null);   
        }
        if(administradorV.getBotonRemoveProducto() == evento.getSource()){
           administradorV.setVisible(false);
           administradorV.getVRemover().setVisible(true);
           administradorV.getVRemover().setBounds(0, 0, 800, 550);
           administradorV.getVRemover().setLocationRelativeTo(null);
           llenarTablaProductos();
        }
        if(administradorV.getBotonModificar() == evento.getSource()){
            administradorV.setVisible(false);
            administradorV.getVModificaProducto().setVisible(true);
            administradorV.getVReporte().setBounds(0, 0, 700, 750);
            administradorV.getVReporte().setLocationRelativeTo(null);
            cargarComboBoxProductos();
        }
        if(administradorV.getBotonSalir() == evento.getSource()){
            administradorV.setVisible(false);
            VHome home = new VHome();
            home.setLocationRelativeTo(null);
            home.setVisible(true);
            ControlVHome cHome = new ControlVHome(home);         
        }
        if(administradorV.getBotonCancelar() == evento.getSource()){
            //Se cancela la agregacion de nuevo producto
            administradorV.getVAnadirProducto().setVisible(false);
            administradorV.setVisible(true);
        }
        if(administradorV.getBotonAnadirExistente() == evento.getSource()){
            //Se selecciona la opcion de agregar existente, se abre       
            administradorV.getVAnadirProducto2().setVisible(false);
            administradorV.getVAumentarProducto().setVisible(true);
            administradorV.getVAumentarProducto().setBounds(0, 0, 900, 800);
            administradorV.getVAumentarProducto().setLocationRelativeTo(null);
            //Se lee la base de datos y agrega a la tabla
            llenarTablaProductosAumentar();
        }
        if(administradorV.getBotonAumentar()== evento.getSource()){
            agregarUnidadesNuevas();
            llenarTablaProductosAumentar();
            //Se selecciona la opcion de agregar existente, se abre 
        }
        if(administradorV.getBotonRetirar() == evento.getSource()){
            retirarProducto();
        }
        //Checar si dejarlo
        if(administradorV.getBotonRegresar()== evento.getSource()){
            administradorV.getVReporte().setVisible(false);
        }
        if(administradorV.getBotonRetirarVolver()== evento.getSource()){
            administradorV.getVRemover().setVisible(false);
            administradorV.setVisible(true);
        }
        if(administradorV.getBotonVolverAumentarProductos()== evento.getSource()){
            administradorV.getVAumentarProducto().setVisible(false);
            administradorV.getVAnadirProducto2().setVisible(true);
        }
        if(administradorV.getBotonAceptar() == evento.getSource()){
            //Se agrega el nuevo producto a la base
            agregarNuevoProducto(); 
        }
        if(administradorV.getBotonRegresarModificar()== evento.getSource()){
            administradorV.getVModificaProducto().setVisible(false);
            limpiarCamposModificacion();
            administradorV.setVisible(true);
        }
        if(administradorV.getBotonMostrarModifProducto()== evento.getSource()){
            int indiceSeleccionado = administradorV.getComboBoxModificar().getSelectedIndex();
            try{
                llenarCampos(busquedaProductos.get(indiceSeleccionado));                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error");
            }
        }
        if(administradorV.getBotonAceptarModif()== evento.getSource()){
            try{
                String id = administradorV.getTextModifId().getText();  
                System.out.println(id);
                String descripcion = administradorV.getTextModifDescripcion().getText();
                System.out.println(descripcion);
                String marca = administradorV.getTextModifMarca().getText();
                System.out.println(marca);
                String nombre = administradorV.getTextModifNombre().getText();
                System.out.println(nombre);
                Double precioCompra = Double.parseDouble(administradorV.getTextModifPrecioCompra().getText());
                System.out.println(precioCompra);
                Double precioVenta = Double.parseDouble(administradorV.getTextModifPrecioVenta().getText());
                System.out.println(precioVenta);
                Integer idCategoria = (Integer)administradorV.getComboBoxModifCategoria().getSelectedIndex()+1;
                System.out.println(idCategoria);
                Object []datosNuevos = new Object[6];
                datosNuevos[0]=nombre;
                datosNuevos[1]=precioVenta;
                datosNuevos[2]=precioCompra;
                datosNuevos[3]=descripcion;
                datosNuevos[4]=marca;
                datosNuevos[5]=idCategoria;
                System.out.println(nombre+"--"+precioVenta+"--"+ precioCompra+"--"+descripcion+"--"+marca+"--"+idCategoria);
                String[]campos = new String[6];
                campos[0]="nombre";
                campos[1]="precio_venta";
                campos[2]="precio_compra";
                campos[3]="descripcion";
                campos[4]="marca";
                campos[5]="id_tipoproducto";
                Conexion.modificar("productos", campos, datosNuevos, "id", id);
                if(Conexion.elementoModificado){
                    JOptionPane.showMessageDialog(null, "Elemento modificado correctamente");
                }
                limpiarCamposModificacion();
                cargarComboBoxProductos();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        }
    }
    /**
     * Metodo que llama a los elementos de llenar campos 
     * @param producto 
     */
    public void llenarCampos(String[] producto){
        try{
            administradorV.getTextModifDescripcion().setText(producto[4]);
            administradorV.getTextModifId().setText(producto[0]);
            administradorV.getTextModifMarca().setText(producto[6]);
            administradorV.getTextModifNombre().setText(producto[1]);
            administradorV.getTextModifPrecioCompra().setText(producto[3]);
            administradorV.getTextModifPrecioVenta().setText(producto[2]);
            if("1".equals(producto[7])){
                administradorV.getComboBoxModifCategoria().setSelectedIndex(0);            
            }else if("2".equals(producto[7])){
                administradorV.getComboBoxModifCategoria().setSelectedIndex(1);  
            }else if("3".equals(producto[7])){
                administradorV.getComboBoxModifCategoria().setSelectedIndex(2);
            }else{
                administradorV.getComboBoxModifCategoria().setSelectedItem("Otros");
            }            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
        
    }
    /**
     * Metodo que llama a
     */
    public void cargarComboBoxProductos(){
        administradorV.getComboBoxModificar().removeAllItems();
        busquedaProductos = Conexion.obtenerTabla("productos");     
        for(int i=0;i<busquedaProductos.size();i++){
            String[] busquedaArray = busquedaProductos.get(i); 
            String dato1= busquedaArray[0];
            String dato2= busquedaArray[1];
            administradorV.getComboBoxModificar().addItem("Id producto: "+ dato1+"  Nombre: "+ dato2);
        }        
    }
    /**
     * Metodo que permite agregar un nuevo producto por peticion del administrador
     */
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
                Object[]valoresProducto = new Object [8];
                valoresProducto[0]=id;
                valoresProducto[1]=nombre;
                valoresProducto[2]=precio_venta;
                valoresProducto[3]=precio_compra;
                valoresProducto[4]=descripcion;
                valoresProducto[5]=no_articulos;
                valoresProducto[6]=marca;
                valoresProducto[7]=id_categoria+1;
                Conexion.insert("productos", valoresProducto);
                if(Conexion.elementoInsertado){
                    limpiarCampos();       
                    JOptionPane.showMessageDialog(null,"Producto insertado correctamente");                    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Datos erroneos");
        }
    }            
    /**
     * Metodo que permite agregar unidades a un producto ya existente
     */
    public void agregarUnidadesNuevas(){
        String []camposModificar = new String [1];
        camposModificar[0]= "no_articulos";
        Object []datosNuevos = new Object[1];
        try{
            String [] cadenaArray = busquedaProductos.get(administradorV.getTablaAumentarProductos().getSelectedRow());
            datosNuevos[0]= Integer.parseInt(cadenaArray[5])+Integer.parseInt(administradorV.getTextAumentar().getText());
            Conexion.modificar("productos", camposModificar, datosNuevos , "id", cadenaArray[0]);
            //administradorV.getVAumentarProducto().setVisible(false);  
            administradorV.getTextAumentar().setText(null);
        }catch(Exception e){
            administradorV.getTextAumentar().setText(null);
            JOptionPane.showMessageDialog(null, "No has seleccionado un elemento de la tabla");
        }        
    }
    /**
     * Metodo que elimina los textos ingresados de los campos
     */
    public void limpiarCampos(){
        administradorV.getTextId().setText(null);
        administradorV.getTextCantidad().setText(null);
        administradorV.getTextDescripcion().setText(null);
        administradorV.getTextMarca().setText(null);
        administradorV.getTextNombre().setText(null);
        administradorV.getTextPrecio().setText(null);
        administradorV.getTextPrecioCompra().setText(null);
    }
    /**
     * Metodo que elimina los textos ingresados de los campos de modificacion del producto
     */
    public void limpiarCamposModificacion(){
        administradorV.getTextModifDescripcion().setText(null);
        administradorV.getTextModifId().setText(null);
        administradorV.getTextModifMarca().setText(null);
        administradorV.getTextModifPrecioCompra().setText(null);
        administradorV.getTextModifNombre().setText(null);
        administradorV.getTextModifPrecioCompra().setText(null);
        administradorV.getTextModifPrecioVenta().setText(null);
        administradorV.getComboBoxCategoria().setSelectedIndex(0);
    }
    /**
     * Metodo que permite de acuerdo a la peticion del administrador eliminar un producto existente
     */
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
    /**
     * Metodo que permite llenar el arreglo de productos
     */
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
}
