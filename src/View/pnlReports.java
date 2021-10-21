package View;

import Classes.clsDeniedFlights;
import Classes.clsFlightAgenda;
import Classes.clsFlightAgendaReprogramation;
import Classes.clsFlightCancelationAgenda;
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
public class pnlReports extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    ctlFlightAgenda controlAgenda = new ctlFlightAgenda();
    ctlFlightRequirement controlAirline = new ctlFlightRequirement();

    LinkedList<clsFlightAgenda> FlightAgendaObjectList = new LinkedList<>();
    LinkedList<clsFlightCancelationAgenda> FlightCancelationAgendaObjectList = new LinkedList<>();
    LinkedList<clsDeniedFlights> FlightDeniedAgendaObjectList = new LinkedList<>();
    LinkedList<clsFlightAgendaReprogramation> FlightReprogramationHistoryAgendaObjectList = new LinkedList<>();
    LinkedList<clsFlightRequerimentsReprogramation> FlightReprogramationHistoryAirlineObjectList = new LinkedList<>();
    LinkedList<clsFlightRequirements> FlightRequerimentsObjectList = new LinkedList<>();
    
    LocalDate currentDate = LocalDate.now();
    
    //--------------------------------------------------------------------------
    
    public pnlReports() {
        initComponents();
        showFlightAgenda();
        showFlightRequeriments();
        showFlightCancelationAgenda();
        showFlightDeniedAgenda();
        showFlightReprogramationHistoryAgenda();
        showFlightReprogramationHistoryAirline();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    
    //--------------------------------------------------------------------------
    
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
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una opción para reporte", "Vuelos solicitados", "Vuelos agendados", "Vuelos en agenda cancelados", "Vuelos rechazados", "Historial de reprogramación", "Reporte grupal" }));
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
        lbVueloS2.setText("Reporte por agrupación");
        lbVueloS2.setToolTipText("");
        add(lbVueloS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 410, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reporte de vuelos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 1130, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 1130, 730));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btnReporteParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteParcialActionPerformed
        
        String agenda = comboBReportes.getSelectedItem().toString();
        
        if(agenda.equals("Vuelos agendados")){
            
            //Create book:
            HSSFWorkbook book = new HSSFWorkbook();
            
            //Create sheet(s) in book:
            HSSFSheet sheet = book.createSheet();
            
            int width = 28; // Where width is number of caracters 
            sheet.setDefaultColumnWidth(width);
            
            //HSSFSheet sheet_2 = book.createSheet();
            book.setSheetName(0, "Vuelos agendados - Aeropuerto");
            //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

            //Create sheet styles:
            CellStyle styleHeader = book.createCellStyle();
            styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
            //styleHeader.set
            styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            HSSFFont font = book.createFont();
            font.setBold(true);

            styleHeader.setFont(font);

            String[] headers = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo","Tripulación","Destino","Pista de vuelo",  
                                             "Fecha de vuelo", "Hora de vuelo", "ID Aerolínea"};

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
                                cell.setCellValue(FlightAgendaObjectList.get(i).getTripulación());
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
                FileOutputStream file = new FileOutputStream("Reportes Aeropuerto/Reporte de vuelos agendados - Aeropuero - " + DateWithTime.format(DateFormat) + ".xls");
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
            book.setSheetName(0, "Vuelos en agenda cancelados - Aeropuerto");
            //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

            //Create sheet styles:
            CellStyle styleHeader = book.createCellStyle();
            styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
            //styleHeader.set
            styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            HSSFFont font = book.createFont();
            font.setBold(true);

            styleHeader.setFont(font);

            String[] headers = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo","Tripulación","Destino","Pista de vuelo",  
                                             "Fecha de vuelo", "Hora de vuelo", "ID Aerolínea", "Descripción",};

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
                                cell.setCellValue(FlightCancelationAgendaObjectList.get(i).getTripulación());
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
                FileOutputStream file = new FileOutputStream("Reportes Aeropuerto/Reporte de vuelos en agenda cancelados - " + DateWithTime.format(DateFormat) + ".xls");
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
            book.setSheetName(0, "Vuelos rechazados - Aeropuerto");
            //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

            //Create sheet styles:
            CellStyle styleHeader = book.createCellStyle();
            styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
            //styleHeader.set
            styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            HSSFFont font = book.createFont();
            font.setBold(true);

            styleHeader.setFont(font);

            String[] headers = new String[]{"Codigo de vuelo","Tipo de vuelo","Clase de vuelo", "Fecha de vuelo", "Hora de vuelo", "Modelo avión", "Capacidad avión", "Tripulación",  
                                              "Destino", "ID Aerolínea", "Descripción",};

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
                                cell.setCellValue(FlightDeniedAgendaObjectList.get(i).getTripulación());
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
                FileOutputStream file = new FileOutputStream("Reportes Aeropuerto/Reporte de vuelos rechazados - " + DateWithTime.format(DateFormat) + ".xls");
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
        
        else if(agenda.equals("Historial de reprogramación")){
            
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
            book.setSheetName(1, "Aerolínea - Historial");
            //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

            //Create sheet styles:
            CellStyle styleHeader = book.createCellStyle();
            styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
            //styleHeader.set
            styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            HSSFFont font = book.createFont();
            font.setBold(true);

            styleHeader.setFont(font);

            String[] headers = new String[]{"Codigo de vuelo", "Tipo de vuelo", "Clase de vuelo", "Tripulación", "Destino", "Pista de vuelo", "Fecha de vuelo", "Hora de vuelo", "Id Aerolínea", "Descripción"};
            String[] headers1 = new String[]{"Codigo de vuelo", "Tipo de vuelo", "Clase de vuelo", "Tripulación", "Destino", "Capacidad avión", "Modelo avión", "Fecha de vuelo", "Hora de vuelo", "Id Aerolínea", "Descripción"};

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
                                cell.setCellValue(FlightReprogramationHistoryAgendaObjectList.get(i).getTripulación());
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
                                cell.setCellValue(FlightReprogramationHistoryAirlineObjectList.get(i).getTripulación());
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
                FileOutputStream file = new FileOutputStream("Reportes Aeropuerto/Reporte de historia de reprogramación - " + DateWithTime.format(DateFormat) + ".xls");
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
            book.setSheetName(0, "Vuelos solicitados por Aerolínea");
            //book.setSheetName(1, "Vuelos solicitados - Aeropuerto");

            //Create sheet styles:
            CellStyle styleHeader = book.createCellStyle();
            styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
            //styleHeader.set
            styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            HSSFFont font = book.createFont();
            font.setBold(true);

            styleHeader.setFont(font);

            String[] headers = new String[]{"Codigo de vuelo", "Modelo avión", "Tipo de vuelo","Clase de vuelo", "Capacidad avión", "Tripulación", "Fecha de vuelo", "Hora de vuelo",    
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
                                cell.setCellValue(FlightRequerimentsObjectList.get(i).getTripulación());
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
                FileOutputStream file = new FileOutputStream("Reportes Aeropuerto/Reporte de vuelos solicitados - " + DateWithTime.format(DateFormat) + ".xls");
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
            
        }
    }//GEN-LAST:event_btnReporteParcialActionPerformed

    //--------------------------------------------------------------------------

    private void showFlightAgenda(){
         
        FlightAgendaObjectList = controlAgenda.listFlightAgenda();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightAgenda FlightAgenda : FlightAgendaObjectList) {
            String data = "CODIGO DE VUELO: " + FlightAgenda.getCodigoVueloAgenda()+ " - " + "TIPO DE VUELO: " + FlightAgenda.getTipoVuelo()+ " - " + " CLASE DE VUELO: " + FlightAgenda.getClaseVuelo()+ " - " +
                          "TRIPULACIÓN: " + FlightAgenda.getTripulación() + " - " + "DESTINO: " + FlightAgenda.getDestino()+ " - " + "PISTA DE VUELO: " + FlightAgenda.getPista() + " - " + "FECHA DE VUELO: " + 
                         FlightAgenda.getFecha() + " - " + "HORA DE VUELO: " + FlightAgenda.getTiempo() + " - " + "ID AEROLÍNEA: " + FlightAgenda.getIdAerolinea();
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
                          "TRIPULACIÓN: " + HistoryReprogramation.getTripulación()+ " - " + "DESTINO: " + HistoryReprogramation.getDestino()+ " - " + "PISTA: " + HistoryReprogramation.getPista()+ " - " +
                    "FECHA: " + HistoryReprogramation.getFecha()+ " - " + "HORA: " + HistoryReprogramation.getTiempo()+ " - " + "DCESCRIPCIÓN: " + HistoryReprogramation.getDescripcion()+ " - " +  
                    "ID AEROLÍNEA: " + HistoryReprogramation.getIdAerolinea();
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
                          "TRIPULACIÓN: " + HistoryReprogramation.getTripulación()+ " - " + "DESTINO: " + HistoryReprogramation.getDestino()+ " - " + "CAPACIDAD AVIÓN: " + HistoryReprogramation.getCapacidadCarga()+ " - " +
                          "MODELO AVIÓN: " + HistoryReprogramation.getModeloAvion() + " - " + "FECHA: " + HistoryReprogramation.getFecha()+ " - " + "HORA: " + HistoryReprogramation.getHora()+ " - " +  
                          "DCESCRIPCIÓN: " + HistoryReprogramation.getDescripcion()+ " - " + "ID AEROLÍNEA: " + HistoryReprogramation.getId_airline();
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
            String data = "CODIGO DE VUELO: " + Flight.getCodigoVuelo()+ " - " + "MODELO AVIÓN: " + Flight.getModeloAvion()+ " - " + "TIPO VUELO: " + Flight.getTipoVuelo()+ " - " +
                          "CLASE VUELO: " + Flight.getSalidaLlegada()+ " - " + "CAPACIDAD AVIÓN: " + Flight.getCapacidadCarga()+ " - " + "TRIPULACIÓN: " + Flight.getTripulación()+ " - " + "FECHA DE VUELO: " + 
                         Flight.getFecha() + " - " + "HORA DE VUELO: " + Flight.getHora()+ " - " + "DESTINO: " + Flight.getDestino();
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
                          "TRIPULACIÓN: " + CancelationAgenda.getTripulación() + " - " + "DESTINO: " + CancelationAgenda.getDestino()+ " - " + "PISTA DE VUELO: " + CancelationAgenda.getPista() + " - " + "FECHA DE VUELO: " + 
                         CancelationAgenda.getFecha() + " - " + "HORA DE VUELO: " + CancelationAgenda.getTiempo() + " - " + "ID AEROLÍNEA: " + CancelationAgenda.getIdAerolinea() + " - " + "DESCRIPCIÓN: " + CancelationAgenda.getDescripcion();
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
                          "FECHA DE VUELO: " + DeniedAgenda.getFecha() + " - " + "HORA DE VUELO: " + DeniedAgenda.getHora()+ " - " + "MODELO AVIÓN: " + DeniedAgenda.getModeloAvion()+ " - " +
                    "CAPACIDAD AVIÓN: " + DeniedAgenda.getCapacidadAvion()+ " - " + "TRIPULACIÓN: " + DeniedAgenda.getTripulación() + " - " + "DESTINO: " + DeniedAgenda.getDestino()+ " - " +  
                    "ID AEROLÍNEA: " + DeniedAgenda.getIdAerolinea() + " - " + "DESCRIPCIÓN: " + DeniedAgenda.getDespricion();
                    model.add(index, data);
                    index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteParcial;
    private javax.swing.JComboBox<String> comboBReportes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbVueloS1;
    private javax.swing.JLabel lbVueloS2;
    // End of variables declaration//GEN-END:variables
    //--------------------------------------------------------------------------
}
