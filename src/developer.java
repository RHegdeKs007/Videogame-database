/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rakshith
 */
public class developer extends javax.swing.JFrame {

    /**
     * Creates new form developer
     */
    public developer() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(100, 100, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 2, 2));
        jLabel1.setText("dev_id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("dev_name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 92, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("dev_website");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 40, 136, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 86, 136, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 141, 146, -1));

        jButton1.setBackground(new java.awt.Color(133, 110, 201));
        jButton1.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(196, 100, 100));
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(133, 110, 201));
        jButton2.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(196, 100, 100));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 280, -1, -1));

        jButton3.setBackground(new java.awt.Color(133, 110, 201));
        jButton3.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(196, 100, 100));
        jButton3.setText("SELECT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 280, -1, -1));

        jButton4.setBackground(new java.awt.Color(133, 110, 201));
        jButton4.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(196, 100, 100));
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jButton5.setBackground(new java.awt.Color(133, 110, 201));
        jButton5.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(196, 100, 100));
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 280, -1, -1));

        jTable1.setBackground(new java.awt.Color(147, 147, 200));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "dev_id", "dev_name", "dev_website"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 450, 190));

        jButton6.setBackground(new java.awt.Color(133, 110, 201));
        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(196, 100, 100));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -100, -1, 600));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(147, 147, 200));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String sql="insert into Developer values(?,?,?);";
        try{  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/videogame","root","RK1234");  
		PreparedStatement pstmt=con.prepareStatement(sql);  
                pstmt.setInt(1,Integer.parseInt(jTextField1.getText()));
                pstmt.setString(2,jTextField2.getText());
                pstmt.setString(3,jTextField3.getText());
		pstmt.executeUpdate();  
                //if(x==1)
		//System.out.println("insertion successful");  
                JOptionPane.showMessageDialog(null,"insertion successful","show msg",JOptionPane.PLAIN_MESSAGE);
		con.close();  
		}catch(Exception e){ System.out.println(e);} 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           String sql="delete from Developer where dev_id=?;";
        try{  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/videogame","root","RK1234");  
		PreparedStatement pstmt=con.prepareStatement(sql);  
                pstmt.setString(1,jTextField1.getText());
                int x=pstmt.executeUpdate();  
                if(x>=1)
		System.out.println("deletion successful");  
		con.close();  
		}catch(Exception e){ System.out.println(e);} 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel tb1Model=(DefaultTableModel)jTable1.getModel();
       tb1Model.setRowCount(0);
        try{  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/videogame","root","RK1234");  
		 
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from Developer"); 
              	while(rs.next())
                {
		String dev_id=rs.getString(1);
                String dev_name=rs.getString(2);
                String dev_website=rs.getString(3);
                String record[]={dev_id,dev_name,dev_website};
                tb1Model.addRow(record);
                }
		con.close();  
		}catch(Exception e){ System.out.println(e);}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          String sql="update Developer set dev_name=?,dev_website=?,where dev_id=?;";
        try{  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/videogame","root","RK1234");  
		PreparedStatement pstmt=con.prepareStatement(sql);  
                pstmt.setString(1,jTextField2.getText());
                pstmt.setString(2,jTextField3.getText()); 
                pstmt.setString(3,jTextField1.getText());
		int x=pstmt.executeUpdate();  
                if(x==1)
		System.out.println("Updation successful");  
		con.close();  
		}catch(Exception e){ System.out.println(e);}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         jTextField1.setText("");
          jTextField2.setText("");
          jTextField3.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new options().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new developer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
