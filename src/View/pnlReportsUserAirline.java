package View;

import Classes.clsAirlineStaff;
import Classes.clsAirlineStaffDelete;
import Controller.ctlAirlineStaff;
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
public class pnlReportsUserAirline extends javax.swing.JPanel {
    
    //--------------------------------------------------------------------------
    
    ctlAirlineStaff controlAirport = new ctlAirlineStaff();
    
    LinkedList<clsAirlineStaff> usersObjectList = new LinkedList<>();
    LinkedList<clsAirlineStaffDelete> usersDeleteObjectList = new LinkedList<>();
    
    LocalDate currentDate = LocalDate.now();
    
    //--------------------------------------------------------------------------

    public pnlReportsUserAirline() {
        
        initComponents();
        showUsers();
        showUsersDelete();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lb3 = new javax.swing.JLabel();
        comboBReportes = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        btnReporteParcial = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb1.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Reporte de usuarios");
        add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 1130, 90));

        lb2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("Reporte por agrupación");
        lb2.setToolTipText("");
        add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 410, 40));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 410, 30));

        lb3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("Seleccione");
        lb3.setToolTipText("");
        add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 410, 40));

        comboBReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción para reporte", "Usuarios registrados", "Usuarios eliminados", "Reporte grupal" }));
        add(comboBReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 410, 40));
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 1130, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline_Adiministration.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btnReporteParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteParcialActionPerformed

        String users = comboBReportes.getSelectedItem().toString();

        if(users.equals("Seleccione una opción para reporte")){
            JOptionPane.showMessageDialog(this, "¡Debe seleccionar un tipo de reporte para generar un archivo!");
        }
        else{

            if(users.equals("Usuarios registrados")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();

                int width = 28; // Where width is number of caracters
                sheet.setDefaultColumnWidth(width);

                book.setSheetName(0, "Usuarios Activos - Aerolínea");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                
                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Numero identificación","Nombres","Apellidos","Telefono","Email","Nombre de usuario", "Contraseña"};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < usersObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1);

                    //Create cells in rows:
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(usersObjectList.get(i).getIdentification());
                    cell = row.createCell(1);
                    cell.setCellValue(usersObjectList.get(i).getName());
                    cell = row.createCell(2);
                    cell.setCellValue(usersObjectList.get(i).getLastName());
                    cell = row.createCell(3);
                    cell.setCellValue(usersObjectList.get(i).getPhone());
                    cell = row.createCell(4);
                    cell.setCellValue(usersObjectList.get(i).getEmail());
                    cell = row.createCell(5);
                    cell.setCellValue(usersObjectList.get(i).getUser());
                    cell = row.createCell(6);
                    cell.setCellValue(usersObjectList.get(i).getPassword());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerolínea/Reporte de usuarios activos - " + DateWithTime.format(DateFormat) + ".xls");
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

            else if(users.equals("Usuarios eliminados")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();

                int width = 28; // Where width is number of caracters
                sheet.setDefaultColumnWidth(width);

                book.setSheetName(0, "Usuarios Inactivos - Aerolínea");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
                
                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Numero identificación","Nombres","Apellidos","Telefono","Email","Nombre de usuario", "Contraseña", "Descripción"};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < usersDeleteObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1);

                    //Create cells in rows:
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(usersDeleteObjectList.get(i).getIdentification());
                    cell = row.createCell(1);
                    cell.setCellValue(usersDeleteObjectList.get(i).getName());
                    cell = row.createCell(2);
                    cell.setCellValue(usersDeleteObjectList.get(i).getLastName());
                    cell = row.createCell(3);
                    cell.setCellValue(usersDeleteObjectList.get(i).getPassword());
                    cell = row.createCell(4);
                    cell.setCellValue(usersDeleteObjectList.get(i).getEmail());
                    cell = row.createCell(5);
                    cell.setCellValue(usersDeleteObjectList.get(i).getUser());
                    cell = row.createCell(6);
                    cell.setCellValue(usersDeleteObjectList.get(i).getPassword());
                    cell = row.createCell(7);
                    cell.setCellValue(usersDeleteObjectList.get(i).getDescription());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerolínea/Reporte de usuarios inactivos - " + DateWithTime.format(DateFormat) + ".xls");
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

            else if(users.equals("Reporte grupal")){

                //Create book:
                HSSFWorkbook book = new HSSFWorkbook();

                //Create sheet(s) in book:
                HSSFSheet sheet = book.createSheet();
                HSSFSheet sheet1 = book.createSheet();

                int width = 28; // Where width is number of caracters
                sheet.setDefaultColumnWidth(width);
                sheet1.setDefaultColumnWidth(width);

                book.setSheetName(0, "1 - Usuarios Activos");
                book.setSheetName(1, "2 - Usuarios Inactivos");

                //Create sheet styles:
                CellStyle styleHeader = book.createCellStyle();
                styleHeader.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());

                //styleHeader.set
                styleHeader.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                HSSFFont font = book.createFont();
                font.setBold(true);

                styleHeader.setFont(font);

                String[] headers = new String[]{"Numero identificación","Nombres","Apellidos","Telefono","Email","Nombre de usuario", "Contraseña"};
                String[] headers1 = new String[]{"Numero identificación","Nombres","Apellidos","Telefono","Email","Nombre de usuario", "Contraseña", "Descripción"};

                //Create rows on the sheets:
                HSSFRow header = sheet.createRow(0);
                HSSFRow header1 = sheet1.createRow(0);

                for (int i = 0; i < headers.length; i++) {
                    HSSFCell cellHeader = header.createCell(i);
                    cellHeader.setCellValue(headers[i]);
                    cellHeader.setCellStyle(styleHeader);
                }

                for (int i = 0; i < usersObjectList.size(); i++) {

                    HSSFRow row = sheet.createRow(i + 1);

                    //Create cells in rows:
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(usersObjectList.get(i).getIdentification());
                    cell = row.createCell(1);
                    cell.setCellValue(usersObjectList.get(i).getName());
                    cell = row.createCell(2);
                    cell.setCellValue(usersObjectList.get(i).getLastName());
                    cell = row.createCell(3);
                    cell.setCellValue(usersObjectList.get(i).getPhone());
                    cell = row.createCell(4);
                    cell.setCellValue(usersObjectList.get(i).getEmail());
                    cell = row.createCell(5);
                    cell.setCellValue(usersObjectList.get(i).getUser());
                    cell = row.createCell(6);
                    cell.setCellValue(usersObjectList.get(i).getPassword());
                }

                for (int j = 0; j < headers1.length; j++) {
                    HSSFCell cellHeader1 = header1.createCell(j);
                    cellHeader1.setCellValue(headers1[j]);
                    cellHeader1.setCellStyle(styleHeader);
                }

                for (int i = 0; i < usersDeleteObjectList.size(); i++) {

                    HSSFRow row = sheet1.createRow(i + 1);

                    //Create cells in rows:
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(usersDeleteObjectList.get(i).getIdentification());
                    cell = row.createCell(1);
                    cell.setCellValue(usersDeleteObjectList.get(i).getName());
                    cell = row.createCell(2);
                    cell.setCellValue(usersDeleteObjectList.get(i).getLastName());
                    cell = row.createCell(3);
                    cell.setCellValue(usersDeleteObjectList.get(i).getPassword());
                    cell = row.createCell(4);
                    cell.setCellValue(usersDeleteObjectList.get(i).getEmail());
                    cell = row.createCell(5);
                    cell.setCellValue(usersDeleteObjectList.get(i).getUser());
                    cell = row.createCell(6);
                    cell.setCellValue(usersDeleteObjectList.get(i).getPassword());
                    cell = row.createCell(7);
                    cell.setCellValue(usersDeleteObjectList.get(i).getDescription());
                }

                try {
                    LocalDateTime DateWithTime = LocalDateTime.now();
                    DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss");
                    FileOutputStream file = new FileOutputStream("Reportes Aerolínea/Reporte total usuarios - " + DateWithTime.format(DateFormat) + ".xls");
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

    private void showUsers(){
         
        usersObjectList = controlAirport.listAirlineStaffA();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsAirlineStaff user : usersObjectList) {
            String data = "IDENTIFICACIÓN: " + user.getIdentification()+ " - " + "NOMBRES: " + user.getName()+ " - " + " APELLIDOS: " + user.getLastName()+ " - " +
                          "TELEFONO: " + user.getPhone()+ " - " + "EMAIL: " + user.getEmail()+ " - " + "USUARIO: " + user.getUser()+ " - " + "CONTRASEÑA: " + 
                         user.getPassword();
            model.add(index, data);
            index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void showUsersDelete(){
         
        usersDeleteObjectList = controlAirport.listAirlineStaffDelete();
         
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsAirlineStaffDelete user : usersDeleteObjectList) {
            String data = "IDENTIFICACIÓN: " + user.getIdentification()+ " - " + "NOMBRES: " + user.getName()+ " - " + " APELLIDOS: " + user.getLastName()+ " - " +
                          "TELEFONO: " + user.getPhone()+ " - " + "EMAIL: " + user.getEmail()+ " - " + "USUARIO: " + user.getUser()+ " - " + "CONTRASEÑA: " + 
                         user.getPassword() + " DESCRIPCIÓN: " + user.getDescription();
            model.add(index, data);
            index++;
        }
    }
    
    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteParcial;
    private javax.swing.JComboBox<String> comboBReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    // End of variables declaration//GEN-END:variables
}
