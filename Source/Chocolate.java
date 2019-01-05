package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import static canteenmanagementsystem.CMS.jChocolateCost;
import static canteenmanagementsystem.CMS.jChocolateNumber;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Chocolate {
    
     JCheckBox abox1;
        JTextField anfield1;
        JTextField acfield1;
        JCheckBox abox2;
        JTextField anfield2;
        JTextField acfield2;
        JCheckBox abox3;
        JTextField anfield3;
        JTextField acfield3;
        JCheckBox abox4;
        JTextField anfield4;
        JTextField acfield4;
        JCheckBox abox5;
        JTextField anfield5;
        JTextField acfield5;
        JCheckBox abox6;
        JTextField anfield6;
        JTextField acfield6;
        JCheckBox abox7;
        JTextField anfield7;
        JTextField acfield7;
        JCheckBox abox8;
        JTextField anfield8;
        JTextField acfield8;
        JCheckBox abox9;
        JTextField anfield9;
        JTextField acfield9;
        JCheckBox abox10;
        JTextField anfield10;
        JTextField acfield10;
        JCheckBox abox11;
        JTextField anfield11;
        JTextField acfield11;
        JCheckBox abox12;
        JTextField anfield12;
        JTextField acfield12;
        JCheckBox abox13;
        JTextField anfield13;
        JTextField acfield13;
        JTextField antotal;
        JTextField actotal;
    public Chocolate()
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
        
                
        JLabel PNum = new JLabel("Number");
        JLabel PCos = new JLabel("Cost");
        frame.add(PNum);
        frame.add(PCos);
        PNum.setBounds(230, temp, 70, 30);
        PCos.setBounds(310, temp, 100, 30);
                PNum.setFont(new java.awt.Font("Times New Roman", 0, 20));
                PCos.setFont(new java.awt.Font("Times New Roman", 0, 20));
        
        String query="SELECT pname FROM pdata WHERE ptype='Chocolate' ORDER BY pname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                abox1 = new JCheckBox(rs.getString("pname"));
                abox1.setBounds(20, temp, 200, 30);
                anfield1 = new JTextField();
                anfield1.setBounds(230,temp,70,30);
                acfield1 = new JTextField();
                acfield1.setBounds(310, temp, 100, 30);
                anfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox1);
                frame.add(anfield1);
                frame.add(acfield1);    
                abox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox1.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield1.setText(null);
                        acfield1.setText(null);
                        
                    }
                }
                });
                anfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield1.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield1.getText().equals(null))
                {
                    acfield1.setText(null);
                }
                }
                });
                
                anfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(anfield1.getText().equals(null))
                {
                    acfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                abox2 = new JCheckBox(rs.getString("pname"));
                abox2.setBounds(20, temp, 200, 30);
                anfield2 = new JTextField();
                anfield2.setBounds(230,temp,70,30);
                acfield2 = new JTextField();
                acfield2.setBounds(310, temp, 100, 30);
                anfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox2);
                frame.add(anfield2);
                frame.add(acfield2);
                
                abox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox2.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield2.setText(null);
                        acfield2.setText(null);
                    }
                }
                });
                anfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield2.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield2.getText().equals(null))
                {
                    acfield2.setText(null);
                }
                }
                });
                
                anfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield2.getText().equals(null))
                {
                    
                    acfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox3 = new JCheckBox(rs.getString("pname"));
                abox3.setBounds(20, temp, 200, 30);
                anfield3 = new JTextField();
                anfield3.setBounds(230,temp,70,30);
                acfield3 = new JTextField();
                acfield3.setBounds(310, temp, 100, 30);
                anfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox3);
                frame.add(anfield3);
                frame.add(acfield3);
                
                abox3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox3.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield3.setText(null);
                        acfield3.setText(null);
                    }
                }
                });
                anfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield3.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield3.getText().equals(null))
                {
                    acfield3.setText(null);
                }
                }
                });
                
                anfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield3.getText().equals(null))
                {
                    acfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox4 = new JCheckBox(rs.getString("pname"));
                abox4.setBounds(20, temp, 200, 30);
                anfield4 = new JTextField();
                anfield4.setBounds(230,temp,70,30);
                acfield4 = new JTextField();
                acfield4.setBounds(310, temp, 100, 30);
                anfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox4);
                frame.add(anfield4);
                frame.add(acfield4);
                
                abox4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox4.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield4.setText(null);
                        acfield4.setText(null);
                    }
                }
                });
                anfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield4.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield4.getText().equals(null))
                {
                    acfield4.setText(null);
                }
                }
                });
                
                anfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield4.getText().equals(null))
                {
                    acfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox5= new JCheckBox(rs.getString("pname"));
                abox5.setBounds(20, temp, 200, 30);
                anfield5 = new JTextField();
                anfield5.setBounds(230,temp,70,30);
                acfield5 = new JTextField();
                acfield5.setBounds(310, temp, 100, 30);
                anfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox5);
                frame.add(anfield5);
                frame.add(acfield5);
                
                abox5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox5.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield5.setText(null);
                        acfield5.setText(null);
                    }
                }
                });
                anfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield5.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield5.getText().equals(null))
                {
                    acfield5.setText(null);
                }
                }
                });
                
                anfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield5.getText().equals(null))
                {
                    acfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox6= new JCheckBox(rs.getString("pname"));
                abox6.setBounds(20, temp, 200, 30);
                anfield6 = new JTextField();
                anfield6.setBounds(230,temp,70,30);
                acfield6 = new JTextField();
                acfield6.setBounds(310, temp, 100, 30);
                anfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox6);
                frame.add(anfield6);
                frame.add(acfield6);
                
                abox6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox6.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield6.setText(null);
                        acfield6.setText(null);
                    }
                }
                });
                anfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield6.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield6.getText().equals(null))
                {
                    acfield6.setText(null);
                }
                }
                });
                
                anfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        acfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield6.getText().equals(null))
                {
                    acfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox7= new JCheckBox(rs.getString("pname"));
                abox7.setBounds(20, temp, 200, 30);
                anfield7 = new JTextField();
                anfield7.setBounds(230,temp,70,30);
                acfield7 = new JTextField();
                acfield7.setBounds(310, temp, 100, 30);
                anfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox7);
                frame.add(anfield7);
                frame.add(acfield7);
                
                abox7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox7.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield7.setText(null);
                        acfield7.setText(null);
                    }
                }
                });
                anfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield7.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield7.getText().equals(null))
                {
                    acfield7.setText(null);
                }
                }
                });
                
                anfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield7.getText().equals(null))
                {
                    acfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox8= new JCheckBox(rs.getString("pname"));
                abox8.setBounds(20, temp, 200, 30);
                anfield8 = new JTextField();
                anfield8.setBounds(230,temp,70,30);
                acfield8 = new JTextField();
                acfield8.setBounds(310, temp, 100, 30);
                anfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox8);
                frame.add(anfield8);
                frame.add(acfield8);
                
                abox8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox8.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield8.setText(null);
                        acfield8.setText(null);
                    }
                }
                });
                anfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield8.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield8.getText().equals(null))
                {
                    acfield8.setText(null);
                }
                }
                });
                
                anfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield8.getText().equals(null))
                {
                    acfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox9= new JCheckBox(rs.getString("pname"));
                abox9.setBounds(20, temp, 200, 30);
                anfield9 = new JTextField();
                anfield9.setBounds(230,temp,70,30);
                acfield9 = new JTextField();
                acfield9.setBounds(310, temp, 100, 30);
                anfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox9);
                frame.add(anfield9);
                frame.add(acfield9);
                
                abox9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox9.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield9.setText(null);
                        acfield9.setText(null);
                    }
                }
                });
                anfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield9.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield9.getText().equals(null))
                {
                    acfield9.setText(null);
                }
                }
                });
                
                anfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield9.getText().equals(null))
                {
                    acfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox10= new JCheckBox(rs.getString("pname"));
                abox10.setBounds(20, temp, 200, 30);
                anfield10 = new JTextField();
                anfield10.setBounds(230,temp,70,30);
                acfield10 = new JTextField();
                acfield10.setBounds(310, temp, 100, 30);
                anfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox10);
                frame.add(anfield10);
                frame.add(acfield10);
                
                abox10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox10.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield10.setText(null);
                        acfield10.setText(null);
                    }
                }
                });
                anfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield10.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield10.getText().equals(null))
                {
                    acfield10.setText(null);
                }
                }
                });
                
                anfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield10.getText().equals(null))
                {
                    acfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox11= new JCheckBox(rs.getString("pname"));
                abox11.setBounds(20, temp, 200, 30);
                anfield11 = new JTextField();
                anfield11.setBounds(230,temp,70,30);
                acfield11 = new JTextField();
                acfield11.setBounds(310, temp, 100, 30);
                anfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox11);
                frame.add(anfield11);
                frame.add(acfield11);
                
                abox11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox11.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield11.setText(null);
                        acfield11.setText(null);
                    }
                }
                });
                anfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield11.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield11.getText().equals(null))
                {
                    acfield11.setText(null);
                }
                }
                });
                
                anfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield11.getText().equals(null))
                {
                    acfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox12= new JCheckBox(rs.getString("pname"));
                abox12.setBounds(20, temp, 200, 30);
                anfield12 = new JTextField();
                anfield12.setBounds(230,temp,70,30);
                acfield12 = new JTextField();
                acfield12.setBounds(310, temp, 100, 30);
                anfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox12);
                frame.add(anfield12);
                frame.add(acfield12);
                
                abox12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox12.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield12.setText(null);
                        acfield12.setText(null);
                    }
                }
                });
                anfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield12.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield12.getText().equals(null))
                {
                    acfield12.setText(null);
                }
                }
                });
                
                anfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield12.getText().equals(null))
                {
                    acfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                abox13= new JCheckBox(rs.getString("pname"));
                abox13.setBounds(20, temp, 200, 30);
                anfield13 = new JTextField();
                anfield13.setBounds(230,temp,70,30);
                acfield13 = new JTextField();
                acfield13.setBounds(310, temp, 100, 30);
                anfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                anfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                anfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                acfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                acfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                acfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                abox13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(abox13);
                frame.add(anfield13);
                frame.add(acfield13);
                
                abox13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(abox13.isSelected())
                    {
                        
                    }
                    else
                    {
                        anfield13.setText(null);
                        acfield13.setText(null);
                    }
                }
                });
                anfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(abox13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield13.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check abox Item");
                   }
                     if(anfield13.getText().equals(null))
                {
                    acfield13.setText(null);
                }
                }
                });
                
                anfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(abox13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(anfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chocolate' ORDER BY pname ASC ");
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
                        acfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(anfield13.getText().equals(null))
                {
                    acfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              antotal = new JTextField();
              actotal = new JTextField();
              antotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              antotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              antotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              actotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              actotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              actotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              antotal.setBounds(230,temp,70,30);
              actotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(abox1.isSelected())
                    {                       
                       if(anfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield1.getText());  
                       
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
                    if(abox1.isSelected())
                    {                       
                        if(acfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield1.getText());  
                       
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
                    if(abox2.isSelected())
                    {                       
                       if(anfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield2.getText());  
                       
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
                    if(abox2.isSelected())
                    {                       
                        if(acfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield2.getText());  
                       
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
                    if(abox3.isSelected())
                    {                       
                       if(anfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield3.getText());  
                       
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
                    if(abox3.isSelected())
                    {                       
                        if(acfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield3.getText());  
                       
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
                    if(abox4.isSelected())
                    {                       
                       if(anfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield4.getText());  
                       
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
                    if(abox4.isSelected())
                    {                       
                        if(acfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield4.getText());  
                       
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
                    if(abox5.isSelected())
                    {                       
                       if(anfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield5.getText());  
                       
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
                    if(abox5.isSelected())
                    {                       
                        if(acfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield5.getText());  
                       
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
                    if(abox6.isSelected())
                    {                       
                       if(anfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield6.getText());  
                       
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
                    if(abox6.isSelected())
                    {                       
                        if(acfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield6.getText());  
                       
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
                    if(abox7.isSelected())
                    {                       
                       if(anfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield7.getText());  
                       
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
                    if(abox7.isSelected())
                    {                       
                        if(acfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield7.getText());  
                       
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
                    if(abox8.isSelected())
                    {                       
                       if(anfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield8.getText());  
                       
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
                    if(abox8.isSelected())
                    {                       
                        if(acfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield8.getText());  
                       
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
                    if(abox9.isSelected())
                    {                       
                       if(anfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield9.getText());  
                       
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
                    if(abox9.isSelected())
                    {                       
                        if(acfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield9.getText());  
                       
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
                    if(abox10.isSelected())
                    {                       
                       if(anfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield10.getText());  
                       
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
                    if(abox10.isSelected())
                    {                       
                        if(acfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield10.getText());  
                       
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
                    if(abox11.isSelected())
                    {                       
                       if(anfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield11.getText());  
                       
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
                    if(abox11.isSelected())
                    {                       
                        if(acfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield11.getText());  
                       
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
                    if(abox12.isSelected())
                    {                       
                       if(anfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield12.getText());  
                       
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
                    if(abox12.isSelected())
                    {                       
                        if(acfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield12.getText());  
                       
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
                    if(abox13.isSelected())
                    {                       
                       if(anfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield13.getText());  
                       
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
                    if(abox13.isSelected())
                    {                       
                        if(acfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield13.getText());  
                       
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
                    antotal.setText(result1);
                    actotal.setText(result2);
                    CMS.jChocolateNumber.setText(result1);
                    CMS.jChocolateCost.setText(result2);
                    
                }
            });
              frame.add(total);
              frame.add(antotal);
              frame.add(actotal);
              
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
                    if(abox1.isSelected())
                    {                       
                       if(anfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield1.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox1.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox1.isSelected())
                    {                       
                        if(acfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield1.getText());  
                       
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
                    if(abox2.isSelected())
                    {                       
                       if(anfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield2.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox2.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox2.isSelected())
                    {                       
                        if(acfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield2.getText());  
                       
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
                    if(abox3.isSelected())
                    {                       
                       if(anfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield3.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox3.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox3.isSelected())
                    {                       
                        if(acfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield3.getText());  
                       
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
                    if(abox4.isSelected())
                    {                       
                       if(anfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield4.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox4.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox4.isSelected())
                    {                       
                        if(acfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield4.getText());  
                       
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
                    if(abox5.isSelected())
                    {                       
                       if(anfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield5.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox5.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox5.isSelected())
                    {                       
                        if(acfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield5.getText());  
                       
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
                    if(abox6.isSelected())
                    {                       
                       if(anfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield6.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox6.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox6.isSelected())
                    {                       
                        if(acfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield6.getText());  
                       
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
                    if(abox7.isSelected())
                    {                       
                       if(anfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield7.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox7.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox7.isSelected())
                    {                       
                        if(acfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield7.getText());  
                       
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
                    if(abox8.isSelected())
                    {                       
                       if(anfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield8.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox8.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox8.isSelected())
                    {                       
                        if(acfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield8.getText());  
                       
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
                    if(abox9.isSelected())
                    {                       
                       if(anfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield9.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox9.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox9.isSelected())
                    {                       
                        if(acfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield9.getText());  
                       
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
                    if(abox10.isSelected())
                    {                       
                       if(anfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield10.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox10.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox10.isSelected())
                    {                       
                        if(acfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield10.getText());  
                       
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
                    if(abox11.isSelected())
                    {                       
                       if(anfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield11.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox11.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox11.isSelected())
                    {                       
                        if(acfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield11.getText());  
                       
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
                    if(abox12.isSelected())
                    {                       
                       if(anfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield12.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox12.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox12.isSelected())
                    {                       
                        if(acfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield12.getText());  
                       
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
                    if(abox13.isSelected())
                    {                       
                       if(anfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(anfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(acfield13.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+abox13.getText()+"',"+num+","+cos+",'Chocolate')");
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
                    if(abox13.isSelected())
                    {                       
                        if(acfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(acfield13.getText());  
                       
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
                    CMS.jChocolateNumber.setText(result1);
                    CMS.jChocolateCost.setText(result2);
                    
                    
                    
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
        frame.setTitle("Chocolate");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        

    }
}
