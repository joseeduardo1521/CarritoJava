package com.login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Admon extends javax.swing.JFrame {
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    int xMouse, yMouse;
    
    public Admon() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logoname = new javax.swing.JLabel();
        BtnList = new javax.swing.JPanel();
        listTxt = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JPanel();
        salirTxt = new javax.swing.JLabel();
        logoname1 = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        userLabel1 = new javax.swing.JLabel();
        typpe = new javax.swing.JTextField();
        userLabel2 = new javax.swing.JLabel();
        Btncontrol = new javax.swing.JPanel();
        controlTxt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("Tech Preview 1.0");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 150, 20));

        BtnList.setBackground(new java.awt.Color(0, 134, 190));

        listTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        listTxt.setForeground(new java.awt.Color(255, 255, 255));
        listTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listTxt.setText("Lista de usuarios");
        listTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnListLayout = new javax.swing.GroupLayout(BtnList);
        BtnList.setLayout(BtnListLayout);
        BtnListLayout.setHorizontalGroup(
            BtnListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnListLayout.setVerticalGroup(
            BtnListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(BtnList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        BtnSalir.setBackground(new java.awt.Color(0, 134, 190));

        salirTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        salirTxt.setForeground(new java.awt.Color(255, 255, 255));
        salirTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirTxt.setText("Salir");
        salirTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnSalirLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(salirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 30));

        logoname1.setBackground(new java.awt.Color(255, 255, 255));
        logoname1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname1.setForeground(new java.awt.Color(255, 255, 255));
        logoname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname1.setText("LISTA DE OPCIONES");
        bg.add(logoname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 20));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/magia.gif"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 530));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(780, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("Sesión del Admon");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        userTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingrese el nombre de usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 410, 20));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 410, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 410, 20));

        loginBtn.setBackground(new java.awt.Color(0, 134, 190));

        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("Registrar");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 130, 40));

        NameTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NameTxt.setForeground(new java.awt.Color(204, 204, 204));
        NameTxt.setText("Ingrese el nombre");
        NameTxt.setBorder(null);
        NameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NameTxtMousePressed(evt);
            }
        });
        bg.add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 410, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 410, 20));

        userLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel1.setText("NOMBRE");
        bg.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        typpe.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        typpe.setForeground(new java.awt.Color(204, 204, 204));
        typpe.setText("Ingrese tipo");
        typpe.setBorder(null);
        typpe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                typpeMousePressed(evt);
            }
        });
        bg.add(typpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 410, 30));

        userLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel2.setText("Tipo usuario");
        bg.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        Btncontrol.setBackground(new java.awt.Color(0, 134, 190));

        controlTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        controlTxt.setForeground(new java.awt.Color(255, 255, 255));
        controlTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        controlTxt.setText("Control");
        controlTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        controlTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                controlTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                controlTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtncontrolLayout = new javax.swing.GroupLayout(Btncontrol);
        Btncontrol.setLayout(BtncontrolLayout);
        BtncontrolLayout.setHorizontalGroup(
            BtncontrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtncontrolLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(controlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        BtncontrolLayout.setVerticalGroup(
            BtncontrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(Btncontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 410, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        //javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + userTxt.getText() + "\nContraseña: " + String.valueOf(passTxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        //Soy el boton de registrar
try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO usuarios (nombre,usuario,pass,tipousuario) VALUE (?,?,?,?)");
            pps.setString(1, NameTxt.getText());
            pps.setString(2, userTxt.getText());
            pps.setString(3, passTxt.getText());
            pps.setString(4, typpe.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
            Limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(Admon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void listTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTxtMouseClicked
        // TODO add your handling code here:
        //soy el boton de la listas
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: ", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
          Tblas form=new Tblas();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listTxtMouseClicked

    private void listTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_listTxtMouseEntered

    private void listTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_listTxtMouseExited

    private void controlTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMouseClicked
        // TODO add your handling code here:
        //Soy el boton de control
          javax.swing.JOptionPane.showMessageDialog(this, "Control ", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        Tblas_1 forme=new Tblas_1();
        forme.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_controlTxtMouseClicked

    private void controlTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_controlTxtMouseEntered

    private void controlTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_controlTxtMouseExited

    private void NameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtMousePressed

    private void typpeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typpeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_typpeMousePressed

    private void salirTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseClicked
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this, "Hasta pronto ", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        Login Kenji=new Login();
        Kenji.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirTxtMouseClicked

    private void salirTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_salirTxtMouseEntered

    private void salirTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salirTxtMouseExited

    void Limpiar(){
        passTxt.setText("");
        NameTxt.setText("");
        userTxt.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnList;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JPanel Btncontrol;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JLabel controlTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel listTxt;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel logoname1;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel salirTxt;
    private javax.swing.JLabel title;
    private javax.swing.JTextField typpe;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
