/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myunilife;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS-Asini Pathmila Silva
 */
public class Home extends javax.swing.JFrame {
    float GPA=0;
    String degree;
    /**
     * Creates new form home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public Home(String username) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        lbuname.setText(username);
                
        int totCredit = 0;
        float totMultiple=0;
        
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myunilife","root","");
            
            String sql1 = "select * from results" ;
            Statement stm1 = con.createStatement();
            ResultSet rst1 = stm1.executeQuery(sql1);
            while(rst1.next()){
                int subid = rst1.getInt("subid");
                String result= rst1.getString("result");
                                             
                String sql = "select * from grade where grade = '"+result+"'" ;
                Statement stm = con.createStatement();
                ResultSet rst = stm.executeQuery(sql);
                while(rst.next()){
                    float value= rst.getFloat("value");
                    //System.out.println("Asini");
                                   
                    String sql2 = "select * from subject where subid = '"+subid+"'" ;
                    Statement stm2 = con.createStatement();
                    ResultSet rst2 = stm2.executeQuery(sql2);
                    while(rst2.next()){
                        int credit = rst2.getInt("credit");
                        totCredit = totCredit + credit;                    
                        totMultiple = totMultiple + (value * (float)credit); 
                        
                    }
                    
                }                       
                //JOptionPane.showMessageDialog(null,GPA); 
            }   
            
            GPA = totMultiple/(float)totCredit;
            //JOptionPane.showMessageDialog(null,totCredit);
            //JOptionPane.showMessageDialog(null,totMultiple);
            txtGPA.setText(Double.toString(GPA));
            /*
            if((GPA > 3.70) || (GPA == 3.70)){
                degree = "First Class";
            }else if((GPA > 3.30) || (GPA == 3.30)){
                degree = "Second Class (Upper Division)";
            }else if((GPA > 3.00) || (GPA == 3.00)){
                degree = "Second Class (Lower Division)";
            }else{
                degree = "General Class";
            }
            */
            //System.out.println(degree);
            
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addYear1 = new javax.swing.JLabel();
        addSemester1 = new javax.swing.JLabel();
        addSubject1 = new javax.swing.JLabel();
        addResults1 = new javax.swing.JLabel();
        viewreports1 = new javax.swing.JLabel();
        viewsubject1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGPA = new javax.swing.JLabel();
        lbuname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close Window.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel2.setText("My Uni Life");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pharm2018-03-278219841.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addYear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addYear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Plus 1 Year_48px.png"))); // NOI18N
        addYear1.setText("Add Year");
        addYear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYear1MouseClicked(evt);
            }
        });
        jPanel2.add(addYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 64));

        addSemester1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addSemester1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/semester.png"))); // NOI18N
        addSemester1.setText("Add Semester");
        addSemester1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSemester1MouseClicked(evt);
            }
        });
        jPanel2.add(addSemester1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 170, 64));

        addSubject1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addSubject1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/subject.png"))); // NOI18N
        addSubject1.setText("Add Subject");
        addSubject1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSubject1MouseClicked(evt);
            }
        });
        jPanel2.add(addSubject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 64));

        addResults1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addResults1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exam_50px.png"))); // NOI18N
        addResults1.setText("Add Results");
        addResults1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addResults1MouseClicked(evt);
            }
        });
        jPanel2.add(addResults1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 170, 64));

        viewreports1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewreports1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reports.png"))); // NOI18N
        viewreports1.setText("View Reports");
        viewreports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewreports1MouseClicked(evt);
            }
        });
        jPanel2.add(viewreports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, 64));

        viewsubject1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewsubject1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Eye_50px.png"))); // NOI18N
        viewsubject1.setText("View Subjects");
        viewsubject1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewsubject1MouseClicked(evt);
            }
        });
        jPanel2.add(viewsubject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 64));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GPA");

        txtGPA.setBackground(new java.awt.Color(102, 255, 204));
        txtGPA.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtGPA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGPA.setAlignmentX(0.5F);
        txtGPA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbuname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbuname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User_40px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbuname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(26, 26, 26))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(66, 66, 66))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(lbuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void addYear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYear1MouseClicked
        String uname = lbuname.getText();          
        AddYear addYear = new AddYear(uname,GPA);
        addYear.setVisible(true);
        dispose();
    }//GEN-LAST:event_addYear1MouseClicked

    private void addSemester1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSemester1MouseClicked
        String uname = lbuname.getText();          
        AddSemester addSemester = new AddSemester(uname,GPA);
        addSemester.setVisible(true);
        dispose();
    }//GEN-LAST:event_addSemester1MouseClicked

    private void addSubject1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSubject1MouseClicked
        String uname = lbuname.getText();          
        AddSubject addSubject = new AddSubject(uname,GPA);
        addSubject.setVisible(true);
        dispose();
    }//GEN-LAST:event_addSubject1MouseClicked

    private void addResults1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addResults1MouseClicked
        String uname = lbuname.getText();          
        SearchSubject searchSubject = new SearchSubject(uname,GPA);
        searchSubject.setVisible(true);
        dispose();
    }//GEN-LAST:event_addResults1MouseClicked

    private void viewreports1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewreports1MouseClicked
        String uname = lbuname.getText();          
        ViewReports viewReports = new ViewReports(GPA,uname);
        //System.out.println(degree);
        viewReports.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewreports1MouseClicked

    private void viewsubject1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewsubject1MouseClicked
        String uname = lbuname.getText();          
        ViewSubject viewSubject = new ViewSubject(uname,GPA);
        viewSubject.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewsubject1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String uname = lbuname.getText();   
        MyProfile profile = new MyProfile(uname,GPA);
        profile.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addResults1;
    private javax.swing.JLabel addSemester1;
    private javax.swing.JLabel addSubject1;
    private javax.swing.JLabel addYear1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbuname;
    private javax.swing.JLabel txtGPA;
    private javax.swing.JLabel viewreports1;
    private javax.swing.JLabel viewsubject1;
    // End of variables declaration//GEN-END:variables
}
