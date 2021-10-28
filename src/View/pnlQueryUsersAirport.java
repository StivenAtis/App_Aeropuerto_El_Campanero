package View;

import Classes.clsAirportStaff;
import Classes.clsAirportStaffDelete;
import Controller.ctlAiportStaff;
import javax.swing.JOptionPane;

/**
 *
 * @author Booh
 */
public class pnlQueryUsersAirport extends javax.swing.JPanel {
    
    //--------------------------------------------------------------------------
    
    ctlAiportStaff controlAirportStaff = new ctlAiportStaff();

    //--------------------------------------------------------------------------
    
    public pnlQueryUsersAirport() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbBanner = new javax.swing.JLabel();
        tfEmailUser = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAInfoUser = new javax.swing.JTextArea();
        lb3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAInfoUserTrs = new javax.swing.JTextArea();
        lbBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_min.png"))); // NOI18N
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_min.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Consultar_max.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 330, 120));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_min.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Limpiar_max.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, 330, 120));

        lbBanner.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        lbBanner.setForeground(new java.awt.Color(255, 255, 255));
        lbBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanner.setText("Actualizar usuarios");
        add(lbBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        tfEmailUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfEmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 270, 40));

        lb1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb1.setText("Email usuario solicitado");
        lb1.setToolTipText("");
        add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, 40));

        lb2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb2.setText("Datos de usuario");
        lb2.setToolTipText("");
        add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 200, 40));

        txtAInfoUser.setColumns(20);
        txtAInfoUser.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtAInfoUser.setRows(5);
        txtAInfoUser.setFocusable(false);
        jScrollPane3.setViewportView(txtAInfoUser);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 1150, 280));

        lb3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb3.setText("Información sobre usuario");
        lb3.setToolTipText("");
        add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 270, 40));

        txtAInfoUserTrs.setColumns(20);
        txtAInfoUserTrs.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtAInfoUserTrs.setRows(5);
        txtAInfoUserTrs.setFocusable(false);
        jScrollPane2.setViewportView(txtAInfoUserTrs);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 1150, 170));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport_Administration_2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String emailEncontrado = tfEmailUser.getText();

        if(emailEncontrado.equals("")){
            JOptionPane.showMessageDialog(this, "Debe diligenciar el codigo para poder realizar la consulta.");
        }
        else{

            clsAirportStaff UserSearch = controlAirportStaff.readStaffEmail(emailEncontrado);
            clsAirportStaffDelete UserDelete = controlAirportStaff.readStaffEmailDelete(emailEncontrado);

            if (UserSearch == null && UserDelete == null) {
                JOptionPane.showMessageDialog(this, "¡No existe datos para el usuario con email: " + emailEncontrado + "!");
                cleanRegisterQuestionnaire();
            } else {

                if(UserSearch != null){

                    txtAInfoUser.setText("DATOS DE USUARIO:" + "\n" +
                        "\n" +
                        "numero de identificación: " + UserSearch.getIdentification()+ "\n" +
                        "Nombres: " + UserSearch.getName()+ "\n" +
                        "Apellidos: " + UserSearch.getLastName()+ "\n" +
                        "Telefono: " + UserSearch.getPhone()+ "\n" +
                        "Email: " + UserSearch.getEmail()+ " toneladas" + "\n" +
                        "Nombre de usuario: " + UserSearch.getUser()+ "\n" +
                        "Contraseña: " + UserSearch.getPassword());

                    txtAInfoUserTrs.setText("USUARIO ACTIVO" + "\n" +"El usuario se encuentra registrado en el sistema.");

                }
                else if (UserSearch == null && UserDelete != null){

                    txtAInfoUser.setText("Datos de agenda de vuelo:" + "\n" +
                        "\n" +
                        "numero de identificación: " + UserDelete.getIdentification()+ "\n" +
                        "Nombres: " + UserDelete.getName()+ "\n" +
                        "Apellidos: " + UserDelete.getLastName()+ "\n" +
                        "Telefono: " + UserDelete.getPhone()+ "\n" +
                        "Email: " + UserDelete.getEmail()+ "\n" +
                        "Nombre de usuario: " + UserDelete.getUser()+ "\n" +
                        "Contraseña: : " + UserDelete.getPassword());

                    txtAInfoUserTrs.setText("USUARIO INACTIVO" + "\n" + "Motivo:"  + "\n" + UserDelete.getDescription());
                }
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        tfEmailUser.setText("");
        txtAInfoUser.setText("");
        txtAInfoUserTrs.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //--------------------------------------------------------------------------
    
    private void cleanRegisterQuestionnaire(){
        
        tfEmailUser.setText("");
        txtAInfoUser.setText("");
        txtAInfoUserTrs.setText("");
    }
    
    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBanner;
    private javax.swing.JTextField tfEmailUser;
    private javax.swing.JTextArea txtAInfoUser;
    private javax.swing.JTextArea txtAInfoUserTrs;
    // End of variables declaration//GEN-END:variables
}
