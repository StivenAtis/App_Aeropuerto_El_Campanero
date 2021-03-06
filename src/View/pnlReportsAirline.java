package View;

import Classes.clsDeniedFlights;
import Classes.clsFlightAgenda;
import Classes.clsFlightAgendaReprogramation;
import Classes.clsFlightCancelationAgenda;
import Classes.clsFlightCancelationAirline;
import Classes.clsFlightRequerimentsReprogramation;
import Classes.clsFlightRequirements;
import Controller.ctlFlightAgenda;
import Controller.ctlFlightRequirement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 *
 * @author Booh
 */
public class pnlReportsAirline extends javax.swing.JPanel {
    
    //--------------------------------------------------------------------------
    
    ctlFlightAgenda controlAgenda = new ctlFlightAgenda();
    ctlFlightRequirement controlAirline = new ctlFlightRequirement();

    LinkedList<clsFlightAgenda> FlightAgendaObjectList = new LinkedList<>();
    LinkedList<clsFlightCancelationAirline> FlightCancelationAirlineObjectList = new LinkedList<>();
    LinkedList<clsFlightCancelationAgenda> FlightCancelationAgendaObjectList = new LinkedList<>();
    LinkedList<clsDeniedFlights> FlightDeniedAgendaObjectList = new LinkedList<>();
    LinkedList<clsFlightAgendaReprogramation> FlightReprogramationHistoryAgendaObjectList = new LinkedList<>();
    LinkedList<clsFlightRequerimentsReprogramation> FlightReprogramationHistoryAirlineObjectList = new LinkedList<>();
    LinkedList<clsFlightRequirements> FlightRequerimentsObjectList = new LinkedList<>();
    
    LocalDate currentDate = LocalDate.now();
    
    //--------------------------------------------------------------------------
    
    public pnlReportsAirline() {
        initComponents();
        showFlightAgenda();
        showFlightRequeriments();
        showFlightCancelationAgenda();
        showFlightDeniedAgenda();
        showFlightCancelationAirline();
        showFlightReprogramationHistoryAgenda();
        showFlightReprogramationHistoryAirline();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBReportes = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnReporteParcial = new javax.swing.JButton();
        lbVueloS1 = new javax.swing.JLabel();
        lbVueloS2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una opci??n para reporte", "Vuelos solicitados", "Vuelos agendados", "Vuelos en solicitudes cancelados", "Vuelos en agenda cancelados", "Vuelos rechazados", "Historial de reprogramaci??n", "Reporte grupal" }));
        add(comboBReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 410, 40));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 410, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 410, 50));

        btnReporteParcial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_min.png"))); // NOI18N
        btnReporteParcial.setContentAreaFilled(false);
        btnReporteParcial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_min.png"))); // NOI18N
        btnReporteParcial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_max.png"))); // NOI18N
        btnReporteParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteParcialActionPerformed(evt);
            }
        });
        add(btnReporteParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 330, 120));

        lbVueloS1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS1.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS1.setText("Seleccione");
        lbVueloS1.setToolTipText("");
        add(lbVueloS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 410, 40));

        lbVueloS2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS2.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS2.setText("Reporte por agrupaci??n");
        lbVueloS2.setToolTipText("");
        add(lbVueloS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 410, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reporte de vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 1130, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 1130, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btnReporteParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteParcialActionPerformed
        
        String agenda = comboBReportes.getSelectedItem().toString();
        
        if(agenda.equals("Seleccione una opci??n para reporte")){
            JOptionPane.showMessageDialog(this, "??Debe seleccionar un tipo de reporte para generar un archivo!");
        }
        else{
            
            if(agenda.equals("Vuelos agendados")){
            
                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();
                int width = 28; // Where width is number of caracters 
                sheet.setDefaultColumnWidth(width);
                book.setSheetName(0, "Vuelos agendados - Aerolinea");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo","Tripulaci??n","Destino","Pista de vuelo",  
                                                 "Fecha de vuelo", "Hora de vuelo", "ID Aerol??nea"};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < FlightAgendaObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1); 

                                //Create cells in rows:     
                                HSSFCell cell = row.createCell(0);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getCodigoVueloAgenda());
                                cell = row.createCell(1);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getTipoVuelo());
                                cell = row.createCell(2);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getClaseVuelo());
                                cell = row.createCell(3);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getTripulaci??n());
                                cell = row.createCell(4);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getDestino());
                                cell = row.createCell(5);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getPista());
                                cell = row.createCell(6);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getFecha());
                                cell = row.createCell(7);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getTiempo());
                                cell = row.createCell(8);
                                cell.setCellValue(FlightAgendaObjectList.get(i).getIdAerolinea());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerol??nea/Reporte de vuelos agendados - Aerol??nea - " + DateWithTime.format(DateFormat) + ".xls");
                    book.write(file);
                    file.close();
                    JOptionPane.showMessageDialog(this, "Reporte generado satisfactoriamente");

                } catch (FileNotFoundException ex) {
                    System.out.println("Error leyendo el archivo: " + ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Error generando el reporte!");
                    Logger.getLogger(pnlReprogramFlightAirline.class.getName()).log(Level.SEVERE, null, ex);

                }catch (IOException ex){
                    System.out.println("Error escribiendo archivo: " + ex.getMessage());
                }
            }

            //======================================================================

            else if(agenda.equals("Vuelos en solicitudes cancelados")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();

                int width = 28; // Where width is number of caracters 
                sheet.setDefaultColumnWidth(width);

                //HSSFSheet sheet_2 = book.createSheet();
                book.setSheetName(0, "Vuelos en solicitudes cancelados - Aerol??nea");
                //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Codigo de vuelo","Modelo avi??n","Tipo de vuelo","Clase de vuelo","Capacidad avi??n","Tripulaci??n",  
                                                 "Fecha de vuelo", "Hora de vuelo", "Destino", "ID Aerol??nea", "Descripci??n"};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < FlightCancelationAirlineObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1); 

                                //Create cells in rows:     
                                HSSFCell cell = row.createCell(0);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getCodigoVuelo());
                                cell = row.createCell(1);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getModeloAvion());
                                cell = row.createCell(2);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getTipoVuelo());
                                cell = row.createCell(3);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getSalidaLlegada());
                                cell = row.createCell(4);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getCapacidadCarga());
                                cell = row.createCell(5);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getTripulaci??n());
                                cell = row.createCell(6);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getFecha());
                                cell = row.createCell(7);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getHora());
                                cell = row.createCell(8);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getDestino());
                                cell = row.createCell(9);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getId_airline());
                                cell = row.createCell(10);
                                cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getDescripcion());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerol??nea/Reporte de vuelos en solicitudes cancelados - " + DateWithTime.format(DateFormat) + ".xls");
                    book.write(file);
                    file.close();
                    JOptionPane.showMessageDialog(this, "Reporte generado satisfactoriamente");

                } catch (FileNotFoundException ex) {
                    System.out.println("Error leyendo el archivo: " + ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Error generando el reporte!");
                    Logger.getLogger(pnlReprogramFlightAirline.class.getName()).log(Level.SEVERE, null, ex);

                }catch (IOException ex){
                    System.out.println("Error escribiendo archivo: " + ex.getMessage());
                }
            }

            //======================================================================

            else if(agenda.equals("Vuelos en agenda cancelados")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();

                int width = 28; // Where width is number of caracters 
                sheet.setDefaultColumnWidth(width);

                //HSSFSheet sheet_2 = book.createSheet();
                book.setSheetName(0, "Vuelos en agenda cancelados - Aerol??nea");
                //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo","Tripulaci??n","Destino","Pista de vuelo",  
                                                 "Fecha de vuelo", "Hora de vuelo", "ID Aerol??nea", "Descripci??n",};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < FlightCancelationAgendaObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1); 

                                //Create cells in rows:     
                                HSSFCell cell = row.createCell(0);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getCodigoVueloAgenda());
                                cell = row.createCell(1);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getTipoVuelo());
                                cell = row.createCell(2);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getClaseVuelo());
                                cell = row.createCell(3);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getTripulaci??n());
                                cell = row.createCell(4);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getDestino());
                                cell = row.createCell(5);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getPista());
                                cell = row.createCell(6);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getFecha());
                                cell = row.createCell(7);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getTiempo());
                                cell = row.createCell(8);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getIdAerolinea());
                                cell = row.createCell(9);
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getDescripcion());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerol??nea/Reporte de vuelos en agenda cancelados - " + DateWithTime.format(DateFormat) + ".xls");
                    book.write(file);
                    file.close();
                    JOptionPane.showMessageDialog(this, "Reporte generado satisfactoriamente");

                } catch (FileNotFoundException ex) {
                    System.out.println("Error leyendo el archivo: " + ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Error generando el reporte!");
                    Logger.getLogger(pnlReprogramFlightAirline.class.getName()).log(Level.SEVERE, null, ex);

                }catch (IOException ex){
                    System.out.println("Error escribiendo archivo: " + ex.getMessage());
                }
            }

            //======================================================================

            else if(agenda.equals("Vuelos rechazados")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();

                int width = 28; // Where width is number of caracters 
                sheet.setDefaultColumnWidth(width);

                //HSSFSheet sheet_2 = book.createSheet();
                book.setSheetName(0, "Vuelos rechazados - Aerol??nea");
                //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo", "Fecha de vuelo", "Hora de vuelo", "Modelo avi??n", "Capacidad avi??n", "Tripulaci??n",  
                                                  "Destino", "ID Aerol??nea", "Descripci??n",};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < FlightDeniedAgendaObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1); 

                                //Create cells in rows:     
                                HSSFCell cell = row.createCell(0);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getCodigoVueloAgenda());
                                cell = row.createCell(1);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getTipoVuelo());
                                cell = row.createCell(2);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getLlegadaSalida());
                                cell = row.createCell(3);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getFecha());
                                cell = row.createCell(4);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getHora());
                                cell = row.createCell(5);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getModeloAvion());
                                cell = row.createCell(6);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getCapacidadAvion());
                                cell = row.createCell(7);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getTripulaci??n());
                                cell = row.createCell(8);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getDestino());
                                cell = row.createCell(9);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getIdAerolinea());
                                cell = row.createCell(10);
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getDespricion());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerol??nea/Reporte de vuelos rechazados por Aeropuerto - " + DateWithTime.format(DateFormat) + ".xls");
                    book.write(file);
                    file.close();
                    JOptionPane.showMessageDialog(this, "Reporte generado satisfactoriamente");

                } catch (FileNotFoundException ex) {
                    System.out.println("Error leyendo el archivo: " + ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Error generando el reporte!");
                    Logger.getLogger(pnlReprogramFlightAirline.class.getName()).log(Level.SEVERE, null, ex);

                }catch (IOException ex){
                    System.out.println("Error escribiendo archivo: " + ex.getMessage());
                }
            }

            //======================================================================

            else if(agenda.equals("Historial de reprogramaci??n")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();
                HSSFSheet sheet1 = book.createSheet();

                int width = 28; // Where width is number of caracters 
                sheet.setDefaultColumnWidth(width);
                sheet1.setDefaultColumnWidth(width);

                //HSSFSheet sheet_2 = book.createSheet();
                book.setSheetName(0, "Aeropuerto - Historial");
                book.setSheetName(1, "Aerol??nea - Historial");
                //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Codigo de vuelo", "Tipo de vuelo", "Clase de vuelo", "Tripulaci??n", "Destino", "Pista de vuelo", "Fecha de vuelo", "Hora de vuelo", "Id Aerol??nea", "Descripci??n"};
                String[] headers1 = new String[]{"Codigo de vuelo", "Tipo de vuelo", "Clase de vuelo", "Tripulaci??n", "Destino", "Capacidad avi??n", "Modelo avi??n", "Fecha de vuelo", "Hora de vuelo", "Id Aerol??nea", "Descripci??n"};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);
                HSSFRow header1 = sheet1.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < FlightReprogramationHistoryAgendaObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1); 

                                //Create cells in rows:     
                                HSSFCell cell = row.createCell(0);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getCodigoVueloAgenda());
                                cell = row.createCell(1);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getTipoVuelo());
                                cell = row.createCell(2);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getClaseVuelo());
                                cell = row.createCell(3);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getTripulaci??n());
                                cell = row.createCell(4);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getDestino());
                                cell = row.createCell(5);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getPista());
                                cell = row.createCell(6);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getFecha());
                                cell = row.createCell(7);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getTiempo());
                                cell = row.createCell(8);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getIdAerolinea());
                                cell = row.createCell(9);
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getDescripcion());
                    }

                    //--------------------------------------------------------------

                for (int j = 0; j < headers1.length; j++) {
                HSSFCell cellHeader1 = header1.createCell(j);
                cellHeader1.setCellValue(headers1[j]);
                cellHeader1.setCellStyle(styleHeader);
                }

                for (int i = 0; i < FlightReprogramationHistoryAirlineObjectList.size(); i++) {

                    HSSFRow row = sheet1.createRow(i + 1); 

                                //Create cells in rows:     
                                HSSFCell cell = row.createCell(0);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getCodigoVuelo());
                                cell = row.createCell(1);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getTipoVuelo());
                                cell = row.createCell(2);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getSalidaLlegada());
                                cell = row.createCell(3);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getTripulaci??n());
                                cell = row.createCell(4);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getDestino());
                                cell = row.createCell(5);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getCapacidadCarga());
                                cell = row.createCell(6);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getModeloAvion());
                                cell = row.createCell(7);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getFecha());
                                cell = row.createCell(8);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getHora());
                                cell = row.createCell(9);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getId_airline());
                                cell = row.createCell(10);
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getDescripcion());
                    }

                    //--------------------------------------------------------------

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerol??nea/Reporte de historia de reprogramaci??n - " + DateWithTime.format(DateFormat) + ".xls");
                    book.write(file);
                    file.close();
                    JOptionPane.showMessageDialog(this, "Reporte generado satisfactoriamente");

                } catch (FileNotFoundException ex) {
                    System.out.println("Error leyendo el archivo: " + ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Error generando el reporte!");
                    Logger.getLogger(pnlReprogramFlightAirline.class.getName()).log(Level.SEVERE, null, ex);

                }catch (IOException ex){
                    System.out.println("Error escribiendo archivo: " + ex.getMessage());
                }
            }

            //======================================================================

            else if(agenda.equals("Vuelos solicitados")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();

                int width = 28; // Where width is number of caracters 
                sheet.setDefaultColumnWidth(width);

                //HSSFSheet sheet_2 = book.createSheet();
                book.setSheetName(0, "Vuelos solicitados - Aerol??nea");
                //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Codigo de vuelo", "Modelo avi??n", "Tipo de vuelo","Clase de vuelo", "Capacidad avi??n", "Tripulaci??n", "Fecha de vuelo", "Hora de vuelo",    
                                                  "Destino"};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < FlightRequerimentsObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1); 

                                //Create cells in rows:     
                                HSSFCell cell = row.createCell(0);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getCodigoVuelo());
                                cell = row.createCell(1);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getModeloAvion());
                                cell = row.createCell(2);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getTipoVuelo());
                                cell = row.createCell(3);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getSalidaLlegada());
                                cell = row.createCell(4);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getCapacidadCarga());
                                cell = row.createCell(5);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getTripulaci??n());
                                cell = row.createCell(6);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getFecha());
                                cell = row.createCell(7);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getHora());
                                cell = row.createCell(8);
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getDestino());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerol??nea/Reporte de vuelos solicitados - " + DateWithTime.format(DateFormat) + ".xls");
                    book.write(file);
                    file.close();
                    JOptionPane.showMessageDialog(this, "Reporte generado satisfactoriamente");

                } catch (FileNotFoundException ex) {
                    System.out.println("Error leyendo el archivo: " + ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Error generando el reporte!");
                    Logger.getLogger(pnlReprogramFlightAirline.class.getName()).log(Level.SEVERE, null, ex);

                }catch (IOException ex){
                    System.out.println("Error escribiendo archivo: " + ex.getMessage());
                }
            }

            //======================================================================

            else if(agenda.equals("Reporte grupal")){

                //Create book:
                    HSSFWorkbook book = new HSSFWorkbook();

                    //Create sheet(s) in book:
                    HSSFSheet sheet = book.createSheet();
                    HSSFSheet sheet1 = book.createSheet();
                    HSSFSheet sheet2 = book.createSheet();
                    HSSFSheet sheet3 = book.createSheet();
                    HSSFSheet sheet4 = book.createSheet();
                    HSSFSheet sheet5 = book.createSheet();
                    HSSFSheet sheet6 = book.createSheet();

                    int width = 28; // Where width is number of caracters 
                    sheet.setDefaultColumnWidth(width);
                    sheet1.setDefaultColumnWidth(width);
                    sheet2.setDefaultColumnWidth(width);
                    sheet3.setDefaultColumnWidth(width);
                    sheet4.setDefaultColumnWidth(width);
                    sheet5.setDefaultColumnWidth(width);
                    sheet6.setDefaultColumnWidth(width);

                    //HSSFSheet sheet_2 = book.createSheet();
                    book.setSheetName(0, "1 - Vuelos agendados");
                    book.setSheetName(1, "2 - Vuelos en Agenda cancelados");
                    book.setSheetName(2, "3 - Vuelos rechazados");
                    book.setSheetName(3, "4 - Aeropuerto - Historial");
                    book.setSheetName(4, "5 - Aerolinea - Historial");
                    book.setSheetName(5, "6 - Vuelos solicitados");
                    book.setSheetName(6, "7 - Vuelos cancelados en solicitudes");
                    //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

                    //Create sheet styles:
                    CellStyle styleHeader = book.createCellStyle();
                    styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                    //styleHeader.set
                    styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    HSSFFont font = book.createFont();
                    font.setBold(true);

                    styleHeader.setFont(font);

                    String[] headers = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo","Tripulaci??n","Destino","Pista de vuelo", "Fecha de vuelo", "Hora de vuelo", "ID Aerol??nea"};
                    String[] headers1 = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo","Tripulaci??n","Destino","Pista de vuelo", "Fecha de vuelo", "Hora de vuelo", "ID Aerol??nea", "Descripci??n",};
                    String[] headers2 = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo", "Fecha de vuelo", "Hora de vuelo", "Modelo avi??n", "Capacidad avi??n", "Tripulaci??n", "Destino", "ID Aerol??nea", "Descripci??n",};
                    String[] headers3 = new String[]{"Codigo de vuelo", "Tipo de vuelo", "Clase de vuelo", "Tripulaci??n", "Destino", "Pista de vuelo", "Fecha de vuelo", "Hora de vuelo", "Id Aerol??nea", "Descripci??n"};
                    String[] headers4 = new String[]{"Codigo de vuelo", "Tipo de vuelo", "Clase de vuelo", "Tripulaci??n", "Destino", "Capacidad avi??n", "Modelo avi??n", "Fecha de vuelo", "Hora de vuelo", "Id Aerol??nea", "Descripci??n"};
                    String[] headers5 = new String[]{"Codigo de vuelo", "Modelo avi??n", "Tipo de vuelo","Clase de vuelo", "Capacidad avi??n", "Tripulaci??n", "Fecha de vuelo", "Hora de vuelo", "Destino"};
                    String[] headers6 = new String[]{"Codigo de vuelo","Modelo avi??n","Tipo de vuelo","Clase de vuelo","Capacidad avi??n","Tripulaci??n",  
                                                 "Fecha de vuelo", "Hora de vuelo", "Destino", "ID Aerol??nea", "Descripci??n"};

                    //Create rows on the sheets:
                    HSSFRow header = sheet.createRow(0);
                    HSSFRow header1 = sheet1.createRow(0);
                    HSSFRow header2 = sheet2.createRow(0);
                    HSSFRow header3 = sheet3.createRow(0);
                    HSSFRow header4 = sheet4.createRow(0);
                    HSSFRow header5 = sheet5.createRow(0);
                    HSSFRow header6 = sheet6.createRow(0);

                    for (int i = 0; i < headers.length; i++) {
                        HSSFCell cellHeader = header.createCell(i);
                        cellHeader.setCellValue(headers[i]);
                        cellHeader.setCellStyle(styleHeader);
                    }

                    for (int i = 0; i < FlightAgendaObjectList.size(); i++) {

                        HSSFRow row = sheet.createRow(i + 1); 

                                    //Create cells in rows:     
                                    HSSFCell cell = row.createCell(0);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getCodigoVueloAgenda());
                                    cell = row.createCell(1);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getTipoVuelo());
                                    cell = row.createCell(2);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getClaseVuelo());
                                    cell = row.createCell(3);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getTripulaci??n());
                                    cell = row.createCell(4);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getDestino());
                                    cell = row.createCell(5);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getPista());
                                    cell = row.createCell(6);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getFecha());
                                    cell = row.createCell(7);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getTiempo());
                                    cell = row.createCell(8);
                                    cell.setCellValue(FlightAgendaObjectList.get(i).getIdAerolinea());
                    }

                    for (int j = 0; j < headers1.length; j++) {
                        HSSFCell cellHeader1 = header1.createCell(j);
                        cellHeader1.setCellValue(headers1[j]);
                        cellHeader1.setCellStyle(styleHeader);
                    }

                    for (int i = 0; i < FlightCancelationAgendaObjectList.size(); i++) {

                        HSSFRow row = sheet1.createRow(i + 1); 

                                    //Create cells in rows:     
                                    HSSFCell cell = row.createCell(0);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getCodigoVueloAgenda());
                                    cell = row.createCell(1);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getTipoVuelo());
                                    cell = row.createCell(2);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getClaseVuelo());
                                    cell = row.createCell(3);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getTripulaci??n());
                                    cell = row.createCell(4);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getDestino());
                                    cell = row.createCell(5);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getPista());
                                    cell = row.createCell(6);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getFecha());
                                    cell = row.createCell(7);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getTiempo());
                                    cell = row.createCell(8);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getIdAerolinea());
                                    cell = row.createCell(9);
                                    cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getDescripcion());
                    }

                    for (int k = 0; k < headers2.length; k++) {
                        HSSFCell cellHeader = header2.createCell(k);
                        cellHeader.setCellValue(headers2[k]);
                        cellHeader.setCellStyle(styleHeader);
                    }

                    for (int i = 0; i < FlightDeniedAgendaObjectList.size(); i++) {

                        HSSFRow row = sheet2.createRow(i + 1); 

                                    //Create cells in rows:     
                                    HSSFCell cell = row.createCell(0);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getCodigoVueloAgenda());
                                    cell = row.createCell(1);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getTipoVuelo());
                                    cell = row.createCell(2);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getLlegadaSalida());
                                    cell = row.createCell(3);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getFecha());
                                    cell = row.createCell(4);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getHora());
                                    cell = row.createCell(5);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getModeloAvion());
                                    cell = row.createCell(6);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getCapacidadAvion());
                                    cell = row.createCell(7);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getTripulaci??n());
                                    cell = row.createCell(8);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getDestino());
                                    cell = row.createCell(9);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getIdAerolinea());
                                    cell = row.createCell(10);
                                    cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getDespricion());
                    }

                    for (int l = 0; l < headers3.length; l++) {
                        HSSFCell cellHeader = header3.createCell(l);
                        cellHeader.setCellValue(headers3[l]);
                        cellHeader.setCellStyle(styleHeader);
                    }

                    for (int i = 0; i < FlightReprogramationHistoryAgendaObjectList.size(); i++) {

                        HSSFRow row = sheet3.createRow(i + 1); 

                                    //Create cells in rows:     
                                    HSSFCell cell = row.createCell(0);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getCodigoVueloAgenda());
                                    cell = row.createCell(1);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getTipoVuelo());
                                    cell = row.createCell(2);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getClaseVuelo());
                                    cell = row.createCell(3);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getTripulaci??n());
                                    cell = row.createCell(4);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getDestino());
                                    cell = row.createCell(5);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getPista());
                                    cell = row.createCell(6);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getFecha());
                                    cell = row.createCell(7);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getTiempo());
                                    cell = row.createCell(8);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getIdAerolinea());
                                    cell = row.createCell(9);
                                    cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getDescripcion());
                    }
                    
                    for (int m = 0; m < headers4.length; m++) {
                        HSSFCell cellHeader1 = header4.createCell(m);
                        cellHeader1.setCellValue(headers4[m]);
                        cellHeader1.setCellStyle(styleHeader);
                    }

                    for (int i = 0; i < FlightReprogramationHistoryAirlineObjectList.size(); i++) {

                        HSSFRow row = sheet4.createRow(i + 1); 

                                    //Create cells in rows:     
                                    HSSFCell cell = row.createCell(0);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getCodigoVuelo());
                                    cell = row.createCell(1);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getTipoVuelo());
                                    cell = row.createCell(2);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getSalidaLlegada());
                                    cell = row.createCell(3);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getTripulaci??n());
                                    cell = row.createCell(4);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getDestino());
                                    cell = row.createCell(5);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getCapacidadCarga());
                                    cell = row.createCell(6);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getModeloAvion());
                                    cell = row.createCell(7);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getFecha());
                                    cell = row.createCell(8);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getHora());
                                    cell = row.createCell(9);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getId_airline());
                                    cell = row.createCell(10);
                                    cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getDescripcion());
                    }

                    for (int n = 0; n < headers5.length; n++) {
                        HSSFCell cellHeader = header5.createCell(n);
                        cellHeader.setCellValue(headers5[n]);
                        cellHeader.setCellStyle(styleHeader);
                    }

                    for (int i = 0; i < FlightRequerimentsObjectList.size(); i++) {

                        HSSFRow row = sheet5.createRow(i + 1); 

                                    //Create cells in rows:     
                                    HSSFCell cell = row.createCell(0);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getCodigoVuelo());
                                    cell = row.createCell(1);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getModeloAvion());
                                    cell = row.createCell(2);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getTipoVuelo());
                                    cell = row.createCell(3);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getSalidaLlegada());
                                    cell = row.createCell(4);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getCapacidadCarga());
                                    cell = row.createCell(5);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getTripulaci??n());
                                    cell = row.createCell(6);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getFecha());
                                    cell = row.createCell(7);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getHora());
                                    cell = row.createCell(8);
                                    cell.setCellValue(FlightRequerimentsObjectList.get(i).getDestino());
                    }

                    for (int i = 0; i < headers6.length; i++) {
                        HSSFCell cellHeader = header6.createCell(i);
                        cellHeader.setCellValue(headers6[i]);
                        cellHeader.setCellStyle(styleHeader);
                    }

                    for (int i = 0; i < FlightCancelationAirlineObjectList.size(); i++) {

                        HSSFRow row = sheet6.createRow(i + 1); 

                                    //Create cells in rows:     
                                    HSSFCell cell = row.createCell(0);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getCodigoVuelo());
                                    cell = row.createCell(1);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getModeloAvion());
                                    cell = row.createCell(2);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getTipoVuelo());
                                    cell = row.createCell(3);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getSalidaLlegada());
                                    cell = row.createCell(4);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getCapacidadCarga());
                                    cell = row.createCell(5);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getTripulaci??n());
                                    cell = row.createCell(6);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getFecha());
                                    cell = row.createCell(7);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getHora());
                                    cell = row.createCell(8);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getDestino());
                                    cell = row.createCell(9);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getId_airline());
                                    cell = row.createCell(10);
                                    cell.setCellValue(FlightCancelationAirlineObjectList.get(i).getDescripcion());
                    }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerol??nea/Reporte total - Aerol??nea - " + DateWithTime.format(DateFormat) + ".xls");
                    book.write(file);
                    file.close();
                    JOptionPane.showMessageDialog(this, "Reporte generado satisfactoriamente");

                } catch (FileNotFoundException ex) {
                    System.out.println("Error leyendo el archivo: " + ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Error generando el reporte!");
                    Logger.getLogger(pnlReprogramFlightAirline.class.getName()).log(Level.SEVERE, null, ex);

                }catch (IOException ex){
                    System.out.println("Error escribiendo archivo: " + ex.getMessage());
                }
            }
        }   
    }//GEN-LAST:event_btnReporteParcialActionPerformed

    //--------------------------------------------------------------------------
    
    private void showFlightAgenda(){
         
        FlightAgendaObjectList = controlAgenda.listFlightAgenda();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightAgenda FlightAgenda : FlightAgendaObjectList) {
            String data = "CODIGO DE VUELO: " + FlightAgenda.getCodigoVueloAgenda()+ " - " + "TIPO DE VUELO: " + FlightAgenda.getTipoVuelo()+ " - " + " CLASE DE VUELO: " + FlightAgenda.getClaseVuelo()+ " - " +
                          "TRIPULACI??N: " + FlightAgenda.getTripulaci??n() + " - " + "DESTINO: " + FlightAgenda.getDestino()+ " - " + "PISTA DE VUELO: " + FlightAgenda.getPista() + " - " + "FECHA DE VUELO: " + 
                         FlightAgenda.getFecha() + " - " + "HORA DE VUELO: " + FlightAgenda.getTiempo() + " - " + "ID AEROL??NEA: " + FlightAgenda.getIdAerolinea();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void showFlightReprogramationHistoryAgenda(){
         
        FlightReprogramationHistoryAgendaObjectList = controlAirline.listFlightReprogramationHistory();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightAgendaReprogramation HistoryReprogramation : FlightReprogramationHistoryAgendaObjectList) {
            String data = "CODIGO DE VUELO: " + HistoryReprogramation.getCodigoVueloAgenda()+ " - " + "TIPO DE VUELO: " + HistoryReprogramation.getTipoVuelo()+ " - " + " CLASE DE VUELO: " + HistoryReprogramation.getClaseVuelo()+ " - " +
                          "TRIPULACI??N: " + HistoryReprogramation.getTripulaci??n()+ " - " + "DESTINO: " + HistoryReprogramation.getDestino()+ " - " + "PISTA: " + HistoryReprogramation.getPista()+ " - " +
                    "FECHA: " + HistoryReprogramation.getFecha()+ " - " + "HORA: " + HistoryReprogramation.getTiempo()+ " - " + "DCESCRIPCI??N: " + HistoryReprogramation.getDescripcion()+ " - " +  
                    "ID AEROL??NEA: " + HistoryReprogramation.getIdAerolinea();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void showFlightReprogramationHistoryAirline(){
         
        FlightReprogramationHistoryAirlineObjectList = controlAirline.listFlightReprogramationHistoryAirline();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightRequerimentsReprogramation HistoryReprogramation : FlightReprogramationHistoryAirlineObjectList) {
            String data = "CODIGO DE VUELO: " + HistoryReprogramation.getCodigoVuelo()+ " - " + "TIPO DE VUELO: " + HistoryReprogramation.getTipoVuelo()+ " - " + " CLASE DE VUELO: " + HistoryReprogramation.getSalidaLlegada()+ " - " +
                          "TRIPULACI??N: " + HistoryReprogramation.getTripulaci??n()+ " - " + "DESTINO: " + HistoryReprogramation.getDestino()+ " - " + "CAPACIDAD AVI??N: " + HistoryReprogramation.getCapacidadCarga()+ " - " +
                          "MODELO AVI??N: " + HistoryReprogramation.getModeloAvion() + " - " + "FECHA: " + HistoryReprogramation.getFecha()+ " - " + "HORA: " + HistoryReprogramation.getHora()+ " - " +  
                          "DCESCRIPCI??N: " + HistoryReprogramation.getDescripcion()+ " - " + "ID AEROL??NEA: " + HistoryReprogramation.getId_airline();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void showFlightRequeriments(){
         
        FlightRequerimentsObjectList = controlAirline.listFlight();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightRequirements Flight : FlightRequerimentsObjectList) {
            String data = "CODIGO DE VUELO: " + Flight.getCodigoVuelo()+ " - " + "MODELO AVI??N: " + Flight.getModeloAvion()+ " - " + "TIPO VUELO: " + Flight.getTipoVuelo()+ " - " +
                          "CLASE VUELO: " + Flight.getSalidaLlegada()+ " - " + "CAPACIDAD AVI??N: " + Flight.getCapacidadCarga()+ " - " + "TRIPULACI??N: " + Flight.getTripulaci??n()+ " - " + "FECHA DE VUELO: " + 
                         Flight.getFecha() + " - " + "HORA DE VUELO: " + Flight.getHora()+ " - " + "DESTINO: " + Flight.getDestino();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
     private void showFlightCancelationAirline(){
        
        FlightCancelationAirlineObjectList = controlAgenda.listCancelationAirline();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightCancelationAirline CancelationAirline : FlightCancelationAirlineObjectList) {
            String data = "CODIGO DE VUELO: " + CancelationAirline.getCodigoVuelo()+ " - " + "MODELO AVI??N: " + CancelationAirline.getModeloAvion()+ " - " + " TIPO DE VUELO: " + CancelationAirline.getTipoVuelo()+ " - " +
                          "CLASE DE VUELO: " + CancelationAirline.getSalidaLlegada()+ " - " + "CAPACIDAD AVI??N: " + CancelationAirline.getCapacidadCarga()+ " - " + "TRIPULACI??N: " + CancelationAirline.getTripulaci??n()+ " - " +
                          "FECHA DE VUELO: " + CancelationAirline.getFecha() + " - " + "HORA DE VUELO: " + CancelationAirline.getHora()+ " - " + "DESTINO: " + CancelationAirline.getDestino()+ " - " + 
                         "ID AEROL??NEA: " + CancelationAirline.getId_airline() + " - " +"DESCRIPCI??N: " + CancelationAirline.getDescripcion();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void showFlightCancelationAgenda(){
         
        FlightCancelationAgendaObjectList = controlAgenda.listCancelationAgenda();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightCancelationAgenda CancelationAgenda : FlightCancelationAgendaObjectList) {
            String data = "CODIGO DE VUELO: " + CancelationAgenda.getCodigoVueloAgenda()+ " - " + "TIPO DE VUELO: " + CancelationAgenda.getTipoVuelo()+ " - " + " CLASE DE VUELO: " + CancelationAgenda.getClaseVuelo()+ " - " +
                          "TRIPULACI??N: " + CancelationAgenda.getTripulaci??n() + " - " + "DESTINO: " + CancelationAgenda.getDestino()+ " - " + "PISTA DE VUELO: " + CancelationAgenda.getPista() + " - " + "FECHA DE VUELO: " + 
                         CancelationAgenda.getFecha() + " - " + "HORA DE VUELO: " + CancelationAgenda.getTiempo() + " - " + "ID AEROL??NEA: " + CancelationAgenda.getIdAerolinea() + " - " + "DESCRIPCI??N: " + CancelationAgenda.getDescripcion();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void showFlightDeniedAgenda(){
         
        FlightDeniedAgendaObjectList = controlAgenda.listFlightDenied();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsDeniedFlights DeniedAgenda : FlightDeniedAgendaObjectList) {
            String data = "CODIGO DE VUELO: " + DeniedAgenda.getCodigoVueloAgenda()+ " - " + "TIPO DE VUELO: " + DeniedAgenda.getTipoVuelo()+ " - " + " CLASE DE VUELO: " + DeniedAgenda.getLlegadaSalida()+ " - " +
                          "FECHA DE VUELO: " + DeniedAgenda.getFecha() + " - " + "HORA DE VUELO: " + DeniedAgenda.getHora()+ " - " + "MODELO AVI??N: " + DeniedAgenda.getModeloAvion()+ " - " +
                    "CAPACIDAD AVI??N: " + DeniedAgenda.getCapacidadAvion()+ " - " + "TRIPULACI??N: " + DeniedAgenda.getTripulaci??n() + " - " + "DESTINO: " + DeniedAgenda.getDestino()+ " - " +  
                    "ID AEROL??NEA: " + DeniedAgenda.getIdAerolinea() + " - " + "DESCRIPCI??N: " + DeniedAgenda.getDespricion();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteParcial;
    private javax.swing.JComboBox<String> comboBReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbVueloS1;
    private javax.swing.JLabel lbVueloS2;
    // End of variables declaration//GEN-END:variables

    //--------------------------------------------------------------------------
}
