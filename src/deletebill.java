
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author BST
 */
public class deletebill extends javax.swing.JFrame {

    /**
     * Creates new form deletebill
     */
    public deletebill() {
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

        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtbrecipt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 588, 10));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/Reset.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\deletebill.gif")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 250, 90));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/details product.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 15, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/print.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 100, 30));

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/close Jframe.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 100, 30));

        txtbrecipt.setColumns(20);
        txtbrecipt.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtbrecipt.setRows(5);
        jScrollPane4.setViewportView(txtbrecipt);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 164, 390, 380));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Bill ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 102, 160, -1));

        jTextField1.setBackground(new java.awt.Color(153, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/search.png"))); // NOI18N
        jTextField1.setText("Search");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setBorderPainted(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 102, 100, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 588, 10));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/delete.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 100, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            txtbrecipt.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deletebill().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
//        String rId = rId.getText();

        String receiptId = jTextField2.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select *from receipt where rID='" + receiptId + "%'");
            if (rs.next()) {
                StringBuilder productInfo = new StringBuilder();
                while (rs.next()) {
                    String pName = rs.getString("pName");
                    String qty = rs.getString("qty");
                    String price = rs.getString("price");
                    String tamount = rs.getString("tamount");

                    productInfo.append(pName).append("\t").append(qty).append("\t").append(price).append("\t").append(tamount).append("\n");
                }

                // Get other details for the receipt
                rs.beforeFirst();
                rs.next();
                String subtotal = rs.getString("subtotal");
                String paid = rs.getString("paid");
                String returnAmount = rs.getString("returnamount");
                String date = rs.getString("date");
                String time = rs.getString("time");

                // Display the receipt
                txtbrecipt.setText("");
                txtbrecipt.setText(txtbrecipt.getText() + "***********************************************\n");
                txtbrecipt.setText(txtbrecipt.getText() + "                    BSTBILL                    \n");
                txtbrecipt.setText(txtbrecipt.getText() + "***********************************************\n");
                txtbrecipt.setText(txtbrecipt.getText() + "Bill Id : " + jTextField2.getText() + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "Product" + "\t\t" + "Qty" + "\t" + "Price" + "\t" + "Amount" + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + productInfo);
                txtbrecipt.setText(txtbrecipt.getText() + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Subtotal : " + subtotal + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Paid : " + paid + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Return : " + returnAmount + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Date : " + date + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Time : " + time + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "\n");
                txtbrecipt.setText(txtbrecipt.getText() + "***********************************************\n");
                txtbrecipt.setText(txtbrecipt.getText() + "             THANK YOU COME AGAIN            \n");
                jTextField2.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Product Id does not Exist");
            }

//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }

            // Close resources
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String receiptId = jTextField2.getText();
        int a=JOptionPane.showConfirmDialog(null, "Do you want to Delete","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("delete from receipt where rID='"+receiptId+"'");
                setVisible(false);
                new deletebill().setVisible(true);
            }               
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

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
            java.util.logging.Logger.getLogger(billhistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billhistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billhistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billhistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletebill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txtbrecipt;
    // End of variables declaration//GEN-END:variables
}
