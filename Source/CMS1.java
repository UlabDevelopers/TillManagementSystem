package canteenmanagementsystem;

import static canteenmanagementsystem.InsertMarketProduct.DRIVER;
import static canteenmanagementsystem.InsertMarketProduct.JDBC_URL;
import static canteenmanagementsystem.InsertMarketProduct.con;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

    
public class CMS1 extends javax.swing.JFrame {

    public static final String DRIVER="org.sqlite.JDBC";
    public static final String JDBC_URL="jdbc:sqlite:CMSData.db";
    public static Connection con;
    public static String AcCName="Customer Name";
    public CMS1() {
        
        initComponents();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jColdDrinks = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jChocolate = new javax.swing.JButton();
        jBiscuits = new javax.swing.JButton();
        jSweets = new javax.swing.JButton();
        jCooking = new javax.swing.JButton();
        jOther = new javax.swing.JButton();
        jNamakin = new javax.swing.JButton();
        jChips = new javax.swing.JButton();
        jColdDrinksCost = new javax.swing.JTextField();
        jColdDrinksNumber = new javax.swing.JTextField();
        jChipsCost = new javax.swing.JTextField();
        jSweetsNumber = new javax.swing.JTextField();
        jChipsNumber = new javax.swing.JTextField();
        jBiscuitsNumber = new javax.swing.JTextField();
        jBiscuitsCost = new javax.swing.JTextField();
        jChocolateNumber = new javax.swing.JTextField();
        jSweetsCost = new javax.swing.JTextField();
        jChocolateCost = new javax.swing.JTextField();
        jCookingNumber = new javax.swing.JTextField();
        jCookingCost = new javax.swing.JTextField();
        jNamakinNumber = new javax.swing.JTextField();
        jNamakinCost = new javax.swing.JTextField();
        jTotalNumber = new javax.swing.JTextField();
        jOtherNumber = new javax.swing.JTextField();
        jTotalCost = new javax.swing.JTextField();
        jOtherCost = new javax.swing.JTextField();
        jTotal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jAcHolderProducts = new javax.swing.JTextField();
        jAcHolderCost = new javax.swing.JTextField();
        jAcHolderReset = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jAcHolderMakeRecipt = new javax.swing.JButton();
        jAcHolderCustomer = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTempCustomer = new javax.swing.JTextField();
        jTempProducts = new javax.swing.JTextField();
        jTempCost = new javax.swing.JTextField();
        jTempShowRecipt = new javax.swing.JButton();
        jMoneyPaid = new javax.swing.JButton();
        jTempReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jInsertMarketItems = new javax.swing.JMenuItem();
        jInsertCookingItems = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jDeleteMarketItems = new javax.swing.JMenuItem();
        jDeleteCookingItems = new javax.swing.JMenuItem();
        History = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Till Management System (ADMIN)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(710, 750));
        jPanel2.setPreferredSize(new java.awt.Dimension(710, 750));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Products In Canteen ");

        jColdDrinks.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jColdDrinks.setText("Cold Drinks");
        jColdDrinks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jColdDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColdDrinksActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Cost Of Products");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Name Of Products");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("No. Of Products");

        jChocolate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jChocolate.setText("Chocolate");
        jChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChocolateActionPerformed(evt);
            }
        });
        jChocolate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jChocolateKeyReleased(evt);
            }
        });

        jBiscuits.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBiscuits.setText("Tea");
        jBiscuits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBiscuits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiscuitsActionPerformed(evt);
            }
        });

        jSweets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSweets.setText("Ice Cream");
        jSweets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSweetsActionPerformed(evt);
            }
        });

        jCooking.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCooking.setText("Bangla Foods");
        jCooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCookingActionPerformed(evt);
            }
        });

        jOther.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jOther.setText("Chinese Foods");
        jOther.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOtherActionPerformed(evt);
            }
        });

        jNamakin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jNamakin.setText("Snacks");
        jNamakin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNamakin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamakinActionPerformed(evt);
            }
        });

        jChips.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jChips.setText("Chips");
        jChips.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChipsActionPerformed(evt);
            }
        });

        jColdDrinksCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jColdDrinksCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jColdDrinksCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jColdDrinksCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColdDrinksCostActionPerformed(evt);
            }
        });

        jColdDrinksNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jColdDrinksNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jColdDrinksNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jColdDrinksNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColdDrinksNumberActionPerformed(evt);
            }
        });

        jChipsCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jChipsCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jChipsCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jChipsCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChipsCostActionPerformed(evt);
            }
        });

        jSweetsNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jSweetsNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jSweetsNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jSweetsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSweetsNumberActionPerformed(evt);
            }
        });

        jChipsNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jChipsNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jChipsNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jChipsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChipsNumberActionPerformed(evt);
            }
        });

        jBiscuitsNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jBiscuitsNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jBiscuitsNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jBiscuitsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiscuitsNumberActionPerformed(evt);
            }
        });

        jBiscuitsCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jBiscuitsCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jBiscuitsCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jBiscuitsCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiscuitsCostActionPerformed(evt);
            }
        });

        jChocolateNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jChocolateNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jChocolateNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jChocolateNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChocolateNumberActionPerformed(evt);
            }
        });

        jSweetsCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jSweetsCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jSweetsCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jSweetsCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSweetsCostActionPerformed(evt);
            }
        });

        jChocolateCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jChocolateCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jChocolateCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jChocolateCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChocolateCostActionPerformed(evt);
            }
        });

        jCookingNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jCookingNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jCookingNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jCookingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCookingNumberActionPerformed(evt);
            }
        });

        jCookingCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jCookingCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jCookingCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jCookingCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCookingCostActionPerformed(evt);
            }
        });

        jNamakinNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jNamakinNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jNamakinNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jNamakinNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamakinNumberActionPerformed(evt);
            }
        });

        jNamakinCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jNamakinCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jNamakinCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jNamakinCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamakinCostActionPerformed(evt);
            }
        });

        jTotalNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTotalNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTotalNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTotalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalNumberActionPerformed(evt);
            }
        });

        jOtherNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jOtherNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jOtherNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jOtherNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOtherNumberActionPerformed(evt);
            }
        });

        jTotalCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTotalCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTotalCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalCostActionPerformed(evt);
            }
        });

        jOtherCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jOtherCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jOtherCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jOtherCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOtherCostActionPerformed(evt);
            }
        });

        jTotal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jTotal.setText("Total  :-");
        jTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSweets, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jBiscuits, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jChips, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jCooking, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jColdDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jNamakin, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jOther, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTotal))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChocolateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jColdDrinksNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSweetsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBiscuitsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChipsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNamakinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCookingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOtherNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTotalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jChocolateCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jColdDrinksCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jSweetsCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jBiscuitsCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jChipsCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jNamakinCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jCookingCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jOtherCost, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTotalCost))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jColdDrinksNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jColdDrinks)
                    .addComponent(jColdDrinksCost))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChocolateCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChocolateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChocolate))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSweetsCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSweetsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSweets))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBiscuitsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBiscuitsCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBiscuits))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChips)
                    .addComponent(jChipsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChipsCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNamakin)
                    .addComponent(jNamakinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNamakinCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCooking)
                    .addComponent(jCookingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCookingCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOtherNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOtherCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOther))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(710, 750));
        jPanel3.setPreferredSize(new java.awt.Dimension(710, 750));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jTabbedPane4.setName(""); // NOI18N
        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(619, 770));
        jPanel6.setVerifyInputWhenFocusTarget(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel11.setText("Name of Customer    :-");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel12.setText("Total Cost(Tk)         :-");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel13.setText("Number of Products  :-");

        jAcHolderProducts.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jAcHolderProducts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jAcHolderProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcHolderProductsActionPerformed(evt);
            }
        });

        jAcHolderCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jAcHolderCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jAcHolderReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jAcHolderReset.setText("Reset");
        jAcHolderReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAcHolderReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcHolderResetActionPerformed(evt);
            }
        });

        jSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jSave.setText("Save");
        jSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/pic5.png"))); // NOI18N

        jAcHolderMakeRecipt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jAcHolderMakeRecipt.setText("Show Recipt");
        jAcHolderMakeRecipt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAcHolderMakeRecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcHolderMakeReciptActionPerformed(evt);
            }
        });

        jAcHolderCustomer.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jAcHolderCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer Name" }));
        jAcHolderCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAcHolderCustomer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jAcHolderCustomerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jAcHolderCustomerFocusLost(evt);
            }
        });
        jAcHolderCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAcHolderCustomerMouseClicked(evt);
            }
        });
        jAcHolderCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcHolderCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(114, 114, 114))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jAcHolderCost, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jAcHolderMakeRecipt)
                                .addGap(59, 59, 59)
                                .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jAcHolderReset, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jAcHolderProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAcHolderCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAcHolderCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAcHolderProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAcHolderCost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAcHolderMakeRecipt)
                    .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAcHolderReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        jTabbedPane4.addTab("Account Holder", jPanel6);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel3.setText("Name of Customer    :-");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel7.setText("Total Cost(Tk)         :-");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel8.setText("Number of Products  :-");

        jTempCustomer.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTempCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTempCustomerActionPerformed(evt);
            }
        });

        jTempProducts.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTempProducts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTempCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTempCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTempShowRecipt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTempShowRecipt.setText("Show Recipt");
        jTempShowRecipt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTempShowRecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTempShowReciptActionPerformed(evt);
            }
        });

        jMoneyPaid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMoneyPaid.setText("Money Paid");
        jMoneyPaid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMoneyPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMoneyPaidActionPerformed(evt);
            }
        });

        jTempReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTempReset.setText("Reset");
        jTempReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTempReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTempResetActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/pic5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(jTempCost, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jMoneyPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTempShowRecipt)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTempReset, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTempProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTempCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(99, 99, 99))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTempCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTempProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTempCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMoneyPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTempShowRecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTempReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        jTabbedPane4.addTab("Temporary Customer", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        jMenu1.setText("File");

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/Insert Items.png"))); // NOI18N
        jMenu2.setText("Insert Item");

        jInsertMarketItems.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jInsertMarketItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/Insert Items.png"))); // NOI18N
        jInsertMarketItems.setText("Insert Market Items");
        jInsertMarketItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertMarketItemsActionPerformed(evt);
            }
        });
        jMenu2.add(jInsertMarketItems);

        jInsertCookingItems.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jInsertCookingItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/Insert Items.png"))); // NOI18N
        jInsertCookingItems.setText("Insert Cooking Items");
        jInsertCookingItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertCookingItemsActionPerformed(evt);
            }
        });
        jMenu2.add(jInsertCookingItems);

        jMenu1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/Delete Items.png"))); // NOI18N
        jMenu5.setText("Delete Item");

        jDeleteMarketItems.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jDeleteMarketItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/Delete Items.png"))); // NOI18N
        jDeleteMarketItems.setText("Delete Market Items");
        jDeleteMarketItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteMarketItemsActionPerformed(evt);
            }
        });
        jMenu5.add(jDeleteMarketItems);

        jDeleteCookingItems.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jDeleteCookingItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenmanagementsystem/Delete Items.png"))); // NOI18N
        jDeleteCookingItems.setText("Delete Cooking Items");
        jDeleteCookingItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteCookingItemsActionPerformed(evt);
            }
        });
        jMenu5.add(jDeleteCookingItems);

        jMenu1.add(jMenu5);

        History.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        History.setText("History");
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });
        jMenu1.add(History);

        jMenuItem10.setText("History By User");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem7.setText("Add or Remove User");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem9.setText("View User List");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem12.setText("Change Password");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Log out");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Help");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("A/c Holder");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Make A/c");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Pay A/c Holder");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem8.setText("About A/c Holder");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Stock");

        jMenuItem6.setText("Remaining Stock");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCookingActionPerformed
Cooking1 o = new Cooking1();    
    }//GEN-LAST:event_jCookingActionPerformed

    private void jColdDrinksCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jColdDrinksCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jColdDrinksCostActionPerformed

    private void jColdDrinksNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jColdDrinksNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jColdDrinksNumberActionPerformed

    private void jChipsCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChipsCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChipsCostActionPerformed

    private void jSweetsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSweetsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSweetsNumberActionPerformed

    private void jChipsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChipsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChipsNumberActionPerformed

    private void jBiscuitsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiscuitsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBiscuitsNumberActionPerformed

    private void jBiscuitsCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiscuitsCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBiscuitsCostActionPerformed

    private void jChocolateNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChocolateNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChocolateNumberActionPerformed

    private void jSweetsCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSweetsCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSweetsCostActionPerformed

    private void jChocolateCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChocolateCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChocolateCostActionPerformed

    private void jChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChocolateActionPerformed
 Chocolate1 o = new Chocolate1();
    }//GEN-LAST:event_jChocolateActionPerformed

    private void jChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChipsActionPerformed
                                               
    Chips1 o = new Chips1();

    }//GEN-LAST:event_jChipsActionPerformed

    private void jOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOtherActionPerformed
    Other1 o = new Other1();
    }//GEN-LAST:event_jOtherActionPerformed

    private void jCookingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCookingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCookingNumberActionPerformed

    private void jCookingCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCookingCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCookingCostActionPerformed

    private void jNamakinNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamakinNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamakinNumberActionPerformed

    private void jNamakinCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamakinCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamakinCostActionPerformed

    private void jTotalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalNumberActionPerformed

    private void jOtherNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOtherNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOtherNumberActionPerformed

    private void jTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalCostActionPerformed

    private void jOtherCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOtherCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOtherCostActionPerformed

    private void jInsertCookingItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertCookingItemsActionPerformed
    InsertCookingProduct o = new InsertCookingProduct(null,true);
    o.main(null);
    }//GEN-LAST:event_jInsertCookingItemsActionPerformed

    private void jInsertMarketItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertMarketItemsActionPerformed
    InsertMarketProduct o = new InsertMarketProduct(null,true);
    o.main(null);
    }//GEN-LAST:event_jInsertMarketItemsActionPerformed

    private void jDeleteCookingItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteCookingItemsActionPerformed
    DeleteCookingProduct o = new DeleteCookingProduct(null,true);
    o.main(null);
    }//GEN-LAST:event_jDeleteCookingItemsActionPerformed

    private void jDeleteMarketItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteMarketItemsActionPerformed
    DeleteMarketProduct o = new DeleteMarketProduct(null,true);
    o.main(null);
    }//GEN-LAST:event_jDeleteMarketItemsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    MakeAcHolder o = new MakeAcHolder(null,true);
    o.main(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        PayAcHolder o = new PayAcHolder(null,true);
        o.main(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        Statement st;
        try {
            st=con.createStatement();
            st.executeUpdate("DELETE FROM tempData");
        } catch (SQLException ex) {

        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    private void jColdDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jColdDrinksActionPerformed
ColdDrinks1 o = new ColdDrinks1();           
    }//GEN-LAST:event_jColdDrinksActionPerformed

    private void jChocolateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jChocolateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jChocolateKeyReleased

    private void jSweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSweetsActionPerformed
  Sweets1 o = new Sweets1();     

    }//GEN-LAST:event_jSweetsActionPerformed

    private void jBiscuitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiscuitsActionPerformed
                                                   
    Biscuite1 o = new Biscuite1();
    }//GEN-LAST:event_jBiscuitsActionPerformed

    private void jNamakinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamakinActionPerformed
Namakin1 o = new Namakin1();                                                   
    

    }//GEN-LAST:event_jNamakinActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    int dialogResult = JOptionPane.showConfirmDialog (null, "Really You Want to Log out??","Warning",1);
    
    if(dialogResult == JOptionPane.YES_OPTION){
        
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        Statement st;
        try {
            st=con.createStatement();
            st.executeUpdate("DELETE FROM tempData");
        } catch (SQLException ex) {

        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        LogIn o = new LogIn();
        LogIn.main(null);
        CMS1 obj = new CMS1();
        obj.setVisible(false);
        dispose();
}
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalActionPerformed
    int tpro=0;
    double tcos=0;
    
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;
    int num7 = 0;
    int num8 = 0;
    double cos1 = 0;
    double cos2 = 0;
    double cos3 = 0;
    double cos4 = 0;
    double cos5 = 0;
    double cos6 = 0;
    double cos7 = 0;
    double cos8 = 0;
    try
    {
        if(jColdDrinksNumber.getText()==null)
            num1=0;
        else
        {
            num1 = Integer.parseInt(jColdDrinksNumber.getText());
            cos1 = Double.parseDouble(jColdDrinksCost.getText());
        }
    }
    catch(Exception e)
    {
        num1=0;  
        cos1=0;
    }
    try
    {
        if(jChocolateNumber.getText()==null)
            num2=0;
        else
        {
            num2 = Integer.parseInt(jChocolateNumber.getText());
            cos2 = Double.parseDouble(jChocolateCost.getText());
        }
    }
    catch(Exception e)
    {
        num2=0;
        cos2=0;
    }
    try
    {
        if(jSweetsNumber.getText()==null)
            num3=0;
        else
        {
            num3 = Integer.parseInt(jSweetsNumber.getText());
            cos3 = Double.parseDouble(jSweetsCost.getText());
        }
    }
    catch(Exception e)
    {
        num3=0;
        cos3=0;
    }
    try
    {
        if(jBiscuitsNumber.getText()==null)
            num4=0;
        else
        {
            num4 = Integer.parseInt(jBiscuitsNumber.getText());
            cos4 = Double.parseDouble(jBiscuitsCost.getText());
        }
    }
    catch(Exception e)
    {
        num4=0;
        cos4=0;
    }
    try
    {
        if(jChipsNumber.getText()==null)
            num5=0;
        else
        {
            num5 = Integer.parseInt(jChipsNumber.getText());
            cos5 = Double.parseDouble(jChipsCost.getText());
        }
    }
    catch(Exception e)
    {
        num5=0;
        cos5=0;
    }
    try
    {
        if(jNamakinNumber.getText()==null)
            num6=0;
        else
        {
            num6 = Integer.parseInt(jNamakinNumber.getText());
            cos6 = Double.parseDouble(jNamakinCost.getText());
        }
    }
    catch(Exception e)
    {
        num6=0;
        cos6=0;
    }
    try
    {
        if(jCookingNumber.getText()==null)
            num7=0;
        else
        {
            num7 = Integer.parseInt(jCookingNumber.getText());
            cos7 = Double.parseDouble(jCookingCost.getText());
        }
    }
    catch(Exception e)
    {
        num7=0;
        cos7=0;
    }
    try
    {
        if(jOtherNumber.getText()==null)
            num8=0;
        else
        {
            num8 = Integer.parseInt(jOtherNumber.getText());
            cos8 = Double.parseDouble(jOtherCost.getText());
        }
    }
    catch(Exception e)
    {
        num8=0;
        cos8=0;
    }
    tpro+=num1;
    tcos+=cos1;
    tpro+=num2;
    tcos+=cos2;
    tpro+=num3;
    tcos+=cos3;
    tpro+=num4;
    tcos+=cos4;
    tpro+=num5;
    tcos+=cos5;
    tpro+=num6;
    tcos+=cos6;
    tpro+=num7;
    tcos+=cos7;
    tpro+=num8;
    tcos+=cos8;
    
    String tproduct = Integer.toString(tpro);
    String tcost = Double.toString(tcos);
    jTotalNumber.setText(tproduct);
    jTotalCost.setText(tcost);
    jAcHolderProducts.setText(tproduct);
    jAcHolderCost.setText(tcost);
    jTempProducts.setText(tproduct);
    jTempCost.setText(tcost);
    }//GEN-LAST:event_jTotalActionPerformed

    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
    History o = new History();
    }//GEN-LAST:event_HistoryActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    RemainingStock o = new RemainingStock();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
AboutAcHolder o = new AboutAcHolder();
o.main(null);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked

    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void jAcHolderCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcHolderCustomerActionPerformed

    }//GEN-LAST:event_jAcHolderCustomerActionPerformed

    private void jAcHolderCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAcHolderCustomerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jAcHolderCustomerMouseClicked

    private void jAcHolderCustomerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAcHolderCustomerFocusLost
        AcCName = (String) jAcHolderCustomer.getSelectedItem();
    }//GEN-LAST:event_jAcHolderCustomerFocusLost

    private void jAcHolderCustomerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAcHolderCustomerFocusGained

        jAcHolderCustomer.removeAllItems();
        jAcHolderCustomer.addItem("Customer Name");
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        Statement st;
        ResultSet rs;
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT CName FROM AcHolder");
            while(rs.next())
            {
                jAcHolderCustomer.addItem(rs.getString("CName"));
            }
        } catch (SQLException ex) {

        }

        try {
            con.close();
        } catch (SQLException ex) {

        }          // TODO add your handling code here:
    }//GEN-LAST:event_jAcHolderCustomerFocusGained

    private void jAcHolderMakeReciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcHolderMakeReciptActionPerformed
        ShowR111 o = new ShowR111(); // TODO add your handling code here:
    }//GEN-LAST:event_jAcHolderMakeReciptActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
         try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
         Statement st3;
                ResultSet rs3;
                Statement st4;
                ResultSet rs4;
                Statement st5;
                ResultSet rs5;
                Statement st7;
                int prod = 0;
                int prod1 = 0;
                try {
                    st3=con.createStatement();
                    st4=con.createStatement();
                    st5=con.createStatement();
                    st7=con.createStatement();
                    rs3 = st3.executeQuery("select * from tempData");
                    while(rs3.next())
                    {
                        
                        rs3.getString("pname");
                        rs3.getInt("pnumber");
                        rs3.getDouble("pcost");
                        rs3.getString("ptype");
                        rs4=st4.executeQuery("select pnumber from pdata where pname='"+rs3.getString("pname")+"'");
                        prod1=rs4.getInt("pnumber");
                        rs5=st5.executeQuery("select PNumber from History where PName='"+rs3.getString("pname")+"'");
                        while(rs5.next())
                        {
                            prod+=rs5.getInt("PNumber");
                        }
                        prod1-=prod;
                        if(prod1<rs3.getInt("pnumber"))
                        {
                            JOptionPane.showMessageDialog(null,rs3.getString("pname")+" is Out of Stock for Number of Product "+rs3.getInt("pnumber"));
                            st7.executeUpdate("DELETE FROM tempData where pname like '"+rs3.getString("pname")+"'");
                        }
                        else
                        {
                          if(jAcHolderCustomer.getSelectedItem().equals("Customer Name"))
        {
           JOptionPane.showMessageDialog(null, "Please Select Name");
        }
        else
        {
            
         
                DateFormat df1 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Calendar calobj1 = Calendar.getInstance();
                String date1 = df1.format(calobj1.getTime());
        Statement st6;
        Statement st16;
        ResultSet rs6;
        try {
            st6=con.createStatement();
            rs6=st6.executeQuery("select * from tempData");
            
            st16=con.createStatement();
            while(rs6.next())
            {
            st16.executeUpdate("insert into History values ("+rs6.getInt("pnumber")+","+rs6.getDouble("pcost")+",'"+rs6.getString("ptype")+"','Account Holder','"+date1+"','"+rs6.getString("pname")+"','"+jAcHolderCustomer.getSelectedItem()+"','"+AdminLogIn.SellerName+"')");
            }
            
    
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,ex);
        }
        
       
        
        int tPro = 0;
    double tCos = 0;
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        String date = df.format(calobj.getTime());
        Statement st;
        ResultSet rs;
        ResultSet rs1;
        Statement st1;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT pnumber,pcost FROM tempData");
            
            while(rs.next())
                {
                    tPro+=rs.getInt("pnumber");
                    tCos+=rs.getDouble("pcost");
                }
            rs = st.executeQuery("SELECT * FROM tempData");
            st1 = con.createStatement();
              while(rs.next())
                {
                st1.executeUpdate("insert into AcHolderData values  ('"+jAcHolderCustomer.getSelectedItem()+"','"+rs.getString("pname")+"',"+rs.getInt("pnumber")+","+rs.getDouble("pcost")+",'"+rs.getString("ptype")+"','"+date+"')");
                }
                JOptionPane.showMessageDialog(null,jAcHolderCustomer.getSelectedItem()+" Account is Updated");
                rs1= st.executeQuery("SELECT MR,PP FROM AcHolderMoney Where CName='"+jAcHolderCustomer.getSelectedItem()+"'");
                rs1.next();
                double MR = rs1.getDouble("MR");
                MR+=tCos;
                int PP=rs1.getInt("PP");
                PP+=tPro;
                st1.executeUpdate("update AcHolderMoney set MR="+MR+",PP="+tPro+" where CName='"+jAcHolderCustomer.getSelectedItem()+"'");
                        
         try {
            st=con.createStatement();
            st.executeUpdate("DELETE FROM tempData");
        } catch (SQLException ex) {
            
        }
        jColdDrinksNumber.setText(null);
        jColdDrinksCost.setText(null);
        jChocolateNumber.setText(null);
        jChocolateCost.setText(null);
        jSweetsNumber.setText(null);
        jSweetsCost.setText(null);
        jBiscuitsNumber.setText(null);
        jBiscuitsCost.setText(null);
        jChipsNumber.setText(null);
        jChipsCost.setText(null);
        jNamakinNumber.setText(null);
        jNamakinCost.setText(null);
        jCookingNumber.setText(null);
        jCookingCost.setText(null);
        jOtherNumber.setText(null);
        jOtherCost.setText(null);
        jTempCustomer.setText(null);
        jAcHolderCustomer.setSelectedItem("Customer Name");
        jTempProducts.setText(null);
        jAcHolderProducts.setText(null);
        jAcHolderCost.setText(null);
        jTempCost.setText(null);
        jTotalNumber.setText(null);
        jTotalCost.setText(null);
                AcCName=(String) jAcHolderCustomer.getSelectedItem();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
        }  
                        }
                    rs4.close();
                    rs5.close();
                    }
                } catch (SQLException ex) {
                    
                }
 
        
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jSaveActionPerformed

    private void jAcHolderResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcHolderResetActionPerformed
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        Statement st;
        try {
            st=con.createStatement();
            st.executeUpdate("DELETE FROM tempData");
        } catch (SQLException ex) {

        }
        jColdDrinksNumber.setText(null);
        jColdDrinksCost.setText(null);
        jChocolateNumber.setText(null);
        jChocolateCost.setText(null);
        jSweetsNumber.setText(null);
        jSweetsCost.setText(null);
        jBiscuitsNumber.setText(null);
        jBiscuitsCost.setText(null);
        jChipsNumber.setText(null);
        jChipsCost.setText(null);
        jNamakinNumber.setText(null);
        jNamakinCost.setText(null);
        jCookingNumber.setText(null);
        jCookingCost.setText(null);
        jOtherNumber.setText(null);
        jOtherCost.setText(null);
        jTempCustomer.setText(null);
        jAcHolderCustomer.setSelectedItem("Customer Name");
        jTempProducts.setText(null);
        jAcHolderProducts.setText(null);
        jAcHolderCost.setText(null);
        jTempCost.setText(null);
        jTotalNumber.setText(null);
        jTotalCost.setText(null);
        try {
            con.close();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jAcHolderResetActionPerformed

    private void jAcHolderProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcHolderProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAcHolderProductsActionPerformed

    private void jTempResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTempResetActionPerformed
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        Statement st;
        try {
            st=con.createStatement();
            st.executeUpdate("DELETE FROM tempData");
        } catch (SQLException ex) {

        }
        jColdDrinksNumber.setText(null);
        jColdDrinksCost.setText(null);
        jChocolateNumber.setText(null);
        jChocolateCost.setText(null);
        jSweetsNumber.setText(null);
        jSweetsCost.setText(null);
        jBiscuitsNumber.setText(null);
        jBiscuitsCost.setText(null);
        jChipsNumber.setText(null);
        jChipsCost.setText(null);
        jNamakinNumber.setText(null);
        jNamakinCost.setText(null);
        jCookingNumber.setText(null);
        jCookingCost.setText(null);
        jOtherNumber.setText(null);
        jOtherCost.setText(null);
        jTempCustomer.setText(null);
        jAcHolderCustomer.setSelectedItem("Customer Name");
        jTempProducts.setText(null);
        jAcHolderProducts.setText(null);
        jAcHolderCost.setText(null);
        jTempCost.setText(null);
        jTotalNumber.setText(null);
        jTotalCost.setText(null);
        try {
            con.close();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jTempResetActionPerformed

    private void jMoneyPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMoneyPaidActionPerformed
             ShowRP3 o = new ShowRP3();
    
    }//GEN-LAST:event_jMoneyPaidActionPerformed

    private void jTempShowReciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTempShowReciptActionPerformed
        ShowR11 o = new ShowR11();
    }//GEN-LAST:event_jTempShowReciptActionPerformed

    private void jTempCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTempCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTempCustomerActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
ARU o = new ARU();
o.main(null);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
UVL o = new UVL();
o.main(null);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
   History111 o = new History111();
   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    DevelopedBy o = new DevelopedBy(null,true);
o.main(null);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
      CPass o = new CPass();
      o.main(null);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        Statement st;
        try {
            st=con.createStatement();
            st.executeUpdate("DELETE FROM tempData");
        } catch (SQLException ex) {

        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CMS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CMS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CMS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CMS1().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem History;
    public static javax.swing.JTextField jAcHolderCost;
    public static javax.swing.JComboBox<String> jAcHolderCustomer;
    private javax.swing.JButton jAcHolderMakeRecipt;
    public static javax.swing.JTextField jAcHolderProducts;
    private javax.swing.JButton jAcHolderReset;
    private javax.swing.JButton jBiscuits;
    public static javax.swing.JTextField jBiscuitsCost;
    public static javax.swing.JTextField jBiscuitsNumber;
    private javax.swing.JButton jChips;
    public static javax.swing.JTextField jChipsCost;
    public static javax.swing.JTextField jChipsNumber;
    private javax.swing.JButton jChocolate;
    public static javax.swing.JTextField jChocolateCost;
    public static javax.swing.JTextField jChocolateNumber;
    private javax.swing.JButton jColdDrinks;
    public static javax.swing.JTextField jColdDrinksCost;
    public static javax.swing.JTextField jColdDrinksNumber;
    private javax.swing.JButton jCooking;
    public static javax.swing.JTextField jCookingCost;
    public static javax.swing.JTextField jCookingNumber;
    private javax.swing.JMenuItem jDeleteCookingItems;
    private javax.swing.JMenuItem jDeleteMarketItems;
    private javax.swing.JMenuItem jInsertCookingItems;
    private javax.swing.JMenuItem jInsertMarketItems;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JButton jMoneyPaid;
    private javax.swing.JButton jNamakin;
    public static javax.swing.JTextField jNamakinCost;
    public static javax.swing.JTextField jNamakinNumber;
    private javax.swing.JButton jOther;
    public static javax.swing.JTextField jOtherCost;
    public static javax.swing.JTextField jOtherNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jSave;
    private javax.swing.JButton jSweets;
    public static javax.swing.JTextField jSweetsCost;
    public static javax.swing.JTextField jSweetsNumber;
    private javax.swing.JTabbedPane jTabbedPane4;
    public static javax.swing.JTextField jTempCost;
    public static javax.swing.JTextField jTempCustomer;
    public static javax.swing.JTextField jTempProducts;
    private javax.swing.JButton jTempReset;
    private javax.swing.JButton jTempShowRecipt;
    private javax.swing.JButton jTotal;
    public static javax.swing.JTextField jTotalCost;
    public static javax.swing.JTextField jTotalNumber;
    // End of variables declaration//GEN-END:variables
}
