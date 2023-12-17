
package project_design;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Show_Details2 extends javax.swing.JFrame {
    
    public String SUrl = "jdbc:MySQL://localhost:3306/java_users_data";
    public String SUser = "root";
    public String SPass = "";
    
    private ImageIcon format = null;
    byte [] pimage = null;
    
    Connection con = null; 
    Statement st = null; 
    ResultSet rs = null;
    
    public Show_Details2() {
        initComponents();
        ShowDetails();
        seticon();
    }
    
    public void loadimage(){
        try {
            byte[] imagedata = rs.getBytes("ImgFile");
            format = new ImageIcon(imagedata);
            Image mm = format.getImage();
            Image img2 = mm.getScaledInstance(288, 284, WIDTH);
            ImageIcon image = new ImageIcon(img2);
            
            imglbl.setIcon(image);
        } catch (SQLException ex) {
            Logger.getLogger(Show_Details2.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Detail = new javax.swing.JLabel();
        imglbl = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        Desc = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        Loc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Details");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        Detail.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        Detail.setText("Details");

        imglbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("Event 1");

        Desc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Desc.setText("Description");

        date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        date.setText("Date");

        time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        time.setText("Time");

        Loc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Loc.setText("Location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(date)
                            .addComponent(Desc)
                            .addComponent(time)
                            .addComponent(Loc)))
                    .addComponent(Detail))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(34, 34, 34)
                        .addComponent(Desc)
                        .addGap(47, 47, 47)
                        .addComponent(date)
                        .addGap(34, 34, 34)
                        .addComponent(time)
                        .addGap(37, 37, 37)
                        .addComponent(Loc))
                    .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Show_Details2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Details2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Details2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Details2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Details2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Desc;
    private javax.swing.JLabel Detail;
    private javax.swing.JLabel Loc;
    private javax.swing.JLabel date;
    private javax.swing.JLabel imglbl;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void ShowDetails() {
        
        String query;
        
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            
            query = "SELECT * FROM admin_data_table";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                String Title = rs.getString("Title");
                String desc = rs.getString("Description");
                String Date = rs.getString("Date");
                String Time = rs.getString("Time");
                String Type = rs.getString("Type");
                String Location = rs.getString("Location");
                
                
                Detail.setText("Announcement Details");
                title.setText("Math Finals");
                Desc.setText("math exam tomorrow");
                date.setText("Date: December 10 2023");
                time.setText("Time: 7:00 am - 10:00 am");
                Loc.setText("Location: Room 403");
                //loadimage();
            } 
        }catch(Exception e){   
        System.out.println("Error!" + e.getMessage()); 
        }
         
   }

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsu logo.png")));
    }
}
    
