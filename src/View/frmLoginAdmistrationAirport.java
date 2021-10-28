package View;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Booh
 */
public class frmLoginAdmistrationAirport extends javax.swing.JFrame {
    
    //--------------------------------------------------------------------------
    
    @Override
    public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().
    getImage(ClassLoader.getSystemResource("Media/login_64px.png"));
    
    return retValue;
    }

    //--------------------------------------------------------------------------
    
    public frmLoginAdmistrationAirport() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pswPasswordLogin = new javax.swing.JPasswordField();
        lbPasswordLogin = new javax.swing.JLabel();
        jcbMostrar = new javax.swing.JCheckBox();
        btIngresar = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación administración");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(156, 104));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingreso Administración");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 860, 90));

        pswPasswordLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pswPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 660, 50));

        lbPasswordLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        lbPasswordLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbPasswordLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPasswordLogin.setText("Contraseña Administrador");
        lbPasswordLogin.setToolTipText("");
        getContentPane().add(lbPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 860, 50));

        jcbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jcbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 320, -1, -1));

        btIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Ingresar_min.png"))); // NOI18N
        btIngresar.setContentAreaFilled(false);
        btIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Ingresar_min.png"))); // NOI18N
        btIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Ingresar_max.png"))); // NOI18N
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 330, 120));

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_min.png"))); // NOI18N
        btCancel.setContentAreaFilled(false);
        btCancel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_min.png"))); // NOI18N
        btCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_max.png"))); // NOI18N
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 330, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 860, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void jcbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMostrarActionPerformed

        if (jcbMostrar.isSelected()) {
            pswPasswordLogin.setEchoChar((char) 0);
        } else {
            pswPasswordLogin.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        frmAirport airport = new  frmAirport();
        airport.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    //--------------------------------------------------------------------------
    
    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        
        String password = pswPasswordLogin.getText();
        
        if (password.equals("")) {
            frmAdministrationAirportUserOnly AdministrationUserOnly = new frmAdministrationAirportUserOnly();
            AdministrationUserOnly.setVisible(true);
            this.setVisible(false);
        }
        else if(password.equals("123456")) {
            frmAdministrationAirport administrationAirline = new frmAdministrationAirport();
            administrationAirline.setVisible(true);
            this.setVisible(false);
        }
        else if(!password.equals("123456") || !password.equals("")){
            JOptionPane.showMessageDialog(this, "Contraseña incorreta");
        }
    }//GEN-LAST:event_btIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLoginAdmistrationAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginAdmistrationAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginAdmistrationAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginAdmistrationAirport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginAdmistrationAirport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox jcbMostrar;
    private javax.swing.JLabel lbPasswordLogin;
    private javax.swing.JPasswordField pswPasswordLogin;
    // End of variables declaration//GEN-END:variables
    //--------------------------------------------------------------------------
}
