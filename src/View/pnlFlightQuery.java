package View;

import Classes.clsDeniedFlights;
import Classes.clsFlightAgenda;
import Classes.clsFlightCancelationAgenda;
import Classes.clsFlightCancelationAirline;
import Classes.clsFlightRequerimentsReprogramation;
import Classes.clsFlightRequirements;
import Controller.ctlFlightAgenda;
import Controller.ctlFlightRequirement;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author Booh
 */
public class pnlFlightQuery extends javax.swing.JPanel {
    
    //--------------------------------------------------------------------------
    
    ctlFlightRequirement controlFlightRequirement = new ctlFlightRequirement();
    ctlFlightAgenda controlFlightAgenda = new ctlFlightAgenda();
    
    //--------------------------------------------------------------------------
    
    public pnlFlightQuery() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCodigoVuelo = new javax.swing.JTextField();
        lbCdigoVuelo3 = new javax.swing.JLabel();
        lbCdigoVuelo2 = new javax.swing.JLabel();
        lbCdigoVuelo4 = new javax.swing.JLabel();
        btnVuelosReprogramacion = new javax.swing.JRadioButton();
        btnVuelosCancelados = new javax.swing.JRadioButton();
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
        lbCdigoVuelo4.setText("Informaci??n sobre solicitud");
        lbCdigoVuelo4.setToolTipText("");
        add(lbCdigoVuelo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 270, 40));

        btnVuelosReprogramacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVuelosReprogramacion.setForeground(new java.awt.Color(255, 255, 255));
        btnVuelosReprogramacion.setText("Registro de reprogramaci??n");
        btnVuelosReprogramacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosReprogramacionActionPerformed(evt);
            }
        });
        add(btnVuelosReprogramacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        btnVuelosCancelados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVuelosCancelados.setForeground(new java.awt.Color(255, 255, 255));
        btnVuelosCancelados.setText("Vuelos cancelados");
        btnVuelosCancelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosCanceladosActionPerformed(evt);
            }
        });
        add(btnVuelosCancelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        txtAInfoAdicional.setColumns(20);
        txtAInfoAdicional.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtAInfoAdicional.setRows(5);
        txtAInfoAdicional.setFocusable(false);
        jScrollPane3.setViewportView(txtAInfoAdicional);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 1150, 280));

        txtAInfoSolicitud.setColumns(20);
        txtAInfoSolicitud.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtAInfoSolicitud.setRows(5);
        txtAInfoSolicitud.setFocusable(false);
        jScrollPane2.setViewportView(txtAInfoSolicitud);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 1150, 170));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_min.png"))); // NOI18N
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_min.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_max.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 330, 120));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
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

    //--------------------------------------------------------------------------
    
    private void cleanRegisterQuestionnaire(){
        tfCodigoVuelo.setText("");
        txtAInfoAdicional.setText("");
        txtAInfoSolicitud.setText("");
 
    }
    
    //--------------------------------------------------------------------------
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        String codigoVueloEncontrado = tfCodigoVuelo.getText();
        
        if(codigoVueloEncontrado.equals("")){
            JOptionPane.showMessageDialog(this, "Debe diligenciar el codigo para poder realizar la consulta.");
        }
        else{
            
            if(btnVuelosCancelados.isSelected()==false && btnVuelosReprogramacion.isSelected()==false){
                
                clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVueloEncontrado);
                clsDeniedFlights FlightDeniedSearch = controlFlightRequirement.readFlightDenied(codigoVueloEncontrado);
                clsFlightAgenda FlightRequirementsSearchAgenda = controlFlightAgenda.readFlightAgenda(codigoVueloEncontrado);

                if (FlightRequirementsSearch == null && FlightRequirementsSearchAgenda == null && FlightDeniedSearch == null) {
                    JOptionPane.showMessageDialog(this, "??No existe datos para el vuelo con codigo: " + codigoVueloEncontrado + "!");
                    cleanRegisterQuestionnaire();
                } else {

                    if(FlightRequirementsSearch != null){

                        if (FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            txtAInfoAdicional.setText("DATOS DE VUELO:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avi??n: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avi??n: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulaci??n del avi??n: " + FlightRequirementsSearch.getTripulaci??n() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());

                            txtAInfoSolicitud.setText("El vuelo ha sido solicitado al aeropuerto y aun no se tiene una respuesta sobre su agendamiento.");
                        }

                        if (FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            txtAInfoAdicional.setText("DATOS DE VUELO:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avi??n: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avi??n: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulaci??n del avi??n: " + FlightRequirementsSearch.getTripulaci??n() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());

                            txtAInfoSolicitud.setText("El vuelo ha sido solicitado al aeropuerto y aun no se tiene una respuesta sobre su agendamiento.");
                        }

                    } 
                    else if (FlightRequirementsSearch == null && FlightRequirementsSearchAgenda != null){


                        txtAInfoAdicional.setText("Datos de agenda de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + FlightRequirementsSearchAgenda.getCodigoVueloAgenda()+ "\n" +
                                        "Tipo de vuelo: " + FlightRequirementsSearchAgenda.getTipoVuelo() + "\n" + 
                                        "Clase de vuelo: " + FlightRequirementsSearchAgenda.getClaseVuelo()+ "\n" +
                                        "Tripulaci??n del avi??n: " + FlightRequirementsSearchAgenda.getTripulaci??n() + "\n" + 
                                        "Pista de vuelo" + FlightRequirementsSearchAgenda.getPista() + "\n" + 
                                        "Feca de vuelo: " + FlightRequirementsSearchAgenda.getFecha() + "\n" + 
                                        "Hora de vuelo: " + FlightRequirementsSearchAgenda.getTiempo()+ "\n" + 
                                        "Destino del vuelo: " + FlightRequirementsSearchAgenda.getDestino());

                        txtAInfoSolicitud.setText("El vuelo ha sido agendado exitosamente por el aeropuerto.");
                    }
                    else if (FlightRequirementsSearch == null && FlightRequirementsSearchAgenda == null && FlightDeniedSearch != null){

                        txtAInfoAdicional.setText("Datos de agenda de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + FlightDeniedSearch.getCodigoVueloAgenda()+ "\n" +
                                                "Tipo de vuelo: " + FlightDeniedSearch.getTipoVuelo() + "\n" + 
                                                "Clase de vuelo: " + FlightDeniedSearch.getLlegadaSalida()+ "\n" +
                                                "Tripulaci??n del avi??n: " + FlightDeniedSearch.getTripulaci??n() + "\n" + 
                                                "Modelo de Avi??n: " + FlightDeniedSearch.getModeloAvion()+ "\n" + 
                                                "Feca de vuelo: " + FlightDeniedSearch.getFecha() + "\n" + 
                                                "Hora de vuelo: " + FlightDeniedSearch.getHora()+ "\n" + 
                                                "Destino del vuelo: " + FlightDeniedSearch.getDestino());

                        txtAInfoSolicitud.setText(FlightDeniedSearch.getDespricion());
                    }

                }
            }
            else if(btnVuelosCancelados.isSelected() == true){
                
                clsFlightCancelationAirline FlightRequirementsSearch = controlFlightAgenda.readFlightAirlineCancelation(codigoVueloEncontrado);
                clsFlightCancelationAgenda FlightRequirementsSearchAgenda = controlFlightAgenda.readFlightAgendaCancelation(codigoVueloEncontrado);
                
                if (FlightRequirementsSearchAgenda == null && FlightRequirementsSearch == null) {
                    JOptionPane.showMessageDialog(this, "??No existe datos para el vuelo con codigo: " + codigoVueloEncontrado + "!");
                    cleanRegisterQuestionnaire();
                } else {
                    
                    
                    if(FlightRequirementsSearch != null){
                        
                        txtAInfoAdicional.setText("Datos de agenda de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo()+ "\n" +
                                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                                "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada()+ "\n" +
                                                "Tripulaci??n del avi??n: " + FlightRequirementsSearch.getTripulaci??n() + "\n" + 
                                                "Modelo de Avi??n: " + FlightRequirementsSearch.getModeloAvion()+ "\n" + 
                                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                                "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                                                String descrp = "VUELO SOLICITADO:" + "\n" + FlightRequirementsSearch.getDescripcion();

                        txtAInfoSolicitud.setText(descrp);
                    }
                    
                    else if (FlightRequirementsSearch == null && FlightRequirementsSearchAgenda != null){


                        txtAInfoAdicional.setText("Datos de agenda de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + FlightRequirementsSearchAgenda.getCodigoVueloAgenda()+ "\n" +
                                        "Tipo de vuelo: " + FlightRequirementsSearchAgenda.getTipoVuelo() + "\n" + 
                                        "Clase de vuelo: " + FlightRequirementsSearchAgenda.getClaseVuelo()+ "\n" +
                                        "Tripulaci??n del avi??n: " + FlightRequirementsSearchAgenda.getTripulaci??n() + "\n" + 
                                        "Pista de vuelo" + FlightRequirementsSearchAgenda.getPista() + "\n" + 
                                        "Feca de vuelo: " + FlightRequirementsSearchAgenda.getFecha() + "\n" + 
                                        "Hora de vuelo: " + FlightRequirementsSearchAgenda.getTiempo()+ "\n" + 
                                        "Destino del vuelo: " + FlightRequirementsSearchAgenda.getDestino());
                                        String descrp = "VUELO AGENDADO:" + "\n" + FlightRequirementsSearchAgenda.getDescripcion();
                                        
                        txtAInfoSolicitud.setText(descrp);
                    }
                }
            }
            
            else if(btnVuelosReprogramacion.isSelected() == true){
                
                clsFlightRequerimentsReprogramation FlightRequirementsSearch  = controlFlightRequirement.readFlightReprogramation(codigoVueloEncontrado);
                
                if (FlightRequirementsSearch == null) {
                    JOptionPane.showMessageDialog(this, "??No existe datos para el vuelo con codigo: " + codigoVueloEncontrado + "!");
                    cleanRegisterQuestionnaire();
                } else {
                    
                    
                    if(FlightRequirementsSearch != null){
                        
                        txtAInfoAdicional.setText("Datos de agenda de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo()+ "\n" +
                                                "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                                "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada()+ "\n" +
                                                "Tripulaci??n del avi??n: " + FlightRequirementsSearch.getTripulaci??n() + "\n" + 
                                                "Modelo de Avi??n: " + FlightRequirementsSearch.getModeloAvion()+ "\n" + 
                                                "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                                "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                                "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                                                String descrp = "VUELO SOLICITADO:" + "\n" + FlightRequirementsSearch.getDescripcion();

                        txtAInfoSolicitud.setText(descrp);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    //--------------------------------------------------------------------------
    
    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++)
            for(int j = 0; j < table.getColumnCount(); j++) {
              table.setValueAt("", i, j);
       }
    }
    
    //--------------------------------------------------------------------------
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        tfCodigoVuelo.setText("");
        txtAInfoAdicional.setText("");
        txtAInfoSolicitud.setText("");
        btnVuelosCancelados.setSelected(false);
        btnVuelosReprogramacion.setSelected(false);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVuelosCanceladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosCanceladosActionPerformed

        if(btnVuelosCancelados.isSelected() == false){
            if( !"".equals(txtAInfoAdicional.getText())){
                txtAInfoAdicional.setText("");
                txtAInfoSolicitud.setText("");
                tfCodigoVuelo.setText("");
            }
            else{
                txtAInfoAdicional.setText("");
                txtAInfoSolicitud.setText("");
            }
            
            
        }
        else{
            if(btnVuelosCancelados.isSelected() == true){
                 if( !"".equals(txtAInfoAdicional.getText())){
                    txtAInfoAdicional.setText("");
                    txtAInfoSolicitud.setText("");
                    tfCodigoVuelo.setText("");
                 }
                
                btnVuelosReprogramacion.setSelected(false);
            }
        }
    }//GEN-LAST:event_btnVuelosCanceladosActionPerformed

    private void btnVuelosReprogramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosReprogramacionActionPerformed
        if(btnVuelosReprogramacion.isSelected() == false){
             if( !"".equals(txtAInfoAdicional.getText())){
                txtAInfoAdicional.setText("");
                txtAInfoSolicitud.setText("");
                tfCodigoVuelo.setText("");
             }
            
            
        }
        else{
            if(btnVuelosReprogramacion.isSelected() == true){
                if( !"".equals(txtAInfoAdicional.getText())){
                    txtAInfoAdicional.setText("");
                    txtAInfoSolicitud.setText("");
                    tfCodigoVuelo.setText("");
                }
                
                btnVuelosCancelados.setSelected(false);
            }
        }
    }//GEN-LAST:event_btnVuelosReprogramacionActionPerformed

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JRadioButton btnVuelosCancelados;
    private javax.swing.JRadioButton btnVuelosReprogramacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCdigoVuelo2;
    private javax.swing.JLabel lbCdigoVuelo3;
    private javax.swing.JLabel lbCdigoVuelo4;
    private javax.swing.JTextField tfCodigoVuelo;
    private javax.swing.JTextArea txtAInfoAdicional;
    private javax.swing.JTextArea txtAInfoSolicitud;
    // End of variables declaration//GEN-END:variables
}
