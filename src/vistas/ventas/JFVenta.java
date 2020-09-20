package vistas.ventas;

import alertas.WarningConfirmAlert;
import beans.BebidaVenta;
import beans.Insumo;
import beans.Receta;
import beans.Trago;
import beans.Venta;
import conversiones.Conversion;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import modelos.ModeloBebidaVenta;
import tablas.TablaBebidaVenta;
import tablas.TablaInsumo;
import tablas.TablaInsumoVendido;
import tablas.TablaReceta;
import tablas.TablaTrago;
import tablas.TablaVenta;

public class JFVenta extends javax.swing.JFrame {

    private int codVenta;
    private static int contador = 1;
    private static int codigo = 1;
    private Venta venta;
    private String modo;
    private ModeloBebidaVenta modeloBebidaVenta;
    private final Double total = 0.0;

    private DecimalFormat formato = new DecimalFormat("#0.00");
    private List<Insumo> listaInsumosESTATICA=new ArrayList<>();

    public JFVenta(Venta venta, String modo) {

        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());

        setLocationRelativeTo(null);
        setResizable(false);

        try {

            // LISTA DE SIMULACIÓN
            listaInsumosESTATICA = TablaInsumo.listaInsumos();
            TablaInsumo.actualizaVIRTUAL(listaInsumosESTATICA);// ACTUALIZO LOS DATOS
            
            
            txtTotal.setEnabled(false);
            
            List<Trago> listaDeTragos = TablaTrago.listaTragos();
            DefaultComboBoxModel model = new DefaultComboBoxModel(listaDeTragos.toArray());

            cbxBebida.setModel(model);

            this.venta = venta;
            this.modo = modo;

            if(modo.equals("NUEVO")){
               
                spCodigo.setVisible(false);
                txtCodigo.setVisible(false);
                lblCodigo.setVisible(false);
                
                txtTotal.setText("0.0");
                
            }else if (modo.equals("VER")) {

                this.codVenta=venta.getId_venta();
                
                btnGuardar.setEnabled(false);
                btnAgregar.setEnabled(false);
                btnEliminar.setEnabled(false);
                
                cbxInsumosBebida.setEnabled(false);
                //lblInsumo.setEnabled(false);
                cbxBebida.setEnabled(false);
                txtCantidad.setVisible(false);
                //lblBebida.setEnabled(false);
                lblCantidad.setVisible(false);
                spCantidad.setVisible(false);
                
                txtCodigo.setText(venta.getCodigo_venta());
                txtCodigo.setEnabled(false);
                //txtTotal.setText(String.valueOf(venta.getTotal_venta()));
            } 

            modeloBebidaVenta = new ModeloBebidaVenta();

            tblBebidasVentas.setModel(modeloBebidaVenta);
            tblBebidasVentas.getTableHeader().setReorderingAllowed(false);

            
        // *****
        select();
            
        } catch (SQLException e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        panBebida = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        lblCerrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBebidasVentas = new javax.swing.JTable();
        cbxBebida = new javax.swing.JComboBox<>();
        lblBebida = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        spCantidad = new javax.swing.JSeparator();
        lblCantidad = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        Cantidad1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        spCodigo = new javax.swing.JSeparator();
        cbxInsumosBebida = new javax.swing.JComboBox<>();
        lblInsumo = new javax.swing.JLabel();
        btnPregunta = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Usuario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panBebida.setBackground(new java.awt.Color(23, 35, 51));
        panBebida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_add_to_inbox_32px.png"))); // NOI18N
        btnAgregar.setMnemonic(new Character('G'));
        btnAgregar.setText(" Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_cancel_32px_5.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblBebidasVentas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblBebidasVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBebidasVentas.setGridColor(new java.awt.Color(255, 255, 255));
        tblBebidasVentas.setRowHeight(22);
        jScrollPane1.setViewportView(tblBebidasVentas);

        cbxBebida.setBackground(new java.awt.Color(23, 35, 51));
        cbxBebida.setForeground(new java.awt.Color(0, 0, 0));
        cbxBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBebidaActionPerformed(evt);
            }
        });

        lblBebida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBebida.setForeground(new java.awt.Color(204, 204, 204));
        lblBebida.setText("Bebida");

        txtCantidad.setBackground(new java.awt.Color(23, 35, 51));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(null);
        txtCantidad.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        spCantidad.setForeground(new java.awt.Color(255, 255, 255));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(204, 204, 204));
        lblCantidad.setText("Cantidad");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_save_32px_1.png"))); // NOI18N
        btnGuardar.setMnemonic(new Character('G'));
        btnGuardar.setText(" Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_erase_32px_3.png"))); // NOI18N
        btnEliminar.setMnemonic(new Character('G'));
        btnEliminar.setText(" Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtTotal.setBackground(new java.awt.Color(23, 35, 51));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setBorder(null);
        txtTotal.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        Cantidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cantidad1.setForeground(new java.awt.Color(204, 204, 204));
        Cantidad1.setText("TOTAL:");

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lblCodigo.setText("Código");

        txtCodigo.setBackground(new java.awt.Color(23, 35, 51));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        spCodigo.setForeground(new java.awt.Color(255, 255, 255));

        cbxInsumosBebida.setBackground(new java.awt.Color(23, 35, 51));
        cbxInsumosBebida.setForeground(new java.awt.Color(0, 0, 0));
        cbxInsumosBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        lblInsumo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInsumo.setForeground(new java.awt.Color(204, 204, 204));
        lblInsumo.setText("Insumos");

        btnPregunta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPregunta.setForeground(new java.awt.Color(255, 255, 255));
        btnPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_help_32px.png"))); // NOI18N
        btnPregunta.setMnemonic(new Character('G'));
        btnPregunta.setBorder(null);
        btnPregunta.setBorderPainted(false);
        btnPregunta.setContentAreaFilled(false);
        btnPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBebidaLayout = new javax.swing.GroupLayout(panBebida);
        panBebida.setLayout(panBebidaLayout);
        panBebidaLayout.setHorizontalGroup(
            panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBebidaLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPregunta)
                        .addGap(3, 3, 3)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBebidaLayout.createSequentialGroup()
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panBebidaLayout.createSequentialGroup()
                                .addComponent(lblBebida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblInsumo)
                                .addGap(18, 18, 18)
                                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panBebidaLayout.createSequentialGroup()
                                        .addComponent(cbxInsumosBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblCantidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBebidaLayout.createSequentialGroup()
                                .addComponent(Cantidad1)
                                .addGap(23, 23, 23)
                                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        panBebidaLayout.setVerticalGroup(
            panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigo))
                    .addComponent(btnPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBebidaLayout.createSequentialGroup()
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInsumo)
                            .addComponent(cbxInsumosBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBebida))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBebidaLayout.createSequentialGroup()
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBebidaLayout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(269, 269, 269))
                    .addGroup(panBebidaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panBebidaLayout.createSequentialGroup()
                                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cantidad1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGuardar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        if(modo.equals("NUEVO")){
            modeloBebidaVenta.establecerDatos("ESTATICOS", 0); 
        
            //txtTotal.setText(String.valueOf(modeloBebidaVenta.re()));
            //modeloBebidaVenta.total(total);   
            txtTotal.setText(String.valueOf(suma()));
        } else {
            txtTotal.setText(String.valueOf(venta.getTotal_venta()));
            modeloBebidaVenta.establecerDatos("LISTA", codVenta);
        }
        
        
    }//GEN-LAST:event_formWindowActivated

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        TablaBebidaVenta.vaciarlistaestatica();
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (presentarDatos()) {
            
            WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea agregar el pedido a la venta actual?");
            alertaWarning.setVisible(true);
                
            if (alertaWarning.recibe()) {

                BebidaVenta bebidaVenta = new BebidaVenta();

                bebidaVenta.setId_bebida_venta(contador);
                bebidaVenta.setId_trago(((Trago) (cbxBebida.getSelectedItem())).getId_trago());
                bebidaVenta.setId_trago_fk((Trago) (cbxBebida.getSelectedItem()));
                bebidaVenta.setCantidad(Integer.parseInt(txtCantidad.getText()));

                if (TablaBebidaVenta.nuevaBebidaVentaEstatico(bebidaVenta)) {
                    new alertas.SuccessAlert(this, true, "El pedido fue agregado a la venta correctamente").setVisible(true);
                    devolverDatos("RESTA");
                    contador++;
                } else {
                    new alertas.ErrorAlert(this, true, "El pedido no pudo ser agregado a la venta").setVisible(true);
                }

            } else {
                new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
            }
            
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();

        if ((((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) || txtCantidad.getText().length() >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            
            WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea registrar la venta?");
            alertaWarning.setVisible(true);
            
            if (alertaWarning.recibe()) {

                TablaVenta ta = new TablaVenta();
                Calendar calendarioI = new GregorianCalendar();

                venta = new Venta();
                String cod;

                do {      
                    cod=numConCeros(codigo);
                    codigo++;
                } while (TablaVenta.existeVenta(cod)==1);

                venta.setCodigo_venta(cod);
                venta.setTotal_venta(Double.parseDouble(txtTotal.getText()));
                //venta.setTotal_venta(0.0);
                Date dia=new Date();
                venta.setFecha_venta(dia);
                venta.setHora_venta((String.valueOf(calendarioI.get(Calendar.HOUR_OF_DAY)).length()==1?"0":"")+calendarioI.get(Calendar.HOUR_OF_DAY) + ":" +(String.valueOf(calendarioI.get(Calendar.MINUTE)).length()==1?"0":"")+ calendarioI.get(Calendar.MINUTE));

                if (ta.insertarVenta(venta) == 1) {
                    
                    // Lista de bebidas de la venta
                    
                    List<BebidaVenta> listaBebidasVentas=TablaBebidaVenta.listaestatica();
                    TablaBebidaVenta tab = new TablaBebidaVenta();
                    
                    Venta venta1 = TablaVenta.buscaVenta(0,cod);
                    int codigoV=venta1.getId_venta(); 
                    
                    listaBebidasVentas.forEach((u) -> {
                        
                        if(tab.insertarBebidaVenta(u,codigoV)==1){ 
                            try {
                            
                            // Inserto la cantidad de bebidas pedida
                            List<Receta> lista = TablaReceta.listaRecetas(u.getId_trago_fk().getId_trago());
                            Double a;
                            Double b=0.0;
                            Double c=0.0;
                            
                                for (int i = 0; i < lista.size(); i++) {

                                    b=((double)Math.round((lista.get(i).getCantidad_receta()*((double)(u.getCantidad()))) * 100d) / 100d);

                                    if(lista.get(i).getoInsumo().getUm_insumo()==lista.get(i).getUm_receta()){
                                        a=lista.get(i).getoInsumo().getCantidad_insumo();
                                        c=((double)Math.round((a-b) * 100d) / 100d);
                                        
                                        System.out.println("A: "+a);
                                        System.out.println("A: "+b);
                                        System.out.println("A: "+c);

                                    } else if(lista.get(i).getoInsumo().getUm_insumo()==2 && lista.get(i).getUm_receta()==0){
                                        // CONVIERTO DE ML A ONZ
                                        a=((double)Math.round((Conversion.getML_A_ONZ(lista.get(i).getoInsumo().getCantidad_insumo())*100d)/100d));
                                        
                                        // LO DEVUELVO AL ORIGINAL (ML)
                                        c=((double)Math.round(Conversion.getONZ_A_ML(((double)Math.round((a-b) * 100d) / 100d))));

                                    } else if(lista.get(i).getoInsumo().getUm_insumo()==0 && lista.get(i).getUm_receta()==2){
                                        // CONVIERTO DE ONZ A ML
                                        a=((double)Math.round((Conversion.getONZ_A_ML(lista.get(i).getoInsumo().getCantidad_insumo())*100d)/100d));
                                        
                                        // LO DEVUELVO AL ORIGINAL (ONZ)
                                        c=((double)Math.round(Conversion.getML_A_ONZ(((double)Math.round((a-b) * 100d) / 100d))));

                                    }
                                    
                                    //a=(lista.get(i).getoInsumo().getCantidad_insumo());
                                
                                    TablaInsumo.modificarCantidadInsumo(lista.get(i).getoInsumo().getId_insumo(), c);
                                    
                                    // REGISTRO DE LOS INSUMOS VENDIDOS
                                    TablaInsumoVendido.insertarInsumoVendido(lista.get(i).getoInsumo().getId_insumo(), b, lista.get(i).getUm_receta(), dia);

                                }
                            
                            } catch (SQLException ex) {
                                Logger.getLogger(JFVenta.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                    });

                    this.dispose();
                    
                    new alertas.SuccessAlert(this, true, "La venta fue registrada correctamente").setVisible(true);
                
                    TablaBebidaVenta.vaciarlistaestatica();
                    
                } else {
                    this.dispose();
                    
                    new alertas.ErrorAlert(this, true, "La venta no pudo ser registrada correctamente").setVisible(true);
                }

            } else {
                new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
            }    
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            new alertas.ErrorAlert(this, true,"Error: "+e.getMessage()).setVisible(true);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            if (tblBebidasVentas.getSelectedRow() != -1) {
                
                WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea eliminar?");
                alertaWarning.setVisible(true);
                
                if (alertaWarning.recibe()) {

                    BebidaVenta beb = new BebidaVenta();

                    beb.setId_bebida_venta(Integer.parseInt(tblBebidasVentas.getValueAt(tblBebidasVentas.getSelectedRow(), 1).toString()));

                    devolverDatos("SUMA");
                    
                    if (TablaBebidaVenta.eliminarBebidaVentaEstatico(beb)) {
                        new alertas.SuccessAlert(this, true, "El pedido de la venta ha sido eliminado correctamente").setVisible(true);
                    } else {
                        new alertas.ErrorAlert(this, true, "El pedido no pudo ser eliminado de la venta").setVisible(true);
                    }

                } else {
                    new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
                }
            } else {
                new alertas.WarningAlert(this, true, "Debe seleccionar un pedido").setVisible(true);
            }
            
        } catch (HeadlessException | NumberFormatException e) {
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void cbxBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBebidaActionPerformed
        select();
    }//GEN-LAST:event_cbxBebidaActionPerformed

    private void btnPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntaActionPerformed
        
    }//GEN-LAST:event_btnPreguntaActionPerformed

    private void select(){
        try {
            List<Receta> recetaCompleta = TablaReceta.listaRecetas(((Trago)(cbxBebida.getSelectedItem())).getId_trago());

            List<Insumo> listaDeInsumos = new ArrayList<>();

            for (int i = 0; i < recetaCompleta.size(); i++) {
                recetaCompleta.get(i).getoInsumo().setCantidadNecesaria(recetaCompleta.get(i).getCantidad_receta());
                recetaCompleta.get(i).getoInsumo().setUnidadReceta(recetaCompleta.get(i).getUm_receta());
                listaDeInsumos.add(recetaCompleta.get(i).getoInsumo());
            }

            DefaultComboBoxModel model2 = new DefaultComboBoxModel(listaDeInsumos.toArray());

            cbxInsumosBebida.setModel(model2);
            
        } catch (SQLException e) {
        }
    }
    
    private Double suma(){
        int contar=tblBebidasVentas.getRowCount();
        Double suma=0.0;
        
        for (int i = 0; i < contar; i++) {
            suma=suma+Double.parseDouble(tblBebidasVentas.getValueAt(i, 5).toString());
        }
        
        return (double)(Math.round((double)((suma*100d)/100d)));
    }
    
    private static String numConCeros(int numeroOrig){
        String res = "";
        
        if(numeroOrig>=1000000000){
            res = "" + numeroOrig;
        } else if(numeroOrig>=100000000){
            res = "0" + numeroOrig;
        } else if(numeroOrig>=10000000){
            res = "00" + numeroOrig;
        } else if(numeroOrig>=1000000){
            res = "000" + numeroOrig;
        } else if(numeroOrig>=100000){
           res = "0000" + numeroOrig; 
        } else if(numeroOrig>=10000){
           res = "00000" + numeroOrig; 
        } else if(numeroOrig>=1000) {
           res = "000000" + numeroOrig; 
        } else if(numeroOrig>=100){
           res = "0000000" + numeroOrig; 
        } else if(numeroOrig>=10){
           res = "00000000" + numeroOrig; 
        } else if(numeroOrig>=1){
           res = "000000000" + numeroOrig; 
        }
           
        return res;
    }
    
    private void devolverDatos(String modo){
        
        try {
            List<Receta> lista = new ArrayList<>();
            
            if(modo.equals("SUMA")){ // CUANDO ELIMINO
                
                // Recupero la bebida seleccionada
                BebidaVenta bebidaVenta = TablaBebidaVenta.UbicarPorId(Integer.parseInt(tblBebidasVentas.getValueAt(tblBebidasVentas.getSelectedRow(), 1).toString()));

                lista = TablaReceta.listaRecetas(bebidaVenta.getId_trago_fk().getId_trago());
                
            } else { // CUANDO AGREGO
                lista = TablaReceta.listaRecetas(((Trago)(cbxBebida.getSelectedItem())).getId_trago());
            }
            
            Double cantidadNueva=0.0;
            
            for (int i = 0; i < lista.size(); i++) {

                Insumo insumoNuevo = TablaInsumo.cambioAEstatico(lista.get(i).getoInsumo().getId_insumo()); 
                
                if(insumoNuevo.getUm_insumo()==lista.get(i).getUm_receta()){
                    
                    if(modo.equals("SUMA"))
                        cantidadNueva=(lista.get(i).getoInsumo().getCantidad_insumo())+((double)Math.round(((lista.get(i).getCantidad_receta()*Integer.parseInt(txtCantidad.getText()))*100d)/100d));
                    else 
                        cantidadNueva=(lista.get(i).getoInsumo().getCantidad_insumo())-((double)Math.round(((lista.get(i).getCantidad_receta()*Integer.parseInt(txtCantidad.getText()))*100d)/100d));
                        
                } else if(insumoNuevo.getUm_insumo()==2 && lista.get(i).getUm_receta()==0){
                    // CONVIERTO DE ML A ONZ

                    if(modo.equals("SUMA"))
                        cantidadNueva=Conversion.getONZ_A_ML(((Conversion.getML_A_ONZ(lista.get(i).getoInsumo().getCantidad_insumo()))+((double)Math.round(((lista.get(i).getCantidad_receta()*Integer.parseInt(txtCantidad.getText()))*100d)/100d))));
                    else 
                        cantidadNueva=Conversion.getONZ_A_ML(((Conversion.getML_A_ONZ(lista.get(i).getoInsumo().getCantidad_insumo()))-((double)Math.round(((lista.get(i).getCantidad_receta()*Integer.parseInt(txtCantidad.getText()))*100d)/100d))));
                            
                } else if(insumoNuevo.getUm_insumo()==0 && lista.get(i).getUm_receta()==2){
                    // CONVIERTO DE ONZ A ML
                    
                    if(modo.equals("SUMA"))
                        cantidadNueva=Conversion.getML_A_ONZ(((Conversion.getONZ_A_ML(lista.get(i).getoInsumo().getCantidad_insumo()))+((double)Math.round(((lista.get(i).getCantidad_receta()*Integer.parseInt(txtCantidad.getText()))*100d)/100d))));
                    else 
                        cantidadNueva=Conversion.getML_A_ONZ(((Conversion.getONZ_A_ML(lista.get(i).getoInsumo().getCantidad_insumo()))-((double)Math.round(((lista.get(i).getCantidad_receta()*Integer.parseInt(txtCantidad.getText()))*100d)/100d))));
                            
                }
                
                // El stock del insumo estático se cambia
                if(modo.equals("SUMA")){
                    insumoNuevo.setCantidad_insumo(cantidadNueva);
                } else { 
                    insumoNuevo.setCantidad_insumo(cantidadNueva);
                }
                
                TablaInsumo.modificar(insumoNuevo);    

            }            
        } catch (NumberFormatException | SQLException e) {
        }
        
    }
    
    private boolean presentarDatos() {

        if (cbxBebida.getSelectedIndex() == -1) {
            new alertas.WarningAlert(this, true, "Debe seleccionar una bebida").setVisible(true);
            cbxBebida.requestFocusInWindow();
            return false;
        } else if (txtCantidad.getText().equals("")) {
            new alertas.WarningAlert(this, true, "Debe ingresar una cantidad").setVisible(true);
            txtCantidad.requestFocusInWindow();
            return false;
        } else {
            
            try {
                
                // Inserto la cantidad de bebidas pedida
                List<Receta> lista = TablaReceta.listaRecetas(((Trago)(cbxBebida.getSelectedItem())).getId_trago());

                if(lista.isEmpty()){
                    new alertas.WarningAlert(this, true, "Esta bebida no tiene receta").setVisible(true);
                    return false;
                } else {
                    for (int i = 0; i < lista.size(); i++) {   

                        if(((Trago)(cbxBebida.getSelectedItem())).getCosto_trago()==0.0){
                            new alertas.WarningAlert(this, true, "La bebida '"+lista.get(i).getoTrago().getDescripcion_trago().toLowerCase()+"' tiene costo 0, revise la lista de bebidas ").setVisible(true);
                            return false;
                        } else {
                            
                            Insumo insumoNuevo = TablaInsumo.cambioAEstatico(lista.get(i).getoInsumo().getId_insumo()); 
                            
                            Double canti;
                            Double resta;
                            // SI TIENEN LA MISMA UNIDAD DE MEDIDA
                            if(insumoNuevo.getUm_insumo()==lista.get(i).getUm_receta()){
                                canti=insumoNuevo.getCantidad_insumo();
                            } else if(insumoNuevo.getUm_insumo()==2 && lista.get(i).getUm_receta()==0){
                                // CONVIERTO DE ML A ONZ
                                canti=Conversion.getML_A_ONZ(insumoNuevo.getCantidad_insumo());
                            } else if(insumoNuevo.getUm_insumo()==0 && lista.get(i).getUm_receta()==2){
                                // CONVIERTO DE ONZ A ML
                                canti=Conversion.getONZ_A_ML(insumoNuevo.getCantidad_insumo());
                            } else {
                                new alertas.WarningAlert(this, true, "No hay una conversión correcta del insumo: "+lista.get(i).getoInsumo().getNombre_insumo()).setVisible(true);
                                return false;
                            }
                            
                            resta=(lista.get(i).getCantidad_receta()*Integer.parseInt(txtCantidad.getText()));
                            
                            if(canti-resta<0){
                                new alertas.WarningAlert(this, true, "Stock insuficiente del insumo: "+lista.get(i).getoInsumo().getNombre_insumo()).setVisible(true);
                                return false;
                            }
                            
                        }

                    }    
                }
                    
            } catch (SQLException e) {
            }
            
        }

        return true;
    }
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFUsuario(null,"NUEVO").setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantidad1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPregunta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxBebida;
    private javax.swing.JComboBox<String> cbxInsumosBebida;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblBebida;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblInsumo;
    private javax.swing.JPanel panBebida;
    private javax.swing.JSeparator spCantidad;
    private javax.swing.JSeparator spCodigo;
    private javax.swing.JTable tblBebidasVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
