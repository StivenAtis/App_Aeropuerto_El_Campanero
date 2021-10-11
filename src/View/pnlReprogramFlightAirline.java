package View;

import Classes.clsFlightRequerimentsReprogramation;
import Classes.clsFlightRequirements;
import Controller.ctlFlightRequirement;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Constants;

/**
 *
 * @author Booh
 */
public class pnlReprogramFlightAirline extends javax.swing.JPanel {
    
    private ctlFlightRequirement controller = null;
    private LinkedList<clsFlightRequirements> list;
    LocalDate currentDate = LocalDate.now();

    public pnlReprogramFlightAirline() {
        initComponents();
        controller = new ctlFlightRequirement();
        fillDataTable();
        bloqueo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chboxVueloPasajeros = new javax.swing.JCheckBox();
        chboxVueloCarga = new javax.swing.JCheckBox();
        chboxVueloLlegada = new javax.swing.JCheckBox();
        chboxVueloSalida = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudes = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        lbVueloS = new javax.swing.JLabel();
        lbVueloS3 = new javax.swing.JLabel();
        comboBoxMonthFirst = new javax.swing.JComboBox<>();
        comboBoxDayFirst = new javax.swing.JComboBox<>();
        comboBoxYearFirst = new javax.swing.JComboBox<>();
        lbVueloS9 = new javax.swing.JLabel();
        comboBoxMinutesFirst = new javax.swing.JComboBox<>();
        comboBoxHourFirst = new javax.swing.JComboBox<>();
        btnReprogramar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaReprogramacion = new javax.swing.JTextArea();
        btnActualizarDatos = new javax.swing.JRadioButton();
        lbEmailUserLogin6 = new javax.swing.JLabel();
        comboBoxTripulacionVuelo = new javax.swing.JComboBox<>();
        comboBoxCapacidadAvion = new javax.swing.JComboBox<>();
        lbEmailUserLogin5 = new javax.swing.JLabel();
        lbEmailUserLogin2 = new javax.swing.JLabel();
        comboboxModeloAvion = new javax.swing.JComboBox<>();
        comboBoxDestino = new javax.swing.JComboBox<>();
        lbCdigoVuelo = new javax.swing.JLabel();
        lbVueloS8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chboxVueloPasajeros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloPasajeros.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloPasajeros.setText("Vuelo de pasajeros");
        chboxVueloPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloPasajerosActionPerformed(evt);
            }
        });
        add(chboxVueloPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 160, 40));

        chboxVueloCarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloCarga.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloCarga.setText("Vuelo de carga");
        chboxVueloCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloCargaActionPerformed(evt);
            }
        });
        add(chboxVueloCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, 160, 40));

        chboxVueloLlegada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloLlegada.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloLlegada.setText("Vuelo de llegada");
        chboxVueloLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloLlegadaActionPerformed(evt);
            }
        });
        add(chboxVueloLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, 160, 40));

        chboxVueloSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloSalida.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloSalida.setText("Vuelo de salida");
        chboxVueloSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloSalidaActionPerformed(evt);
            }
        });
        add(chboxVueloSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reprogramar vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 90));

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
        tblSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSolicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSolicitudes);

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 650, 330, 110));

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Vuelos Solicitados");
        lbVueloS.setToolTipText("");
        add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 40));

        lbVueloS3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS3.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS3.setText("Fecha");
        lbVueloS3.setToolTipText("");
        add(lbVueloS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 120, 40));

        comboBoxMonthFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonthFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        add(comboBoxMonthFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 120, 40));

        comboBoxDayFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDayFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(comboBoxDayFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, 120, 40));

        comboBoxYearFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYearFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        add(comboBoxYearFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 120, 40));

        lbVueloS9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS9.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS9.setText("Hora");
        lbVueloS9.setToolTipText("");
        add(lbVueloS9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 120, 40));

        comboBoxMinutesFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutesFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(comboBoxMinutesFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 120, 40));

        comboBoxHourFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHourFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        add(comboBoxHourFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 120, 40));

        btnReprogramar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramar_min.png"))); // NOI18N
        btnReprogramar.setContentAreaFilled(false);
        btnReprogramar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramar_min.png"))); // NOI18N
        btnReprogramar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprograr_max.png"))); // NOI18N
        btnReprogramar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprogramarActionPerformed(evt);
            }
        });
        add(btnReprogramar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, 330, 110));

        txtAreaReprogramacion.setColumns(20);
        txtAreaReprogramacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaReprogramacion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 310, 200));

        btnActualizarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDatos.setText("Actualizar datos de vuelo");
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });
        add(btnActualizarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, -1, 40));

        lbEmailUserLogin6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin6.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin6.setText("Tripulación de vuelo");
        lbEmailUserLogin6.setToolTipText("");
        add(lbEmailUserLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 210, 40));

        comboBoxTripulacionVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxTripulacionVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tripulación de vuelo", "Piloto", "piloto y copiloto" }));
        add(comboBoxTripulacionVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 290, 40));

        comboBoxCapacidadAvion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión" }));
        add(comboBoxCapacidadAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 290, 40));

        lbEmailUserLogin5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin5.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin5.setText("Capacidad de avión");
        lbEmailUserLogin5.setToolTipText("");
        add(lbEmailUserLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 210, 40));

        lbEmailUserLogin2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin2.setText("Modelo de avión");
        lbEmailUserLogin2.setToolTipText("");
        add(lbEmailUserLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 190, 40));

        comboboxModeloAvion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo de avión" }));
        add(comboboxModeloAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 290, 40));

        comboBoxDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Destino", "Afganistán - Kabul - Asia", "Albania - Tirana - Europa", "Alemania - Berlín - Europa", "Andorra - Andorra la Vieja - Europa", "Angola - Luanda - África", "Antigua y Barbuda - Saint John - América", "Arabia Saudita - Riad - Asia", "Argelia - Argel - África", "Argentina - Buenos Aires - América", "Armenia - Ereván - Asia", "Australia - Canberra - Oceanía", "Austria - Viena - Europa", "Azerbaiyán - Bakú - Asia", "Bahamas - Nasáu - América", "Bangladés - Daca - Asia", "Barbados - Bridgetown - América", "Baréin - Manama - Asia", "Bélgica - Bruselas - Europa", "Belice - Belmopán - América", "Benín - Porto - Novo - África", "Bielorrusia - Minsk - Europa", "Birmania - Naipyidó - Asia", "Bolivia - Sucre - América", "Bosnia - Herzegovina - Sarajevo - Europa", "Botsuana - Gaborone - África", "Brasil - Brasilia - América", "Brunéi - Bandar Seri Begawan - Asia", "Bulgaria - Sofía - Europa", "Burkina Faso - Uagadugú - África", "Burundi - Buyumbura - África", "Bután - Thimphu - Asia", "Cabo Verde - Praia - África", "Camboya - Nom Pen - Asia", "Camerún - Yaundé - África", "Canadá - Ottawa - América", "Catar - Doha - Asia", "Chad - Yamena - África", "Chile - Santiago - América", "China - Pekín - Asia", "Chipre - Nicosia - Europa", "Colombia - Bogotá - América", "Comoras - Moroni - África", "Congo - Brazzaville - África", "Corea del Norte - Pionyang - Asia", "Corea del Sur - Seúl - Asia", "Costa de Marfil - Yamusukro - África", "Costa Rica - San José - América", "Croacia - Zagreb - Europa", "Cuba - La Habana - América", "Dinamarca - Copenhague - Europa", "Dominica - Roseau - América", "Ecuador - Quito - América", "Egipto - El Cairo - África", "El Salvador - San Salvador - América", "Emiratos Árabes Unidos - Abu Dabi - Asia", "Eritrea - Asmara - África", "Eslovaquia - Bratislava - Europa", "Eslovenia - Liubliana - Europa", "España - Madrid - Europa" }));
        add(comboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 290, 40));

        lbCdigoVuelo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo.setText("Destino");
        lbCdigoVuelo.setToolTipText("");
        add(lbCdigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 180, 40));

        lbVueloS8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS8.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS8.setText("Motivo de reprogramación");
        lbVueloS8.setToolTipText("");
        add(lbVueloS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 310, 40));

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
    
    
    private void chboxVueloPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloPasajerosActionPerformed
        if(chboxVueloPasajeros.isSelected() == true){

            chboxVueloCarga.setSelected(false);

            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
                { "Modelo de avión", "YV-305", "YV-366", "YX-578", "ZX-825", "AX-179", "GB-780", "UF-555", "HJ-034", "QW-826", "MK-340", "ZM-001", "VJ-931", "LP-895", "QK-428"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión", "50", "80", "100", "150", "200", "250", "280" }));
        }
        else if (chboxVueloPasajeros.isSelected() == false){
            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión", }));
            comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión" }));
        }
    }//GEN-LAST:event_chboxVueloPasajerosActionPerformed

    private void chboxVueloCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloCargaActionPerformed
        if(chboxVueloCarga.isSelected() == true){

            chboxVueloPasajeros.setSelected(false);

            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
                { "Modelo de avión", "QWE-309", "WED-321", "FGF-654", "ZXC-987", "VCB-960", "DEF-710", "TYG-001", "QWS-450", "XZC-606", "CDV-005", "SWD-300", "SSD-898", "BGM-568", "TYJ-124"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión", "350", "500", "600", "700", "800", "950", "1060" }));
        }
        else if (chboxVueloPasajeros.isSelected() == false){
            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión", }));
            comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión" }));
        }
    }//GEN-LAST:event_chboxVueloCargaActionPerformed

    private void chboxVueloSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloSalidaActionPerformed
        if(chboxVueloSalida.isSelected() == true){
            chboxVueloLlegada.setSelected(false);
        }
    }//GEN-LAST:event_chboxVueloSalidaActionPerformed

    private void chboxVueloLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloLlegadaActionPerformed
        if(chboxVueloLlegada.isSelected() == true){
            chboxVueloSalida.setSelected(false);
        }
    }//GEN-LAST:event_chboxVueloLlegadaActionPerformed

    private void tblSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSolicitudesMouseClicked
        int row = tblSolicitudes.getSelectedRow();
        String id = tblSolicitudes.getValueAt(row, 0).toString();
        
        clsFlightRequirements FlightRequirementsSearch = controller.readFlightRequirements(id);
        
        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida")) {

            chboxVueloSalida.setSelected(true);
            chboxVueloLlegada.setSelected(false);

            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());
            comboBoxDestino.setSelectedItem(FlightRequirementsSearch.getDestino());
        }
        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada")) {
                    
            chboxVueloLlegada.setSelected(true);
            chboxVueloSalida.setSelected(false);

            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());
            comboBoxDestino.setSelectedItem(FlightRequirementsSearch.getDestino());
         
        }
    }//GEN-LAST:event_tblSolicitudesMouseClicked

    private void bloqueo(){
        comboBoxCapacidadAvion.setEnabled(false);
        comboBoxDestino.setEnabled(false);
        comboBoxTripulacionVuelo.setEnabled(false);
        comboboxModeloAvion.setEnabled(false);
        chboxVueloCarga.setEnabled(false);
        chboxVueloPasajeros.setEnabled(false);
        chboxVueloSalida.setEnabled(false);
        chboxVueloLlegada.setEnabled(false);
    }
    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed
        
        if (btnActualizarDatos.isSelected() == false){
            
            comboBoxCapacidadAvion.setEnabled(false);
            comboBoxDestino.setEnabled(false);
            comboBoxTripulacionVuelo.setEnabled(false);
            comboboxModeloAvion.setEnabled(false);
            chboxVueloCarga.setEnabled(false);
            chboxVueloPasajeros.setEnabled(false);
            chboxVueloSalida.setEnabled(false);
            chboxVueloLlegada.setEnabled(false);
        }
        else{
            if(btnActualizarDatos.isSelected() == true){
                comboBoxCapacidadAvion.setEnabled(true);
                comboBoxDestino.setEnabled(true);
                comboBoxTripulacionVuelo.setEnabled(true);
                comboboxModeloAvion.setEnabled(true);
                chboxVueloCarga.setEnabled(true);
                chboxVueloPasajeros.setEnabled(true);
                chboxVueloSalida.setEnabled(true);
                chboxVueloLlegada.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxTripulacionVuelo.setSelectedIndex(0);
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión"}));
        comboBoxYearFirst.setSelectedIndex(0);
        comboBoxMonthFirst.setSelectedIndex(0);
        comboBoxDayFirst.setSelectedIndex(0);
        comboBoxHourFirst.setSelectedIndex(0);
        comboBoxMinutesFirst.setSelectedIndex(0);
        comboBoxDestino.setSelectedIndex(0);
        txtAreaReprogramacion.setText("");
        btnActualizarDatos.setSelected(false);
        bloqueo();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnReprogramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprogramarActionPerformed
        
        if (btnActualizarDatos.isSelected() == false){
            
            if(tblSolicitudes.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un vuelo para poderlo cancelar!");
            }
            else{
                
                int row = tblSolicitudes.getSelectedRow();
                String codigo = tblSolicitudes.getValueAt(row, 0).toString();
                
                String anio = comboBoxYearFirst.getSelectedItem().toString();
                String mes = comboBoxMonthFirst.getSelectedItem().toString();
                String dia = comboBoxDayFirst.getSelectedItem().toString();
                String hora = comboBoxHourFirst.getSelectedItem().toString();
                String minuto = comboBoxMinutesFirst.getSelectedItem().toString();
                
                if(anio.equals("Year") || mes.equals("Month") || dia.equals("Day")){
                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar una fecha valida!");
                }
                if(hora.equals("Hour") || minuto.equals("Minutes")){
                    JOptionPane.showMessageDialog(this, "¡Debe ingresar una hora valida del vuelo!");
                }
                if(txtAreaReprogramacion.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "¡Debe añadir un motivo para la reprogramación del vuelo!");
                }
                
                else{   
                    String anioVuelo = comboBoxYearFirst.getSelectedItem().toString();
                    String mesVuelo = comboBoxMonthFirst.getSelectedItem().toString();
                    String diaVuelo = comboBoxDayFirst.getSelectedItem().toString();
                    String horaVuelo = comboBoxHourFirst.getSelectedItem().toString();
                    String minutoVuelo = comboBoxMinutesFirst.getSelectedItem().toString();
                    String mesNumber = "";
                        
                    if(mesVuelo.equals("January")){
                            mesNumber = "1";
                        }
                        if(mesVuelo.equals("February")){
                            mesNumber = "2";
                        }
                        if(mesVuelo.equals("March")){
                            mesNumber = "3";
                        }
                        if(mesVuelo.equals("April")){
                            mesNumber = "4";
                        }
                        if(mesVuelo.equals("may")){
                            mesNumber = "5";
                        }
                        if(mesVuelo.equals("June")){
                            mesNumber = "6";
                        }
                        if(mesVuelo.equals("July")){
                            mesNumber = "7";
                        }
                        if(mesVuelo.equals("August")){
                            mesNumber = "8";
                        }
                        if(mesVuelo.equals("September")){
                            mesNumber = "9";
                        }
                        if(mesVuelo.equals("October")){
                            mesNumber = "10";
                        }
                        if(mesVuelo.equals("November")){
                            mesNumber = "11";
                        }
                        if(mesVuelo.equals("December")){
                            mesNumber = "12";
                        }

                        String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
                        String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
                        
                         if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                        }
                        else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                        }
                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                        }
                        
                        else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){

                            clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, "", "", "", "", "", fecha, tiempo, "");
                            
                            
                            clsFlightRequirements read = controller.readFlightRequirements(codigo);
                            
                            String tipo = read.getTipoVuelo();
                            String clase = read.getSalidaLlegada();
                            String capacidad = read.getCapacidadCarga();
                            String destino = read.getDestino();
                            String tripulación = read.getTripulación();
                            String modeloA = read.getModeloAvion();
                            String descripcion = txtAreaReprogramacion.getText();
                            String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                            clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                    (0, codigo, tipo, clase, tripulación, destino, capacidad, modeloA, fecha, tiempo, descripcionCancelacion, "1");
                            controller.createFlightReprogramation(flightReprogramation);
                            
                            
                            if(controller.updateFlightResquest(FlightRequirements_update)){
                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                fillDataTable();
                                cleanRegisterQuestionnaire();
                            }
                            else {
                              JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                            }
                          
                        }
                        else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                            clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, "", "", "", "", "", fecha, tiempo, "");

                            
                            clsFlightRequirements read = controller.readFlightRequirements(codigo);
                            
                            String tipo = read.getTipoVuelo();
                            String clase = read.getSalidaLlegada();
                            String capacidad = read.getCapacidadCarga();
                            String destino = read.getDestino();
                            String tripulación = read.getTripulación();
                            String modeloA = read.getModeloAvion();
                            String descripcion = txtAreaReprogramacion.getText();
                            String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                            clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                    (0, codigo, tipo, clase, tripulación, destino, capacidad, modeloA, fecha, tiempo, descripcionCancelacion, "1");
                            controller.createFlightReprogramation(flightReprogramation);
                            
                            
                            if(controller.updateFlightResquest(FlightRequirements_update)){
                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                fillDataTable();
                                cleanRegisterQuestionnaire();
                            }
                            else {
                              JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                            }
                        } 
                        
                }
                
            }
            
        
        }
        else {
            
            if(btnActualizarDatos.isSelected() == true){
                if(tblSolicitudes.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un vuelo para poderlo cancelar!");
            }
            else{
                
                int row = tblSolicitudes.getSelectedRow();
                String codigo = tblSolicitudes.getValueAt(row, 0).toString();
                
                String anio = comboBoxYearFirst.getSelectedItem().toString();
                String mes = comboBoxMonthFirst.getSelectedItem().toString();
                String dia = comboBoxDayFirst.getSelectedItem().toString();
                String hora = comboBoxHourFirst.getSelectedItem().toString();
                String minuto = comboBoxMinutesFirst.getSelectedItem().toString();
                
                if(comboBoxTripulacionVuelo.getSelectedItem().toString().equals("Tripulación de vuelo") || 
                   comboboxModeloAvion.getSelectedItem().toString().equals("Modelo de avión") || comboBoxCapacidadAvion.getSelectedItem().toString().equals("Capacidad de avión") ||
                   comboBoxDestino.getSelectedItem().toString().equals("Seleccione destino")){
                    
                    JOptionPane.showMessageDialog(this, "¡Debe ingresar todos los datos del formulario!");
                }
                
                if(anio.equals("Year") || mes.equals("Month") || dia.equals("Day") || hora.equals("Hour") || minuto.equals("Minutes")){
                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar una fecha u hora valida!");
                }
                
                if(txtAreaReprogramacion.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "¡Debe añadir un motivo para la reprogramación del vuelo!");
                }
                
                else{
                    
                    String anioVuelo = comboBoxYearFirst.getSelectedItem().toString();
                    String mesVuelo = comboBoxMonthFirst.getSelectedItem().toString();
                    String diaVuelo = comboBoxDayFirst.getSelectedItem().toString();
                    String horaVuelo = comboBoxHourFirst.getSelectedItem().toString();
                    String minutoVuelo = comboBoxMinutesFirst.getSelectedItem().toString();
                    String mesNumber = "";
                        
                    if(mesVuelo.equals("January")){
                            mesNumber = "1";
                        }
                        if(mesVuelo.equals("February")){
                            mesNumber = "2";
                        }
                        if(mesVuelo.equals("March")){
                            mesNumber = "3";
                        }
                        if(mesVuelo.equals("April")){
                            mesNumber = "4";
                        }
                        if(mesVuelo.equals("may")){
                            mesNumber = "5";
                        }
                        if(mesVuelo.equals("June")){
                            mesNumber = "6";
                        }
                        if(mesVuelo.equals("July")){
                            mesNumber = "7";
                        }
                        if(mesVuelo.equals("August")){
                            mesNumber = "8";
                        }
                        if(mesVuelo.equals("September")){
                            mesNumber = "9";
                        }
                        if(mesVuelo.equals("October")){
                            mesNumber = "10";
                        }
                        if(mesVuelo.equals("November")){
                            mesNumber = "11";
                        }
                        if(mesVuelo.equals("December")){
                            mesNumber = "12";
                        }

                        String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
                        String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
                        
                        
                        if(chboxVueloPasajeros.isSelected()==true && chboxVueloSalida.isSelected() == true){
                            
                            String tripulacion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String modelo = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidad = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String destino = comboBoxDestino.getSelectedItem().toString();
                            
                            if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }

                            else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){

                                clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de pasajeros", "Vuelo de salida", capacidad, tripulacion, fecha, tiempo, destino);

                               
                                String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                                clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                        (0, codigo, "Vuelo de pasajeros", "Vuelo de salida", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                                controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }

                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                            clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de pasajeros", "Vuelo de salida", capacidad, tripulacion, fecha, tiempo, destino);

                            
                            String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                            clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                    (0, codigo, "Vuelo de pasajeros", "Vuelo de salida", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                            controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }
                            }
                        }

                        if(chboxVueloPasajeros.isSelected()==true && chboxVueloLlegada.isSelected() == true){

                            String tripulacion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String modelo = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidad = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String destino = comboBoxDestino.getSelectedItem().toString();

                            if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }

                            else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){

                                clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de pasajeros", "Vuelo de llegada", capacidad, tripulacion, fecha, tiempo, destino);

                                
                                
                                String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                                clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                        (0, codigo, "Vuelo de pasajeros", "Vuelo de llegada", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                                controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }

                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                                clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de pasajeros", "Vuelo de llegada", capacidad, tripulacion, fecha, tiempo, destino);

                                
                                String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                                clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                        (0, codigo, "Vuelo de pasajeros", "Vuelo de llegada", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                                controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }
                            }
                        }
                        
                        if(chboxVueloCarga.isSelected()==true && chboxVueloLlegada.isSelected() == true){
                            
                            String tripulacion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String modelo = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidad = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String destino = comboBoxDestino.getSelectedItem().toString();

                            if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }

                            else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){

                                clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de carga", "Vuelo de llegada", capacidad, tripulacion, fecha, tiempo, destino);

                                
                                String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                                clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                        (0, codigo, "Vuelo de carga", "Vuelo de llegada", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                                controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }

                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                                clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de carga", "Vuelo de llegada", capacidad, tripulacion, fecha, tiempo, destino);

                                
                                String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                                clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                        (0, codigo, "Vuelo de carga", "Vuelo de llegada", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                                controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }
                            }
                        }
                        
                        if(chboxVueloCarga.isSelected()==true && chboxVueloSalida.isSelected() == true){
                            
                            String tripulacion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String modelo = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidad = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String destino = comboBoxDestino.getSelectedItem().toString();

                            if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                            JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                            }

                            else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){

                                clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de carga", "Vuelo de salida", capacidad, tripulacion, fecha, tiempo, destino);

                                
                                String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                                clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                        (0, codigo, "Vuelo de carga", "Vuelo de salida", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                                controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }

                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                                clsFlightRequirements FlightRequirements_update = new clsFlightRequirements(0, codigo, modelo, "Vuelo de carga", "Vuelo de salida", capacidad, tripulacion, fecha, tiempo, destino);

                                
                                String descripcionCancelacion = "Vuelo reprogramado por aerolinea" + "\n" + "\n" + txtAreaReprogramacion.getText();

                                clsFlightRequerimentsReprogramation flightReprogramation = new clsFlightRequerimentsReprogramation
                                        (0, codigo, "Vuelo de carga", "Vuelo de salida", tripulacion, destino, capacidad, modelo, fecha, tiempo, descripcionCancelacion, "1");
                                controller.createFlightReprogramation(flightReprogramation);
                                
                                
                                if(controller.updateFlightResquestComplete(FlightRequirements_update)){
                                    Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha reprogramado \n una solicitud de vuelo!!!", "Solicitud reprogramada satisfactoriamente", WIDTH, m);
                                    fillDataTable();
                                    cleanRegisterQuestionnaire();
                                }
                                else {
                                  JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                                }
                            }
                        }
                    }
                
                }
            }
        }
    }//GEN-LAST:event_btnReprogramarActionPerformed

    private void cleanRegisterQuestionnaire(){
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxTripulacionVuelo.setSelectedIndex(0);
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión"}));
        comboBoxYearFirst.setSelectedIndex(0);
        comboBoxMonthFirst.setSelectedIndex(0);
        comboBoxDayFirst.setSelectedIndex(0);
        comboBoxHourFirst.setSelectedIndex(0);
        comboBoxMinutesFirst.setSelectedIndex(0);
        comboBoxDestino.setSelectedIndex(0);
        txtAreaReprogramacion.setText("");
        btnActualizarDatos.setSelected(false);
        bloqueo();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnActualizarDatos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReprogramar;
    private javax.swing.JCheckBox chboxVueloCarga;
    private javax.swing.JCheckBox chboxVueloLlegada;
    private javax.swing.JCheckBox chboxVueloPasajeros;
    private javax.swing.JCheckBox chboxVueloSalida;
    private javax.swing.JComboBox<String> comboBoxCapacidadAvion;
    private javax.swing.JComboBox<String> comboBoxDayFirst;
    private javax.swing.JComboBox<String> comboBoxDestino;
    private javax.swing.JComboBox<String> comboBoxHourFirst;
    private javax.swing.JComboBox<String> comboBoxMinutesFirst;
    private javax.swing.JComboBox<String> comboBoxMonthFirst;
    private javax.swing.JComboBox<String> comboBoxTripulacionVuelo;
    private javax.swing.JComboBox<String> comboBoxYearFirst;
    private javax.swing.JComboBox<String> comboboxModeloAvion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCdigoVuelo;
    private javax.swing.JLabel lbEmailUserLogin2;
    private javax.swing.JLabel lbEmailUserLogin5;
    private javax.swing.JLabel lbEmailUserLogin6;
    private javax.swing.JLabel lbVueloS;
    private javax.swing.JLabel lbVueloS3;
    private javax.swing.JLabel lbVueloS8;
    private javax.swing.JLabel lbVueloS9;
    private javax.swing.JTable tblSolicitudes;
    private javax.swing.JTextArea txtAreaReprogramacion;
    // End of variables declaration//GEN-END:variables
}
