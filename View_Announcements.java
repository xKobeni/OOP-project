package project_design;

import java.awt.Toolkit;

public class View_Announcements extends javax.swing.JFrame {

    Login gh = new Login();
    
    int tuser = 1; // 0= student 1 = admin 
    
    public View_Announcements() {
        initComponents();
        Seticon();
        showannounce();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        BackPanel = new javax.swing.JPanel();
        Top_Panel = new javax.swing.JPanel();
        toptext1 = new javax.swing.JLabel();
        toptext2 = new javax.swing.JLabel();
        Left_Panel = new javax.swing.JPanel();
        home_btn = new javax.swing.JLabel();
        event_btn = new javax.swing.JLabel();
        anounce_btn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Right_Panel = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        recent = new javax.swing.JPanel();
        aTitle = new javax.swing.JLabel();
        aDate = new javax.swing.JLabel();
        aTime = new javax.swing.JLabel();
        aLocation = new javax.swing.JLabel();
        aDetails = new javax.swing.JLabel();
        avail = new javax.swing.JLabel();
        backimg = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESAS - Main Menu");
        setResizable(false);

        BackPanel.setPreferredSize(new java.awt.Dimension(1080, 573));
        BackPanel.setLayout(null);

        Top_Panel.setBackground(new java.awt.Color(195, 40, 30));
        Top_Panel.setPreferredSize(new java.awt.Dimension(1080, 70));

        toptext1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        toptext1.setForeground(new java.awt.Color(255, 255, 255));
        toptext1.setText("Batangas State University");

        toptext2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        toptext2.setForeground(new java.awt.Color(255, 255, 255));
        toptext2.setText("Event Scheduling and Announcement System");
        toptext2.setToolTipText("");

        javax.swing.GroupLayout Top_PanelLayout = new javax.swing.GroupLayout(Top_Panel);
        Top_Panel.setLayout(Top_PanelLayout);
        Top_PanelLayout.setHorizontalGroup(
            Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Top_PanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toptext1)
                    .addComponent(toptext2))
                .addContainerGap(662, Short.MAX_VALUE))
        );
        Top_PanelLayout.setVerticalGroup(
            Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Top_PanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(toptext1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toptext2)
                .addContainerGap())
        );

        BackPanel.add(Top_Panel);
        Top_Panel.setBounds(0, 0, 1080, 70);

        Left_Panel.setBackground(new java.awt.Color(117, 117, 117, 240));
        Left_Panel.setPreferredSize(new java.awt.Dimension(250, 573));

        home_btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        home_btn.setForeground(new java.awt.Color(255, 255, 255));
        home_btn.setText("HOME");
        home_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_btnMouseClicked(evt);
            }
        });

        event_btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        event_btn.setForeground(new java.awt.Color(255, 255, 255));
        event_btn.setText("VIEW EVENTS");
        event_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        event_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_btnMouseClicked(evt);
            }
        });

        anounce_btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        anounce_btn.setForeground(new java.awt.Color(255, 255, 255));
        anounce_btn.setText("VIEW ANNOUNCEMENTS");
        anounce_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anounce_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anounce_btnMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Left_PanelLayout = new javax.swing.GroupLayout(Left_Panel);
        Left_Panel.setLayout(Left_PanelLayout);
        Left_PanelLayout.setHorizontalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(home_btn)
                    .addComponent(anounce_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(event_btn)
                    .addComponent(jSeparator2))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Left_PanelLayout.setVerticalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_PanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(home_btn)
                .addGap(28, 28, 28)
                .addComponent(event_btn)
                .addGap(34, 34, 34)
                .addComponent(anounce_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        BackPanel.add(Left_Panel);
        Left_Panel.setBounds(0, 0, 250, 573);

        Right_Panel.setBackground(new java.awt.Color(217, 217, 217, 200));
        Right_Panel.setPreferredSize(new java.awt.Dimension(830, 573));

        text1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        text1.setText("Announcements");

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));
        jPanel1.setLayout(null);

        recent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        recent.setLayout(null);

        aTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aTitle.setText("Name");
        recent.add(aTitle);
        aTitle.setBounds(70, 10, 220, 25);

        aDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        aDate.setText("Date");
        recent.add(aDate);
        aDate.setBounds(70, 50, 270, 22);

        aTime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        aTime.setText("Time");
        recent.add(aTime);
        aTime.setBounds(70, 80, 270, 22);

        aLocation.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        aLocation.setText("Location");
        recent.add(aLocation);
        aLocation.setBounds(70, 110, 270, 22);

        aDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        aDetails.setText("View Details");
        aDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        aDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aDetailsMouseClicked(evt);
            }
        });
        recent.add(aDetails);
        aDetails.setBounds(490, 110, 110, 27);

        jPanel1.add(recent);
        recent.setBounds(30, 10, 660, 150);

        avail.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        avail.setText("NO AVAILABLE ANNOUNCEMENTS");
        jPanel1.add(avail);
        avail.setBounds(70, 180, 610, 60);

        javax.swing.GroupLayout Right_PanelLayout = new javax.swing.GroupLayout(Right_Panel);
        Right_Panel.setLayout(Right_PanelLayout);
        Right_PanelLayout.setHorizontalGroup(
            Right_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_PanelLayout.createSequentialGroup()
                .addGroup(Right_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right_PanelLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(text1))
                    .addGroup(Right_PanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        Right_PanelLayout.setVerticalGroup(
            Right_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right_PanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
        );

        BackPanel.add(Right_Panel);
        Right_Panel.setBounds(250, 0, 830, 573);

        backimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_design/bglipa.png"))); // NOI18N
        BackPanel.add(backimg);
        backimg.setBounds(0, 0, 1080, 573);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
       if(tuser == 1){
        this.dispose();
        Admin_Menu homeevnt = new Admin_Menu();
        homeevnt.setVisible(true);
        homeevnt.pack();
        homeevnt.setLocationRelativeTo(null);
        }
        else{
        this.dispose();
        Student_Menu homeevnt = new Student_Menu();
        homeevnt.setVisible(true);
        homeevnt.pack();
        homeevnt.setLocationRelativeTo(null);   
        }
    }//GEN-LAST:event_home_btnMouseClicked

    private void event_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseClicked
        View_Event viewevnt = new View_Event();
        viewevnt.setVisible(true);
        viewevnt.pack();
        viewevnt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_event_btnMouseClicked

    private void anounce_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anounce_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_anounce_btnMouseClicked

    private void aDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aDetailsMouseClicked
        Show_Details2 detail = new Show_Details2();
        detail.setVisible(true);
        detail.pack();
        detail.setLocationRelativeTo(null);
    }//GEN-LAST:event_aDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(View_Announcements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Announcements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Announcements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Announcements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editaor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Announcements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private javax.swing.JPanel Left_Panel;
    private javax.swing.JPanel Right_Panel;
    private javax.swing.JPanel Top_Panel;
    public javax.swing.JLabel aDate;
    private javax.swing.JLabel aDetails;
    public javax.swing.JLabel aLocation;
    public javax.swing.JLabel aTime;
    public javax.swing.JLabel aTitle;
    private javax.swing.JLabel anounce_btn;
    public javax.swing.JLabel avail;
    private javax.swing.JLabel backimg;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.PopupMenu popupMenu1;
    public javax.swing.JPanel recent;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel toptext1;
    private javax.swing.JLabel toptext2;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }

    private void showannounce() {
        int found = 1; 
            
        aTitle.setVisible(false);
        aDate.setVisible(false);
        aTime.setVisible(false);
        aLocation.setVisible(false);
        aDetails.setVisible(false);
        recent.setVisible(false);
        
        if(found == 1){ // change to 1 to show 
            aTitle.setVisible(true);
            aDate.setVisible(true);
            aTime.setVisible(true);
            aLocation.setVisible(true);
            aDetails.setVisible(true);
                    
            aTitle.setText("Math Finals");
            aDate.setText("Date: December 10 2023");
            aTime.setText("Time: 7:00 am - 10:00 am");
            aLocation.setText("Location: Room 403");
            
            recent.setVisible(true);
            
            avail.setVisible(false);
            
        }
        else{
            aTitle.setVisible(false);
            aDate.setVisible(false);
            aTime.setVisible(false);
            aLocation.setVisible(false);
            aDetails.setVisible(false);

            avail.setVisible(true);
            recent.setVisible(false);
        }
    }
}
