/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myunilife;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.UIManager;

import org.jfree.chart.ChartFactory;

import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.plot.CategoryPlot;

import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author ASUS-Asini Pathmila Silva
 */
public class ReportGPA extends javax.swing.JFrame {

    /**
     * Creates new form ReportGPA
     */
    float TGPA =0;
    String degree;
    
    public ReportGPA() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);       
    }
    
    public ReportGPA(float GPA, String username) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        lbuname.setText(username);
        TGPA=GPA;
        
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
        
        txtdegree.setText(degree);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myunilife","root","");
            
            String sql3 = "select sum(credit) from subject" ;
            Statement stm3 = con.createStatement();
            ResultSet rst3 = stm3.executeQuery(sql3);
            while(rst3.next()){
                txtCredits.setText(rst3.getString("sum(credit)"));                
            }                   
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

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbuname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGPA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtdegree = new javax.swing.JLabel();
        txtCredits = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close Window.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel2.setText("My Uni Life");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pharm2018-03-278219841.jpg"))); // NOI18N

        lbuname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbuname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home_30px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.setText("jTextField1");
        jPanel12.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 1, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Degree");
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        txtGPA.setBackground(new java.awt.Color(102, 255, 204));
        txtGPA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGPA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGPA.setAlignmentX(0.5F);
        txtGPA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(txtGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 200, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View No of Grades");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GPA");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        txtdegree.setBackground(new java.awt.Color(102, 255, 204));
        txtdegree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdegree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdegree.setAlignmentX(0.5F);
        txtdegree.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(txtdegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 200, 30));

        txtCredits.setBackground(new java.awt.Color(102, 255, 204));
        txtCredits.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCredits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCredits.setAlignmentX(0.5F);
        txtCredits.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(txtCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Credits");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User_40px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbuname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        String uname = lbuname.getText();
        Home home = new Home(uname);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        int B1 = 0;
        int B2 = 0;
        int B3 = 0;
        int C1 = 0;
        int C2 = 0;
        int C3 = 0;
        int D1 = 0;
        int D2 = 0;
        int E = 0;
        int F = 0;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myunilife","root","");
            
            
            String sql = "select count(result) from results where result = 'A+' " ;
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                A1 = rst.getInt("count(result)");
            }
            
            String sql2 = "select count(result) from results where result = 'A' " ;
            Statement stm2 = con.createStatement();
            ResultSet rst2 = stm.executeQuery(sql2);
            while(rst2.next()){
                A2 = rst2.getInt("count(result)");
            }
            
            String sql3 = "select count(result) from results where result = 'A-' " ;
            Statement stm3 = con.createStatement();
            ResultSet rst3 = stm.executeQuery(sql3);
            while(rst3.next()){
                A3 = rst3.getInt("count(result)");
            }
            
            String sql4 = "select count(result) from results where result = 'B+' " ;
            Statement stm4 = con.createStatement();
            ResultSet rst4 = stm.executeQuery(sql4);
            while(rst4.next()){
                B1 = rst4.getInt("count(result)");
            }
            
            String sql5 = "select count(result) from results where result = 'B' " ;
            Statement stm5 = con.createStatement();
            ResultSet rst5 = stm.executeQuery(sql5);
            while(rst5.next()){
                B2 = rst5.getInt("count(result)");
            }
            
            String sql6 = "select count(result) from results where result = 'B-' " ;
            Statement stm6 = con.createStatement();
            ResultSet rst6 = stm.executeQuery(sql6);
            while(rst6.next()){
                B3 = rst6.getInt("count(result)");
            }
            
            String sql7 = "select count(result) from results where result = 'C+' " ;
            Statement stm7 = con.createStatement();
            ResultSet rst7 = stm.executeQuery(sql7);
            while(rst7.next()){
                C1 = rst7.getInt("count(result)");
            }
            
            String sql8 = "select count(result) from results where result = 'C' " ;
            Statement stm8 = con.createStatement();
            ResultSet rst8 = stm.executeQuery(sql8);
            while(rst8.next()){
                C2 = rst8.getInt("count(result)");
            }
            
            String sql9 = "select count(result) from results where result = 'C-' " ;
            Statement stm9 = con.createStatement();
            ResultSet rst9 = stm.executeQuery(sql9);
            while(rst9.next()){
                C3 = rst9.getInt("count(result)");
            }
            
            String sql10 = "select count(result) from results where result = 'D+' " ;
            Statement stm10 = con.createStatement();
            ResultSet rst10 = stm.executeQuery(sql10);
            while(rst10.next()){
                D1 = rst10.getInt("count(result)");
            }
            
            String sql11 = "select count(result) from results where result = 'D' " ;
            Statement stm11 = con.createStatement();
            ResultSet rst11 = stm.executeQuery(sql11);
            while(rst11.next()){
                D2 = rst11.getInt("count(result)");
            }
            
            String sql12 = "select count(result) from results where result = 'E' " ;
            Statement stm12 = con.createStatement();
            ResultSet rst12 = stm.executeQuery(sql12);
            while(rst12.next()){
                E = rst12.getInt("count(result)");
            }
            
            String sql13 = "select count(result) from results where result = 'F' " ;
            Statement stm13 = con.createStatement();
            ResultSet rst13 = stm.executeQuery(sql13);
            while(rst13.next()){
                F = rst13.getInt("count(result)");
            }
            
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(A1, "Marks" , "A+" );
        dataset.setValue(A2, "Marks", "A");
        dataset.setValue(A3, "Marks", "A-");
        dataset.setValue(B1, "Marks" , "B+" );
        dataset.setValue(B2, "Marks", "B");
        dataset.setValue(B3, "Marks", "B-");
        dataset.setValue(C1, "Marks" , "C+" );
        dataset.setValue(C2, "Marks", "C");
        dataset.setValue(C3, "Marks", "C-");
        dataset.setValue(D1, "Marks", "D+");
        dataset.setValue(D2, "Marks" , "D" );
        dataset.setValue(E, "Marks", "E");
        dataset.setValue(F, "Marks", "F");

        JFreeChart chart = ChartFactory.createBarChart("Student’s Grades", "Grade","No of grades", dataset, PlotOrientation.VERTICAL,false,true,false);

        CategoryPlot p = chart.getCategoryPlot();

        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportGPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportGPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbuname;
    private javax.swing.JLabel txtCredits;
    private javax.swing.JLabel txtGPA;
    private javax.swing.JLabel txtdegree;
    // End of variables declaration//GEN-END:variables
}
