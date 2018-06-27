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
/**
 *
 * @author Juan D.M
 */
public class ControlVAccesorios implements ActionListener{
    private VAccesorios accesorios;
    public ControlVAccesorios(VAccesorios va) {
    accesorios = va;
    accesorios.getBRegresar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(accesorios.getBRegresar() == evento.getSource()){
             
        }
    }
}
