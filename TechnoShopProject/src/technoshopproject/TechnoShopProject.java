package technoshopproject;

import Domain.*;

public class TechnoShopProject {
    public static void main(String[] args) {
        System.out.println("He");
         Administrador c = new Administrador();
         c.setCorreo("correo@gmail.com");
         c.setNombre("AAAAA");
         c.AnadirProducto();
        c.PedirLista();
    }  
}
