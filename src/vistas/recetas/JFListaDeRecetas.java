
package vistas.recetas;

import alertas.WarningConfirmAlert;
import beans.Receta;
import beans.Trago;
import vistas.bebidas.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import modelos.ModeloReceta;
import reportes.GenerarReportes;
import tablas.TablaReceta;
import tablas.TablaTrago;
import vistas.JFInicio;
import vistas.conciliacion.JFListaConciliacion;
import vistas.equivalencia.JFListaEquivalencia;
import vistas.insumo.JFListaDeInsumos;
import vistas.ventas.JFListaDeVentas;

public class JFListaDeRecetas extends javax.swing.JFrame {

    private final ModeloReceta modeloReceta;
    
    public JFListaDeRecetas() {

        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());

        this.setLocationRelativeTo(this);
        
        setColor(btn_Receta);
        ind_receta.setOpaque(true);
        
        try {
            List<Trago> listaDeTragos = TablaTrago.listaTragos();            
            DefaultComboBoxModel model = new DefaultComboBoxModel(listaDeTragos.toArray());

            cbxBebida.setModel(model);
        } catch (SQLException e) {
        }
        
        
        modeloReceta= new ModeloReceta("TODOS");
        
        tblRecetas.setModel(modeloReceta);
        tblRecetas.getTableHeader().setReorderingAllowed(false);
        
        // *****
        modeloReceta.establecerDatos(((Trago)(cbxBebida.getSelectedItem())).getId_trago());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecetas = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbxBebida = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnReporte1 = new javax.swing.JButton();
        JPMenu = new javax.swing.JPanel();
        btn_Ventas1 = new javax.swing.JPanel();
        ind_ventas1 = new javax.swing.JPanel();
        btnVentas1 = new javax.swing.JButton();
        btn_Insumos = new javax.swing.JPanel();
        ind_insumos = new javax.swing.JPanel();
        btnInsumo = new javax.swing.JButton();
        btn_Receta = new javax.swing.JPanel();
        ind_receta = new javax.swing.JPanel();
        btnReceta = new javax.swing.JButton();
        btn_Equivalencia = new javax.swing.JPanel();
        ind_equivalencia1 = new javax.swing.JPanel();
        btnEquivalencia1 = new javax.swing.JButton();
        btn_Inicio = new javax.swing.JPanel();
        ind_inicio1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btn_Bebidas = new javax.swing.JPanel();
        ind_bebidas1 = new javax.swing.JPanel();
        btnBebidas1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_Stock = new javax.swing.JPanel();
        ind_stock = new javax.swing.JPanel();
        btnStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Multiply_25px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(893, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 930, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(242, 247, 247));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Lista de Recetas");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addContainerGap(802, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblRecetas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblRecetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRecetas.setGridColor(new java.awt.Color(255, 255, 255));
        tblRecetas.setRowHeight(22);
        jScrollPane1.setViewportView(tblRecetas);

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(71, 120, 197));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_add_file_32px.png"))); // NOI18N
        btnNuevo.setText("Agregar");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(71, 120, 197));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_edit_file_32px_2.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(71, 120, 197));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_delete_file_32px_1.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cbxBebida.setBackground(new java.awt.Color(23, 35, 51));
        cbxBebida.setForeground(new java.awt.Color(0, 0, 0));
        cbxBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBebidaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Bebida");

        btnReporte1.setBackground(new java.awt.Color(255, 255, 255));
        btnReporte1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnReporte1.setForeground(new java.awt.Color(71, 120, 197));
        btnReporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_attendance_mark_32px.png"))); // NOI18N
        btnReporte1.setText("Reporte");
        btnReporte1.setBorder(null);
        btnReporte1.setBorderPainted(false);
        btnReporte1.setContentAreaFilled(false);
        btnReporte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnNuevo)
                    .addComponent(btnReporte1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 930, 540));

        JPMenu.setBackground(new java.awt.Color(23, 35, 51));
        JPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Ventas1.setBackground(new java.awt.Color(23, 35, 51));

        ind_ventas1.setOpaque(false);
        ind_ventas1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_ventas1Layout = new javax.swing.GroupLayout(ind_ventas1);
        ind_ventas1.setLayout(ind_ventas1Layout);
        ind_ventas1Layout.setHorizontalGroup(
            ind_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_ventas1Layout.setVerticalGroup(
            ind_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnVentas1.setBackground(new java.awt.Color(23, 35, 51));
        btnVentas1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnVentas1.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_price_tag_15px_1.png"))); // NOI18N
        btnVentas1.setText("   Ventas");
        btnVentas1.setBorder(null);
        btnVentas1.setBorderPainted(false);
        btnVentas1.setContentAreaFilled(false);
        btnVentas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas1.setDisabledIcon(null);
        btnVentas1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnVentas1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVentas1.setPreferredSize(new java.awt.Dimension(140, 43));
        btnVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_Ventas1Layout = new javax.swing.GroupLayout(btn_Ventas1);
        btn_Ventas1.setLayout(btn_Ventas1Layout);
        btn_Ventas1Layout.setHorizontalGroup(
            btn_Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_Ventas1Layout.createSequentialGroup()
                .addComponent(ind_ventas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
            .addGroup(btn_Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_Ventas1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_Ventas1Layout.setVerticalGroup(
            btn_Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_ventas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_Ventas1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Ventas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        btn_Insumos.setBackground(new java.awt.Color(23, 35, 51));

        ind_insumos.setOpaque(false);
        ind_insumos.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_insumosLayout = new javax.swing.GroupLayout(ind_insumos);
        ind_insumos.setLayout(ind_insumosLayout);
        ind_insumosLayout.setHorizontalGroup(
            ind_insumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_insumosLayout.setVerticalGroup(
            ind_insumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnInsumo.setBackground(new java.awt.Color(23, 35, 51));
        btnInsumo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_overview_pages_3_15px_1.png"))); // NOI18N
        btnInsumo.setText("   Insumos");
        btnInsumo.setBorder(null);
        btnInsumo.setBorderPainted(false);
        btnInsumo.setContentAreaFilled(false);
        btnInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsumo.setDisabledIcon(null);
        btnInsumo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInsumo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInsumo.setPreferredSize(new java.awt.Dimension(140, 43));
        btnInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_InsumosLayout = new javax.swing.GroupLayout(btn_Insumos);
        btn_Insumos.setLayout(btn_InsumosLayout);
        btn_InsumosLayout.setHorizontalGroup(
            btn_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_InsumosLayout.createSequentialGroup()
                .addComponent(btnInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ind_insumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_InsumosLayout.setVerticalGroup(
            btn_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_InsumosLayout.createSequentialGroup()
                .addGroup(btn_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ind_insumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JPMenu.add(btn_Insumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, -1));

        btn_Receta.setBackground(new java.awt.Color(23, 35, 51));

        ind_receta.setOpaque(false);
        ind_receta.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_recetaLayout = new javax.swing.GroupLayout(ind_receta);
        ind_receta.setLayout(ind_recetaLayout);
        ind_recetaLayout.setHorizontalGroup(
            ind_recetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_recetaLayout.setVerticalGroup(
            ind_recetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnReceta.setBackground(new java.awt.Color(23, 35, 51));
        btnReceta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnReceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_personal_video_recorder_menu_filled_15px.png"))); // NOI18N
        btnReceta.setText("   Recetas");
        btnReceta.setBorder(null);
        btnReceta.setBorderPainted(false);
        btnReceta.setContentAreaFilled(false);
        btnReceta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReceta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnReceta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReceta.setPreferredSize(new java.awt.Dimension(140, 43));
        btnReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_RecetaLayout = new javax.swing.GroupLayout(btn_Receta);
        btn_Receta.setLayout(btn_RecetaLayout);
        btn_RecetaLayout.setHorizontalGroup(
            btn_RecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_RecetaLayout.createSequentialGroup()
                .addComponent(ind_receta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(btn_RecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_RecetaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_RecetaLayout.setVerticalGroup(
            btn_RecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_RecetaLayout.createSequentialGroup()
                .addComponent(ind_receta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_RecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_RecetaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, -1));

        btn_Equivalencia.setBackground(new java.awt.Color(23, 35, 51));

        ind_equivalencia1.setOpaque(false);
        ind_equivalencia1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_equivalencia1Layout = new javax.swing.GroupLayout(ind_equivalencia1);
        ind_equivalencia1.setLayout(ind_equivalencia1Layout);
        ind_equivalencia1Layout.setHorizontalGroup(
            ind_equivalencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_equivalencia1Layout.setVerticalGroup(
            ind_equivalencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnEquivalencia1.setBackground(new java.awt.Color(23, 35, 51));
        btnEquivalencia1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEquivalencia1.setForeground(new java.awt.Color(255, 255, 255));
        btnEquivalencia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_data_in_both_directions_15px.png"))); // NOI18N
        btnEquivalencia1.setText("   Equivalencia");
        btnEquivalencia1.setBorder(null);
        btnEquivalencia1.setBorderPainted(false);
        btnEquivalencia1.setContentAreaFilled(false);
        btnEquivalencia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEquivalencia1.setDisabledIcon(null);
        btnEquivalencia1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEquivalencia1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEquivalencia1.setPreferredSize(new java.awt.Dimension(140, 43));
        btnEquivalencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquivalencia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_EquivalenciaLayout = new javax.swing.GroupLayout(btn_Equivalencia);
        btn_Equivalencia.setLayout(btn_EquivalenciaLayout);
        btn_EquivalenciaLayout.setHorizontalGroup(
            btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                .addComponent(ind_equivalencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEquivalencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_EquivalenciaLayout.setVerticalGroup(
            btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                .addComponent(ind_equivalencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEquivalencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Equivalencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, -1));

        btn_Inicio.setBackground(new java.awt.Color(23, 35, 51));

        ind_inicio1.setOpaque(false);
        ind_inicio1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_inicio1Layout = new javax.swing.GroupLayout(ind_inicio1);
        ind_inicio1.setLayout(ind_inicio1Layout);
        ind_inicio1Layout.setHorizontalGroup(
            ind_inicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_inicio1Layout.setVerticalGroup(
            ind_inicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnInicio.setBackground(new java.awt.Color(23, 35, 51));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_home_15px_2.png"))); // NOI18N
        btnInicio.setText("   Inicio");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio.setPreferredSize(new java.awt.Dimension(140, 43));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_InicioLayout = new javax.swing.GroupLayout(btn_Inicio);
        btn_Inicio.setLayout(btn_InicioLayout);
        btn_InicioLayout.setHorizontalGroup(
            btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_InicioLayout.createSequentialGroup()
                .addComponent(ind_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
            .addGroup(btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_InicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_InicioLayout.setVerticalGroup(
            btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_InicioLayout.createSequentialGroup()
                .addComponent(ind_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_InicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, -1));

        btn_Bebidas.setBackground(new java.awt.Color(23, 35, 51));

        ind_bebidas1.setOpaque(false);
        ind_bebidas1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_bebidas1Layout = new javax.swing.GroupLayout(ind_bebidas1);
        ind_bebidas1.setLayout(ind_bebidas1Layout);
        ind_bebidas1Layout.setHorizontalGroup(
            ind_bebidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_bebidas1Layout.setVerticalGroup(
            ind_bebidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnBebidas1.setBackground(new java.awt.Color(23, 35, 51));
        btnBebidas1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBebidas1.setForeground(new java.awt.Color(255, 255, 255));
        btnBebidas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_wine_glass_15px.png"))); // NOI18N
        btnBebidas1.setText("   Bebidas");
        btnBebidas1.setBorder(null);
        btnBebidas1.setBorderPainted(false);
        btnBebidas1.setContentAreaFilled(false);
        btnBebidas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBebidas1.setDisabledIcon(null);
        btnBebidas1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBebidas1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBebidas1.setPreferredSize(new java.awt.Dimension(140, 43));
        btnBebidas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_BebidasLayout = new javax.swing.GroupLayout(btn_Bebidas);
        btn_Bebidas.setLayout(btn_BebidasLayout);
        btn_BebidasLayout.setHorizontalGroup(
            btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BebidasLayout.createSequentialGroup()
                .addComponent(ind_bebidas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_BebidasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBebidas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_BebidasLayout.setVerticalGroup(
            btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BebidasLayout.createSequentialGroup()
                .addComponent(ind_bebidas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_BebidasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBebidas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("BASS");
        JPMenu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));
        JPMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 20));

        btn_Stock.setBackground(new java.awt.Color(23, 35, 51));

        ind_stock.setOpaque(false);
        ind_stock.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_stockLayout = new javax.swing.GroupLayout(ind_stock);
        ind_stock.setLayout(ind_stockLayout);
        ind_stockLayout.setHorizontalGroup(
            ind_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_stockLayout.setVerticalGroup(
            ind_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnStock.setBackground(new java.awt.Color(23, 35, 51));
        btnStock.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnStock.setForeground(new java.awt.Color(255, 255, 255));
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_to_do_15px.png"))); // NOI18N
        btnStock.setText("   Conciliación");
        btnStock.setBorder(null);
        btnStock.setBorderPainted(false);
        btnStock.setContentAreaFilled(false);
        btnStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStock.setDisabledIcon(null);
        btnStock.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnStock.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnStock.setPreferredSize(new java.awt.Dimension(140, 43));
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_StockLayout = new javax.swing.GroupLayout(btn_Stock);
        btn_Stock.setLayout(btn_StockLayout);
        btn_StockLayout.setHorizontalGroup(
            btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_StockLayout.createSequentialGroup()
                .addComponent(ind_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_StockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_StockLayout.setVerticalGroup(
            btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_StockLayout.createSequentialGroup()
                .addComponent(ind_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_StockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

        getContentPane().add(JPMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        //drag this pane
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        
        //source to drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel7MousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        modeloReceta.establecerDatos(((Trago)(cbxBebida.getSelectedItem())).getId_trago());
    }//GEN-LAST:event_formWindowActivated

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        JFReceta jFReceta = new JFReceta(null, "NUEVO");
        jFReceta.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(tblRecetas.getSelectedRow()!=-1){
                
                WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea modificar?");
                alertaWarning.setVisible(true);
                
                if(alertaWarning.recibe()){

                    Receta receta=TablaReceta.buscaReceta(Integer.parseInt(tblRecetas.getValueAt(tblRecetas.getSelectedRow(), 1).toString()));

                    JFReceta jFReceta = new JFReceta(receta, "MODIFICAR");
                    jFReceta.setVisible(true);
                    
                } else {
                    new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
                }
            } else {
                new alertas.WarningAlert(this, true, "Debe seleccionar una receta").setVisible(true);
            }
            
        } catch (HeadlessException | NumberFormatException | SQLException e) {
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
            if(tblRecetas.getSelectedRow()!=-1){
                
                WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea elminar?");
                alertaWarning.setVisible(true);
                
                if(alertaWarning.recibe()){

                    TablaReceta tab = new TablaReceta();

                    if(tab.eliminarReceta(Integer.parseInt(tblRecetas.getValueAt(tblRecetas.getSelectedRow(), 1).toString()))==1)
                        new alertas.SuccessAlert(this, true, "Receta eliminada correctamente").setVisible(true);
                    else
                        new alertas.ErrorAlert(this, true, "No se pudo eliminar la receta").setVisible(true);
                    
                } else {
                    new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
                }
            } else {
                new alertas.WarningAlert(this, true, "Debe seleccionar una receta").setVisible(true);
            }

        } catch (HeadlessException | NumberFormatException e) {
            new alertas.ErrorAlert(this, true,"Error: "+e.getMessage()).setVisible(true);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas1ActionPerformed
        JFListaDeVentas jFListaDeVentas = new JFListaDeVentas();
        this.dispose();
        jFListaDeVentas.setVisible(true);
    }//GEN-LAST:event_btnVentas1ActionPerformed

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        JFListaDeInsumos jFListaDeInsumos = new JFListaDeInsumos();
        this.dispose();
        jFListaDeInsumos.setVisible(true);
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void btnRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecetaActionPerformed

    private void btnEquivalencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquivalencia1ActionPerformed
        JFListaEquivalencia jFListaEquivalencia = new JFListaEquivalencia();
        this.dispose();
        jFListaEquivalencia.setVisible(true);
    }//GEN-LAST:event_btnEquivalencia1ActionPerformed

    private void btnBebidas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidas1ActionPerformed
        JFListaDeBebidas jFListaDeBebidas = new JFListaDeBebidas();
        this.dispose();
        jFListaDeBebidas.setVisible(true);
    }//GEN-LAST:event_btnBebidas1ActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        JFListaConciliacion jFListaConciliacion = new JFListaConciliacion();
        this.dispose();
        jFListaConciliacion.setVisible(true);
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        JFInicio JFInicio = new JFInicio();
        this.dispose();
        JFInicio.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void cbxBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBebidaActionPerformed
        if(cbxBebida.getSelectedIndex() != (cbxBebida.getItemCount())) 
            modeloReceta.establecerDatos(((Trago)(cbxBebida.getSelectedItem())).getId_trago());            
        else
            modeloReceta.establecerDatos(0); 
    }//GEN-LAST:event_cbxBebidaActionPerformed

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
        try {

            WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea generar reporte de recetas?");
            alertaWarning.setVisible(true);

            if(alertaWarning.recibe()){
                /*
                GenerarReportes reporte = new GenerarReportes();
                reporte.reporte("REPORTE_BEBIDAS", null);
                */
                GenerarReportes.reportes("REPORTE_RECETAS",0,null);
            }

        } catch (Exception e) {
            new alertas.ErrorAlert(this, true,"Hubo un error en el reporte").setVisible(true);
        }
    }//GEN-LAST:event_btnReporte1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFListaDeRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFListaDeRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFListaDeRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFListaDeRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFListaDeRecetas().setVisible(true);
            }
        });
    }
   
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPMenu;
    private javax.swing.JButton btnBebidas1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEquivalencia1;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsumo;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReceta;
    private javax.swing.JButton btnReporte1;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnVentas1;
    private javax.swing.JPanel btn_Bebidas;
    private javax.swing.JPanel btn_Equivalencia;
    private javax.swing.JPanel btn_Inicio;
    private javax.swing.JPanel btn_Insumos;
    private javax.swing.JPanel btn_Receta;
    private javax.swing.JPanel btn_Stock;
    private javax.swing.JPanel btn_Ventas1;
    private javax.swing.JComboBox<String> cbxBebida;
    private javax.swing.JPanel ind_bebidas1;
    private javax.swing.JPanel ind_equivalencia1;
    private javax.swing.JPanel ind_inicio1;
    private javax.swing.JPanel ind_insumos;
    private javax.swing.JPanel ind_receta;
    private javax.swing.JPanel ind_stock;
    private javax.swing.JPanel ind_ventas1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblRecetas;
    // End of variables declaration//GEN-END:variables
}
