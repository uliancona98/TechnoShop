package technoshop;
import View.*;
import Control.*;
import Modelo.Conexion;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TechnoShopProject {
    static VHome window;
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
            e.printStackTrace();
	}
        insertarAdministradores();
        insertarCategoriasProductos();
        insertarProductos();
	VHome home = new VHome();
        home.setLocationRelativeTo(null);
	home.setVisible(true);      
        ControlVHome Chome = new ControlVHome(home);              
    }
    public static void insertarProductos(){
        Object[]valoresProducto = new Object [8];
        valoresProducto[0]="1230506930391";
        valoresProducto[1]="Acer Aspire AC20-720-MB13";
        valoresProducto[2]="9562.5";
        valoresProducto[3]="7650";
        valoresProducto[4]="Computadora de escritorio marca Acer";
        valoresProducto[5]="20";
        valoresProducto[6]="ACER";
        valoresProducto[7]="1";
        Conexion.insert("productos", valoresProducto);
        if(Conexion.elementoInsertado){   
            JOptionPane.showMessageDialog(null,"Producto insertado correctamente");                    
        }
        valoresProducto[0]="1230603847594";
        valoresProducto[1]="Laptop Asus  E402NA-GA002T";
        valoresProducto[2]="5375";
        valoresProducto[3]="4300";
        valoresProducto[4]="Laptop marca Asus";
        valoresProducto[5]="20";
        valoresProducto[6]="ASUS";
        valoresProducto[7]="1";
        Conexion.insert("productos", valoresProducto);
        if(Conexion.elementoInsertado){   
            JOptionPane.showMessageDialog(null,"Producto insertado correctamente");                    
        }
        valoresProducto[0]="1230985948038";
        valoresProducto[1]="HP - Laptop 15-BW014LA";
        valoresProducto[2]="10562.5";
        valoresProducto[3]="8450";
        valoresProducto[4]="Laptop marca Hp";
        valoresProducto[5]="20";
        valoresProducto[6]="HP";
        valoresProducto[7]="1" ;
        Conexion.insert("productos", valoresProducto);
        if(Conexion.elementoInsertado){   
            JOptionPane.showMessageDialog(null,"Producto insertado correctamente");                    
        }       
        
        valoresProducto[0]="1290809409853";
        valoresProducto[1]="Smartphone Techpad M6";
        valoresProducto[2]="2496.25";
        valoresProducto[3]="1997";
        valoresProducto[4]="Smartphone marca Techpad";
        valoresProducto[5]="20";
        valoresProducto[6]="TECHPAD";
        valoresProducto[7]="1";
        Conexion.insert("productos", valoresProducto);
        if(Conexion.elementoInsertado){   
            JOptionPane.showMessageDialog(null,"Producto insertado correctamente");                    
        }
        
        valoresProducto[0]="2039905409380";
        valoresProducto[1]="Mouse Inalambrico M525";
        valoresProducto[2]="937.5";
        valoresProducto[3]="750";
        valoresProducto[4]="Mouse inalambrico marca Logitech";
        valoresProducto[5]="20";
        valoresProducto[6]="LOGITECH";
        valoresProducto[7]="2";
        Conexion.insert("productos", valoresProducto);
        if(Conexion.elementoInsertado){   
            JOptionPane.showMessageDialog(null,"Producto insertado correctamente");                    
        }
        valoresProducto[0]="4695869499006";
        valoresProducto[1]="Fifa 16";
        valoresProducto[2]="375";
        valoresProducto[3]="300";
        valoresProducto[4]="videojuego para Xbox 360";
        valoresProducto[5]="20";
        valoresProducto[6]="XBOX";
        valoresProducto[7]="3";
        Conexion.insert("productos", valoresProducto);
        if(Conexion.elementoInsertado){   
            JOptionPane.showMessageDialog(null,"Producto insertado correctamente");                    
        }
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
