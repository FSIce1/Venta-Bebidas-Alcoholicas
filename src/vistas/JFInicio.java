
package vistas;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import vistas.bebidas.JFListaDeBebidas;
import vistas.conciliacion.JFListaConciliacion;
import vistas.equivalencia.JFListaEquivalencia;
import vistas.insumo.JFListaDeInsumos;
import vistas.recetas.JFListaDeRecetas;
import vistas.ventas.JFListaDeVentas;

public class JFInicio extends javax.swing.JFrame {

    public JFInicio() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());

        this.setLocationRelativeTo(this);
        
        setColor(btn_Inicio);
        ind_inicio1.setOpaque(true);
        
        Date dia = new Date();
        lblFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(dia));
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        JPMenu = new javax.swing.JPanel();
        btn_Ventas = new javax.swing.JPanel();
        ind_ventas1 = new javax.swing.JPanel();
        btnVentas1 = new javax.swing.JButton();
        btn_Receta = new javax.swing.JPanel();
        ind_recetas = new javax.swing.JPanel();
        btnRecetas1 = new javax.swing.JButton();
        btn_Insumos = new javax.swing.JPanel();
        ind_insumos = new javax.swing.JPanel();
        btnInsumo = new javax.swing.JButton();
        btn_Stock = new javax.swing.JPanel();
        ind_stock1 = new javax.swing.JPanel();
        btnStock1 = new javax.swing.JButton();
        btn_Equivalencia = new javax.swing.JPanel();
        ind_equivalencia1 = new javax.swing.JPanel();
        btnEquivalencia1 = new javax.swing.JButton();
        btn_Inicio = new javax.swing.JPanel();
        ind_inicio1 = new javax.swing.JPanel();
        btnInicio1 = new javax.swing.JButton();
        btn_Bebidas = new javax.swing.JPanel();
        ind_bebidas1 = new javax.swing.JPanel();
        btnBebidas1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
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

        jPanel3.setBackground(new java.awt.Color(71, 120, 197));

        jPanel4.setBackground(new java.awt.Color(120, 168, 252));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/imge_1.jpg"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 86, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Administrador");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("...");

        lblFecha1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha1.setText("Fecha actual:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 280, 540));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(242, 247, 247));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("BIENVENIDO AL SISTEMA!");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));

        JPMenu.setBackground(new java.awt.Color(23, 35, 51));
        JPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Ventas.setBackground(new java.awt.Color(23, 35, 51));

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

        javax.swing.GroupLayout btn_VentasLayout = new javax.swing.GroupLayout(btn_Ventas);
        btn_Ventas.setLayout(btn_VentasLayout);
        btn_VentasLayout.setHorizontalGroup(
            btn_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_VentasLayout.createSequentialGroup()
                .addComponent(ind_ventas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
            .addGroup(btn_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_VentasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_VentasLayout.setVerticalGroup(
            btn_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_ventas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_VentasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        btn_Receta.setBackground(new java.awt.Color(23, 35, 51));

        ind_recetas.setOpaque(false);
        ind_recetas.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_recetasLayout = new javax.swing.GroupLayout(ind_recetas);
        ind_recetas.setLayout(ind_recetasLayout);
        ind_recetasLayout.setHorizontalGroup(
            ind_recetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_recetasLayout.setVerticalGroup(
            ind_recetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnRecetas1.setBackground(new java.awt.Color(23, 35, 51));
        btnRecetas1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRecetas1.setForeground(new java.awt.Color(255, 255, 255));
        btnRecetas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_personal_video_recorder_menu_filled_15px.png"))); // NOI18N
        btnRecetas1.setText("   Recetas");
        btnRecetas1.setBorder(null);
        btnRecetas1.setBorderPainted(false);
        btnRecetas1.setContentAreaFilled(false);
        btnRecetas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecetas1.setDisabledIcon(null);
        btnRecetas1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRecetas1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRecetas1.setPreferredSize(new java.awt.Dimension(140, 43));
        btnRecetas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_RecetaLayout = new javax.swing.GroupLayout(btn_Receta);
        btn_Receta.setLayout(btn_RecetaLayout);
        btn_RecetaLayout.setHorizontalGroup(
            btn_RecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_RecetaLayout.createSequentialGroup()
                .addComponent(btnRecetas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ind_recetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_RecetaLayout.setVerticalGroup(
            btn_RecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_RecetaLayout.createSequentialGroup()
                .addGroup(btn_RecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRecetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ind_recetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JPMenu.add(btn_Receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, -1));

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

        btn_Stock.setBackground(new java.awt.Color(23, 35, 51));

        ind_stock1.setOpaque(false);
        ind_stock1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_stock1Layout = new javax.swing.GroupLayout(ind_stock1);
        ind_stock1.setLayout(ind_stock1Layout);
        ind_stock1Layout.setHorizontalGroup(
            ind_stock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_stock1Layout.setVerticalGroup(
            ind_stock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnStock1.setBackground(new java.awt.Color(23, 35, 51));
        btnStock1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnStock1.setForeground(new java.awt.Color(255, 255, 255));
        btnStock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_to_do_15px.png"))); // NOI18N
        btnStock1.setText("   Conciliación");
        btnStock1.setBorder(null);
        btnStock1.setBorderPainted(false);
        btnStock1.setContentAreaFilled(false);
        btnStock1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStock1.setDisabledIcon(null);
        btnStock1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnStock1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnStock1.setPreferredSize(new java.awt.Dimension(140, 43));
        btnStock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStock1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_StockLayout = new javax.swing.GroupLayout(btn_Stock);
        btn_Stock.setLayout(btn_StockLayout);
        btn_StockLayout.setHorizontalGroup(
            btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_StockLayout.createSequentialGroup()
                .addComponent(ind_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_StockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnStock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_StockLayout.setVerticalGroup(
            btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_StockLayout.createSequentialGroup()
                .addComponent(ind_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_StockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JPMenu.add(btn_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

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

        btnInicio1.setBackground(new java.awt.Color(23, 35, 51));
        btnInicio1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnInicio1.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_home_15px_2.png"))); // NOI18N
        btnInicio1.setText("   Inicio");
        btnInicio1.setBorder(null);
        btnInicio1.setBorderPainted(false);
        btnInicio1.setContentAreaFilled(false);
        btnInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio1.setPreferredSize(new java.awt.Dimension(140, 43));

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
                    .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCartaActionPerformed

    private void btnRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetasActionPerformed
        JFListaDeRecetas jFListaDeRecetas = new JFListaDeRecetas();
        this.dispose();
        jFListaDeRecetas.setVisible(true);
    }//GEN-LAST:event_btnRecetasActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnEquivalenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquivalenciaActionPerformed
        JFListaEquivalencia jFListaEquivalencia = new JFListaEquivalencia();
        this.dispose();
        jFListaEquivalencia.setVisible(true);

    }//GEN-LAST:event_btnEquivalenciaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        JFInicio JFInicio = new JFInicio();
        this.dispose();
        JFInicio.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas1ActionPerformed
        JFListaDeVentas jFListaDeVentas = new JFListaDeVentas();
        this.dispose();
        jFListaDeVentas.setVisible(true);
    }//GEN-LAST:event_btnVentas1ActionPerformed

    private void btn_VentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ventas1MousePressed
        setColor(btn_Ventas);
       // ind_ventas.setOpaque(true);
        //resetColor(new JPanel[]{btn_Inicio,btn_Recetas,btn_Bebidas,btn_Cartas,btn_Equivalencia,btn_Stock}, new JPanel[]{ind_inicio,ind_bebidas,ind_recetas,ind_cartas,ind_equivalencia,ind_stock});
    }//GEN-LAST:event_btn_Ventas1MousePressed

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        JFListaDeInsumos jFListaDeInsumos = new JFListaDeInsumos();
        this.dispose();
        jFListaDeInsumos.setVisible(true);
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void btn_CartasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cartas1MousePressed
        setColor(btn_Receta);
        //ind_cartas.setOpaque(true);
        //resetColor(new JPanel[]{btn_Inicio,btn_Ventas,btn_Bebidas,btn_Recetas,btn_Equivalencia,btn_Stock}, new JPanel[]{ind_inicio,ind_ventas,ind_bebidas,ind_recetas,ind_equivalencia,ind_stock});
    }//GEN-LAST:event_btn_Cartas1MousePressed

    private void btnRecetas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetas1ActionPerformed
        JFListaDeRecetas JFListaDeRecetas = new JFListaDeRecetas();
        this.dispose();
        JFListaDeRecetas.setVisible(true);
    }//GEN-LAST:event_btnRecetas1ActionPerformed

    private void btn_RecetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Recetas1MousePressed
        setColor(btn_Insumos);
        //ind_recetas.setOpaque(true);
        //resetColor(new JPanel[]{btn_Inicio,btn_Ventas,btn_Bebidas,btn_Cartas,btn_Equivalencia,btn_Stock}, new JPanel[]{ind_inicio,ind_ventas,ind_bebidas,ind_cartas,ind_equivalencia,ind_stock});
    }//GEN-LAST:event_btn_Recetas1MousePressed

    private void btnStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStock1ActionPerformed
        JFListaConciliacion jFListaConciliacion = new JFListaConciliacion();
        this.dispose();
        jFListaConciliacion.setVisible(true);
    }//GEN-LAST:event_btnStock1ActionPerformed

    private void btn_StockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Stock1MousePressed
        setColor(btn_Stock);
        //ind_stock.setOpaque(true);
        //resetColor(new JPanel[]{btn_Inicio,btn_Bebidas,btn_Ventas,btn_Recetas,btn_Cartas,btn_Equivalencia}, new JPanel[]{ind_inicio,ind_bebidas,ind_ventas,ind_recetas,ind_cartas,ind_equivalencia});
    }//GEN-LAST:event_btn_Stock1MousePressed

    private void btnEquivalencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquivalencia1ActionPerformed
        JFListaEquivalencia jFListaEquivalencia = new JFListaEquivalencia();
        this.dispose();
        jFListaEquivalencia.setVisible(true);
    }//GEN-LAST:event_btnEquivalencia1ActionPerformed

    private void btn_EquivalenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Equivalencia1MousePressed
        setColor(btn_Equivalencia);
        //ind_equivalencia.setOpaque(true);
        //resetColor(new JPanel[]{btn_Inicio,btn_Ventas,btn_Bebidas,btn_Recetas,btn_Cartas,btn_Stock}, new JPanel[]{ind_inicio,ind_ventas,ind_bebidas,ind_recetas,ind_cartas,ind_stock});
    }//GEN-LAST:event_btn_Equivalencia1MousePressed

    private void btn_InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Inicio1MousePressed
        setColor(btn_Inicio);
        //ind_inicio.setOpaque(true);
        //resetColor(new JPanel[]{btn_Ventas,btn_Bebidas,btn_Recetas,btn_Cartas,btn_Equivalencia,btn_Stock}, new JPanel[]{ind_ventas,ind_bebidas,ind_recetas,ind_cartas,ind_equivalencia,ind_stock});
    }//GEN-LAST:event_btn_Inicio1MousePressed

    private void btnBebidas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidas1ActionPerformed
        JFListaDeBebidas jFListaDeBebidas = new JFListaDeBebidas();
        this.dispose();
        jFListaDeBebidas.setVisible(true);
    }//GEN-LAST:event_btnBebidas1ActionPerformed

    private void btn_BebidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Bebidas1MousePressed
        setColor(btn_Bebidas);
        //ind_bebidas.setOpaque(true);
        //resetColor(new JPanel[]{btn_Inicio,btn_Ventas,btn_Recetas,btn_Cartas,btn_Equivalencia,btn_Stock}, new JPanel[]{ind_inicio,ind_ventas,ind_recetas,ind_cartas,ind_equivalencia,ind_stock});
    }//GEN-LAST:event_btn_Bebidas1MousePressed

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
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicio().setVisible(true);
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
    private javax.swing.JButton btnEquivalencia1;
    private javax.swing.JButton btnInicio1;
    private javax.swing.JButton btnInsumo;
    private javax.swing.JButton btnRecetas1;
    private javax.swing.JButton btnStock1;
    private javax.swing.JButton btnVentas1;
    private javax.swing.JPanel btn_Bebidas;
    private javax.swing.JPanel btn_Equivalencia;
    private javax.swing.JPanel btn_Inicio;
    private javax.swing.JPanel btn_Insumos;
    private javax.swing.JPanel btn_Receta;
    private javax.swing.JPanel btn_Stock;
    private javax.swing.JPanel btn_Ventas;
    private javax.swing.JPanel ind_bebidas1;
    private javax.swing.JPanel ind_equivalencia1;
    private javax.swing.JPanel ind_inicio1;
    private javax.swing.JPanel ind_insumos;
    private javax.swing.JPanel ind_recetas;
    private javax.swing.JPanel ind_stock1;
    private javax.swing.JPanel ind_ventas1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    // End of variables declaration//GEN-END:variables
}
