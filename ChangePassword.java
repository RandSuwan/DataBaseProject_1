/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Msys
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    EntityManager emadmin=Persistence.createEntityManagerFactory("TourisimPU").createEntityManager();
    public ChangePassword() {
        initComponents();
        super.pack();
        super.setLocationRelativeTo(null);
        super.setSize(730, 520);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldold = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldnew = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldconfirm = new javax.swing.JPasswordField();
        jButtonChange = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(740, 391));
        setResizable(false);
        setSize(new java.awt.Dimension(710, 391));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 170, 183));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Change Password");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 170, 183));
        jLabel1.setText("E-mail:");

        jTextFieldmail.setBackground(new java.awt.Color(32, 170, 183));
        jTextFieldmail.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 170, 183));
        jLabel2.setText("Old Password:");

        jPasswordFieldold.setBackground(new java.awt.Color(32, 170, 183));
        jPasswordFieldold.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 170, 183));
        jLabel4.setText("New Password:");

        jPasswordFieldnew.setBackground(new java.awt.Color(32, 170, 183));
        jPasswordFieldnew.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 170, 183));
        jLabel3.setText("Confirm Password:");

        jPasswordFieldconfirm.setBackground(new java.awt.Color(32, 170, 183));
        jPasswordFieldconfirm.setForeground(new java.awt.Color(255, 255, 255));

        jButtonChange.setBackground(new java.awt.Color(32, 170, 183));
        jButtonChange.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButtonChange.setForeground(new java.awt.Color(255, 255, 255));
        jButtonChange.setText("Change Password");
        jButtonChange.setBorder(null);
        jButtonChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChange.setPreferredSize(new java.awt.Dimension(146, 44));
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(32, 170, 183));
        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(146, 44));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 170, 183));
        jLabel6.setText("AID:");

        jTextFieldAID.setBackground(new java.awt.Color(32, 170, 183));
        jTextFieldAID.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(32, 170, 183));

        jLabel8.setForeground(new java.awt.Color(32, 170, 183));

        jLabel9.setForeground(new java.awt.Color(32, 170, 183));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldmail)
                                    .addComponent(jPasswordFieldold)
                                    .addComponent(jTextFieldAID)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPasswordFieldconfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                            .addComponent(jPasswordFieldnew)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(212, 212, 212))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPasswordFieldold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel1))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        super.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
      
        try{
           jLabel7.setText(null); jLabel8.setText(null); jLabel9.setText(null);
        if(Integer.parseInt(jTextFieldAID.getText())==Integer.parseInt(Admin_Register.AID))
      {
         Query qry=emadmin.createNamedQuery("Adminstrator.findAll");
         List <Adminstrator> adminlist=qry.getResultList();
         Person person = null;
         
         for(Adminstrator admin:adminlist)
         {
             person=admin.getPersonalId();
             String email=person.getEmailAdress();
             if(email.equals(jTextFieldmail.getText()))
             {
                 jLabel9.setText(null);
                 String oldpassword=admin.getApassword();
                 if(oldpassword.equals(jPasswordFieldold.getText()))
                 {
                     jLabel8.setText(null);
                  if(jPasswordFieldnew.getText().equals(jPasswordFieldconfirm.getText()))
                  {
                      jLabel7.setText(null);
                      OracleDataSource ods;
                  try {
                      ods = new OracleDataSource();
                      ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
                      ods.setUser("c##Travel"); ods.setPassword("987654");
                      Connection con=ods.getConnection();
                      Statement stmt=con.createStatement(); 
                      int aid=Integer.parseInt(jTextFieldAID.getText()); 
                      String strsql="UPDATE ADMINSTRATOR set APASSWORD="+jPasswordFieldnew.getText()+" where AID='"+aid+"'";
                      stmt.executeUpdate(strsql);
                      JOptionPane.showMessageDialog(this, "Password Changed Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                      jTextFieldAID.setText(null); jTextFieldmail.setText(null); jPasswordFieldold.setText(null);
                      jPasswordFieldnew.setText(null); jPasswordFieldconfirm.setText(null);
                      jLabel7.setText(null); jLabel8.setText(null); jLabel9.setText(null);
                  } catch (SQLException ex) {
                      Logger.getLogger(Forgget_Password.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  }//if(password)
                  else
                  {
                       jLabel7.setText("Password doesn't match.");
                  }
                 }
                 else{
                      jLabel8.setText("Wrong Password!");
                 }
             }
             else
             {
                 jLabel9.setText("Wrong Email!");
             }
         }//end of for loop
    
      }//end of if
        }catch(NullPointerException e)
        {
             JOptionPane.showMessageDialog(this, "Make sure to fill all fields!", "Information", JOptionPane.WARNING_MESSAGE);
        }
        catch(NumberFormatException n)
        {
           JOptionPane.showMessageDialog(this, "Make sure to fill all fields!", "Information", JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jButtonChangeActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldconfirm;
    private javax.swing.JPasswordField jPasswordFieldnew;
    private javax.swing.JPasswordField jPasswordFieldold;
    private javax.swing.JTextField jTextFieldAID;
    private javax.swing.JTextField jTextFieldmail;
    // End of variables declaration//GEN-END:variables
}
