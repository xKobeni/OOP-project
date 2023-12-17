package project_design;

import java.awt.*;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class View_my_Events extends javax.swing.JFrame {
    
    public String SUrl = "jdbc:MySQL://localhost:3306/java_users_data";
    public String SUser = "root";
    public String SPass = "";
    
    Connection con = null; 
    Statement st = null; 
    ResultSet rs = null;
    
    public View_my_Events() {

        initComponents();
        seticon();
        loaddatas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backpanel = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        toptext1 = new javax.swing.JLabel();
        toptext2 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        centerpanel = new javax.swing.JPanel();
        toptext = new javax.swing.JLabel();
        Show = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DataText = new javax.swing.JLabel();
        Refresh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create New Event/Announcement");
        setResizable(false);

        backpanel.setPreferredSize(new java.awt.Dimension(1080, 573));
        backpanel.setLayout(null);

        toppanel.setBackground(new java.awt.Color(195, 40, 30));
        toppanel.setPreferredSize(new java.awt.Dimension(1080, 70));

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

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toptext1)
                    .addComponent(toptext2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 551, Short.MAX_VALUE)
                .addComponent(User)
                .addGap(40, 40, 40))
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addGroup(toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toppanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(toptext1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toptext2))
                    .addGroup(toppanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(User)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backpanel.add(toppanel);
        toppanel.setBounds(0, 0, 1080, 70);

        centerpanel.setBackground(new java.awt.Color(217, 217, 217, 200));
        centerpanel.setPreferredSize(new java.awt.Dimension(1080, 573));
        centerpanel.setLayout(null);

        toptext.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        toptext.setText("My Event/Announcement List");
        centerpanel.add(toptext);
        toptext.setBounds(80, 90, 320, 30);

        Show.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Show.setLayout(null);

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setFocusable(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Show.add(delete);
        delete.setBounds(700, 10, 100, 32);

        edit.setBackground(new java.awt.Color(204, 204, 204));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edit.setText("Edit");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setFocusable(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        Show.add(edit);
        edit.setBounds(590, 10, 72, 32);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel1.setText("Back");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Show.add(jLabel1);
        jLabel1.setBounds(30, 0, 50, 50);

        centerpanel.add(Show);
        Show.setBounds(100, 510, 870, 50);

        DataText.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        DataText.setText("No Data");
        centerpanel.add(DataText);
        DataText.setBounds(430, 260, 186, 110);

        Refresh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Refresh.setText("Click to Refresh List");
        Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        centerpanel.add(Refresh);
        Refresh.setBounds(680, 440, 230, 40);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setFocusable(false);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data_ID", "Title", "Date", "Time", "Location"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        //jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(225, 225, 225));

        centerpanel.add(jScrollPane1);
        jScrollPane1.setBounds(100, 130, 870, 380);

        backpanel.add(centerpanel);
        centerpanel.setBounds(0, 0, 1080, 573);

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_design/bglipa.png"))); // NOI18N
        backpanel.add(bgimg);
        bgimg.setBounds(0, 0, 1080, 573);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
       String response = JOptionPane.showInputDialog(this, "Enter data_ID you want to Edit", "Edit Event/Announcement", JOptionPane.OK_CANCEL_OPTION);
       String dataID = response;
       
       try{
            String query; 
            int Found = 0;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
             
            query = "SELECT * FROM admin_data_table WHERE data_ID= '"+response+"'";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                rs.getString("data_ID");
                Found = 1;
            }
            if(Found == 1){
                showMessageDialog(null, "Data Found");
                
                this.dispose();
                Create_New update = new Create_New();
                
                update.setVisible(true);
                update.pack();
                update.setLocationRelativeTo(null);
                
                update.backbtn.setVisible(false);
                update.cretebtn.setVisible(false);
                
                update.cancel.setVisible(true);
                update.Save.setVisible(true);
                update.toptext.setText("Edit Event/Announcement");
                
            }
            else{
                showMessageDialog(null, "Data not Found");
            }
       }
       catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
       }
       
    }//GEN-LAST:event_editActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Admin_Menu crete = new Admin_Menu();
        crete.setVisible(true);
        crete.pack();
        crete.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        String data, query; 
        int notFound = 0;
        
        String response = JOptionPane.showInputDialog(this, "Enter data_ID you want to delete", "Delete Event/Announcement", JOptionPane.OK_CANCEL_OPTION);
        data = response;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            
            query = "SELECT * FROM admin_data_table WHERE data_ID = '"+data+"'";
            rs = st.executeQuery(query);
            
            while(rs.next()){
            notFound = 1;                     
           }
            
            if(notFound == 1){
                showMessageDialog(null, "Data_ID Found!");
                
                try{
                query = "DELETE FROM admin_data_table WHERE data_ID = '"+data+"'";
                st.executeUpdate(query);
                
                showMessageDialog(null, "Successfully Deleted!");
                
                Refresh.setVisible(true);
   
                }
                catch(Exception e){
                System.out.println("Error!" + e.getMessage());
             }    
            }
            else{
                showMessageDialog(null, "Data_ID not Found!");
            }
        con.close();    
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage());
        }       
    }//GEN-LAST:event_deleteActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        this.dispose();
        View_my_Events eve = new View_my_Events();
        eve.setVisible(true);
        eve.pack();
        eve.setLocationRelativeTo(null);
    }//GEN-LAST:event_RefreshMouseClicked

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
            java.util.logging.Logger.getLogger(View_my_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_my_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_my_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_my_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_my_Events().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel DataText;
    public javax.swing.JLabel Refresh;
    private javax.swing.JPanel Show;
    public javax.swing.JLabel User;
    private javax.swing.JPanel backpanel;
    private javax.swing.JLabel bgimg;
    private javax.swing.JPanel centerpanel;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel toppanel;
    private javax.swing.JLabel toptext;
    private javax.swing.JLabel toptext1;
    private javax.swing.JLabel toptext2;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }
    
    private void loaddatas(){
        int q, found = 0; 
        String query; 
        
        Refresh.setVisible(false);
     
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            
            query = "SELECT * FROM admin_data_table";
            rs = st.executeQuery(query);
            //ResultSetMetaData rss = rs.getMetaData();
            //q = rss.getColumnCount();
            
            
            //df.setRowCount(0);
            while(rs.next()){
                found = 1; 
                String id = String.valueOf(rs.getInt("data_ID")); 
                String Title = rs.getString("Title");
                String Date = rs.getString("Date");
                String Time = rs.getString("Time");
                String Location = rs.getString("Location");
                
                String tbData[] = {id, Title, Date, Time, Location};
                   DefaultTableModel df = (DefaultTableModel)jTable1.getModel();      
                   df.addRow(tbData);
                
                /*Vector v2 = new Vector();
                for(int a = 1; a<=q; a++){
                    v2.add(rs.getString("data_ID"));
                    v2.add(rs.getString("Title"));
                    v2.add(rs.getString("Date"));
                    v2.add(rs.getString("Time"));
                    v2.add(rs.getString("Location"));*/
                }
                //df.addRow(v2);           
           con.close(); 
           
            if(found == 1){
            DataText.setVisible(false);
            }
        }
        catch(Exception e){
            System.out.println("Error!" + e.getMessage()); 
        }
    }
}


