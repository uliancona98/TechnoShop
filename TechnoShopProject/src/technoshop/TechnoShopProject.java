package technoshopproject;

import Domain.*;
import View.*;
import Control.*;

public class TechnoShopProject {
    public static void main(String[] args) {
      //  System.out.println("He");
      //   Administrador c = new Administrador();
      //   c.setCorreo("correo@gmail.com");
      //   c.setNombre("AAAAA");
      //   c.AnadirProducto();
      //  c.PedirLista();
      VHome home = new VHome();
      ControlVHome Chome = new ControlVHome(home);
      
      home.setLocationRelativeTo(null);
      home.setVisible(true);
      
    }  
}