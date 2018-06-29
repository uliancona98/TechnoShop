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
import javax.swing.ImageIcon;
/**
 *
 * @author Juan D.M
 */
public class ControlVAccesorios implements ActionListener{
    private VAccesorios ventanaAccesorios;
    private Usuario usuario=null;
    private Integer ID=2;
    private ArrayList<Accesorio> accesorios;
    
    public ControlVAccesorios(VAccesorios va) {
        ventanaAccesorios = va;
        inicializar();
    }
    
    public ControlVAccesorios(VAccesorios va, Usuario user) {
        usuario = user;
        ventanaAccesorios = va;
        inicializar();
    }
    
    public void inicializar(){
        accesorios = new ArrayList();
        ventanaAccesorios.getBRegresar().addActionListener(this);
        ventanaAccesorios.setVisible(true);  
        ventanaAccesorios.setLocationRelativeTo(null);
        //Buscar las imagenes de la categoria de accesorios
        ArrayList<String[]>busqueda = Conexion.buscar("productos", 3, "id_tipoproducto");
        for(int i=0;i<busqueda.size();i++){
            String[] busquedaArray = busqueda.get(i);
            Accesorio accesorio = new Accesorio();                
            accesorio.setId(Integer.parseInt(busquedaArray[0]));  
            accesorio.setNombre(busquedaArray[1]);   
            accesorio.setPrecioVenta(Double.parseDouble(busquedaArray[2]));                
            accesorio.setPrecioCompra(Double.parseDouble(busquedaArray[3]));                
            accesorio.setDescripcion(busquedaArray[4]); 
            accesorio.setNoArticulos(Integer.parseInt(busquedaArray[5]));                
            accesorio.setMarca(busquedaArray[6]);                
            accesorio.setCategoria(busquedaArray[7]);
            accesorios.add(accesorio);
        }
        for(int i=0;i<ventanaAccesorios.getBotonesProductos().size();i++){
            if(i<accesorios.size()){
                String id = Integer.toString(accesorios.get(i).getId());
                ImageIcon imagen = new ImageIcon("IconsP\\"+id+".jpg");
                if(imagen.getImageLoadStatus()==4){
                    System.out.println("Imagen no encontrada");
                }
                ventanaAccesorios.getBotonesProductos().get(i).setIcon(imagen);                    
            }else{
                i=ventanaAccesorios.getBotonesProductos().size()-1;
            }
        }       
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventanaAccesorios.getBRegresar() == evento.getSource()){
          if(usuario==null){
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          ventanaAccesorios.setVisible(false);
          }
          else{
          VHome home = new VHome();
          ControlVHome Chome = new ControlVHome(home,usuario);
          home.setLocationRelativeTo(null);
          home.setVisible(true);
          ventanaAccesorios.setVisible(false);
          }
         
        }
    }
}
