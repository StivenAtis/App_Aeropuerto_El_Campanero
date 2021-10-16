package View;

/**
 *
 * @author Booh
 */
public class pnlReports extends javax.swing.JPanel {

    public pnlReports() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
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
        comboBReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una opción para reporte", "Vuelos solicitados", "Vuelos agendados", "Vuelos cancelados", "Vuelos rechazados", "Historial de reprogramación" }));
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

    private void comboBReportesIndividual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBReportesIndividual1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBReportesIndividual1ActionPerformed


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
}
