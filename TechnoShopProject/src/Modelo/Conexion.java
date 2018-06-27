/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Conexion {
    public static String URL ="";
    public static final String database = "technoshop";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "19980519uli";    
    PreparedStatement ps;
    public Conexion(){
        URL = "jdbc:mysql://localhost:3306/"+ database + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";        
    }
    public void insert(String tabla, String[] valores){
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
                ps.setString(i+1, valores[i]);
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




