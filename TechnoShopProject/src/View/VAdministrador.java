/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author A13003988
 */
public class VAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form VAdministrador
     */
    public VAdministrador() {
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

        jPanel1 = new javax.swing.JPanel();
        VAnadirProducto = new javax.swing.JFrame();
        PanelAgregar = new javax.swing.JPanel();
        ComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextMarca = new javax.swing.JTextField();
        TextPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextPrecioCompra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDescripcion = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        TextCantidad = new javax.swing.JTextField();
        BotonCancelar = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonNewProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotonRemoveProducto = new javax.swing.JButton();
        BotonReporte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        ComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dispositivo", "Accesorio", "Software", "Otro" }));
        ComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese la categoria del producto");

        jLabel7.setText("Ingrese el nombre del producto:");

        jLabel8.setText("Ingrese la marca o compañía del producto");

        jLabel9.setText("Ingrese el precio de venta del producto");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Añadir producto");

        jLabel11.setText("Ingrese el precio de compra del producto");

        jLabel12.setText("Ingresa la descripción del artículo (opcional):");

        TextDescripcion.setColumns(20);
        TextDescripcion.setRows(5);
        jScrollPane1.setViewportView(TextDescripcion);

        jLabel13.setText("Ingresa la cantidad de artículos a añadir:");

        TextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCantidadActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");

        BotonAceptar.setText("Aceptar");

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)
                        .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextNombre)
                        .addComponent(TextMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(TextPrecio)
                        .addComponent(jLabel7)
                        .addComponent(TextPrecioCompra))
                    .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addComponent(BotonAceptar)
                        .addGap(77, 77, 77)
                        .addComponent(BotonCancelar)
                        .addGap(129, 129, 129))))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonAceptar))
                .addContainerGap())
        );

        javax.swing.GroupLayout VAnadirProductoLayout = new javax.swing.GroupLayout(VAnadirProducto.getContentPane());
        VAnadirProducto.getContentPane().setLayout(VAnadirProductoLayout);
        VAnadirProductoLayout.setHorizontalGroup(
            VAnadirProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VAnadirProductoLayout.setVerticalGroup(
            VAnadirProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VAnadirProductoLayout.createSequentialGroup()
                .addComponent(PanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Control administrativo de TechnoShop");

        BotonNewProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IconoAñadir.png"))); // NOI18N
        BotonNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNewProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Bienvenido: ¿Que desea usted hacer?");

        BotonRemoveProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bag-remove.jpg"))); // NOI18N

        BotonReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporticon.jpg"))); // NOI18N

        jLabel3.setText("Añadir un nuevo producto");

        jLabel4.setText("Retirar un producto existente");

        jLabel5.setText("Generar un reporte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonNewProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BotonRemoveProducto))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BotonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonNewProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRemoveProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNewProductoActionPerformed
        // TODO add your handling code here:
        PanelAgregar.setVisible(true);
        PanelAgregar.setBounds(478, 617, 478, 617);
    }//GEN-LAST:event_BotonNewProductoActionPerformed

    private void ComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCategoriaActionPerformed

    private void TextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCantidadActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdministrador().setVisible(true);
            }
        });
    }

    public JButton getBotonAceptar() {
        return BotonAceptar;
    }

    public void setBotonAceptar(JButton BotonAceptar) {
        this.BotonAceptar = BotonAceptar;
    }

    public JButton getBotonCancelar() {
        return BotonCancelar;
    }

    public void setBotonCancelar(JButton BotonCancelar) {
        this.BotonCancelar = BotonCancelar;
    }

    public JComboBox<String> getComboBoxCategoria() {
        return ComboBoxCategoria;
    }

    public void setComboBoxCategoria(JComboBox<String> ComboBoxCategoria) {
        this.ComboBoxCategoria = ComboBoxCategoria;
    }

    public JTextField getTextCantidad() {
        return TextCantidad;
    }

    public void setTextCantidad(JTextField TextCantidad) {
        this.TextCantidad = TextCantidad;
    }

    public JTextArea getTextDescripcion() {
        return TextDescripcion;
    }

    public void setTextDescripcion(JTextArea TextDescripcion) {
        this.TextDescripcion = TextDescripcion;
    }

    public JTextField getTextMarca() {
        return TextMarca;
    }

    public void setTextMarca(JTextField TextMarca) {
        this.TextMarca = TextMarca;
    }

    public JTextField getTextNombre() {
        return TextNombre;
    }

    public void setTextNombre(JTextField TextNombre) {
        this.TextNombre = TextNombre;
    }

    public JTextField getTextPrecio() {
        return TextPrecio;
    }

    public void setTextPrecio(JTextField TextPrecio) {
        this.TextPrecio = TextPrecio;
    }

    public JTextField getTextPrecioCompra() {
        return TextPrecioCompra;
    }

    public void setTextPrecioCompra(JTextField TextPrecioCompra) {
        this.TextPrecioCompra = TextPrecioCompra;
    }

    public JButton getBotonNewProducto() {
        return BotonNewProducto;
    }

    public void setBotonNewProducto(JButton BotonNewProducto) {
        this.BotonNewProducto = BotonNewProducto;
    }

    public JButton getBotonRemoveProducto() {
        return BotonRemoveProducto;
    }

    public void setBotonRemoveProducto(JButton BotonRemoveProducto) {
        this.BotonRemoveProducto = BotonRemoveProducto;
    }

    public JButton getBotonReporte() {
        return BotonReporte;
    }

    public void setBotonReporte(JButton BotonReporte) {
        this.BotonReporte = BotonReporte;
    }

    public JPanel getPanelAgregar() {
        return PanelAgregar;
    }

    public void setPanelAgregar(JPanel PanelAgregar) {
        this.PanelAgregar = PanelAgregar;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonNewProducto;
    private javax.swing.JButton BotonRemoveProducto;
    private javax.swing.JButton BotonReporte;
    private javax.swing.JComboBox<String> ComboBoxCategoria;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextArea TextDescripcion;
    private javax.swing.JTextField TextMarca;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextPrecio;
    private javax.swing.JTextField TextPrecioCompra;
    private javax.swing.JFrame VAnadirProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
