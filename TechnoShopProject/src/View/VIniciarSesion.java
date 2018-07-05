/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Juan D.M
 */
public class VIniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public VIniciarSesion() {
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
        usuarioCampo = new javax.swing.JTextField();
        contrasenaCampo = new javax.swing.JPasswordField();
        BotonAcceder = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Acceso al sistema");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contrasena:");

        usuarioCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioCampoActionPerformed(evt);
            }
        });

        contrasenaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaCampoActionPerformed(evt);
            }
        });

        BotonAcceder.setText("Acceder");
        BotonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccederActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(usuarioCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasenaCampo))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuarioCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contrasenaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(BotonAcceder)
                .addGap(18, 18, 18)
                .addComponent(botonCancelar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccederActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAccederActionPerformed

    private void usuarioCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioCampoActionPerformed

    private void contrasenaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaCampoActionPerformed
    /**
     * Metodo con el que se obtiene el boton BotonAcceder
     * @return Devuelve el boton BotonAcceder
     */
    public JButton getBotonAcceder() {
        return BotonAcceder;
    }
    /**
     * Metodo con el que se obtiene el PasswordField ContrasenaCampo
     * @return Devuelve el PasswordField ContrasenaCampo
     */
    public JPasswordField getContrasenaCampo() {
        return contrasenaCampo;
    }
    
    /**
     * Metodo con el que se obtiene el TextField UsuarioCampo
     * @return Devuelve el TextField USuarioCampo
     */

    public JTextField getUsuarioCampo() {
        return usuarioCampo;
    }
    /**
     * Metodo con el que se obtiene el Boton BotonCancelar
     * @return Devuelve el boton BotonCancelar
     */
    public JButton getBotonCancelar(){
        return botonCancelar;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAcceder;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JPasswordField contrasenaCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuarioCampo;
    // End of variables declaration//GEN-END:variables
}
