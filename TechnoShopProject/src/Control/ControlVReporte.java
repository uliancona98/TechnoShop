/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import View.*;
/**
 *
 * @author Juan D.M
 */
public class ControlVReporte implements ActionListener {
    private VReporte reporte; 
    
    public ControlVReporte(VReporte VR) {
    reporte = VR;
    reporte.getBImprimir().addActionListener(this);
    reporte.getBMostrar().addActionListener(this);
    reporte.getBRegresar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(reporte.getBImprimir() == evento.getSource()){
             
        }
        if(reporte.getBMostrar() == evento.getSource()){
             
        } 
        if(reporte.getBRegresar() == evento.getSource()){
             
        } 
    }
}
