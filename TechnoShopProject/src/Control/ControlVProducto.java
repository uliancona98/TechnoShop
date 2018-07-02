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
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
/**
 *
 * @author Juan D.M
 */
public class ControlVProducto implements ActionListener{
    private VProducto vProducto;
    private Producto producto;
    private Usuario usuario=null;
    private int idCategoria;
    private int unidadesDisponibles;
    public ControlVProducto(VProducto vProducto, int idCategoria, Producto producto ) {
        
        this.vProducto=vProducto;
        this.idCategoria=idCategoria;
        this.producto = producto;
        this.vProducto.getBAnadirCarro().addActionListener(this);
        this.vProducto.getBVolver().addActionListener(this);
        this.vProducto.getBComprar().addActionListener(this);
        this.vProducto.getbotonVerCarrito().addActionListener(this);
        this.vProducto.getBotonCalcularPrecio().addActionListener(this);
        inicializar();
    }
    public ControlVProducto(VProducto vProducto, Usuario usuario,int idCategoria, Producto producto) {
        this.vProducto=vProducto;
        this.usuario=usuario;
        this.producto = producto;        
        this.idCategoria=idCategoria;
        this.vProducto.getBAnadirCarro().addActionListener(this);
        this.vProducto.getBVolver().addActionListener(this);
        this.vProducto.getBComprar().addActionListener(this);
        this.vProducto.getbotonVerCarrito().addActionListener(this);
        this.vProducto.getBotonCalcularPrecio().addActionListener(this);
        inicializar();
    }
    
    public void inicializar(){
        DecimalFormat decimales = new DecimalFormat("0.00");
        vProducto.getLabelPrecio().setText("$ "+decimales.format(producto.getPrecioVenta()));
        vProducto.getLabelNombre().setText(producto.getNombre());
        vProducto.getTextInfo().setText("Nombre del producto:    "+ producto.getNombre()+
        "\n\nMarca:   "+ producto.getMarca()+"\n\nDescripcion:    "+producto.getDescripcion()+
        "\n\n Precio individual: "+ decimales.format(producto.getPrecioVenta()));
        ((DefaultEditor) vProducto.getspinnerCantidadProductos().getEditor()).getTextField().setEditable(false);        
        if(usuario==null){
            vProducto.getbotonVerCarrito().setVisible(false);
        }
        ImageIcon Imagen = new javax.swing.ImageIcon("productos\\"+producto.getId()+".jpg"); 
        JLabel Img = new javax.swing.JLabel(Imagen); 
        Img.setSize(297, 330);
        vProducto.getPanelProducto().add(Img);
        try{
            ArrayList<String[]>busqueda = Conexion.buscar("productos", producto.getId(), "id");        
            unidadesDisponibles = Integer.parseInt(busqueda.get(0)[5]);            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el producto");
        }
    }
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vProducto.getBAnadirCarro() == evento.getSource()){
            if(!validarArticulosDisponibles()){
                JOptionPane.showMessageDialog(null, "No hay disponibles el numero de productos que eligio\n"
                + "pruebe seleccionando un numero menor de unidades");
            }else{
                if(usuario!=null){
                    int noArticulos=(Integer)vProducto.getspinnerCantidadProductos().getValue();
                    producto.setNoArticulos(noArticulos);                
                    if(usuario.getCarrito()!=null){
                        Carrito carrito = usuario.getCarrito();
                        for(int i=0;i< carrito.getProductos().size();i++){
                            if(carrito.getProductos().get(i).getId().equals(producto.getId())){
                                carrito.removerProducto(i);
                                usuario.setCarritoProducto(producto);
                            }else{
                                if(i==carrito.getProductos().size()-1){
                                    usuario.setCarritoProducto(producto);
                                }
                            } 
                        }                           
                    }else{
                        usuario.setCarritoProducto(producto);
                    }       
                    JOptionPane.showMessageDialog(null, "Producto agregado al producto");          
                }else{
                    JOptionPane.showMessageDialog(null, "Registrate o inicia sesion para "
                    + "\n añadir productos al carrito");
                }                
            }
        }
        if(vProducto.getBotonCalcularPrecio() == evento.getSource()){
            DecimalFormat decimales = new DecimalFormat("0.00");            
            double precio = producto.getPrecioVenta()*(Integer)vProducto.getspinnerCantidadProductos().getValue();
            vProducto.getLabelPrecio().setText("$ "+decimales.format(precio));
        }
        if(vProducto.getBVolver() == evento.getSource()){
            vProducto.setVisible(false);
            if(idCategoria==1){
                VDispositivos vDispositivos = new VDispositivos();
                vDispositivos.setLocationRelativeTo(null);
                vDispositivos.setVisible(true);
                if(usuario!=null){
                    ControlVDispositivos cVDispositivos = new ControlVDispositivos(vDispositivos, usuario); 
                }else{
                    ControlVDispositivos cVDispositivos = new ControlVDispositivos(vDispositivos);
                }
            }else if(idCategoria==2){
                VAccesorios vAccesorios = new VAccesorios();
                vAccesorios.setLocationRelativeTo(null);
                vAccesorios.setVisible(true);
                if(usuario!=null){
                    ControlVAccesorios cVAccesorios = new ControlVAccesorios(vAccesorios, usuario); 
                }else{
                    ControlVAccesorios cVAccesorios = new ControlVAccesorios(vAccesorios);
                }                
            }else if(idCategoria==3){
                VSoftware vSoftware=new VSoftware();
                vSoftware.setLocationRelativeTo(null);
                vSoftware.setVisible(true); 
                if(usuario!=null){
                    ControlVSoftware cVSoftware = new ControlVSoftware(vSoftware, usuario); 
                }else{
                    ControlVSoftware cVSoftware = new ControlVSoftware(vSoftware);
                }
            }
        }
        if(vProducto.getBComprar() == evento.getSource()){
            if(validarArticulosDisponibles()){
                if(usuario!=null){
                    int noArticulos=(Integer)vProducto.getspinnerCantidadProductos().getValue();
                    producto.setNoArticulos(noArticulos);
                    VPedido ventanaPedido =new VPedido();
                    ventanaPedido.setLocationRelativeTo(null);
                    ventanaPedido.setVisible(true);
                    vProducto.setVisible(false);
                    ControlVPedido CP = new ControlVPedido(ventanaPedido,usuario,producto);                
                }else{
                    JOptionPane.showMessageDialog(null, "Tienes que iniciar sesion para realizar"
                    + " una compra");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay disponibles el numero de productos que eligio\n"
                + "pruebe seleccionando un numero menor de unidades");                
            }            
        }
        if(vProducto.getbotonVerCarrito()== evento.getSource()){
            VCarrito vCarrito= new VCarrito();
            vCarrito.setLocationRelativeTo(null);
            vCarrito.setVisible(true);
            ControlVCarrito controlVCarrito = new ControlVCarrito(vCarrito, usuario);                
        }
    }
    public boolean validarArticulosDisponibles(){
        Integer unidadesAComprar = (Integer)vProducto.getspinnerCantidadProductos().getValue(); 
        return unidadesAComprar <= unidadesDisponibles;
    }
}
