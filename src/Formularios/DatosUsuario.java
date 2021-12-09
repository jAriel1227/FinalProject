package Formularios;


import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import Class.ClassConectar;
import Class.Usuarios;
import Class.SerUsuarios;

/**
 *
 * @author Johanly Baez
 * 
 */
public class DatosUsuario extends javax.swing.JFrame {

    /**
     * Creates new form DatosUsuario
     */
    private DefaultTableModel modelo;

    public DatosUsuario() {
        initComponents();
        LlenarTabla(); //Al abrir el forms este metodo llena los datos de la tabla...
        this.setLocationRelativeTo(null);//Hacemos que el formulario inicie en el centro de la pantalla...
    }

    private void eliminarUsuario() {
        int n = JOptionPane.showConfirmDialog(
                this,
                "¿Estas seguro que quieres eliminar este 'USUARIO'?",
                "Mensaje",
                JOptionPane.YES_NO_OPTION);
        Usuarios us = new Usuarios();
        SerUsuarios su = new SerUsuarios();
        int filaseleccionada = jTable1.getSelectedRow();
        us.Id = Integer.valueOf(modelo.getValueAt(filaseleccionada, 0).toString());

        if (n == JOptionPane.YES_OPTION) {
            if (su.eliminarUs(us) == true) {
                JOptionPane.showMessageDialog(this, "Eliminado Correctamente",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                LlenarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Ocurrio un error",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {

        }
    }
    //Metodo para reflejar los datos en el fotmulario... 
    public void LlenarTabla() {
        Usuarios user = new Usuarios();
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        ClassConectar conexion = new ClassConectar();
        try {
            ResultSet set = null;
            PreparedStatement state = conexion.Conexion().prepareStatement("SELECT * FROM usuarios");
            set = state.executeQuery();

            while (set.next()) {
                user.Id = set.getInt(1);
                user.Nombre = set.getString(2);
                user.Apellido = set.getString(3);
                user.Usuario = set.getString(4);
                user.Contraseña = set.getString(5);
                user.Telefono = set.getString(6);
                user.Correo = set.getString(7);
                modelo.addRow(new Object[]{user.Id, user.Nombre, user.Apellido, user.Usuario, user.Contraseña, user.Telefono, user.Correo});
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        BtneEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Nombre", "Apellido", "Telefono", "Correo", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(9, 0, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        BtneEditar.setBackground(new java.awt.Color(255, 255, 255));
        BtneEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtneEditar.setForeground(new java.awt.Color(9, 0, 255));
        BtneEditar.setText("Actualizar");
        BtneEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(9, 0, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion De Los Usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BtneEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtneEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAtras))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarUsuario();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void BtneEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneEditarActionPerformed
        Llenar();
    }//GEN-LAST:event_BtneEditarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        Menu princ = new Menu();
        princ.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void Llenar() {
        Registrar registro = new Registrar();
        int filaseleccionada = jTable1.getSelectedRow();
        if (filaseleccionada >= 0) {
            this.dispose();
            registro.ID = Integer.valueOf(modelo.getValueAt(filaseleccionada, 0).toString());
            registro.txtUsuario.setText(modelo.getValueAt(filaseleccionada, 1).toString());
            registro.txtNombre.setText(modelo.getValueAt(filaseleccionada, 2).toString());
            registro.txtApellido.setText(modelo.getValueAt(filaseleccionada, 3).toString());
            registro.txtTelefono.setText(modelo.getValueAt(filaseleccionada, 4).toString());
            registro.txtCorreo.setText(modelo.getValueAt(filaseleccionada, 5).toString());
            registro.txtContraseña.setText(modelo.getValueAt(filaseleccionada, 6).toString());
            registro.txtConfirmContraseña.setText(modelo.getValueAt(filaseleccionada, 6).toString());
            registro.editar = true;
            registro.btnRegistrar.setText("Editar");
            registro.setVisible(true);
            LlenarTabla();
        }

    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtneEditar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
