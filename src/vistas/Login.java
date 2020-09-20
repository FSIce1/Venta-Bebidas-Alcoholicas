
package vistas;

import beans.Usuario;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tablas.TablaUsuario;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/bass.png")).getImage());
        
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnImgresar = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(36, 47, 65));
        jPanel5.setPreferredSize(new java.awt.Dimension(901, 550));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BASS");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 189, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Usuario");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Contraseña");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 270, 10));

        txtContraseña.setBackground(new java.awt.Color(36, 47, 65));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setText("jPasswordField1");
        txtContraseña.setBorder(null);
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
        });
        jPanel5.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, 30));

        txtUsuario.setBackground(new java.awt.Color(36, 47, 65));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Ingrese su cuenta");
        txtUsuario.setBorder(null);
        txtUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel5.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 270, 30));

        btnImgresar.setBackground(new java.awt.Color(97, 212, 195));
        btnImgresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnImgresar.setForeground(new java.awt.Color(255, 255, 255));
        btnImgresar.setLabel("Ingresar");
        btnImgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgresarActionPerformed(evt);
            }
        });
        jPanel5.add(btnImgresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 148, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_cancel_32px_2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        // TODO add your handling code here:
        txtContraseña.setText("");
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        // TODO add your handling code here:
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void btnImgresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgresarActionPerformed
        try {
        
            if (validarDatos()) {

                if(TablaUsuario.existeUser(txtUsuario.getText(), "")==1){

                    Usuario user = TablaUsuario.buscaUsuario(-1,txtUsuario.getText(),txtContraseña.getText());

                    if(user!=null){
                     
                        //Admi admi=new Admi(user); // establecemos admi
                        
                        this.dispose();
                        new vistas.JFInicio().setVisible(true);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Acceso Denegado", "Mensaje del sistema", JOptionPane.WARNING_MESSAGE);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Mensaje del sistema", JOptionPane.WARNING_MESSAGE);
                }

            }    

        } catch (HeadlessException | SQLException e) {
            e.getStackTrace();
        }
    }//GEN-LAST:event_btnImgresarActionPerformed

    
    private boolean validarDatos() {

        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario", "Mensaje del sistema", JOptionPane.WARNING_MESSAGE);
            txtUsuario.requestFocusInWindow();
            return false;
        } else if (txtContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña", "Mensaje del sistema", JOptionPane.WARNING_MESSAGE);
            txtContraseña.requestFocusInWindow();
            return false;
        }

        return true;

    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnImgresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
