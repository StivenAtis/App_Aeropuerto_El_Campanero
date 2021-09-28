package View;

import Classes.clsFlightAgenda;
import Classes.clsFlightRequirements;
import Controller.ctlFlightAgenda;
import Controller.ctlFlightRequirement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.Constants;

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
        lbCdigoVuelo4.setText("Información sobre solicitud");
        lbCdigoVuelo4.setToolTipText("");
        add(lbCdigoVuelo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 270, 40));

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
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 330, 120));

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
            clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVueloEncontrado);
            clsFlightAgenda FlightRequirementsSearchAgenda = controlFlightAgenda.readFlightAgenda(codigoVueloEncontrado);
            
            if (FlightRequirementsSearch == null && FlightRequirementsSearchAgenda == null) {
                JOptionPane.showMessageDialog(this, "¡No existe datos para el vuelo con codigo: " + codigoVueloEncontrado + "!");
                cleanRegisterQuestionnaire();
            } else {

                if(FlightRequirementsSearch != null){
                
                if (FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                    txtAInfoAdicional.setText("DATOS DE VUELO:" + "\n" +
                                    "\n" +
                                    "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                    "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                    "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                    "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                    "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                    "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                    "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                    "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                    "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                    
                    txtAInfoSolicitud.setText("El vuelo ha sido solicitado al aeropuerto y aun no se tiene una respuesta sober su agendamiento");
                }
                
                if (FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                    txtAInfoAdicional.setText("DATOS DE VUELO:" + "\n" +
                                    "\n" +
                                    "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                    "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                    "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                    "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                    "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                    "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                    "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                    "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                    "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                    
                    txtAInfoSolicitud.setText("El vuelo ha sido solicitado al aeropuerto y aun no se tiene una respuesta sober su agendamiento.");
                }
                
                } 
                else{
                    if (FlightRequirementsSearch == null && FlightRequirementsSearchAgenda != null) {
                    
                            txtAInfoAdicional.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearchAgenda.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearchAgenda.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearchAgenda.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearchAgenda.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearchAgenda.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearchAgenda.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearchAgenda.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearchAgenda.getDestino());
                            
                            txtAInfoSolicitud.setText("El vuelo ha sido agendado exitosamente por el aeropuerto.");
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
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpiar;
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
