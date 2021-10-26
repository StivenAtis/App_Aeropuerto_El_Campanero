package View;

import Classes.clsAdmin;
import Classes.clsAirportStaff;
import Controller.ctlAdmin;
import Controller.ctlAiportStaff;
import static java.awt.image.ImageObserver.WIDTH;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.binary.Base64;
import utils.Constants;

/**
 *
 * @author Booh
 */
public class pnlUpdateUserAirport extends javax.swing.JPanel {

    //--------------------------------------------------------------------------
    
    private ctlAdmin controlAdmin = null;
    private ctlAiportStaff controlAdminAirport = null;
    LinkedList<clsAirportStaff> list;
    LinkedList<clsAdmin> AdminObjectList = new LinkedList<>();
    
    public pnlUpdateUserAirport() {
        
        //----------------------------------------------------------------------
    
        initComponents();
        controlAdmin = new ctlAdmin();
        controlAdminAirport = new ctlAiportStaff();
        fillDataTable();
        showAdmin();
        tfEmail.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBanner = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        tfIdentificacion = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfUsuario = new javax.swing.JTextField();
        pswPassword = new javax.swing.JPasswordField();
        pswPasswordConfirmed = new javax.swing.JPasswordField();
        jcbMostrar = new javax.swing.JCheckBox();
        btActualizar = new javax.swing.JButton();
        lbBackground = new javax.swing.JLabel();
        lbBanner_pnl = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBanner.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        lbBanner.setForeground(new java.awt.Color(255, 255, 255));
        lbBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanner.setText("Actualizar usuario");
        add(lbBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 90));

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Datos de usuario");
        lbUsuario.setToolTipText("");
        add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, 40));

        tblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 1160, 60));

        lb1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Número de Identificación");
        lb1.setToolTipText("");
        add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 390, 40));

        lb2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("Email");
        lb2.setToolTipText("");
        add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 390, 40));

        lb3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("Telefono");
        lb3.setToolTipText("");
        add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 340, 40));

        lb4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4.setText("Nombres");
        lb4.setToolTipText("");
        add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 390, 40));

        lb5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb5.setText("Apellidos");
        lb5.setToolTipText("");
        add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 390, 40));

        lb6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb6.setText("Nombre de usuario");
        lb6.setToolTipText("");
        add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 330, 40));

        lb7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb7.setText("Contraseña");
        lb7.setToolTipText("");
        add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 390, 40));

        lb8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lb8.setForeground(new java.awt.Color(255, 255, 255));
        lb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb8.setText("Confirmar contraseña");
        lb8.setToolTipText("");
        add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 390, 40));

        tfIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfIdentificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfIdentificacionMouseClicked(evt);
            }
        });
        add(tfIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 390, 40));

        tfEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 390, 40));

        tfTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfTelefonoMouseClicked(evt);
            }
        });
        add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 340, 40));

        tfNombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNombresMouseClicked(evt);
            }
        });
        tfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombresKeyTyped(evt);
            }
        });
        add(tfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 390, 40));

        tfApellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfApellidosMouseClicked(evt);
            }
        });
        tfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidosKeyTyped(evt);
            }
        });
        add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 390, 40));

        tfUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsuarioMouseClicked(evt);
            }
        });
        add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, 340, 40));

        pswPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswPasswordMouseClicked(evt);
            }
        });
        add(pswPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 390, 40));

        pswPasswordConfirmed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswPasswordConfirmed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswPasswordConfirmedMouseClicked(evt);
            }
        });
        add(pswPasswordConfirmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 390, 40));

        jcbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMostrarActionPerformed(evt);
            }
        });
        add(jcbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, -1, -1));

        btActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btActualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/actualizar_min.png"))); // NOI18N
        btActualizar.setContentAreaFilled(false);
        btActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/actualizar_min.png"))); // NOI18N
        btActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/actualizar_max.png"))); // NOI18N
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });
        add(btActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 320, 120));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Background_login_2.png"))); // NOI18N
        add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1180, 730));

        lbBanner_pnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_Airport_Administration_2.jpg"))); // NOI18N
        add(lbBanner_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void fillDataTable() {
        
        list = controlAdminAirport.listAdminA();
        
        controlAdmin.compareAdminAirport();
            
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
            tblUsuario.getColumnModel().getColumn(x).setPreferredWidth(columnSize[x]);
        tblUsuario.setRowHeight(30);
        tblUsuario.setModel(model);
    }
    
    //--------------------------------------------------------------------------
    
    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        
        int row = tblUsuario.getSelectedRow();
        String id = tblUsuario.getValueAt(row, 0).toString();

        clsAirportStaff FlightRequirementsSearch = controlAdminAirport.readStaffA(id);

        String identificacion = FlightRequirementsSearch.getIdentification();
        String nombres = FlightRequirementsSearch.getName();
        String apellidos = FlightRequirementsSearch.getLastName();
        String telefono = FlightRequirementsSearch.getPhone();
        String email = FlightRequirementsSearch.getEmail();
        String usuario = FlightRequirementsSearch.getUser();
        String contrasenia = FlightRequirementsSearch.getPassword();
        
        String secretKey = "aeropuertocampanero";
        String desencryptedPassword = decode(secretKey, contrasenia);

        tfIdentificacion.setText(identificacion);
        tfNombres.setText(nombres);
        tfApellidos.setText(apellidos);
        tfTelefono.setText(telefono);
        tfEmail.setText(email);
        tfUsuario.setText(usuario);
        pswPassword.setText(desencryptedPassword);
        pswPasswordConfirmed.setText(desencryptedPassword);
        
    }//GEN-LAST:event_tblUsuarioMouseClicked

    //--------------------------------------------------------------------------
    
    private void jcbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMostrarActionPerformed

        if (jcbMostrar.isSelected()) {
            pswPassword.setEchoChar((char) 0);
            pswPasswordConfirmed.setEchoChar((char) 0);
        } else {
            pswPassword.setEchoChar('*');
            pswPasswordConfirmed.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        
        if(tblUsuario.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "¡Debe seleccionar su usuario para poderlo actualizar!");
        }
        else{
            
            String id = tfIdentificacion.getText();
            String nombres = tfNombres.getText();
            String apellidos = tfApellidos.getText();
            String telefono = tfTelefono.getText();
            String email = tfEmail.getText();
            String usuario = tfUsuario.getText();
            String contrasenia = pswPassword.getText();
            String contrasenia2 = pswPasswordConfirmed.getText();
            
            if(id.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("") || email.equals("") || usuario.equals("") || contrasenia.equals("") || contrasenia2.equals("")){
                JOptionPane.showMessageDialog(this, "¡Debe ingresar todos los datos del formulario!");
            }
            else {
                if(!contrasenia.equals(contrasenia2)){
                    JOptionPane.showMessageDialog(this, "¡Confirmación de contraseña incorrecta!");
                    pswPasswordConfirmed.setText("");
                }
                else{
                    String secretKey = "aeropuertocampanero";
                    String encryptedPassword = encode(secretKey, contrasenia);
                    clsAirportStaff updateUser = new clsAirportStaff(0, id, nombres, apellidos, telefono, email, usuario, encryptedPassword);
                    
                    controlAdminAirport.updateUser(updateUser);
                    
                    Icon m = new ImageIcon(getClass().getResource("/Media/User_Update2.gif"));
                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha actualizado \n su cuenta de usuario!!!", "Actualización realizada satisfactoriamente", WIDTH, m);
                    
                    fillDataTable();
                    cleanRegisterQuestionnaire();
                }
            }
        }
    }//GEN-LAST:event_btActualizarActionPerformed

    //--------------------------------------------------------------------------
    
    private void tfIdentificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfIdentificacionMouseClicked
        
        if(!"".equals(tfIdentificacion.getText())){
            tfIdentificacion.setText("");
        }
    }//GEN-LAST:event_tfIdentificacionMouseClicked

    //--------------------------------------------------------------------------
    
    private void tfTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTelefonoMouseClicked
        
        if(!"".equals(tfTelefono.getText())){
            tfTelefono.setText("");
        }
    }//GEN-LAST:event_tfTelefonoMouseClicked

    //--------------------------------------------------------------------------
    
    private void tfNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombresMouseClicked
        
        if(!"".equals(tfNombres.getText())){
            tfNombres.setText("");
        }
    }//GEN-LAST:event_tfNombresMouseClicked

    //--------------------------------------------------------------------------
    
    private void tfApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfApellidosMouseClicked
        
        if(!"".equals(tfApellidos.getText())){
            tfApellidos.setText("");
        }
    }//GEN-LAST:event_tfApellidosMouseClicked

    //--------------------------------------------------------------------------
    
    private void tfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMouseClicked
        
        if(!"".equals(tfUsuario.getText())){
            tfUsuario.setText("");
        }
    }//GEN-LAST:event_tfUsuarioMouseClicked

    //--------------------------------------------------------------------------
    
    private void pswPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswPasswordMouseClicked
        
        if(!"".equals(pswPassword.getText())){
            pswPassword.setText("");
            pswPasswordConfirmed.setText("");
        }
    }//GEN-LAST:event_pswPasswordMouseClicked

    //--------------------------------------------------------------------------
    
    private void pswPasswordConfirmedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswPasswordConfirmedMouseClicked
        
        if(!"".equals(pswPasswordConfirmed.getText())){
            pswPasswordConfirmed.setText("");
        }
    }//GEN-LAST:event_pswPasswordConfirmedMouseClicked

    //--------------------------------------------------------------------------
    
    private void tfNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombresKeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter == '1') || (caracter  == '2') || (caracter  == '3') || (caracter  == '4') || (caracter  == '5') || (caracter  == '6')
            || (caracter  == '7') || (caracter  == '8') || (caracter  == '9') || (caracter  == '0')))
        {
        evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_tfNombresKeyTyped

    //--------------------------------------------------------------------------
    
    private void tfApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidosKeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter == '1') || (caracter  == '2') || (caracter  == '3') || (caracter  == '4') || (caracter  == '5') || (caracter  == '6')
            || (caracter  == '7') || (caracter  == '8') || (caracter  == '9') || (caracter  == '0')))
        {
        evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_tfApellidosKeyTyped

    //--------------------------------------------------------------------------
    
    private void showAdmin(){
        AdminObjectList = controlAdmin.listAdmin();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsAdmin admin : AdminObjectList) {
            String data = "CODIGO VUELO: " + admin.getEmail_admin();
            model.add(index, data);
            index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void cleanRegisterQuestionnaire(){
        tfIdentificacion.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        tfTelefono.setText("");
        tfEmail.setText("");
        tfUsuario.setText("");
        pswPassword.setText("");
        pswPasswordConfirmed.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbMostrar;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBanner;
    private javax.swing.JLabel lbBanner_pnl;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JPasswordField pswPasswordConfirmed;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIdentificacion;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
