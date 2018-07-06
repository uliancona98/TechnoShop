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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Ulises, Shaid, Juan, Emmanuel, Martin
 * Clase que abarca todo lo relacionado con la conexion a la base de datos
 * 
 */
public class Conexion {
    private static String URL = "jdbc:mysql://localhost:3306/"+ "technoshop" + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String database = "technoshop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "19980519uli";    
    private static PreparedStatement ps;
    private static ResultSet rs;
    public static boolean elementoInsertado = false;
    public static boolean elementoModificado = false;
    public static boolean elementoBuscado = false;
    public static boolean elementoDuplicado = false;
    private static ArrayList<String[]> busquedaRes = new ArrayList<String[]>();
    private static ArrayList<String[]> busquedaTablasRelacionadas = new ArrayList<String[]>();
    private static ArrayList<String[]> busquedaTablas = new ArrayList<String[]>();
    /**
     * Inserta una fila en la tabla de base de datos con valores en una tabla de la base de datos
     * @param tabla parametro que representa el nombre de la tabla de la base de datos
     * @param valores representa la informacion nueva de una fila que se insertara en la tabla
     */
    
    public static void insert(String tabla, Object[] valores){
        Connection con = null;
        try{
            elementoDuplicado = false;
            elementoInsertado = false;
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
                elementoInsertado=true;
                //JOptionPane.showMessageDialog(null, "Elemento insertado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar");
            }
            con.close();
        }catch(Exception e){
            String [] cadenaPartes = e.getMessage().split(" ");
            if(cadenaPartes[0].equals("Duplicate")){
                elementoDuplicado = true;
                //JOptionPane.showMessageDialog(null, "ID Duplicado, no puedes añadir el mismo producto");
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar articulo");
            }
        }        
    }
    /**
     * Inserta una fila en la tabla de base de datos con valores en una tabla de la base de datos especificando las columnas 
     * que se van a modificar
     * @param tabla parametro que representa el nombre de la tabla de la base de datos
     * @param valores representa la informacion nueva de una fila que se insertara en la tabla
     * @param atributos Representa el nombre de los atributos de la tabla
     */
    public static void insert(String tabla, Object[] valores, String[]atributos){
        Connection con = null;
        elementoInsertado = true;
        elementoDuplicado = false;
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
            String atributes = "";
            for(int i=0;i<atributos.length;i++){
                if(i!=atributos.length-1){
                    atributes = atributes +atributos[i]+", ";
                }else{
                    atributes = atributes +atributos[i];
                }                
            }
            ps = con.prepareStatement("INSERT INTO "+tabla+" ("
            +atributes+") VALUES("+values+") ");
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
                elementoInsertado = true;
                //JOptionPane.showMessageDialog(null, "Elemento registrado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al registrar elemento");
            }
            con.close();
        }catch(Exception e){
            String [] cadenaPartes = e.getMessage().split(" ");
            if(cadenaPartes[0].equals("Duplicate")){
                elementoDuplicado = true;
                //JOptionPane.showMessageDialog(null, "ID Duplicado, no puedes añadir el mismo registro");
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar");
            }
        }        
    }    
    /**
     * Busca una columna que tengan en comun los mismos datos en 2 tablas distintas de la base de datos
     * @param tabla1 representa el nombre de la tabla1 en la que se buscara informacion
     * @param tabla2 representa el nombre de la tabla2 en la que se buscara informacion
     * @param atributoTabla1 representa el nombre de los atributos de la tabla1
     * @param atributoTabla2 representa el nombre de los atributos de la tabla2
     * @param posicion indica la posicion entera en la que esta el atributo a comun
     * @param dato es el dato en comun que van a tener las 2 tablas
     * @return devuelve el resultado de los datos que tengan en comun las 2 tablas
     */
    public static ArrayList<String[]> buscarTablasRelacionadas(String tabla1, String tabla2, String atributoTabla1, String atributoTabla2, int posicion, String dato){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        busquedaTablasRelacionadas.clear();
        String[] busqueda=null;
        try{
            Connection con = getConection();
            String ps = "SELECT * FROM "+tabla1+" as A INNER JOIN "+tabla2+" as"
            + " B ON (A."+atributoTabla1+"=B."+atributoTabla2+")";
            stmt = con.prepareStatement(ps);
            rs = stmt.executeQuery();      
            while(rs.next()) {
                busqueda = new String[rs.getMetaData().getColumnCount()];
                if(rs.getString(posicion).equals(dato)){
                    for (int x=1;x<=rs.getMetaData().getColumnCount();x++){
                        busqueda[x-1] = rs.getString(x);
                    }
                    busquedaTablasRelacionadas.add(busqueda);                     
                }                 
            }
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return busquedaTablasRelacionadas;
    }
    /**
     * Modifica una fila de la tabla de la base de datos
     * @param tabla parametro que representa el nombre de la tabla de la base de datos
     * @param campos es el nombre de los atributos de la tabla
     * @param datosNuevos los datos nuevos que se modificaran de la tabla
     * @param atributoBuscar son el nombre de el atributo especifico que se buscara (id)
     * @param datoBuscar el valor del dato de una fila especifica (valor del id)
     */
    public static void modificar(String tabla, String[] campos, Object[]datosNuevos, String atributoBuscar, String datoBuscar){
        Connection con = null;
        elementoModificado = false;
        try{
            con = getConection();
            String cadena="";
            for(int i=0;i<campos.length;i++){
                if(i!=(campos.length-1)){
                    cadena = cadena + campos[i]+"=?, ";
                }else{
                    cadena = cadena + campos[i]+"=?";
                }               
            }
            ps = con.prepareStatement("UPDATE "+ tabla +" SET "+cadena+" WHERE "+atributoBuscar+"='"+datoBuscar+"'");
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
                elementoModificado = true;
                //JOptionPane.showMessageDialog(null, "Elemento modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error con la operacion");
        }                
    }
    /**
     * Metpdo en cual obtiene todos los elementos de la tabla de la base de datos
     * @param tabla parametro que representa el nombre de la tabla de la base de datos
     * @return regresa la tabña
     */
    public static ArrayList<String[]> obtenerTabla(String tabla){
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try{
                Connection con = getConection();
                stmt = con.prepareStatement("SELECT * FROM "+tabla);
                rs = stmt.executeQuery();      
                busquedaTablas.clear();
                String[] busqueda=null;
                while(rs.next()) {
                    busqueda = new String[rs.getMetaData().getColumnCount()];
                    for (int x=1;x<=rs.getMetaData().getColumnCount();x++){      
                        busqueda[x-1] = rs.getString(x);
                    }
                    busquedaTablas.add(busqueda);                     
                }    
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error con la operacion");
            }
            return busquedaTablas;
    }
    /**
     * Metodo que permite encontrar elementos de la tabla de la base de datos
     * @param tabla parametro que representa el nombre de la tabla de la base de datos
     * @param dato es el dato en comun que van a tener las 2 tablas
     * @param nombreDato el nombre del atributo de la tabla a buscar
     * @return busquedares retorna la busqueda con la informacion obtenida de la tabla
     */
    public static ArrayList<String[]> buscar(String tabla, Object dato, String nombreDato){
        busquedaRes.clear();
        elementoBuscado=false;
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
                elementoBuscado=true;
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
            JOptionPane.showMessageDialog(null, "Error al buscar elemento");          
        }
        return busquedaRes;
    }
    /**
     * Inserta un elemento nuevo en la tabla y devuelve el id asignado de la ultima fila insertada
     * @param tabla parametro que representa el nombre de la tabla de la base de datos
     * @param valores representa la informacion nueva de una fila que se insertara en la tabla
     * @param atributos Representa el nombre de los atributos de la tabla
     * @return id devuelve el ultimo id que se inserto en la tabla
     */
    public static int getLastId(String tabla, Object[]valores, String[] atributos){
        int id=0;
        Connection con = null;
        try {
            con = getConection();
            String values = "";
            for(int i=0;i<valores.length;i++){
                if(i!=valores.length-1){
                    values = values +"?,";
                }else{
                    values = values +"?";
                }
            }
            String atributes = "";
            for(int i=0;i<atributos.length;i++){
                if(i!=atributos.length-1){
                    atributes = atributes +atributos[i]+", ";
                }else{
                    atributes = atributes +atributos[i];
                }                
            }
            ps = con.prepareStatement("INSERT INTO "+tabla+" ("
            +atributes+") VALUES("+values+") ",Statement.RETURN_GENERATED_KEYS);
            for(int i=0;i<valores.length;i++){
                if(valores[i] instanceof Double){
                    ps.setDouble(i+1, (double)valores[i]);
                }else if(valores[i] instanceof Integer){
                    ps.setInt(i+1, (int)valores[i]);
                }else{
                    ps.setString(i+1, (String)valores[i]);
                }
            }              
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                id=rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return id;    
    }
    /**
     * Devuelve la conexion a la base de datos
     * @return con devuelve la conexion de la base de datos
     */
    public static Connection getConection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Conexion fallida");
        }
        return con;
    }
    /**
     * Metodo que elimina una fila en la tabla de base de datos
     * @param tabla parametro que representa el nombre de la tabla de la base de datos
     * @param id parametro representa al id a eliminar de la tabla
     */
    public static void eliminar(String tabla, Object id) {                             
        // TODO add your handling code here:
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM "+ tabla +" WHERE "+"id"+"=?");
            if(id instanceof String){
                ps.setString(1, (String)id);                
            }else if(id instanceof Integer){
                ps.setInt(1, (Integer)id);                
            }
            int res = ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Elemento eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar elemento");
            }
            con.close();
        }catch(Exception e){
            System.out.println("Error al eliminar elemento");
        }            
    }     
}




