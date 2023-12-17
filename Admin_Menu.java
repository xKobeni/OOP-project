package project_design;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin_Menu extends javax.swing.JFrame {
    
    public String SUrl = "jdbc:MySQL://localhost:3306/java_users_data";
    public String SUser = "root";
    public String SPass = "";
    
    Connection con = null; 
    Statement st = null; 
    ResultSet rs = null;
    
    public Admin_Menu() {
        initComponents();
        Seticon();
        showevents();
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
        User = new javax.swing.JLabel();
        Left_Panel = new javax.swing.JPanel();
        home_btn = new javax.swing.JLabel();
        event_btn = new javax.swing.JLabel();
        anounce_btn = new javax.swing.JLabel();
        exit_btn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Right_Panel = new javax.swing.JPanel();
        create_btn = new javax.swing.JButton();
        view_btn = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        upcoming = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Location = new javax.swing.JLabel();
        Details = new javax.swing.JLabel();
        disp = new javax.swing.JLabel();
        recent = new javax.swing.JPanel();
        aTitle = new javax.swing.JLabel();
        aDate = new javax.swing.JLabel();
        aTime = new javax.swing.JLabel();
        aLocation = new javax.swing.JLabel();
        aDetails = new javax.swing.JLabel();
        adisp = new javax.swing.JLabel();
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

        User.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("admin");

        javax.swing.GroupLayout Top_PanelLayout = new javax.swing.GroupLayout(Top_Panel);
        Top_Panel.setLayout(Top_PanelLayout);
        Top_PanelLayout.setHorizontalGroup(
            Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Top_PanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toptext1)
                    .addComponent(toptext2))
                .addGap(551, 551, 551)
                .addComponent(User)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        Top_PanelLayout.setVerticalGroup(
            Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Top_PanelLayout.createSequentialGroup()
                .addGroup(Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Top_PanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(toptext1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toptext2))
                    .addGroup(Top_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(User)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackPanel.add(Top_Panel);
        Top_Panel.setBounds(0, 0, 1080, 70);

        Left_Panel.setBackground(new java.awt.Color(117, 117, 117, 240));
        Left_Panel.setPreferredSize(new java.awt.Dimension(250, 573));

        home_btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        home_btn.setForeground(new java.awt.Color(255, 255, 255));
        home_btn.setText("HOME");
        home_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        anounce_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anounce_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anounce_btnMouseClicked(evt);
            }
        });

        exit_btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        exit_btn.setText("SIGN OUT");
        exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Left_PanelLayout = new javax.swing.GroupLayout(Left_Panel);
        Left_Panel.setLayout(Left_PanelLayout);
        Left_PanelLayout.setHorizontalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_PanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(event_btn)
                        .addComponent(home_btn)
                        .addComponent(anounce_btn)
                        .addComponent(exit_btn))
                    .addGroup(Left_PanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)))
                .addGap(20, 20, 20))
        );
        Left_PanelLayout.setVerticalGroup(
            Left_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_PanelLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(home_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(event_btn)
                .addGap(28, 28, 28)
                .addComponent(anounce_btn)
                .addGap(28, 28, 28)
                .addComponent(exit_btn)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        BackPanel.add(Left_Panel);
        Left_Panel.setBounds(0, 0, 250, 573);

        Right_Panel.setBackground(new java.awt.Color(217, 217, 217, 200));
        Right_Panel.setPreferredSize(new java.awt.Dimension(830, 573));
        Right_Panel.setLayout(null);

        create_btn.setBackground(new java.awt.Color(204, 204, 204));
        create_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        create_btn.setText("Create New Event/Announcement");
        create_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_btn.setFocusable(false);
        create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btnActionPerformed(evt);
            }
        });
        Right_Panel.add(create_btn);
        create_btn.setBounds(489, 97, 280, 29);
        create_btn.getAccessibleContext().setAccessibleName("create_btn");

        view_btn.setBackground(new java.awt.Color(204, 204, 204));
        view_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        view_btn.setText("View My Event/Announcement");
        view_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_btn.setFocusable(false);
        view_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_btnActionPerformed(evt);
            }
        });
        Right_Panel.add(view_btn);
        view_btn.setBounds(61, 97, 250, 29);

        text1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text1.setText("Upcoming Events");
        Right_Panel.add(text1);
        text1.setBounds(162, 144, 160, 25);

        text2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text2.setText("Recent Announcements");
        Right_Panel.add(text2);
        text2.setBounds(162, 361, 203, 25);

        upcoming.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        upcoming.setLayout(null);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setText("Name");
        upcoming.add(Title);
        Title.setBounds(50, 13, 220, 25);

        Date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Date.setText("Date");
        upcoming.add(Date);
        Date.setBounds(50, 50, 270, 22);

        Time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Time.setText("Time");
        upcoming.add(Time);
        Time.setBounds(50, 84, 270, 22);

        Location.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Location.setText("Location");
        upcoming.add(Location);
        Location.setBounds(50, 117, 270, 22);

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
        Details.setBounds(326, 117, 110, 27);

        disp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        disp.setText("No Upcoming Events");
        upcoming.add(disp);
        disp.setBounds(60, 60, 370, 48);

        Right_Panel.add(upcoming);
        upcoming.setBounds(160, 180, 480, 168);

        recent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        recent.setLayout(null);

        aTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aTitle.setText("Name");
        recent.add(aTitle);
        aTitle.setBounds(50, 13, 220, 25);

        aDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        aDate.setText("Date");
        recent.add(aDate);
        aDate.setBounds(50, 50, 270, 22);

        aTime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        aTime.setText("Time");
        recent.add(aTime);
        aTime.setBounds(50, 84, 270, 22);

        aLocation.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        aLocation.setText("Location");
        recent.add(aLocation);
        aLocation.setBounds(50, 117, 270, 22);

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
        aDetails.setBounds(326, 117, 110, 27);

        adisp.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        adisp.setText("No Recent Announcements");
        recent.add(adisp);
        adisp.setBounds(50, 60, 390, 48);

        Right_Panel.add(recent);
        recent.setBounds(160, 400, 480, 168);

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

    private void create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_btnActionPerformed
        this.dispose();
        Create_New crete = new Create_New(); 
        crete.setVisible(true);
        crete.pack();
        crete.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_create_btnActionPerformed

    private void view_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_btnActionPerformed
        this.dispose();
        View_my_Events crete = new View_my_Events(); 
        crete.setVisible(true);
        crete.pack();
        crete.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_view_btnActionPerformed

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home_btnMouseClicked

    private void event_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseClicked
        this.dispose();
        View_Event viewevnt = new View_Event();
        viewevnt.setVisible(true);
        viewevnt.pack();
        viewevnt.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_event_btnMouseClicked

    private void anounce_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anounce_btnMouseClicked
        this.dispose();
        View_Announcements viewannc = new View_Announcements();
        viewannc.setVisible(true);
        viewannc.pack();
        viewannc.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_anounce_btnMouseClicked

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        
        int response = JOptionPane.showConfirmDialog(this, "Continue to SignOut?", "Select Option", JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION){
        this.dispose();
        Login logFrame = new Login();
        logFrame.setVisible(true);
        logFrame.pack();
        logFrame.setLocationRelativeTo(null);    
        }
        
    }//GEN-LAST:event_exit_btnMouseClicked

    private void DetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsMouseClicked
        Show_Details detail = new Show_Details(); 
        detail.setVisible(true);
        detail.pack();
        detail.setLocationRelativeTo(null);
    }//GEN-LAST:event_DetailsMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Menu().setVisible(true);
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
    public javax.swing.JLabel User;
    public javax.swing.JLabel aDate;
    private javax.swing.JLabel aDetails;
    public javax.swing.JLabel aLocation;
    public javax.swing.JLabel aTime;
    public javax.swing.JLabel aTitle;
    public javax.swing.JLabel adisp;
    private javax.swing.JLabel anounce_btn;
    private javax.swing.JLabel backimg;
    private javax.swing.JButton create_btn;
    public javax.swing.JLabel disp;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.PopupMenu popupMenu1;
    public javax.swing.JPanel recent;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel toptext1;
    private javax.swing.JLabel toptext2;
    public javax.swing.JPanel upcoming;
    private javax.swing.JButton view_btn;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }
    
    private void showevents(){
        int found = 0; 
        String query; 
            
        Title.setVisible(false);
        Date.setVisible(false);
        Time.setVisible(false);
        Location.setVisible(false);
        Details.setVisible(false);
   
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            
            query = "SELECT * FROM admin_data_table WHERE 3";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                found = 1; // change to 0 
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
                    
                    disp.setVisible(false);
                }
                else{
                    Title.setVisible(false);
                    Date.setVisible(false);
                    Time.setVisible(false);
                    Location.setVisible(false);
                    Details.setVisible(false);

                    disp.setVisible(true);
                }
            }  
         con.close();
        }
        catch(Exception e){
        System.out.println("Error!" + e.getMessage()); 
    }
  }

    private void showannounce() {
        
        int found = 0; 
        String query; 
            
        aTitle.setVisible(false);
        aDate.setVisible(false);
        aTime.setVisible(false);
        aLocation.setVisible(false);
        aDetails.setVisible(false);
                    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            
            query = "SELECT * FROM admin_data_table";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                found = 1; 
                String QTitle = rs.getString("Title");
                String QDate = rs.getString("Date");
                String QTime = rs.getString("Time");
                String QLocation = rs.getString("Location");
                
                if(found == 1){// change to 0 and 1 to show
                    
                    aTitle.setVisible(true);
                    aDate.setVisible(true);
                    aTime.setVisible(true);
                    aLocation.setVisible(true);
                    aDetails.setVisible(true);
                    
                    aTitle.setText("Math Finals");
                    aDate.setText("Date: December 10 2023");
                    aTime.setText("Time: 7:00 am - 10:00 am");
                    aLocation.setText("Location: Room 403");
                    
                    adisp.setVisible(false);
                }
                
                else{
                    aTitle.setVisible(false);
                    aDate.setVisible(false);
                    aTime.setVisible(false);
                    aLocation.setVisible(false);
                    aDetails.setVisible(false);

                    adisp.setVisible(true);
                }
            }  
         con.close();
        }
        catch(Exception e){
        System.out.println("Error!" + e.getMessage()); 
    }
    
    }
}

