
package vistas.equivalencia;

import alertas.WarningConfirmAlert;
import beans.Equivalencia;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import modelos.ModeloEquivalencia;
import reportes.GenerarReportes;
import tablas.TablaEquivalencia;
import vistas.JFInicio;
import vistas.bebidas.JFListaDeBebidas;
import vistas.conciliacion.JFListaConciliacion;
import vistas.insumo.JFListaDeInsumos;
import vistas.recetas.JFListaDeRecetas;
import vistas.ventas.JFListaDeVentas;

public class JFListaEquivalencia extends javax.swing.JFrame {

    private final ModeloEquivalencia modeloEquivalencia;
    
    public JFListaEquivalencia() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());

        this.setLocationRelativeTo(this);
        
        setColor(btn_Equivalencia); 
        ind_equivalencia.setOpaque(true);
        
        modeloEquivalencia= new ModeloEquivalencia("TODOS");
        
        tblEquivalencias.setModel(modeloEquivalencia);
        tblEquivalencias.getTableHeader().setReorderingAllowed(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane = new javax.swing.JPanel();
        btn_Ventas = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btn_Recetas = new javax.swing.JPanel();
        ind_recetas = new javax.swing.JPanel();
        btnRecetas = new javax.swing.JButton();
        btn_Insumos = new javax.swing.JPanel();
        ind_insumos = new javax.swing.JPanel();
        btnInsumo = new javax.swing.JButton();
        btn_Stock = new javax.swing.JPanel();
        ind_stock = new javax.swing.JPanel();
        btnStock = new javax.swing.JButton();
        btn_Equivalencia = new javax.swing.JPanel();
        ind_equivalencia = new javax.swing.JPanel();
        btnEquivalencia = new javax.swing.JButton();
        btn_Inicio = new javax.swing.JPanel();
        ind_inicio = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btn_Bebidas = new javax.swing.JPanel();
        ind_bebidas = new javax.swing.JPanel();
        btnBebidas = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ind_ventas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquivalencias = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReporte2 = new javax.swing.JButton();

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

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Ventas.setBackground(new java.awt.Color(23, 35, 51));
        btn_Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_VentasMousePressed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(23, 35, 51));
        btnVentas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_price_tag_15px_1.png"))); // NOI18N
        btnVentas.setText("   Ventas");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setDisabledIcon(null);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVentas.setPreferredSize(new java.awt.Dimension(140, 43));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_VentasLayout = new javax.swing.GroupLayout(btn_Ventas);
        btn_Ventas.setLayout(btn_VentasLayout);
        btn_VentasLayout.setHorizontalGroup(
            btn_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_VentasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_VentasLayout.setVerticalGroup(
            btn_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_VentasLayout.createSequentialGroup()
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        side_pane.add(btn_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 40));

        btn_Recetas.setBackground(new java.awt.Color(23, 35, 51));
        btn_Recetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_RecetasMousePressed(evt);
            }
        });

        ind_recetas.setOpaque(false);
        ind_recetas.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_recetasLayout = new javax.swing.GroupLayout(ind_recetas);
        ind_recetas.setLayout(ind_recetasLayout);
        ind_recetasLayout.setHorizontalGroup(
            ind_recetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_recetasLayout.setVerticalGroup(
            ind_recetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnRecetas.setBackground(new java.awt.Color(23, 35, 51));
        btnRecetas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRecetas.setForeground(new java.awt.Color(255, 255, 255));
        btnRecetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_personal_video_recorder_menu_filled_15px.png"))); // NOI18N
        btnRecetas.setText("   Recetas");
        btnRecetas.setBorder(null);
        btnRecetas.setBorderPainted(false);
        btnRecetas.setContentAreaFilled(false);
        btnRecetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecetas.setDisabledIcon(null);
        btnRecetas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRecetas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRecetas.setPreferredSize(new java.awt.Dimension(140, 43));
        btnRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_RecetasLayout = new javax.swing.GroupLayout(btn_Recetas);
        btn_Recetas.setLayout(btn_RecetasLayout);
        btn_RecetasLayout.setHorizontalGroup(
            btn_RecetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_RecetasLayout.createSequentialGroup()
                .addComponent(btnRecetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ind_recetas, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );
        btn_RecetasLayout.setVerticalGroup(
            btn_RecetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_RecetasLayout.createSequentialGroup()
                .addGroup(btn_RecetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_recetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecetas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_pane.add(btn_Recetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 40));

        btn_Insumos.setBackground(new java.awt.Color(23, 35, 51));
        btn_Insumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_InsumosMousePressed(evt);
            }
        });

        ind_insumos.setOpaque(false);
        ind_insumos.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_insumosLayout = new javax.swing.GroupLayout(ind_insumos);
        ind_insumos.setLayout(ind_insumosLayout);
        ind_insumosLayout.setHorizontalGroup(
            ind_insumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        ind_insumosLayout.setVerticalGroup(
            ind_insumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addGap(41, 41, 41)
                .addComponent(ind_insumos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_InsumosLayout.setVerticalGroup(
            btn_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_insumos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(btn_InsumosLayout.createSequentialGroup()
                .addComponent(btnInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        side_pane.add(btn_Insumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 40));

        btn_Stock.setBackground(new java.awt.Color(23, 35, 51));
        btn_Stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_StockMousePressed(evt);
            }
        });

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

        side_pane.add(btn_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

        btn_Equivalencia.setBackground(new java.awt.Color(23, 35, 51));
        btn_Equivalencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_EquivalenciaMousePressed(evt);
            }
        });

        ind_equivalencia.setOpaque(false);
        ind_equivalencia.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_equivalenciaLayout = new javax.swing.GroupLayout(ind_equivalencia);
        ind_equivalencia.setLayout(ind_equivalenciaLayout);
        ind_equivalenciaLayout.setHorizontalGroup(
            ind_equivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_equivalenciaLayout.setVerticalGroup(
            ind_equivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnEquivalencia.setBackground(new java.awt.Color(23, 35, 51));
        btnEquivalencia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEquivalencia.setForeground(new java.awt.Color(255, 255, 255));
        btnEquivalencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_data_in_both_directions_15px.png"))); // NOI18N
        btnEquivalencia.setText("   Equivalencia");
        btnEquivalencia.setBorder(null);
        btnEquivalencia.setBorderPainted(false);
        btnEquivalencia.setContentAreaFilled(false);
        btnEquivalencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEquivalencia.setDisabledIcon(null);
        btnEquivalencia.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEquivalencia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEquivalencia.setPreferredSize(new java.awt.Dimension(140, 43));
        btnEquivalencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquivalenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_EquivalenciaLayout = new javax.swing.GroupLayout(btn_Equivalencia);
        btn_Equivalencia.setLayout(btn_EquivalenciaLayout);
        btn_EquivalenciaLayout.setHorizontalGroup(
            btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                .addComponent(ind_equivalencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEquivalencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_EquivalenciaLayout.setVerticalGroup(
            btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                .addComponent(ind_equivalencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_EquivalenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_EquivalenciaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEquivalencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        side_pane.add(btn_Equivalencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, -1));

        btn_Inicio.setBackground(new java.awt.Color(23, 35, 51));
        btn_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_InicioMousePressed(evt);
            }
        });

        ind_inicio.setOpaque(false);
        ind_inicio.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_inicioLayout = new javax.swing.GroupLayout(ind_inicio);
        ind_inicio.setLayout(ind_inicioLayout);
        ind_inicioLayout.setHorizontalGroup(
            ind_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_inicioLayout.setVerticalGroup(
            ind_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(ind_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(ind_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_InicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        side_pane.add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, -1));

        btn_Bebidas.setBackground(new java.awt.Color(23, 35, 51));
        btn_Bebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_BebidasMousePressed(evt);
            }
        });

        ind_bebidas.setOpaque(false);
        ind_bebidas.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_bebidasLayout = new javax.swing.GroupLayout(ind_bebidas);
        ind_bebidas.setLayout(ind_bebidasLayout);
        ind_bebidasLayout.setHorizontalGroup(
            ind_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_bebidasLayout.setVerticalGroup(
            ind_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnBebidas.setBackground(new java.awt.Color(23, 35, 51));
        btnBebidas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBebidas.setForeground(new java.awt.Color(255, 255, 255));
        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_wine_glass_15px.png"))); // NOI18N
        btnBebidas.setText("   Bebidas");
        btnBebidas.setBorder(null);
        btnBebidas.setBorderPainted(false);
        btnBebidas.setContentAreaFilled(false);
        btnBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBebidas.setDisabledIcon(null);
        btnBebidas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBebidas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBebidas.setPreferredSize(new java.awt.Dimension(140, 43));
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_BebidasLayout = new javax.swing.GroupLayout(btn_Bebidas);
        btn_Bebidas.setLayout(btn_BebidasLayout);
        btn_BebidasLayout.setHorizontalGroup(
            btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BebidasLayout.createSequentialGroup()
                .addComponent(ind_bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_BebidasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_BebidasLayout.setVerticalGroup(
            btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BebidasLayout.createSequentialGroup()
                .addComponent(ind_bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_BebidasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        side_pane.add(btn_Bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("BASS");
        side_pane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));
        side_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 20));

        ind_ventas.setOpaque(false);
        ind_ventas.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_ventasLayout = new javax.swing.GroupLayout(ind_ventas);
        ind_ventas.setLayout(ind_ventasLayout);
        ind_ventasLayout.setHorizontalGroup(
            ind_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_ventasLayout.setVerticalGroup(
            ind_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        side_pane.add(ind_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 220, -1, 40));

        getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 590));

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
        jLabel14.setText("Lista de Equivalencias");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addContainerGap(768, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblEquivalencias.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblEquivalencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEquivalencias.setGridColor(new java.awt.Color(255, 255, 255));
        tblEquivalencias.setRowHeight(22);
        jScrollPane1.setViewportView(tblEquivalencias);

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

        txtBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        txtBusqueda.setForeground(new java.awt.Color(71, 120, 197));
        txtBusqueda.setText("  ");
        txtBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_search_15px.png"))); // NOI18N

        btnReporte2.setBackground(new java.awt.Color(255, 255, 255));
        btnReporte2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnReporte2.setForeground(new java.awt.Color(71, 120, 197));
        btnReporte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_attendance_mark_32px.png"))); // NOI18N
        btnReporte2.setText("Reporte");
        btnReporte2.setBorder(null);
        btnReporte2.setBorderPainted(false);
        btnReporte2.setContentAreaFilled(false);
        btnReporte2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte2ActionPerformed(evt);
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
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(btnReporte2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBusqueda)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 930, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RecetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RecetasMousePressed
    }//GEN-LAST:event_btn_RecetasMousePressed

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

    private void btn_InsumosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InsumosMousePressed
    }//GEN-LAST:event_btn_InsumosMousePressed

    private void btn_EquivalenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EquivalenciaMousePressed
    }//GEN-LAST:event_btn_EquivalenciaMousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel7MousePressed

    private void btn_BebidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BebidasMousePressed
    }//GEN-LAST:event_btn_BebidasMousePressed

    private void btn_StockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_StockMousePressed
       
    }//GEN-LAST:event_btn_StockMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtBusqueda.requestFocusInWindow();
        modeloEquivalencia.establecerDatos(txtBusqueda.getText().toUpperCase().trim(),"TODOS");
    }//GEN-LAST:event_formWindowActivated

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        JFEquivalencia JFEquivalencia = new JFEquivalencia(null, "NUEVO");
        JFEquivalencia.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(tblEquivalencias.getSelectedRow()!=-1){
                
                WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea modificar?");
                alertaWarning.setVisible(true);
                
                if(alertaWarning.recibe()){

                    Equivalencia equivalencia=TablaEquivalencia.buscaEquivalencia(Integer.parseInt(tblEquivalencias.getValueAt(tblEquivalencias.getSelectedRow(), 1).toString()));

                    JFEquivalencia JFEquivalencia = new JFEquivalencia(equivalencia, "MODIFICAR");
                    JFEquivalencia.setVisible(true);

                } else {
                    new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
                }
            } else {
                new alertas.WarningAlert(this, true, "Debe seleccionar una equivalencia").setVisible(true);
            }
            
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            new alertas.ErrorAlert(this, true,"Error: "+e.getMessage()).setVisible(true);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
            if(tblEquivalencias.getSelectedRow()!=-1){
                
                WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea eliminar?");
                alertaWarning.setVisible(true);
                
                if(alertaWarning.recibe()){

                    TablaEquivalencia tab = new TablaEquivalencia();

                    if(tab.eliminarInsumo(Integer.parseInt(tblEquivalencias.getValueAt(tblEquivalencias.getSelectedRow(), 1).toString()))==1)
                        new alertas.SuccessAlert(this, true, "Equivalencia eliminada correctamente").setVisible(true);
                    else
                        new alertas.ErrorAlert(this, true, "No se pudo eliminar la equivalencia").setVisible(true);

                } else {
                    new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
                }
            } else {
                new alertas.WarningAlert(this, true, "Debe seleccionar una equivalencia").setVisible(true);
            }

        } catch (HeadlessException | NumberFormatException e) {
            new alertas.ErrorAlert(this, true,"Error: "+e.getMessage()).setVisible(true);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btn_VentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentasMousePressed
    }//GEN-LAST:event_btn_VentasMousePressed

    private void btn_InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicioMousePressed
    }//GEN-LAST:event_btn_InicioMousePressed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        JFInicio JFInicio = new JFInicio();
        this.dispose();
        JFInicio.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        JFListaDeVentas jFListaDeVentas = new JFListaDeVentas();
        this.dispose();
        jFListaDeVentas.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetasActionPerformed
        JFListaDeRecetas jFListaDeRecetas = new JFListaDeRecetas();
        this.dispose();
        jFListaDeRecetas.setVisible(true);
    }//GEN-LAST:event_btnRecetasActionPerformed

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        JFListaDeInsumos jFListaDeInsumos = new JFListaDeInsumos();
        this.dispose();
        jFListaDeInsumos.setVisible(true);
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void btnEquivalenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquivalenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEquivalenciaActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        JFListaConciliacion jFListaConciliacion = new JFListaConciliacion();
        this.dispose();
        jFListaConciliacion.setVisible(true);
    }//GEN-LAST:event_btnStockActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        modeloEquivalencia.establecerDatos(txtBusqueda.getText().toUpperCase().trim(),"TODOS");
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        JFListaDeBebidas jFListaDeBebidas = new JFListaDeBebidas();
        this.dispose();
        jFListaDeBebidas.setVisible(true);
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte2ActionPerformed
        try {

            WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea generar reporte de equivalencias?");
            alertaWarning.setVisible(true);

            if(alertaWarning.recibe()){
                /*
                GenerarReportes reporte = new GenerarReportes();
                reporte.reporte("REPORTE_BEBIDAS", null);
                */
                GenerarReportes.reportes("REPORTE_EQUIVALENCIA",0,null);
            }

        } catch (Exception e) {
            new alertas.ErrorAlert(this, true,"Hubo un error en el reporte").setVisible(true);
        }
    }//GEN-LAST:event_btnReporte2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFListaEquivalencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFListaEquivalencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFListaEquivalencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFListaEquivalencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFListaEquivalencia().setVisible(true);
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
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEquivalencia;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsumo;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecetas;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnReporte1;
    private javax.swing.JButton btnReporte2;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel btn_Bebidas;
    private javax.swing.JPanel btn_Equivalencia;
    private javax.swing.JPanel btn_Inicio;
    private javax.swing.JPanel btn_Insumos;
    private javax.swing.JPanel btn_Recetas;
    private javax.swing.JPanel btn_Stock;
    private javax.swing.JPanel btn_Ventas;
    private javax.swing.JPanel ind_bebidas;
    private javax.swing.JPanel ind_equivalencia;
    private javax.swing.JPanel ind_inicio;
    private javax.swing.JPanel ind_insumos;
    private javax.swing.JPanel ind_recetas;
    private javax.swing.JPanel ind_stock;
    private javax.swing.JPanel ind_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel side_pane;
    private javax.swing.JTable tblEquivalencias;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
