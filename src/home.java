
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author BST
 */
public class home extends javax.swing.JFrame {

    public int z = 0;

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        NPButton.setVisible(false);
        UPButton.setVisible(false);
        PDButton.setVisible(false);
        DPButton.setVisible(false);
        BDButton.setVisible(false);
        BButton.setVisible(false);
        RHButton.setVisible(false);
        DBButton.setVisible(false);
        LButton.setVisible(false);
        CAButton.setVisible(false);
        BHButton.setVisible(false);
        BGButton.setVisible(false);
        BarcodeG.setVisible(false);
        BillHistory.setVisible(false);
        CloseApplication.setVisible(false);
        NewProduct.setVisible(false);
        UpdateProduct.setVisible(false);
        ProductDetails.setVisible(false);
        DeleteProduct.setVisible(false);
        BuyerDetails.setVisible(false);
        Billing.setVisible(false);
        ReceiptHistory.setVisible(false);
        DeleteBill.setVisible(false);
        Logout.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        NPButton = new javax.swing.JButton();
        UPButton = new javax.swing.JButton();
        PDButton = new javax.swing.JButton();
        DPButton = new javax.swing.JButton();
        BButton = new javax.swing.JButton();
        LButton = new javax.swing.JButton();
        CAButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NewProduct = new javax.swing.JLabel();
        UpdateProduct = new javax.swing.JLabel();
        ProductDetails = new javax.swing.JLabel();
        DeleteProduct = new javax.swing.JLabel();
        Billing = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        CloseApplication = new javax.swing.JLabel();
        RHButton = new javax.swing.JButton();
        ReceiptHistory = new javax.swing.JLabel();
        DBButton = new javax.swing.JButton();
        DeleteBill = new javax.swing.JLabel();
        BDButton = new javax.swing.JButton();
        BuyerDetails = new javax.swing.JLabel();
        BillHistory = new javax.swing.JLabel();
        BHButton = new javax.swing.JButton();
        BGButton = new javax.swing.JButton();
        BarcodeG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu1.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 6, 63, 67));

        NPButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/new product.png"))); // NOI18N
        NPButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NPButton.setBorderPainted(false);
        NPButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                NPButtonComponentShown(evt);
            }
        });
        NPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 6, -1, -1));

        UPButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/update product.png"))); // NOI18N
        UPButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UPButton.setBorderPainted(false);
        UPButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                UPButtonComponentShown(evt);
            }
        });
        UPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 6, -1, -1));

        PDButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/details product.png"))); // NOI18N
        PDButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PDButton.setBorderPainted(false);
        PDButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PDButtonComponentShown(evt);
            }
        });
        PDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 6, -1, -1));

        DPButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/delete product.png"))); // NOI18N
        DPButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DPButton.setBorderPainted(false);
        DPButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DPButtonComponentShown(evt);
            }
        });
        DPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 6, -1, -1));

        BButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/billing.png"))); // NOI18N
        BButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BButton.setBorderPainted(false);
        BButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BButtonComponentShown(evt);
            }
        });
        BButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 6, -1, -1));

        LButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/logout.png"))); // NOI18N
        LButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LButton.setBorderPainted(false);
        LButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                LButtonComponentShown(evt);
            }
        });
        LButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 6, -1, -1));

        CAButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/Close.png"))); // NOI18N
        CAButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CAButton.setBorderPainted(false);
        CAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 6, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1163, 79, 37, -1));

        NewProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NewProduct.setText("New Product  ");
        getContentPane().add(NewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 80, 79, 18));

        UpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateProduct.setText("Update Product");
        getContentPane().add(UpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 18));

        ProductDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductDetails.setText("Product Details");
        getContentPane().add(ProductDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 18));

        DeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteProduct.setText("Delete Product");
        getContentPane().add(DeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, 18));

        Billing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Billing.setText("Billing");
        getContentPane().add(Billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 80, 40, 18));

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Logout.setText("Logout");
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 80, 50, 18));

        CloseApplication.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CloseApplication.setText("Close Application");
        CloseApplication.setAutoscrolls(true);
        getContentPane().add(CloseApplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 80, 100, 18));

        RHButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/details product.png"))); // NOI18N
        RHButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RHButton.setBorderPainted(false);
        RHButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                RHButtonComponentShown(evt);
            }
        });
        RHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RHButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RHButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 6, -1, -1));

        ReceiptHistory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ReceiptHistory.setText("Receipt History");
        getContentPane().add(ReceiptHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 80, 90, 18));

        DBButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/delete product.png"))); // NOI18N
        DBButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DBButton.setBorderPainted(false);
        DBButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DBButtonComponentShown(evt);
            }
        });
        DBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DBButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 6, -1, -1));

        DeleteBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBill.setText("Delete Bill");
        getContentPane().add(DeleteBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 80, 70, 18));

        BDButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/buyer Details.png"))); // NOI18N
        BDButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BDButton.setBorderPainted(false);
        BDButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BDButtonComponentShown(evt);
            }
        });
        BDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 6, -1, -1));

        BuyerDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuyerDetails.setText("Buyer Details");
        BuyerDetails.setName(""); // NOI18N
        getContentPane().add(BuyerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 80, 80, 18));

        BillHistory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BillHistory.setText("Bill History");
        getContentPane().add(BillHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 80, 70, 18));

        BHButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/details product.png"))); // NOI18N
        BHButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHButton.setBorderPainted(false);
        BHButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BHButtonComponentShown(evt);
            }
        });
        BHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BHButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 6, -1, -1));

        BGButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Billing Management System\\bms\\barcodeicon.png")); // NOI18N
        BGButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGButton.setBorderPainted(false);
        BGButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BGButtonComponentShown(evt);
            }
        });
        BGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BGButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 6, -1, -1));

        BarcodeG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BarcodeG.setText("Barcode generator");
        getContentPane().add(BarcodeG, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 110, 18));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/home.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPButtonActionPerformed
        // TODO add your handling code here:
        new newproduct().setVisible(true);
    }//GEN-LAST:event_NPButtonActionPerformed

    private void LButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LButtonActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you relly want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_LButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (z == 0) {
            try {
                Thread.sleep(250);
//                jButton2.setVisible(true);
//                jLabel1.setVisible(true);
                NPButton.setVisible(true);
                NewProduct.setVisible(true);
            } catch (Exception e) {
            }
        } else {
            NPButton.setVisible(false);
            UPButton.setVisible(false);
            PDButton.setVisible(false);
            DPButton.setVisible(false);
            BDButton.setVisible(false);
            BButton.setVisible(false);
            RHButton.setVisible(false);
            DBButton.setVisible(false);
            LButton.setVisible(false);
            CAButton.setVisible(false);
            BHButton.setVisible(false);
            BGButton.setVisible(false);
            BarcodeG.setVisible(false);
            BillHistory.setVisible(false);
            NewProduct.setVisible(false);
            UpdateProduct.setVisible(false);
            ProductDetails.setVisible(false);
            DeleteProduct.setVisible(false);
            BuyerDetails.setVisible(false);
            Billing.setVisible(false);
            ReceiptHistory.setVisible(false);
            DeleteBill.setVisible(false);
            Logout.setVisible(false);
            CloseApplication.setVisible(false);
            z = 0;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void NPButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_NPButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            UPButton.setVisible(true);
            UpdateProduct.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_NPButtonComponentShown

    private void UPButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_UPButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            PDButton.setVisible(true);
            ProductDetails.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_UPButtonComponentShown

    private void PDButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PDButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            DPButton.setVisible(true);
            DeleteProduct.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PDButtonComponentShown

    private void DPButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DPButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            BDButton.setVisible(true);
            BuyerDetails.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DPButtonComponentShown

    private void BButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            RHButton.setVisible(true);
            ReceiptHistory.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BButtonComponentShown

    private void LButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_LButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            CAButton.setVisible(true);
            CloseApplication.setVisible(true);
            z = 1;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_LButtonComponentShown

    private void PDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDButtonActionPerformed
        // TODO add your handling code here:
        new productdetails().setVisible(true);
    }//GEN-LAST:event_PDButtonActionPerformed

    private void UPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPButtonActionPerformed
        // TODO add your handling code here:
        new updateproduct().setVisible(true);
    }//GEN-LAST:event_UPButtonActionPerformed

    private void DPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPButtonActionPerformed
        // TODO add your handling code here:
        new deleteproduct().setVisible(true);
    }//GEN-LAST:event_DPButtonActionPerformed

    private void BButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BButtonActionPerformed
        // TODO add your handling code here:
        new billing().setVisible(true);
    }//GEN-LAST:event_BButtonActionPerformed

    private void RHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RHButtonActionPerformed
        // TODO add your handling code here:
        new billhistory().setVisible(true);
    }//GEN-LAST:event_RHButtonActionPerformed

    private void RHButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_RHButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            BHButton.setVisible(true);
            BillHistory.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_RHButtonComponentShown

    private void CAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAButtonActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you relly want to Close", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_CAButtonActionPerformed

    private void DBButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DBButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            LButton.setVisible(true);
            Logout.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DBButtonComponentShown

    private void DBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBButtonActionPerformed
        // TODO add your handling code here:
        new deletebill().setVisible(true);
    }//GEN-LAST:event_DBButtonActionPerformed

    private void BDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDButtonActionPerformed
        // TODO add your handling code here:
        new buyerdetails().setVisible(true);
    }//GEN-LAST:event_BDButtonActionPerformed

    private void BDButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BDButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            BButton.setVisible(true);
            Billing.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BDButtonComponentShown

    private void BHButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BHButtonComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            BGButton.setVisible(true);
            BarcodeG.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BHButtonComponentShown

    private void BHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHButtonActionPerformed
        new reports().setVisible(true);
    }//GEN-LAST:event_BHButtonActionPerformed

    private void BGButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BGButtonComponentShown
        try {
            Thread.sleep(250);
            DBButton.setVisible(true);
            DeleteBill.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BGButtonComponentShown

    private void BGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGButtonActionPerformed
        // TODO add your handling code here:
        new barcode3().setVisible(true);

    }//GEN-LAST:event_BGButtonActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BButton;
    private javax.swing.JButton BDButton;
    private javax.swing.JButton BGButton;
    private javax.swing.JButton BHButton;
    private javax.swing.JLabel BarcodeG;
    private javax.swing.JLabel BillHistory;
    private javax.swing.JLabel Billing;
    private javax.swing.JLabel BuyerDetails;
    private javax.swing.JButton CAButton;
    private javax.swing.JLabel CloseApplication;
    private javax.swing.JButton DBButton;
    private javax.swing.JButton DPButton;
    private javax.swing.JLabel DeleteBill;
    private javax.swing.JLabel DeleteProduct;
    private javax.swing.JButton LButton;
    private javax.swing.JLabel Logout;
    private javax.swing.JButton NPButton;
    private javax.swing.JLabel NewProduct;
    private javax.swing.JButton PDButton;
    private javax.swing.JLabel ProductDetails;
    private javax.swing.JButton RHButton;
    private javax.swing.JLabel ReceiptHistory;
    private javax.swing.JButton UPButton;
    private javax.swing.JLabel UpdateProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
