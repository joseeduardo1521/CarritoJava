package com.login;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Map extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Map() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingLabel = new javax.swing.JLabel();
        logoname2 = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        logoname3 = new javax.swing.JLabel();
        logoname1 = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("NN");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/MALC.gif"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 100, 50));

        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logoajustado.png"))); // NOI18N
        bg.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 230, 360));
        bg.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 516, 730, -1));

        LoadingLabel.setBackground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, 20));

        logoname2.setBackground(new java.awt.Color(255, 255, 255));
        logoname2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        logoname2.setForeground(new java.awt.Color(255, 255, 255));
        logoname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname2.setText("Tech Preview 1.0");
        bg.add(logoname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        LoadingValue.setBackground(new java.awt.Color(255, 255, 255));
        LoadingValue.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 50, 20));

        logoname3.setBackground(new java.awt.Color(255, 255, 255));
        logoname3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname3.setForeground(new java.awt.Color(255, 255, 255));
        logoname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname3.setText("Nombre del equipo");
        bg.add(logoname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 300, 20));

        logoname1.setBackground(new java.awt.Color(255, 255, 255));
        logoname1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname1.setForeground(new java.awt.Color(255, 255, 255));
        logoname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname1.setText("Nombre del proyecto");
        bg.add(logoname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 300, 20));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/potatzio.jpg"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 530));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(770, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

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

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Map().setVisible(true);
            }
        });
        
        Map sp = new Map();
        sp.setVisible(true);
       
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.LoadingValue.setText(i + "%");
                if(i==10){
                   sp.LoadingLabel.setText("Conectando con Arduino");
                }        
                if(i==20){
                   sp.LoadingLabel.setText("Cargando Recursos...");
                }
                 if(i==60){
                   sp.LoadingLabel.setText("Conectando con SQL...");
                } 
                  if(i==80){
                   sp.LoadingLabel.setText("Iniciando App...");
                } 
                  sp.LoadingBar.setValue(i);
            }
          Login fr= new Login();
          sp.setVisible(false);
          fr.setVisible(true);
          
        }   catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
            
        }    
                
                
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logoname1;
    private javax.swing.JLabel logoname2;
    private javax.swing.JLabel logoname3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
