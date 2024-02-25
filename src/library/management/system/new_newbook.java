/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adima
 */
public class new_newbook extends javax.swing.JFrame {

    /**
     * Creates new form new_newbook
     */
    public new_newbook() {
        initComponents();
    }
    boolean val = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        author_name = new javax.swing.JTextField();
        published = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        book_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/123456.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Publish Year");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 86, 30));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 285, 30));
        getContentPane().add(author_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 285, 30));
        getContentPane().add(published, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 285, 30));

        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 285, 30));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 285, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Published By");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, 30));

        book_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_id.setText("Book ID");
        getContentPane().add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 86, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 86, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Author Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 86, 30));

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 285, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Add Book");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/123456.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String bookid = id.getText();
        String name = name1.getText();
        String authorname = author_name.getText();
        String publishby = published.getText();
        String year1 = year.getText();
        String price1 = price.getText();
        
        if(bookid.length() == 0 || name.length() == 0 || authorname.length() == 0 || publishby.length() == 0 ||year1.length() == 0  ||price1.length() == 0){
            JOptionPane.showMessageDialog(null,"Enter All Details");
        }
        else{
                try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("insert into book values ('"+bookid+"','"+name+"','"+authorname+"','"+publishby+"','"+year1+"','"+price1+"')");
                JOptionPane.showMessageDialog(null,"Succesfully Updated");
                setVisible(false);
                new new_student().setVisible(true);
            }
            catch(Exception e){
                System.out.print(e);
                JOptionPane.showMessageDialog(null,"Book Id is alerady exits");
                setVisible(false);
                new new_student().setVisible(true);
            }            
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

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
            java.util.logging.Logger.getLogger(new_newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_newbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_name;
    private javax.swing.JLabel book_id;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField published;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
