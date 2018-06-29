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
    private static final String PASSWORD = "19980519uli";    
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

    public static ArrayList<String[]> buscar(String tabla, int indice, Object dato, String nombreDato){
        busquedaRes.clear();
        String[] busqueda=null;
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareCall("SELECT * FROM "+ tabla +" WHERE "+nombreDato+" = ?");
            if(dato instanceof Integer){
                ps.setInt(indice, (int)dato);
            }else if(dato instanceof String){
                ps.setString(indice, (String)dato);
            }
            rs = ps.executeQuery();
            busqueda = new String[rs.getMetaData().getColumnCount()];
            if(rs.next()){
                
                for (int x=1;x<=rs.getMetaData().getColumnCount();x++){      
                    busqueda[x-1] = rs.getString(x);
                    System.out.print(rs.getString(x)+ "-");
                }
                busquedaRes.add(busqueda);
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




