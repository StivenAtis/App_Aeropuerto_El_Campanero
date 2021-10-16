package View;

import Classes.clsFlightAgenda;
import Controller.ctlFlightAgenda;
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

    LinkedList<clsFlightAgenda> FlightAgendaObjectList = new LinkedList<>();
    
    LocalDate currentDate = LocalDate.now();
    
    //--------------------------------------------------------------------------
    
    public pnlReports() {
        initComponents();
         showFlightAgenda();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    
    //--------------------------------------------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVueloS = new javax.swing.JLabel();
        lbVueloS3 = new javax.swing.JLabel();
        lbVueloS4 = new javax.swing.JLabel();
        comboBReportesIndividual1 = new javax.swing.JComboBox<>();
        tfCodigoVuelo = new javax.swing.JTextField();
        comboBReportes = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnReporteUnitario = new javax.swing.JButton();
        btnReporteParcial = new javax.swing.JButton();
        lbVueloS1 = new javax.swing.JLabel();
        lbVueloS2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Reporte individual");
        lbVueloS.setToolTipText("");
        add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 410, 40));

        lbVueloS3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS3.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS3.setText("Seleccione");
        lbVueloS3.setToolTipText("");
        add(lbVueloS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 410, 40));

        lbVueloS4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS4.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS4.setText("Digite codigo del vuelo");
        lbVueloS4.setToolTipText("");
        add(lbVueloS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 410, 40));

        comboBReportesIndividual1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBReportesIndividual1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de vuelo", "Vuelo solicitado", "Vuelo Agendado", "Vuelo Cancelado", "Vuelo Rechazado" }));
        comboBReportesIndividual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBReportesIndividual1ActionPerformed(evt);
            }
        });
        add(comboBReportesIndividual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 410, 40));

        tfCodigoVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 410, 40));

        comboBReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una opción para reporte", "Vuelos solicitados", "Vuelos agendados", "Vuelos cancelados", "Vuelos rechazados", "Historial de reprogramación", "Reporte grupal" }));
        add(comboBReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 410, 40));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 410, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 410, 50));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 410, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 410, 50));

        btnReporteUnitario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_min.png"))); // NOI18N
        btnReporteUnitario.setContentAreaFilled(false);
        btnReporteUnitario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_min.png"))); // NOI18N
        btnReporteUnitario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_max.png"))); // NOI18N
        add(btnReporteUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 330, 120));

        btnReporteParcial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_min.png"))); // NOI18N
        btnReporteParcial.setContentAreaFilled(false);
        btnReporteParcial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_min.png"))); // NOI18N
        btnReporteParcial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reporte_max.png"))); // NOI18N
        btnReporteParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteParcialActionPerformed(evt);
            }
        });
        add(btnReporteParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 330, 120));

        lbVueloS1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS1.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS1.setText("Seleccione");
        lbVueloS1.setToolTipText("");
        add(lbVueloS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 410, 40));

        lbVueloS2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS2.setForeground(new java.awt.Color(255, 255, 255));
        lbVueloS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS2.setText("Reporte por agrupación");
        lbVueloS2.setToolTipText("");
        add(lbVueloS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 410, 40));

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
    
    private void comboBReportesIndividual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBReportesIndividual1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBReportesIndividual1ActionPerformed

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteParcial;
    private javax.swing.JButton btnReporteUnitario;
    private javax.swing.JComboBox<String> comboBReportes;
    private javax.swing.JComboBox<String> comboBReportesIndividual1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbVueloS;
    private javax.swing.JLabel lbVueloS1;
    private javax.swing.JLabel lbVueloS2;
    private javax.swing.JLabel lbVueloS3;
    private javax.swing.JLabel lbVueloS4;
    private javax.swing.JTextField tfCodigoVuelo;
    // End of variables declaration//GEN-END:variables
    //--------------------------------------------------------------------------
}
