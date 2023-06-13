
import java.sql.*;
import Project.ConnectionProvider;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.awt.Label;
import java.net.URI;
import java.math.BigDecimal;
import java.util.Arrays;
import javax.swing.Timer;

/**
 *
 * @author BST
 */
public class billing extends javax.swing.JFrame {

    public static final String ACCOUNT_SID = "ACa07ebb9773ea127852aafdd3a2416041";
    public static final String AUTH_TOKEN = "51ba3db8f5eb3d4df89c126a6d753447";

    public int finalTotal = 0;
    public Double Stcok_qty = 0.0;

    /**
     * Creates new form billing
     */
    // Declare a Timer variable
    private Timer timer;

    public billing() {
        initComponents();

        // Initialize the Timer with an interval of 1 second (1000 milliseconds)
        timer = new Timer(1000, e -> updateDateTime());
        timer.start(); // Start the timer

    }

    private void updateDateTime() {
        // Update the date
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel5.setText(dFormat.format(date));
        jLabel5.revalidate();

        // Update the time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        jLabel8.setText(dtf.format(now));
        jLabel8.revalidate();
    }

    DefaultTableModel model;

    public void stckup() {
        DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
        int rc = dt.getRowCount();

        if (rc > 0) {
            // Get the last row in the table
            int lastRow = rc - 1;

            String codeId = jTextField14.getText();
            String sell_qty = jTextField8.getText();

            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT Qty From product WHERE codeId = '" + codeId + "' ");

                if (rs.next()) {
                    Stcok_qty = Double.valueOf(rs.getString("Qty"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            Double st_qty = Stcok_qty;
            Double Sel_qty = Double.valueOf(sell_qty);

            Double nqty = st_qty - Sel_qty; // new qty = stock qty - sell qty

            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("UPDATE product SET Qty = '" + nqty + "' WHERE codeId = '" + codeId + "'  "); //update new qty in product table

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void checkStockQty() {
        if (Double.parseDouble(l_stqty.getText()) < 10.0) {
            JOptionPane.showMessageDialog(this, "Product quantity is getting low, please order more stock!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtbrecipt = new javax.swing.JTextArea();
        billprint = new javax.swing.JButton();
        receipt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField13 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        l_stqty = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        val_gst = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 150));
        setMinimumSize(new java.awt.Dimension(1171, 798));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1171, 798));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/billing.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 78));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 99));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Time:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 40, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 110, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1150, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Product Details");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("PID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 42, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 43, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Product Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 201, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Price");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 35, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 100, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Quantity");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 100, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Description");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, 190, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.setToolTipText("");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, 100, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 1150, 10));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Quantity", "Total"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 665, 200));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Calculation Details:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("GST");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 31, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Paid Amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 90, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Return Amt");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 690, 80, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 220, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 230, -1));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, 230, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/Reset.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, 100, 30));

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/close Jframe.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 740, 100, 30));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtbrecipt.setColumns(20);
        txtbrecipt.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtbrecipt.setRows(5);
        jScrollPane4.setViewportView(txtbrecipt);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 390, 364));

        billprint.setBackground(new java.awt.Color(153, 204, 255));
        billprint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        billprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/print.png"))); // NOI18N
        billprint.setText("Print");
        billprint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        billprint.setBorderPainted(false);
        billprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billprintActionPerformed(evt);
            }
        });
        getContentPane().add(billprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 740, 100, 30));

        receipt.setBackground(new java.awt.Color(153, 204, 255));
        receipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        receipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/save.png"))); // NOI18N
        receipt.setText("Receipt");
        receipt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        receipt.setBorderPainted(false);
        receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptActionPerformed(evt);
            }
        });
        getContentPane().add(receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 740, 100, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 110, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Bill ID");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 60, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("10");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 30, 40));

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/save.png"))); // NOI18N
        jButton5.setText("Save");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 740, 110, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Buyer Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 160, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Contact No");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setText("+91");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 160, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Email");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setText("@gmail.com");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 250, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Address");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 55, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 256, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1150, 10));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 230, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Total");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 43, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("%");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, -1, -1));

        l_stqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_stqty.setText("00.00");
        getContentPane().add(l_stqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 48, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Stock Qty:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Barcode");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 25));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 129, -1));

        val_gst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5", "12", "18", "28" }));
        val_gst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val_gstActionPerformed(evt);
            }
        });
        getContentPane().add(val_gst, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 50, -1));

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/close Jframe.png"))); // NOI18N
        jButton6.setText("Close");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 740, 100, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Discount");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 80, -1));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, 60, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("%");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, -1, 20));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 180, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Pictures\\Saved Pictures\\billing background.png")); // NOI18N
        jLabel32.setMaximumSize(new java.awt.Dimension(1171, 798));
        jLabel32.setMinimumSize(new java.awt.Dimension(1171, 798));
        jLabel32.setPreferredSize(new java.awt.Dimension(1171, 798));
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String productId = jTextField5.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *from product where productId='" + productId + "'");
            if (rs.next()) {
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText("1");
                jTextField9.setText(rs.getString(4));
                l_stqty.setText(rs.getString(7));
                jTextField14.setText(rs.getString(6));
            } else {
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField14.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Double sell_qty = Double.valueOf(jTextField8.getText());
        Double stk_qty = Double.valueOf(l_stqty.getText());
        String sta = val_gst.getSelectedItem().toString();

        if (sell_qty < stk_qty) {
            int price = Integer.parseInt(jTextField7.getText());
            int quantity = Integer.parseInt(jTextField8.getText());
            int gstValue = Integer.parseInt(sta);
            int gstAmount = (int) ((gstValue / 100.0) * price * quantity); // calculate the GST amount as an integer
            jTextField10.setText(String.valueOf(gstAmount));
            int stotal = price * quantity;
            int total = (int) (price * quantity + gstAmount); // add the GST amount to the total
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.addRow(new Object[]{jTextField6.getText(), jTextField9.getText(), price, quantity, stotal});
            finalTotal = finalTotal + total;
            String finalTotal1 = String.valueOf(finalTotal);
            jTextField13.setText(finalTotal1);
        } else {
            JOptionPane.showMessageDialog(jLabel15, "Stock is not sufficient! Available stock: " + stk_qty, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        stckup();
        try {
            String codeId = jTextField5.getText();
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Qty From product WHERE productId = '" + codeId + "' ");

            if (rs.next()) {

                String l_stqty1 = rs.getString("Qty");
                Label label = new Label();
                l_stqty.setText(l_stqty1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
//        String paidAmount = jTextField11.getText();
//        String ramt = jTextField13.getText();
//        int z = Integer.parseInt(paidAmount);
//        int r = Integer.parseInt(ramt);
//        finalTotal = r - z;
//        String finalTotal1 = String.valueOf(finalTotal);
//        jTextField12.setText(finalTotal1);
//        jTextField12.setEditable(false);
////        finalTotal1 = String.valueOf(null);
        String paidAmount = jTextField11.getText();
        String discountAmount = jTextField13.getText();

//        double paid = Double.parseDouble(paidAmount);
//        double discount = Double.parseDouble(discountAmount);
//        double remainingAmount = discount - paid;
//        int remainingAmountInt = (int) remainingAmount;
//        String remainingAmountString = String.valueOf(remainingAmount);
        int paid = Integer.parseInt(paidAmount);
        int discount = Integer.parseInt(discountAmount);
        int remainingAmount = discount - paid;
        String remainingAmountString = String.valueOf(remainingAmount);

        jTextField12.setText(remainingAmountString);
        jTextField12.setEditable(false);
        jTextField10.setEditable(false);
        jTextField13.setEditable(false);

    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void bill() {
        String total = jTextField13.getText();
        String paid = jTextField11.getText();
        String returnAmount = jTextField12.getText();
        String sta = val_gst.getSelectedItem().toString();
        String discount = jTextField15.getText();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

        txtbrecipt.setText(txtbrecipt.getText() + "***********************************************\n");
        txtbrecipt.setText(txtbrecipt.getText() + "                    BSTBILL                    \n");
        txtbrecipt.setText(txtbrecipt.getText() + "***********************************************\n");
        txtbrecipt.setText(txtbrecipt.getText() + "Bill Id : " + jLabel9.getText() + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "Product" + "\t\t" + "Qty" + "\t" + "Price" + "\t" + "Amount" + "\n");

        for (int i = 0; i < model.getRowCount(); i++) {
            String pname = (String) model.getValueAt(i, 0);
            int price = (Integer) model.getValueAt(i, 2);
            int Qty = (Integer) model.getValueAt(i, 3);
            int amount = (Integer) model.getValueAt(i, 4);
//            txtbrecipt.setFont(txtbrecipt.getFont().deriveFont(Font.BOLD, 12f));
            txtbrecipt.setText(txtbrecipt.getText() + pname + "\t" + Qty + "\t" + price + "\t" + amount + "\n");
        }

        txtbrecipt.setText(txtbrecipt.getText() + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\t" + "GST" + sta + "% : " + jTextField10.getText() + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Discount" + discount + "% : " + jTextField16.getText() + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Subtotal : " + total + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Paid : " + paid + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Return : " + returnAmount + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Date : " + jLabel5.getText() + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\t" + "Time : " + jLabel8.getText() + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "\n");
        txtbrecipt.setText(txtbrecipt.getText() + "***********************************************\n");
        txtbrecipt.setText(txtbrecipt.getText() + "             THANK YOU COME AGAIN            \n");
    }

    public void billdata() {
        String name = jTextField1.getText();
        String contactNo = jTextField2.getText();
        String email = jTextField3.getText();
        String address = jTextField4.getText();
        String date = jLabel5.getText();
        String sta = val_gst.getSelectedItem().toString();
        String discount = jTextField15.getText();
        String path = "F:\\bmsbilldata\\bill ";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + " " + name + " " + jLabel9.getText() + " " + jLabel5.getText() + ".pdf"));
            // check if the row already exists
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM buyer WHERE name = '" + name + "' AND contactNo = '" + contactNo + "' AND email = '" + email + "' AND address = '" + address + "' AND LVdate = '" + date + "' ");
            rs.next();
            int count = rs.getInt(1);
            if (count > 0) {
                // buyer details already exist, don't save again
                JOptionPane.showMessageDialog(null, "Buyer details already exist in database.");
            } else {
                // insert the row if it doesn't exist
                if (!rs.next()) {
                    String query = "INSERT INTO buyer(name,contactNo,email,address,LVdate) values('" + name + "','" + contactNo + "','" + email + "','" + address + "','" + date + "')";
                    st.executeUpdate(query);
                }
//                JOptionPane.showMessageDialog(null, "Buyer details saved successfully");
            }
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                              BST(Billing Manaagement System)\n                                             Contact Number:(+91)9158856817\n\n");
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph("Date & Time: " + jLabel5.getText() + " " + jLabel8.getText() + "\nBuyer Details: \nName: " + name + "\nContact No: " + contactNo + "\nEmail: " + email + "\nAddress: " + address + "\nProduct Details:\n\n");
            doc.add(paragraph2);
            PdfPTable tb1 = new PdfPTable(8);
            tb1.addCell("Bill Id");
            tb1.addCell("Name");
            tb1.addCell("Description");
            tb1.addCell("Rate");
            tb1.addCell("Quantity");
            String gstColumn = "GST" + sta + "%";
            tb1.addCell(gstColumn);
            String dct = "Discount" + discount + "%";
            tb1.addCell(dct);
            tb1.addCell("Total");
            for (int i = 0; i < jTable3.getRowCount(); i++) {
                String p = jLabel9.getText();
                String n = jTable3.getValueAt(i, 0).toString();
                String d = jTable3.getValueAt(i, 1).toString();
                String r = jTable3.getValueAt(i, 2).toString();
                String q = jTable3.getValueAt(i, 3).toString();
                String s = jTable3.getValueAt(i, 4).toString();
                String g = jTextField10.getText();
                String dic = jTextField16.getText();

                tb1.addCell(p);
                tb1.addCell(n);
                tb1.addCell(d);
                tb1.addCell(r);
                tb1.addCell(q);
                tb1.addCell(g);
                tb1.addCell(s);

            }
            doc.add(tb1);
            Paragraph paragraph3 = new Paragraph("\nSubTotal: " + jTextField13.getText() + "\nPaid Amount: " + jTextField11.getText() + "\nReturn Amount: " + jTextField12.getText() + "\n\nThank you for Visiting \n!Please Come Again. \nBST");
            doc.add(paragraph3);

//            setVisible(false);
//            new billing().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // Set the billSaved variable to true after the bill is saved
        JOptionPane.showMessageDialog(null, "Bill Generated");
//            billSaved = true;
        doc.close();
    }
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
//        boolean a = jTable1.isEditing();
//
//        if (a == false) {
//            JOptionPane.showMessageDialog(null, "You can not edit this table");
//        }
        // Get the selected row index
//        int rowIndex = jTable3.getSelectedRow();
//
//        // Show confirmation dialog
//        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
//
//        if (option == JOptionPane.YES_OPTION) {
//            // Delete the row
//            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
//            model.removeRow(rowIndex);
//
//            // Show success message
//            JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
//        }

        // Get the selected row index
        int rowIndex = jTable3.getSelectedRow();

        // Show confirmation dialog
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            // Delete the row
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            Object Name = model.getValueAt(rowIndex, 0);
            Object Quantity = model.getValueAt(rowIndex, 3);
            model.removeRow(rowIndex);

            // Show success message
            JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Update the database
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT Qty FROM product WHERE productName = '" + Name + "'");
                if (rs.next()) {
                    double stockQty = Double.parseDouble(rs.getString("Qty"));
                    double selectedQty = Double.parseDouble(Quantity.toString());
                    double newQty = stockQty + selectedQty; // new qty = stock qty + sell qty
                    st.executeUpdate("UPDATE product SET Qty = '" + newQty + "' WHERE productName = '" + Name + "'");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_jTable3MouseClicked

    private void receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptActionPerformed
        // TODO add your handling code here:
        bill();
    }//GEN-LAST:event_receiptActionPerformed

    private void billprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billprintActionPerformed
        // TODO add your handling code here:
        try {
            txtbrecipt.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_billprintActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select max(rID) from receipt");
            if (rs.first()) {
                int id = rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                jLabel9.setText(str);
            } else {
                jLabel9.setText("1");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String sta = val_gst.getSelectedItem().toString();
        String gst = (sta + "%");
        String rID = jLabel9.getText();
        String subtotal = jTextField13.getText();
        String paid = jTextField11.getText();
        String returnamount = jTextField12.getText();
        String date = jLabel5.getText();
        String time = jLabel8.getText();
        String cname = jTextField1.getText();
        String Gst = (jTextField10.getText());

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            for (int i = 0; i < model.getRowCount(); i++) {
                String pName = (String) model.getValueAt(i, 0);
                int price = (Integer) model.getValueAt(i, 2);
                int qty = (Integer) model.getValueAt(i, 3);
                int tamount = (Integer) model.getValueAt(i, 4);

                st.executeUpdate("insert into receipt values('" + rID + "','" + cname + "','" + pName + "','" + qty + "','" + price + "','" + tamount + "','" + gst + "','" + Gst + "','" + subtotal + "','" + paid + "','" + returnamount + "','" + date + "','" + time + "')");
            }
            JOptionPane.showMessageDialog(null, "Succebssfully Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        billdata();
        String messageBody = txtbrecipt.getText();
        String sendList[] = jTextField2.getText().split(",");
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        for (String to : sendList) {
            Message message = Message.creator(
                    new com.twilio.type.PhoneNumber(to),
                    new com.twilio.type.PhoneNumber("+16203776061"),
                    messageBody)
                    .create();

            System.out.println(message.getSid());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *from buyer where name like '" + name + "%'");
            if (rs.next()) {
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
            } else {
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String contactNo = jTextField2.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *from buyer where contactNo like '" + contactNo + "%'");
            if (rs.next()) {
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
            } else {
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        // TODO add your handling code here:
        String codeId = jTextField14.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *from product where codeId='" + codeId + "'");
            if (rs.next()) {
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText("1");
                jTextField9.setText(rs.getString(4));
                l_stqty.setText(rs.getString(7));
                jTextField5.setText(rs.getString(1));

            } else {
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                l_stqty.setText("");
                jTextField1.setText("");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
        checkStockQty();

    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void val_gstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_gstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_val_gstActionPerformed

    private void jTextField15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyReleased

        double totalBeforeDiscount = Integer.parseInt(jTextField13.getText());

        double discountPercentage = Double.parseDouble(jTextField15.getText());
        double discountAmount = discountPercentage / 100.0 * totalBeforeDiscount; // Calculate the discount amount
        double finalTotal = totalBeforeDiscount - discountAmount; // Subtract the discount amount from the total

        jTextField16.setText(String.valueOf(discountAmount)); // Display the discount amount
        jTextField13.setText(String.valueOf(finalTotal)); // Display the final total amount

    }//GEN-LAST:event_jTextField15KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField15KeyTyped

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
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billprint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel l_stqty;
    private javax.swing.JButton receipt;
    private javax.swing.JTextArea txtbrecipt;
    private javax.swing.JComboBox<String> val_gst;
    // End of variables declaration//GEN-END:variables
}
