package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import static canteenmanagementsystem.CMS1.jSweetsCost;
import static canteenmanagementsystem.CMS1.jSweetsNumber;
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

public class Sweets1 {
    JCheckBox bbox1;
        JTextField bnfield1;
        JTextField bcfield1;
        JCheckBox bbox2;
        JTextField bnfield2;
        JTextField bcfield2;
        JCheckBox bbox3;
        JTextField bnfield3;
        JTextField bcfield3;
        JCheckBox bbox4;
        JTextField bnfield4;
        JTextField bcfield4;
        JCheckBox bbox5;
        JTextField bnfield5;
        JTextField bcfield5;
        JCheckBox bbox6;
        JTextField bnfield6;
        JTextField bcfield6;
        JCheckBox bbox7;
        JTextField bnfield7;
        JTextField bcfield7;
        JCheckBox bbox8;
        JTextField bnfield8;
        JTextField bcfield8;
        JCheckBox bbox9;
        JTextField bnfield9;
        JTextField bcfield9;
        JCheckBox bbox10;
        JTextField bnfield10;
        JTextField bcfield10;
        JCheckBox bbox11;
        JTextField bnfield11;
        JTextField bcfield11;
        JCheckBox bbox12;
        JTextField bnfield12;
        JTextField bcfield12;
        JCheckBox bbox13;
        JTextField bnfield13;
        JTextField bcfield13;
        JTextField bntotal;
        JTextField bctotal;
    public Sweets1()
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
        
        
        String query="SELECT pname FROM pdata WHERE ptype='Sweets' ORDER BY pname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                bbox1 = new JCheckBox(rs.getString("pname"));
                bbox1.setBounds(20, temp, 200, 30);
                bnfield1 = new JTextField();
                bnfield1.setBounds(230,temp,70,30);
                bcfield1 = new JTextField();
                bcfield1.setBounds(310, temp, 100, 30);
                bnfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox1);
                frame.add(bnfield1);
                frame.add(bcfield1);    
                bbox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox1.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield1.setText(null);
                        bcfield1.setText(null);
                        
                    }
                }
                });
                bnfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield1.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield1.getText().equals(null))
                {
                    bcfield1.setText(null);
                }
                }
                });
                
                bnfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(bnfield1.getText().equals(null))
                {
                    bcfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                bbox2 = new JCheckBox(rs.getString("pname"));
                bbox2.setBounds(20, temp, 200, 30);
                bnfield2 = new JTextField();
                bnfield2.setBounds(230,temp,70,30);
                bcfield2 = new JTextField();
                bcfield2.setBounds(310, temp, 100, 30);
                bnfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox2);
                frame.add(bnfield2);
                frame.add(bcfield2);
                
                bbox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox2.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield2.setText(null);
                        bcfield2.setText(null);
                    }
                }
                });
                bnfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield2.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield2.getText().equals(null))
                {
                    bcfield2.setText(null);
                }
                }
                });
                
                bnfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield2.getText().equals(null))
                {
                    
                    bcfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox3 = new JCheckBox(rs.getString("pname"));
                bbox3.setBounds(20, temp, 200, 30);
                bnfield3 = new JTextField();
                bnfield3.setBounds(230,temp,70,30);
                bcfield3 = new JTextField();
                bcfield3.setBounds(310, temp, 100, 30);
                bnfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox3);
                frame.add(bnfield3);
                frame.add(bcfield3);
                
                bbox3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox3.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield3.setText(null);
                        bcfield3.setText(null);
                    }
                }
                });
                bnfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield3.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield3.getText().equals(null))
                {
                    bcfield3.setText(null);
                }
                }
                });
                
                bnfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield3.getText().equals(null))
                {
                    bcfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox4 = new JCheckBox(rs.getString("pname"));
                bbox4.setBounds(20, temp, 200, 30);
                bnfield4 = new JTextField();
                bnfield4.setBounds(230,temp,70,30);
                bcfield4 = new JTextField();
                bcfield4.setBounds(310, temp, 100, 30);
                bnfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox4);
                frame.add(bnfield4);
                frame.add(bcfield4);
                
                bbox4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox4.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield4.setText(null);
                        bcfield4.setText(null);
                    }
                }
                });
                bnfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield4.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield4.getText().equals(null))
                {
                    bcfield4.setText(null);
                }
                }
                });
                
                bnfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield4.getText().equals(null))
                {
                    bcfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox5= new JCheckBox(rs.getString("pname"));
                bbox5.setBounds(20, temp, 200, 30);
                bnfield5 = new JTextField();
                bnfield5.setBounds(230,temp,70,30);
                bcfield5 = new JTextField();
                bcfield5.setBounds(310, temp, 100, 30);
                bnfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox5);
                frame.add(bnfield5);
                frame.add(bcfield5);
                
                bbox5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox5.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield5.setText(null);
                        bcfield5.setText(null);
                    }
                }
                });
                bnfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield5.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield5.getText().equals(null))
                {
                    bcfield5.setText(null);
                }
                }
                });
                
                bnfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield5.getText().equals(null))
                {
                    bcfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox6= new JCheckBox(rs.getString("pname"));
                bbox6.setBounds(20, temp, 200, 30);
                bnfield6 = new JTextField();
                bnfield6.setBounds(230,temp,70,30);
                bcfield6 = new JTextField();
                bcfield6.setBounds(310, temp, 100, 30);
                bnfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox6);
                frame.add(bnfield6);
                frame.add(bcfield6);
                
                bbox6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox6.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield6.setText(null);
                        bcfield6.setText(null);
                    }
                }
                });
                bnfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield6.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield6.getText().equals(null))
                {
                    bcfield6.setText(null);
                }
                }
                });
                
                bnfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        bcfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield6.getText().equals(null))
                {
                    bcfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox7= new JCheckBox(rs.getString("pname"));
                bbox7.setBounds(20, temp, 200, 30);
                bnfield7 = new JTextField();
                bnfield7.setBounds(230,temp,70,30);
                bcfield7 = new JTextField();
                bcfield7.setBounds(310, temp, 100, 30);
                bnfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox7);
                frame.add(bnfield7);
                frame.add(bcfield7);
                
                bbox7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox7.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield7.setText(null);
                        bcfield7.setText(null);
                    }
                }
                });
                bnfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield7.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield7.getText().equals(null))
                {
                    bcfield7.setText(null);
                }
                }
                });
                
                bnfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield7.getText().equals(null))
                {
                    bcfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox8= new JCheckBox(rs.getString("pname"));
                bbox8.setBounds(20, temp, 200, 30);
                bnfield8 = new JTextField();
                bnfield8.setBounds(230,temp,70,30);
                bcfield8 = new JTextField();
                bcfield8.setBounds(310, temp, 100, 30);
                bnfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox8);
                frame.add(bnfield8);
                frame.add(bcfield8);
                
                bbox8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox8.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield8.setText(null);
                        bcfield8.setText(null);
                    }
                }
                });
                bnfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield8.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield8.getText().equals(null))
                {
                    bcfield8.setText(null);
                }
                }
                });
                
                bnfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield8.getText().equals(null))
                {
                    bcfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox9= new JCheckBox(rs.getString("pname"));
                bbox9.setBounds(20, temp, 200, 30);
                bnfield9 = new JTextField();
                bnfield9.setBounds(230,temp,70,30);
                bcfield9 = new JTextField();
                bcfield9.setBounds(310, temp, 100, 30);
                bnfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox9);
                frame.add(bnfield9);
                frame.add(bcfield9);
                
                bbox9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox9.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield9.setText(null);
                        bcfield9.setText(null);
                    }
                }
                });
                bnfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield9.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield9.getText().equals(null))
                {
                    bcfield9.setText(null);
                }
                }
                });
                
                bnfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield9.getText().equals(null))
                {
                    bcfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox10= new JCheckBox(rs.getString("pname"));
                bbox10.setBounds(20, temp, 200, 30);
                bnfield10 = new JTextField();
                bnfield10.setBounds(230,temp,70,30);
                bcfield10 = new JTextField();
                bcfield10.setBounds(310, temp, 100, 30);
                bnfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox10);
                frame.add(bnfield10);
                frame.add(bcfield10);
                
                bbox10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox10.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield10.setText(null);
                        bcfield10.setText(null);
                    }
                }
                });
                bnfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield10.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield10.getText().equals(null))
                {
                    bcfield10.setText(null);
                }
                }
                });
                
                bnfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield10.getText().equals(null))
                {
                    bcfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox11= new JCheckBox(rs.getString("pname"));
                bbox11.setBounds(20, temp, 200, 30);
                bnfield11 = new JTextField();
                bnfield11.setBounds(230,temp,70,30);
                bcfield11 = new JTextField();
                bcfield11.setBounds(310, temp, 100, 30);
                bnfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox11);
                frame.add(bnfield11);
                frame.add(bcfield11);
                
                bbox11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox11.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield11.setText(null);
                        bcfield11.setText(null);
                    }
                }
                });
                bnfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield11.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield11.getText().equals(null))
                {
                    bcfield11.setText(null);
                }
                }
                });
                
                bnfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield11.getText().equals(null))
                {
                    bcfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox12= new JCheckBox(rs.getString("pname"));
                bbox12.setBounds(20, temp, 200, 30);
                bnfield12 = new JTextField();
                bnfield12.setBounds(230,temp,70,30);
                bcfield12 = new JTextField();
                bcfield12.setBounds(310, temp, 100, 30);
                bnfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox12);
                frame.add(bnfield12);
                frame.add(bcfield12);
                
                bbox12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox12.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield12.setText(null);
                        bcfield12.setText(null);
                    }
                }
                });
                bnfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield12.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield12.getText().equals(null))
                {
                    bcfield12.setText(null);
                }
                }
                });
                
                bnfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield12.getText().equals(null))
                {
                    bcfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                bbox13= new JCheckBox(rs.getString("pname"));
                bbox13.setBounds(20, temp, 200, 30);
                bnfield13 = new JTextField();
                bnfield13.setBounds(230,temp,70,30);
                bcfield13 = new JTextField();
                bcfield13.setBounds(310, temp, 100, 30);
                bnfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bnfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bnfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bcfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bcfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                bcfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                bbox13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(bbox13);
                frame.add(bnfield13);
                frame.add(bcfield13);
                
                bbox13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bbox13.isSelected())
                    {
                        
                    }
                    else
                    {
                        bnfield13.setText(null);
                        bcfield13.setText(null);
                    }
                }
                });
                bnfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(bbox13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield13.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check bbox Item");
                   }
                     if(bnfield13.getText().equals(null))
                {
                    bcfield13.setText(null);
                }
                }
                });
                
                bnfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(bbox13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(bnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Sweets' ORDER BY pname ASC ");
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
                        bcfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(bnfield13.getText().equals(null))
                {
                    bcfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              bntotal = new JTextField();
              bctotal = new JTextField();
              bntotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              bntotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              bntotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              bctotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              bctotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              bctotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              bntotal.setBounds(230,temp,70,30);
              bctotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(bbox1.isSelected())
                    {                       
                       if(bnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield1.getText());  
                       
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
                    if(bbox1.isSelected())
                    {                       
                        if(bcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield1.getText());  
                       
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
                    if(bbox2.isSelected())
                    {                       
                       if(bnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield2.getText());  
                       
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
                    if(bbox2.isSelected())
                    {                       
                        if(bcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield2.getText());  
                       
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
                    if(bbox3.isSelected())
                    {                       
                       if(bnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield3.getText());  
                       
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
                    if(bbox3.isSelected())
                    {                       
                        if(bcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield3.getText());  
                       
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
                    if(bbox4.isSelected())
                    {                       
                       if(bnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield4.getText());  
                       
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
                    if(bbox4.isSelected())
                    {                       
                        if(bcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield4.getText());  
                       
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
                    if(bbox5.isSelected())
                    {                       
                       if(bnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield5.getText());  
                       
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
                    if(bbox5.isSelected())
                    {                       
                        if(bcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield5.getText());  
                       
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
                    if(bbox6.isSelected())
                    {                       
                       if(bnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield6.getText());  
                       
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
                    if(bbox6.isSelected())
                    {                       
                        if(bcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield6.getText());  
                       
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
                    if(bbox7.isSelected())
                    {                       
                       if(bnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield7.getText());  
                       
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
                    if(bbox7.isSelected())
                    {                       
                        if(bcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield7.getText());  
                       
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
                    if(bbox8.isSelected())
                    {                       
                       if(bnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield8.getText());  
                       
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
                    if(bbox8.isSelected())
                    {                       
                        if(bcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield8.getText());  
                       
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
                    if(bbox9.isSelected())
                    {                       
                       if(bnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield9.getText());  
                       
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
                    if(bbox9.isSelected())
                    {                       
                        if(bcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield9.getText());  
                       
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
                    if(bbox10.isSelected())
                    {                       
                       if(bnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield10.getText());  
                       
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
                    if(bbox10.isSelected())
                    {                       
                        if(bcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield10.getText());  
                       
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
                    if(bbox11.isSelected())
                    {                       
                       if(bnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield11.getText());  
                       
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
                    if(bbox11.isSelected())
                    {                       
                        if(bcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield11.getText());  
                       
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
                    if(bbox12.isSelected())
                    {                       
                       if(bnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield12.getText());  
                       
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
                    if(bbox12.isSelected())
                    {                       
                        if(bcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield12.getText());  
                       
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
                    if(bbox13.isSelected())
                    {                       
                       if(bnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield13.getText());  
                       
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
                    if(bbox13.isSelected())
                    {                       
                        if(bcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield13.getText());  
                       
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
                    bntotal.setText(result1);
                    bctotal.setText(result2);
                    jSweetsNumber.setText(result1);
                    jSweetsCost.setText(result2);
                    
                }
            });
              frame.add(total);
              frame.add(bntotal);
              frame.add(bctotal);
              
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
                    if(bbox1.isSelected())
                    {                       
                       if(bnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield1.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox1.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox1.isSelected())
                    {                       
                        if(bcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield1.getText());  
                       
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
                    if(bbox2.isSelected())
                    {                       
                       if(bnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield2.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox2.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox2.isSelected())
                    {                       
                        if(bcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield2.getText());  
                       
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
                    if(bbox3.isSelected())
                    {                       
                       if(bnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield3.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox3.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox3.isSelected())
                    {                       
                        if(bcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield3.getText());  
                       
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
                    if(bbox4.isSelected())
                    {                       
                       if(bnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield4.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox4.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox4.isSelected())
                    {                       
                        if(bcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield4.getText());  
                       
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
                    if(bbox5.isSelected())
                    {                       
                       if(bnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield5.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox5.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox5.isSelected())
                    {                       
                        if(bcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield5.getText());  
                       
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
                    if(bbox6.isSelected())
                    {                       
                       if(bnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield6.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox6.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox6.isSelected())
                    {                       
                        if(bcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield6.getText());  
                       
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
                    if(bbox7.isSelected())
                    {                       
                       if(bnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield7.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox7.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox7.isSelected())
                    {                       
                        if(bcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield7.getText());  
                       
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
                    if(bbox8.isSelected())
                    {                       
                       if(bnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield8.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox8.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox8.isSelected())
                    {                       
                        if(bcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield8.getText());  
                       
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
                    if(bbox9.isSelected())
                    {                       
                       if(bnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield9.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox9.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox9.isSelected())
                    {                       
                        if(bcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield9.getText());  
                       
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
                    if(bbox10.isSelected())
                    {                       
                       if(bnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield10.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox10.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox10.isSelected())
                    {                       
                        if(bcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield10.getText());  
                       
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
                    if(bbox11.isSelected())
                    {                       
                       if(bnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield11.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox11.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox11.isSelected())
                    {                       
                        if(bcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield11.getText());  
                       
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
                    if(bbox12.isSelected())
                    {                       
                       if(bnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield12.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox12.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox12.isSelected())
                    {                       
                        if(bcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield12.getText());  
                       
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
                    if(bbox13.isSelected())
                    {                       
                       if(bnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(bnfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(bcfield13.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+bbox13.getText()+"',"+num+","+cos+",'Sweets')");
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
                    if(bbox13.isSelected())
                    {                       
                        if(bcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(bcfield13.getText());  
                       
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
                    CMS1.jSweetsNumber.setText(result1);
                    CMS1.jSweetsCost.setText(result2);
                    
                    
                    
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
        frame.setTitle("Sweets");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
   
    }
}
