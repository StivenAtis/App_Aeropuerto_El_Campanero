package View;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import Classes.*;
import Controller.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Booh
 */

public class pnlScheduleFlight extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    public pnlScheduleFlight() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        lbCdigoVuelo = new javax.swing.JLabel();
        tfCodigoVuelo = new javax.swing.JTextField();
        lbTipoV = new javax.swing.JLabel();
        chboxVueloPasajeros = new javax.swing.JCheckBox();
        chboxVueloCarga = new javax.swing.JCheckBox();
        chboxVueloSalida = new javax.swing.JCheckBox();
        chboxVueloLlegada = new javax.swing.JCheckBox();
        lbClaseV = new javax.swing.JLabel();
        lbPistaD = new javax.swing.JLabel();
        lbPistaA = new javax.swing.JLabel();
        comboBoxPistaAterrizaje = new javax.swing.JComboBox<>();
        comboBoxPistaDespegue = new javax.swing.JComboBox<>();
        comboBoxAgenda = new javax.swing.JComboBox<>();
        comboBoxDestino = new javax.swing.JComboBox<>();
        lbFecha = new javax.swing.JLabel();
        btAgendar = new javax.swing.JButton();
        comboBoxMonth = new javax.swing.JComboBox<>();
        comboBoxDay = new javax.swing.JComboBox<>();
        comboBoxYear = new javax.swing.JComboBox<>();
        comboBoxHour = new javax.swing.JComboBox<>();
        lbHora = new javax.swing.JLabel();
        lbPistaD1 = new javax.swing.JLabel();
        comboBoxMinutes = new javax.swing.JComboBox<>();
        lbCdigoVuelo1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lbVueloS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Clase", "Destino", "Fecha", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        tblCustomers.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblCustomers.getColumnModel().getColumnCount() > 0) {
            tblCustomers.getColumnModel().getColumn(0).setResizable(false);
            tblCustomers.getColumnModel().getColumn(1).setResizable(false);
            tblCustomers.getColumnModel().getColumn(2).setResizable(false);
            tblCustomers.getColumnModel().getColumn(3).setResizable(false);
            tblCustomers.getColumnModel().getColumn(4).setResizable(false);
            tblCustomers.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 1160, 140));

        lbCdigoVuelo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo.setText("Seleccione destino");
        lbCdigoVuelo.setToolTipText("");
        add(lbCdigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 200, 40));

        tfCodigoVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 390, 40));

        lbTipoV.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbTipoV.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTipoV.setText("Tipo de vuelo");
        lbTipoV.setToolTipText("");
        add(lbTipoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 360, 50));

        chboxVueloPasajeros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloPasajeros.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloPasajeros.setText("Vuelo de pasajeros");
        chboxVueloPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloPasajerosActionPerformed(evt);
            }
        });
        add(chboxVueloPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 160, 40));

        chboxVueloCarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloCarga.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloCarga.setText("Vuelo de carga");
        chboxVueloCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloCargaActionPerformed(evt);
            }
        });
        add(chboxVueloCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 160, 40));

        chboxVueloSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloSalida.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloSalida.setText("Vuelo de salida");
        chboxVueloSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloSalidaActionPerformed(evt);
            }
        });
        add(chboxVueloSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 160, 40));

        chboxVueloLlegada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloLlegada.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloLlegada.setText("Vuelo de llegada");
        chboxVueloLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloLlegadaActionPerformed(evt);
            }
        });
        add(chboxVueloLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 160, 40));

        lbClaseV.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbClaseV.setForeground(new java.awt.Color(255, 255, 255));
        lbClaseV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClaseV.setText("Seleccione");
        lbClaseV.setToolTipText("");
        add(lbClaseV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 340, 50));

        lbPistaD.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPistaD.setForeground(new java.awt.Color(255, 255, 255));
        lbPistaD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPistaD.setText("Seleccione");
        lbPistaD.setToolTipText("");
        add(lbPistaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 360, 50));

        lbPistaA.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPistaA.setForeground(new java.awt.Color(255, 255, 255));
        lbPistaA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPistaA.setText("Pista de aterrizaje");
        lbPistaA.setToolTipText("");
        add(lbPistaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 360, 50));

        comboBoxPistaAterrizaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        add(comboBoxPistaAterrizaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 360, 40));

        comboBoxPistaDespegue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        add(comboBoxPistaDespegue, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 360, 40));

        comboBoxAgenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxAgenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agenda" }));
        add(comboBoxAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 360, 40));

        comboBoxDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Destino" }));
        add(comboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 360, 40));

        lbFecha.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFecha.setText("Fecha de agenda");
        lbFecha.setToolTipText("");
        add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 360, 50));

        btAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agendar_vuelo_min.png"))); // NOI18N
        btAgendar.setContentAreaFilled(false);
        btAgendar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agendar_vuelo_min.png"))); // NOI18N
        btAgendar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agendar_vuelo_max.png"))); // NOI18N
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });
        add(btAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 310, 120));

        comboBoxMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        add(comboBoxMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 120, 40));

        comboBoxDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(comboBoxDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 440, 110, 40));

        comboBoxYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        add(comboBoxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 110, 40));

        comboBoxHour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        add(comboBoxHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 120, 40));

        lbHora.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbHora.setForeground(new java.awt.Color(255, 255, 255));
        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHora.setText("Hora de agenda");
        lbHora.setToolTipText("");
        add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, 260, 50));

        lbPistaD1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPistaD1.setForeground(new java.awt.Color(255, 255, 255));
        lbPistaD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPistaD1.setText("Pista de despegue");
        lbPistaD1.setToolTipText("");
        add(lbPistaD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 360, 50));

        comboBoxMinutes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(comboBoxMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, 120, 40));

        lbCdigoVuelo1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo1.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo1.setText("Codigo vuelo solicitado");
        lbCdigoVuelo1.setToolTipText("");
        add(lbCdigoVuelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 200, 40));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 330, 120));

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Vuelos solicitados");
        lbVueloS.setToolTipText("");
        add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agendar vuelo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
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

    //--------------------------------------------------------------------------
    
    private void chboxVueloPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloPasajerosActionPerformed

        if(chboxVueloPasajeros.isSelected() == true){

            chboxVueloCarga.setSelected(false);
        }
    }//GEN-LAST:event_chboxVueloPasajerosActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloCargaActionPerformed

        if(chboxVueloCarga.isSelected() == true){

            chboxVueloPasajeros.setSelected(false);
        }
    }//GEN-LAST:event_chboxVueloCargaActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloSalidaActionPerformed
        if(chboxVueloSalida.isSelected() == true){

            chboxVueloLlegada.setSelected(false);

            comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista"}));
            comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista", "pista - 01B","pista - 03B","pista - 06B","pista - 09B","pista - 012B"}));
        }
        else if (chboxVueloSalida.isSelected() == false){
            comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        }
    }//GEN-LAST:event_chboxVueloSalidaActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloLlegadaActionPerformed

        if(chboxVueloLlegada.isSelected() == true){

            chboxVueloSalida.setSelected(false);

            comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista","pista - 01A","pista - 03A","pista - 06A","pista - 09A","pista - 012A"}));
            comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista"}));
        }
        else if (chboxVueloLlegada.isSelected() == false){
            comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista", }));
        }
    }//GEN-LAST:event_chboxVueloLlegadaActionPerformed

    //--------------------------------------------------------------------------
    
    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed

//        try {
//            String codigo = tfCodigoVuelo.getText();
//            String destino = tfDestino.getText();
//            boolean tipovueloP = chboxVueloPasajeros.isSelected();
//            boolean tipovueloC = chboxVueloCarga.isSelected();
//            boolean vueloS = chboxVueloSalida.isSelected();
//            boolean vueloLl = chboxVueloLlegada.isSelected();
//            String pistaDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
//            String pistaAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
//            String anio = comboBoxYear.getSelectedItem().toString();
//            String mes = comboBoxMonth.getSelectedItem().toString();
//            String dia = comboBoxDay.getSelectedItem().toString();
//            String hora = comboBoxHour.getSelectedItem().toString();
//            String minuto = comboBoxMinutes.getSelectedItem().toString();
//
//            String codigoVueloEncontrado = tfCodigoVuelo.getText();
//            String VueloConsultado = tfVueloConsultado.getText();
//
//            if (VueloConsultado.equals("")){
//                JOptionPane.showMessageDialog(this, "Para agendar un vuelo primero debe consultarlo");
//            }
//            if (codigoVueloEncontrado.equals("")){
//                JOptionPane.showMessageDialog(this, "Debe diligenciar el codigo del vuelo");
//            }
//
//            //---
//
//            if (tipovueloC == false && tipovueloP == false) {
//                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un tipo de vuelo!");
//            }
//            if (vueloS == false && vueloLl == false) {
//                JOptionPane.showMessageDialog(this, "¡Debe seleccionar la clase de vuelo!");
//            }
//            if(anio.equals("Year") || mes.equals("Month") || dia.equals("Day")){
//                JOptionPane.showMessageDialog(this, "¡Debe seleccionar una fecha valida!");
//            }
//            if(hora.equals("Hour") || minuto.equals("Minutes")){
//                JOptionPane.showMessageDialog(this, "¡Debe ingresar una hora valida del vuelo!");
//            }
//            if(destino.equals("")){
//                JOptionPane.showMessageDialog(this, "¡Debe ingresar un destino para el vuelo!");
//            }
//            else{
//                if(tipovueloP==true && vueloS==true && !"".equals(codigo)){
//
//                    String codigoVuelo = tfCodigoVuelo.getText();
//                    //String destinoVuelo = tfDestino.getText();
//                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
//                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
//                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
//                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
//                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
//                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
//                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
//                    String mesNumber = "";
//
//                    if(mesVuelo.equals("January")){
//                        mesNumber = "1";
//                    }
//                    if(mesVuelo.equals("February")){
//                        mesNumber = "2";
//                    }
//                    if(mesVuelo.equals("March")){
//                        mesNumber = "3";
//                    }
//                    if(mesVuelo.equals("April")){
//                        mesNumber = "4";
//                    }
//                    if(mesVuelo.equals("may")){
//                        mesNumber = "5";
//                    }
//                    if(mesVuelo.equals("June")){
//                        mesNumber = "6";
//                    }
//                    if(mesVuelo.equals("July")){
//                        mesNumber = "7";
//                    }
//                    if(mesVuelo.equals("August")){
//                        mesNumber = "8";
//                    }
//                    if(mesVuelo.equals("September")){
//                        mesNumber = "9";
//                    }
//                    if(mesVuelo.equals("October")){
//                        mesNumber = "10";
//                    }
//                    if(mesVuelo.equals("November")){
//                        mesNumber = "11";
//                    }
//                    if(mesVuelo.equals("December")){
//                        mesNumber = "12";
//                    }
//
//                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
//                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
//
//                    //----------
//                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
//
//                    if (FlightRequirementsSearch != null) {
//                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo agendado con este codigo!");
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloLlegada.setSelected(false);
//                            chboxVueloCarga.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloSalida.setSelected(false);
//                            chboxVueloPasajeros.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloCarga.setSelected(false);
//                            chboxVueloSalida.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloPasajeros.setSelected(false);
//                            chboxVueloLlegada.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getTipoVuelo() +  "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                    }
//                    //----------
//                    else{
//                        if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda agendarVuelo = new clsFlightAgenda(0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(agendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" +
//                                "Clase de vuelo: Vuelo de salida" + "\n" +
//                                "Tripulación del avión: " + "tripulacion" + "\n" +
//                                //"Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda AgendarVuelo = new clsFlightAgenda
//                            (0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(AgendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" +
//                                "Clase de vuelo: Vuelo de salida" + "\n" +
//                                //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" +
//                                "Tripulación del avión: " + tripulacion + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                    }
//                    //----------
//
//                }
//
//                //--------------------------------------------------------------
//
//                if (tipovueloC==true && vueloLl==true && !"".equals(codigo)) {
//
//                    String codigoVuelo = tfCodigoVuelo.getText();
//                    String destinoVuelo = tfDestino.getText();
//                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
//                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
//                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
//                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
//                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
//                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
//                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
//                    String mesNumber = "";
//
//                    if(mesVuelo.equals("January")){
//                        mesNumber = "1";
//                    }
//                    if(mesVuelo.equals("February")){
//                        mesNumber = "2";
//                    }
//                    if(mesVuelo.equals("March")){
//                        mesNumber = "3";
//                    }
//                    if(mesVuelo.equals("April")){
//                        mesNumber = "4";
//                    }
//                    if(mesVuelo.equals("may")){
//                        mesNumber = "5";
//                    }
//                    if(mesVuelo.equals("June")){
//                        mesNumber = "6";
//                    }
//                    if(mesVuelo.equals("July")){
//                        mesNumber = "7";
//                    }
//                    if(mesVuelo.equals("August")){
//                        mesNumber = "8";
//                    }
//                    if(mesVuelo.equals("September")){
//                        mesNumber = "9";
//                    }
//                    if(mesVuelo.equals("October")){
//                        mesNumber = "10";
//                    }
//                    if(mesVuelo.equals("November")){
//                        mesNumber = "11";
//                    }
//                    if(mesVuelo.equals("December")){
//                        mesNumber = "12";
//                    }
//
//                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
//                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
//
//                    //----------
//                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
//
//                    if (FlightRequirementsSearch != null) {
//                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloLlegada.setSelected(false);
//                            chboxVueloCarga.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloSalida.setSelected(false);
//                            chboxVueloPasajeros.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloCarga.setSelected(false);
//                            chboxVueloSalida.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloPasajeros.setSelected(false);
//                            chboxVueloLlegada.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                    }
//                    //----------
//                    else{
//                        if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda AgendarVuelo = new clsFlightAgenda
//                            (0, codigoVuelo, "Vuelo de carga", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(AgendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de carga" + "\n" +
//                                "Clase de vuelo: Vuelo de llegada" + "\n" +
//                                //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" +
//                                "Tripulación del avión: " + tripulacion + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda AgendarVuelo = new clsFlightAgenda
//                            (0, codigoVuelo, "Vuelo de carga", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(AgendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de carga" + "\n" +
//                                "Clase de vuelo: Vuelo de llegada" + "\n" +
//                                //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" +
//                                "Tripulación del avión: " + tripulacion + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                    }
//                }
//
//                //--------------------------------------------------------------
//
//                if(tipovueloP==true && vueloLl==true && !"".equals(codigo)){
//
//                    String codigoVuelo = tfCodigoVuelo.getText();
//                    String destinoVuelo = tfDestino.getText();
//                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
//                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
//                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
//                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
//                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
//                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
//                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
//                    String mesNumber = "";
//
//                    if(mesVuelo.equals("January")){
//                        mesNumber = "1";
//                    }
//                    if(mesVuelo.equals("February")){
//                        mesNumber = "2";
//                    }
//                    if(mesVuelo.equals("March")){
//                        mesNumber = "3";
//                    }
//                    if(mesVuelo.equals("April")){
//                        mesNumber = "4";
//                    }
//                    if(mesVuelo.equals("may")){
//                        mesNumber = "5";
//                    }
//                    if(mesVuelo.equals("June")){
//                        mesNumber = "6";
//                    }
//                    if(mesVuelo.equals("July")){
//                        mesNumber = "7";
//                    }
//                    if(mesVuelo.equals("August")){
//                        mesNumber = "8";
//                    }
//                    if(mesVuelo.equals("September")){
//                        mesNumber = "9";
//                    }
//                    if(mesVuelo.equals("October")){
//                        mesNumber = "10";
//                    }
//                    if(mesVuelo.equals("November")){
//                        mesNumber = "11";
//                    }
//                    if(mesVuelo.equals("December")){
//                        mesNumber = "12";
//                    }
//                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
//                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
//
//                    //----------
//                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
//
//                    if (FlightRequirementsSearch != null) {
//                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloLlegada.setSelected(false);
//                            chboxVueloCarga.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloSalida.setSelected(false);
//                            chboxVueloPasajeros.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloCarga.setSelected(false);
//                            chboxVueloSalida.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloPasajeros.setSelected(false);
//                            chboxVueloLlegada.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                    }
//                    //----------
//                    else{
//                        if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda AgendarVuelo = new clsFlightAgenda
//                            (0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(AgendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" +
//                                "Clase de vuelo: Vuelo de llegada" + "\n" +
//                                //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" +
//                                "Tripulación del avión: " + tripulacion + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda AgendarVuelo = new clsFlightAgenda
//                            (0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(AgendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" +
//                                "Clase de vuelo: Vuelo de llegada" + "\n" +
//                                //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" +
//                                "Tripulación del avión: " + tripulacion + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                    }
//                }
//
//                //--------------------------------------------------------------
//
//                if (tipovueloC==true && vueloS==true && !"".equals(codigo)) {
//
//                    String codigoVuelo = tfCodigoVuelo.getText();
//                    String destinoVuelo = tfDestino.getText();
//                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
//                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
//                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
//                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
//                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
//                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
//                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
//                    String mesNumber = "";
//
//                    if(mesVuelo.equals("January")){
//                        mesNumber = "1";
//                    }
//                    if(mesVuelo.equals("February")){
//                        mesNumber = "2";
//                    }
//                    if(mesVuelo.equals("March")){
//                        mesNumber = "3";
//                    }
//                    if(mesVuelo.equals("April")){
//                        mesNumber = "4";
//                    }
//                    if(mesVuelo.equals("may")){
//                        mesNumber = "5";
//                    }
//                    if(mesVuelo.equals("June")){
//                        mesNumber = "6";
//                    }
//                    if(mesVuelo.equals("July")){
//                        mesNumber = "7";
//                    }
//                    if(mesVuelo.equals("August")){
//                        mesNumber = "8";
//                    }
//                    if(mesVuelo.equals("September")){
//                        mesNumber = "9";
//                    }
//                    if(mesVuelo.equals("October")){
//                        mesNumber = "10";
//                    }
//                    if(mesVuelo.equals("November")){
//                        mesNumber = "11";
//                    }
//                    if(mesVuelo.equals("December")){
//                        mesNumber = "12";
//                    }
//                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
//                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
//
//                    //----------
//                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
//
//                    if (FlightRequirementsSearch != null) {
//                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo agendado con este codigo!");
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloLlegada.setSelected(false);
//                            chboxVueloCarga.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloSalida.setSelected(false);
//                            chboxVueloPasajeros.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
//
//                            chboxVueloLlegada.setSelected(true);
//                            chboxVueloPasajeros.setSelected(true);
//                            chboxVueloCarga.setSelected(false);
//                            chboxVueloSalida.setSelected(false);
//
//                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
//
//                            chboxVueloCarga.setSelected(true);
//                            chboxVueloSalida.setSelected(true);
//                            chboxVueloPasajeros.setSelected(false);
//                            chboxVueloLlegada.setSelected(false);
//
//                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
//
//                            tfDestino.setText(FlightRequirementsSearch.getDestino());
//
//                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
//                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" +
//                                "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
//                                "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" +
//                                "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" +
//                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" +
//                                "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" +
//                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
//                        }
//
//                    }
//                    //----------
//
//                    else{
//
//                        if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
//                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
//                        }
//                        else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda AgendarVuelo = new clsFlightAgenda
//                            (0, codigoVuelo, "Vuelo de carga", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(AgendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" +
//                                "Clase de vuelo: Vuelo de llegada" + "\n" +
//                                //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" +
//                                "Tripulación del avión: " + tripulacion + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
//
//                            String tripulacion = tripulacion();
//
//                            clsFlightAgenda AgendarVuelo = new clsFlightAgenda
//                            (0, codigoVuelo, "Vuelo de carga", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");
//
//                            controlFlightAgenda.createFlightAgenda(AgendarVuelo);
//
//                            dataAgenda.setText("Datos de vuelo:" + "\n" +
//                                "\n" +
//                                "Codigo del vuelo: " + codigoVuelo + "\n" +
//                                "Tipo de vuelo: Vuelo de carga" + "\n" +
//                                "Clase de vuelo: Vuelo de salida" + "\n" +
//                                //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" +
//                                "Tripulación del avión: " + tripulacion + "\n" +
//                                "Feca de vuelo: " + fecha + "\n" +
//                                "Hora de vuelo: " + tiempo + "\n" +
//                                "Destino del vuelo: " + destinoVuelo);
//
//                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
//                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
//                            showFlightList();
//                            cleanscheduleQuestionnaire();
//                        }
//                    }
//                }
//
//            }
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_btAgendarActionPerformed

    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chboxVueloCarga;
    private javax.swing.JCheckBox chboxVueloLlegada;
    private javax.swing.JCheckBox chboxVueloPasajeros;
    private javax.swing.JCheckBox chboxVueloSalida;
    private javax.swing.JComboBox<String> comboBoxAgenda;
    private javax.swing.JComboBox<String> comboBoxDay;
    private javax.swing.JComboBox<String> comboBoxDestino;
    private javax.swing.JComboBox<String> comboBoxHour;
    private javax.swing.JComboBox<String> comboBoxMinutes;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxPistaAterrizaje;
    private javax.swing.JComboBox<String> comboBoxPistaDespegue;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCdigoVuelo;
    private javax.swing.JLabel lbCdigoVuelo1;
    private javax.swing.JLabel lbClaseV;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbPistaA;
    private javax.swing.JLabel lbPistaD;
    private javax.swing.JLabel lbPistaD1;
    private javax.swing.JLabel lbTipoV;
    private javax.swing.JLabel lbVueloS;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField tfCodigoVuelo;
    // End of variables declaration//GEN-END:variables
}
