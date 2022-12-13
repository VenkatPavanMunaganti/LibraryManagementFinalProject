/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.views;

import edu.neu.csye6200.librarymanagement.models.User;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;

/**
 *
 * @author Pavan munaganti
 */
public class AdminDashboard extends javax.swing.JFrame {
    
    public static JFrame adminDashboard;
    User admin;
    /**
     * Creates new form AdminDashboard
     */
    
    public AdminDashboard(){
        
    }
    public AdminDashboard(User admin) {
        initComponents();
        this.admin = admin;
        AdminStaffPanel adminStaffPanel = new AdminStaffPanel();
        adminStaffBtn.setBackground(new Color(0,0,0));
        adminBooksBtn.setBackground(new Color(255,43,48));
        adminStudentsBtn.setBackground(new Color(255,43,48));
        adminLogoutBtn.setBackground(new Color(255,43,48));    
        adminSplitPane.setRightComponent(adminStaffPanel);
//        System.out.println( adminSplitPane.getRightComponent().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminSplitPane = new javax.swing.JSplitPane();
        adminMenuPane = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        adminBooksBtn = new javax.swing.JButton();
        adminStaffBtn = new javax.swing.JButton();
        adminLogoutBtn = new javax.swing.JButton();
        adminStudentsBtn = new javax.swing.JButton();
        adminContentPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminSplitPane.setDividerLocation(200);
        adminSplitPane.setDividerSize(3);

        adminMenuPane.setBackground(new java.awt.Color(255, 43, 48));

        jPanel3.setBackground(new java.awt.Color(255, 43, 48));

        adminBooksBtn.setBackground(new java.awt.Color(255, 43, 48));
        adminBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adminBooksBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminBooksBtn.setText("Books");
        adminBooksBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adminBooksBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminBooksBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminBooksBtnMouseExited(evt);
            }
        });
        adminBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBooksBtnActionPerformed(evt);
            }
        });

        adminStaffBtn.setBackground(new java.awt.Color(255, 43, 48));
        adminStaffBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adminStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminStaffBtn.setText("Staff");
        adminStaffBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adminStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminStaffBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminStaffBtnMouseExited(evt);
            }
        });
        adminStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminStaffBtnActionPerformed(evt);
            }
        });

        adminLogoutBtn.setBackground(new java.awt.Color(255, 43, 48));
        adminLogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adminLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminLogoutBtn.setText("Logout");
        adminLogoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adminLogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminLogoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminLogoutBtnMouseExited(evt);
            }
        });
        adminLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutBtnActionPerformed(evt);
            }
        });

        adminStudentsBtn.setBackground(new java.awt.Color(255, 43, 48));
        adminStudentsBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adminStudentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminStudentsBtn.setText("Students");
        adminStudentsBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adminStudentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminStudentsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminStudentsBtnMouseExited(evt);
            }
        });
        adminStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminStudentsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminStudentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminBooksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminStaffBtn)
                .addGap(18, 18, 18)
                .addComponent(adminBooksBtn)
                .addGap(18, 18, 18)
                .addComponent(adminStudentsBtn)
                .addGap(18, 18, 18)
                .addComponent(adminLogoutBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout adminMenuPaneLayout = new javax.swing.GroupLayout(adminMenuPane);
        adminMenuPane.setLayout(adminMenuPaneLayout);
        adminMenuPaneLayout.setHorizontalGroup(
            adminMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        adminMenuPaneLayout.setVerticalGroup(
            adminMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPaneLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        adminSplitPane.setLeftComponent(adminMenuPane);

        javax.swing.GroupLayout adminContentPaneLayout = new javax.swing.GroupLayout(adminContentPane);
        adminContentPane.setLayout(adminContentPaneLayout);
        adminContentPaneLayout.setHorizontalGroup(
            adminContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        adminContentPaneLayout.setVerticalGroup(
            adminContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );

        adminSplitPane.setRightComponent(adminContentPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminStaffBtnActionPerformed
        // TODO add your handling code here:
        AdminStaffPanel adminStaffPanel = new AdminStaffPanel();
        adminStaffBtn.setBackground(new Color(0,0,0));
        adminBooksBtn.setBackground(new Color(255,43,48));
        adminStudentsBtn.setBackground(new Color(255,43,48));
        adminLogoutBtn.setBackground(new Color(255,43,48));    
        adminSplitPane.setRightComponent(adminStaffPanel);
//        System.out.println( adminSplitPane.getRightComponent().getName());
    }//GEN-LAST:event_adminStaffBtnActionPerformed

    private void adminBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBooksBtnActionPerformed
        // TODO add your handling code here:
        BooksCrudPanel adminStaffPanel = new BooksCrudPanel();
        adminStaffBtn.setBackground(new Color(255,43,48));
        adminBooksBtn.setBackground(new Color(0,0,0));
        adminStudentsBtn.setBackground(new Color(255,43,48));
        adminLogoutBtn.setBackground(new Color(255,43,48));    
        adminSplitPane.setRightComponent(adminStaffPanel);
//        System.out.println( adminSplitPane.getRightComponent().getName());
    }//GEN-LAST:event_adminBooksBtnActionPerformed

    private void adminStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminStudentsBtnActionPerformed
        // TODO add your handling code here:
        StudentsCrudPanel studentsCrudPanel = new StudentsCrudPanel();
        adminStaffBtn.setBackground(new Color(255,43,48));
        adminBooksBtn.setBackground(new Color(255,43,48));
        adminStudentsBtn.setBackground(new Color(0,0,0));
        adminLogoutBtn.setBackground(new Color(255,43,48));    
        adminSplitPane.setRightComponent(studentsCrudPanel);
//        System.out.println( adminSplitPane.getRightComponent().getName());
    }//GEN-LAST:event_adminStudentsBtnActionPerformed

    private void adminLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutBtnActionPerformed
        // TODO add your handling code here:
        adminDashboard.setVisible(false);
        LoginFrame.loginFrame.setVisible(true);
    }//GEN-LAST:event_adminLogoutBtnActionPerformed

    private void adminStaffBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminStaffBtnMouseEntered
        // TODO add your handling code here:
        adminStaffBtn.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_adminStaffBtnMouseEntered

    private void adminStaffBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminStaffBtnMouseExited
        // TODO add your handling code here:
        String rightComponentName= adminSplitPane.getRightComponent().getName();
        if(rightComponentName!=null && !rightComponentName.equals("adminStaffPanel"))
            adminStaffBtn.setBackground(new Color(255, 43, 48));
    }//GEN-LAST:event_adminStaffBtnMouseExited

    private void adminBooksBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBooksBtnMouseEntered
        // TODO add your handling code here:
        adminBooksBtn.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_adminBooksBtnMouseEntered

    private void adminBooksBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBooksBtnMouseExited
        // TODO add your handling code here:
        String rightComponentName= adminSplitPane.getRightComponent().getName();
        if(rightComponentName!=null && !rightComponentName.equals("booksPanel"))
            adminBooksBtn.setBackground(new Color(255, 43, 48));
    }//GEN-LAST:event_adminBooksBtnMouseExited

    private void adminStudentsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminStudentsBtnMouseEntered
        // TODO add your handling code here:
        adminStudentsBtn.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_adminStudentsBtnMouseEntered

    private void adminStudentsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminStudentsBtnMouseExited
        // TODO add your handling code here:
        String rightComponentName= adminSplitPane.getRightComponent().getName();
        if(rightComponentName!=null && !rightComponentName.equals("adminStudentsPanel"))
            adminStudentsBtn.setBackground(new Color(255, 43, 48));
    }//GEN-LAST:event_adminStudentsBtnMouseExited

    private void adminLogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLogoutBtnMouseEntered
        // TODO add your handling code here:
        adminLogoutBtn.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_adminLogoutBtnMouseEntered

    private void adminLogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLogoutBtnMouseExited
        // TODO add your handling code here:
        adminLogoutBtn.setBackground(new Color(255, 43, 48));
    }//GEN-LAST:event_adminLogoutBtnMouseExited
    
    
    
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBooksBtn;
    private javax.swing.JPanel adminContentPane;
    private javax.swing.JButton adminLogoutBtn;
    private javax.swing.JPanel adminMenuPane;
    private javax.swing.JSplitPane adminSplitPane;
    private javax.swing.JButton adminStaffBtn;
    private javax.swing.JButton adminStudentsBtn;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
