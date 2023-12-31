
import javax.swing.JTable;
import java.sql.*;
import Project.ConnectionProvider;
import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import java.text.ParseException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author BST
 */
public class buyerdetails extends javax.swing.JFrame {

    public static final String ACCOUNT_SID = "ACa07ebb9773ea127852aafdd3a2416041";
    public static final String AUTH_TOKEN = "51ba3db8f5eb3d4df89c126a6d753447";

    /**
     * Creates new form buyerdetails
     */
    public buyerdetails() {
        initComponents();
        jButton3.setVisible(false);

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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 450));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/Buyers Details ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 6, 262, 74));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/buyer Details.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 6, -1, 74));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, 588, 11));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 588, 250));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 365, 588, 10));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/print.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 381, 100, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/close Jframe.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 381, 100, -1));

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/Reset.png"))); // NOI18N
        jButton3.setText("Send SMS");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 381, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            jTable1.print(JTable.PrintMode.NORMAL);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from buyer");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
//        boolean a=jTable1.isEditing();
//        
//        if(a==false){
//            JOptionPane.showMessageDialog(null, "You can not edit this table");
//        }
//       \
        String customerName = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String contact =  jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();

        try {
            // Establish database connection
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT LVdate FROM buyer WHERE name = '" + customerName + "'");

            // Check if there is a result
            if (rs.next()) {
                String lastVisitDateString = rs.getString("LVdate");

                // Convert the last visit date string to java.sql.Date
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date lastVisitDateUtil = format.parse(lastVisitDateString);
                java.sql.Date lastVisitDate = new java.sql.Date(lastVisitDateUtil.getTime());

                // Compare lastVisitDate with current date to check if it has been 1 month
                // You can use the Java 8 LocalDate class for easier date comparison
                LocalDate lastVisit = lastVisitDate.toLocalDate();
                LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);

                if (lastVisit.isBefore(oneMonthAgo)) {
                    // Send a notification to the customer
//            System.out.println("Customer not visited from one month");
                    JOptionPane.showMessageDialog(null, "Customer not visited from one month");
                    jButton3.setVisible(true);
                    String messageBody = "Hi " + customerName +"! We miss seeing you at BST. Thank you for being a valued customer. As a token of our appreciation, we'd like to offer you an exclusive 10% discount on your next purchase. Hurry, this offer expires in 7 days! We're looking forward to welcoming you back. If you have any questions, feel free to reach us at 9158856817. Thank you and have a great day!";
                    String sendList[] = contact.split(",");
                    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

                    for (String to : sendList) {
                        Message message = Message.creator(
                                new com.twilio.type.PhoneNumber(to),
                                new com.twilio.type.PhoneNumber("+16203776061"),
                                messageBody)
                                .create();

                        System.out.println(message.getSid());
                    }
                    // Code to send the notification goes here
                } else {
                    // The customer has visited within the last month
//                    System.out.println("customer has visited");
                    JOptionPane.showMessageDialog(null, "Customer has visited");
                    jButton3.setVisible(false);

                    // Do something else if needed
                }
            }

            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            // Handle any database errors
            ex.printStackTrace();
        } catch (ParseException ex) {
            // Handle parsing errors
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(buyerdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyerdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyerdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyerdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buyerdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
