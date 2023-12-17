package project_design;

import java.awt.*;
import java.sql.Connection; // sql package
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        Seticon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backpanel = new javax.swing.JPanel();
        leftpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Ltext2 = new javax.swing.JLabel();
        Ltext3 = new javax.swing.JLabel();
        Ltext4 = new javax.swing.JLabel();
        Ltext5 = new javax.swing.JLabel();
        Ltext1 = new javax.swing.JLabel();
        rightpanel = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        re_password = new javax.swing.JPasswordField();
        regbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESAS - Register");
        setResizable(false);

        backpanel.setPreferredSize(new java.awt.Dimension(1080, 573));
        backpanel.setLayout(null);

        leftpanel.setBackground(new java.awt.Color(217, 217, 217, 65));
        leftpanel.setPreferredSize(new java.awt.Dimension(540, 573));
        leftpanel.setLayout(null);

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

        Ltext1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Ltext1.setText("Batangas State University");
        leftpanel.add(Ltext1);
        Ltext1.setBounds(100, 130, 340, 41);

        backpanel.add(leftpanel);
        leftpanel.setBounds(0, 0, 540, 573);

        rightpanel.setBackground(new java.awt.Color(217, 217, 217, 200));
        rightpanel.setPreferredSize(new java.awt.Dimension(540, 573));

        text1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        text1.setText("Register");
        text1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        text1.setIconTextGap(5);

        text2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text2.setText("Full Name:");

        text3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text3.setText("Email Address:");

        text4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text4.setText("Password:");

        text5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text5.setText("Re-Enter Password:");

        f_name.setBackground(new java.awt.Color(231, 228, 228));
        f_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        f_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        f_name.setPreferredSize(new java.awt.Dimension(300, 25));

        mail.setBackground(new java.awt.Color(231, 228, 228));
        mail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mail.setPreferredSize(new java.awt.Dimension(300, 25));

        password.setBackground(new java.awt.Color(231, 228, 228));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        re_password.setBackground(new java.awt.Color(231, 228, 228));
        re_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        re_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        regbutton.setBackground(new java.awt.Color(0, 255, 204));
        regbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        regbutton.setText("Register");
        regbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        regbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regbutton.setPreferredSize(new java.awt.Dimension(80, 35));
        regbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("I've an Account:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("Login");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightpanelLayout = new javax.swing.GroupLayout(rightpanel);
        rightpanel.setLayout(rightpanelLayout);
        rightpanelLayout.setHorizontalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightpanelLayout.createSequentialGroup()
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightpanelLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(rightpanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightpanelLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(regbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightpanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text2)
                                .addComponent(text3)
                                .addComponent(text4)
                                .addComponent(text5)
                                .addComponent(password)
                                .addComponent(mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(f_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(re_password, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        rightpanelLayout.setVerticalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightpanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(text5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(re_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(regbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        regbutton.setFocusable(false);

        backpanel.add(rightpanel);
        rightpanel.setBounds(540, 0, 540, 573);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_design/bglipa.png"))); // NOI18N
        backpanel.add(img);
        img.setBounds(0, 0, 1080, 573);

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

    private void regbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbuttonActionPerformed
        System.out.println("signup");

        String full_name, email, pass, re_pass, query; 
        String SUrl, SUser, SPass; 
            SUrl = "jdbc:MySQL://localhost:3306/java_users_data";
            SUser = "root";
            SPass = "";
        
        // Comparing Passwords
        String pass1 = new String(password.getPassword());
        String pass2 = new String(re_password.getPassword());
        
            
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if ("".equals(f_name.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(mail.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(password.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(re_password.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Please Re-Enter Password", "Error", JOptionPane.ERROR_MESSAGE);              
            }
            else if(!pass1.equals(pass2)){
                JOptionPane.showMessageDialog(new JFrame(), "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                // clear password 
                password.setText("");
                re_password.setText("");
            }          
            else{
                full_name = f_name.getText(); 
                email = mail.getText(); 
                pass = password.getText();
                System.out.println("Successfuly log");
                
                query = "INSERT INTO users(full_name, email, password)" + 
                        "VALUES('"+full_name+"', '"+email+"', '"+pass+"')";
                
                st.execute(query); 
                f_name.setText("");
                mail.setText("");
                password.setText("");
                re_password.setText("");
                showMessageDialog(null, "Account has been successfully created!");
            }
            con.close();
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_regbuttonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ltext1;
    private javax.swing.JLabel Ltext2;
    private javax.swing.JLabel Ltext3;
    private javax.swing.JLabel Ltext4;
    private javax.swing.JLabel Ltext5;
    private javax.swing.JPanel backpanel;
    private javax.swing.JTextField f_name;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField re_password;
    private javax.swing.JButton regbutton;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }
}
