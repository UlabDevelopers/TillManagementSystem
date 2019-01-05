package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import static canteenmanagementsystem.CMS.jBiscuitsNumber;
import static canteenmanagementsystem.CMS.jBiscuitsCost;


public class Biscuite {
    JCheckBox cbox1;
        JTextField cnfield1;
        JTextField ccfield1;
        JCheckBox cbox2;
        JTextField cnfield2;
        JTextField ccfield2;
        JCheckBox cbox3;
        JTextField cnfield3;
        JTextField ccfield3;
        JCheckBox cbox4;
        JTextField cnfield4;
        JTextField ccfield4;
        JCheckBox cbox5;
        JTextField cnfield5;
        JTextField ccfield5;
        JCheckBox cbox6;
        JTextField cnfield6;
        JTextField ccfield6;
        JCheckBox cbox7;
        JTextField cnfield7;
        JTextField ccfield7;
        JCheckBox cbox8;
        JTextField cnfield8;
        JTextField ccfield8;
        JCheckBox cbox9;
        JTextField cnfield9;
        JTextField ccfield9;
        JCheckBox cbox10;
        JTextField cnfield10;
        JTextField ccfield10;
        JCheckBox cbox11;
        JTextField cnfield11;
        JTextField ccfield11;
        JCheckBox cbox12;
        JTextField cnfield12;
        JTextField ccfield12;
        JCheckBox cbox13;
        JTextField cnfield13;
        JTextField ccfield13;
        
        JLabel PNum;
        JLabel PCos;
        JTextField cntotal;
        JTextField cctotal;
    public Biscuite()
    {
        
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
        
        
        
        int fsizeh=450;
        int fsizev=80;
        int psizeh=800;
        int psizev=0;
        int temp=20;
        
        JFrame frame = new JFrame();
        PNum = new JLabel("Number");
        PCos = new JLabel("Cost");
        frame.add(PNum);
        frame.add(PCos);
        PNum.setBounds(230, temp, 70, 30);
        PCos.setBounds(310, temp, 100, 30);
                PNum.setFont(new java.awt.Font("Times New Roman", 0, 20));
                PCos.setFont(new java.awt.Font("Times New Roman", 0, 20));
        
        String query="SELECT pname FROM pdata WHERE ptype='Biscuits' ORDER BY pname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                cbox1 = new JCheckBox(rs.getString("pname"));
                cbox1.setBounds(20, temp, 200, 30);
                cnfield1 = new JTextField();
                cnfield1.setBounds(230,temp,70,30);
                ccfield1 = new JTextField();
                ccfield1.setBounds(310, temp, 100, 30);
                cnfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox1);
                frame.add(cnfield1);
                frame.add(ccfield1);    
                cbox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox1.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield1.setText(null);
                        ccfield1.setText(null);
                        
                    }
                }
                });
                cnfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield1.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield1.getText().equals(null))
                {
                    ccfield1.setText(null);
                }
                }
                });
                
                cnfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(cnfield1.getText().equals(null))
                {
                    ccfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                cbox2 = new JCheckBox(rs.getString("pname"));
                cbox2.setBounds(20, temp, 200, 30);
                cnfield2 = new JTextField();
                cnfield2.setBounds(230,temp,70,30);
                ccfield2 = new JTextField();
                ccfield2.setBounds(310, temp, 100, 30);
                cnfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox2);
                frame.add(cnfield2);
                frame.add(ccfield2);
                
                cbox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox2.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield2.setText(null);
                        ccfield2.setText(null);
                    }
                }
                });
                cnfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield2.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield2.getText().equals(null))
                {
                    ccfield2.setText(null);
                }
                }
                });
                
                cnfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield2.getText().equals(null))
                {
                    
                    ccfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox3 = new JCheckBox(rs.getString("pname"));
                cbox3.setBounds(20, temp, 200, 30);
                cnfield3 = new JTextField();
                cnfield3.setBounds(230,temp,70,30);
                ccfield3 = new JTextField();
                ccfield3.setBounds(310, temp, 100, 30);
                cnfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox3);
                frame.add(cnfield3);
                frame.add(ccfield3);
                
                cbox3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox3.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield3.setText(null);
                        ccfield3.setText(null);
                    }
                }
                });
                cnfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield3.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield3.getText().equals(null))
                {
                    ccfield3.setText(null);
                }
                }
                });
                
                cnfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield3.getText().equals(null))
                {
                    ccfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox4 = new JCheckBox(rs.getString("pname"));
                cbox4.setBounds(20, temp, 200, 30);
                cnfield4 = new JTextField();
                cnfield4.setBounds(230,temp,70,30);
                ccfield4 = new JTextField();
                ccfield4.setBounds(310, temp, 100, 30);
                cnfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox4);
                frame.add(cnfield4);
                frame.add(ccfield4);
                
                cbox4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox4.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield4.setText(null);
                        ccfield4.setText(null);
                    }
                }
                });
                cnfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield4.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield4.getText().equals(null))
                {
                    ccfield4.setText(null);
                }
                }
                });
                
                cnfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield4.getText().equals(null))
                {
                    ccfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox5= new JCheckBox(rs.getString("pname"));
                cbox5.setBounds(20, temp, 200, 30);
                cnfield5 = new JTextField();
                cnfield5.setBounds(230,temp,70,30);
                ccfield5 = new JTextField();
                ccfield5.setBounds(310, temp, 100, 30);
                cnfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox5);
                frame.add(cnfield5);
                frame.add(ccfield5);
                
                cbox5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox5.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield5.setText(null);
                        ccfield5.setText(null);
                    }
                }
                });
                cnfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield5.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield5.getText().equals(null))
                {
                    ccfield5.setText(null);
                }
                }
                });
                
                cnfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield5.getText().equals(null))
                {
                    ccfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox6= new JCheckBox(rs.getString("pname"));
                cbox6.setBounds(20, temp, 200, 30);
                cnfield6 = new JTextField();
                cnfield6.setBounds(230,temp,70,30);
                ccfield6 = new JTextField();
                ccfield6.setBounds(310, temp, 100, 30);
                cnfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox6);
                frame.add(cnfield6);
                frame.add(ccfield6);
                
                cbox6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox6.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield6.setText(null);
                        ccfield6.setText(null);
                    }
                }
                });
                cnfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield6.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield6.getText().equals(null))
                {
                    ccfield6.setText(null);
                }
                }
                });
                
                cnfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield6.getText().equals(null))
                {
                    ccfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox7= new JCheckBox(rs.getString("pname"));
                cbox7.setBounds(20, temp, 200, 30);
                cnfield7 = new JTextField();
                cnfield7.setBounds(230,temp,70,30);
                ccfield7 = new JTextField();
                ccfield7.setBounds(310, temp, 100, 30);
                cnfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox7);
                frame.add(cnfield7);
                frame.add(ccfield7);
                
                cbox7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox7.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield7.setText(null);
                        ccfield7.setText(null);
                    }
                }
                });
                cnfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield7.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield7.getText().equals(null))
                {
                    ccfield7.setText(null);
                }
                }
                });
                
                cnfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield7.getText().equals(null))
                {
                    ccfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox8= new JCheckBox(rs.getString("pname"));
                cbox8.setBounds(20, temp, 200, 30);
                cnfield8 = new JTextField();
                cnfield8.setBounds(230,temp,70,30);
                ccfield8 = new JTextField();
                ccfield8.setBounds(310, temp, 100, 30);
                cnfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox8);
                frame.add(cnfield8);
                frame.add(ccfield8);
                
                cbox8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox8.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield8.setText(null);
                        ccfield8.setText(null);
                    }
                }
                });
                cnfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield8.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield8.getText().equals(null))
                {
                    ccfield8.setText(null);
                }
                }
                });
                
                cnfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield8.getText().equals(null))
                {
                    ccfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox9= new JCheckBox(rs.getString("pname"));
                cbox9.setBounds(20, temp, 200, 30);
                cnfield9 = new JTextField();
                cnfield9.setBounds(230,temp,70,30);
                ccfield9 = new JTextField();
                ccfield9.setBounds(310, temp, 100, 30);
                cnfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox9);
                frame.add(cnfield9);
                frame.add(ccfield9);
                
                cbox9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox9.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield9.setText(null);
                        ccfield9.setText(null);
                    }
                }
                });
                cnfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield9.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield9.getText().equals(null))
                {
                    ccfield9.setText(null);
                }
                }
                });
                
                cnfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield9.getText().equals(null))
                {
                    ccfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox10= new JCheckBox(rs.getString("pname"));
                cbox10.setBounds(20, temp, 200, 30);
                cnfield10 = new JTextField();
                cnfield10.setBounds(230,temp,70,30);
                ccfield10 = new JTextField();
                ccfield10.setBounds(310, temp, 100, 30);
                cnfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox10);
                frame.add(cnfield10);
                frame.add(ccfield10);
                
                cbox10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox10.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield10.setText(null);
                        ccfield10.setText(null);
                    }
                }
                });
                cnfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield10.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield10.getText().equals(null))
                {
                    ccfield10.setText(null);
                }
                }
                });
                
                cnfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield10.getText().equals(null))
                {
                    ccfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox11= new JCheckBox(rs.getString("pname"));
                cbox11.setBounds(20, temp, 200, 30);
                cnfield11 = new JTextField();
                cnfield11.setBounds(230,temp,70,30);
                ccfield11 = new JTextField();
                ccfield11.setBounds(310, temp, 100, 30);
                cnfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox11);
                frame.add(cnfield11);
                frame.add(ccfield11);
                
                cbox11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox11.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield11.setText(null);
                        ccfield11.setText(null);
                    }
                }
                });
                cnfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield11.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield11.getText().equals(null))
                {
                    ccfield11.setText(null);
                }
                }
                });
                
                cnfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield11.getText().equals(null))
                {
                    ccfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox12= new JCheckBox(rs.getString("pname"));
                cbox12.setBounds(20, temp, 200, 30);
                cnfield12 = new JTextField();
                cnfield12.setBounds(230,temp,70,30);
                ccfield12 = new JTextField();
                ccfield12.setBounds(310, temp, 100, 30);
                cnfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox12);
                frame.add(cnfield12);
                frame.add(ccfield12);
                
                cbox12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox12.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield12.setText(null);
                        ccfield12.setText(null);
                    }
                }
                });
                cnfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield12.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield12.getText().equals(null))
                {
                    ccfield12.setText(null);
                }
                }
                });
                
                cnfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield12.getText().equals(null))
                {
                    ccfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                cbox13= new JCheckBox(rs.getString("pname"));
                cbox13.setBounds(20, temp, 200, 30);
                cnfield13 = new JTextField();
                cnfield13.setBounds(230,temp,70,30);
                ccfield13 = new JTextField();
                ccfield13.setBounds(310, temp, 100, 30);
                cnfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cnfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cnfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ccfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ccfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ccfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cbox13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(cbox13);
                frame.add(cnfield13);
                frame.add(ccfield13);
                
                cbox13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbox13.isSelected())
                    {
                        
                    }
                    else
                    {
                        cnfield13.setText(null);
                        ccfield13.setText(null);
                    }
                }
                });
                cnfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(cbox13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield13.setText(result); 
                        
                        
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Select Check cbox Item");
                   }
                     if(cnfield13.getText().equals(null))
                {
                    ccfield13.setText(null);
                }
                }
                });
                
                cnfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(cbox13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(cnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Biscuits' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ccfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(cnfield13.getText().equals(null))
                {
                    ccfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              cntotal = new JTextField();
              cctotal = new JTextField();
              cntotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              cntotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              cntotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              cctotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              cctotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              cctotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              cntotal.setBounds(230,temp,70,30);
              cctotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(cbox1.isSelected())
                    {                       
                       if(cnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield1.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num=0;
                        tnum=tnum +num;
                    }
                    try
                    {
                    if(cbox1.isSelected())
                    {                       
                        if(ccfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield1.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                        double num=0;
                        tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox2.isSelected())
                    {                       
                       if(cnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield2.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox2.isSelected())
                    {                       
                        if(ccfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield2.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox3.isSelected())
                    {                       
                       if(cnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield3.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox3.isSelected())
                    {                       
                        if(ccfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield3.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox4.isSelected())
                    {                       
                       if(cnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield4.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox4.isSelected())
                    {                       
                        if(ccfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield4.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox5.isSelected())
                    {                       
                       if(cnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield5.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox5.isSelected())
                    {                       
                        if(ccfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield5.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox6.isSelected())
                    {                       
                       if(cnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield6.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox6.isSelected())
                    {                       
                        if(ccfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield6.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox7.isSelected())
                    {                       
                       if(cnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield7.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox7.isSelected())
                    {                       
                        if(ccfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield7.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox8.isSelected())
                    {                       
                       if(cnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield8.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox8.isSelected())
                    {                       
                        if(ccfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield8.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox9.isSelected())
                    {                       
                       if(cnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield9.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox9.isSelected())
                    {                       
                        if(ccfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield9.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox10.isSelected())
                    {                       
                       if(cnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield10.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox10.isSelected())
                    {                       
                        if(ccfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield10.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox11.isSelected())
                    {                       
                       if(cnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield11.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox11.isSelected())
                    {                       
                        if(ccfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield11.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox12.isSelected())
                    {                       
                       if(cnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield12.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox12.isSelected())
                    {                       
                        if(ccfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield12.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox13.isSelected())
                    {                       
                       if(cnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield13.getText());  
                       
                       tnum = tnum+num;
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox13.isSelected())
                    {                       
                        if(ccfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield13.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    String result1 = Integer.toString(tnum);
                    String result2 = Double.toString(tcos);
                    cntotal.setText(result1);
                    cctotal.setText(result2);
                    jBiscuitsNumber.setText(result1);
                    jBiscuitsCost.setText(result2);
                    
                }
            });
              frame.add(total);
              frame.add(cntotal);
              frame.add(cctotal);
              
              fsizev+=80;
              temp+=50;
              JButton OK = new JButton("OK");
              JButton Cancel = new JButton("Cancel");
              OK.setFont(new java.awt.Font("Times New Roman", 0, 20));
              Cancel.setFont(new java.awt.Font("Times New Roman", 0, 20));
              OK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
              Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
              Cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    }
            });
              OK.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                    
                    Statement st1;
                    ResultSet rs1;
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(cbox1.isSelected())
                    {                       
                       if(cnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield1.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox1.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num=0;
                        tnum=tnum +num;
                    }
                    try
                    {
                    if(cbox1.isSelected())
                    {                       
                        if(ccfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield1.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                        double num=0;
                        tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox2.isSelected())
                    {                       
                       if(cnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield2.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox2.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox2.isSelected())
                    {                       
                        if(ccfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield2.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox3.isSelected())
                    {                       
                       if(cnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield3.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox3.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox3.isSelected())
                    {                       
                        if(ccfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield3.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox4.isSelected())
                    {                       
                       if(cnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield4.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox4.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox4.isSelected())
                    {                       
                        if(ccfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield4.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox5.isSelected())
                    {                       
                       if(cnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield5.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox5.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox5.isSelected())
                    {                       
                        if(ccfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield5.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox6.isSelected())
                    {                       
                       if(cnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield6.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox6.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox6.isSelected())
                    {                       
                        if(ccfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield6.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox7.isSelected())
                    {                       
                       if(cnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield7.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox7.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox7.isSelected())
                    {                       
                        if(ccfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield7.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox8.isSelected())
                    {                       
                       if(cnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield8.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox8.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox8.isSelected())
                    {                       
                        if(ccfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield8.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox9.isSelected())
                    {                       
                       if(cnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield9.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox9.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox9.isSelected())
                    {                       
                        if(ccfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield9.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox10.isSelected())
                    {                       
                       if(cnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield10.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox10.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox10.isSelected())
                    {                       
                        if(ccfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield10.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox11.isSelected())
                    {                       
                       if(cnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield11.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox11.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox11.isSelected())
                    {                       
                        if(ccfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield11.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox12.isSelected())
                    {                       
                       if(cnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield12.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox12.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox12.isSelected())
                    {                       
                        if(ccfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield12.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    try
                    {
                    if(cbox13.isSelected())
                    {                       
                       if(cnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(cnfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ccfield13.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+cbox13.getText()+"',"+num+","+cos+",'Biscuits')");
                           }
                           catch(SQLException es){}
                       }
                    }
                    }
                    catch(Exception eq)
                    {
                        int num = 0;
                        tnum=tnum+num;
                    }
                    try
                    {
                    if(cbox13.isSelected())
                    {                       
                        if(ccfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ccfield13.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    String result1 = Integer.toString(tnum);
                    String result2 = Double.toString(tcos);
                    jBiscuitsNumber.setText(result1);
                    jBiscuitsCost.setText(result2);
                    
                    
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                    frame.dispose();
                    }
            });  
              OK.setBounds(230, temp, 70, 30);
              Cancel.setBounds(310,temp,100,30);
              frame.add(OK);
              frame.add(Cancel);
        /*{
            var = new JCheckBox(rs.getString("pname"));
            var.setBounds(20,20,200,30);
            var1 = new JTextField();
            var1.setBounds(230, 20, 100, 30);
            var2 = new JTextField();
            var2.setBounds(440, 20, 200, 30);
            frame.add(var);
            frame.add(var1);
            frame.add(var2);
        }*/
            con.close();
            st.close();
        } catch (SQLException ex) {
            
        }
        
        frame.setLayout(null);
                frame.setTitle("Biscuits");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        

    }
}
