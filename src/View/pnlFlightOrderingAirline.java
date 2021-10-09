package View;

import Classes.clsFlightRequirements;
import Controller.ctlFlightRequirement;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Booh
 */
public class pnlFlightOrderingAirline extends javax.swing.JPanel {
    
    ctlFlightRequirement controlFlightRequirement = new ctlFlightRequirement();

    LinkedList<clsFlightRequirements> FlightRequirementObjectList = new LinkedList<>();
    
    LocalDate currentDate = LocalDate.now();

    public pnlFlightOrderingAirline() {
        initComponents();
        showFlightList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCdigoVuelo = new javax.swing.JLabel();
        comboBoxDestino = new javax.swing.JComboBox<>();
        lbEmailUserLogin8 = new javax.swing.JLabel();
        tfCodigoVuelo = new javax.swing.JTextField();
        lbEmailUserLogin4 = new javax.swing.JLabel();
        chboxVueloPasajeros = new javax.swing.JCheckBox();
        chboxVueloCarga = new javax.swing.JCheckBox();
        chboxVueloLlegada = new javax.swing.JCheckBox();
        chboxVueloSalida = new javax.swing.JCheckBox();
        lbEmailUserLogin = new javax.swing.JLabel();
        lbEmailUserLogin2 = new javax.swing.JLabel();
        comboboxModeloAvion = new javax.swing.JComboBox<>();
        lbEmailUserLogin5 = new javax.swing.JLabel();
        comboBoxCapacidadAvion = new javax.swing.JComboBox<>();
        comboBoxTripulacionVuelo = new javax.swing.JComboBox<>();
        lbEmailUserLogin6 = new javax.swing.JLabel();
        lbEmailUserLogin7 = new javax.swing.JLabel();
        comboBoxYear = new javax.swing.JComboBox<>();
        comboBoxMonth = new javax.swing.JComboBox<>();
        comboBoxDay = new javax.swing.JComboBox<>();
        comboBoxMinutes = new javax.swing.JComboBox<>();
        comboBoxHour = new javax.swing.JComboBox<>();
        lbEmailUserLogin3 = new javax.swing.JLabel();
        btnReporteUnitario1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        scpData = new javax.swing.JScrollPane();
        DataFly = new javax.swing.JTextArea();
        lbEmailUserLogin1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCdigoVuelo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo.setForeground(new java.awt.Color(255, 255, 255));
        lbCdigoVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo.setText("Seleccione destino");
        lbCdigoVuelo.setToolTipText("");
        add(lbCdigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 280, 40));

        comboBoxDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Destino", "Afganistán - Kabul - Asia", "Albania - Tirana - Europa", "Alemania - Berlín - Europa", "Andorra - Andorra la Vieja - Europa", "Angola - Luanda - África", "Antigua y Barbuda - Saint John - América", "Arabia Saudita - Riad - Asia", "Argelia - Argel - África", "Argentina - Buenos Aires - América", "Armenia - Ereván - Asia", "Australia - Canberra - Oceanía", "Austria - Viena - Europa", "Azerbaiyán - Bakú - Asia", "Bahamas - Nasáu - América", "Bangladés - Daca - Asia", "Barbados - Bridgetown - América", "Baréin - Manama - Asia", "Bélgica - Bruselas - Europa", "Belice - Belmopán - América", "Benín - Porto - Novo - África", "Bielorrusia - Minsk - Europa", "Birmania - Naipyidó - Asia", "Bolivia - Sucre - América", "Bosnia - Herzegovina - Sarajevo - Europa", "Botsuana - Gaborone - África", "Brasil - Brasilia - América", "Brunéi - Bandar Seri Begawan - Asia", "Bulgaria - Sofía - Europa", "Burkina Faso - Uagadugú - África", "Burundi - Buyumbura - África", "Bután - Thimphu - Asia", "Cabo Verde - Praia - África", "Camboya - Nom Pen - Asia", "Camerún - Yaundé - África", "Canadá - Ottawa - América", "Catar - Doha - Asia", "Chad - Yamena - África", "Chile - Santiago - América", "China - Pekín - Asia", "Chipre - Nicosia - Europa", "Colombia - Bogotá - América", "Comoras - Moroni - África", "Congo - Brazzaville - África", "Corea del Norte - Pionyang - Asia", "Corea del Sur - Seúl - Asia", "Costa de Marfil - Yamusukro - África", "Costa Rica - San José - América", "Croacia - Zagreb - Europa", "Cuba - La Habana - América", "Dinamarca - Copenhague - Europa", "Dominica - Roseau - América", "Ecuador - Quito - América", "Egipto - El Cairo - África", "El Salvador - San Salvador - América", "Emiratos Árabes Unidos - Abu Dabi - Asia", "Eritrea - Asmara - África", "Eslovaquia - Bratislava - Europa", "Eslovenia - Liubliana - Europa", "España - Madrid - Europa" }));
        add(comboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 360, 40));

        lbEmailUserLogin8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin8.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin8.setText("Digite codigo vuelo");
        lbEmailUserLogin8.setToolTipText("");
        add(lbEmailUserLogin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 170, 40));

        tfCodigoVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfCodigoVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCodigoVueloMouseClicked(evt);
            }
        });
        add(tfCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 450, 40));

        lbEmailUserLogin4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin4.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin4.setText("Seleccione tipo de vuelo");
        lbEmailUserLogin4.setToolTipText("");
        add(lbEmailUserLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 250, 50));

        chboxVueloPasajeros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloPasajeros.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloPasajeros.setText("Vuelo de pasajeros");
        chboxVueloPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloPasajerosActionPerformed(evt);
            }
        });
        add(chboxVueloPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 160, 40));

        chboxVueloCarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloCarga.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloCarga.setText("Vuelo de carga");
        chboxVueloCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloCargaActionPerformed(evt);
            }
        });
        add(chboxVueloCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 160, 40));

        chboxVueloLlegada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloLlegada.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloLlegada.setText("Vuelo de llegada");
        chboxVueloLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloLlegadaActionPerformed(evt);
            }
        });
        add(chboxVueloLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 160, 40));

        chboxVueloSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloSalida.setForeground(new java.awt.Color(255, 255, 255));
        chboxVueloSalida.setText("Vuelo de salida");
        chboxVueloSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloSalidaActionPerformed(evt);
            }
        });
        add(chboxVueloSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 160, 40));

        lbEmailUserLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin.setText("Seleccione");
        lbEmailUserLogin.setToolTipText("");
        add(lbEmailUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 130, 50));

        lbEmailUserLogin2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin2.setText("Seleccione modelo de avión");
        lbEmailUserLogin2.setToolTipText("");
        add(lbEmailUserLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 270, 40));

        comboboxModeloAvion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo de avión" }));
        add(comboboxModeloAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 360, 40));

        lbEmailUserLogin5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin5.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin5.setText("Seleccione capacidad de avión");
        lbEmailUserLogin5.setToolTipText("");
        add(lbEmailUserLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 300, 40));

        comboBoxCapacidadAvion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión" }));
        add(comboBoxCapacidadAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 360, 40));

        comboBoxTripulacionVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxTripulacionVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tripulación de vuelo", "Piloto", "piloto y copiloto" }));
        add(comboBoxTripulacionVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 360, 40));

        lbEmailUserLogin6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin6.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin6.setText("Seleccione tripulación de vuelo");
        lbEmailUserLogin6.setToolTipText("");
        add(lbEmailUserLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 300, 40));

        lbEmailUserLogin7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin7.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin7.setText("Seleccione fecha de agenda");
        lbEmailUserLogin7.setToolTipText("");
        add(lbEmailUserLogin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 280, 50));

        comboBoxYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        add(comboBoxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 110, 40));

        comboBoxMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        add(comboBoxMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 120, 40));

        comboBoxDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(comboBoxDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 110, 40));

        comboBoxMinutes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(comboBoxMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 120, 40));

        comboBoxHour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        add(comboBoxHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 120, 40));

        lbEmailUserLogin3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin3.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin3.setText("Seleccione (Hora - Minutos)");
        lbEmailUserLogin3.setToolTipText("");
        add(lbEmailUserLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 280, 40));

        btnReporteUnitario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/solictar_vuelo_min.png"))); // NOI18N
        btnReporteUnitario1.setContentAreaFilled(false);
        btnReporteUnitario1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/solictar_vuelo_min.png"))); // NOI18N
        btnReporteUnitario1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/solictar_vuelo_max.png"))); // NOI18N
        btnReporteUnitario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteUnitario1ActionPerformed(evt);
            }
        });
        add(btnReporteUnitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 330, 120));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 330, 120));

        DataFly.setColumns(20);
        DataFly.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        DataFly.setRows(5);
        DataFly.setFocusable(false);
        scpData.setViewportView(DataFly);

        add(scpData, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 380, 280));

        lbEmailUserLogin1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin1.setText("Datos de vuelo");
        lbEmailUserLogin1.setToolTipText("");
        add(lbEmailUserLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 380, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Solicitar vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void cleanRegisterQuestionnaire(){
        tfCodigoVuelo.setText("");
        comboBoxDestino.setSelectedIndex(0);
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxTripulacionVuelo.setSelectedIndex(0);
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión"}));
        comboBoxYear.setSelectedIndex(0);
        comboBoxMonth.setSelectedIndex(0);
        comboBoxDay.setSelectedIndex(0);
        comboBoxHour.setSelectedIndex(0);
        comboBoxMinutes.setSelectedIndex(0);
        comboBoxDestino.setEnabled(true);
        chboxVueloPasajeros.setEnabled(true);
        chboxVueloCarga.setEnabled(true);
        chboxVueloSalida.setEnabled(true);
        chboxVueloLlegada.setEnabled(true);
        comboboxModeloAvion.setEnabled(true);
        comboBoxCapacidadAvion.setEnabled(true);
        comboBoxTripulacionVuelo.setEnabled(true);
        comboBoxYear.setEnabled(true);
        comboBoxMonth.setEnabled(true);
        comboBoxDay.setEnabled(true);
        comboBoxHour.setEnabled(true);
        comboBoxMinutes.setEnabled(true);
    }
    
    //--------------------------------------------------------------------------
    
    private void tfCodigoVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoVueloMouseClicked
        DataFly.setText("");
    }//GEN-LAST:event_tfCodigoVueloMouseClicked

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

    private void chboxVueloLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloLlegadaActionPerformed
        if(chboxVueloLlegada.isSelected() == true){
            chboxVueloSalida.setSelected(false);
        }
    }//GEN-LAST:event_chboxVueloLlegadaActionPerformed

    private void chboxVueloSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloSalidaActionPerformed
        if(chboxVueloSalida.isSelected() == true){
            chboxVueloLlegada.setSelected(false);
        }
    }//GEN-LAST:event_chboxVueloSalidaActionPerformed

    private void btnReporteUnitario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteUnitario1ActionPerformed
        
        //----------
            String codigoVuelo = tfCodigoVuelo.getText();
            
            clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVuelo);

            if (FlightRequirementsSearch != null) {
                JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");

                if (FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                comboBoxDestino.setEnabled(false);
                chboxVueloPasajeros.setEnabled(false);
                chboxVueloCarga.setEnabled(false);
                chboxVueloSalida.setEnabled(false);
                chboxVueloLlegada.setEnabled(false);
                comboboxModeloAvion.setEnabled(false);
                comboBoxCapacidadAvion.setEnabled(false);
                comboBoxTripulacionVuelo.setEnabled(false);
                comboBoxYear.setEnabled(false);
                comboBoxMonth.setEnabled(false);
                comboBoxDay.setEnabled(false);
                comboBoxHour.setEnabled(false);
                comboBoxMinutes.setEnabled(false);
                    

                    DataFly.setText("Datos de vuelo:" + "\n" +
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
                }

                if (FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
                    
                    comboBoxDestino.setEnabled(false);
                    chboxVueloPasajeros.setEnabled(false);
                    chboxVueloCarga.setEnabled(false);
                    chboxVueloSalida.setEnabled(false);
                    chboxVueloLlegada.setEnabled(false);
                    comboboxModeloAvion.setEnabled(false);
                    comboBoxCapacidadAvion.setEnabled(false);
                    comboBoxTripulacionVuelo.setEnabled(false);
                    comboBoxYear.setEnabled(false);
                    comboBoxMonth.setEnabled(false);
                    comboBoxDay.setEnabled(false);
                    comboBoxHour.setEnabled(false);
                    comboBoxMinutes.setEnabled(false);

                    DataFly.setText("Datos de vuelo:" + "\n" +
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
                }
                
                //----------------------------------------------------------   
                   
            }
            else{
                String codigo = tfCodigoVuelo.getText();
                String destino = comboBoxDestino.getSelectedItem().toString();
                boolean tipovueloP = chboxVueloPasajeros.isSelected();
                boolean tipovueloC = chboxVueloCarga.isSelected();
                boolean vueloS = chboxVueloSalida.isSelected();
                boolean vueloLl = chboxVueloLlegada.isSelected();
                String modeloAvion = comboboxModeloAvion.getSelectedItem().toString();
                String capacidadAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                String tripulacionVuelo = comboBoxTripulacionVuelo.getSelectedItem().toString();
                String anio = comboBoxYear.getSelectedItem().toString();
                String mes = comboBoxMonth.getSelectedItem().toString();
                String dia = comboBoxDay.getSelectedItem().toString();
                String hora = comboBoxHour.getSelectedItem().toString();
                String minuto = comboBoxMinutes.getSelectedItem().toString();

                if(codigo.equals("")){
                    JOptionPane.showMessageDialog(this, "¡Debe ingresar el codigo del vuelo!");
                }
                else{
                    
                    if(modeloAvion.equals("Modelo de avión") || tipovueloC == false && tipovueloP == false || vueloS == false && vueloLl == false
                        || capacidadAvion.equals("Capacidad de avión") || tripulacionVuelo.equals("Tripulación de vuelo") || 
                        anio.equals("Year") || mes.equals("Month") || dia.equals("Day") || hora.equals("Hour") || minuto.equals("Minutes") || 
                        destino.equals("Seleccione Destino")){
                            JOptionPane.showMessageDialog(this, "¡Debe seleccionar todos los datos!");
                    }
                
                
    //                if(modeloAvion.equals("Modelo de avión")){
    //                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar un modelo de avión!");
    //                }
    //                if (tipovueloC == false && tipovueloP == false) {
    //                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar un tipo de vuelo!");
    //                }
    //                if (vueloS == false && vueloLl == false) {
    //                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar la clase de vuelo!");
    //                }
    //                if (capacidadAvion.equals("Capacidad de avión")) {
    //                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar la capacidad del avión!");
    //                }
    //                if(tripulacionVuelo.equals("Tripulación de vuelo")){
    //                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar una la tripulación para el vuelo!");
    //                }
    //                if(anio.equals("Year") || mes.equals("Month") || dia.equals("Day")){
    //                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar una fecha valida!");
    //                }
    //                if(hora.equals("Hour") || minuto.equals("Minutes")){
    //                    JOptionPane.showMessageDialog(this, "¡Debe ingresar una hora valida del vuelo!");
    //                }
    //                if(destino.equals("Seleccione Destino")){
    //                    JOptionPane.showMessageDialog(this, "¡Debe seleccionar un destino para el vuelo!");
    //                }
                    else{
                        if(tipovueloP==true && vueloS==true && !"".equals(codigo)){

                            String codigoVuelo1 = tfCodigoVuelo.getText();
                            String destinoVuelo = comboBoxDestino.getSelectedItem().toString();
                            String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String anioVuelo = comboBoxYear.getSelectedItem().toString();
                            String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                            String diaVuelo = comboBoxDay.getSelectedItem().toString();
                            String horaVuelo = comboBoxHour.getSelectedItem().toString();
                            String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
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

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                                controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire();
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                                controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire();
                            }  
                        }


                            //-----------------------------------------------------------------------------------

                            if (tipovueloC==true && vueloLl==true && !"".equals(codigo)) {

                            String destinoVuelo = comboBoxDestino.getSelectedItem().toString();
                            String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String anioVuelo = comboBoxYear.getSelectedItem().toString();
                            String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                            String diaVuelo = comboBoxDay.getSelectedItem().toString();
                            String horaVuelo = comboBoxHour.getSelectedItem().toString();
                            String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
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

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                                controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire();
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                                controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire();
                            }
                        }
                        //--------------------------------------------------------------

                        if(tipovueloP==true && vueloLl==true && !"".equals(codigo)){

                            String destinoVuelo = comboBoxDestino.getSelectedItem().toString();
                            String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String anioVuelo = comboBoxYear.getSelectedItem().toString();
                            String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                            String diaVuelo = comboBoxDay.getSelectedItem().toString();
                            String horaVuelo = comboBoxHour.getSelectedItem().toString();
                            String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
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

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                                controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire();
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                               controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire(); 
                            }
                        }

                        //--------------------------------------------------------------

                        if (tipovueloC==true && vueloS==true && !"".equals(codigo)) {

                            String destinoVuelo = comboBoxDestino.getSelectedItem().toString();
                            String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                            String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                            String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                            String anioVuelo = comboBoxYear.getSelectedItem().toString();
                            String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                            String diaVuelo = comboBoxDay.getSelectedItem().toString();
                            String horaVuelo = comboBoxHour.getSelectedItem().toString();
                            String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
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

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                                controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire();
                            }
                            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){

                                clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                                (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                                controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                                DataFly.setText("Datos de vuelo:" + "\n" +
                                                "\n" +
                                                "Codigo del vuelo: " + codigoVuelo + "\n" +
                                                "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                                "Clase de vuelo: Vuelo de salida" + "\n" + 
                                                "Modelo de avión: " + modelAvion + "\n" + 
                                                "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                                "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                                "Feca de vuelo: " + fecha + "\n" + 
                                                "Hora de vuelo: " + tiempo + "\n" + 
                                                "Destino del vuelo: " + destinoVuelo);

                                Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                                JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                                showFlightList();
                                cleanRegisterQuestionnaire();
                            }
                        }
                    }

                    //--------------------------------------------------------------
                }
                

                
                
            }

    }//GEN-LAST:event_btnReporteUnitario1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        tfCodigoVuelo.setText("");
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxTripulacionVuelo.setSelectedIndex(0);
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión"}));
        comboBoxYear.setSelectedIndex(0);
        comboBoxMonth.setSelectedIndex(0);
        comboBoxDay.setSelectedIndex(0);
        comboBoxHour.setSelectedIndex(0);
        comboBoxMinutes.setSelectedIndex(0);
        comboBoxDestino.setSelectedIndex(0);
        DataFly.setText("");
        comboBoxDestino.setEnabled(true);
        chboxVueloPasajeros.setEnabled(true);
        chboxVueloCarga.setEnabled(true);
        chboxVueloSalida.setEnabled(true);
        chboxVueloLlegada.setEnabled(true);
        comboboxModeloAvion.setEnabled(true);
        comboBoxCapacidadAvion.setEnabled(true);
        comboBoxTripulacionVuelo.setEnabled(true);
        comboBoxYear.setEnabled(true);
        comboBoxMonth.setEnabled(true);
        comboBoxDay.setEnabled(true);
        comboBoxHour.setEnabled(true);
        comboBoxMinutes.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //--------------------------------------------------------------------------
    
    private void showFlightList(){
        FlightRequirementObjectList = controlFlightRequirement.listFlight();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightRequirements vuelos : FlightRequirementObjectList) {
            String data = "CODIGO VUELO: " + vuelos.getCodigoVuelo()+ " - " + " TIPO VUELO: " + vuelos.getTipoVuelo()+ " - " +
                          " CLASE VUELO: " +vuelos.getSalidaLlegada()+ " - " + " FECHA VUELO: " + vuelos.getFecha()+ " - " + 
                          " HORA VUELO: " + vuelos.getHora() + " - " + " DESTINO: " + vuelos.getDestino();
            model.add(index, data);
            index++;
        }
    }
    
    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DataFly;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReporteUnitario1;
    private javax.swing.JCheckBox chboxVueloCarga;
    private javax.swing.JCheckBox chboxVueloLlegada;
    private javax.swing.JCheckBox chboxVueloPasajeros;
    private javax.swing.JCheckBox chboxVueloSalida;
    private javax.swing.JComboBox<String> comboBoxCapacidadAvion;
    private javax.swing.JComboBox<String> comboBoxDay;
    private javax.swing.JComboBox<String> comboBoxDestino;
    private javax.swing.JComboBox<String> comboBoxHour;
    private javax.swing.JComboBox<String> comboBoxMinutes;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxTripulacionVuelo;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JComboBox<String> comboboxModeloAvion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbCdigoVuelo;
    private javax.swing.JLabel lbEmailUserLogin;
    private javax.swing.JLabel lbEmailUserLogin1;
    private javax.swing.JLabel lbEmailUserLogin2;
    private javax.swing.JLabel lbEmailUserLogin3;
    private javax.swing.JLabel lbEmailUserLogin4;
    private javax.swing.JLabel lbEmailUserLogin5;
    private javax.swing.JLabel lbEmailUserLogin6;
    private javax.swing.JLabel lbEmailUserLogin7;
    private javax.swing.JLabel lbEmailUserLogin8;
    private javax.swing.JScrollPane scpData;
    private javax.swing.JTextField tfCodigoVuelo;
    // End of variables declaration//GEN-END:variables
}
