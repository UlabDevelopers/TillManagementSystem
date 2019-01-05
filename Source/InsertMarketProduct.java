
package canteenmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

 
public class InsertMarketProduct extends javax.swing.JDialog {

    public static final String DRIVER="org.sqlite.JDBC";
    public static final String JDBC_URL="jdbc:sqlite:CMSData.db";
    public static Connection con;
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form InsertMarketProduct
     */
    public InsertMarketProduct(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jIMPName = new javax.swing.JTextField();
        jIMPNumber = new javax.swing.JTextField();
        jIMPCost = new javax.swing.JTextField();
        jIMPType = new javax.swing.JComboBox<>();
        jIMPInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert Market Products");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        cancelButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cancelButton.setText("Close");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Product Name           :-");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Product Type             :-");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("No. Of Product          :-");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Cost Of One Product :-");

        jIMPName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jIMPName.setText("Enter Product Name Here");
        jIMPName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jIMPNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jIMPNameFocusLost(evt);
            }
        });
        jIMPName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIMPNameMouseClicked(evt);
            }
        });

        jIMPNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jIMPNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jIMPNumber.setText("Enter Number of Product");
        jIMPNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jIMPNumberFocusGained(evt);
            }
        });
        jIMPNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIMPNumberMouseClicked(evt);
            }
        });
        jIMPNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIMPNumberActionPerformed(evt);
            }
        });

        jIMPCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jIMPCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jIMPCost.setText("Enter Cost of Product");
        jIMPCost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jIMPCostFocusGained(evt);
            }
        });
        jIMPCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIMPCostMouseClicked(evt);
            }
        });

        jIMPType.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jIMPType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Products Types", "Cold drinks", "Chocolate", "Sweets", "Biscuits", "Chips", "Namakin", "Other" }));
        jIMPType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIMPTypeActionPerformed(evt);
            }
        });

        jIMPInsert.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jIMPInsert.setText("Insert");
        jIMPInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIMPInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jIMPType, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(55, 55, 55)
                            .addComponent(jIMPName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(55, 55, 55)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jIMPInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jIMPNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jIMPCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIMPName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIMPType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIMPNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIMPCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIMPInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void jIMPInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIMPInsertActionPerformed
        
            
        
        if(jIMPType.getSelectedItem().equals("Products Types"))
        {
            JOptionPane.showMessageDialog(null,"Please Choose Product Type");
        }
        else
        {
            if(jIMPCost.getText().equals("Enter Cost of Product"))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Cost");
        }
            else
            {
                if(jIMPNumber.getText().equals("Enter Number of Product"))
                JOptionPane.showMessageDialog(null,"Please Enter No. of Product");
                
                else
                {
        int tempn = Integer.parseInt(jIMPNumber.getText());
        double tempc = Double.parseDouble(jIMPCost.getText());
        try {
            Statement st;
            st=con.createStatement();
            ResultSet rs;
            try{
            rs=st.executeQuery("select * from pdata where pname like '"+jIMPName.getText()+"'");
            if(rs.next())
            {
                st.executeUpdate("update pdata set ptype = '"+jIMPType.getSelectedItem()+"', pnumber="+(tempn+rs.getInt("pnumber"))+", pcost="+tempc+"  where pname='"+jIMPName.getText()+"'");
                JOptionPane.showMessageDialog(null,"Product Updated");
                jIMPType.setSelectedItem("Products Types");
                jIMPName.setText(null);
                jIMPNumber.setText(null);
                jIMPCost.setText(null);
            }
            else
            {
              st.executeUpdate("insert into pdata values ('"+jIMPName.getText()+"','"+jIMPType.getSelectedItem()+"',"+tempn+","+tempc+")");  
              JOptionPane.showMessageDialog(null,"Product Inserted");
              jIMPType.setSelectedItem("Products Types");
              jIMPName.setText(null);
              jIMPNumber.setText(null);
              jIMPCost.setText(null);
            }
            
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            
        } catch (SQLException ex) {
            
        }
        JFrame frame = new JFrame();
        }}
        }
    }//GEN-LAST:event_jIMPInsertActionPerformed

    private void jIMPNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIMPNameMouseClicked
      
    }//GEN-LAST:event_jIMPNameMouseClicked

    private void jIMPCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIMPCostMouseClicked
        
    }//GEN-LAST:event_jIMPCostMouseClicked

    private void jIMPNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIMPNumberMouseClicked
      
    }//GEN-LAST:event_jIMPNumberMouseClicked

    private void jIMPNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIMPNumberFocusGained
        if(jIMPNumber.getText().equals("Enter Number of Product"))
        jIMPNumber.setText(null);
    }//GEN-LAST:event_jIMPNumberFocusGained

    private void jIMPNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIMPNameFocusGained
        if(jIMPName.getText().equals("Enter Product Name Here")) 
        jIMPName.setText(null);
    }//GEN-LAST:event_jIMPNameFocusGained

    private void jIMPCostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIMPCostFocusGained
        if(jIMPCost.getText().equals("Enter Cost of Product")) 
        jIMPCost.setText(null);
    }//GEN-LAST:event_jIMPCostFocusGained

    private void jIMPNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIMPNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIMPNumberActionPerformed

    private void jIMPNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIMPNameFocusLost
     
    }//GEN-LAST:event_jIMPNameFocusLost

    private void jIMPTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIMPTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIMPTypeActionPerformed
    
    private void doClose(int retStatus) {
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
            
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

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
            java.util.logging.Logger.getLogger(InsertMarketProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertMarketProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertMarketProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertMarketProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertMarketProduct dialog = new InsertMarketProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        try {
            con.close();
        } catch (SQLException ex) {
            
        }
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField jIMPCost;
    private javax.swing.JButton jIMPInsert;
    private javax.swing.JTextField jIMPName;
    private javax.swing.JTextField jIMPNumber;
    private javax.swing.JComboBox<String> jIMPType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
