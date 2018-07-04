
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
    private double totalCompra=0;
    private ArrayList<String[]> busquedaProductos;
    private ArrayList <Producto> productos=null;//para que es el array? que recibe?    
    private Producto producto=null;
    private Pedido pedido;
    private double numeroPuntosUtilizar=0;
    private String precioTotal;//para convertir el totalCompra a string e imprimirlo en etiqueta Total
    private String fecha;
    /**
     * Constructor con parametros de la vista Pedido, el producto y el usuario
     * @param vPedido
     * @param usuario
     * @param producto 
     */
    public ControlVPedido(VPedido vPedido, Usuario usuario, Producto producto){
        this.usuario=usuario;
        this.producto=producto;
        this.vPedido=vPedido;
        totalCompra=producto.getPrecioVenta()*producto.getNoArticulos();//multiplio el precio del producto por el numero deproductos        
        JTable tabla=vPedido.gettablaProductos();                
        llenarTabla(tabla, producto); 
        inicializar();        
    }
    /**
     * Constructor con parametros de la vista Pedido, el producto, el usuario
     * y un arreglo de productos
     * @param pedido
     * @param usuario
     * @param productos 
     */
    public ControlVPedido(VPedido pedido, Usuario usuario,ArrayList <Producto> productos){
        this.productos=new ArrayList();
        this.vPedido=pedido;
        this.usuario=usuario;
        this.productos=productos;        
        for(int i=0;i<productos.size();i++){
            totalCompra=productos.get(i).getPrecioVenta()*productos.get(i).getNoArticulos()+totalCompra;
        }
        JTable tabla=vPedido.gettablaProductos();         
        llenarTabla(tabla,productos);     
        inicializar();
    }
    /**
     * Metodo que inicializa los eventos de los elementos de la vista Pedido
     */
    public void inicializar(){
        fecha = calcularFecha();
        this.vPedido.getetiquetaFechaPedido().setText(fecha);        
        precioTotal=String.valueOf(totalCompra);//para poner el precio total en la ventana      
        this.vPedido.getetiquetaTotalaPagar().setText("$ "+precioTotal);//imprimo el precio total en la vetana
        this.vPedido.getetiquetaTotal().setText("$ "+precioTotal);
        this.vPedido.getbotonAceptar().addActionListener(this);
        this.vPedido.getbotonAgregarTarjeta().addActionListener(this);
        this.vPedido.getbotonCancelar().addActionListener(this);
        this.vPedido.getbotonPagarPuntos().addActionListener(this);
        this.vPedido.getbotonAceptarTarjeta().addActionListener(this);
        this.vPedido.getbotonCancelarTarjeta().addActionListener(this);
    }
    /**
     * Metodo que define y devuelve la fecha del pedido
     * @return String
     */
    public static String calcularFecha(){
        /*DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
        String fecha = dateTimeInstance.format(Calendar.getInstance().getTime()); 
        return fecha;*/
        Date fecha = new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YY");
        return formatoFecha.format(fecha);
    }
    /**
     * Metodo que define cada uno de los eventos que sucederan dependiendo de las
     * peticiones del usuario
     * @param evento 
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vPedido.getbotonCancelar()== evento.getSource()){
            vPedido.setVisible(false);
            //Se le devuelven los puntos
            if(numeroPuntosUtilizar>0){
                usuario.getMembresia().setPuntos(numeroPuntosUtilizar+usuario.getMembresia().getPuntos());             
            }
            System.out.println(usuario.getMembresia().getPuntos()+" puntitos");
            if(producto!=null){
                VProducto vProducto = new VProducto();
                vProducto.setVisible(true);
                vProducto.setLocationRelativeTo(null);                
                ControlVProducto cvProducto = new ControlVProducto(vProducto, usuario, producto.getCategoria(),producto);                                
            }else{
                VCarrito vCarrito = new VCarrito();
                vCarrito.setVisible(true);
                vCarrito.setLocationRelativeTo(null);
                ControlVCarrito cvCarrito = new ControlVCarrito(vCarrito, usuario);
            }
        }
        if(vPedido.getbotonAgregarTarjeta()== evento.getSource()){
            vPedido.getVentanaTarjeta().setVisible(true);
            vPedido.getVentanaTarjeta().setBounds(0, 0, 494, 218);
            vPedido.getVentanaTarjeta().setLocationRelativeTo(null);
        }
        if(vPedido.getbotonAceptar()== evento.getSource()){   
            realizarPedido();
        }
        //usuario.getMembresia().getPuntos();
        if(vPedido.getbotonPagarPuntos()==evento.getSource()){
            pagarConMembresia();
        }
        if(vPedido.getbotonAceptarTarjeta()==evento.getSource()){
            agregarTarjeta();      
        }
        if(vPedido.getbotonCancelarTarjeta()==evento.getSource()){
            vPedido.getVentanaTarjeta().setVisible(false);
        }
    }
    /**
     * Metodo que permite agregar productos a la tabla
     * @param tabla
     * @param producto 
     */
    public void llenarTabla(JTable tabla, Producto producto){
        String []columnas = {"Producto","   Unidades"," Precio individual",
        "   Precio Total"};
        DefaultTableModel dtm=new DefaultTableModel(null,columnas){
        @Override
        public boolean isCellEditable(int row, int column) {
        //all cells false
        return false;
        }};
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
        String []columnas = {"Producto","   Unidades","    Precio individual"
        ,"  Precio Total"};
        DefaultTableModel dtm=new DefaultTableModel(null,columnas){
        @Override
        public boolean isCellEditable(int row, int column) {
        return false;}};
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
    
    public void modificarStock(){
        if(producto!=null){
            try{
                busquedaProductos = Conexion.buscar("productos", (Object)producto.getId(), "id");
                String idBuscar="";
                int unidadesDisponibles=0;
                if(busquedaProductos.size()==1){
                    idBuscar = busquedaProductos.get(0)[0];
                    unidadesDisponibles= Integer.parseInt(busquedaProductos.get(0)[5]);
                }
                String []camposModificar = new String [1];
                camposModificar[0]= "no_articulos";
                Object []datoNuevo = new Object[1];
                Integer unidadesNuevas = unidadesDisponibles-producto.getNoArticulos();
                datoNuevo[0]= unidadesNuevas;
                Conexion.modificar("productos", camposModificar, datoNuevo, "id", idBuscar);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al buscar el producto en Stock");
            }
        }else{
            //SE RESTAN EL STOCK DE TODOS LOS PRODUCTOS, ARRAYLIST***********
            try{
                for(int i=0;i<productos.size();i++){
                    busquedaProductos = Conexion.buscar("productos", (Object)productos.get(i).getId(), "id");
                    String idBuscar="";
                    int unidadesDisponibles=0;
                    if(busquedaProductos.size()==1){
                        idBuscar = busquedaProductos.get(0)[0];
                        unidadesDisponibles= Integer.parseInt(busquedaProductos.get(0)[5]);
                    }
                    String []camposModificar = new String [1];
                    camposModificar[0]= "no_articulos";
                    Object []datoNuevo = new Object[1];
                    Integer unidadesNuevas = unidadesDisponibles-productos.get(i).getNoArticulos();
                    datoNuevo[0]= unidadesNuevas;
                    Conexion.modificar("productos", camposModificar, datoNuevo, "id", idBuscar);                    
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al buscar el producto en Stock");
            }            
        }
    }
    public void pagarConMembresia(){
        double puntosNuevos;
        if(usuario.getMembresia().getPuntos()>0){
            try{
                numeroPuntosUtilizar=Double.parseDouble(JOptionPane.showInputDialog
                (null, "Tienes " +usuario.getMembresia().getPuntos()+ 
                " puntos.\n "+"¿Cuantos puntos deseas usar?"));
                if(numeroPuntosUtilizar<=usuario.getMembresia().getPuntos()&& numeroPuntosUtilizar>0 ){
                    System.out.println(numeroPuntosUtilizar);
                    if(numeroPuntosUtilizar>totalCompra){
                        numeroPuntosUtilizar = totalCompra;
                    }
                    puntosNuevos=usuario.getMembresia().getPuntos()-numeroPuntosUtilizar;
                    usuario.getMembresia().setPuntos(puntosNuevos);                    
                    totalCompra=totalCompra-numeroPuntosUtilizar;
                    vPedido.getetiquetaTotalaPagar().setText("$ "+Double.toString(totalCompra));
                    //una vez que reduce el precio cuando usa sus puntos, imprime el nuevo saldo en la ventana.                        
                }else{
                    JOptionPane.showMessageDialog(null, "No cuentas con los suficientes puntos");
                }                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Entrada no valida");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No cuentas con suficientes puntos");
        }
    }
    
    public void agregarTarjeta(){
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
    
    public void realizarPedido(){
        if(usuario.getTarjeta()==null && totalCompra>0){
            JOptionPane.showMessageDialog(null, "No has agregado una tarjeta para pagar");            
        }else{
            int numeroCompra;
            Pedido pedido = new Pedido();
            pedido.setFecha(fecha);
            pedido.setTotal(totalCompra);
            if(producto!=null){
                pedido.setProducto(producto);                    
            }else{
                for(int i=0;i<productos.size();i++){
                    pedido.setProducto(productos.get(i));  
                }
            }
            String[] atributos = new String[3];
            atributos[0]="total";
            atributos[1]="fecha";
            atributos[2]="id_usuario";
            Object[] valoresPedido = new Object[3];
            valoresPedido[0]= totalCompra;
            valoresPedido[1]= fecha;
            valoresPedido[2]= usuario.getCorreo();
            usuario.getMembresia().acumularPuntos(totalCompra);           
            numeroCompra=Conexion.getLastId("pedidos", valoresPedido, atributos);
            pedido.setNoPedido(numeroCompra);
            this.pedido = pedido;            
            insertarDetallesPedido(numeroCompra);            
            usuario.addPedido(pedido);
            
            //Pagar con tarjeta
            if(usuario.getTarjeta()!=null && totalCompra>0){
                vPedido.setVisible(false);
                JOptionPane.showMessageDialog(null, " Compra realizada con exito " + 
                " \nTu numero de compra es " + numeroCompra);
                modificarStock();
                actualizarInformacionUsuarios();
                vPedido.setVisible(false);
                VHome vHome = new VHome();
                vHome.setVisible(true);
                vHome.setLocationRelativeTo(null);
                ControlVHome cvHome = new ControlVHome(vHome, usuario);                 
            }else if(totalCompra==0){
                //Paga con todo sus puntos
                JOptionPane.showMessageDialog(null, " Compra realizada con exito " + 
                "  \nTu numero de compra es " + numeroCompra);
                modificarStock();
                actualizarInformacionUsuarios();
                vPedido.setVisible(false);
                VHome vHome = new VHome();
                vHome.setVisible(true);
                vHome.setLocationRelativeTo(null);
                ControlVHome cvHome = new ControlVHome(vHome, usuario);                    
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error con tu compra");
            }
        }
    }
    
    public void insertarDetallesPedido(int id_pedido){
        //tabla valores y atribustos
        Object [] valores = new Object [4];
        System.out.println(pedido.getNoPedido());
        Integer noPedido = pedido.getNoPedido();
        valores[0]= noPedido;
        String[]atributos = new String[4];
        atributos[0]= "id_pedido";
        atributos[1]= "id_producto";
        atributos[2]="precio";
        atributos[3]="unidades";
        Integer unidades=0;
        if(producto!=null){
            valores[1]=producto.getId();
            valores[2]=producto.getPrecioVenta();
            unidades=producto.getNoArticulos();
            valores[3]= unidades;
            Conexion.insert("pedidos_detalle", valores, atributos);              
        }else{
            for(int i=0;i<productos.size();i++){
                valores[1]=productos.get(i).getId();
                valores[2]=productos.get(i).getPrecioVenta();
                unidades=productos.get(i).getNoArticulos();
                valores[3]= unidades;                
                Conexion.insert("pedidos_detalle", valores, atributos);            
            }            
        }
    }
    public void actualizarInformacionUsuarios(){
        try{
            busquedaProductos = Conexion.buscar("usuarios", (Object)usuario.getCorreo(), "correo");
            String idBuscar="";
            if(busquedaProductos.size()==1){
                idBuscar = busquedaProductos.get(0)[0];
            }
            System.out.println(idBuscar);
            System.out.println(usuario.getCorreo());
            String []camposModificar = new String [3];
            camposModificar[0]= "nombre_membresia";
            camposModificar[1]= "puntos";
            camposModificar[2]= "valor_compras";
            Object []datosNuevos = new Object[3];
            datosNuevos[0]= usuario.getMembresia().getTipo();
            datosNuevos[1]= usuario.getMembresia().getPuntos();
            datosNuevos[2]= usuario.getMembresia().getValorCompras();      
            Conexion.modificar("usuarios", camposModificar, datosNuevos, "correo", idBuscar);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al buscar el producto en Stock");
        }
    }
}
