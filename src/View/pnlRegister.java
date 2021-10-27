package View;

import Classes.*;
import Controller.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Booh
 */
public class pnlRegister extends javax.swing.JPanel {
    
    //--------------------------------------------------------------------------
    
    ctlAiportStaff controlAiportStaff = new ctlAiportStaff();
    ctlAirlineStaff controlAirlineStaff = new ctlAirlineStaff();

    //--------------------------------------------------------------------------
    
    public pnlRegister() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNamesRegister = new javax.swing.JLabel();
        lbLastNames = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbPassword1 = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfNamesRegister = new javax.swing.JTextField();
        tfLastNameRegister = new javax.swing.JTextField();
        tfEmailRegister = new javax.swing.JTextField();
        tfUserRegister = new javax.swing.JTextField();
        pswPasswordRegister = new javax.swing.JPasswordField();
        pswPasswordRegisterConf = new javax.swing.JPasswordField();
        cbMostrarC = new javax.swing.JCheckBox();
        cbMostrarCV = new javax.swing.JCheckBox();
        btRegistrar = new javax.swing.JButton();
        cbAeropuerto = new javax.swing.JCheckBox();
        cbAerolinea = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNamesRegister.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbNamesRegister.setForeground(new java.awt.Color(255, 255, 255));
        lbNamesRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNamesRegister.setText("Nombres");
        lbNamesRegister.setToolTipText("");
        add(lbNamesRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 160, 50));

        lbLastNames.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbLastNames.setForeground(new java.awt.Color(255, 255, 255));
        lbLastNames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLastNames.setText("Apellidos");
        lbLastNames.setToolTipText("");
        add(lbLastNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 170, 50));

        lbEmail.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmail.setText("Email");
        lbEmail.setToolTipText("");
        add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 120, 50));

        lbUser.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("Usuario");
        lbUser.setToolTipText("");
        add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 150, 50));

        lbPassword1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbPassword1.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPassword1.setText("Contraseña");
        lbPassword1.setToolTipText("");
        add(lbPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 190, 50));

        lbPassword.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPassword.setText("Confirmar contraseña");
        lbPassword.setToolTipText("");
        add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 310, 50));

        tfNamesRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfNamesRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNamesRegisterKeyTyped(evt);
            }
        });
        add(tfNamesRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 490, 50));

        tfLastNameRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfLastNameRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLastNameRegisterKeyTyped(evt);
            }
        });
        add(tfLastNameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 490, 50));

        tfEmailRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfEmailRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 490, 50));

        tfUserRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 490, 50));

        pswPasswordRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswPasswordRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswPasswordRegisterMouseClicked(evt);
            }
        });
        add(pswPasswordRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 490, 50));

        pswPasswordRegisterConf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswPasswordRegisterConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswPasswordRegisterConfMouseClicked(evt);
            }
        });
        add(pswPasswordRegisterConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 490, 50));

        cbMostrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarCActionPerformed(evt);
            }
        });
        add(cbMostrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, -1, -1));

        cbMostrarCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarCVActionPerformed(evt);
            }
        });
        add(cbMostrarCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 540, -1, -1));

        btRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Registrar_user_min.png"))); // NOI18N
        btRegistrar.setContentAreaFilled(false);
        btRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Registrar_user_min.png"))); // NOI18N
        btRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Registrar_user_max.png"))); // NOI18N
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });
        add(btRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, 330, 110));

        cbAeropuerto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbAeropuerto.setForeground(new java.awt.Color(255, 255, 255));
        cbAeropuerto.setText("Aeropuerto");
        cbAeropuerto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cbAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAeropuertoActionPerformed(evt);
            }
        });
        add(cbAeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, -1, 30));

        cbAerolinea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbAerolinea.setForeground(new java.awt.Color(255, 255, 255));
        cbAerolinea.setText("Aerolinea");
        cbAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAerolineaActionPerformed(evt);
            }
        });
        add(cbAerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro de usuarios");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1170, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1170, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_create_acount.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void cleanRegisterQuestionnaire(){
        tfNamesRegister.setText("");
        tfLastNameRegister.setText("");
        tfEmailRegister.setText("");
        pswPasswordRegister.setText("");
        pswPasswordRegisterConf.setText("");
        tfUserRegister.setText("");
        cbAerolinea.setSelected(false);
        cbAeropuerto.setSelected(false);
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

    //--------------------------------------------------------------------------
    
    public String deecode(String secretKey, String cadenaEncriptada) {
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
    
    private void tfNamesRegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNamesRegisterKeyTyped

        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter == '1') || (caracter  == '2') || (caracter  == '3') || (caracter  == '4') || (caracter  == '5') || (caracter  == '6')
            || (caracter  == '7') || (caracter  == '8') || (caracter  == '9') || (caracter  == '0')))
        {
        evt.consume();  // ignorar el evento de teclado
        }

    }//GEN-LAST:event_tfNamesRegisterKeyTyped

    private void tfLastNameRegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLastNameRegisterKeyTyped

        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter == '1') || (caracter  == '2') || (caracter  == '3') || (caracter  == '4') || (caracter  == '5') || (caracter  == '6')
            || (caracter  == '7') || (caracter  == '8') || (caracter  == '9') || (caracter  == '0')))
    {
        evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_tfLastNameRegisterKeyTyped

    private void pswPasswordRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswPasswordRegisterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pswPasswordRegisterMouseClicked

    private void pswPasswordRegisterConfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswPasswordRegisterConfMouseClicked
        pswPasswordRegisterConf.setText("");
    }//GEN-LAST:event_pswPasswordRegisterConfMouseClicked

    private void cbMostrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarCActionPerformed

        if (cbMostrarC.isSelected()) {
            pswPasswordRegister.setEchoChar((char) 0);
        } else {
            pswPasswordRegister.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarCActionPerformed

    private void cbMostrarCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarCVActionPerformed

        if (cbMostrarCV.isSelected()) {
            pswPasswordRegisterConf.setEchoChar((char) 0);
        } else {
            pswPasswordRegisterConf.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarCVActionPerformed

    private void cbAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAeropuertoActionPerformed

        if(cbAeropuerto.isSelected() == true){

            cbAerolinea.setSelected(false);
        }
    }//GEN-LAST:event_cbAeropuertoActionPerformed

    private void cbAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAerolineaActionPerformed

        if(cbAerolinea.isSelected() == true){

            cbAeropuerto.setSelected(false);
        }
    }//GEN-LAST:event_cbAerolineaActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        
        if (cbAerolinea.isSelected() == false && cbAeropuerto.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "¡¡¡Debes seleccionar un tipo de cuenta para registrarte!!!", "ERROR", WIDTH);
        }
        
        if(tfLastNameRegister.getText().equals("") || tfNamesRegister.getText().equals("") || tfEmailRegister.getText().equals("") || tfUserRegister.getText().equals("")){
            Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
            JOptionPane.showMessageDialog(this, "¡¡¡Debes ingresar todos \n los datos para registrarte!!!", "ERROR", WIDTH, m);
        }
        
        String email = tfEmailRegister.getText();
        boolean email_valido = clsEmailVerification.es_un_email_valido(email);
        
        if(cbAeropuerto.isSelected() == true){
            
            if(email_valido == true){
            
                try {
                    String name = tfNamesRegister.getText();
                    String lastName = tfLastNameRegister.getText();
                    String email_emp = tfEmailRegister.getText();
                    String user_emp =tfUserRegister.getText();
                    String password =pswPasswordRegister.getText();
                    String Cpassword =pswPasswordRegisterConf.getText();

                    String secretKey = "aeropuertocampanero";
                    String encryptedPassword = encode(secretKey, password);

                    if(tfLastNameRegister.getText().equals("") || tfNamesRegister.getText().equals("") || tfEmailRegister.getText().equals("") || tfUserRegister.getText().equals("")){
                        Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Debes ingresar todos \n los datos para registrarte!!!", "ERROR", WIDTH, m);
                    }
                    else{
                        if(password.equals(Cpassword)){
                            clsAirportStaff user = new clsAirportStaff(0, "0", name, lastName, "0", email_emp, user_emp, encryptedPassword);

                            Icon m = new ImageIcon(getClass().getResource("/Media/passed.png"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha creado correctamente\n uuna cuenta de aeropuerto!!!", "Cuenta creada", WIDTH, m);

                            controlAiportStaff.createStaff(user);
                            cleanRegisterQuestionnaire();
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "¡La contraseña no coincide!");
                            pswPasswordRegisterConf.setText("");
                        }

                    }

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            else{
                Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
                JOptionPane.showMessageDialog(this, "¡¡¡Tu email no corresponde \n al dominio del aeropuerto!!!", "ERROR", WIDTH, m);
                tfEmailRegister.setText("");
            }
        }
        else{
            if(cbAerolinea.isSelected() == true){
                
                String email_air = tfEmailRegister.getText();
                boolean email_valid = clsEmailVerification.email_valido(email_air);
                if(email_valid == true){

                    try {
                    String name = tfNamesRegister.getText();
                    String lastName = tfLastNameRegister.getText();
                    String email_emp = tfEmailRegister.getText();
                    String user_emp =tfUserRegister.getText();
                    String password =pswPasswordRegister.getText();
                    String Cpassword =pswPasswordRegisterConf.getText();

                    String secretKey = "aeropuertocampanero";
                    String encryptedPassword = encode(secretKey, password);

                    if(tfLastNameRegister.getText().equals("") || tfNamesRegister.getText().equals("") || tfEmailRegister.getText().equals("") || tfUserRegister.getText().equals("")){
                        Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Debes ingresar todos \n los datos para registrarte!!!", "ERROR", WIDTH, m);
                    }
                    else{

                        if(password.equals(Cpassword)){

                            clsAirlineStaff user = new clsAirlineStaff(0, "0",name, lastName, "0", email_emp, user_emp, encryptedPassword);
                            controlAirlineStaff.createStaff(user);

                            Icon m = new ImageIcon(getClass().getResource("/Media/passed.png"));
                            JOptionPane.showMessageDialog(this, "¡¡¡Se ha creado correctamente\n uuna cuenta de aerolinea!!!", "Cuenta creada", WIDTH, m);
                            cleanRegisterQuestionnaire();
                        }
                        else{

                            JOptionPane.showMessageDialog(this, "¡La contraseña no coincide!");
                                pswPasswordRegisterConf.setText("");
                        }

                    }

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                }
                else{
                    Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
                    JOptionPane.showMessageDialog(this, "¡¡¡Verifica tu dirección email!!!", "ERROR", WIDTH, m);
                    tfEmailRegister.setText("");
                }
            }
        }
        
        
    }//GEN-LAST:event_btRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrar;
    private javax.swing.JCheckBox cbAerolinea;
    private javax.swing.JCheckBox cbAeropuerto;
    private javax.swing.JCheckBox cbMostrarC;
    private javax.swing.JCheckBox cbMostrarCV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbLastNames;
    private javax.swing.JLabel lbNamesRegister;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPassword1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPasswordField pswPasswordRegister;
    private javax.swing.JPasswordField pswPasswordRegisterConf;
    private javax.swing.JTextField tfEmailRegister;
    private javax.swing.JTextField tfLastNameRegister;
    private javax.swing.JTextField tfNamesRegister;
    private javax.swing.JTextField tfUserRegister;
    // End of variables declaration//GEN-END:variables
}
