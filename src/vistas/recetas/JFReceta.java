
package vistas.recetas;

import alertas.WarningConfirmAlert;
import beans.Insumo;
import beans.Receta;
import beans.Trago;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import tablas.TablaInsumo;
import tablas.TablaReceta;
import tablas.TablaTrago;

public class JFReceta extends javax.swing.JFrame {

    private Receta receta;
    private String modo;
    private int id_receta;
    
    public JFReceta(Receta receta,String modo) {
        
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());

        setLocationRelativeTo(null);
        setResizable(false);
        
        try {
            
                List<Trago> listaDeTragos = TablaTrago.listaTragos();            
                DefaultComboBoxModel model = new DefaultComboBoxModel(listaDeTragos.toArray());

                cbxBebida.setModel(model);
                
                List<Insumo> listaDeInsumos = TablaInsumo.listaInsumos();            
                DefaultComboBoxModel model2 = new DefaultComboBoxModel(listaDeInsumos.toArray());

                cbxInsumo.setModel(model2);

            
            this.receta=receta;
            this.modo=modo;

            if(modo.equals("MODIFICAR")){

                this.id_receta=receta.getId_receta();
                
                txtCantidad.setText(String.valueOf(receta.getCantidad_receta()));
                cbxUnidadMedida.setSelectedIndex(receta.getUm_receta());
                
                int pos=0;
                int id=receta.getoTrago().getId_trago();

                for (int i = 0; i < listaDeTragos.size(); i++) {

                    Trago o = (Trago) model.getElementAt(i);

                    if(o.getId_trago()==id){
                        pos=i;
                        break;
                    }

                }

                cbxBebida.setSelectedIndex(pos);
                
                
                pos=0;
                id=receta.getoInsumo().getId_insumo();
                
                for (int j = 0; j < listaDeInsumos.size(); j++) {

                    Insumo o = (Insumo) model2.getElementAt(j);

                    if(o.getId_insumo()==id){
                        pos=j;
                        break;
                    }

                }
                
                cbxInsumo.setSelectedIndex(pos);
                
            }
        
        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        panReceta = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        cbxBebida = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Cantidad = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbxInsumo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbxUnidadMedida = new javax.swing.JComboBox<>();

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

        cbxBebida.setBackground(new java.awt.Color(23, 35, 51));
        cbxBebida.setForeground(new java.awt.Color(0, 0, 0));
        cbxBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

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

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        Cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(204, 204, 204));
        Cantidad.setText("Cantidad");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Bebida");

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_cancel_32px_2.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Insumo");

        cbxInsumo.setBackground(new java.awt.Color(23, 35, 51));
        cbxInsumo.setForeground(new java.awt.Color(0, 0, 0));
        cbxInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Unidad de Medida");

        cbxUnidadMedida.setBackground(new java.awt.Color(23, 35, 51));
        cbxUnidadMedida.setForeground(new java.awt.Color(0, 0, 0));
        cbxUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ONZ", "UND", "ML" }));

        javax.swing.GroupLayout panRecetaLayout = new javax.swing.GroupLayout(panReceta);
        panReceta.setLayout(panRecetaLayout);
        panRecetaLayout.setHorizontalGroup(
            panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecetaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRecetaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(212, 425, Short.MAX_VALUE))
                    .addGroup(panRecetaLayout.createSequentialGroup()
                        .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(Cantidad)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panRecetaLayout.createSequentialGroup()
                                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardar)
                                    .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCantidad)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panRecetaLayout.createSequentialGroup()
                                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        panRecetaLayout.setVerticalGroup(
            panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(19, 19, 19)
                .addGroup(panRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c=evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.') || txtCantidad.getText().length()==10) {
            evt.consume();
        }

        if (c == '.' && txtCantidad.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if(presentarDatos()){
            
            WarningConfirmAlert alertaWarning = new WarningConfirmAlert(this, true, "¿Desea "+(modo.equals("NUEVO")?"registar":"modificar")+" datos?");
            alertaWarning.setVisible(true);
                
            if(alertaWarning.recibe()){

                TablaReceta ta=new TablaReceta();
                receta= new Receta();

                int resultado;

                receta.setoTrago((Trago)(cbxBebida.getSelectedItem()));
                receta.setoInsumo((Insumo)(cbxInsumo.getSelectedItem()));
                receta.setCantidad_receta((double)Math.round(Double.parseDouble(txtCantidad.getText()) * 100d) / 100d);
                receta.setUm_receta(cbxUnidadMedida.getSelectedIndex());
                
                if(modo.equals("NUEVO")){
                    resultado=ta.InsertarReceta(receta);
                } else {
                    receta.setId_receta(id_receta);
                    resultado=ta.ModificarReceta(receta);
                }

                this.dispose();
                
                if(resultado==1)
                    new alertas.SuccessAlert(this, true, ("La receta fue "+(modo.equals("NUEVO")?"registrada":"modificada")+" correctamente")).setVisible(true);
                else
                    new alertas.ErrorAlert(this, true, ("La receta no pudo ser "+(modo.equals("NUEVO")?"registrada":"modificada"))).setVisible(true);

            } else {
                new alertas.WarningAlert(this, true, "Operación Cancelada").setVisible(true);
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean presentarDatos(){
            
        if(cbxBebida.getSelectedIndex()==-1){
            new alertas.WarningAlert(this, true, "Debe seleccionar una bebida").setVisible(true);
            cbxBebida.requestFocusInWindow();
            return false;
        } else if(cbxInsumo.getSelectedIndex()==-1){
            new alertas.WarningAlert(this, true, "Debe seleccionar un insumo").setVisible(true);
            cbxInsumo.requestFocusInWindow();
            return false;
        } else if(cbxUnidadMedida.getSelectedIndex()==-1){
            new alertas.WarningAlert(this, true, "Debe seleccionar una unidad").setVisible(true);
            cbxUnidadMedida.requestFocusInWindow();
            return false;
        } else if(txtCantidad.getText().equals("")){
            new alertas.WarningAlert(this, true, "Debe ingresar la cantidad que hay en el stock").setVisible(true);
            txtCantidad.requestFocusInWindow();
            return false;
        } else if(txtCantidad.getText().equals(".")){
            new alertas.WarningAlert(this, true, "No permitido, ingrese una cantidad correcta").setVisible(true);
            txtCantidad.requestFocusInWindow();
            return false;
        }  else {
            Insumo ins = (Insumo) (cbxInsumo.getSelectedItem());
            
            if(ins.getUm_insumo()!=cbxUnidadMedida.getSelectedIndex()){
                if(ins.getUm_insumo()==2 && cbxUnidadMedida.getSelectedIndex()==0){
                } else if(ins.getUm_insumo()==0 && cbxUnidadMedida.getSelectedIndex()==2){
                } else {
                    int numero;
                    String mensaje="";
                    String unidadInsumo="";
                    String unidadSeleccionada="";
                    
                    for (int i = 0; i < 2; i++) {
                        
                        numero = (i==0)?ins.getUm_insumo():cbxUnidadMedida.getSelectedIndex();
                        
                        switch(numero){
                            case 0:
                                mensaje="ONZ";
                                break;
                            case 1:
                                mensaje="UND";
                                break;
                            case 2:
                                mensaje = "ML";
                                break;
                        }  
                        
                        if(i==0)
                            unidadInsumo=mensaje;
                        else 
                            unidadSeleccionada=mensaje;
                            
                    }
                    
                    
                    new alertas.WarningAlert(this, true, "No se puede convertir "+unidadInsumo+" a "+unidadSeleccionada).setVisible(true);
                    cbxUnidadMedida.requestFocusInWindow();
                    return false;
                }   
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
    private javax.swing.JLabel Cantidad;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxBebida;
    private javax.swing.JComboBox<String> cbxInsumo;
    private javax.swing.JComboBox<String> cbxUnidadMedida;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPanel panReceta;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
