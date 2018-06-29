package technoshop;
import View.*;
import Control.*;
import Modelo.Cuenta;
import Modelo.Usuario;
import javax.swing.UIManager;

public class TechnoShopProject {
    static VHome window;
    public static void main(String[] args) {
      //  System.out.println("He");
      //   Administrador c = new Administrador();
      //   c.setCorreo("correo@gmail.com");
      //   c.setNombre("AAAAA");
      //   c.AnadirProducto();
      //  c.PedirLista();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
            e.printStackTrace();
	}
	VHome home = new VHome();
        home.setLocationRelativeTo(null);
	home.setVisible(true);      
        ControlVHome Chome = new ControlVHome(home);
        /*VAccesorios va = new VAccesorios();
        va.setLocationRelativeTo(null);
	va.setVisible(true); 
        VAdministrador vad= new VAdministrador();
        vad.setLocationRelativeTo(null);
	vad.setVisible(true);*/               
    }
}
