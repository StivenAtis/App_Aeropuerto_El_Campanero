package View;

import Controller.ctlAdmin;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
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
public class frmAirline extends javax.swing.JFrame {
    
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
    
    ctlAdmin admin = new ctlAdmin();
    
    public final pnlHomeAirline pnlHome;
    public JScrollPane spContainer;
    private pnlReprogramFlightAirline pnlReprogramFlightAirline;
    private pnlFlightsRequiredAirline pnlFlightsRequiredAirline;
    private pnlScheduledFlightsAirline pnlScheduledFlightsAirline;
    private pnlFlightQuery pnlFlightQuery;
    private pnlDeclinedFlights pnlDeclinedFlights;
    private pnlFlightOrderingAirline pnlFlightOrderingAirline;
    private pnlAbortFlightAirlinee pnlAbortFlightAirline;
    private pnlReportsAirline pnlReportsAirline;

    //--------------------------------------------------------------------------
    
    public frmAirline() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.init_container();
        this.getContentPane().add(spContainer);        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        pnlHome = new pnlHomeAirline();
        this.loadPanel(pnlHome);
        btnHome.setVisible(false);
        setMyPanelActive("FrmHome");
    }

    //--------------------------------------------------------------------------
    
    private void init_container() {
        spContainer = new JScrollPane();
        spContainer.setBounds(278, 89, 1324, 793);
        spContainer.setBackground(new Color(255, 0,255));
        spContainer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        spContainer.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }
    
    private void loadPanel(JPanel panel) {
        spContainer.setViewportView(panel);
        spContainer.validate();
    }
    
    private void changeColorMenu(JPanel panel) {
        panel.setBackground(CHANGE_COLOR_MENU);
    }
    
    private void resetColorMenu(JPanel panel) {
        panel.setBackground(INITIAL_COLOR_MENU);
    }
    
    private void closeApp() {
        int dialogResult = JOptionPane.showConfirmDialog (
                null, 
                "??Estas seguro de cerrar sesi??n?",
                "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        if(dialogResult == JOptionPane.YES_OPTION){
            
            admin.deleteAdminTable();
            
            frmLogin login = new  frmLogin();
            login.setVisible(true);
            this.setVisible(false);
        }
    }
    
    private String getMyPanelActive() {
        return panelActive;
    }

    private void setMyPanelActive(String panelActive) {
        this.panelActive = panelActive;
    }
    
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
        btnVuelosAgendados = new javax.swing.JButton();
        lblIcon4 = new javax.swing.JLabel();
        pnlRegistroMenu = new javax.swing.JPanel();
        btnVuelosSolicitados = new javax.swing.JButton();
        lblIcon3 = new javax.swing.JLabel();
        pnlAboutMenu = new javax.swing.JPanel();
        SolicitarVuelo = new javax.swing.JButton();
        lblIcon5 = new javax.swing.JLabel();
        pnlReprogramarVuelo = new javax.swing.JPanel();
        ReprogramarVUelo = new javax.swing.JButton();
        lblIcon6 = new javax.swing.JLabel();
        pnlCancelarVuelo = new javax.swing.JPanel();
        btnCancelarVuelo = new javax.swing.JButton();
        lblIcon7 = new javax.swing.JLabel();
        pnlReportes = new javax.swing.JPanel();
        btnReports = new javax.swing.JButton();
        lblIcon9 = new javax.swing.JLabel();
        pnlAdministracion = new javax.swing.JPanel();
        acercaDE5 = new javax.swing.JButton();
        lblIcon10 = new javax.swing.JLabel();
        pnleXITMenu = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        lblIcon1 = new javax.swing.JLabel();
        pnlSettingsMenu = new javax.swing.JPanel();
        pnlSettingsMenu1 = new javax.swing.JPanel();
        btnConsultaVuelo = new javax.swing.JButton();
        lblIcon8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        pnlRechazados = new javax.swing.JPanel();
        btnVuelosRechazados = new javax.swing.JButton();
        lblIcon11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aerolinea");
        setIconImage(getIconImage());
        setResizable(false);
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

        btnHome.setBackground(new java.awt.Color(204, 204, 204));
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

        btnVuelosAgendados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVuelosAgendados.setForeground(new java.awt.Color(204, 204, 204));
        btnVuelosAgendados.setText("Vuelos agendados");
        btnVuelosAgendados.setBorderPainted(false);
        btnVuelosAgendados.setContentAreaFilled(false);
        btnVuelosAgendados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVuelosAgendados.setFocusPainted(false);
        btnVuelosAgendados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVuelosAgendados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVuelosAgendadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVuelosAgendadosMouseExited(evt);
            }
        });
        btnVuelosAgendados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosAgendadosActionPerformed(evt);
            }
        });
        pnlLoginMenu.add(btnVuelosAgendados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 186, 50));

        lblIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/file_30px.png"))); // NOI18N
        pnlLoginMenu.add(lblIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        pnlRegistroMenu.setBackground(new java.awt.Color(28, 31, 52));
        pnlRegistroMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVuelosSolicitados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVuelosSolicitados.setForeground(new java.awt.Color(204, 204, 204));
        btnVuelosSolicitados.setText("Vuelos solicitados");
        btnVuelosSolicitados.setBorderPainted(false);
        btnVuelosSolicitados.setContentAreaFilled(false);
        btnVuelosSolicitados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVuelosSolicitados.setFocusPainted(false);
        btnVuelosSolicitados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVuelosSolicitados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVuelosSolicitadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVuelosSolicitadosMouseExited(evt);
            }
        });
        btnVuelosSolicitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosSolicitadosActionPerformed(evt);
            }
        });
        pnlRegistroMenu.add(btnVuelosSolicitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 50));

        lblIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/request_30px.png"))); // NOI18N
        pnlRegistroMenu.add(lblIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        pnlAboutMenu.setBackground(new java.awt.Color(28, 31, 52));
        pnlAboutMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SolicitarVuelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SolicitarVuelo.setForeground(new java.awt.Color(204, 204, 204));
        SolicitarVuelo.setText("Solicitar vuelo");
        SolicitarVuelo.setBorderPainted(false);
        SolicitarVuelo.setContentAreaFilled(false);
        SolicitarVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SolicitarVuelo.setFocusPainted(false);
        SolicitarVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SolicitarVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SolicitarVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SolicitarVueloMouseExited(evt);
            }
        });
        SolicitarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarVueloActionPerformed(evt);
            }
        });
        pnlAboutMenu.add(SolicitarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 50));

        lblIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/register_request_30px.png"))); // NOI18N
        pnlAboutMenu.add(lblIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 40));

        pnlReprogramarVuelo.setBackground(new java.awt.Color(28, 31, 52));
        pnlReprogramarVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReprogramarVUelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReprogramarVUelo.setForeground(new java.awt.Color(204, 204, 204));
        ReprogramarVUelo.setText("Reprogramar vuelo");
        ReprogramarVUelo.setBorderPainted(false);
        ReprogramarVUelo.setContentAreaFilled(false);
        ReprogramarVUelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ReprogramarVUelo.setFocusPainted(false);
        ReprogramarVUelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ReprogramarVUelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReprogramarVUeloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReprogramarVUeloMouseExited(evt);
            }
        });
        ReprogramarVUelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReprogramarVUeloActionPerformed(evt);
            }
        });
        pnlReprogramarVuelo.add(ReprogramarVUelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogram_30px.png"))); // NOI18N
        pnlReprogramarVuelo.add(lblIcon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        pnlCancelarVuelo.setBackground(new java.awt.Color(28, 31, 52));
        pnlCancelarVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelarVuelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarVuelo.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelarVuelo.setText("Cancelar vuelo");
        btnCancelarVuelo.setBorderPainted(false);
        btnCancelarVuelo.setContentAreaFilled(false);
        btnCancelarVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarVuelo.setFocusPainted(false);
        btnCancelarVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelarVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarVueloMouseExited(evt);
            }
        });
        btnCancelarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVueloActionPerformed(evt);
            }
        });
        pnlCancelarVuelo.add(btnCancelarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_fly_30px.png"))); // NOI18N
        pnlCancelarVuelo.add(lblIcon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        pnlReportes.setBackground(new java.awt.Color(28, 31, 52));
        pnlReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReports.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReports.setForeground(new java.awt.Color(204, 204, 204));
        btnReports.setText("Reportes");
        btnReports.setBorderPainted(false);
        btnReports.setContentAreaFilled(false);
        btnReports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReports.setFocusPainted(false);
        btnReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportsMouseExited(evt);
            }
        });
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });
        pnlReportes.add(btnReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/assets/xls_35px.png"))); // NOI18N
        pnlReportes.add(lblIcon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        pnlAdministracion.setBackground(new java.awt.Color(28, 31, 52));
        pnlAdministracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acercaDE5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acercaDE5.setForeground(new java.awt.Color(204, 204, 204));
        acercaDE5.setText("Administraci??n");
        acercaDE5.setBorderPainted(false);
        acercaDE5.setContentAreaFilled(false);
        acercaDE5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        acercaDE5.setFocusPainted(false);
        acercaDE5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        acercaDE5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acercaDE5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acercaDE5MouseExited(evt);
            }
        });
        acercaDE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDE5ActionPerformed(evt);
            }
        });
        pnlAdministracion.add(acercaDE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/administration_30px.png"))); // NOI18N
        pnlAdministracion.add(lblIcon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        pnleXITMenu.setBackground(new java.awt.Color(28, 31, 52));
        pnleXITMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 204, 204));
        btnExit.setText("Cerrar sesi??n");
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

        pnlSettingsMenu.setBackground(new java.awt.Color(28, 31, 52));
        pnlSettingsMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSettingsMenu1.setBackground(new java.awt.Color(28, 31, 52));
        pnlSettingsMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlSettingsMenu.add(pnlSettingsMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnConsultaVuelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultaVuelo.setForeground(new java.awt.Color(204, 204, 204));
        btnConsultaVuelo.setText("Consulta de vuelos");
        btnConsultaVuelo.setBorderPainted(false);
        btnConsultaVuelo.setContentAreaFilled(false);
        btnConsultaVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultaVuelo.setFocusPainted(false);
        btnConsultaVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultaVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultaVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultaVueloMouseExited(evt);
            }
        });
        btnConsultaVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaVueloActionPerformed(evt);
            }
        });
        pnlSettingsMenu.add(btnConsultaVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 160, 40));

        lblIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/search_30px.png"))); // NOI18N
        pnlSettingsMenu.add(lblIcon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("NIT: 800333444-8");

        pnlRechazados.setBackground(new java.awt.Color(28, 31, 52));
        pnlRechazados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVuelosRechazados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVuelosRechazados.setForeground(new java.awt.Color(204, 204, 204));
        btnVuelosRechazados.setText("Vuelos rechazdos");
        btnVuelosRechazados.setBorderPainted(false);
        btnVuelosRechazados.setContentAreaFilled(false);
        btnVuelosRechazados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVuelosRechazados.setFocusPainted(false);
        btnVuelosRechazados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVuelosRechazados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVuelosRechazadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVuelosRechazadosMouseExited(evt);
            }
        });
        btnVuelosRechazados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosRechazadosActionPerformed(evt);
            }
        });
        pnlRechazados.add(btnVuelosRechazados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_fly_30px.png"))); // NOI18N
        pnlRechazados.add(lblIcon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        javax.swing.GroupLayout pnlSideBarLayout = new javax.swing.GroupLayout(pnlSideBar);
        pnlSideBar.setLayout(pnlSideBarLayout);
        pnlSideBarLayout.setHorizontalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(39, 39, 39))
                    .addGroup(pnlSideBarLayout.createSequentialGroup()
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLoginMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlRegistroMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlReprogramarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSideBarLayout.createSequentialGroup()
                                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnleXITMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlSideBarLayout.createSequentialGroup()
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCancelarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlAboutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRechazados, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlSettingsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(11, 11, 11)
                .addComponent(pnlRegistroMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLoginMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnlSettingsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRechazados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAboutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlReprogramarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCancelarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnlAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnleXITMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(pnlSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.loadPanel(pnlHome);
        changeIconSubtitleBar(Constants.TITLE_HOME, Constants.ICON_HOME);
        btnHome.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnVuelosAgendadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosAgendadosMouseEntered
        changeColorMenu(pnlLoginMenu);
    }//GEN-LAST:event_btnVuelosAgendadosMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnVuelosAgendadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosAgendadosMouseExited
        resetColorMenu(pnlLoginMenu);
    }//GEN-LAST:event_btnVuelosAgendadosMouseExited

    //--------------------------------------------------------------------------
    
    private void btnVuelosAgendadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosAgendadosActionPerformed

        pnlScheduledFlightsAirline = new pnlScheduledFlightsAirline();
        this.loadPanel(pnlScheduledFlightsAirline);
        setMyPanelActive(Constants.PANEL_SCHUDELEDFLIGHTSAIRLINE);
        changeIconSubtitleBar(Constants.TITLE_SCHUDELEDFLIGHTS, Constants.ICON_SCHUDELEDFLIGHTS);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnVuelosAgendadosActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnVuelosSolicitadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosSolicitadosMouseEntered
        changeColorMenu(pnlRegistroMenu);
    }//GEN-LAST:event_btnVuelosSolicitadosMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnVuelosSolicitadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosSolicitadosMouseExited
        resetColorMenu(pnlRegistroMenu);
    }//GEN-LAST:event_btnVuelosSolicitadosMouseExited

    //--------------------------------------------------------------------------
    
    private void btnVuelosSolicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosSolicitadosActionPerformed
        pnlFlightsRequiredAirline = new pnlFlightsRequiredAirline();
        this.loadPanel(pnlFlightsRequiredAirline);
        setMyPanelActive(Constants.PANEL_FLIGHTREQUESTED);
        changeIconSubtitleBar(Constants.TITLE_FLIGHTREQUESTED, Constants.ICON_FLIGHTREQUESTED);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnVuelosSolicitadosActionPerformed

    //--------------------------------------------------------------------------
    
    private void SolicitarVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitarVueloMouseEntered
        changeColorMenu(pnlAboutMenu);
    }//GEN-LAST:event_SolicitarVueloMouseEntered

    //--------------------------------------------------------------------------
    
    private void SolicitarVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitarVueloMouseExited
        resetColorMenu(pnlAboutMenu);
    }//GEN-LAST:event_SolicitarVueloMouseExited

    //--------------------------------------------------------------------------
    
    private void SolicitarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarVueloActionPerformed
        pnlFlightOrderingAirline = new pnlFlightOrderingAirline();
        this.loadPanel(pnlFlightOrderingAirline);
        setMyPanelActive(Constants.PANEL_ORDERINGFLIGHTS);
        changeIconSubtitleBar(Constants.TITLE_ORDERINGFLIGHTS, Constants.ICON_ORDERINGFLIGHTS);
        btnHome.setVisible(true);
    }//GEN-LAST:event_SolicitarVueloActionPerformed

    //--------------------------------------------------------------------------
    
    private void ReprogramarVUeloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReprogramarVUeloMouseEntered
        changeColorMenu(pnlReprogramarVuelo);
    }//GEN-LAST:event_ReprogramarVUeloMouseEntered

    //--------------------------------------------------------------------------
    
    private void ReprogramarVUeloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReprogramarVUeloMouseExited
        resetColorMenu(pnlReprogramarVuelo);
    }//GEN-LAST:event_ReprogramarVUeloMouseExited

    //--------------------------------------------------------------------------
    
    private void ReprogramarVUeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReprogramarVUeloActionPerformed

        pnlReprogramFlightAirline = new pnlReprogramFlightAirline();
        this.loadPanel(pnlReprogramFlightAirline);
        setMyPanelActive(Constants.PANEL_REPROGRAMFLIGHTS);
        changeIconSubtitleBar(Constants.TITLE_REPROGRAMFLIGHTS, Constants.ICON_REPROGRAMFLIGHTS);
        btnHome.setVisible(true);
    }//GEN-LAST:event_ReprogramarVUeloActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnCancelarVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVueloMouseEntered
        changeColorMenu(pnlCancelarVuelo);
    }//GEN-LAST:event_btnCancelarVueloMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnCancelarVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVueloMouseExited
        resetColorMenu(pnlCancelarVuelo);
    }//GEN-LAST:event_btnCancelarVueloMouseExited

    //--------------------------------------------------------------------------
    
    private void btnCancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVueloActionPerformed

        pnlAbortFlightAirline = new pnlAbortFlightAirlinee();
        this.loadPanel(pnlAbortFlightAirline);
        setMyPanelActive(Constants.PANEL_ABORTFLIGHTS);
        changeIconSubtitleBar(Constants.TITLE_ABORTFLIGHTS, Constants.ICON_CANCELFLIGHT);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnCancelarVueloActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportsMouseEntered
        changeColorMenu(pnlReportes);
    }//GEN-LAST:event_btnReportsMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportsMouseExited
        resetColorMenu(pnlReportes);
    }//GEN-LAST:event_btnReportsMouseExited

    //--------------------------------------------------------------------------
    
    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed

        pnlReportsAirline = new pnlReportsAirline();
        this.loadPanel(pnlReportsAirline);
        setMyPanelActive(Constants.PANEL_REPORTSAIRLINE);
        changeIconSubtitleBar(Constants.TITLE_REPORTS, Constants.ICON_REPORTS_USER);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnReportsActionPerformed

    //--------------------------------------------------------------------------
    
    private void acercaDE5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaDE5MouseEntered
        changeColorMenu(pnlAdministracion);
    }//GEN-LAST:event_acercaDE5MouseEntered

    //--------------------------------------------------------------------------
    
    private void acercaDE5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaDE5MouseExited
        resetColorMenu(pnlAdministracion);
    }//GEN-LAST:event_acercaDE5MouseExited

    //--------------------------------------------------------------------------
    
    private void acercaDE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDE5ActionPerformed
        frmLoginAdmistrationAirline AdmAirline = new frmLoginAdmistrationAirline();
        AdmAirline.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_acercaDE5ActionPerformed

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
    
    private void btnConsultaVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaVueloMouseEntered
        changeColorMenu(pnlSettingsMenu);
    }//GEN-LAST:event_btnConsultaVueloMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnConsultaVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaVueloMouseExited
        resetColorMenu(pnlSettingsMenu);
    }//GEN-LAST:event_btnConsultaVueloMouseExited

    //--------------------------------------------------------------------------
    
    private void btnConsultaVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaVueloActionPerformed

        pnlFlightQuery = new pnlFlightQuery();
        this.loadPanel(pnlFlightQuery);
        setMyPanelActive(Constants.PANEL_FLIGHTQUERY);
        changeIconSubtitleBar(Constants.TITLE_FLIGHTQUERY, Constants.ICON_FLIGHTQUERY);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnConsultaVueloActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        changeColorMenu(pnlRechazerVuelo);
    }//GEN-LAST:event_btnHomeMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        resetColorMenu(pnlRechazerVuelo);
    }//GEN-LAST:event_btnHomeMouseExited

    //--------------------------------------------------------------------------
    
    private void btnVuelosRechazadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosRechazadosMouseEntered
        changeColorMenu(pnlRechazados);
    }//GEN-LAST:event_btnVuelosRechazadosMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnVuelosRechazadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosRechazadosMouseExited
        resetColorMenu(pnlRechazados);
    }//GEN-LAST:event_btnVuelosRechazadosMouseExited

    //--------------------------------------------------------------------------
    
    private void btnVuelosRechazadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosRechazadosActionPerformed
        
        pnlDeclinedFlights = new pnlDeclinedFlights();
        this.loadPanel(pnlDeclinedFlights);
        setMyPanelActive(Constants.PANEL_DECLINEFLIGHTS);
        changeIconSubtitleBar(Constants.TITLE_DECLINEFLIGHTS, Constants.ICON_DECLINEFLIGHTS);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnVuelosRechazadosActionPerformed

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
            java.util.logging.Logger.getLogger(frmAirline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAirline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAirline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAirline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAirline().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReprogramarVUelo;
    private javax.swing.JButton SolicitarVuelo;
    private javax.swing.JButton acercaDE5;
    private javax.swing.JButton btnCancelarVuelo;
    private javax.swing.JButton btnConsultaVuelo;
    private javax.swing.JButton btnExit;
    public javax.swing.JButton btnHome;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnVuelosAgendados;
    private javax.swing.JButton btnVuelosRechazados;
    private javax.swing.JButton btnVuelosSolicitados;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon10;
    private javax.swing.JLabel lblIcon11;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblIcon5;
    private javax.swing.JLabel lblIcon6;
    private javax.swing.JLabel lblIcon7;
    private javax.swing.JLabel lblIcon8;
    private javax.swing.JLabel lblIcon9;
    public javax.swing.JLabel lblSubtitle;
    private javax.swing.JPanel pnlAboutMenu;
    private javax.swing.JPanel pnlAdministracion;
    private javax.swing.JPanel pnlCancelarVuelo;
    private javax.swing.JPanel pnlFirstTopBar;
    private javax.swing.JPanel pnlLoginMenu;
    private javax.swing.JPanel pnlRechazados;
    private javax.swing.JPanel pnlRechazerVuelo;
    private javax.swing.JPanel pnlRegistroMenu;
    private javax.swing.JPanel pnlReportes;
    private javax.swing.JPanel pnlReprogramarVuelo;
    private javax.swing.JPanel pnlSettingsMenu;
    private javax.swing.JPanel pnlSettingsMenu1;
    private javax.swing.JPanel pnlSideBar;
    private javax.swing.JPanel pnleXITMenu;
    // End of variables declaration//GEN-END:variables
    
    //--------------------------------------------------------------------------
}
