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
public class Rating extends javax.swing.JFrame {

    /**
     * Creates new form Rating
     */
    public Rating() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 147, 200));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setFont(new java.awt.Font("Pagul", 1, 15)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Samanata", 1, 15)); // NOI18N
        jLabel1.setText("order_id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 54, -1, -1));

        jLabel2.setFont(new java.awt.Font("Samanata", 1, 15)); // NOI18N
        jLabel2.setText("rating");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 130, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 56, 138, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 132, 138, -1));

        jButton1.setBackground(new java.awt.Color(117, 109, 185));
        jButton1.setFont(new java.awt.Font("Samanata", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(194, 73, 73));
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 245, -1, -1));

        jButton2.setBackground(new java.awt.Color(117, 109, 185));
        jButton2.setFont(new java.awt.Font("Samanata", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(194, 73, 73));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 245, -1, -1));

        jButton3.setBackground(new java.awt.Color(117, 109, 185));
        jButton3.setFont(new java.awt.Font("Samanata", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(194, 73, 73));
        jButton3.setText("SELECT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 245, -1, -1));

        jButton4.setBackground(new java.awt.Color(117, 109, 185));
        jButton4.setFont(new java.awt.Font("Samanata", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(194, 73, 73));
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 245, -1, -1));

        jButton5.setBackground(new java.awt.Color(117, 109, 185));
        jButton5.setFont(new java.awt.Font("Samanata", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(194, 73, 73));
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 245, -1, -1));

        jTable1.setBackground(new java.awt.Color(108, 112, 185));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "order_id", "rating"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 1, -1, 202));

        jScrollPane3.setViewportView(jScrollBar1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 1, -1, 288));

        jButton6.setBackground(new java.awt.Color(117, 109, 185));
        jButton6.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(194, 73, 73));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String sql="insert into rating values(?,?);";
        try{  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/videogame","root","RK1234");  
		PreparedStatement pstmt=con.prepareStatement(sql);  
                pstmt.setInt(1,Integer.parseInt(jTextField1.getText()));
                pstmt.setString(2,jTextField2.getText());
		pstmt.executeUpdate();  
                //if(x==1)
		//System.out.println("insertion successful");  
                JOptionPane.showMessageDialog(null,"insertion successful","show msg",JOptionPane.PLAIN_MESSAGE);
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          String sql="delete from rating where order_id=?;";
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
		ResultSet rs=stmt.executeQuery("select * from rating"); 
              	while(rs.next())
                {
		String order_id=rs.getString(1);
                String rating=rs.getString(2);
                String record[]={order_id,rating};
                tb1Model.addRow(record);
                }
		con.close();  
		}catch(Exception e){ System.out.println(e);}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String sql="update rating set rev_stars=? where order_id=?;";
        try{  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/videogame","root","RK1234");  
		PreparedStatement pstmt=con.prepareStatement(sql);  
                pstmt.setString(1,jTextField2.getText());
                pstmt.setString(2,jTextField1.getText());
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
            java.util.logging.Logger.getLogger(Rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rating().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
