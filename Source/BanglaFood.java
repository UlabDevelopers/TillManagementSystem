package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import static canteenmanagementsystem.CMS.jBiscuitsCost;
import static canteenmanagementsystem.CMS.jBiscuitsNumber;
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

public class Cooking {
    JCheckBox gbox1;
        JTextField gnfield1;
        JTextField gcfield1;
        JCheckBox gbox2;
        JTextField gnfield2;
        JTextField gcfield2;
        JCheckBox gbox3;
        JTextField gnfield3;
        JTextField gcfield3;
        JCheckBox gbox4;
        JTextField gnfield4;
        JTextField gcfield4;
        JCheckBox gbox5;
        JTextField gnfield5;
        JTextField gcfield5;
        JCheckBox gbox6;
        JTextField gnfield6;
        JTextField gcfield6;
        JCheckBox gbox7;
        JTextField gnfield7;
        JTextField gcfield7;
        JCheckBox gbox8;
        JTextField gnfield8;
        JTextField gcfield8;
        JCheckBox gbox9;
        JTextField gnfield9;
        JTextField gcfield9;
        JCheckBox gbox10;
        JTextField gnfield10;
        JTextField gcfield10;
        JCheckBox gbox11;
        JTextField gnfield11;
        JTextField gcfield11;
        JCheckBox gbox12;
        JTextField gnfield12;
        JTextField gcfield12;
        JCheckBox gbox13;
        JTextField gnfield13;
        JTextField gcfield13;
        JTextField gntotal;
        JTextField cctotal;
        public Cooking()
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
        
        String query="SELECT cname FROM cdata ORDER BY cname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                gbox1 = new JCheckBox(rs.getString("cname"));
                gbox1.setBounds(20, temp, 200, 30);
                gnfield1 = new JTextField();
                gnfield1.setBounds(230,temp,70,30);
                gcfield1 = new JTextField();
                gcfield1.setBounds(310, temp, 100, 30);
                gnfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox1);
                frame.add(gnfield1);
                frame.add(gcfield1);    
                gbox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox1.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield1.setText(null);
                        gcfield1.setText(null);
                        
                    }
                }
                });
                gnfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield1.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield1.getText().equals(null))
                {
                    gcfield1.setText(null);
                }
                }
                });
                
                gnfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(gnfield1.getText().equals(null))
                {
                    gcfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                gbox2 = new JCheckBox(rs.getString("cname"));
                gbox2.setBounds(20, temp, 200, 30);
                gnfield2 = new JTextField();
                gnfield2.setBounds(230,temp,70,30);
                gcfield2 = new JTextField();
                gcfield2.setBounds(310, temp, 100, 30);
                gnfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox2);
                frame.add(gnfield2);
                frame.add(gcfield2);
                
                gbox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox2.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield2.setText(null);
                        gcfield2.setText(null);
                    }
                }
                });
                gnfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield2.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield2.getText().equals(null))
                {
                    gcfield2.setText(null);
                }
                }
                });
                
                gnfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield2.getText().equals(null))
                {
                    
                    gcfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox3 = new JCheckBox(rs.getString("cname"));
                gbox3.setBounds(20, temp, 200, 30);
                gnfield3 = new JTextField();
                gnfield3.setBounds(230,temp,70,30);
                gcfield3 = new JTextField();
                gcfield3.setBounds(310, temp, 100, 30);
                gnfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox3);
                frame.add(gnfield3);
                frame.add(gcfield3);
                
                gbox3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox3.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield3.setText(null);
                        gcfield3.setText(null);
                    }
                }
                });
                gnfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield3.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield3.getText().equals(null))
                {
                    gcfield3.setText(null);
                }
                }
                });
                
                gnfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield3.getText().equals(null))
                {
                    gcfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox4 = new JCheckBox(rs.getString("cname"));
                gbox4.setBounds(20, temp, 200, 30);
                gnfield4 = new JTextField();
                gnfield4.setBounds(230,temp,70,30);
                gcfield4 = new JTextField();
                gcfield4.setBounds(310, temp, 100, 30);
                gnfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox4);
                frame.add(gnfield4);
                frame.add(gcfield4);
                
                gbox4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox4.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield4.setText(null);
                        gcfield4.setText(null);
                    }
                }
                });
                gnfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield4.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield4.getText().equals(null))
                {
                    gcfield4.setText(null);
                }
                }
                });
                
                gnfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield4.getText().equals(null))
                {
                    gcfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox5= new JCheckBox(rs.getString("cname"));
                gbox5.setBounds(20, temp, 200, 30);
                gnfield5 = new JTextField();
                gnfield5.setBounds(230,temp,70,30);
                gcfield5 = new JTextField();
                gcfield5.setBounds(310, temp, 100, 30);
                gnfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox5);
                frame.add(gnfield5);
                frame.add(gcfield5);
                
                gbox5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox5.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield5.setText(null);
                        gcfield5.setText(null);
                    }
                }
                });
                gnfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield5.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield5.getText().equals(null))
                {
                    gcfield5.setText(null);
                }
                }
                });
                
                gnfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield5.getText().equals(null))
                {
                    gcfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox6= new JCheckBox(rs.getString("cname"));
                gbox6.setBounds(20, temp, 200, 30);
                gnfield6 = new JTextField();
                gnfield6.setBounds(230,temp,70,30);
                gcfield6 = new JTextField();
                gcfield6.setBounds(310, temp, 100, 30);
                gnfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox6);
                frame.add(gnfield6);
                frame.add(gcfield6);
                
                gbox6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox6.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield6.setText(null);
                        gcfield6.setText(null);
                    }
                }
                });
                gnfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield6.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield6.getText().equals(null))
                {
                    gcfield6.setText(null);
                }
                }
                });
                
                gnfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield6.getText().equals(null))
                {
                    gcfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox7= new JCheckBox(rs.getString("cname"));
                gbox7.setBounds(20, temp, 200, 30);
                gnfield7 = new JTextField();
                gnfield7.setBounds(230,temp,70,30);
                gcfield7 = new JTextField();
                gcfield7.setBounds(310, temp, 100, 30);
                gnfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox7);
                frame.add(gnfield7);
                frame.add(gcfield7);
                
                gbox7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox7.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield7.setText(null);
                        gcfield7.setText(null);
                    }
                }
                });
                gnfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield7.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield7.getText().equals(null))
                {
                    gcfield7.setText(null);
                }
                }
                });
                
                gnfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield7.getText().equals(null))
                {
                    gcfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox8= new JCheckBox(rs.getString("cname"));
                gbox8.setBounds(20, temp, 200, 30);
                gnfield8 = new JTextField();
                gnfield8.setBounds(230,temp,70,30);
                gcfield8 = new JTextField();
                gcfield8.setBounds(310, temp, 100, 30);
                gnfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox8);
                frame.add(gnfield8);
                frame.add(gcfield8);
                
                gbox8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox8.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield8.setText(null);
                        gcfield8.setText(null);
                    }
                }
                });
                gnfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield8.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield8.getText().equals(null))
                {
                    gcfield8.setText(null);
                }
                }
                });
                
                gnfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield8.getText().equals(null))
                {
                    gcfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox9= new JCheckBox(rs.getString("cname"));
                gbox9.setBounds(20, temp, 200, 30);
                gnfield9 = new JTextField();
                gnfield9.setBounds(230,temp,70,30);
                gcfield9 = new JTextField();
                gcfield9.setBounds(310, temp, 100, 30);
                gnfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox9);
                frame.add(gnfield9);
                frame.add(gcfield9);
                
                gbox9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox9.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield9.setText(null);
                        gcfield9.setText(null);
                    }
                }
                });
                gnfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield9.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield9.getText().equals(null))
                {
                    gcfield9.setText(null);
                }
                }
                });
                
                gnfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield9.getText().equals(null))
                {
                    gcfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox10= new JCheckBox(rs.getString("cname"));
                gbox10.setBounds(20, temp, 200, 30);
                gnfield10 = new JTextField();
                gnfield10.setBounds(230,temp,70,30);
                gcfield10 = new JTextField();
                gcfield10.setBounds(310, temp, 100, 30);
                gnfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox10);
                frame.add(gnfield10);
                frame.add(gcfield10);
                
                gbox10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox10.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield10.setText(null);
                        gcfield10.setText(null);
                    }
                }
                });
                gnfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield10.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield10.getText().equals(null))
                {
                    gcfield10.setText(null);
                }
                }
                });
                
                gnfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield10.getText().equals(null))
                {
                    gcfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox11= new JCheckBox(rs.getString("cname"));
                gbox11.setBounds(20, temp, 200, 30);
                gnfield11 = new JTextField();
                gnfield11.setBounds(230,temp,70,30);
                gcfield11 = new JTextField();
                gcfield11.setBounds(310, temp, 100, 30);
                gnfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox11);
                frame.add(gnfield11);
                frame.add(gcfield11);
                
                gbox11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox11.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield11.setText(null);
                        gcfield11.setText(null);
                    }
                }
                });
                gnfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield11.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield11.getText().equals(null))
                {
                    gcfield11.setText(null);
                }
                }
                });
                
                gnfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield11.getText().equals(null))
                {
                    gcfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox12= new JCheckBox(rs.getString("cname"));
                gbox12.setBounds(20, temp, 200, 30);
                gnfield12 = new JTextField();
                gnfield12.setBounds(230,temp,70,30);
                gcfield12 = new JTextField();
                gcfield12.setBounds(310, temp, 100, 30);
                gnfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox12);
                frame.add(gnfield12);
                frame.add(gcfield12);
                
                gbox12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox12.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield12.setText(null);
                        gcfield12.setText(null);
                    }
                }
                });
                gnfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield12.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield12.getText().equals(null))
                {
                    gcfield12.setText(null);
                }
                }
                });
                
                gnfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield12.getText().equals(null))
                {
                    gcfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                gbox13= new JCheckBox(rs.getString("cname"));
                gbox13.setBounds(20, temp, 200, 30);
                gnfield13 = new JTextField();
                gnfield13.setBounds(230,temp,70,30);
                gcfield13 = new JTextField();
                gcfield13.setBounds(310, temp, 100, 30);
                gnfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gnfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gnfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gcfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                gcfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                gcfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                gbox13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(gbox13);
                frame.add(gnfield13);
                frame.add(gcfield13);
                
                gbox13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(gbox13.isSelected())
                    {
                        
                    }
                    else
                    {
                        gnfield13.setText(null);
                        gcfield13.setText(null);
                    }
                }
                });
                gnfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(gbox13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield13.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check gbox Item");
                   }
                     if(gnfield13.getText().equals(null))
                {
                    gcfield13.setText(null);
                }
                }
                });
                
                gnfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(gbox13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(gnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select ccost from cdata  ORDER BY cname ASC ");
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
                        double cost =rs1.getDouble("ccost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        gcfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(gnfield13.getText().equals(null))
                {
                    gcfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              gntotal = new JTextField();
              cctotal = new JTextField();
              gntotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              gntotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              gntotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              cctotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              cctotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              cctotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              gntotal.setBounds(230,temp,70,30);
              cctotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(gbox1.isSelected())
                    {                       
                       if(gnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield1.getText());  
                       
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
                    if(gbox1.isSelected())
                    {                       
                        if(gcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield1.getText());  
                       
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
                    if(gbox2.isSelected())
                    {                       
                       if(gnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield2.getText());  
                       
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
                    if(gbox2.isSelected())
                    {                       
                        if(gcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield2.getText());  
                       
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
                    if(gbox3.isSelected())
                    {                       
                       if(gnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield3.getText());  
                       
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
                    if(gbox3.isSelected())
                    {                       
                        if(gcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield3.getText());  
                       
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
                    if(gbox4.isSelected())
                    {                       
                       if(gnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield4.getText());  
                       
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
                    if(gbox4.isSelected())
                    {                       
                        if(gcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield4.getText());  
                       
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
                    if(gbox5.isSelected())
                    {                       
                       if(gnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield5.getText());  
                       
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
                    if(gbox5.isSelected())
                    {                       
                        if(gcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield5.getText());  
                       
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
                    if(gbox6.isSelected())
                    {                       
                       if(gnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield6.getText());  
                       
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
                    if(gbox6.isSelected())
                    {                       
                        if(gcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield6.getText());  
                       
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
                    if(gbox7.isSelected())
                    {                       
                       if(gnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield7.getText());  
                       
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
                    if(gbox7.isSelected())
                    {                       
                        if(gcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield7.getText());  
                       
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
                    if(gbox8.isSelected())
                    {                       
                       if(gnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield8.getText());  
                       
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
                    if(gbox8.isSelected())
                    {                       
                        if(gcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield8.getText());  
                       
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
                    if(gbox9.isSelected())
                    {                       
                       if(gnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield9.getText());  
                       
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
                    if(gbox9.isSelected())
                    {                       
                        if(gcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield9.getText());  
                       
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
                    if(gbox10.isSelected())
                    {                       
                       if(gnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield10.getText());  
                       
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
                    if(gbox10.isSelected())
                    {                       
                        if(gcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield10.getText());  
                       
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
                    if(gbox11.isSelected())
                    {                       
                       if(gnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield11.getText());  
                       
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
                    if(gbox11.isSelected())
                    {                       
                        if(gcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield11.getText());  
                       
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
                    if(gbox12.isSelected())
                    {                       
                       if(gnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield12.getText());  
                       
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
                    if(gbox12.isSelected())
                    {                       
                        if(gcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield12.getText());  
                       
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
                    if(gbox13.isSelected())
                    {                       
                       if(gnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield13.getText());  
                       
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
                    if(gbox13.isSelected())
                    {                       
                        if(gcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield13.getText());  
                       
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
                    gntotal.setText(result1);
                    cctotal.setText(result2);
                    CMS.jCookingNumber.setText(result1);
                    CMS.jCookingCost.setText(result2);
                    
                }
            });
              frame.add(total);
              frame.add(gntotal);
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
                    if(gbox1.isSelected())
                    {                       
                       if(gnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield1.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox1.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox1.isSelected())
                    {                       
                        if(gcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield1.getText());  
                       
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
                    if(gbox2.isSelected())
                    {                       
                       if(gnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield2.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox2.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox2.isSelected())
                    {                       
                        if(gcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield2.getText());  
                       
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
                    if(gbox3.isSelected())
                    {                       
                       if(gnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield3.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox3.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox3.isSelected())
                    {                       
                        if(gcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield3.getText());  
                       
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
                    if(gbox4.isSelected())
                    {                       
                       if(gnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield4.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox4.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox4.isSelected())
                    {                       
                        if(gcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield4.getText());  
                       
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
                    if(gbox5.isSelected())
                    {                       
                       if(gnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield5.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox5.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox5.isSelected())
                    {                       
                        if(gcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield5.getText());  
                       
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
                    if(gbox6.isSelected())
                    {                       
                       if(gnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield6.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox6.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox6.isSelected())
                    {                       
                        if(gcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield6.getText());  
                       
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
                    if(gbox7.isSelected())
                    {                       
                       if(gnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield7.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox7.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox7.isSelected())
                    {                       
                        if(gcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield7.getText());  
                       
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
                    if(gbox8.isSelected())
                    {                       
                       if(gnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield8.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox8.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox8.isSelected())
                    {                       
                        if(gcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield8.getText());  
                       
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
                    if(gbox9.isSelected())
                    {                       
                       if(gnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield9.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox9.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox9.isSelected())
                    {                       
                        if(gcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield9.getText());  
                       
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
                    if(gbox10.isSelected())
                    {                       
                       if(gnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield10.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox10.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox10.isSelected())
                    {                       
                        if(gcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield10.getText());  
                       
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
                    if(gbox11.isSelected())
                    {                       
                       if(gnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield11.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox11.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox11.isSelected())
                    {                       
                        if(gcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield11.getText());  
                       
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
                    if(gbox12.isSelected())
                    {                       
                       if(gnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield12.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox12.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox12.isSelected())
                    {                       
                        if(gcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield12.getText());  
                       
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
                    if(gbox13.isSelected())
                    {                       
                       if(gnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(gnfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(gcfield13.getText());
                               st1.executeUpdate("INSERT INTO tempdata VALUES('"+gbox13.getText()+"',"+num+","+cos+",'Cooking')");
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
                    if(gbox13.isSelected())
                    {                       
                        if(gcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(gcfield13.getText());  
                       
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
                    CMS.jCookingNumber.setText(result1);
                    CMS.jCookingCost.setText(result2);
                    
                    
                    
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
            var = new JCheckBox(rs.getString("cname"));
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
        frame.setTitle("Cooking");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        }
}
