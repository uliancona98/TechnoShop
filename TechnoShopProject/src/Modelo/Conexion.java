/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class Conexion {
    private static String URL = "jdbc:mysql://localhost:3306/"+ "technoshop" + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String database = "technoshop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";    
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static ArrayList<String[]> busquedaRes = new ArrayList<String[]>();
   
    public static void insert(String tabla, Object[] valores){
        Connection con = null;
        try{
            con = getConection();
            String values = "";
            for(int i=0;i<valores.length;i++){
                if(i!=valores.length-1){
                    values = values +"?,";
                }else{
                    values = values +"?";
                }
            }
            ps = con.prepareStatement("INSERT INTO "+tabla+ " VALUES("+values+") ");
            for(int i=0;i<valores.length;i++){
                if(valores[i] instanceof Double){
                    ps.setDouble(i+1, (double)valores[i]);
                }else if(valores[i] instanceof Integer){
                    ps.setInt(i+1, (int)valores[i]);
                }else{
                    ps.setString(i+1, (String)valores[i]);
                }
            }
            int res = ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Elemento insertado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar");
            }
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }
    public void buscarTablasRelacionadas(String tabla1, String tabla2, String atributoTabla1, String atributoTabla2){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            Connection con = getConection();
            String ps = "SELECT * FROM "+tabla1+" as A INNER JOIN "+tabla2+" as"
            + " B ON (A."+atributoTabla1+"+=B."+atributoTabla2+")";                               
            stmt = con.prepareStatement(ps);
            rs = stmt.executeQuery();      
            while(rs.next()) {
               for (int x=1;x<=rs.getMetaData().getColumnCount();x++){
                   //System.out.print(rs.getString(x)+ "\t");
                    if(x==1){
                       System.out.print(rs.getString(x)+ "\t");
                    }else{
                       System.out.print(rs.getString(x)+ "\t");
                    }
                }
            }
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
    public static void modificarTabla(String tabla, String[] campos, Object[]datosNuevos, String atributoBuscar, String datoBuscar){
        Connection con = null;
        try{
            con = getConection();
            String cadena="";
            for(int i=0;i<campos.length;i++){
                if(i!=(campos.length-1)){
                    cadena = cadena + campos[i]+"=?,";
                }else{
                    cadena = cadena + campos[i]+"=?";
                }               
            }
            ps = con.prepareStatement("UPDATE "+ tabla +" SET "+cadena+" WHERE "+atributoBuscar+"="+datoBuscar);
            for(int i=0;i<datosNuevos.length;i++){
                if(datosNuevos[i] instanceof Double){
                    ps.setDouble(i+1, (double)datosNuevos[i]);
                }else if(datosNuevos[i] instanceof Integer){
                    ps.setInt(i+1, (int)datosNuevos[i]);
                }else{
                    ps.setString(i+1, (String)datosNuevos[i]);
                }                     
            }
            int res = ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Elemento modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }                
    }
    public static ArrayList<String[]> obtenerTabla(String tabla){
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try{
                Connection con = getConection();
                stmt = con.prepareStatement("SELECT * FROM "+tabla);
                rs = stmt.executeQuery();      
                busquedaRes.clear();
                String[] busqueda=null;
                while(rs.next()) {
                    busqueda = new String[rs.getMetaData().getColumnCount()];
                    for (int x=1;x<=rs.getMetaData().getColumnCount();x++){      
                        busqueda[x-1] = rs.getString(x);
                        System.out.print(busqueda[x-1]);
                    }
                    busquedaRes.add(busqueda);                     
                }    
                con.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return busquedaRes;
    }    
    public static ArrayList<String[]> buscar(String tabla, Object dato, String nombreDato){
        busquedaRes.clear();
        String[] busqueda=null;
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareCall("SELECT * FROM "+ tabla +" WHERE "+nombreDato+" = ?");
            if(dato instanceof Integer){
                ps.setInt(1, (int)dato);
            }else if(dato instanceof String){
                ps.setString(1, (String)dato);
            }
            rs = ps.executeQuery();
            boolean res = rs.next();
            if(res){
                while(res){
                    busqueda = new String[rs.getMetaData().getColumnCount()];
                    for (int x=1;x<=rs.getMetaData().getColumnCount();x++){      
                        busqueda[x-1] = rs.getString(x);
                    }
                    busquedaRes.add(busqueda);  
                    res=rs.next();
                }
            }else{
                JOptionPane.showMessageDialog(null, "No existe el elemento buscado");    
            }
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());           
        }
        return busquedaRes;
    }
    
    public static Connection getConection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}




