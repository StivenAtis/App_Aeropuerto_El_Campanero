package View;

import Classes.clsAirportStaff;
import Classes.clsAirportStaffDelete;
import Controller.ctlAiportStaff;
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
public class pnlDeleteUsersAirport extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    private ctlAiportStaff controlAdminAirport = null;
    LinkedList<clsAirportStaff> list;
    
    //--------------------------------------------------------------------------
    
    public pnlDeleteUsersAirport() {
        initComponents();
        initComponents();
        controlAdminAirport = new ctlAiportStaff();
        fillDataTable();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb3 = new javax.swing.JLabel();
        lbBanner = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaEliminacion = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("Motivo por el cual se elimina la cuenta de usuario");
        lb3.setToolTipText("");
        add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 1160, 40));

        lbBanner.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        lbBanner.setForeground(new java.awt.Color(255, 255, 255));
        lbBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanner.setText("Eliminar usuarios");
        add(lbBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Datos de usuarios");
        lbUsuario.setToolTipText("");
        add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, 40));

        tblUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero Identificación", "Nombres", "Apellidos", "Telefono", "Email", "Nombre Usuario", "Contraseña"
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
        jScrollPane1.setViewportView(tblUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 1160, 230));

        txtAreaEliminacion.setColumns(20);
        txtAreaEliminacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaEliminacion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 1160, 180));

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

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport_Administration_2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void fillDataTable() {
        
        list = controlAdminAirport.listAirportStaffA();
        
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
            "NUMERO IDENTIFICACIÓN", "NOMBRES", "APELLIDOS", "TELEFONO", "EMAIL", "NOMBRE USUARIO", "CONTRASEÑA"};
        DefaultTableModel model = new DefaultTableModel(datos, columns);
        int[] columnSize = {30, 50, 50, 50, 50, 50, 50};
        for(int x=0; x<columnSize.length;x++)
            tblUsuarios.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblUsuarios.setRowHeight(30);
        tblUsuarios.setModel(model);
    }
    
    //--------------------------------------------------------------------------
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if(tblUsuarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "¡Debe seleccionar un usuario para poderlo eliminar!");
        }
        else{

            String text = txtAreaEliminacion.getText();

            if("".equals(text)){
                JOptionPane.showMessageDialog(this, "¡Debe especificar la razón de porque cancela una cuenta!");
            }
            else{

                int row = tblUsuarios.getSelectedRow();
                String valor = tblUsuarios.getValueAt(row, 4).toString();

                int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea que desea eliminar su cuenta de usuario?");

                if (respuesta == JOptionPane.OK_OPTION) {

                    clsAirportStaff read = controlAdminAirport.readStaffEmail(valor);
                    String id_user = read.getIdentification();
                    String name = read.getName();
                    String lastName= read.getLastName();
                    String phone = read.getPhone();
                    String email = read.getEmail();
                    String user = read.getUser();
                    String pass = read.getPassword();

                    clsAirportStaffDelete userDelete = new clsAirportStaffDelete(0, id_user, name, lastName, phone, email, user, pass, text, "1");
                    controlAdminAirport.createStaffDelete(userDelete);

                    clsAirportStaff DelteUser = new clsAirportStaff(0, "", "", "", "", valor, "", "");
                    controlAdminAirport.deleteUserEmail(DelteUser);

                    fillDataTable();

                    txtAreaEliminacion.setText("");
                    Icon m = new ImageIcon(getClass().getResource("/Media/User_Update2.gif"));
                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha eliminado \n una cuenta de usuario!!!", "Cuenta eliminada satisfactoriamente", WIDTH, m);

                    controlAdminAirport.listAdminValidation();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBanner;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextArea txtAreaEliminacion;
    // End of variables declaration//GEN-END:variables
}
