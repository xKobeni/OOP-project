package project_design;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class View_Event extends javax.swing.JFrame {

    int tuser = 1; // 0 = student 1 = admin 
    public String SUrl = "jdbc:MySQL://localhost:3306/java_users_data";
    public String SUser = "root";
    public String SPass = "";
    
    Connection con = null; 
    Statement st = null; 
    ResultSet rs = null;
    
    public View_Event() {
        initComponents();
        Seticon();
        showevents();
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
        jSeparator1 = new javax.swing.JSeparator();
        Right_Panel = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        avail = new javax.swing.JLabel();
        upcoming = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Location = new javax.swing.JLabel();
        Details = new javax.swing.JLabel();
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
        event_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        event_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_btnMouseClicked(evt);
            }
        });

        anounce_btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        anounce_btn.setForeground(new java.awt.Color(255, 255, 255));
        anounce_btn.setText("VIEW ANNOUNCEMENTS");
        anounce_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anounce_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anounce_btnMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Left_PanelLayout = new javax.swing.GroupLayout(Left_Panel);
        Left_Panel.setLayout(Left_PanelLayout);
        Left_PanelLayout.setHorizontalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home_btn)
                    .addComponent(anounce_btn)
                    .addGroup(Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(event_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Left_PanelLayout.setVerticalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_PanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(home_btn)
                .addGap(28, 28, 28)
                .addComponent(event_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(anounce_btn)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        BackPanel.add(Left_Panel);
        Left_Panel.setBounds(0, 0, 250, 573);

        Right_Panel.setBackground(new java.awt.Color(217, 217, 217, 200));
        Right_Panel.setPreferredSize(new java.awt.Dimension(830, 573));

        text1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        text1.setText("Events");

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));
        jPanel1.setLayout(null);

        avail.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        avail.setText("NO AVAILABLE EVENT");
        jPanel1.add(avail);
        avail.setBounds(160, 160, 380, 60);

        upcoming.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        upcoming.setLayout(null);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setText("Name");
        upcoming.add(Title);
        Title.setBounds(60, 10, 220, 25);

        Date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Date.setText("Date");
        upcoming.add(Date);
        Date.setBounds(60, 50, 270, 22);

        Time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Time.setText("Time");
        upcoming.add(Time);
        Time.setBounds(60, 80, 270, 22);

        Location.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Location.setText("Location");
        upcoming.add(Location);
        Location.setBounds(60, 110, 270, 22);

        Details.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Details.setText("View Details");
        Details.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailsMouseClicked(evt);
            }
        });
        upcoming.add(Details);
        Details.setBounds(500, 110, 110, 27);

        jPanel1.add(upcoming);
        upcoming.setBounds(40, 10, 660, 150);

        javax.swing.GroupLayout Right_PanelLayout = new javax.swing.GroupLayout(Right_Panel);
        Right_Panel.setLayout(Right_PanelLayout);
        Right_PanelLayout.setHorizontalGroup(
            Right_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_PanelLayout.createSequentialGroup()
                .addGroup(Right_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right_PanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Right_PanelLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(text1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        Right_PanelLayout.setVerticalGroup(
            Right_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right_PanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_event_btnMouseClicked

    private void anounce_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anounce_btnMouseClicked

        this.dispose();
        View_Announcements viewannc = new View_Announcements();
        viewannc.setVisible(true);
        viewannc.pack();
        viewannc.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_anounce_btnMouseClicked

    private void DetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsMouseClicked
        Show_Details detail = new Show_Details();
        detail.setVisible(true);
        detail.pack();
        detail.setLocationRelativeTo(null);
    }//GEN-LAST:event_DetailsMouseClicked

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
            java.util.logging.Logger.getLogger(View_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new View_Event().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    public javax.swing.JLabel Date;
    private javax.swing.JLabel Details;
    private javax.swing.JPanel Left_Panel;
    public javax.swing.JLabel Location;
    private javax.swing.JPanel Right_Panel;
    public javax.swing.JLabel Time;
    public javax.swing.JLabel Title;
    private javax.swing.JPanel Top_Panel;
    private javax.swing.JLabel anounce_btn;
    private javax.swing.JLabel avail;
    private javax.swing.JLabel backimg;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel toptext1;
    private javax.swing.JLabel toptext2;
    public javax.swing.JPanel upcoming;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }

    private void showevents() {
        int found = 0; 
        String query; 
            
        Title.setVisible(false);
        Date.setVisible(false);
        Time.setVisible(false);
        Location.setVisible(false);
        Details.setVisible(false);
        upcoming.setVisible(false);
   
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            
            query = "SELECT * FROM admin_data_table WHERE 3";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                found = 1; 
                String QTitle = rs.getString("Title");
                String QDate = rs.getString("Date");
                String QTime = rs.getString("Time");
                String QLocation = rs.getString("Location");
                
                if(found == 1){
                    
                    Title.setVisible(true);
                    Date.setVisible(true);
                    Time.setVisible(true);
                    Location.setVisible(true);
                    Details.setVisible(true);
                    
                    Title.setText(QTitle);
                    Date.setText("Date: " + QDate);
                    Time.setText("Time: " + QTime);
                    Location.setText("Location: " +QLocation);
                    
                    avail.setVisible(false);
                    upcoming.setVisible(true);
                }
                else{
                    Title.setVisible(false);
                    Date.setVisible(false);
                    Time.setVisible(false);
                    Location.setVisible(false);
                    Details.setVisible(false);

                    avail.setVisible(true);
                    upcoming.setVisible(false);
                }
            }  
         con.close();
        }
        catch(Exception e){
        System.out.println("Error!" + e.getMessage()); 
        }
    }
}
