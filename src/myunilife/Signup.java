/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myunilife;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        lbyear = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        lbyear1 = new javax.swing.JLabel();
        lbyear2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbyear3 = new javax.swing.JLabel();
        lbyear4 = new javax.swing.JLabel();
        lbyear5 = new javax.swing.JLabel();
        lbyear6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtuni = new javax.swing.JTextField();
        txtregisterno = new javax.swing.JTextField();
        txtindex = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        cpassword = new javax.swing.JPasswordField();
        enterpassword = new javax.swing.JPasswordField();
        txtdegree = new javax.swing.JTextField();
        lbyear7 = new javax.swing.JLabel();
        lbaddyear = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        lbyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear.setText("University");

        btnsignup.setBackground(new java.awt.Color(0, 0, 153));
        btnsignup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("Sign up");
        btnsignup.setBorder(null);
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        lbyear1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear1.setText("Name");

        lbyear2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear2.setText("Confirm Password");

        jTextField1.setText("jTextField1");

        lbyear3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear3.setText("Registration No");

        lbyear4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear4.setText("Index No");

        lbyear5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear5.setText("Username");

        lbyear6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear6.setText("Password");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuniActionPerformed(evt);
            }
        });

        txtregisterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregisternoActionPerformed(evt);
            }
        });

        txtindex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtindexActionPerformed(evt);
            }
        });

        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });

        cpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpasswordActionPerformed(evt);
            }
        });

        enterpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpasswordActionPerformed(evt);
            }
        });

        txtdegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdegreeActionPerformed(evt);
            }
        });

        lbyear7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbyear7.setText("Degree");

        lbaddyear.setBackground(new java.awt.Color(255, 255, 255));
        lbaddyear.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbaddyear.setText("Sign up");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lbaddyear)
                        .addGap(538, 538, 538)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbyear)
                            .addComponent(lbyear1)
                            .addComponent(lbyear7)
                            .addComponent(lbyear3)
                            .addComponent(lbyear4)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbyear6)
                                .addComponent(lbyear5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbyear2)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtname)
                                .addComponent(txtuni)
                                .addComponent(txtdegree)
                                .addComponent(txtregisterno)
                                .addComponent(txtindex)
                                .addComponent(txtuname)
                                .addComponent(enterpassword)
                                .addComponent(cpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbaddyear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbyear1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbyear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbyear7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdegree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtregisterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbyear3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbyear4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbyear5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbyear6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbyear2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 490, 540));

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("My Uni Life");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close Window.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(215, 215, 215)
                .addComponent(jLabel6)
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        int semid=0;
        int yid=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myunilife","root","");

            String username = txtuname.getText();
            String index = txtindex.getText();
            char[] password = enterpassword.getPassword();
            char[] confirmpassword = cpassword.getPassword();
            
            Validation validation = new Validation();
            boolean result = validation.validPassword(password,confirmpassword);
            
            if(result){
                SimpleMD5Example simpleMD5Example = new SimpleMD5Example();
                String md5 = simpleMD5Example.getHash(password);
                
                
                String sql = "insert into mydetails (username,password,name,university,degree,registrationno,indexno) values(?,?,?,?,?,?,?)";
                PreparedStatement pst= con.prepareStatement(sql);
                pst.setString(1, (String)txtuname.getText());
                pst.setString(2, md5);
                pst.setString(3, (String)txtname.getText());
                pst.setString(4, (String)txtuni.getText());
                pst.setString(5, (String)txtdegree.getText());
                pst.setString(6, (String)txtregisterno.getText());           
                pst.setInt(7, Integer.parseInt(index));
                
                

                int update = pst.executeUpdate();

                if(update == 1){
                    //JOptionPane.showMessageDialog(null,"Insert is sucess");                
                    Home home = new Home(username);
                    home.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Insert is failed");
                }
            }
            
            
            con.close();
            //dispose();
            //Dashboard dashboard = new Dashboard(adminName);
            //dashboard.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnsignupActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuniActionPerformed

    private void txtregisternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregisternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtregisternoActionPerformed

    private void txtindexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtindexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtindexActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

    private void cpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpasswordActionPerformed

    private void enterpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpasswordActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txtdegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdegreeActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JPasswordField enterpassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbaddyear;
    private javax.swing.JLabel lbyear;
    private javax.swing.JLabel lbyear1;
    private javax.swing.JLabel lbyear2;
    private javax.swing.JLabel lbyear3;
    private javax.swing.JLabel lbyear4;
    private javax.swing.JLabel lbyear5;
    private javax.swing.JLabel lbyear6;
    private javax.swing.JLabel lbyear7;
    private javax.swing.JTextField txtdegree;
    private javax.swing.JTextField txtindex;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtregisterno;
    private javax.swing.JTextField txtuname;
    private javax.swing.JTextField txtuni;
    // End of variables declaration//GEN-END:variables
}
