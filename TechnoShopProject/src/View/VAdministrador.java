/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
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
        jLabel16 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        VAnadirProducto2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        botonAnadirProducto2 = new javax.swing.JButton();
        botonAnadirExistente = new javax.swing.JButton();
        VAumentarProducto = new javax.swing.JFrame();
        jLabel14 = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        botonAumentar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        VReporte = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        TReporte = new javax.swing.JTable();
        BImprimir = new javax.swing.JButton();
        BRegresar = new javax.swing.JButton();
        VRemover = new javax.swing.JFrame();
        comboRetirarProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        botonRetirar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonNewProducto = new javax.swing.JButton();
        labelBienvenida = new javax.swing.JLabel();
        BotonRemoveProducto = new javax.swing.JButton();
        BotonReporte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();

        ComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dispositivo", "Accesorio", "Software", "Otro" }));
        ComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese la categoria del producto");

        jLabel7.setText("Ingrese el id del producto");

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
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        jLabel16.setText("Ingrese el nombre del producto");

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6)
                                .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(TextPrecio)
                                .addComponent(jLabel7)
                                .addComponent(TextPrecioCompra)
                                .addComponent(jLabel8)
                                .addComponent(jLabel16))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(BotonAceptar)
                        .addGap(75, 75, 75)
                        .addComponent(BotonCancelar)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(193, 193, 193))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel16)
                .addGap(11, 11, 11)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptar)
                    .addComponent(BotonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        botonAnadirProducto2.setText("AGREGAR NUEVO PRODUCTO");
        botonAnadirProducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirProducto2ActionPerformed(evt);
            }
        });

        botonAnadirExistente.setText("AGREGAR PRODUCTO EXISTENTE");
        botonAnadirExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirExistenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAnadirProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnadirExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(botonAnadirProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonAnadirExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout VAnadirProducto2Layout = new javax.swing.GroupLayout(VAnadirProducto2.getContentPane());
        VAnadirProducto2.getContentPane().setLayout(VAnadirProducto2Layout);
        VAnadirProducto2Layout.setHorizontalGroup(
            VAnadirProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VAnadirProducto2Layout.setVerticalGroup(
            VAnadirProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel14.setText("Elegir producto a añadir nuevas unidades");

        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonAumentar.setText("AUMENTAR");
        botonAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAumentarActionPerformed(evt);
            }
        });

        jLabel15.setText("Introduce las unidades");

        javax.swing.GroupLayout VAumentarProductoLayout = new javax.swing.GroupLayout(VAumentarProducto.getContentPane());
        VAumentarProducto.getContentPane().setLayout(VAumentarProductoLayout);
        VAumentarProductoLayout.setHorizontalGroup(
            VAumentarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VAumentarProductoLayout.createSequentialGroup()
                .addGroup(VAumentarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VAumentarProductoLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(VAumentarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(VAumentarProductoLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(botonAumentar))
                    .addGroup(VAumentarProductoLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(VAumentarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        VAumentarProductoLayout.setVerticalGroup(
            VAumentarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VAumentarProductoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel14)
                .addGap(32, 32, 32)
                .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botonAumentar)
                .addGap(74, 74, 74))
        );

        TReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Comp. escritorio Acer Aspire AC20-720-MB13", "$7,650", null, "", null},
                {"Laptop Asus  E402NA-GA002T    ", "$4,300", null, null, null},
                {"HP - Laptop 15-BW014LA   ", "$8,450", null, null, null},
                {"Smartphone Techpad M6    ", "$1,997", null, "", null},
                {"Apple - iPhone 8  ", "$16,500", null, null, null},
                {"Smartphone Motorola Moto C  ", " $1,600", null, null, null},
                {"Mouse Inalambrico M525", "$952", null, null, null},
                {"Teclado Bluetooth PC/Mac NEGRO AUDIOBAHN ", "$280", null, null, null},
                {"Teclado N. Laptop alámbrico USB marca AUDIOBAHN AKY60  ", "$118", null, null, null},
                {"Mouse óptico inalámbrico  USB AOM60 AUDIOBAHN AOM60  ", "$142", null, null, null},
                {"Juego DVD FIFA 16 ", "$300", null, null, null},
                {"Juego DVD Call of Duty Black Ops III", "$450 ", null, null, null},
                {"Juego DVD GTA V", "$800", null, null, null},
                {"Office 2016 Hogar y Estudiante Microsoft para PC 1  Equipo  ", "$2,000", null, null, null},
                {"Microsoft Mouse más Office 365 Personal Internet Security  ", "$1200", null, null, null}
            },
            new String [] {
                "Productos", "Precio", "Porcentaje/ganancia", "Total/Neto", "Total"
            }
        ));
        jScrollPane2.setViewportView(TReporte);

        BImprimir.setText("Imprimir");
        BImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImprimirActionPerformed(evt);
            }
        });

        BRegresar.setText("Regresar");
        BRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VReporteLayout = new javax.swing.GroupLayout(VReporte.getContentPane());
        VReporte.getContentPane().setLayout(VReporteLayout);
        VReporteLayout.setHorizontalGroup(
            VReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(VReporteLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(BImprimir)
                .addGap(42, 42, 42)
                .addComponent(BRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VReporteLayout.setVerticalGroup(
            VReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VReporteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BImprimir)
                    .addComponent(BRegresar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        comboRetirarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Selecciona el producto para retirar");

        botonRetirar.setText("RETIRAR DE VENTA");
        botonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VRemoverLayout = new javax.swing.GroupLayout(VRemover.getContentPane());
        VRemover.getContentPane().setLayout(VRemoverLayout);
        VRemoverLayout.setHorizontalGroup(
            VRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VRemoverLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(VRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VRemoverLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VRemoverLayout.createSequentialGroup()
                        .addComponent(comboRetirarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(VRemoverLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(botonRetirar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        VRemoverLayout.setVerticalGroup(
            VRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VRemoverLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(comboRetirarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(botonRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

        labelBienvenida.setText("Bienvenido: ¿Que desea usted hacer?");

        BotonRemoveProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bag-remove.jpg"))); // NOI18N

        BotonReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporticon.jpg"))); // NOI18N
        BotonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteActionPerformed(evt);
            }
        });

        jLabel3.setText("Añadir un nuevo producto");

        jLabel4.setText("Retirar un producto existente");

        jLabel5.setText("Generar un reporte");

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(labelBienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonSalir)))
                .addGap(18, 18, 18)
                .addComponent(labelBienvenida)
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
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNewProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonNewProductoActionPerformed

    private void ComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCategoriaActionPerformed

    private void TextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCantidadActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonReporteActionPerformed

    private void BImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BImprimirActionPerformed

    private void BRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRegresarActionPerformed

    private void botonAnadirExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirExistenteActionPerformed
        // TODO add your handling code here: 
        /*System.out.println("jeee");
        getVAnadirProducto2().setVisible(false);
        getVAumentarProducto().setVisible(true);
        getVAumentarProducto().setBounds(0, 0, 400, 432);
        getVAumentarProducto().setLocationRelativeTo(null);   */     
    }//GEN-LAST:event_botonAnadirExistenteActionPerformed

    private void botonAnadirProducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirProducto2ActionPerformed
        // TODO add your handling code here:
            /*getVAnadirProducto2().setVisible(false);
            getVAnadirProducto().setVisible(true);
            getVAnadirProducto().setBounds(0, 0, 555, 725);
            getVAnadirProducto().setLocationRelativeTo(null);*/
    }//GEN-LAST:event_botonAnadirProducto2ActionPerformed

    private void botonAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAumentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAumentarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void botonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRetirarActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_BotonAceptarActionPerformed
  
    public JButton getBotonAceptar() {
        return BotonAceptar;
    }

    public void setBotonAceptar(JButton BotonAceptar) {
        this.BotonAceptar = BotonAceptar;
    }

    public JButton getBotonCancelar() {
        return BotonCancelar;
    }
    
    public JButton getBotonAnadirExistente(){
        return botonAnadirExistente;
    }
    
    public JButton getBotonAnadirProducto2(){
        return botonAnadirProducto2;
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

    public JTextField getTextNombre() {
        return TextNombre;
    }

    public JTextField getTextPrecio() {
        return TextPrecio;
    }

    public JTextField getTextPrecioCompra() {
        return TextPrecioCompra;
    }

    public JButton getBotonNewProducto() {
        return BotonNewProducto;
    }

    public JFrame getVAnadirProducto() {
        return VAnadirProducto;
    }

    public JFrame getVAnadirProducto2() {
        return VAnadirProducto2;
    }

    public JFrame getVAumentarProducto() {
        return VAumentarProducto;
    }

    public JComboBox<String> getComboProductos() {
        return comboProductos;
    }

    public JButton getBotonRemoveProducto() {
        return BotonRemoveProducto;
    }

    public JButton getBotonReporte() {
        return BotonReporte;
    }

    public JPanel getPanelAgregar() {
        return PanelAgregar;
    }

    public JButton getBotonSalir() {
        return BotonSalir;
    }
    public JLabel getLabelBienvenida(){
        return labelBienvenida;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BImprimir;
    private javax.swing.JButton BRegresar;
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonNewProducto;
    private javax.swing.JButton BotonRemoveProducto;
    private javax.swing.JButton BotonReporte;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> ComboBoxCategoria;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JTable TReporte;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextArea TextDescripcion;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextMarca;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextPrecio;
    private javax.swing.JTextField TextPrecioCompra;
    public javax.swing.JFrame VAnadirProducto;
    public javax.swing.JFrame VAnadirProducto2;
    public javax.swing.JFrame VAumentarProducto;
    public javax.swing.JFrame VRemover;
    public javax.swing.JFrame VReporte;
    private javax.swing.JButton botonAnadirExistente;
    public javax.swing.JButton botonAnadirProducto2;
    private javax.swing.JButton botonAumentar;
    private javax.swing.JButton botonRetirar;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JComboBox<String> comboRetirarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JTextField textCantidad;
    // End of variables declaration//GEN-END:variables


    public JButton getBotonAumentar() {
        return botonAumentar;
    }

    public JButton getBImprimir() {
        return BImprimir;
    }
    public JButton getBRegresar() {
        return BRegresar;
    }

    public JTable getTReporte() {
        return TReporte;
    }

    public JFrame getVReporte() {
        return VReporte;
    }

    public JFrame getVRemover() {
        return VRemover;
    }

    public JButton getBotonRetirar() {
        return botonRetirar;
    }

    public JComboBox<String> getComboRetirarProducto() {
        return comboRetirarProducto;
    }

    public JTextField getTextId() {
        return TextId;
    }
}
