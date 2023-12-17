package project_design;

// ============================= IMPORTS ============================= 
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

// ============================= MAIN ============================= 

public class Login extends javax.swing.JFrame{ //
    
    public String SUrl = "jdbc:MySQL://localhost:3306/java_users_data";
    public String SUser = "root";
    public String SPass = "";
    
    Connection con = null; 
    Statement st = null; 
    ResultSet rs = null;
    admindatas admn = new admindatas(null, null,null);
    
    public Login() {
        initComponents();
        Seticon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backpanel = new javax.swing.JPanel();
        leftpanel = new javax.swing.JPanel();
        Ltext1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Ltext2 = new javax.swing.JLabel();
        Ltext3 = new javax.swing.JLabel();
        Ltext4 = new javax.swing.JLabel();
        Ltext5 = new javax.swing.JLabel();
        rightpanel = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        mailfield = new javax.swing.JTextField();
        view = new javax.swing.JCheckBox();
        passfield = new javax.swing.JPasswordField();
        text4 = new javax.swing.JLabel();
        logbutton = new javax.swing.JButton();
        Choose = new javax.swing.JComboBox<>();
        selog = new javax.swing.JLabel();
        Forgrt = new javax.swing.JLabel();
        Registerbtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESAS - Login");
        setResizable(false);

        backpanel.setBackground(new java.awt.Color(217, 217, 217));
        backpanel.setPreferredSize(new java.awt.Dimension(1080, 573));
        backpanel.setLayout(null);

        leftpanel.setBackground(new java.awt.Color(217, 217, 217, 65));
        leftpanel.setPreferredSize(new java.awt.Dimension(540, 573));
        leftpanel.setLayout(null);

        Ltext1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Ltext1.setText("Batangas State University");
        leftpanel.add(Ltext1);
        Ltext1.setBounds(100, 130, 340, 41);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217,240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        Ltext2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Ltext2.setText("ESAS");
        jPanel1.add(Ltext2);
        Ltext2.setBounds(115, 19, 90, 48);

        Ltext3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        Ltext3.setText("Event Scheduling");
        jPanel1.add(Ltext3);
        Ltext3.setBounds(70, 70, 190, 32);

        Ltext4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        Ltext4.setText("And Announcement");
        jPanel1.add(Ltext4);
        Ltext4.setBounds(50, 110, 230, 32);

        Ltext5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        Ltext5.setText("System");
        jPanel1.add(Ltext5);
        Ltext5.setBounds(120, 150, 78, 32);

        leftpanel.add(jPanel1);
        jPanel1.setBounds(106, 193, 320, 220);

        backpanel.add(leftpanel);
        leftpanel.setBounds(0, 0, 540, 573);
        leftpanel.getAccessibleContext().setAccessibleName("");

        rightpanel.setBackground(new java.awt.Color(217, 217, 217, 200));
        rightpanel.setFocusable(false);
        rightpanel.setPreferredSize(new java.awt.Dimension(540, 573));
        rightpanel.setLayout(null);

        text1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        text1.setText("Login");
        text1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        text1.setIconTextGap(5);
        rightpanel.add(text1);
        text1.setBounds(230, 94, 90, 48);

        text2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text2.setText("Email Address");
        rightpanel.add(text2);
        text2.setBounds(101, 186, 120, 25);

        text3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text3.setText("Password");
        rightpanel.add(text3);
        text3.setBounds(101, 271, 80, 25);

        jSeparator3.setBackground(new java.awt.Color(217, 217, 217, 200));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setMinimumSize(new java.awt.Dimension(50, 10));
        rightpanel.add(jSeparator3);
        jSeparator3.setBounds(100, 335, 320, 10);

        jSeparator2.setBackground(new java.awt.Color(217, 217, 217, 200));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 10));
        rightpanel.add(jSeparator2);
        jSeparator2.setBounds(100, 255, 320, 10);

        mailfield.setBackground(new java.awt.Color(213, 213, 213));
        mailfield.setColumns(20);
        mailfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mailfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mailfield.setOpaque(true);
        mailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailfieldActionPerformed(evt);
            }
        });
        rightpanel.add(mailfield);
        mailfield.setBounds(101, 221, 320, 32);

        view.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        view.setBorder(null);
        view.setContentAreaFilled(false);
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view.setFocusable(false);
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_design/Hidden.png"))); // NOI18N
        view.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/project_design/Eye.png"))); // NOI18N
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        rightpanel.add(view);
        view.setBounds(422, 305, 30, 30);
        view.setFocusable(false);
        //view.setIcon(hidden);
        //view.setSelectedIcon(show);

        passfield.setBackground(new java.awt.Color(213, 213, 213));
        passfield.setColumns(20);
        passfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 0, 1));
        passfield.setOpaque(true);
        passfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfieldActionPerformed(evt);
            }
        });
        rightpanel.add(passfield);
        passfield.setBounds(101, 302, 320, 32);

        text4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        text4.setText("Doesn't have an account?");
        rightpanel.add(text4);
        text4.setBounds(170, 510, 143, 15);

        logbutton.setBackground(new java.awt.Color(204, 204, 204));
        logbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logbutton.setText("Login");
        logbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        logbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logbutton.setPreferredSize(new java.awt.Dimension(80, 35));
        logbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbuttonActionPerformed(evt);
            }
        });
        rightpanel.add(logbutton);
        logbutton.setBounds(230, 450, 80, 35);
        logbutton.setFocusable(false);

        Choose.setBackground(new java.awt.Color(217, 217, 217));
        Choose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Choose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Admin" }));
        Choose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Choose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Choose.setFocusable(false);
        Choose.setOpaque(true);
        Choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseActionPerformed(evt);
            }
        });
        rightpanel.add(Choose);
        Choose.setBounds(230, 370, 88, 26);

        selog.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        selog.setText("Select User Type:");
        rightpanel.add(selog);
        selog.setBounds(100, 370, 130, 22);

        Forgrt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Forgrt.setForeground(new java.awt.Color(0, 51, 255));
        Forgrt.setText("Forgot password");
        Forgrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Forgrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgrtMouseClicked(evt);
            }
        });
        rightpanel.add(Forgrt);
        Forgrt.setBounds(320, 340, 100, 16);

        Registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Registerbtn.setForeground(new java.awt.Color(255, 0, 0));
        Registerbtn.setText("Register");
        Registerbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterbtnMouseClicked(evt);
            }
        });
        rightpanel.add(Registerbtn);
        Registerbtn.setBounds(310, 510, 50, 16);

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.setOpaque(true);
        rightpanel.add(jLabel2);
        jLabel2.setBounds(420, 300, 39, 37);

        backpanel.add(rightpanel);
        rightpanel.setBounds(540, 0, 540, 573);
        rightpanel.getAccessibleContext().setAccessibleName("");

        backimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_design/bglipa.png"))); // NOI18N
        backpanel.add(backimg);
        backimg.setBounds(0, 0, 1080, 573);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ============================= View Password ============================= 
    
    private void ChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseActionPerformed
        // Remove the forget password btn if the dropbox is set to admin
        if(Choose.getSelectedIndex() == 1){
            text2.setText("Username");
            Forgrt.setVisible(false);
        }
        else{
            text2.setText("Email Address");
            Forgrt.setVisible(true);
        }
    }//GEN-LAST:event_ChooseActionPerformed

    // ============================= LOGIN ============================= 
    
    private void logbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbuttonActionPerformed
             
        String email, pass, query, passdb = null, adminid = null;
        int notFound = 0;
        
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
             
            query = "SELECT admin_ID FROM admin_table WHERE username = '"+ admn.getadmin() +"'";
            rs = st.executeQuery(query);
            
            while(rs.next()){
            //admn.setadminID(rs.getString("admin_ID"));
            //System.out.println("The Id is: " + admn.getadminID()); 
            admn.setadminID(rs.getString("admin_ID"));
            System.out.println("The Id is: " + admn.getadminID()); 
            adminid = rs.getString("admin_ID");
            //adminid = admn.getadminID();
            System.out.print(admn.getadminID());
            
            }    
        con.close();
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }   
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            if("".equals(mailfield.getText())){
                if(Choose.getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else if("".equals(passfield.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(Choose.getSelectedIndex() == 0){
                email = mailfield.getText();
                pass = passfield.getText();

                query = "SELECT * FROM users WHERE email= '"+email+"'";
                rs = st.executeQuery(query);
                while(rs.next()){
                    passdb = rs.getString("password");
                    notFound = 1;
                }
                if(notFound == 1 && pass.equals(passdb)){
                    
                    showMessageDialog(null, "Login succesfuly");
                    this.dispose(); 
                    Student_Menu stu = new Student_Menu();
                    stu.setVisible(true);
                    stu.pack();
                    stu.setLocationRelativeTo(null);
   
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect Email or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else if (Choose.getSelectedIndex() == 1){
                
                String admin = mailfield.getText();
                String adminpass = passfield.getText();
                
                admn.setadmin(admin);
                admn.setadminpass(adminpass);
               
                query = "SELECT * FROM admin_table WHERE username= '"+admn.getadmin()+"'";
                rs = st.executeQuery(query);
                while(rs.next()){
                    passdb = rs.getString("password");
                    notFound = 1;
                }
                if(notFound == 1 && admn.getadminpass().equals(passdb)){      
                    showMessageDialog(null, "Login succesfuly");
                    this.dispose();
                    Admin_Menu adm = new Admin_Menu();
                    adm.User.setText(admin);
                    adm.setVisible(true);
                    adm.pack();
                    adm.setLocationRelativeTo(null);
                    
                    Create_New fb = new Create_New();
                    
                    //new admindatas(admin, adminpass, adminid);
                    //fb.setdata(new admindatas(admin, adminpass, adminid));
                   
                    System.out.println(admn.getadminpass());
                    System.out.println("login Successfully");
                    
                    System.out.println(adminid);
                    Create_New create_New = new Create_New(admin, adminpass, adminid);
                    create_New.setAdmin(admin);
        
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect Usename or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Incorrect Email or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
        }
        catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_logbuttonActionPerformed

    private void passfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfieldActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        if(view.isSelected()){
            passfield.setEchoChar((char)0);
        }
        else{
            passfield.setEchoChar('•');
        }
    }//GEN-LAST:event_viewActionPerformed

    private void mailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailfieldActionPerformed

    // ============================= FORGOT BUTTON ============================= 
    
    private void ForgrtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgrtMouseClicked
        
        String query, query1, ad, email, changepass, userid;
        Create_New imp = new Create_New();
        int notFound = 0;
        int idfound = 0; 
        
        String response = JOptionPane.showInputDialog(this, "Enter your Email", "Forget Password", JOptionPane.OK_CANCEL_OPTION);
        email = response;
        
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
             
            query = "SELECT * FROM users WHERE email= '"+email+"'";
            rs = st.executeQuery(query);
            
            while(rs.next()){
            ad = rs.getString("email");
            notFound = 1;
            }

        if (notFound == 1){
            showMessageDialog(null, "Email verified");
            try{
                
                query = "SELECT ID FROM users WHERE email = '"+ email +"'";
                rs = st.executeQuery(query);
                
                while(rs.next()){
                userid = rs.getString("ID");
                idfound = 1;
                
                if (idfound == 1){
                   
                    String responsepas = JOptionPane.showInputDialog(this, "Enter your new Password", "Change Password", JOptionPane.OK_CANCEL_OPTION);
                    changepass = responsepas;
                    
                    query1 = "UPDATE users SET password = '"+changepass+"' WHERE ID = '"+userid+"'"; // need to fix this // change to user id 
                    st.executeUpdate(query1);

                    showMessageDialog(null, "Password succesfuly Changed");                  
                }
                
                else{
                System.out.print("error");
                }
            }
          
            }catch(Exception e){
                System.out.println("Error!" + e.getMessage()); 
            }          
        }
        else{
            showMessageDialog(null, "Email not Found");
        }  
        con.close();
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
         
    }//GEN-LAST:event_ForgrtMouseClicked
    
    // ============================= REGISTER BUTTON ============================= 
    
    private void RegisterbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterbtnMouseClicked
        
        Show_Details def = new Show_Details();
        Register reg = new Register();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_RegisterbtnMouseClicked
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                Login logined = new Login(); 
                //ImageIcon icon = new ImageIcon("bsu logo.png"); ;              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Choose;
    private javax.swing.JLabel Forgrt;
    private javax.swing.JLabel Ltext1;
    private javax.swing.JLabel Ltext2;
    private javax.swing.JLabel Ltext3;
    private javax.swing.JLabel Ltext4;
    private javax.swing.JLabel Ltext5;
    private javax.swing.JLabel Registerbtn;
    private javax.swing.JLabel backimg;
    private javax.swing.JPanel backpanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel leftpanel;
    public javax.swing.JButton logbutton;
    public javax.swing.JTextField mailfield;
    public javax.swing.JPasswordField passfield;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JLabel selog;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JCheckBox view;
    // End of variables declaration//GEN-END:variables

    private void Seticon() { //set imageicon 
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }

    // ===================================== Other Functions =========================================
    
    // ============================= SHOW THE ADMIN ID ============================= 
    public void showadminID(){
        /*
        // Identify the user ID
        String query;

        //Create_New imp = new Create_New();
       
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
             
            query = "SELECT admin_ID FROM admin_table WHERE username = '"+ admn.getadmin() +"'";
            rs = st.executeQuery(query);
            
            while(rs.next()){
            //admn.setadminID(rs.getString("admin_ID"));
            //System.out.println("The Id is: " + admn.getadminID()); 
            admn.setadminID(rs.getString("admin_ID"));
            System.out.println("The Id is: " + admn.getadminID()); 
            }    
        con.close();
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }*/           
    }
}
