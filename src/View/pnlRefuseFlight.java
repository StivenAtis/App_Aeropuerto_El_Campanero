package View;

import Classes.clsDeniedFlights;
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
public class pnlRefuseFlight extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    private ctlFlightRequirement controller = null;
    private ctlFlightAgenda controllerA = null;
    private LinkedList<clsFlightRequirements> list;
    
    //--------------------------------------------------------------------------
    
    public pnlRefuseFlight() {
        initComponents();
        controller = new ctlFlightRequirement();
        controllerA = new ctlFlightAgenda();
        fillDataTable();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVueloS = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudes = new javax.swing.JTable();
        lbVueloS8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaRechazo = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Vuelos Solicitados");
        lbVueloS.setToolTipText("");
        add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 40));

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

        tblSolicitudes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Tipo", "Clase", "Fecha", "Hora", "null", "null", "null", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        tblSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSolicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSolicitudes);
        if (tblSolicitudes.getColumnModel().getColumnCount() > 0) {
            tblSolicitudes.getColumnModel().getColumn(0).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(1).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(2).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(3).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(4).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(5).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(6).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(7).setResizable(false);
            tblSolicitudes.getColumnModel().getColumn(8).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1160, 190));

        lbVueloS8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS8.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS8.setText("Motivo por el cual se rechaza el vuelo");
        lbVueloS8.setToolTipText("");
        add(lbVueloS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 1160, 40));

        txtAreaRechazo.setColumns(20);
        txtAreaRechazo.setRows(5);
        jScrollPane2.setViewportView(txtAreaRechazo);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 1160, 160));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/rechazar_min.png"))); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/rechazar_min.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/rechazar_max.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 330, 120));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Rechazar vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
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
                datos[i][Constants.CREW_PLANE_FLIGHT] = list.get(i).getTripulación();
                datos[i][Constants.DESTINATION_PLANE_FLIGHT] = list.get(i).getDestino();
            }        
        }        
        String[] columns = {
            "CODIGO", "TIPO", "CLASE", "FECHA", "HORA", "MODELO A.", "CAPACIDAD A.", "TRIPULACION", "DESTINO"
        };
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblSolicitudes.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblSolicitudes.setRowHeight(30);
        tblSolicitudes.setModel(model);
    }
    
    //--------------------------------------------------------------------------
    
    private void tblSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSolicitudesMouseClicked
        int row = tblSolicitudes.getSelectedRow();
        String id = tblSolicitudes.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblSolicitudesMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        if(tblSolicitudes.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un vuelo para poderlo rechazar!");
        }
        else{
                
            if(tblSolicitudes.getSelectedRow() != -1){

                int fila = tblSolicitudes.getSelectedRow();
                String valor = tblSolicitudes.getValueAt(fila, 0).toString();

                clsFlightRequirements  FlightCancel = new clsFlightRequirements(0, valor, "modelo avion", "Tipo vuelo", "clase vuelo", "capacidad carga", "tripulacion", "fecha", "hora", "Destino");

                if(!"".equals(txtAreaRechazo.getText())){

                    if(!"".equals(txtAreaRechazo.getText())){

                        int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea rechazar el vuelo?");
                        if (respuesta == JOptionPane.OK_OPTION) {
                            
                            clsFlightRequirements read = controller.readFlightRequirements(valor);
                            
                            String tipo = read.getTipoVuelo();
                            String clase = read.getSalidaLlegada();
                            String capacidad = read.getCapacidadCarga();
                            String fecha = read.getFecha();
                            String hora = read.getHora();
                            String destino = read.getDestino();
                            String tripulación = read.getTripulación();
                            String modeloA = read.getModeloAvion();
                            String descripcion = txtAreaRechazo.getText();

                            clsType_Flight typeFlightD = controllerA.readTypeFlight(valor);
                                    String Type = typeFlightD.getType();
                                    String Code = typeFlightD.getCodeFlight();

                                    if(Code.equals(valor) && Type.equals("Vuelo solicitado")){
                                        controllerA.deleteTypeFlight(typeFlightD);
                                    }
                            
                            clsType_Flight typeFlight = new clsType_Flight(0, valor, "Vuelo rechazado");
                            
                            controllerA.createType_flight(typeFlight);
                                
                                
                            clsDeniedFlights flightDeined = new clsDeniedFlights(0, valor, tipo, clase, fecha, hora, modeloA, capacidad, tripulación, destino, descripcion, "1");
                            controller.createFlightDenied(flightDeined);
                                
                            if (controller.deleteFlight(FlightCancel)) {
                                
                                JOptionPane.showMessageDialog(this, "Vuelo rechazado con éxito.");
                                fillDataTable();
                                txtAreaRechazo.setText("");
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(this, "Ocurrió un error al rechazar, por favor verifique los datos");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "¡Debe especificar las razones para rechazar un vuelo!");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "error");
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtAreaRechazo.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbVueloS;
    private javax.swing.JLabel lbVueloS8;
    private javax.swing.JTable tblSolicitudes;
    private javax.swing.JTextArea txtAreaRechazo;
    // End of variables declaration//GEN-END:variables
}
