/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Juan D.M
 */
public class VDispositivos extends javax.swing.JFrame {
    
    private ArrayList <JButton> botonesProductos;
    private ArrayList <JLabel> labelsProductos;    
    /**
     * Metodo constructor de la Ventana Accsorios, agrega a un Array List los botones y 
     * Y los labels en un Array de labels
     * @return 
     */
    public VDispositivos() {
        initComponents();
        botonesProductos = new ArrayList();
        botonesProductos.add(botonP1);
        botonesProductos.add(botonP2);
        botonesProductos.add(botonP3);
        botonesProductos.add(botonP4);
        labelsProductos = new ArrayList();
        labelsProductos.add(label1);
        labelsProductos.add(label2);
        labelsProductos.add(label3);
        labelsProductos.add(label4);           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BRegresar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        botonP2 = new javax.swing.JButton();
        botonP3 = new javax.swing.JButton();
        botonP4 = new javax.swing.JButton();
        botonP1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Dispositivos");

        BRegresar.setText("Atras");
        BRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegresarActionPerformed(evt);
            }
        });

        label1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonP4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(botonP3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonP4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(botonP1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonP2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonP2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonP1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonP3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonP4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BRegresar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRegresarActionPerformed
    /**
     * Metodo con el que se obtiene un Array List de botones
     * @return Devuelve un Array List de botones
     */
    public ArrayList<JButton> getBotonesProductos(){
        return botonesProductos;
    }
     /**
     * Metodo con el que se obtiene un Array List de labels
     * @return Devuelve un Array List de labels
     */
    public ArrayList<JLabel> getlabelsProductos(){
        return labelsProductos;
    }        
     /**
     * Metodo con el que se obtiene el boton BRegresar
     * @return Devuelve el boton bRegresar
     */
    public JButton getBRegresar() {
        return BRegresar;
    }
    /**
     * Metodo con el que se obtiene el boton BotonP1
     * @return Devuelve el boton BotonP1
     */
    public JButton getBotonP1() {
        return botonP1;
    }
    /**
     * Metodo con el que se obtiene el boton BotonP2
     * @return Devuelve el boton BotonP2
     */
    public JButton getBotonP2() {
        return botonP2;
    }
    /**
     * Metodo con el que se obtiene el boton BotonP3
     * @return Devuelve el boton BotonP3
     */
    public JButton getBotonP3() {
        return botonP3;
    }
    /**
     * Metodo con el que se obtiene el boton BotonP4
     * @return Devuelve el boton BotonP4
     */
    public JButton getBotonP4() {
        return botonP4;
    }
    /**
     * Metodo con el que se optiene el label Label11
     * @return Devuelve el label label11
     */
    public JLabel getLabel1() {
        return label1;
    }
    /**
     * Metodo con el que se optiene el label Label12
     * @return Devuelve el label label12
     */
    public JLabel getLabel2() {
        return label2;
    }
    /**
     * Metodo con el que se optiene el label Label13
     * @return Devuelve el label label13
     */
    public JLabel getLabel3() {
        return label3;
    }
    /**
     * Metodo con el que se optiene el label Label14
     * @return Devuelve el label label14
     */
    public JLabel getLabel4() {
        return label4;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRegresar;
    private javax.swing.JButton botonP1;
    private javax.swing.JButton botonP2;
    private javax.swing.JButton botonP3;
    private javax.swing.JButton botonP4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    // End of variables declaration//GEN-END:variables
}
