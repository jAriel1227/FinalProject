package Formularios;

import javax.swing.JOptionPane;
import Class.Productos;
import Class.SerProductos;

/**
 *
 * @author Johanly Baez
 * 
 */
public class RegistroProductos extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public int ID;
    public boolean editar;

    public RegistroProductos() {
        initComponents();
        this.setLocationRelativeTo(null);//Inicia el forms en el centro de la pantalla...
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del producto:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca del producto:");

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoria del producto:");

        txtCategoria.setBackground(new java.awt.Color(255, 255, 255));
        txtCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(0, 0, 0));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));

        BtnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(9, 0, 255));
        BtnGuardar.setText("Guardar");
        BtnGuardar.setToolTipText("");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(9, 0, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnAtras.setBackground(new java.awt.Color(255, 255, 255));
        BtnAtras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnAtras.setForeground(new java.awt.Color(9, 0, 255));
        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtPrecio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnGuardar)
                        .addGap(58, 58, 58)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        this.dispose();
        DatosProducto list = new DatosProducto();
        list.LlenarTabla();
        list.setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int n = JOptionPane.showConfirmDialog(
                this,
                "¿Estas seguro de que quiere eliminar este producto?",
                "Mensaje",
                JOptionPane.YES_NO_OPTION);
        Productos prod = new Productos();
        SerProductos sp = new SerProductos();

        prod.IdProductos = ID;

        if (n == JOptionPane.YES_OPTION) {
            if (sp.eliminarProductos(prod) == true) {
                JOptionPane.showMessageDialog(this, "Eliminado Correctamente",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                DatosProducto list = new DatosProducto();
                list.LlenarTabla();
                list.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Ocurrio un error",
                        "Error", JOptionPane.ERROR_MESSAGE);
                DatosProducto list = new DatosProducto();
                list.LlenarTabla();
                list.setVisible(true);
            }
        } else {

        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (txtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Inserta un nombre", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtMarca.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Inserta una Marca", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtCategoria.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Inserta una Categoria", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtPrecio.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Inserta un precio", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtCantidad.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Inserta un stock", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (editar == true) {
                editarProductos();
                LimpiarCampos();
                DatosProducto list = new DatosProducto();
                list.LlenarTabla();
                this.dispose();
                list.setVisible(true);
            } else {
                agregarProductos();
                LimpiarCampos();
                DatosProducto list = new DatosProducto();
                list.LlenarTabla();
                this.dispose();
                list.setVisible(true);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed
   
    //Este metodo limpia todos los campos del forms...
    private void LimpiarCampos() {
        txtNombre.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        txtCategoria.setText("");
        txtCantidad.setText("");
    }

    private void editarProductos() {
        Productos prod = new Productos();
        SerProductos sp = new SerProductos();
        prod.IdProductos = ID;
        prod.NombreProductos = txtNombre.getText();
        prod.MarcaProductos = txtMarca.getText();
        prod.CategoriaProductos = txtCategoria.getText();
        prod.PrecioProducto = Integer.valueOf(txtPrecio.getText());
        prod.CantidadProducto = Integer.valueOf(txtCantidad.getText());
        sp.editarProducto(prod);
        LimpiarCampos();
    }

    private void agregarProductos() {
        BtnEliminar.setVisible(false);
        BtnGuardar.setText("Guardar");
        Productos prod = new Productos();
        SerProductos sp = new SerProductos();
        prod.IdProductos = 0;
        prod.NombreProductos = txtNombre.getText();
        prod.MarcaProductos = txtMarca.getText();
        prod.CategoriaProductos = txtCategoria.getText();
        prod.PrecioProducto = Integer.valueOf(txtPrecio.getText());
        prod.CantidadProducto = Integer.valueOf(txtCantidad.getText());
        sp.registroProductos(prod);
        LimpiarCampos();
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
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    public javax.swing.JButton BtnEliminar;
    public javax.swing.JButton BtnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCategoria;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
