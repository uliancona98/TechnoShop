/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Juan D.M
 */
public class VHome extends javax.swing.JFrame {

    /**
     * Creates new form VHome
     */
    
    public VHome(){
        initComponents();
        this.getContentPane().setBackground(Color.white);
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
        BotonSesion = new javax.swing.JButton();
        BotonRegistrese = new javax.swing.JButton();
        BotonAdministrador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotonDevice = new javax.swing.JButton();
        BotonAccesory = new javax.swing.JButton();
        BotonSoftware = new javax.swing.JButton();
        labelBienvenida = new javax.swing.JLabel();
        botonPedidos = new javax.swing.JButton();
        botonVerCarrito = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Title.jpg"))); // NOI18N

        BotonSesion.setText("Iniciar Sesion");

        BotonRegistrese.setText("Registrarse");
        BotonRegistrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistreseActionPerformed(evt);
            }
        });

        BotonAdministrador.setText("Administrar Tienda");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("           Categorias");

        BotonDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DeviceIcon.jpg"))); // NOI18N
        BotonDevice.setText("Dispositivos");
        BotonDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeviceActionPerformed(evt);
            }
        });

        BotonAccesory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/AccesoryIcon.jpg"))); // NOI18N
        BotonAccesory.setText("Accesorios");
        BotonAccesory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccesoryActionPerformed(evt);
            }
        });

        BotonSoftware.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SoftwareIcon.jpg"))); // NOI18N
        BotonSoftware.setText("Software");
        BotonSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSoftwareActionPerformed(evt);
            }
        });

        botonPedidos.setText("Mis pedidos");
        botonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedidosActionPerformed(evt);
            }
        });

        botonVerCarrito.setText("Ver Carrito");

        botonCerrarSesion.setText("Cerrar sesion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVerCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonAccesory, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 258, 258)
                        .addComponent(botonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonRegistrese, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(BotonSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonRegistrese, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(BotonDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAccesory, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSoftware)
                    .addComponent(botonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDeviceActionPerformed

    private void BotonAccesoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccesoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAccesoryActionPerformed

    private void BotonRegistreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistreseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistreseActionPerformed

    private void BotonSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSoftwareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSoftwareActionPerformed

    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPedidosActionPerformed

    public JButton getBotonAccesory() {
        return BotonAccesory;
    }

    public void setBotonAccesory(JButton BotonAccesory) {
        this.BotonAccesory = BotonAccesory;
    }

    public JButton getBotonAdministrador() {
        return BotonAdministrador;
    }

    public void setBotonAdministrador(JButton BotonAdministrador) {
        this.BotonAdministrador = BotonAdministrador;
    }

    public JButton getBotonDevice() {
        return BotonDevice;
    }

    public void setBotonDevice(JButton BotonDevice) {
        this.BotonDevice = BotonDevice;
    }

    public JButton getBotonRegistrese() {
        return BotonRegistrese;
    }

    public void setBotonRegistrese(JButton BotonRegistrese) {
        this.BotonRegistrese = BotonRegistrese;
    }

    public JButton getBotonSesion() {
        return BotonSesion;
    }

    public void setBotonSesion(JButton BotonSesion) {
        this.BotonSesion = BotonSesion;
    }

    public JButton getBotonSoftware() {
        return BotonSoftware;
    }

    public void setBotonSoftware(JButton BotonSoftware) {
        this.BotonSoftware = BotonSoftware;
    }
    
    public JLabel getLabelBienvenida(){
        return labelBienvenida;
    }
    public JButton getBotonPedidos(){
        return botonPedidos;
    }
    public JButton getBotonCerrarSesion() {
        return botonCerrarSesion;
    }

    public JButton getBotonVerCarrito() {
        return botonVerCarrito;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAccesory;
    private javax.swing.JButton BotonAdministrador;
    private javax.swing.JButton BotonDevice;
    private javax.swing.JButton BotonRegistrese;
    private javax.swing.JButton BotonSesion;
    private javax.swing.JButton BotonSoftware;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonVerCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelBienvenida;
    // End of variables declaration//GEN-END:variables

}
