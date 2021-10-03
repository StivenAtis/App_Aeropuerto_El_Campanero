package View;

import Classes.clsDeniedFlights;
import Controller.ctlFlightAgenda;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import utils.Constants;

/**
 *
 * @author Booh
 */
public class pnlDeclinedFlights extends javax.swing.JPanel {
    
    //--------------------------------------------------------------------------
    
    private ctlFlightAgenda controller = null;
    private LinkedList<clsDeniedFlights> list;

    //--------------------------------------------------------------------------
    
    public pnlDeclinedFlights() {
        initComponents();
        controller = new ctlFlightAgenda();
        fillDataTable();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuelosDenegados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAInfoSolicitud = new javax.swing.JTextArea();
        lbCdigoVuelo4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVuelosDenegados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblVuelosDenegados.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Clase", "Fecha", "Hora", "Modelo A.", "Capacidad A.", "Tripulación", "Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblVuelosDenegados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVuelosDenegadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVuelosDenegados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 1160, 290));

        txtAInfoSolicitud.setColumns(20);
        txtAInfoSolicitud.setRows(5);
        txtAInfoSolicitud.setFocusable(false);
        jScrollPane2.setViewportView(txtAInfoSolicitud);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 1160, 270));

        lbCdigoVuelo4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo4.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo4.setText("Información sobre el rechazo del vuelo");
        lbCdigoVuelo4.setToolTipText("");
        add(lbCdigoVuelo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 390, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vuelos rechazados");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void tblVuelosDenegadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVuelosDenegadosMouseClicked
        
        int row = tblVuelosDenegados.getSelectedRow();
        String id = tblVuelosDenegados.getValueAt(row, 0).toString();
        
        clsDeniedFlights FlightRequirementsSearch = controller.readDeniedFlightAgenda(id);
        
        String info = FlightRequirementsSearch.getDespricion();
        
        txtAInfoSolicitud.setText(info);
    }//GEN-LAST:event_tblVuelosDenegadosMouseClicked

    //--------------------------------------------------------------------------
    
    private void fillDataTable() {
         
        list = controller.listFlightDenied();
        String datos[][] = new String[list.size()][9];
        
        if(list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                datos[i][Constants.CODE_FLIGHT_DENIED] = list.get(i).getCodigoVueloAgenda();
                datos[i][Constants.TYPE_FLIGHT_DENIED] = list.get(i).getTipoVuelo();
                datos[i][Constants.CLASS_FLIGHT_DENIED] = list.get(i).getLlegadaSalida();
                datos[i][Constants.DATE_FLIGHT_DENIED] = list.get(i).getFecha();
                datos[i][Constants.TIME_FLIGHT_DENIED] = list.get(i).getHora();
                datos[i][Constants.MODEL_FLIGHT_DENIED] = list.get(i).getModeloAvion();
                datos[i][Constants.CAPACITY_FLIGHT_DENIED] = list.get(i).getCapacidadAvion();
                datos[i][Constants.CREW_FLIGHT_DENIED] = list.get(i).getTripulación();
                datos[i][Constants.DESTINY_FLIGHT_DENIED] = list.get(i).getDestino();
            }        
        }        
        String[] columns = {
            "CODIGO", "TIPO", "CLASE", "FECHA", "HORA", "MODELO AVION", "CAPACIDAD AVION", "TRIPULACION", "DESTINO"
        };
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblVuelosDenegados.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblVuelosDenegados.setRowHeight(30);
        tblVuelosDenegados.setModel(model);
    } 
    
    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCdigoVuelo4;
    private javax.swing.JTable tblVuelosDenegados;
    private javax.swing.JTextArea txtAInfoSolicitud;
    // End of variables declaration//GEN-END:variables
}
