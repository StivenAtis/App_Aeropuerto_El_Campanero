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


public class frmAirport extends javax.swing.JFrame {
    
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
    
    public final pnlHomeAirport pnlHome;
    public JScrollPane spContainer;
    private pnlScheduleFlight pnlScheduleFlight;
    private pnlFlightsRequested pnlFlightsRequested;
    private pnlScheduledFlights pnlScheduledFlights;
    private pnlFlightCalendar pnlFlightCalendar;
    private pnlRescheduleFlight pnlRescheduleFlight;
    private pnlQueryFlight_Airport pnlCancelFlight;
    private pnlRefuseFlight pnlRefuseFlight;
    private pnlCancelFlightAirport pnlCancelFlightAirport;
    private pnlReports pnlReports;

    //--------------------------------------------------------------------------
    
    public frmAirport() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.init_container();
        this.getContentPane().add(spContainer);        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        pnlHome = new pnlHomeAirport();
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
                "¿Estas seguro de cerrar sesión?",
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
        btnHome = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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
        AgendarVuelo = new javax.swing.JButton();
        lblIcon5 = new javax.swing.JLabel();
        pnlReprogramarVuelo = new javax.swing.JPanel();
        ReprogramarVUelo = new javax.swing.JButton();
        lblIcon6 = new javax.swing.JLabel();
        pnlRechazerVuelo = new javax.swing.JPanel();
        btnRechazarVuelo = new javax.swing.JButton();
        lblIcon8 = new javax.swing.JLabel();
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
        AgendaVuelos = new javax.swing.JButton();
        lblIcon2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        pnlCancelarVuelo = new javax.swing.JPanel();
        btnBuscarVuelo = new javax.swing.JButton();
        lblIcon7 = new javax.swing.JLabel();
        pnlCancelarVA = new javax.swing.JPanel();
        btnCancelarVuelo = new javax.swing.JButton();
        lblIcon11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aeropuerto");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFirstTopBar.setBackground(new java.awt.Color(28, 31, 52));
        pnlFirstTopBar.setMaximumSize(new java.awt.Dimension(1200, 720));
        pnlFirstTopBar.setMinimumSize(new java.awt.Dimension(1200, 720));
        pnlFirstTopBar.setPreferredSize(new java.awt.Dimension(1200, 720));
        pnlFirstTopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(204, 204, 204));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/home_30px.png"))); // NOI18N
        btnHome.setText("HOME");
        btnHome.setContentAreaFilled(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pnlFirstTopBar.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 150, 50));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("El Campanero v1.2");
        pnlFirstTopBar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 110, -1));

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

        AgendarVuelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AgendarVuelo.setForeground(new java.awt.Color(204, 204, 204));
        AgendarVuelo.setText("Agendar vuelo");
        AgendarVuelo.setBorderPainted(false);
        AgendarVuelo.setContentAreaFilled(false);
        AgendarVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgendarVuelo.setFocusPainted(false);
        AgendarVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AgendarVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgendarVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgendarVueloMouseExited(evt);
            }
        });
        AgendarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarVueloActionPerformed(evt);
            }
        });
        pnlAboutMenu.add(AgendarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 50));

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

        pnlRechazerVuelo.setBackground(new java.awt.Color(28, 31, 52));
        pnlRechazerVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRechazarVuelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRechazarVuelo.setForeground(new java.awt.Color(204, 204, 204));
        btnRechazarVuelo.setText("Rechazar vuelo");
        btnRechazarVuelo.setBorderPainted(false);
        btnRechazarVuelo.setContentAreaFilled(false);
        btnRechazarVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRechazarVuelo.setFocusPainted(false);
        btnRechazarVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRechazarVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRechazarVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRechazarVueloMouseExited(evt);
            }
        });
        btnRechazarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarVueloActionPerformed(evt);
            }
        });
        pnlRechazerVuelo.add(btnRechazarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/refuse_request_30px.png"))); // NOI18N
        pnlRechazerVuelo.add(lblIcon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

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

        lblIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reports_30px.png"))); // NOI18N
        pnlReportes.add(lblIcon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        pnlAdministracion.setBackground(new java.awt.Color(28, 31, 52));
        pnlAdministracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acercaDE5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acercaDE5.setForeground(new java.awt.Color(204, 204, 204));
        acercaDE5.setText("Administración");
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
        btnExit.setText("Cerrar sesión");
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

        AgendaVuelos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AgendaVuelos.setForeground(new java.awt.Color(204, 204, 204));
        AgendaVuelos.setText("Agenda de vuelo");
        AgendaVuelos.setBorderPainted(false);
        AgendaVuelos.setContentAreaFilled(false);
        AgendaVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgendaVuelos.setFocusPainted(false);
        AgendaVuelos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AgendaVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgendaVuelosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgendaVuelosMouseExited(evt);
            }
        });
        AgendaVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaVuelosActionPerformed(evt);
            }
        });
        pnlSettingsMenu.add(AgendaVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, 40));

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agenda_30px.png"))); // NOI18N
        pnlSettingsMenu.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("NIT: 800333444-8");

        pnlCancelarVuelo.setBackground(new java.awt.Color(28, 31, 52));
        pnlCancelarVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarVuelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarVuelo.setForeground(new java.awt.Color(204, 204, 204));
        btnBuscarVuelo.setText("Consultar vuelo");
        btnBuscarVuelo.setBorderPainted(false);
        btnBuscarVuelo.setContentAreaFilled(false);
        btnBuscarVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarVuelo.setFocusPainted(false);
        btnBuscarVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarVueloMouseExited(evt);
            }
        });
        btnBuscarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVueloActionPerformed(evt);
            }
        });
        pnlCancelarVuelo.add(btnBuscarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        lblIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/search_30px.png"))); // NOI18N
        pnlCancelarVuelo.add(lblIcon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        pnlCancelarVA.setBackground(new java.awt.Color(28, 31, 52));
        pnlCancelarVA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlCancelarVA.add(btnCancelarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 50));

        lblIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_fly_30px.png"))); // NOI18N
        pnlCancelarVA.add(lblIcon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        javax.swing.GroupLayout pnlSideBarLayout = new javax.swing.GroupLayout(pnlSideBar);
        pnlSideBar.setLayout(pnlSideBarLayout);
        pnlSideBarLayout.setHorizontalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                                .addComponent(pnlRechazerVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(pnlSideBarLayout.createSequentialGroup()
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLoginMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlRegistroMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlReprogramarVuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(pnlCancelarVuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(pnlReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                            .addGroup(pnlSideBarLayout.createSequentialGroup()
                                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnleXITMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlSettingsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlSideBarLayout.createSequentialGroup()
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAboutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCancelarVA, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRegistroMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLoginMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSettingsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAboutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlReprogramarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRechazerVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCancelarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCancelarVA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnlReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        pnlScheduledFlights = new pnlScheduledFlights();
        this.loadPanel(pnlScheduledFlights);
        setMyPanelActive(Constants.PANEL_SCHUDELEDFLIGHTS);
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
        pnlFlightsRequested = new pnlFlightsRequested();
        this.loadPanel(pnlFlightsRequested);
        setMyPanelActive(Constants.PANEL_FLIGHTREQUESTED);
        changeIconSubtitleBar(Constants.TITLE_FLIGHTREQUESTED, Constants.ICON_FLIGHTREQUESTED);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnVuelosSolicitadosActionPerformed

    //--------------------------------------------------------------------------
    
    private void AgendarVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendarVueloMouseEntered
        changeColorMenu(pnlAboutMenu);
    }//GEN-LAST:event_AgendarVueloMouseEntered

    //--------------------------------------------------------------------------
    
    private void AgendarVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendarVueloMouseExited
        resetColorMenu(pnlAboutMenu);
    }//GEN-LAST:event_AgendarVueloMouseExited

    //--------------------------------------------------------------------------
    
    private void AgendarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarVueloActionPerformed
        pnlScheduleFlight = new pnlScheduleFlight();
        this.loadPanel(pnlScheduleFlight);
        setMyPanelActive(Constants.PANEL_SCHUDELEFLIGHT);
        changeIconSubtitleBar(Constants.TITLE_SCHUDELEFLIGHT, Constants.ICON_SCHUDELEFLIGHT);
        btnHome.setVisible(true);
    }//GEN-LAST:event_AgendarVueloActionPerformed

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
    
    private void AgendaVuelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendaVuelosMouseEntered
        changeColorMenu(pnlSettingsMenu);
    }//GEN-LAST:event_AgendaVuelosMouseEntered

    //--------------------------------------------------------------------------
    
    private void AgendaVuelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendaVuelosMouseExited
        resetColorMenu(pnlSettingsMenu);
    }//GEN-LAST:event_AgendaVuelosMouseExited

    //--------------------------------------------------------------------------
    
    private void AgendaVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaVuelosActionPerformed
        
        pnlFlightCalendar = new pnlFlightCalendar();
        this.loadPanel(pnlFlightCalendar);
        setMyPanelActive(Constants.PANEL_FLIGHTSCALENDAR);
        changeIconSubtitleBar(Constants.TITLE_FLIGHTSCALENDAR, Constants.ICON_FLIGHTSCALENDAR);
        btnHome.setVisible(true);
    }//GEN-LAST:event_AgendaVuelosActionPerformed

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
        
        pnlRescheduleFlight = new pnlRescheduleFlight();
        this.loadPanel(pnlRescheduleFlight);
        setMyPanelActive(Constants.PANEL_RESSCHUDELEFLIGHT);
        changeIconSubtitleBar(Constants.TITLE_RESSCHUDELEFLIGHT, Constants.ICON_RESSCHUDELEFLIGHT);
        btnHome.setVisible(true);
    }//GEN-LAST:event_ReprogramarVUeloActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnBuscarVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarVueloMouseEntered
        changeColorMenu(pnlCancelarVuelo);
    }//GEN-LAST:event_btnBuscarVueloMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnBuscarVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarVueloMouseExited
        resetColorMenu(pnlCancelarVuelo);
    }//GEN-LAST:event_btnBuscarVueloMouseExited

    //--------------------------------------------------------------------------
    
    private void btnBuscarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVueloActionPerformed
         
        pnlCancelFlight = new pnlQueryFlight_Airport();
        this.loadPanel(pnlCancelFlight);
        setMyPanelActive(Constants.PANEL_CANCELFLIGHT);
        changeIconSubtitleBar(Constants.TITLE_FLIGHTQUERY, Constants.ICON_FLIGHTQUERY);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnBuscarVueloActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnRechazarVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRechazarVueloMouseEntered
        changeColorMenu(pnlRechazerVuelo);
    }//GEN-LAST:event_btnRechazarVueloMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnRechazarVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRechazarVueloMouseExited
        resetColorMenu(pnlRechazerVuelo);
    }//GEN-LAST:event_btnRechazarVueloMouseExited

    //--------------------------------------------------------------------------
    
    private void btnRechazarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarVueloActionPerformed
        
        pnlRefuseFlight = new pnlRefuseFlight();
        this.loadPanel(pnlRefuseFlight);
        setMyPanelActive(Constants.PANEL_REFUSEFLIGHT);
        changeIconSubtitleBar(Constants.TITLE_REFUSEFLIGHT, Constants.ICON_REFUSEFLIGHT);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnRechazarVueloActionPerformed

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
        
        pnlReports = new pnlReports();
        this.loadPanel(pnlReports);
        setMyPanelActive(Constants.PANEL_REPORTS);
        changeIconSubtitleBar(Constants.TITLE_REPORTS, Constants.ICON_REPORTS);
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
        frmLoginAdmistrationAirport login = new  frmLoginAdmistrationAirport();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_acercaDE5ActionPerformed

    //--------------------------------------------------------------------------
    
    private void btnCancelarVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVueloMouseEntered
        changeColorMenu(pnlCancelarVA);
    }//GEN-LAST:event_btnCancelarVueloMouseEntered

    //--------------------------------------------------------------------------
    
    private void btnCancelarVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVueloMouseExited
        resetColorMenu(pnlCancelarVA);
    }//GEN-LAST:event_btnCancelarVueloMouseExited

    //--------------------------------------------------------------------------
    
    private void btnCancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVueloActionPerformed
        
        pnlCancelFlightAirport = new pnlCancelFlightAirport();
        this.loadPanel(pnlCancelFlightAirport);
        setMyPanelActive(Constants.PANEL_CANCEL_FLIGHT_AIRPORT);
        changeIconSubtitleBar(Constants.TITLE_ABORTFLIGHTS, Constants.ICON_CANCELFLIGHT);
        btnHome.setVisible(true);
    }//GEN-LAST:event_btnCancelarVueloActionPerformed

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
            java.util.logging.Logger.getLogger(frmAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAirport().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgendaVuelos;
    private javax.swing.JButton AgendarVuelo;
    private javax.swing.JButton ReprogramarVUelo;
    private javax.swing.JButton acercaDE5;
    private javax.swing.JButton btnBuscarVuelo;
    private javax.swing.JButton btnCancelarVuelo;
    private javax.swing.JButton btnExit;
    public javax.swing.JButton btnHome;
    private javax.swing.JButton btnRechazarVuelo;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnVuelosAgendados;
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
    private javax.swing.JLabel lblIcon2;
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
    private javax.swing.JPanel pnlCancelarVA;
    private javax.swing.JPanel pnlCancelarVuelo;
    private javax.swing.JPanel pnlFirstTopBar;
    private javax.swing.JPanel pnlLoginMenu;
    private javax.swing.JPanel pnlRechazerVuelo;
    private javax.swing.JPanel pnlRegistroMenu;
    private javax.swing.JPanel pnlReportes;
    private javax.swing.JPanel pnlReprogramarVuelo;
    private javax.swing.JPanel pnlSettingsMenu;
    private javax.swing.JPanel pnlSideBar;
    private javax.swing.JPanel pnleXITMenu;
    // End of variables declaration//GEN-END:variables
}
