
package vistas.bebidas;

import alertas.WarningConfirmAlert;
import beans.Trago;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import tablas.TablaTrago;

public class JFBebida extends javax.swing.JFrame {

    private Trago trago;
    private String modo;
    private int id_trago;
    
    public JFBebida(Trago trago,String modo) {
        
        initComponents();        
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());

        setLocationRelativeTo(null);
        setResizable(false);
        
        try {
            
            this.trago=trago;
            this.modo=modo;

            if(modo.equals("MODIFICAR")){

                this.id_trago=trago.getId_trago();
                
                txtDescripcion.setText(trago.getDescripcion_trago());
                txtCodigo.setText(trago.getId_cod_trago());
                txtCosto.setText(String.valueOf(trago.getCosto_trago()));
                txtCantidad.setText(String.valueOf(trago.getCantidad_trago()));
                cbxUnidadMedida.setSelectedIndex(trago.getUnidadmd_trago());
                
                btnGuardar.setText("Modificar");
                
            }
        
        } catch (Exception e) {            
            new alertas.WarningAlert(this, true, "Error: "+e.getMessage()).setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        panBebida = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        cbxUnidadMedida = new javax.swing.JComboBox<>();
        Cantidad1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

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

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_save_32px_2.png"))); // NOI18N
        btnGuardar.setMnemonic(new Character('G'));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(23, 35, 51));
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBorder(null);
        txtDescripcion.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

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

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Descripción");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Código");

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_cancel_32px_2.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        Cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(204, 204, 204));
        Cantidad.setText("Costo");

        txtCosto.setBackground(new java.awt.Color(23, 35, 51));
        txtCosto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(255, 255, 255));
        txtCosto.setBorder(null);
        txtCosto.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Unida de Medida");

        cbxUnidadMedida.setBackground(new java.awt.Color(23, 35, 51));
        cbxUnidadMedida.setForeground(new java.awt.Color(0, 0, 0));
        cbxUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ONZ", "UND" }));

        Cantidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cantidad1.setForeground(new java.awt.Color(204, 204, 204));
        Cantidad1.setText("Cantidad");

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

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panBebidaLayout = new javax.swing.GroupLayout(panBebida);
        panBebida.setLayout(panBebidaLayout);
        panBebidaLayout.setHorizontalGroup(
            panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBebidaLayout.createSequentialGroup()
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panBebidaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(panBebidaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(Cantidad)
                            .addComponent(Cantidad1)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBebidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panBebidaLayout.setVerticalGroup(
            panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cantidad)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            if(presentarDatos()){

                if(TablaTrago.existeTrago(txtCodigo.getText())!=1 || modo.equals("MODIFICAR")){
                    WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea "+(modo.equals("NUEVO")?"registar":"modificar")+" datos?");
                    alertaWarning.setVisible(true);

                    if(alertaWarning.recibe()){

                        TablaTrago ta=new TablaTrago();
                        trago= new Trago();

                        int resultado;

                        trago.setDescripcion_trago(txtDescripcion.getText());
                        trago.setId_cod_trago(txtCodigo.getText());
                        trago.setCosto_trago((double)Math.round(Double.parseDouble(txtCosto.getText()) * 100d) / 100d);
                        trago.setCantidad_trago((double)Math.round(Double.parseDouble(txtCantidad.getText()) * 100d) / 100d);
                        trago.setUnidadmd_trago(cbxUnidadMedida.getSelectedIndex());

                        if(modo.equals("NUEVO")){
                            resultado=ta.insertarTrago(trago);
                        } else {
                            trago.setId_trago(id_trago);
                            resultado=ta.modificarTrago(trago);
                        }

                        this.dispose();

                        if(resultado==1)
                            new alertas.SuccessAlert(this, true, ("La bebida fue "+(modo.equals("NUEVO")?"registrada":"modificada")+" correctamente")).setVisible(true);
                        else
                            new alertas.ErrorAlert(this, true, ("La bebida no pudo ser "+(modo.equals("NUEVO")?"registrada":"modificada"))).setVisible(true);

                    } else {
                        new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
                    }    
                } else {
                    new alertas.WarningAlert(this, true, "Este código ya existe, ingrese otro").setVisible(true);
                }
                
            }    
        } catch (NumberFormatException | SQLException e) {
            new alertas.ErrorAlert(this, true,"Error: "+e.getMessage()).setVisible(true);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length()==255)
            evt.consume();
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c=evt.getKeyChar();
        
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && ((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z')) || txtCodigo.getText().length()==10) {
        evt.consume();
        }
        
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char c=evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.') || txtCosto.getText().length()==10) {
            evt.consume();
        }

        if (c == '.' && txtCosto.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c=evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.') || txtCantidad.getText().length()==10) {
            evt.consume();
        }

        if (c == '.' && txtCantidad.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private boolean presentarDatos(){
            
        if(txtDescripcion.getText().equals("")){
            new alertas.WarningAlert(this, true, "Debe ingresar una descripción de la bebida").setVisible(true);
            txtDescripcion.requestFocusInWindow();
            return false;
        } else if(txtCodigo.getText().equals("")){           
            new alertas.WarningAlert(this, true, "Debe ingresar el código de la bebida").setVisible(true);
            txtCodigo.requestFocusInWindow();
            return false;
        } else if(txtCosto.getText().equals("")){
            new alertas.WarningAlert(this, true, "Debe ingresar el costo de la bebida").setVisible(true);
            txtCosto.requestFocusInWindow();
            return false;
        } else if(txtCosto.getText().equals(".")){
            new alertas.WarningAlert(this, true, "No permitido, ingrese un costo correcto").setVisible(true);
            txtCosto.requestFocusInWindow();
            return false;
        } else if(txtCantidad.getText().equals("")){
            new alertas.WarningAlert(this, true, "Debe ingresar la cantidad que hay en el stock").setVisible(true);
            txtCantidad.requestFocusInWindow();
            return false;
        } else if(txtCantidad.getText().equals(".")){
            new alertas.WarningAlert(this, true, "No permitido, ingrese una cantidad correcta").setVisible(true);
            txtCantidad.requestFocusInWindow();
            return false;
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
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Cantidad1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxUnidadMedida;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPanel panBebida;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
