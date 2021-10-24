package View;

/**
 *
 * @author Booh
 */
public class pnlUpdateUserAirline extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    public pnlUpdateUserAirline() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btActualizar = new javax.swing.JButton();
        jcbMostrar = new javax.swing.JCheckBox();
        pswPasswordConfirmed = new javax.swing.JPasswordField();
        lb8 = new javax.swing.JLabel();
        pswPassword = new javax.swing.JPasswordField();
        lb7 = new javax.swing.JLabel();
        tfNombres = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        lb6 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        tfIdentificacion = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        lbUsuario = new javax.swing.JLabel();
        lbBanner = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btActualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/actualizar_min.png"))); // NOI18N
        btActualizar.setContentAreaFilled(false);
        btActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/actualizar_min.png"))); // NOI18N
        btActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/actualizar_max.png"))); // NOI18N
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });
        add(btActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 320, 120));

        jcbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMostrarActionPerformed(evt);
            }
        });
        add(jcbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, -1, -1));

        pswPasswordConfirmed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(pswPasswordConfirmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 390, 40));

        lb8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb8.setForeground(new java.awt.Color(255, 255, 255));
        lb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb8.setText("Confirmar contraseña");
        lb8.setToolTipText("");
        add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 390, 40));

        pswPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswPasswordActionPerformed(evt);
            }
        });
        add(pswPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 390, 40));

        lb7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb7.setText("Contraseña");
        lb7.setToolTipText("");
        add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 390, 40));

        tfNombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 390, 40));

        lb4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4.setText("Nombres");
        lb4.setToolTipText("");
        add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 390, 40));

        tfApellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 390, 40));

        lb5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb5.setText("Apellidos");
        lb5.setToolTipText("");
        add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 390, 40));

        tfUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, 340, 40));

        lb6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb6.setText("Nombre de usuario");
        lb6.setToolTipText("");
        add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 330, 40));

        tfTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 340, 40));

        lb3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("Telefono");
        lb3.setToolTipText("");
        add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 340, 40));

        tfEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 390, 40));

        lb2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("Email");
        lb2.setToolTipText("");
        add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 390, 40));

        tfIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 390, 40));

        lb1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Número de Identificación");
        lb1.setToolTipText("");
        add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 390, 40));

        tblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero Identificación", "Nombres", "Apellidos", "Telefono", "Email", "Nombre Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 1160, 60));

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Datos de usuario");
        lbUsuario.setToolTipText("");
        add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, 40));

        lbBanner.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        lbBanner.setForeground(new java.awt.Color(255, 255, 255));
        lbBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanner.setText("Actualizar usuario");
        add(lbBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline_Adiministration.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed

    }//GEN-LAST:event_btActualizarActionPerformed

    //--------------------------------------------------------------------------
    
    private void jcbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMostrarActionPerformed

        if (jcbMostrar.isSelected()) {
            pswPassword.setEchoChar((char) 0);
            pswPasswordConfirmed.setEchoChar((char) 0);
        } else {
            pswPassword.setEchoChar('*');
            pswPasswordConfirmed.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarActionPerformed

    //--------------------------------------------------------------------------
    
    private void pswPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswPasswordActionPerformed

    //--------------------------------------------------------------------------
    
    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        int row = tblUsuario.getSelectedRow();
        String id = tblUsuario.getValueAt(row, 0).toString();

    }//GEN-LAST:event_tblUsuarioMouseClicked

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbMostrar;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBanner;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JPasswordField pswPasswordConfirmed;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIdentificacion;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
    //--------------------------------------------------------------------------
}
