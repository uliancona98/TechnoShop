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
public class ControlVDispositivos implements ActionListener{
    private VDispositivos dispositivos;

    public ControlVDispositivos(VDispositivos VD) {
    dispositivos = VD;
    dispositivos.getBRegresar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(dispositivos.getBRegresar() == evento.getSource()){
             
        }
    }
}
