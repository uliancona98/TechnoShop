/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Modelo.Usuario;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class VRegistrese extends javax.swing.JFrame {

    ArrayList <Usuario> usuarios=new ArrayList();  
    public VRegistrese() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoRNombre = new javax.swing.JTextField();
        CampoRApellido = new javax.swing.JTextField();
        CampoRCorreo = new javax.swing.JTextField();
        BotonRegistrarse = new javax.swing.JButton();
        CampoRContrasena = new javax.swing.JPasswordField();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registrese");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Contrasena:");

        CampoRNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRNombreActionPerformed(evt);
            }
        });

        CampoRCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRCorreoActionPerformed(evt);
            }
        });

        BotonRegistrarse.setText("Crea tu cuenta TechnoShop");
        BotonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 204, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(CampoRNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(CampoRApellido)
                    .addComponent(CampoRCorreo)
                    .addComponent(CampoRContrasena))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoRNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CampoRApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(CampoRCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(CampoRContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrarse)
                    .addComponent(botonVolver))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed

    }//GEN-LAST:event_BotonRegistrarseActionPerformed

    private void CampoRNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRNombreActionPerformed

    private void CampoRCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRCorreoActionPerformed

    public JButton getBotonRegistrarse() {
        return BotonRegistrarse;
    }

    public void setBotonRegistrarse(JButton BotonRegistrarse) {
        this.BotonRegistrarse = BotonRegistrarse;
    }

    public JTextField getCampoRApellido() {
        return CampoRApellido;
    }

    public void setCampoRApellido(JTextField CampoRApellido) {
        this.CampoRApellido = CampoRApellido;
    }

    public JPasswordField getCampoRContrasena() {
        return CampoRContrasena;
    }

    public void setCampoRContrasena(JPasswordField CampoRContrasena) {
        this.CampoRContrasena = CampoRContrasena;
    }

    public JTextField getCampoRCorreo() {
        return CampoRCorreo;
    }

    public void setCampoRCorreo(JTextField CampoRCorreo) {
        this.CampoRCorreo = CampoRCorreo;
    }

    public JTextField getCampoRNombre() {
        return CampoRNombre;
    }

    public void setCampoRNombre(JTextField CampoRNombre) {
        this.CampoRNombre = CampoRNombre;
    }
    
    public JButton getBotonVolver() {
        return botonVolver;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JTextField CampoRApellido;
    private javax.swing.JPasswordField CampoRContrasena;
    private javax.swing.JTextField CampoRCorreo;
    private javax.swing.JTextField CampoRNombre;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
