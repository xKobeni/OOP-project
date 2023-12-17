package project_design;

import java.awt.Toolkit;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Create_New extends javax.swing.JFrame{
    
    private String A_admin; 
    private String A_adminpass; 
    private String A_adminID; 
    
    public Create_New(String A_admin, String A_adminpass,String A_adminID){
        
        this.A_admin = A_admin; 
        this.A_adminpass = A_adminpass; 
        this.A_adminID = A_adminID; 
    }
    
    public String getAdmin(){return A_admin;}
    public void setAdmin(String A_admin){this.A_admin = A_admin;}
    
    /*
    admindatas admindata;
    
    public void setdata(admindatas admindata){
        this.admindata = admindata;
        User.setText(admindata.getadmin());
        System.out.println(admindata.getadmin());      
    }
    
    public admindatas getdata(){ // need to fix this 
        return admindata;
    }   
    */
    
    String path = null; 
    String fkadminID;
    File file = null;
    String SUrl, SUser, SPass; 
    byte[] pimg = null; 
    
    public Create_New() {
        
        SUrl = "jdbc:MySQL://localhost:3306/java_users_data";
        SUser = "root";
        SPass = "";   
        
        initComponents();
        seticon();
        update();
        
        Save.setVisible(false);
        cancel.setVisible(false);
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
        titletext = new javax.swing.JLabel();
        titlefield = new javax.swing.JTextField();
        Desctext = new javax.swing.JLabel();
        Descpanel = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();
        Datetext = new javax.swing.JLabel();
        datefield = new javax.swing.JTextField();
        loctext = new javax.swing.JLabel();
        locfield = new javax.swing.JTextField();
        imgtext = new javax.swing.JLabel();
        filefield = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        cretebtn = new javax.swing.JButton();
        timefield = new javax.swing.JTextField();
        loctext1 = new javax.swing.JLabel();
        Selecttype = new javax.swing.JComboBox<>();
        C_File = new javax.swing.JButton();
        selecttext = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        Save = new javax.swing.JButton();
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toptext2)
                    .addComponent(toptext1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 551, Short.MAX_VALUE)
                .addComponent(User)
                .addGap(40, 40, 40))
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppanelLayout.createSequentialGroup()
                        .addComponent(User)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppanelLayout.createSequentialGroup()
                        .addComponent(toptext1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toptext2)
                        .addContainerGap())))
        );

        backpanel.add(toppanel);
        toppanel.setBounds(0, 0, 1080, 70);

        centerpanel.setBackground(new java.awt.Color(217, 217, 217, 230));
        centerpanel.setPreferredSize(new java.awt.Dimension(1080, 573));
        centerpanel.setLayout(null);

        toptext.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        toptext.setText("Create New Event/Announcement");
        centerpanel.add(toptext);
        toptext.setBounds(59, 100, 357, 30);

        titletext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titletext.setText("Title");
        centerpanel.add(titletext);
        titletext.setBounds(94, 148, 40, 25);

        titlefield.setBackground(new java.awt.Color(234, 234, 234));
        titlefield.setColumns(20);
        titlefield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titlefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        centerpanel.add(titlefield);
        titlefield.setBounds(94, 179, 444, 31);

        Desctext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Desctext.setText("Description");
        centerpanel.add(Desctext);
        Desctext.setBounds(94, 232, 100, 25);

        Descpanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Descpanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Desc.setBackground(new java.awt.Color(234, 234, 234));
        Desc.setColumns(20);
        Desc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Desc.setRows(5);
        Desc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Descpanel.setViewportView(Desc);

        centerpanel.add(Descpanel);
        Descpanel.setBounds(94, 263, 444, 95);

        Datetext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Datetext.setText("Date");
        centerpanel.add(Datetext);
        Datetext.setBounds(94, 376, 40, 25);

        datefield.setBackground(new java.awt.Color(234, 234, 234));
        datefield.setColumns(20);
        datefield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        datefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        centerpanel.add(datefield);
        datefield.setBounds(94, 407, 444, 31);

        loctext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loctext.setText("Location");
        centerpanel.add(loctext);
        loctext.setBounds(626, 252, 70, 25);

        locfield.setBackground(new java.awt.Color(234, 234, 234));
        locfield.setColumns(20);
        locfield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        locfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        centerpanel.add(locfield);
        locfield.setBounds(626, 283, 348, 31);

        imgtext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imgtext.setText("Image");
        centerpanel.add(imgtext);
        imgtext.setBounds(626, 359, 51, 25);

        filefield.setEditable(false);
        filefield.setBackground(new java.awt.Color(234, 234, 234));
        filefield.setColumns(25);
        filefield.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        filefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        centerpanel.add(filefield);
        filefield.setBounds(744, 390, 230, 32);

        backbtn.setBackground(new java.awt.Color(217, 217, 217));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backbtn.setText("Back");
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.setFocusable(false);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        centerpanel.add(backbtn);
        backbtn.setBounds(626, 479, 72, 29);

        cretebtn.setBackground(new java.awt.Color(217, 217, 217));
        cretebtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cretebtn.setText("Create");
        cretebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cretebtn.setFocusable(false);
        cretebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cretebtnActionPerformed(evt);
            }
        });
        centerpanel.add(cretebtn);
        cretebtn.setBounds(884, 479, 90, 29);

        timefield.setBackground(new java.awt.Color(234, 234, 234));
        timefield.setColumns(20);
        timefield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        timefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        timefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timefieldActionPerformed(evt);
            }
        });
        centerpanel.add(timefield);
        timefield.setBounds(626, 179, 348, 31);

        loctext1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loctext1.setText("Time");
        centerpanel.add(loctext1);
        loctext1.setBounds(626, 148, 50, 25);

        Selecttype.setBackground(new java.awt.Color(234, 234, 234));
        Selecttype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Selecttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Announcement", "Event" }));
        Selecttype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Selecttype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Selecttype.setFocusable(false);
        Selecttype.setOpaque(true);
        centerpanel.add(Selecttype);
        Selecttype.setBounds(220, 479, 143, 29);

        C_File.setBackground(new java.awt.Color(204, 204, 204));
        C_File.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        C_File.setText("Choose File");
        C_File.setBorderPainted(false);
        C_File.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C_File.setFocusPainted(false);
        C_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_FileActionPerformed(evt);
            }
        });
        centerpanel.add(C_File);
        C_File.setBounds(626, 390, 120, 32);

        selecttext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selecttext.setText("Choose Type:");
        centerpanel.add(selecttext);
        selecttext.setBounds(94, 483, 108, 25);

        cancel.setBackground(new java.awt.Color(217, 217, 217));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cancel.setText("Cancel");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.setFocusable(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        centerpanel.add(cancel);
        cancel.setBounds(626, 479, 100, 29);

        Save.setBackground(new java.awt.Color(217, 217, 217));
        Save.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.setFocusable(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        centerpanel.add(Save);
        Save.setBounds(884, 479, 90, 29);

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

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        
        if(!"".equals(titlefield.getText()) || !"".equals(Desc.getText()) || !"".equals(datefield.getText()) || !"".equals(timefield.getText()) || !"".equals(locfield.getText()) ){
            int response = JOptionPane.showConfirmDialog(this, "Continue to Discard?", "Item will not be save", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION){
            this.dispose();
            Admin_Menu men = new Admin_Menu();
            men.setVisible(true);
            men.pack();
            men.setLocationRelativeTo(null);
            }
        } 
        else {
        this.dispose();
        Admin_Menu men = new Admin_Menu(); 
        men.setVisible(true);
        men.pack();
        men.setLocationRelativeTo(null);  
        } 
    }//GEN-LAST:event_backbtnActionPerformed

    private void cretebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cretebtnActionPerformed
        
        runcrete();
        
    }//GEN-LAST:event_cretebtnActionPerformed

    private void timefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timefieldActionPerformed

    private void C_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_FileActionPerformed
        JFileChooser imgfile = new JFileChooser(); 
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
        imgfile.addChoosableFileFilter(fnwf);
        int load = imgfile.showOpenDialog(null);
        
        if (load == JFileChooser.APPROVE_OPTION) {
            file = imgfile.getSelectedFile();
            path = file.getAbsolutePath();
            
            filefield.setText(path);
         }
        
    }//GEN-LAST:event_C_FileActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        this.dispose();
        View_my_Events eve = new View_my_Events();
        eve.setVisible(true);
        eve.pack();
        eve.setLocationRelativeTo(null);   
        
    }//GEN-LAST:event_cancelActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       
        update();
             
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(Create_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_New().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C_File;
    private javax.swing.JLabel Datetext;
    public javax.swing.JTextArea Desc;
    private javax.swing.JScrollPane Descpanel;
    private javax.swing.JLabel Desctext;
    public javax.swing.JButton Save;
    public javax.swing.JComboBox<String> Selecttype;
    public javax.swing.JLabel User;
    public javax.swing.JButton backbtn;
    private javax.swing.JPanel backpanel;
    private javax.swing.JLabel bgimg;
    public javax.swing.JButton cancel;
    private javax.swing.JPanel centerpanel;
    public javax.swing.JButton cretebtn;
    public javax.swing.JTextField datefield;
    public javax.swing.JTextField filefield;
    private javax.swing.JLabel imgtext;
    public javax.swing.JTextField locfield;
    private javax.swing.JLabel loctext;
    private javax.swing.JLabel loctext1;
    private javax.swing.JLabel selecttext;
    public javax.swing.JTextField timefield;
    public javax.swing.JTextField titlefield;
    private javax.swing.JLabel titletext;
    private javax.swing.JPanel toppanel;
    public javax.swing.JLabel toptext;
    private javax.swing.JLabel toptext1;
    private javax.swing.JLabel toptext2;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }
    
    void runcrete(){ 
        
        String title, description, date, time, location, type ,query;
        admindatas admie = new admindatas(null,null,null);
        int foundID = 0;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();   
            ResultSet rs;
            PreparedStatement pst;
            
            
            if ("".equals(titlefield.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Title is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if ("".equals(Desc.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Description is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if ("".equals(datefield.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Date is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if ("".equals(timefield.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Time is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if ("".equals(locfield.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Location is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if ("".equals(filefield.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Insert an Image", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                System.out.print("path - " + path);
                File f = new File(path);

                String adi = "admin"; 
                
                query = "SELECT admin_ID FROM admin_table WHERE username = '"+adi+"'";
                rs = st.executeQuery(query);
                
                while(rs.next()){
                String adID = rs.getString("admin_ID");
                foundID = 1;
                System.out.print(adID);
                
                if (foundID == 1){
                    InputStream imgf = new FileInputStream(f);
                    // We need to add an admin Id for foreign key 
                    // admin_ID = admin_Id

                    title = titlefield.getText(); 
                    description = Desc.getText(); 
                    date = datefield.getText();
                    time = timefield.getText();
                    location = locfield.getText();
                    type = String.valueOf(Selecttype.getSelectedItem());
                    //System.out.println(type);
                    
                    //String Imgfile = null;

                    pst = con.prepareStatement("INSERT INTO admin_data_table(Title, Description, Date, Time, Location, Imgfile, Type ,admin_ID) VALUES (?,?,?,?,?,?,?,?) ");
                    pst.setString(1, title);
                    pst.setString(2, description);
                    pst.setString(3, date);
                    pst.setString(4, time);
                    pst.setString(5, location);
                    pst.setBlob(6, imgf, 1000000);
                    pst.setString(7, type);
                    pst.setString(8, adID);

                    pst.execute();

                    titlefield.setText("");
                    Desc.setText("");
                    datefield.setText("");
                    timefield.setText("");
                    locfield.setText("");
                    filefield.setText("");

                    showMessageDialog(null, "Item successfully created!");
                    
                    View_my_Events view = new View_my_Events();
                    
                    this.dispose();
                    view.setVisible(true);
                    view.pack();
                    view.setLocationRelativeTo(null);
                    
                    }
                    else{
                    System.out.print("eroor");}               
                }          
            }
            con.close();
            
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
     
    }

    private void update() {
        
    }
}
