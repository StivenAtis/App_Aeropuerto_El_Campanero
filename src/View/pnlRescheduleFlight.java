package View;

/**
 *
 * @author Booh
 */
public class pnlRescheduleFlight extends javax.swing.JPanel {

    public pnlRescheduleFlight() {
        initComponents();
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        lbVueloS3 = new javax.swing.JLabel();
        comboBoxMonthFirst = new javax.swing.JComboBox<>();
        comboBoxDayFirst = new javax.swing.JComboBox<>();
        comboBoxYearFirst = new javax.swing.JComboBox<>();
        lbVueloS8 = new javax.swing.JLabel();
        comboBoxHourFirst = new javax.swing.JComboBox<>();
        comboBoxMinutesFirst = new javax.swing.JComboBox<>();
        lbPistaA = new javax.swing.JLabel();
        comboBoxPistaAterrizaje = new javax.swing.JComboBox<>();
        lbPistaD = new javax.swing.JLabel();
        comboBoxPistaDespegue = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaReprogramacion = new javax.swing.JTextArea();
        btnReprogramar = new javax.swing.JButton();
        lbVueloS9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lbVueloS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Clase", "Fecha", "Hora", "Destino", "Pista Despegue", "Pista Aterrizaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1160, 190));

        lbVueloS3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS3.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS3.setText("Registrar fecha");
        lbVueloS3.setToolTipText("");
        add(lbVueloS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 400, 40));

        comboBoxMonthFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonthFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        add(comboBoxMonthFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 120, 40));

        comboBoxDayFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDayFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(comboBoxDayFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 120, 40));

        comboBoxYearFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYearFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        add(comboBoxYearFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 120, 40));

        lbVueloS8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS8.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS8.setText("Motivo de reprogramación");
        lbVueloS8.setToolTipText("");
        add(lbVueloS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, 330, 40));

        comboBoxHourFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHourFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        add(comboBoxHourFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 120, 40));

        comboBoxMinutesFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutesFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(comboBoxMinutesFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 120, 40));

        lbPistaA.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPistaA.setForeground(new java.awt.Color(255, 255, 255));
        lbPistaA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPistaA.setText("Pista de aterrizaje");
        lbPistaA.setToolTipText("");
        add(lbPistaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 360, 50));

        comboBoxPistaAterrizaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        add(comboBoxPistaAterrizaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 360, 40));

        lbPistaD.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPistaD.setForeground(new java.awt.Color(255, 255, 255));
        lbPistaD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPistaD.setText("Pista de despegue");
        lbPistaD.setToolTipText("");
        add(lbPistaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 360, 50));

        comboBoxPistaDespegue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        add(comboBoxPistaDespegue, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 360, 40));

        txtAreaReprogramacion.setColumns(20);
        txtAreaReprogramacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaReprogramacion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 330, 160));

        btnReprogramar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramar_min.png"))); // NOI18N
        btnReprogramar.setContentAreaFilled(false);
        btnReprogramar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramar_min.png"))); // NOI18N
        btnReprogramar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprograr_max.png"))); // NOI18N
        add(btnReprogramar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 330, 110));

        lbVueloS9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS9.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS9.setText("Registrar Hora");
        lbVueloS9.setToolTipText("");
        add(lbVueloS9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 260, 40));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 330, 110));

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Vuelos Agendados");
        lbVueloS.setToolTipText("");
        add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reprogramar vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
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
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReprogramar;
    private javax.swing.JComboBox<String> comboBoxDayFirst;
    private javax.swing.JComboBox<String> comboBoxHourFirst;
    private javax.swing.JComboBox<String> comboBoxMinutesFirst;
    private javax.swing.JComboBox<String> comboBoxMonthFirst;
    private javax.swing.JComboBox<String> comboBoxPistaAterrizaje;
    private javax.swing.JComboBox<String> comboBoxPistaDespegue;
    private javax.swing.JComboBox<String> comboBoxYearFirst;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbPistaA;
    private javax.swing.JLabel lbPistaD;
    private javax.swing.JLabel lbVueloS;
    private javax.swing.JLabel lbVueloS3;
    private javax.swing.JLabel lbVueloS8;
    private javax.swing.JLabel lbVueloS9;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextArea txtAreaReprogramacion;
    // End of variables declaration//GEN-END:variables
}
