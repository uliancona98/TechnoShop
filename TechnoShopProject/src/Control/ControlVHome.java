/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Accesorio;
import Modelo.Conexion;
import Modelo.Dispositivo;
import Modelo.Membresia;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Software;
import Modelo.Usuario;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 * Clase controlador que responde los eventos a la ventana principal (home) y 
 * e invoca varios datos como el usuario entre otros
 */
public class ControlVHome implements ActionListener{
    private VHome home;
    private Usuario usuario = null;
    private ArrayList <Producto> productosVendidos = new ArrayList();
    private ArrayList<String[]> busquedaPedidos = new ArrayList();
    private ArrayList<String[]> busquedaProductos= new ArrayList();
    private ArrayList<Pedido> pedidos;
    
    /**
     * Aqui se llaman los parametros, atributos y las acciones de los elementos del jframe VHome
     * @param h nombre del parametro que representa la vista Home
     */
    public ControlVHome(VHome h){
        home = h;
        home.getBotonPedidos().setVisible(false);
        home.getBotonCerrarSesion().setVisible(false);
        home.getBotonVerCarrito().setVisible(false);
        home.getLabelBienvenida().setText("B I E N V E N I D @ ");
        home.getBotonVerMembresia().setVisible(false);
        incializar();
    }
    /**
     * Aqui se llaman los parametros, atributos y las acciones de los elementos del jframe VHome y
     * al usuario en caso de que este haya iniciado sesion
     * @param h nombre del parametro que representa la vista Home
     * @param user nombre del parametro que representa el usuario
     */
    public ControlVHome(VHome h, Usuario user){
        this.usuario = user;
        home = h;
        home.getLabelBienvenida().setText("Bienvenido "+ usuario.getNombre() +" "+ usuario.getApellido());
        home.getBotonRegistrese().setVisible(false);
        home.getBotonSesion().setVisible(false);
        home.getBotonAdministrador().setVisible(false);
        incializar();     
    }
    /**
     * Metodo que inicializa los eventos de las peticiones del usuario de la ventana Home
     */
    public void incializar(){
        home.getBotonAccesory().addActionListener(this);
        home.getBotonAdministrador().addActionListener(this);
        home.getBotonDevice().addActionListener(this);
        home.getBotonRegistrese().addActionListener(this);
        home.getBotonSesion().addActionListener(this);
        home.getBotonSoftware().addActionListener(this);
        home.getBotonCerrarSesion().addActionListener(this);
        home.getBotonPedidos().addActionListener(this);
        home.getBotonVerCarrito().addActionListener(this);
        home.getBotonVerPedido().addActionListener(this);
        home.getComboBoxPedidos().addActionListener(this);
        home.getBotonVolverPedidos().addActionListener(this);
        home.getBotonVerMembresia().addActionListener(this);
        home.getBotonVolverMembresia().addActionListener(this);
        home.getTextPaneMembresiaInfo().setEditable(false);
    }
    /**
     * Metodo que dependiendo de las peticiones del usuario, se realizen ciertos
     * eventos
     * @param evento parametro que inicia el ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(home.getBotonAdministrador() == evento.getSource()){
        //Condicional si se presiona el boton "Administrar tienda"  
           VIniciarSesion I = new VIniciarSesion();         
           I.setLocationRelativeTo(null);
           I.setVisible(true);
           home.setVisible(false);
           ControlVIniciarSesion CI = new ControlVIniciarSesion(I,1);
        }
        if(home.getBotonSesion() == evento.getSource()){
        //Condicional si se presiona el boton "Iniciar Sesion"    
        //Condicional si se presiona el boton "Administrar tienda"  
           VIniciarSesion I = new VIniciarSesion();
           I.setLocationRelativeTo(null);
           I.setVisible(true);
           home.setVisible(false);
           ControlVIniciarSesion CI = new ControlVIniciarSesion(I,0);
        }
        if(home.getBotonRegistrese() == evento.getSource()){
        //Condicional si se presiona el boton "Registrese"
           VRegistrese ventanaRegistro = new VRegistrese();
           ventanaRegistro.setLocationRelativeTo(null);
           ventanaRegistro.setVisible(true);
           home.setVisible(false);
           ControlVRegistrese CR = new ControlVRegistrese(ventanaRegistro);  
        }
        if(home.getBotonDevice() == evento.getSource()){
            home.setVisible(false);            
            //Condicional si se presiona el boton "Dispositivos"
            if(usuario==null){
            //En caso de que no haya ninguna sesion iniciada
                VDispositivos d = new VDispositivos();
                ControlVDispositivos cd = new ControlVDispositivos(d);
            }else{
            //Cuando se haya ya ingresado un usuario
                VDispositivos d = new VDispositivos();
                ControlVDispositivos cd = new ControlVDispositivos(d,usuario); 
            }
        }
        if(home.getBotonAccesory() == evento.getSource()){
           home.setVisible(false);            
        //Condicional si se presiona el boton "Accesorios"
            if(usuario==null){
                //En caso de que no haya ninguna sesion iniciada
                VAccesorios a = new VAccesorios();
                ControlVAccesorios ca = new ControlVAccesorios(a);
            }else{
                //Cuando se haya ya ingresado un usuario
                VAccesorios a = new VAccesorios();
                ControlVAccesorios ca = new ControlVAccesorios(a,usuario);
            }
        }
        if(home.getBotonSoftware() == evento.getSource()){
        //Condicional si se presiona el boton "Software"
           home.setVisible(false);
           if(usuario==null){
            //En caso de que no haya ninguna sesion iniciada
                VSoftware s = new VSoftware();
                ControlVSoftware cs = new ControlVSoftware(s);
           }else{
                //Cuando se haya ya ingresado un usuario
                VSoftware s = new VSoftware();
                ControlVSoftware cs = new ControlVSoftware(s,usuario);
           }
        }
        if(home.getBotonCerrarSesion()== evento.getSource()){
            home.setVisible(false);
            VHome home = new VHome();
            home.setLocationRelativeTo(null);
            home.setVisible(true);
            ControlVHome cHome = new ControlVHome(home);               
        }
        if(home.getBotonVerCarrito()== evento.getSource()){
            home.setVisible(false);
            VCarrito vCarrito= new VCarrito();
            vCarrito.setLocationRelativeTo(null);
            vCarrito.setVisible(true);
            ControlVCarrito controlVCarrito = new ControlVCarrito(vCarrito, usuario);  
        }
        if(home.getBotonPedidos()== evento.getSource()){
            home.setVisible(false);
            home.getVMisPedidos().setVisible(true);
            home.getVMisPedidos().setBounds(0, 0, 634, 470);
            home.getVMisPedidos().setLocationRelativeTo(null); 
            mostrarComboBoxPedidos();
            buscarPedidos();                
        }
        if(home.getBotonVerPedido()== evento.getSource()){
            verPedidos();
        }
        if(home.getBotonVolverPedidos()==evento.getSource()){
            home.getVMisPedidos().setVisible(false);
            home.setVisible(true);
        }
        if(home.getBotonVerMembresia()==evento.getSource()){
            home.setVisible(false);
            home.getFrameMembresia().setBounds(0, 0, 400, 300);            
            home.getFrameMembresia().setVisible(true);
            home.getFrameMembresia().setLocationRelativeTo(null);
            String membresiaInfo = "";
            Membresia membresia = usuario.getMembresia();
            membresiaInfo = "Tipo:  " + membresia.getTipo() 
            + "\nPuntos: "+membresia.getPuntos() + "\n Total de compras: "+membresia.getValorCompras();
                membresia.setTipo("Nivel 1");
                membresia.setPuntos(0);
                membresia.setValorCompras(0);            
            home.getTextPaneMembresiaInfo().setText(membresiaInfo);
            
            
        }
        if(home.getBotonVolverMembresia()==evento.getSource()){
            home.getFrameMembresia().setVisible(false);
            home.setVisible(true);
        }    
    }
    /**
     * Metodo que muestra los pedidos atravez del comboBox
     */
    public void mostrarComboBoxPedidos(){
        home.getComboBoxPedidos().removeAllItems();
        try{
            for(int i=0;i<usuario.getPedidos().size();i++){
                System.out.println("jeeeeeeeee");
                Pedido pedido = usuario.getPedidos().get(i);
                home.getComboBoxPedidos().addItem("No. de pedido: "+pedido.getNoPedido()+
                "   Fecha: "+pedido.getFecha());
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay pedidos para mostrar");
        }          
    }
    /**
     * Metodo que te deja observar los pedidos
     */
    public void verPedidos(){
        try{
            int i= home.getComboBoxPedidos().getSelectedIndex();
            Pedido pedido = usuario.getPedidos().get(i);
            String pedidoInfo="No. de pedido"+pedido.getNoPedido()+
            "\nFecha: "+pedido.getFecha()+"   Total: "+pedido.getTotal()+"\n Productos:";
            String detallesPedido="";
            for(int j=0;j<pedido.getProductos().size();j++){
                Producto producto = pedido.getProductos().get(j);
                detallesPedido = detallesPedido + "\nProducto: "+producto.getNombre()
                +"  Precio: $"+ (producto.getPrecioVenta()*producto.getNoArticulos());
            }
            home.getTextPedido().setText(pedidoInfo+ detallesPedido);              
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay pedidos para mostrar");
        }      
    }
    /**
     * Metodo que te deja buscar los pedidos
     */
    public void buscarPedidos(){
        busquedaPedidos = Conexion.buscarTablasRelacionadas("pedidos", "pedidos_detalle", "id", "id_pedido",4,usuario.getCorreo());
        for(int i=0;i<busquedaPedidos.size();i++){
            for(int j=0;j<busquedaPedidos.get(i).length;j++){
                System.out.print(busquedaPedidos.get(i)[j]);
            }
            System.out.println(" ");
        }        
        ArrayList<Pedido> pedidos = new ArrayList();
        for(int i=0;i<busquedaPedidos.size();i++){
            
            if(usuario.getPedidos()==null){
                agregarNuevoPedido(i);
            }else{
                for(int k=0;k<usuario.getPedidos().size();k++){
                    if(usuario.getPedidos().get(k).getNoPedido()==Integer.parseInt(busquedaPedidos.get(i)[0])){
                        //Mismo pedido, guardar solo al producto
                        Pedido pedido = usuario.getPedidos().get(k);
                        Producto producto = agregarNuevoProducto(busquedaPedidos.get(i)[6],i);
                        pedido.setProducto(producto);
                        
                        k=usuario.getPedidos().size()+1;
                    }else{
                        if(k==usuario.getPedidos().size()-1){         
                            agregarNuevoPedido(i);
                            k=usuario.getPedidos().size();
                        }
                    }
                }                 
            }              
        }
    }
    /**
     * Metodo que te deja agregar Productos nuevos
     * @param id representa el parametro del id del producto
     * @param i parametro con valor entero
     * @return producto que representa al nuevo producto agregado.
     */
    public Producto agregarNuevoProducto(String id,int i){
        Producto producto=null;
        try{
            busquedaProductos.clear();
            busquedaProductos = Conexion.buscar("productos", id, "id");
            if(Integer.parseInt(busquedaProductos.get(0)[7])==1){
                Dispositivo dispositivo = new Dispositivo();
                producto = (Producto) dispositivo;
            }else if(Integer.parseInt(busquedaProductos.get(0)[7])==2){
                Accesorio accesorio = new Accesorio();
                producto = (Producto) accesorio;
            }else if(Integer.parseInt(busquedaProductos.get(0)[7])==3){
                Software software = new Software();
                producto = (Producto) software;
            }
            producto.setNombre(busquedaProductos.get(0)[1]);
            producto.setId(id);
            producto.setNoArticulos(Integer.parseInt(busquedaPedidos.get(i)[8]));
            producto.setPrecioVenta(Double.parseDouble(busquedaPedidos.get(i)[7]));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        return producto;
    }
    /**
     * Metodo que te deja agregar productos nuevos
     * @param i parametro con valor entero
     */
    public void agregarNuevoPedido(int i){
        Pedido pedido = new Pedido();
        pedido.setNoPedido(Integer.parseInt(busquedaPedidos.get(i)[0]));
        pedido.setTotal(Double.parseDouble(busquedaPedidos.get(i)[1]));                
        pedido.setFecha(busquedaPedidos.get(i)[2]);
        //debo buscar el producto y su nombre en la base de datos
        try{
            busquedaProductos.clear();
            busquedaProductos = Conexion.buscar("productos", busquedaPedidos.get(i)[6], "id");
            String id=busquedaProductos.get(0)[0];
            Producto producto=null;
            if(Integer.parseInt(busquedaProductos.get(0)[7])==1){
                Dispositivo dispositivo = new Dispositivo();
                producto = (Producto) dispositivo;
            }else if(Integer.parseInt(busquedaProductos.get(0)[7])==2){
                Accesorio accesorio = new Accesorio();
                producto = (Producto) accesorio;
            }else if(Integer.parseInt(busquedaProductos.get(0)[7])==3){
                Software software = new Software();
                producto = (Producto) software;
            }
            producto.setId(busquedaPedidos.get(i)[6]);
            producto.setNombre(busquedaProductos.get(0)[1]);
            producto.setNoArticulos(Integer.parseInt(busquedaPedidos.get(i)[8]));
            producto.setPrecioVenta(Double.parseDouble(busquedaPedidos.get(i)[7]));
            pedido.setProducto(producto);
            usuario.addPedido(pedido);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }  
    }
}

