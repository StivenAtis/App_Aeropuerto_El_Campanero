package View;

/**
 *
 * @author Booh
 */
public class pnlFlightQuery extends javax.swing.JPanel {

    public pnlFlightQuery() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCodigoVuelo = new javax.swing.JTextField();
        lbCdigoVuelo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        lbCdigoVuelo3 = new javax.swing.JLabel();
        lbCdigoVuelo2 = new javax.swing.JLabel();
        lbCdigoVuelo4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAInfoAdicional = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAInfoSolicitud = new javax.swing.JTextArea();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfCodigoVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 270, 40));

        lbCdigoVuelo1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo1.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo1.setText("Información adicional");
        lbCdigoVuelo1.setToolTipText("");
        add(lbCdigoVuelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 260, 40));

        tblCustomers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Clase", "Fecha", "Hora", "Destino", "Estado de solicitud"
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
        tblCustomers.setColumnSelectionAllowed(true);
        tblCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomers);
        tblCustomers.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblCustomers.getColumnModel().getColumnCount() > 0) {
            tblCustomers.getColumnModel().getColumn(0).setResizable(false);
            tblCustomers.getColumnModel().getColumn(1).setResizable(false);
            tblCustomers.getColumnModel().getColumn(2).setResizable(false);
            tblCustomers.getColumnModel().getColumn(3).setResizable(false);
            tblCustomers.getColumnModel().getColumn(4).setResizable(false);
            tblCustomers.getColumnModel().getColumn(5).setResizable(false);
            tblCustomers.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 1150, 50));

        lbCdigoVuelo3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo3.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo3.setText("Datos de vuelo");
        lbCdigoVuelo3.setToolTipText("");
        add(lbCdigoVuelo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 200, 40));

        lbCdigoVuelo2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo2.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo2.setText("Codigo vuelo solicitado");
        lbCdigoVuelo2.setToolTipText("");
        add(lbCdigoVuelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 200, 40));

        lbCdigoVuelo4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo4.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo4.setText("Información sobre solicitud");
        lbCdigoVuelo4.setToolTipText("");
        add(lbCdigoVuelo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 270, 40));

        txtAInfoAdicional.setColumns(20);
        txtAInfoAdicional.setRows(5);
        txtAInfoAdicional.setFocusable(false);
        jScrollPane3.setViewportView(txtAInfoAdicional);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 1150, 170));

        txtAInfoSolicitud.setColumns(20);
        txtAInfoSolicitud.setRows(5);
        txtAInfoSolicitud.setFocusable(false);
        jScrollPane2.setViewportView(txtAInfoSolicitud);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 1150, 170));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_min.png"))); // NOI18N
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_min.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_max.png"))); // NOI18N
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 330, 120));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 330, 120));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consulta de vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void tblCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomersMouseClicked
        int row = tblCustomers.getSelectedRow();
        String id = tblCustomers.getValueAt(row, 0).toString();

        //        CustomerVO customer = controller.read(Integer.parseInt(id));

        //        if(customer.getId() > 0) {
            //            txtCustomerID.setText(String.valueOf(customer.getId()));
            //            txtName.setText(customer.getName());
            //            txtLastname.setText(customer.getLastname());
            //            txtAddress.setText(customer.getAddress());
            //            txtPhone.setText(customer.getPhone());
            //            txtEmail.setText(customer.getEmail());
            //        }
    }//GEN-LAST:event_tblCustomersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCdigoVuelo1;
    private javax.swing.JLabel lbCdigoVuelo2;
    private javax.swing.JLabel lbCdigoVuelo3;
    private javax.swing.JLabel lbCdigoVuelo4;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField tfCodigoVuelo;
    private javax.swing.JTextArea txtAInfoAdicional;
    private javax.swing.JTextArea txtAInfoSolicitud;
    // End of variables declaration//GEN-END:variables
}
