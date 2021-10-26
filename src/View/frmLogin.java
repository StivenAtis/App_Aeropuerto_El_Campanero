package View;

import Classes.clsAdmin;
import Classes.clsLogin;
import javax.swing.JOptionPane;
import Controller.*;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.WIDTH;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.codec.binary.Base64;
import javax.swing.JFrame;

/**
 *
 * @author Booh
 */
public class frmLogin extends javax.swing.JFrame {
    
    //--------------------------------------------------------------------------
    
    @Override
    public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().
    getImage(ClassLoader.getSystemResource("Media/login_64px.png"));
    
    return retValue;
    }

    //--------------------------------------------------------------------------
    
    ctlAiportStaff controlLogin = new ctlAiportStaff();
    ctlAirlineStaff controlLoginAirline = new ctlAirlineStaff();
    ctlAdmin controlAdmin = new ctlAdmin();
    
    //--------------------------------------------------------------------------
    
    public frmLogin() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        cbAerolinea = new javax.swing.JCheckBox();
        cbAeropuerto = new javax.swing.JCheckBox();
        lbEmailUserLogin = new javax.swing.JLabel();
        tfEmailUserLogin = new javax.swing.JTextField();
        lbPasswordLogin = new javax.swing.JLabel();
        pswPasswordLogin = new javax.swing.JPasswordField();
        jcbMostrar = new javax.swing.JCheckBox();
        btLogin = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(156, 104));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicio de sesión");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 860, 90));

        cbAerolinea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbAerolinea.setForeground(new java.awt.Color(255, 255, 255));
        cbAerolinea.setText("Aerolinea");
        cbAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAerolineaActionPerformed(evt);
            }
        });
        getContentPane().add(cbAerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 130, 30));

        cbAeropuerto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbAeropuerto.setForeground(new java.awt.Color(255, 255, 255));
        cbAeropuerto.setText("Aeropuerto");
        cbAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAeropuertoActionPerformed(evt);
            }
        });
        getContentPane().add(cbAeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, 30));

        lbEmailUserLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        lbEmailUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin.setText("Email / Usuario");
        lbEmailUserLogin.setToolTipText("");
        getContentPane().add(lbEmailUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 230, 50));

        tfEmailUserLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tfEmailUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 660, 50));

        lbPasswordLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        lbPasswordLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbPasswordLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPasswordLogin.setText("Contraseña");
        lbPasswordLogin.setToolTipText("");
        getContentPane().add(lbPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 170, 50));

        pswPasswordLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pswPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 660, 50));

        jcbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jcbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 500, -1, -1));

        btLogin.setBackground(new java.awt.Color(102, 102, 102));
        btLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btLogin.setForeground(new java.awt.Color(255, 255, 255));
        btLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/iniciar_sesion_min.png"))); // NOI18N
        btLogin.setContentAreaFilled(false);
        btLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/iniciar_sesion_min.png"))); // NOI18N
        btLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/iniciar_sesion_maz.png"))); // NOI18N
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 320, 120));

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_min.png"))); // NOI18N
        btCancel.setContentAreaFilled(false);
        btCancel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_min.png"))); // NOI18N
        btCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelar_max.png"))); // NOI18N
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 330, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 860, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void cleanLoginQuestionnaire(){
        tfEmailUserLogin.setText("");
        pswPasswordLogin.setText("");
    }
    
    //--------------------------------------------------------------------------
    public String encode(String secretKey, String cadena) {
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return encriptacion;
    }
    
    //-------------------
    
    public String decode(String secretKey, String cadenaEncriptada) {
        String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return desencriptacion;
    }
    
    //--------------------------------------------------------------------------
    
    private void cbAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAerolineaActionPerformed

        if(cbAerolinea.isSelected() == true){

            cbAeropuerto.setSelected(false);
        }
    }//GEN-LAST:event_cbAerolineaActionPerformed

    //--------------------------------------------------------------------------
    
    private void cbAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAeropuertoActionPerformed

        if(cbAeropuerto.isSelected() == true){

            cbAerolinea.setSelected(false);
        }
    }//GEN-LAST:event_cbAeropuertoActionPerformed

    //--------------------------------------------------------------------------
    
    private void jcbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMostrarActionPerformed

        if (jcbMostrar.isSelected()) {
            pswPasswordLogin.setEchoChar((char) 0);
        } else {
            pswPasswordLogin.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed

                String email = tfEmailUserLogin.getText();
                String contrasenia = pswPasswordLogin.getText();
        
                if(email.equals("")){
                        JOptionPane.showMessageDialog(this, "Debe ingresar el correo electronico.");
                    }
                if(contrasenia.equals("")){
                        JOptionPane.showMessageDialog(this, "Debe ingresar la contraseña.");
                    }
                else{
                        clsLogin login = controlLogin.readStaff(email);
                        clsLogin loginAirline = controlLoginAirline.readStaff(email);
            
                        if (cbAeropuerto.isSelected() == true) {
                
                            if (login == null) {
                                    JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                                    cleanLoginQuestionnaire();
                                }
                            else{
                                
                                String pass = pswPasswordLogin.getText();
                                String emailL = tfEmailUserLogin.getText();

                                String secretKey = "aeropuertocampanero";
                                String encryptedPassword = encode(secretKey, pass);

                                if (!login.getEmail().equals(emailL) && login.getPassword().equals(encryptedPassword)) {
                                    JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                                    tfEmailUserLogin.setText("");
                                }

                                else if (!login.getPassword().equals(encryptedPassword) && login.getEmail().equals(emailL)) {
                                    JOptionPane.showMessageDialog(this, "¡la contraseña es incorrecta!");
                                    pswPasswordLogin.setText("");
                                }

                                else if(login.getEmail().equals(emailL) && login.getPassword().equals(encryptedPassword)){

                                    clsAdmin admin = new clsAdmin(0, emailL);
                                    controlAdmin.createAdmin(admin);

                                    Icon m = new ImageIcon(getClass().getResource("/Media/vuelo.png"));
                                    JOptionPane.showMessageDialog(this, "¡¡¡Bienvenido!!!", "welcome", WIDTH, m);
                                    frmAirport  ScheduleFlight_Airport = new  frmAirport();
                                    ScheduleFlight_Airport.setVisible(true);
                                    this.setVisible(false);
                                }
                            }
                        }
            
                        if (cbAerolinea.isSelected() == true) {
                
                                if (loginAirline == null) {
                                        JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                                        cleanLoginQuestionnaire();
                                    }
                                else{
                                    String pass = pswPasswordLogin.getText();
                                    String emailL = tfEmailUserLogin.getText();
                    
                                    String secretKey = "aeropuertocampanero";
                                    String encryptedPassword = encode(secretKey, pass);
                    
                                    if (!loginAirline.getEmail().equals(emailL) && loginAirline.getPassword().equals(encryptedPassword)) {
                                            JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                                            tfEmailUserLogin.setText("");
                                        }
                    
                                    else if (!loginAirline.getPassword().equals(encryptedPassword) && loginAirline.getEmail().equals(emailL)) {
                                            JOptionPane.showMessageDialog(this, "¡la contraseña es incorrecta!");
                                            pswPasswordLogin.setText("");
                                        }
                    
                                    else if(loginAirline.getEmail().equals(emailL) && loginAirline.getPassword().equals(encryptedPassword)){
                                        
                                        
                                        clsAdmin admin = new clsAdmin(0, emailL);
                                        controlAdmin.createAdmin(admin);
                                        
                                        Icon m = new ImageIcon(getClass().getResource("/Media/vuelo.png"));
                                        JOptionPane.showMessageDialog(this, "¡¡¡Bienvenido!!!", "welcome", WIDTH, m);
                                        frmAirline  ScheduleFlight_Airline = new  frmAirline();
                                        ScheduleFlight_Airline.setVisible(true);
                                        this.setVisible(false);
                                    }
                                }
                            }
            
                        if(cbAerolinea.isSelected() ==  false && cbAeropuerto.isSelected() == false){
                                JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de cuenta");
                            }
                    }
    }//GEN-LAST:event_btLoginActionPerformed

    //--------------------------------------------------------------------------
    
    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        frmAeropuerto airport = new  frmAeropuerto();
        airport.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btLogin;
    private javax.swing.JCheckBox cbAerolinea;
    private javax.swing.JCheckBox cbAeropuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox jcbMostrar;
    private javax.swing.JLabel lbEmailUserLogin;
    private javax.swing.JLabel lbPasswordLogin;
    private javax.swing.JPasswordField pswPasswordLogin;
    private javax.swing.JTextField tfEmailUserLogin;
    // End of variables declaration//GEN-END:variables
}
