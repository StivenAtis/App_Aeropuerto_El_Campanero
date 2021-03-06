package View;

import Classes.clsAirportStaff;
import Classes.clsAirportStaffDelete;
import Controller.ctlAdmin;
import Controller.ctlAiportStaff;
import static java.awt.image.ImageObserver.WIDTH;
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
public class pnlDeleteUserAirport extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    private ctlAiportStaff controlAdminAirport = null;
    LinkedList<clsAirportStaff> list;
    ctlAdmin admin = new ctlAdmin();
    
    //--------------------------------------------------------------------------
    
    public pnlDeleteUserAirport() {
        
        initComponents();
        controlAdminAirport = new ctlAiportStaff();
        fillDataTable();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBanner = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaEliminacion = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbBackgraund = new javax.swing.JLabel();
        lbBanner_pnl = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBanner.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        lbBanner.setForeground(new java.awt.Color(255, 255, 255));
        lbBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanner.setText("Eliminar cuenta");
        add(lbBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Datos de usuario");
        lbUsuario.setToolTipText("");
        add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, 40));

        lb3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("Motivo por el cual se elimina la cuenta de usuario");
        lb3.setToolTipText("");
        add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 1160, 40));

        tblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero Identificaci??n", "Nombres", "Apellidos", "Telefono", "Email", "Nombre Usuario", "Contrase??a"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1160, 60));

        txtAreaEliminacion.setColumns(20);
        txtAreaEliminacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaEliminacion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 1160, 240));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar_min.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar_min.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar_max.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 330, 120));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 330, 120));

        lbBackgraund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(lbBackgraund, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        lbBanner_pnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport_Administration_2.jpg"))); // NOI18N
        add(lbBanner_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void fillDataTable() {
        
        list = controlAdminAirport.listAdminA();
        
        controlAdminAirport.listAdminValidation();
            
        String datos[][] = new String[list.size()][7];

        if(list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                datos[i][Constants.EMAIL_ADMIN_ID] = list.get(i).getIdentification();
                datos[i][Constants.EMAIL_ADMIN_NAME] = list.get(i).getName();
                datos[i][Constants.EMAIL_ADMIN_LASTNAME] = list.get(i).getLastName();
                datos[i][Constants.EMAIL_ADMIN_PHONE] = list.get(i).getPhone();
                datos[i][Constants.EMAIL_ADMIN_EMAIL] = list.get(i).getEmail();
                datos[i][Constants.EMAIL_ADMIN_USER] = list.get(i).getUser();
                datos[i][Constants.EMAIL_ADMIN_PASSWORD] = list.get(i).getPassword();
            }        
        }        
        String[] columns = {
            "NUMERO IDENTIFICACI??N", "NOMBRES", "APELLIDOS", "TELEFONO", "EMAIL", "NOMBRE USUARIO", "CONTRASE??A"};
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblUsuario.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblUsuario.setRowHeight(30);
        tblUsuario.setModel(model);
    }
    
    //--------------------------------------------------------------------------
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(tblUsuario.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "??Debe seleccionar su usuario para poderlo eliminar!");
        }
        else{
            
            String text = txtAreaEliminacion.getText();
            
            if("".equals(text)){
                JOptionPane.showMessageDialog(this, "??Debe especificar la raz??n de porque cancela su cuenta!");
            }
            else{
                
                int fila = tblUsuario.getSelectedRow();
                String valor = tblUsuario.getValueAt(fila, 0).toString();
                
                int respuesta = JOptionPane.showConfirmDialog(this, "??Est?? seguro que desea que desea eliminar su cuenta de usuario?");
    
                if (respuesta == JOptionPane.OK_OPTION) {
                    
                    clsAirportStaff read = controlAdminAirport.readStaffA(valor);
                    String id_user = read.getIdentification();
                    String name = read.getName();
                    String lastName= read.getLastName();
                    String phone = read.getPhone();
                    String email = read.getEmail();
                    String user = read.getUser();
                    String pass = read.getPassword();
                    
                    clsAirportStaffDelete userDelete = new clsAirportStaffDelete(0, id_user, name, lastName, phone, email, user, pass, text, "1");
                    controlAdminAirport.createStaffDelete(userDelete);
                    
                    clsAirportStaff DelteUser = new clsAirportStaff(0, valor, "2", "3", "", "", "", "");
                    controlAdminAirport.deleteUser(DelteUser);
                    
                    fillDataTable();
                    
                    txtAreaEliminacion.setText("");
                    Icon m = new ImageIcon(getClass().getResource("/Media/User_Update2.gif"));
                    JOptionPane.showMessageDialog(this, "??????Se ha eliminado \n su cuenta de usuario!!!", "Cuenta eliminada satisfactoriamente", WIDTH, m);
                    
                    admin.deleteAdminTable();
                    controlAdminAirport.listAdminValidation();
                    controlAdminAirport.listAdminValidation().removeAll(list);
                }
                else {
                    
                    JOptionPane.showMessageDialog(this, "Solicitud cancelada");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtAreaEliminacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbBackgraund;
    private javax.swing.JLabel lbBanner;
    private javax.swing.JLabel lbBanner_pnl;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextArea txtAreaEliminacion;
    // End of variables declaration//GEN-END:variables
    //--------------------------------------------------------------------------
}