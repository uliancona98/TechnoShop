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
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlVAdministrador implements ActionListener {
    private VAdministrador administradorV;
    private Administrador admin;
    
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
        administradorV.getBImprimir().addActionListener(this);
        administradorV.getBRegresar().addActionListener(this);
        administradorV.getLabelBienvenida().setText("Bienvenid@ "+ a.getNombre()+" "+ a.getApellido());
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(administradorV.getBotonAnadirProducto2() == evento.getSource()){
            System.out.println("se anade producto");
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
           administradorV.getVRemover().setBounds(0, 0, 400, 440);
           administradorV.getVRemover().setLocationRelativeTo(null);   
        }
        if(administradorV.getBotonReporte() == evento.getSource()){       
            administradorV.getVReporte().setVisible(true);
            administradorV.getVReporte().setBounds(0, 0, 709, 356);
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
            administradorV.getVAumentarProducto().setBounds(0, 0, 400, 432);
            administradorV.getVAumentarProducto().setLocationRelativeTo(null);                 
        }
        if(administradorV.getBotonAumentar()== evento.getSource()){
            JOptionPane.showMessageDialog(null, "Articulos añadido");
            administradorV.getVAumentarProducto().setVisible(false);
            //Se selecciona la opcion de añadir existente, se abre 
        }
        if(administradorV.getBotonRetirar() == evento.getSource()){
            //Se seleccion la opcion de añadir existente 2
            administradorV.getVRemover().setVisible(false);
            System.out.println("Articulo removido de la tienda");
        }
        //Checar si dejarlo
        if(administradorV.getBImprimir()== evento.getSource()){
            System.out.println("Se imprime el reporte");
            administradorV.getVReporte().setVisible(false);
        }
        if(administradorV.getBRegresar()== evento.getSource()){
            administradorV.getVReporte().setVisible(false);
        }
        if(administradorV.getBotonAceptar() == evento.getSource()){
            //Se añade el nuevo producto a la base
            try{
                if(administradorV.getTextId().getText().equals("")){
                    System.out.println("YA");
                }
                Integer id = Integer.parseInt(administradorV.getTextId().getText());
                String nombre = administradorV.getTextNombre().getText();
                double precio_venta = Double.parseDouble(administradorV.getTextPrecio().getText());
                double precio_compra = Double.parseDouble(administradorV.getTextPrecioCompra().getText());
                String descripcion = administradorV.getTextDescripcion().getText();
                Integer no_articulos  = Integer.parseInt(administradorV.getTextCantidad().getText());
                String marca = administradorV.getTextMarca().getText();
                Integer id_categoria = administradorV.getComboBoxCategoria().getSelectedIndex();
                if(id<0 || nombre.equals("") || precio_venta<0 || precio_compra<0 ||descripcion.equals("") || no_articulos<0 || marca.equals("") ){
                    JOptionPane.showMessageDialog(null, "Datos erroneos");
                    limpiarCampos();
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
                    administradorV.getVAnadirProducto().setVisible(false); 
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Datos erroneos");
            }
        }      
    }
    
    public void limpiarCampos(){
        administradorV.getTextCantidad().setText(null);
        administradorV.getTextDescripcion().setText(null);
        administradorV.getTextMarca().setText(null);
        administradorV.getTextNombre().setText(null);
        administradorV.getTextPrecio().setText(null);
        administradorV.getTextPrecioCompra().setText(null);
    }
    
}
