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
 * @author ASUS
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
            
            if((GPA > 3.70) || (GPA == 3.70)){
                degree = "First Class";
            }else if((GPA > 3.30) || (GPA == 3.30)){
                degree = "Second Class (Upper Division)";
            }else if((GPA > 3.00) || (GPA == 3.00)){
                degree = "Second Class (Lower Division)";
            }else{
                degree = "General Class";
            }
            
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

        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbuname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addYear = new javax.swing.JLabel();
        addSemester = new javax.swing.JLabel();
        addSubject = new javax.swing.JLabel();
        addResults = new javax.swing.JLabel();
        viewreports = new javax.swing.JLabel();
        txtGPA = new javax.swing.JLabel();
        viewsubject = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("My Uni Life");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close Window.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        lbuname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbuname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbuname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(131, 131, 131)
                .addComponent(jLabel6)
                .addGap(36, 36, 36))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addYear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Plus 1 Year_48px.png"))); // NOI18N
        addYear.setText("Add Year");
        addYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYearMouseClicked(evt);
            }
        });
        jPanel1.add(addYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 64));

        addSemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addSemester.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/semester.png"))); // NOI18N
        addSemester.setText("Add Semester");
        addSemester.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSemesterMouseClicked(evt);
            }
        });
        jPanel1.add(addSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 170, 64));

        addSubject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/subject.png"))); // NOI18N
        addSubject.setText("Add Subject");
        addSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSubjectMouseClicked(evt);
            }
        });
        jPanel1.add(addSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, 64));

        addResults.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exam_50px.png"))); // NOI18N
        addResults.setText("Add Results");
        addResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addResultsMouseClicked(evt);
            }
        });
        jPanel1.add(addResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 170, 64));

        viewreports.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewreports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reports.png"))); // NOI18N
        viewreports.setText("View Reports");
        viewreports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewreportsMouseClicked(evt);
            }
        });
        jPanel1.add(viewreports, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 170, 64));

        txtGPA.setBackground(new java.awt.Color(102, 255, 204));
        txtGPA.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtGPA.setForeground(new java.awt.Color(0, 0, 153));
        txtGPA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGPA.setAlignmentX(0.5F);
        txtGPA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 200, 60));

        viewsubject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewsubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Eye_50px.png"))); // NOI18N
        viewsubject.setText("View Subjects");
        viewsubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewsubjectMouseClicked(evt);
            }
        });
        jPanel1.add(viewsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 64));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GPA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 590, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewsubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewsubjectMouseClicked
        ViewSubject viewSubject = new ViewSubject();
        viewSubject.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewsubjectMouseClicked

    private void addResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addResultsMouseClicked
        SearchSubject searchResults = new SearchSubject();
        searchResults.setVisible(true);
        dispose();
    }//GEN-LAST:event_addResultsMouseClicked

    private void addSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSubjectMouseClicked
        AddSubject addsubject = new AddSubject();
        addsubject.setVisible(true);
        dispose();
    }//GEN-LAST:event_addSubjectMouseClicked

    private void addSemesterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSemesterMouseClicked
        AddSemester addSemester = new AddSemester();
        addSemester.setVisible(true);
        dispose();
    }//GEN-LAST:event_addSemesterMouseClicked

    private void addYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYearMouseClicked
        AddYear addYear = new AddYear();
        addYear.setVisible(true);
        dispose();
    }//GEN-LAST:event_addYearMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void viewreportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewreportsMouseClicked
        ViewReports viewReports = new ViewReports(GPA,degree);
        viewReports.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewreportsMouseClicked

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
    private javax.swing.JLabel addResults;
    private javax.swing.JLabel addSemester;
    private javax.swing.JLabel addSubject;
    private javax.swing.JLabel addYear;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbuname;
    private javax.swing.JLabel txtGPA;
    private javax.swing.JLabel viewreports;
    private javax.swing.JLabel viewsubject;
    // End of variables declaration//GEN-END:variables
}
