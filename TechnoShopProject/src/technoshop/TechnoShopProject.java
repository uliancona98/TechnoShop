package technoshop;
import View.*;
import Control.*;
import Modelo.Conexion;
import javax.swing.UIManager;

public class TechnoShopProject {
    static VHome window;
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
            e.printStackTrace();
	}
        //insertarAdministradores();
        //insertarCategoriasProductos();
	VHome home = new VHome();
        home.setLocationRelativeTo(null);
	home.setVisible(true);      
        ControlVHome Chome = new ControlVHome(home);              
    }
    
    public static void insertarAdministradores(){
        String [] valores = new String [4];
        valores[0]="uliancona@hotmail.com";
        valores[1]="Ulises";
        valores[2]="Ancona";
        valores[3]="123";
        Conexion.insert("administradores", valores);
        valores[0]="shaid.bojorquez@gmail.com";
        valores[1]="Shaid";
        valores[2]="Bojorquez";
        valores[3]="chato";
        Conexion.insert("administradores", valores);
        valores[0]="emmanuel_azcorra1993@hotmail.com";
        valores[1]="Emmanuel";
        valores[2]="Azcorra";
        valores[3]="elefante";        
        Conexion.insert("administradores", valores);
        valores[0]="juanito.1397@gmail.com";
        valores[1]="Juan";
        valores[2]="Duran";
        valores[3]="a";        
        Conexion.insert("administradores", valores);
        valores[0]="mrt_5_ap@gmail.com";
        valores[1]="Martin";
        valores[2]="Alpuche";
        valores[3]="rot";        
        Conexion.insert("administradores", valores);       
    }
    
    public static void insertarCategoriasProductos(){
        Object [] valores = new String [3];
        valores[0]="1";
        valores[1]="Dispositivos";
        valores[2]="Computadoras y moviles";
        Conexion.insert("tipo_productos", valores);
        valores[0]="2";
        valores[1]="Accesorios";
        valores[2]="Teclados y mouses";
        Conexion.insert("tipo_productos", valores);
        valores[0]="3";
        valores[1]="Software";
        valores[2]="Videojuegos y paquetes de Office";
        Conexion.insert("tipo_productos", valores);            
    }
}
