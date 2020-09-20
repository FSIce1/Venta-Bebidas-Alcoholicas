
package vistas.equivalencia;

import alertas.WarningConfirmAlert;
import beans.Equivalencia;
import beans.Insumo;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import tablas.TablaEquivalencia;
import tablas.TablaInsumo;

public class JFEquivalencia extends javax.swing.JFrame {

    private Equivalencia equivalencia;
    private String modo;
    private int id_insumo;
    
    public JFEquivalencia(Equivalencia equivalencia,String modo) {
        
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());

        setLocationRelativeTo(null);
        setResizable(false);
        
        try {
            
                List<Insumo> listaDeInsumos = TablaEquivalencia.listaInsumosSinEquivalencia();            
                DefaultComboBoxModel model = new DefaultComboBoxModel(listaDeInsumos.toArray());

                cbxInsumo.setModel(model);
            
            this.equivalencia=equivalencia;
            this.modo=modo;

            if(modo.equals("MODIFICAR")){

                this.id_insumo=equivalencia.getId_equivalencia();
                
                cbxGrupo.setSelectedIndex(equivalencia.getGrupo_equivalencia());
                
                txtPeso.setText(String.valueOf(equivalencia.getPeso_equivalencia()));
                txtPesoEnvase.setText(String.valueOf(equivalencia.getPeso_envase_equivalencia()));
                
                int pos=0;
                int id=equivalencia.getoInsumo().getId_insumo();
                
                for (int i = 0; i < listaDeInsumos.size(); i++) {

                    Insumo o = (Insumo) model.getElementAt(i);

                    if(o.getId_insumo()==id){
                        pos=i;
                        break;
                    }

                }
                
                cbxInsumo.setSelectedIndex(pos);
                
            }
        
        } catch (SQLException e) {
            new alertas.WarningAlert(this, true, "Error: "+e.getMessage()).setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        panReceta = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Cantidad = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        cbxGrupo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbxInsumo = new javax.swing.JComboBox<>();
        Cantidad1 = new javax.swing.JLabel();
        txtPesoEnvase = new javax.swing.JTextField();
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

        panReceta.setBackground(new java.awt.Color(23, 35, 51));
        panReceta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        txtPeso.setBackground(new java.awt.Color(23, 35, 51));
        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        txtPeso.setBorder(null);
        txtPeso.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        Cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(204, 204, 204));
        Cantidad.setText("Peso");

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_cancel_32px_2.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        cbxGrupo.setBackground(new java.awt.Color(23, 35, 51));
        cbxGrupo.setForeground(new java.awt.Color(0, 0, 0));
        cbxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEBIDAS INSUMOS", "LICORES INSUMOS", "OTROS INSUMOS" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Grupo");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Insumo");

        cbxInsumo.setBackground(new java.awt.Color(23, 35, 51));
        cbxInsumo.setForeground(new java.awt.Color(0, 0, 0));

        Cantidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cantidad1.setForeground(new java.awt.Color(204, 204, 204));
        Cantidad1.setText("Peso Envase");

        txtPesoEnvase.setBackground(new java.awt.Color(23, 35, 51));
        txtPesoEnvase.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPesoEnvase.setForeground(new java.awt.Color(255, 255, 255));
        txtPesoEnvase.setBorder(null);
        txtPesoEnvase.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPesoEnvase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoEnvaseKeyTyped(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panRecetaLayout = new javax.swing.GroupLayout(panReceta);
        panReceta.setLayout(panRecetaLayout);
        panRecetaLayout.setHorizontalGroup(
            panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecetaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cantidad)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(Cantidad1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPesoEnvase)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPeso)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRecetaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panRecetaLayout.setVerticalGroup(
            panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbxInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cantidad)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cantidad1)
                    .addComponent(txtPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        char c=evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.') || txtPeso.getText().length()==10) {
            evt.consume();
        }

        if (c == '.' && txtPeso.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            if(presentarDatos()){

                WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea "+(modo.equals("NUEVO")?"registar":"modificar")+" datos?");
                alertaWarning.setVisible(true);

                if(alertaWarning.recibe()){

                    TablaEquivalencia ta=new TablaEquivalencia();
                    equivalencia= new Equivalencia();

                    int resultado;

                    equivalencia.setGrupo_equivalencia(cbxGrupo.getSelectedIndex());
                    equivalencia.setoInsumo((Insumo)cbxInsumo.getSelectedItem());
                    equivalencia.setPeso_equivalencia(Double.parseDouble(txtPeso.getText()));
                    equivalencia.setPeso_envase_equivalencia(Double.parseDouble(txtPesoEnvase.getText()));

                    if(modo.equals("NUEVO")){
                        resultado=ta.insertarEquivalencia(equivalencia);
                    } else {
                        equivalencia.setId_equivalencia(id_insumo);
                        resultado=ta.modificarEquivalencia(equivalencia);
                    }

                    this.dispose();

                    if(resultado==1)
                            new alertas.SuccessAlert(this, true, ("La equivalencia fue "+(modo.equals("NUEVO")?"registrada":"modificada")+" correctamente")).setVisible(true);
                        else
                            new alertas.ErrorAlert(this, true, ("La equivalencia no pudo ser "+(modo.equals("NUEVO")?"registrada":"modificada"))).setVisible(true);

                } else {
                    new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
                }
            }
        } catch (NumberFormatException e) {
            new alertas.ErrorAlert(this, true,"Error: "+e.getMessage()).setVisible(true);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPesoEnvaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoEnvaseKeyTyped
        char c=evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.') || txtPeso.getText().length()==10) {
            evt.consume();
        }

        if (c == '.' && txtPeso.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoEnvaseKeyTyped

    private boolean presentarDatos(){
            
        if(cbxInsumo.getSelectedIndex()==-1){
            new alertas.WarningAlert(this, true, "Debe seleccionar un isumo").setVisible(true);
            cbxInsumo.requestFocusInWindow();
            return false;
        } else if(txtPeso.getText().equals("")){
            new alertas.WarningAlert(this, true, "Debe ingresar el peso").setVisible(true);
            txtPeso.requestFocusInWindow();
            return false;
        } else if(txtPeso.getText().equals(".")){
            new alertas.WarningAlert(this, true, "No permitido, ingrese una cantidad correcta").setVisible(true);
            txtPeso.requestFocusInWindow();
            return false;
        } else if(txtPesoEnvase.getText().equals("")){
            new alertas.WarningAlert(this, true, "Debe ingresar el peso del envase").setVisible(true);
            txtPesoEnvase.requestFocusInWindow();
            return false;
        } else if(txtPesoEnvase.getText().equals(".")){
            new alertas.WarningAlert(this, true, "No permitido, ingrese una cantidad correcta").setVisible(true);
            txtPesoEnvase.requestFocusInWindow();
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
    private javax.swing.JComboBox<String> cbxGrupo;
    private javax.swing.JComboBox<String> cbxInsumo;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPanel panReceta;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPesoEnvase;
    // End of variables declaration//GEN-END:variables
}
