package View;

import Classes.clsFlightAgenda;
import Classes.clsFlightCancelationAgenda;
import Controller.ctlFlightAgenda;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Constants;

/**
 *
 * @author Booh
 */
public class pnlCancelFlightAirport extends javax.swing.JPanel {

    private ctlFlightAgenda controller = null;
    private LinkedList<clsFlightAgenda> list;
    
    public pnlCancelFlightAirport() {
        initComponents();
        controller = new ctlFlightAgenda();
        fillDataTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lbVueloS = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancelar = new javax.swing.JTable();
        lbVueloS8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaCancelacion = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cancelar vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 90));

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Vuelos Agendados");
        lbVueloS.setToolTipText("");
        add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 40));

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
                "Codigo", "Tipo", "Clase", "Fecha", "Hora", "null", "null", "Destino", "Pista de avión"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1160, 190));

        lbVueloS8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS8.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS8.setText("Motivo de cancelación de vuelo");
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 730));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void tblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCancelarMouseClicked
        int row = tblCancelar.getSelectedRow();
        String id = tblCancelar.getValueAt(row, 0).toString();

    }//GEN-LAST:event_tblCancelarMouseClicked

    //--------------------------------------------------------------------------
    
    private void fillDataTable() {
         
        list = controller.listFlightAgenda();
        String datos[][] = new String[list.size()][7];
        
        if(list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                datos[i][Constants.CODE_FLIGHT_AGENDA] = list.get(i).getCodigoVueloAgenda();
                datos[i][Constants.TYPE_FLIGHT_AGENDA] = list.get(i).getTipoVuelo();
                datos[i][Constants.CLASS_FLIGHT_AGENDA] = list.get(i).getClaseVuelo();
                datos[i][Constants.DATE_FLIGHT_AGENDA] = list.get(i).getFecha();
                datos[i][Constants.TIME_FLIGHT_AGENDA] = list.get(i).getTiempo();
                datos[i][Constants.DESTINATION_AGENDA] = list.get(i).getDestino();
                datos[i][Constants.PISTA_AGENDA] = list.get(i).getPista();
            }        
        }        
        String[] columns = {
            "CODIGO", "TIPO", "CLASE", "FECHA", "HORA", "DESTINO", "PISTA DE AVIÓN"
        };
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblCancelar.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblCancelar.setRowHeight(30);
        tblCancelar.setModel(model);
    } 
    
    //--------------------------------------------------------------------------
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

            if(tblCancelar.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un vuelo para poderlo cancelar!");
            }

            else{

                if(tblCancelar.getSelectedRow() != -1){

                    int fila = tblCancelar.getSelectedRow();
                    String valor = tblCancelar.getValueAt(fila, 0).toString();

                        clsFlightAgenda flightAgendaCancel = new clsFlightAgenda(0, valor, "", "", "", "", "", "", "", "");
                            
                            if(!"".equals(txtAreaCancelacion.getText())){
                                
                                int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cancelar el vuelo?");
    
                                if (respuesta == JOptionPane.OK_OPTION) {
                                    
                                    clsFlightAgenda read = controller.readFlightAgenda(valor);
                            
                                    String tipo = read.getTipoVuelo();
                                    String clase = read.getClaseVuelo();
                                    String fecha = read.getFecha();
                                    String hora = read.getTiempo();
                                    String destino = read.getDestino();
                                    String tripulación = read.getTripulación();
                                    String pista = read.getPista();
                                    String descripcion = txtAreaCancelacion.getText();
                                    String descripcionCancelacion = "Vuelo cancelado por aeropuerto" + "\n" + "\n" + txtAreaCancelacion.getText();

                                    clsFlightCancelationAgenda flightCanceled = new clsFlightCancelationAgenda(0, valor, tipo, clase, tripulación, destino, pista, fecha, hora, descripcionCancelacion, "1");
                                    controller.createFlightAgendaCancelation(flightCanceled);

                                    if (controller.deleteFlight(flightAgendaCancel)) {
                                        JOptionPane.showMessageDialog(this, "Vuelo cancelado con éxito.");
                                        fillDataTable();
                                        txtAreaCancelacion.setText("");
                                    }
                                } 
                                else {
                                    JOptionPane.showMessageDialog(this, "Ocurrió un error al cancelar, por favor verifique los datos");

                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "¡Debe especificar las razones para cancelar un vuelo!");
                            }
                }
                else{
                    JOptionPane.showMessageDialog(this, "error");
                }
            }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtAreaCancelacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


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
    private javax.swing.JTable tblCancelar;
    private javax.swing.JTextArea txtAreaCancelacion;
    // End of variables declaration//GEN-END:variables
}
