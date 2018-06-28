
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class VPedido extends javax.swing.JFrame {

   
    public VPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaAgregarTarjeta = new javax.swing.JFrame();
        TNumeroTarjeta = new javax.swing.JTextField();
        TValidacionTarjeta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SMes = new javax.swing.JSpinner();
        SAnio = new javax.swing.JSpinner();
        LTitularTarjeta = new javax.swing.JLabel();
        LNumerotarjeta = new javax.swing.JLabel();
        LValidacion = new javax.swing.JLabel();
        LCodigoValidacion = new javax.swing.JLabel();
        TTitularTarjeta = new javax.swing.JTextField();
        botonAceptarTarjeta = new javax.swing.JButton();
        botonAgregarTarjeta = new javax.swing.JButton();
        botonPagarPuntos = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiquetaFechaPedido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();

        jLabel6.setText("/");

        SMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        SAnio.setModel(new javax.swing.SpinnerListModel(new String[] {"2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045"}));
        SAnio.setName(""); // NOI18N

        LTitularTarjeta.setText("Titular de la tarjeta de credito: ");

        LNumerotarjeta.setText("Numero de la tarjeta de credito: ");

        LValidacion.setText("Valida hasta: ");

        LCodigoValidacion.setText("codigo de validacion de la tarjeta de credito: ");

        TTitularTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTitularTarjetaActionPerformed(evt);
            }
        });

        botonAceptarTarjeta.setText("Aceptar");

        javax.swing.GroupLayout ventanaAgregarTarjetaLayout = new javax.swing.GroupLayout(ventanaAgregarTarjeta.getContentPane());
        ventanaAgregarTarjeta.getContentPane().setLayout(ventanaAgregarTarjetaLayout);
        ventanaAgregarTarjetaLayout.setHorizontalGroup(
            ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaAgregarTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaAgregarTarjetaLayout.createSequentialGroup()
                        .addComponent(LCodigoValidacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TValidacionTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonAceptarTarjeta)
                        .addGroup(ventanaAgregarTarjetaLayout.createSequentialGroup()
                            .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LTitularTarjeta)
                                .addComponent(LNumerotarjeta)
                                .addGroup(ventanaAgregarTarjetaLayout.createSequentialGroup()
                                    .addComponent(LValidacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ventanaAgregarTarjetaLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        ventanaAgregarTarjetaLayout.setVerticalGroup(
            ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaAgregarTarjetaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNumerotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LValidacion)
                    .addComponent(jLabel6)
                    .addComponent(SMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(ventanaAgregarTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LCodigoValidacion)
                    .addComponent(TValidacionTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(botonAceptarTarjeta)
                .addGap(27, 27, 27))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAgregarTarjeta.setText("Agregar Tarjeta");

        botonPagarPuntos.setText("!Paga con Puntos¡");

        botonAceptar.setText("Aceptar");

        jLabel1.setText("Pedido");

        jLabel2.setText("Fecha de emision:");

        jLabel4.setText("Total:");

        jLabel5.setText("Articulos solicitados:");

        botonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 241, Short.MAX_VALUE)))))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(botonAgregarTarjeta)
                        .addGap(59, 59, 59)
                        .addComponent(botonPagarPuntos)
                        .addGap(76, 76, 76)
                        .addComponent(botonAceptar)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelar)
                    .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAceptar)
                            .addComponent(botonCancelar))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregarTarjeta)
                            .addComponent(botonPagarPuntos))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TTitularTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTitularTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTitularTarjetaActionPerformed



    public JButton getbotonAceptar() {
        return botonAceptar;
    }

    public void setbotonAceptar(JButton BotonAceptar) {
        this.botonAceptar = BotonAceptar;
    }
    
     public JButton getbotonAgregarTarjeta() {
        return botonAgregarTarjeta;
    }

    public void setbotonAgregarTarjeta(JButton BotonAgregarTarjeta) {
        this.botonAgregarTarjeta = BotonAgregarTarjeta;
    }
    
      public JButton getbotonPagarPuntos() {
        return botonPagarPuntos;
    }

    public void setbotonPagarPuntos(JButton botonPagarPuntos) {
        this.botonPagarPuntos = botonPagarPuntos;
    }
    
    public JLabel getetiquetaFechaPedido()
    {
        return etiquetaFechaPedido;
    }
    
    public void setetiquetaFechaPedido(JLabel etiquetaFechaPedido){
        this.etiquetaFechaPedido= etiquetaFechaPedido;
    }
    public JLabel geetiquetaTotal()
    {
        return etiquetaTotal;
    }
    
    public void setetiquetaTotal(JLabel etiquetaTotal){
        this.etiquetaTotal= etiquetaTotal;
    }
    
    public JButton getbotonCancelar() {
        return botonCancelar;
    }

    public void setbotonCancelar(JButton botonCancelar) {
        this.botonCancelar = botonCancelar;
    }
    
    public JFrame getVentanaTarjeta()
    {
        return ventanaAgregarTarjeta;
    }
    
    public void settVentanaTarjeta(JFrame ventanaTarjeta){
        this.ventanaAgregarTarjeta=ventanaTarjeta;
    }
    
    public JButton getbotonAceptarTarjeta(){
        return botonAceptarTarjeta;
    }
    public void setbotonAceptarTarjeta(JButton botonAceptarTarjeta ){
        this.botonAceptarTarjeta=botonAceptarTarjeta;
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCodigoValidacion;
    private javax.swing.JLabel LNumerotarjeta;
    private javax.swing.JLabel LTitularTarjeta;
    private javax.swing.JLabel LValidacion;
    private javax.swing.JSpinner SAnio;
    private javax.swing.JSpinner SMes;
    private javax.swing.JTextField TNumeroTarjeta;
    private javax.swing.JTextField TTitularTarjeta;
    private javax.swing.JTextField TValidacionTarjeta;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAceptarTarjeta;
    private javax.swing.JButton botonAgregarTarjeta;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonPagarPuntos;
    private javax.swing.JLabel etiquetaFechaPedido;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JFrame ventanaAgregarTarjeta;
    // End of variables declaration//GEN-END:variables

    public JSpinner getSAnio() {
        return SAnio;
    }

    public JSpinner getSMes() {
        return SMes;
    }

    public JTextField getTNumeroTarjeta() {
        return TNumeroTarjeta;
    }

    public JTextField getTTitularTarjeta() {
        return TTitularTarjeta;
    }

    public JTextField getTValidacionTarjeta() {
        return TValidacionTarjeta;
    }
}
