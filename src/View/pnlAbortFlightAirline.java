package View;

import Classes.clsFlightAgenda;
import Classes.clsFlightCancelationAgenda;
import Classes.clsFlightCancelationAirline;
import Classes.clsFlightRequirements;
import Classes.clsType_Flight;
import Controller.ctlFlightAgenda;
import Controller.ctlFlightRequirement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Constants;

/**
 *
 * @author Booh
 */
public class pnlAbortFlightAirline extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    
    private ctlFlightRequirement controller = null;
    private LinkedList<clsFlightRequirements> list;
    
    private ctlFlightAgenda controllerA = null;
    private LinkedList<clsFlightAgenda> listA;

    public pnlAbortFlightAirline() {
        
        initComponents();
        controller = new ctlFlightRequirement();
        controllerA = new ctlFlightAgenda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancelar = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnVuelosAgendados = new javax.swing.JRadioButton();
        btnVuelosSolicitados = new javax.swing.JRadioButton();
        lbVueloTITLE = new javax.swing.JLabel();
        lbVueloS8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaCancelacion = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCancelar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Clase", "Fecha", "Hora", "Modelo A.", "Capacidad A.", "Destino", "Pista de avi??n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCancelarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCancelar);
        if (tblCancelar.getColumnModel().getColumnCount() > 0) {
            tblCancelar.getColumnModel().getColumn(5).setResizable(false);
            tblCancelar.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1160, 190));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 330, 120));

        btnVuelosAgendados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVuelosAgendados.setForeground(new java.awt.Color(255, 255, 255));
        btnVuelosAgendados.setText("Vuelos agendados");
        btnVuelosAgendados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosAgendadosActionPerformed(evt);
            }
        });
        add(btnVuelosAgendados, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        btnVuelosSolicitados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVuelosSolicitados.setForeground(new java.awt.Color(255, 255, 255));
        btnVuelosSolicitados.setText("Vuelos solicitados");
        btnVuelosSolicitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosSolicitadosActionPerformed(evt);
            }
        });
        add(btnVuelosSolicitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        lbVueloTITLE.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloTITLE.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloTITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloTITLE.setText("Vuelos");
        lbVueloTITLE.setToolTipText("");
        add(lbVueloTITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 40));

        lbVueloS8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS8.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS8.setText("Motivo de cancelaci??n de vuelo");
        lbVueloS8.setToolTipText("");
        add(lbVueloS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 1160, 40));

        txtAreaCancelacion.setColumns(20);
        txtAreaCancelacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaCancelacion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 1160, 160));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_min.png"))); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_min.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_max.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 330, 120));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cancelar vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void fillDataTable() {
         
        list = controller.listFlight();
        String datos[][] = new String[list.size()][9];
        
        if(list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                datos[i][Constants.CODE_FLIGHT] = list.get(i).getCodigoVuelo();
                datos[i][Constants.TYPE_FLIGHT] = list.get(i).getTipoVuelo();
                datos[i][Constants.CLASS_FLIGHT] = list.get(i).getSalidaLlegada();
                datos[i][Constants.DATE_FLIGHT] = list.get(i).getFecha();
                datos[i][Constants.TIME_FLIGHT] = list.get(i).getHora();
                datos[i][Constants.MODEL_PLANE_FLIGHT] = list.get(i).getModeloAvion();
                datos[i][Constants.CAPACITY_PLANE_FLIGHT] = list.get(i).getCapacidadCarga();
                datos[i][Constants.CREW_PLANE_FLIGHT] = list.get(i).getTripulaci??n();
                datos[i][Constants.DESTINATION_PLANE_FLIGHT] = list.get(i).getDestino();
            }        
        }        
        String[] columns = {
            "CODIGO", "TIPO", "CLASE", "FECHA", "HORA", "MODELO A.", "CAPACIDAD A.", "TRIPULACION", "DESTINO"
        };
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblCancelar.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblCancelar.setRowHeight(30);
        tblCancelar.setModel(model);
        //tblCancelar.setEnabled(false);
     }
    
    private void fillDataTableAgenda() {
         
        listA = controllerA.listFlightAgenda();
        String datos[][] = new String[listA.size()][9];
        
        if(listA.size() > 0) {
            for (int i = 0; i < listA.size(); i++) {
                datos[i][Constants.CODE_FLIGHT_AGENDA] = listA.get(i).getCodigoVueloAgenda();
                datos[i][Constants.TYPE_FLIGHT_AGENDA] = listA.get(i).getTipoVuelo();
                datos[i][Constants.CLASS_FLIGHT_AGENDA] = listA.get(i).getClaseVuelo();
                datos[i][Constants.CREW_AGENDA_CANCELAR] = listA.get(i).getTripulaci??n();
                datos[i][Constants.DESTINATION_AGENDA] = listA.get(i).getDestino();
                datos[i][Constants.PISTA_AGENDA] = listA.get(i).getPista();
                datos[i][Constants.DATE_FLIGHT_AGENDA] = listA.get(i).getFecha();
                datos[i][Constants.TIME_FLIGHT_AGENDA] = listA.get(i).getTiempo();
                datos[i][Constants.ID_AIRLINE_CANCELAR] = listA.get(i).getIdAerolinea();
            }        
        }        
        String[] columns = {
            "CODIGO", "TIPO", "CLASE", "TRIPULACI??N", "DESTINO", "FECHA", "HORA", "PISTA DE AVI??N", "ID AEROLINEA"
        };
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblCancelar.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblCancelar.setRowHeight(30);
        tblCancelar.setModel(model);
        //tblCancelar.setEnabled(false);
    } 
    
    private void tblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCancelarMouseClicked
        int row = tblCancelar.getSelectedRow();
        String id = tblCancelar.getValueAt(row, 0).toString();

        
    }//GEN-LAST:event_tblCancelarMouseClicked

    private void btnVuelosSolicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosSolicitadosActionPerformed
        
        if(btnVuelosSolicitados.isSelected() == true){
            btnVuelosAgendados.setSelected(false);
            
            lbVueloTITLE.setText("Vuelos solicitados");
            
            fillDataTable();
        }
        else{
            
            if(btnVuelosSolicitados.isSelected() == false && btnVuelosAgendados.isSelected()==false){
                String[] columns = {
                "CODIGO", "TIPO", "CLASE", "TRIPULACI??N", "DESTINO", "FECHA", "HORA", "PISTA DE AVI??N", "ID AEROLINEA"
                };
                DefaultTableModel model = new DefaultTableModel(null, columns);
                int[] columnSize = {30, 50, 50, 50, 50, 50, 50, 50, 50};
                for(int x=0; x<columnSize.length;x++)
                    tblCancelar.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
                tblCancelar.setRowHeight(30);
                tblCancelar.setModel(model);

                lbVueloTITLE.setText("Vuelos");
            
            } 
        }
    }//GEN-LAST:event_btnVuelosSolicitadosActionPerformed

    private void btnVuelosAgendadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosAgendadosActionPerformed
        
        if(btnVuelosAgendados.isSelected() == true){
            btnVuelosSolicitados.setSelected(false);
            
            lbVueloTITLE.setText("Vuelos agendados");
            
            fillDataTableAgenda();
        }
        
        else{
            
            if(btnVuelosSolicitados.isSelected() == false && btnVuelosAgendados.isSelected()==false){
                String[] columns = {
                "CODIGO", "TIPO", "CLASE", "TRIPULACI??N", "DESTINO", "FECHA", "HORA", "PISTA DE AVI??N", "ID AEROLINEA"
                };
                DefaultTableModel model = new DefaultTableModel(null, columns);
                int[] columnSize = {30, 50, 50, 50, 50, 50, 50, 50, 50};
                for(int x=0; x<columnSize.length;x++)
                    tblCancelar.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
                tblCancelar.setRowHeight(30);
                tblCancelar.setModel(model);

                lbVueloTITLE.setText("Vuelos");
            
            } 
        }
    }//GEN-LAST:event_btnVuelosAgendadosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtAreaCancelacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        if(btnVuelosAgendados.isSelected() == false && btnVuelosSolicitados.isSelected() == false){
            JOptionPane.showMessageDialog(this, "??Debe seleccionar un tipo vuelo para poderlo cancelar!");
        }
        
        else{
            if(tblCancelar.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "??Debe seleccionar un vuelo para poderlo cancelar!");
            }
            
            else{
                
                if(tblCancelar.getSelectedRow() != -1){
                    
                    int fila = tblCancelar.getSelectedRow();
                    String valor = tblCancelar.getValueAt(fila, 0).toString();

                    if(btnVuelosSolicitados.isSelected() == true ){

                        clsFlightRequirements  FlightCancel = new clsFlightRequirements(0, valor, "modelo avion", "Tipo vuelo", "clase vuelo", "capacidad carga", "tripulacion", "fecha", "hora", "Destino");

                        if(!"".equals(txtAreaCancelacion.getText())){
                            
                            if(!"".equals(txtAreaCancelacion.getText())){
                                
                                int respuesta = JOptionPane.showConfirmDialog(this, "??Est?? seguro que desea cancelar el vuelo?");
                                if (respuesta == JOptionPane.OK_OPTION) {

                                    clsFlightRequirements read = controller.readFlightRequirements(valor);
                            
                                    String tipo = read.getTipoVuelo();
                                    String clase = read.getSalidaLlegada();
                                    String capacidad = read.getCapacidadCarga();
                                    String fecha = read.getFecha();
                                    String hora = read.getHora();
                                    String destino = read.getDestino();
                                    String tripulaci??n = read.getTripulaci??n();
                                    String modeloA = read.getModeloAvion();
                                    String descripcion = txtAreaCancelacion.getText();
                                    String descripcionCancelacion = "Vuelo cancelado por aerolinea" + "\n" + "\n" + txtAreaCancelacion.getText();

                                    
                                    clsType_Flight typeFlightD = controllerA.readTypeFlight(valor);
                                    String Type = typeFlightD.getType();
                                    String Code = typeFlightD.getCodeFlight();

                                    if(Code.equals(valor) && Type.equals("Vuelo solicitado")){
                                        controllerA.deleteTypeFlight(typeFlightD);
                                    }
                                    
                                    clsType_Flight typeFlight = new clsType_Flight(0, valor, "Vuelo cancelado");
                            
                                    controllerA.createType_flight(typeFlight);
                                        
                                        
                                    clsFlightCancelationAirline flightCanceled = new clsFlightCancelationAirline(0, valor, modeloA, tipo, clase, capacidad, tripulaci??n, fecha, hora, destino, descripcionCancelacion, "1");
                                    controller.createFlightCanceled(flightCanceled);
                                    
                                    if (controller.deleteFlight(FlightCancel)) {
                                    
                                        JOptionPane.showMessageDialog(this, "Vuelo cancelado con ??xito.");
                                        btnVuelosSolicitados.setSelected(false);
                                        fillDataTable();
                                        txtAreaCancelacion.setText("");
                                    }
                                }
                                else {
                                    JOptionPane.showMessageDialog(this, "Ocurri?? un error al cancelar, por favor verifique los datos");
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "??Debe especificar las razones para cancelar un vuelo!");
                        }
                    }
                    else {

                        if(btnVuelosAgendados.isSelected() == true){
    
                            clsFlightAgenda flightAgendaCancel = new clsFlightAgenda(0, valor, "", "", "", "", "", "", "", "");
                            
                            if(!"".equals(txtAreaCancelacion.getText())){
                                
                                int respuesta = JOptionPane.showConfirmDialog(this, "??Est?? seguro que desea cancelar el vuelo?");
    
                                if (respuesta == JOptionPane.OK_OPTION) {
                                    
                                    clsFlightAgenda read = controllerA.readFlightAgenda(valor);
                            
                                    String tipo = read.getTipoVuelo();
                                    String clase = read.getClaseVuelo();
                                    String fecha = read.getFecha();
                                    String hora = read.getTiempo();
                                    String destino = read.getDestino();
                                    String tripulaci??n = read.getTripulaci??n();
                                    String pista = read.getPista();
                                    String descripcion = txtAreaCancelacion.getText();
                                    String descripcionCancelacion = "Vuelo cancelado por aerolinea" + "\n" + "\n" + txtAreaCancelacion.getText();
                                    
                                    clsType_Flight typeFlightD = controllerA.readTypeFlight(valor);
                                    String Type = typeFlightD.getType();
                                    String Code = typeFlightD.getCodeFlight();

                                    if(Code.equals(valor) && Type.equals("Vuelo agendado")){
                                        controllerA.deleteTypeFlight(typeFlightD);
                                    }
                                    
                                    clsType_Flight typeFlight = new clsType_Flight(0, valor, "Vuelo cancelado");
                            
                                    controllerA.createType_flight(typeFlight);

                                    clsFlightCancelationAgenda flightCanceled = new clsFlightCancelationAgenda(0, valor, tipo, clase, tripulaci??n, destino, pista, fecha, hora, descripcionCancelacion, "1");
                                    controllerA.createFlightAgendaCancelation(flightCanceled);

                                    if (controllerA.deleteFlight(flightAgendaCancel)) {
                                        JOptionPane.showMessageDialog(this, "Vuelo cancelado con ??xito.");
                                        btnVuelosAgendados.setSelected(false);
                                        btnVuelosSolicitados.setSelected(true);
                                        fillDataTable();
                                        txtAreaCancelacion.setText("");
                                    }
                                } 
                                else {
                                    JOptionPane.showMessageDialog(this, "Ocurri?? un error al cancelar, por favor verifique los datos");

                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "??Debe especificar las razones para cancelar un vuelo!");
                            }
                            
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "error");
                }
            }
        } 
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JRadioButton btnVuelosAgendados;
    private javax.swing.JRadioButton btnVuelosSolicitados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbVueloS8;
    private javax.swing.JLabel lbVueloTITLE;
    private javax.swing.JTable tblCancelar;
    private javax.swing.JTextArea txtAreaCancelacion;
    // End of variables declaration//GEN-END:variables
}
