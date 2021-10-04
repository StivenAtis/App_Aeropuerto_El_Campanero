package View;

import Classes.clsTimeTable;
import Controller.ctlFlightAgenda;
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
public class pnlFlightCalendar extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    private ctlFlightAgenda controller = null;
    private LinkedList<clsTimeTable> list;
    
    LocalDate currentDate = LocalDate.now();
    
    //--------------------------------------------------------------------------
    
    public pnlFlightCalendar() {
        initComponents();
        controller = new ctlFlightAgenda();
        fillDataTable();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        lbVueloS = new javax.swing.JLabel();
        lbVueloS2 = new javax.swing.JLabel();
        lbVueloS1 = new javax.swing.JLabel();
        comboBoxDayFirst = new javax.swing.JComboBox<>();
        comboBoxDaySecond = new javax.swing.JComboBox<>();
        comboBoxMonthFirst = new javax.swing.JComboBox<>();
        comboBoxMonthSecond = new javax.swing.JComboBox<>();
        comboBoxYearFirst = new javax.swing.JComboBox<>();
        comboBoxYearSecond = new javax.swing.JComboBox<>();
        comboBoxHourFirst = new javax.swing.JComboBox<>();
        comboBoxHourSecond = new javax.swing.JComboBox<>();
        comboBoxMinutesFirst = new javax.swing.JComboBox<>();
        comboBoxMinutesSecond = new javax.swing.JComboBox<>();
        cbPistaDespegue = new javax.swing.JCheckBox();
        cbPistaAterrizaje = new javax.swing.JCheckBox();
        btnCrearAgenda = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBorrarAgenda = new javax.swing.JButton();
        tfCodigoAgenda = new javax.swing.JTextField();
        lbVueloS8 = new javax.swing.JLabel();
        lbVueloS7 = new javax.swing.JLabel();
        lbVueloS3 = new javax.swing.JLabel();
        lbVueloS4 = new javax.swing.JLabel();
        lbVueloS5 = new javax.swing.JLabel();
        lbVueloS6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAgenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Fecha", "Hora", "Pista Despegue", "Pista Aterrizaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAgenda);
        if (tblAgenda.getColumnModel().getColumnCount() > 0) {
            tblAgenda.getColumnModel().getColumn(0).setResizable(false);
            tblAgenda.getColumnModel().getColumn(1).setResizable(false);
            tblAgenda.getColumnModel().getColumn(2).setResizable(false);
            tblAgenda.getColumnModel().getColumn(3).setResizable(false);
            tblAgenda.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 1160, 170));

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Pistas disponibles");
        lbVueloS.setToolTipText("");
        add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 310, 40));

        lbVueloS2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS2.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS2.setText("a");
        lbVueloS2.setToolTipText("");
        add(lbVueloS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 70, 40));

        lbVueloS1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS1.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS1.setText("Agenda disponible");
        lbVueloS1.setToolTipText("");
        add(lbVueloS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, 40));

        comboBoxDayFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDayFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(comboBoxDayFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 120, 40));

        comboBoxDaySecond.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDaySecond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(comboBoxDaySecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 120, 40));

        comboBoxMonthFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonthFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        add(comboBoxMonthFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 120, 40));

        comboBoxMonthSecond.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonthSecond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        add(comboBoxMonthSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 40));

        comboBoxYearFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYearFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        add(comboBoxYearFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 120, 40));

        comboBoxYearSecond.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYearSecond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        add(comboBoxYearSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 120, 40));

        comboBoxHourFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHourFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        add(comboBoxHourFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 120, 40));

        comboBoxHourSecond.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHourSecond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        add(comboBoxHourSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 120, 40));

        comboBoxMinutesFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutesFirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(comboBoxMinutesFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 120, 40));

        comboBoxMinutesSecond.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutesSecond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(comboBoxMinutesSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 120, 40));

        cbPistaDespegue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbPistaDespegue.setForeground(new java.awt.Color(255, 255, 255));
        cbPistaDespegue.setText("Pista de Despegue");
        add(cbPistaDespegue, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, -1, -1));

        cbPistaAterrizaje.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbPistaAterrizaje.setForeground(new java.awt.Color(255, 255, 255));
        cbPistaAterrizaje.setText("Pista de Aterrizaje");
        add(cbPistaAterrizaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, -1, -1));

        btnCrearAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agenda_crear_min.png"))); // NOI18N
        btnCrearAgenda.setContentAreaFilled(false);
        btnCrearAgenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agenda_crear_min.png"))); // NOI18N
        btnCrearAgenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agenda_crear_max.png"))); // NOI18N
        btnCrearAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAgendaActionPerformed(evt);
            }
        });
        add(btnCrearAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 330, 130));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 330, 130));

        btnBorrarAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agenda_borrar_min.png"))); // NOI18N
        btnBorrarAgenda.setContentAreaFilled(false);
        btnBorrarAgenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agenda_borrar_min.png"))); // NOI18N
        btnBorrarAgenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agenda_borrar_min (1).png"))); // NOI18N
        btnBorrarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAgendaActionPerformed(evt);
            }
        });
        add(btnBorrarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 330, 130));

        tfCodigoAgenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfCodigoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 190, 40));

        lbVueloS8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS8.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS8.setText("Registrar Hora");
        lbVueloS8.setToolTipText("");
        add(lbVueloS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 310, 40));

        lbVueloS7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS7.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS7.setText("a");
        lbVueloS7.setToolTipText("");
        add(lbVueloS7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 70, 40));

        lbVueloS3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS3.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS3.setText("Registrar fecha");
        lbVueloS3.setToolTipText("");
        add(lbVueloS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 310, 40));

        lbVueloS4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS4.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS4.setText("a");
        lbVueloS4.setToolTipText("");
        add(lbVueloS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 70, 40));

        lbVueloS5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS5.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS5.setText("a");
        lbVueloS5.setToolTipText("");
        add(lbVueloS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 70, 40));

        lbVueloS6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS6.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS6.setText("a");
        lbVueloS6.setToolTipText("");
        add(lbVueloS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 70, 40));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo A");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agenda de horarios");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void fillDataTable() {
         
        list = controller.listTimeTable();
        String datos[][] = new String[list.size()][5];
        
        if(list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                datos[i][Constants.CODE_TIME_TABLE] = list.get(i).getCodigo();
                datos[i][Constants.DATE_TIME_TABLE] = list.get(i).getDate();
                datos[i][Constants.TIME_TIME_TABLE] = list.get(i).getTime();
                datos[i][Constants.RUNWAY_TAKEOFF_TIME_TABLE] = list.get(i).getRunway_takeoff();
                datos[i][Constants.RUNWAY_LANDING_TIME_TABLE] = list.get(i).getRunway_landing();
            }        
        }        
        String[] columns = {
            "CODIGO", "FECHA", "HORA", "PISTA ATERRIZAJE", "PISTA DESPEGUE"
        };
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblAgenda.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblAgenda.setRowHeight(30);
        tblAgenda.setModel(model);
    } 
    
    //--------------------------------------------------------------------------
    
    private void tblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendaMouseClicked
        int row = tblAgenda.getSelectedRow();
        String id = tblAgenda.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblAgendaMouseClicked

    //--------------------------------------------------------------------------
    
    private void btnCrearAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAgendaActionPerformed
        
        String anioVuelo = comboBoxYearFirst.getSelectedItem().toString();
        String mesVuelo = comboBoxMonthFirst.getSelectedItem().toString();
        String diaVuelo = comboBoxDayFirst.getSelectedItem().toString();
        String horaVuelo = comboBoxHourFirst.getSelectedItem().toString();
        String minutoVuelo = comboBoxMinutesFirst.getSelectedItem().toString();
        String mesNumberFirst = "";
        
        if(anioVuelo.equals("Year") || mesVuelo.equals("Month") || diaVuelo.equals("Day") || horaVuelo.equals("Hour") || minutoVuelo.equals("Minutes")){
            JOptionPane.showMessageDialog(this, "Debe ingresar una fecha y hora");
        }
        else{
            
            if(mesVuelo.equals("January")){
            mesNumberFirst = "1";
            }
            if(mesVuelo.equals("February")){
                mesNumberFirst = "2";
            }
            if(mesVuelo.equals("March")){
                mesNumberFirst = "3";
            }
            if(mesVuelo.equals("April")){
                mesNumberFirst = "4";
            }
            if(mesVuelo.equals("may")){
                mesNumberFirst = "5";
            }
            if(mesVuelo.equals("June")){
                mesNumberFirst = "6";
            }
            if(mesVuelo.equals("July")){
                mesNumberFirst = "7";
            }
            if(mesVuelo.equals("August")){
                mesNumberFirst = "8";
            }
            if(mesVuelo.equals("September")){
                mesNumberFirst = "9";
            }
            if(mesVuelo.equals("October")){
                mesNumberFirst = "10";
            }
            if(mesVuelo.equals("November")){
                mesNumberFirst = "11";
            }
            if(mesVuelo.equals("December")){
                mesNumberFirst = "12";
            }

            String fecha = anioVuelo + "-" + mesNumberFirst + "-" + diaVuelo;
            String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";

            //----------------------------------------------------------------------

            String anioVueloSecond = comboBoxYearSecond.getSelectedItem().toString();
            String mesVueloSecond = comboBoxMonthSecond.getSelectedItem().toString();
            String diaVueloSecond = comboBoxDaySecond.getSelectedItem().toString();
            String horaVueloSecond = comboBoxHourSecond.getSelectedItem().toString();
            String minutoVueloSecond = comboBoxMinutesSecond.getSelectedItem().toString();
            String mesNumberSecond = "";

            if(mesVueloSecond.equals("January")){
                mesNumberSecond = "1";
            }
            if(mesVueloSecond.equals("February")){
                mesNumberSecond = "2";
            }
            if(mesVueloSecond.equals("March")){
                mesNumberSecond = "3";
            }
            if(mesVueloSecond.equals("April")){
                mesNumberSecond = "4";
            }
            if(mesVueloSecond.equals("may")){
                mesNumberSecond = "5";
            }
            if(mesVueloSecond.equals("June")){
                mesNumberSecond = "6";
            }
            if(mesVueloSecond.equals("July")){
                mesNumberSecond = "7";
            }
            if(mesVueloSecond.equals("August")){
                mesNumberSecond = "8";
            }
            if(mesVueloSecond.equals("September")){
                mesNumberSecond = "9";
            }
            if(mesVueloSecond.equals("October")){
                mesNumberSecond = "10";
            }
            if(mesVueloSecond.equals("November")){
                mesNumberSecond = "11";
            }
            if(mesVueloSecond.equals("December")){
                mesNumberSecond = "12";
            }

            String fechaSecond = anioVueloSecond + "-" + mesNumberSecond + "-" + diaVueloSecond;
            String tiempoSecond = horaVueloSecond + ":" + minutoVueloSecond + ":" + "00";

            //----------------------------------------------------------------------

            boolean AnioAct = Integer.parseInt(anioVuelo) == currentDate.getYear();
            boolean AnioAct2 = Integer.parseInt(anioVueloSecond) == currentDate.getYear();
            boolean AnioPas = Integer.parseInt(anioVuelo) < currentDate.getYear();
            boolean AnioPas2 = Integer.parseInt(anioVueloSecond) < currentDate.getYear();
            boolean mesPas = Integer.parseInt(mesNumberFirst) < currentDate.getMonthValue();
            boolean mesPas2 = Integer.parseInt(mesNumberSecond) < currentDate.getMonthValue();
            boolean mesAct = Integer.parseInt(mesNumberFirst) == currentDate.getMonthValue();
            boolean mesAct2 = Integer.parseInt(mesNumberSecond) == currentDate.getMonthValue();
            boolean diaPas = Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth() ;
            boolean diaPas2 = Integer.parseInt(diaVueloSecond) < currentDate.getDayOfMonth() ;

            if (AnioAct == true && mesPas== true) {
                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
            }
            else if(AnioAct2 == true && mesPas2 == true){
                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
            }
            else if(AnioPas == true || AnioPas2 == true){
                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
            }
            else if(AnioAct == true &&  mesAct == true && diaPas == true || AnioAct2 == true && mesAct2 == true && diaPas2 == true){
                JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
            }
            else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() && Integer.parseInt(anioVueloSecond) >= currentDate.getYear() ){

                String codigo = tfCodigoAgenda.getText();

                if(!"".equals(codigo)){

                    String fechaTable = fecha + " : " + fechaSecond;
                    String horaTable = tiempo + " - " + tiempoSecond;

                    clsTimeTable codeTimeTableSearch = controller.readTimeTable(codigo);
                    
                    if(codeTimeTableSearch != null){
                        JOptionPane.showMessageDialog(this, "¡Ya existe una agenda con este codigo!");
                        cleanAgendaTableQuestionnaire();
                    }
                    else{
                        
                        if(cbPistaDespegue.isSelected()==true && cbPistaAterrizaje.isSelected()==true){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "Disponible pista despegue", "Disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        }
                        else if(cbPistaDespegue.isSelected()==true && cbPistaAterrizaje.isSelected()==false){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "Disponible pista despegue", "No disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        }
                        else if(cbPistaDespegue.isSelected()==false && cbPistaAterrizaje.isSelected()==true){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "No disponible pista despegue", "Disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        }
                        else if(cbPistaDespegue.isSelected()==false && cbPistaAterrizaje.isSelected()==false){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "No disponible pista despegue", "No disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        }
                    }
                }
                else{
                    if(codigo.equals("")){
                        JOptionPane.showMessageDialog(this, "Debe ingresar un codigo valido!");
                    }
                }


            }
            else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumberFirst) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()
                    && Integer.parseInt(anioVueloSecond) == currentDate.getYear() && Integer.parseInt(mesNumberSecond) == currentDate.getMonthValue() && Integer.parseInt(diaVueloSecond) > currentDate.getDayOfMonth()){

                String codigo = tfCodigoAgenda.getText();

                if(!"".equals(codigo)){

                    String fechaTable = fecha + " : " + fechaSecond;
                    String horaTable = tiempo + " - " + tiempoSecond;

                    clsTimeTable codeTimeTableSearch = controller.readTimeTable(codigo);
                    
                    if(codeTimeTableSearch != null){
                        JOptionPane.showMessageDialog(this, "¡Ya existe una agenda con este codigo!");
                        cleanAgendaTableQuestionnaire();
                    }
                    else{
                        
                        if(cbPistaDespegue.isSelected()==true && cbPistaAterrizaje.isSelected()==true){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "Disponible pista despegue", "Disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        }
                        else if(cbPistaDespegue.isSelected()==true && cbPistaAterrizaje.isSelected()==false){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "Disponible pista despegue", "No disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        }
                        else if(cbPistaDespegue.isSelected()==false && cbPistaAterrizaje.isSelected()==true){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "No disponible pista despegue", "Disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        }
                        else if(cbPistaDespegue.isSelected()==false && cbPistaAterrizaje.isSelected()==false){

                            clsTimeTable AgendaTable = new clsTimeTable(0, codigo, fechaTable, horaTable, "No disponible pista despegue", "No disponible pista aterrizaje");
                            controller.createTimeTale(AgendaTable);
                            Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n horario de vuelo!!!", "Agenda creada satisfactoriamente", WIDTH, m);
                            fillDataTable();
                            cleanAgendaTableQuestionnaire();
                        } 
                    }
                     
                }
                else{
                    if(codigo.equals("")){
                        JOptionPane.showMessageDialog(this, "Debe ingresar un codigo valido!");
                    }
                }
            }       
        }
    }//GEN-LAST:event_btnCrearAgendaActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        comboBoxDayFirst.setSelectedIndex(0);
        comboBoxDaySecond.setSelectedIndex(0);
        comboBoxMonthFirst.setSelectedIndex(0);
        comboBoxMonthSecond.setSelectedIndex(0);
        comboBoxYearFirst.setSelectedIndex(0);
        comboBoxYearSecond.setSelectedIndex(0);
        comboBoxHourFirst.setSelectedIndex(0);
        comboBoxHourSecond.setSelectedIndex(0);
        comboBoxMinutesFirst.setSelectedIndex(0);
        comboBoxMinutesSecond.setSelectedIndex(0);
        cbPistaAterrizaje.setSelected(false);
        cbPistaDespegue.setSelected(false);
        tfCodigoAgenda.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnBorrarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAgendaActionPerformed
        
        if(tblAgenda.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un vuelo para poderlo cancelar!");
            }
            
            else{
                
                if(tblAgenda.getSelectedRow() != -1){
                    
                    int fila = tblAgenda.getSelectedRow();
                    String valor = tblAgenda.getValueAt(fila, 0).toString();
                    
                    clsTimeTable agendaCancel = new clsTimeTable(0, valor, "", "", "", "");
                    
                    int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cancelar la agenda?");    
                    if (respuesta == JOptionPane.OK_OPTION) {

                        if (controller.deleteTimeTable(agendaCancel)) {

                            JOptionPane.showMessageDialog(this, "Agenda cancelada con éxito.");
                            fillDataTable();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Ocurrió un error al cancelar, por favor verifique los datos");
                    }
                }
        }
    }//GEN-LAST:event_btnBorrarAgendaActionPerformed

    //--------------------------------------------------------------------------
    
    private void cleanAgendaTableQuestionnaire(){
        
        comboBoxDayFirst.setSelectedIndex(0);
        comboBoxDaySecond.setSelectedIndex(0);
        comboBoxMonthFirst.setSelectedIndex(0);
        comboBoxMonthSecond.setSelectedIndex(0);
        comboBoxYearFirst.setSelectedIndex(0);
        comboBoxYearSecond.setSelectedIndex(0);
        comboBoxHourFirst.setSelectedIndex(0);
        comboBoxHourSecond.setSelectedIndex(0);
        comboBoxMinutesFirst.setSelectedIndex(0);
        comboBoxMinutesSecond.setSelectedIndex(0);
        cbPistaAterrizaje.setSelected(false);
        cbPistaDespegue.setSelected(false);
        tfCodigoAgenda.setText("");
    }
    
    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarAgenda;
    private javax.swing.JButton btnCrearAgenda;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox cbPistaAterrizaje;
    private javax.swing.JCheckBox cbPistaDespegue;
    private javax.swing.JComboBox<String> comboBoxDayFirst;
    private javax.swing.JComboBox<String> comboBoxDaySecond;
    private javax.swing.JComboBox<String> comboBoxHourFirst;
    private javax.swing.JComboBox<String> comboBoxHourSecond;
    private javax.swing.JComboBox<String> comboBoxMinutesFirst;
    private javax.swing.JComboBox<String> comboBoxMinutesSecond;
    private javax.swing.JComboBox<String> comboBoxMonthFirst;
    private javax.swing.JComboBox<String> comboBoxMonthSecond;
    private javax.swing.JComboBox<String> comboBoxYearFirst;
    private javax.swing.JComboBox<String> comboBoxYearSecond;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbVueloS;
    private javax.swing.JLabel lbVueloS1;
    private javax.swing.JLabel lbVueloS2;
    private javax.swing.JLabel lbVueloS3;
    private javax.swing.JLabel lbVueloS4;
    private javax.swing.JLabel lbVueloS5;
    private javax.swing.JLabel lbVueloS6;
    private javax.swing.JLabel lbVueloS7;
    private javax.swing.JLabel lbVueloS8;
    private javax.swing.JTable tblAgenda;
    private javax.swing.JTextField tfCodigoAgenda;
    // End of variables declaration//GEN-END:variables
}
