/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adima
 */
public class new_student extends javax.swing.JFrame {

    /**
     * Creates new form new_student
     */
    public new_student() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stu_id = new javax.swing.JTextField();
        stu_name = new javax.swing.JTextField();
        stu_fname = new javax.swing.JTextField();
        stu_course = new javax.swing.JComboBox<>();
        stu_branch = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 75, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 133, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 187, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 241, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 301, -1, -1));

        stu_id.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(stu_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 75, 234, 30));

        stu_name.setBackground(new java.awt.Color(255, 255, 204));
        stu_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_nameActionPerformed(evt);
            }
        });
        getContentPane().add(stu_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 129, 234, 30));

        stu_fname.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(stu_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 183, 234, 30));

        stu_course.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stu_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "B.Tech", "M.Tech", "BCA", "MCA" }));
        getContentPane().add(stu_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 237, 234, 30));

        stu_branch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stu_branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "CSE with AI and Ml", "CSE with Cyber Security", "CSE with Data Science " }));
        stu_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_branchActionPerformed(evt);
            }
        });
        getContentPane().add(stu_branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 300, 234, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 353, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 353, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Student Detail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/123456.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stu_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_nameActionPerformed

    private void stu_branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_branchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String student_id = stu_id.getText();
        String student_name = stu_name.getText();
        String father_name = stu_fname.getText();
        String course = (String)stu_course.getSelectedItem();
        String branch = (String)stu_branch.getSelectedItem();
        
        if(student_id.length() == 0 || student_name.length() == 0 || father_name.length() == 0){
            JOptionPane.showMessageDialog(null,"Enter All Details");
        }
        else{
                try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("insert into student values ('"+student_id+"','"+student_name+"','"+father_name+"','"+course+"','"+branch+"')");
                JOptionPane.showMessageDialog(null,"Succesfully Updated");
                setVisible(false);
                new new_student().setVisible(true);
            }
            catch(Exception e){
                System.out.print(e);
                JOptionPane.showMessageDialog(null,"Student id aleready exits");
                setVisible(false);
                new new_student().setVisible(true);
            }            
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DashBoard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(new_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> stu_branch;
    private javax.swing.JComboBox<String> stu_course;
    private javax.swing.JTextField stu_fname;
    private javax.swing.JTextField stu_id;
    private javax.swing.JTextField stu_name;
    // End of variables declaration//GEN-END:variables
}
