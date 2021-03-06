package View;

import Classes.clsAdmin;
import Controller.ctlAirlineStaff;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import utils.Constants;

/**
 *
 * @author Booh
 */

public class frmAdministrationAirlineUserOnly extends javax.swing.JFrame {
    
    //--------------------------------------------------------------------------
    
    private ctlAirlineStaff controlAdminAirline = null;
    LinkedList<clsAdmin> AdminObjectList = new LinkedList<>();
    
    //--------------------------------------------------------------------------
    
    @Override
    public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().
    getImage(ClassLoader.getSystemResource("Media/airplane_96px.png"));
    
    return retValue;
    }

    //--------------------------------------------------------------------------
    
    private String panelActive;

    private final Color INITIAL_COLOR_MENU = new Color(28, 31, 52);
    private final Color CHANGE_COLOR_MENU = new Color(40, 45, 77);
    
    //--------------------------------------------------------------------------
    
    public final pnlHomeAirlineAdministration pnlHome;
    private pnlUpdateUserAirline pnlUpdateUserAirline;
    private pnlDeleteUserAirline pnlDeleteUserAirline;
    public JScrollPane spContainer;
    
    //--------------------------------------------------------------------------

    public frmAdministrationAirlineUserOnly() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.init_container();
        this.getContentPane().add(spContainer);        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        pnlHome = new pnlHomeAirlineAdministration();
        this.loadPanel(pnlHome);
        btnHome.setVisible(false);
        setMyPanelActive("FrmHome");
        showAdmin();
    }
    
    //--------------------------------------------------------------------------
    
    private void init_container() {
        
        spContainer = new JScrollPane();
        spContainer.setBounds(278, 89, 1324, 793);
        spContainer.setBackground(new Color(255, 0,255));
        spContainer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        spContainer.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        controlAdminAirline = new ctlAirlineStaff();
    }
    
    //--------------------------------------------------------------------------
    
    private void loadPanel(JPanel panel) {
        spContainer.setViewportView(panel);
        spContainer.validate();
    }
    
    //--------------------------------------------------------------------------
    
    private void changeColorMenu(JPanel panel) {
        panel.setBackground(CHANGE_COLOR_MENU);
    }
    
    //--------------------------------------------------------------------------
    
    private void resetColorMenu(JPanel panel) {
        panel.setBackground(INITIAL_COLOR_MENU);
    }
    
    //--------------------------------------------------------------------------
    
    private void closeApp() {
        int dialogResult = JOptionPane.showConfirmDialog (
                null, 
                "??Estas seguro de salir?",
                "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        if(dialogResult == JOptionPane.YES_OPTION){
            
            if(AdminObjectList.isEmpty() || controlAdminAirline.listAdminValidation().isEmpty()){
                
                frmLogin login = new frmLogin();
                login.setVisible(true);
                this.setVisible(false);
            }
            else{
                frmLoginAdmistrationAirline Airline = new  frmLoginAdmistrationAirline();
                Airline.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    
    //--------------------------------------------------------------------------
    
    private String getMyPanelActive() {
        return panelActive;
    }

    //--------------------------------------------------------------------------
    
    private void setMyPanelActive(String panelActive) {
        this.panelActive = panelActive;
    }
    
    //--------------------------------------------------------------------------
    
    private void changeIconSubtitleBar(String subtitle, String urlImage) {
        lblSubtitle.setText(subtitle);
        lblIcon.setIcon(new ImageIcon(getClass().getResource("/views/assets/" + urlImage)));
    }

    //--------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFirstTopBar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlRechazerVuelo = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        pnlSideBar = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        pnlLoginMenu = new javax.swing.JPanel();
        btnActualizarUsuario = new javax.swing.JButton();
        lblIcon4 = new javax.swing.JLabel();
        pnleXITMenu = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        lblIcon1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        pnEliminar = new javax.swing.JPanel();
        btnEliminarUsuario = new javax.swing.JButton();
        lblIcon11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administraci??n usuario");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFirstTopBar.setBackground(new java.awt.Color(28, 31, 52));
        pnlFirstTopBar.setMaximumSize(new java.awt.Dimension(1200, 720));
        pnlFirstTopBar.setMinimumSize(new java.awt.Dimension(1200, 720));
        pnlFirstTopBar.setPreferredSize(new java.awt.Dimension(1200, 720));
        pnlFirstTopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("El Campanero v1.2");
        pnlFirstTopBar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/home_30px.png"))); // NOI18N
        pnlFirstTopBar.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 50));

        lblSubtitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(204, 204, 204));
        lblSubtitle.setText("HOME");
        pnlFirstTopBar.add(lblSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 180, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Aeropuerto El Campanero");
        pnlFirstTopBar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        pnlRechazerVuelo.setBackground(new java.awt.Color(28, 31, 52));
        pnlRechazerVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(204, 204, 204));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/home_30px.png"))); // NOI18N
        btnHome.setText("HOME");
        btnHome.setContentAreaFilled(false);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pnlRechazerVuelo.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        pnlFirstTopBar.add(pnlRechazerVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 110, 50));

        getContentPane().add(pnlFirstTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 100));

        pnlSideBar.setBackground(new java.awt.Color(28, 31, 52));

        jLabel23.setForeground(new java.awt.Color(204, 204, 204));

        pnlLoginMenu.setBackground(new java.awt.Color(28, 31, 52));
        pnlLoginMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarUsuario.setForeground(new java.awt.Color(204, 204, 204));
        btnActualizarUsuario.setText("Actualizar datos usuario");
        btnActualizarUsuario.setBorderPainted(false);
        btnActualizarUsuario.setContentAreaFilled(false);
        btnActualizarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizarUsuario.setFocusPainted(false);
        btnActualizarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarUsuarioMouseExited(evt);
            }
        });
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });
        pnlLoginMenu.add(btnActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 186, 50));

        lblIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/assets/edit_30px.png"))); // NOI18N
        pnlLoginMenu.add(lblIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        pnleXITMenu.setBackground(new java.awt.Color(28, 31, 52));
        pnleXITMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 204, 204));
        btnExit.setText("Salir");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnleXITMenu.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 40));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/exit_30px.png"))); // NOI18N
        pnleXITMenu.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("NIT: 800333444-8");

        pnEliminar.setBackground(new java.awt.Color(28, 31, 52));
        pnEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminarUsuario.setText("Eliminar usuario");
        btnEliminarUsuario.setBorderPainted(false);
        btnEliminarUsuario.setContentAreaFilled(false);
        btnEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarUsuario.setFocusPainted(false);
        btnEliminarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarUsuarioMouseExited(evt);
            }
        });
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        pnEliminar.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/assets/delete_bin_30px.png"))); // NOI18N
        pnEliminar.add(lblIcon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        javax.swing.GroupLayout pnlSideBarLayout = new javax.swing.GroupLayout(pnlSideBar);
        pnlSideBar.setLayout(pnlSideBarLayout);
        pnlSideBarLayout.setHorizontalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideBarLayout.createSequentialGroup()
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLoginMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlSideBarLayout.createSequentialGroup()
                                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                                .addComponent(pnleXITMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        pnlSideBarLayout.setVerticalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(pnlLoginMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnleXITMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(pnlSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        changeColorMenu(pnlRechazerVuelo);
    }//GEN-LAST:event_btnHomeMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        resetColorMenu(pnlRechazerVuelo);
    }//GEN-LAST:event_btnHomeMouseExited

    //--------------------------------------------------------------------------
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.loadPanel(pnlHome);
        changeIconSubtitleBar(Constants.TITLE_HOME, Constants.ICON_HOME);
        btnHome.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnActualizarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioMouseEntered
        changeColorMenu(pnlLoginMenu);
    }//GEN-LAST:event_btnActualizarUsuarioMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnActualizarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioMouseExited
        resetColorMenu(pnlLoginMenu);
    }//GEN-LAST:event_btnActualizarUsuarioMouseExited

    //--------------------------------------------------------------------------
    
    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed

        pnlUpdateUserAirline = new pnlUpdateUserAirline();
        this.loadPanel(pnlUpdateUserAirline);
        setMyPanelActive(Constants.PANEL_UPDATEUSER_AIRLINE);
        changeIconSubtitleBar(Constants.TITLE_UPDATE_USER, Constants.ICON_EDIT_USER);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        changeColorMenu(pnleXITMenu);
    }//GEN-LAST:event_btnExitMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        resetColorMenu(pnleXITMenu);
    }//GEN-LAST:event_btnExitMouseExited

    //--------------------------------------------------------------------------
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.closeApp();
    }//GEN-LAST:event_btnExitActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnEliminarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioMouseEntered
        changeColorMenu(pnEliminar);
    }//GEN-LAST:event_btnEliminarUsuarioMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnEliminarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioMouseExited
        resetColorMenu(pnEliminar);
    }//GEN-LAST:event_btnEliminarUsuarioMouseExited

    //--------------------------------------------------------------------------
    
    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

                pnlDeleteUserAirline = new pnlDeleteUserAirline();
                this.loadPanel(pnlDeleteUserAirline);
                setMyPanelActive(Constants.PANEL_DELETEUSER_AIRLINE);
                changeIconSubtitleBar(Constants.TITLE_DELETE_USER, Constants.ICON_DELETE_USER);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    //--------------------------------------------------------------------------
    
    private void showAdmin(){
        AdminObjectList = controlAdminAirline.listAdminValidation();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsAdmin admin : AdminObjectList) {
            String data = "CODIGO VUELO: " + admin.getEmail_admin();
            model.add(index, data);
            index++;
        }
    }
    //--------------------------------------------------------------------------
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdministrationAirlineUserOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdministrationAirlineUserOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdministrationAirlineUserOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdministrationAirlineUserOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdministrationAirlineUserOnly().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnExit;
    public javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon11;
    private javax.swing.JLabel lblIcon4;
    public javax.swing.JLabel lblSubtitle;
    private javax.swing.JPanel pnEliminar;
    private javax.swing.JPanel pnlFirstTopBar;
    private javax.swing.JPanel pnlLoginMenu;
    private javax.swing.JPanel pnlRechazerVuelo;
    private javax.swing.JPanel pnlSideBar;
    private javax.swing.JPanel pnleXITMenu;
    // End of variables declaration//GEN-END:variables
    //--------------------------------------------------------------------------
}
