package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import static canteenmanagementsystem.CMS.jChipsCost;
import static canteenmanagementsystem.CMS.jChipsNumber;
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


public class Chips {
    JCheckBox dbox1;
        JTextField dnfield1;
        JTextField dcfield1;
        JCheckBox dbox2;
        JTextField dnfield2;
        JTextField dcfield2;
        JCheckBox dbox3;
        JTextField dnfield3;
        JTextField dcfield3;
        JCheckBox dbox4;
        JTextField dnfield4;
        JTextField dcfield4;
        JCheckBox dbox5;
        JTextField dnfield5;
        JTextField dcfield5;
        JCheckBox dbox6;
        JTextField dnfield6;
        JTextField dcfield6;
        JCheckBox dbox7;
        JTextField dnfield7;
        JTextField dcfield7;
        JCheckBox dbox8;
        JTextField dnfield8;
        JTextField dcfield8;
        JCheckBox dbox9;
        JTextField dnfield9;
        JTextField dcfield9;
        JCheckBox dbox10;
        JTextField dnfield10;
        JTextField dcfield10;
        JCheckBox dbox11;
        JTextField dnfield11;
        JTextField dcfield11;
        JCheckBox dbox12;
        JTextField dnfield12;
        JTextField dcfield12;
        JCheckBox dbox13;
        JTextField dnfield13;
        JTextField dcfield13;
        JTextField dntotal;
        JTextField dctotal;
    public Chips()
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
        
        
        String query="SELECT pname FROM pdata WHERE ptype='Chips' ORDER BY pname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                dbox1 = new JCheckBox(rs.getString("pname"));
                dbox1.setBounds(20, temp, 200, 30);
                dnfield1 = new JTextField();
                dnfield1.setBounds(230,temp,70,30);
                dcfield1 = new JTextField();
                dcfield1.setBounds(310, temp, 100, 30);
                dnfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox1);
                frame.add(dnfield1);
                frame.add(dcfield1);    
                dbox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox1.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield1.setText(null);
                        dcfield1.setText(null);
                        
                    }
                }
                });
                dnfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield1.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield1.getText().equals(null))
                {
                    dcfield1.setText(null);
                }
                }
                });
                
                dnfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(dnfield1.getText().equals(null))
                {
                    dcfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                dbox2 = new JCheckBox(rs.getString("pname"));
                dbox2.setBounds(20, temp, 200, 30);
                dnfield2 = new JTextField();
                dnfield2.setBounds(230,temp,70,30);
                dcfield2 = new JTextField();
                dcfield2.setBounds(310, temp, 100, 30);
                dnfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox2);
                frame.add(dnfield2);
                frame.add(dcfield2);
                
                dbox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox2.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield2.setText(null);
                        dcfield2.setText(null);
                    }
                }
                });
                dnfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield2.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield2.getText().equals(null))
                {
                    dcfield2.setText(null);
                }
                }
                });
                
                dnfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield2.getText().equals(null))
                {
                    
                    dcfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox3 = new JCheckBox(rs.getString("pname"));
                dbox3.setBounds(20, temp, 200, 30);
                dnfield3 = new JTextField();
                dnfield3.setBounds(230,temp,70,30);
                dcfield3 = new JTextField();
                dcfield3.setBounds(310, temp, 100, 30);
                dnfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox3);
                frame.add(dnfield3);
                frame.add(dcfield3);
                
                dbox3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox3.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield3.setText(null);
                        dcfield3.setText(null);
                    }
                }
                });
                dnfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield3.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield3.getText().equals(null))
                {
                    dcfield3.setText(null);
                }
                }
                });
                
                dnfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield3.getText().equals(null))
                {
                    dcfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox4 = new JCheckBox(rs.getString("pname"));
                dbox4.setBounds(20, temp, 200, 30);
                dnfield4 = new JTextField();
                dnfield4.setBounds(230,temp,70,30);
                dcfield4 = new JTextField();
                dcfield4.setBounds(310, temp, 100, 30);
                dnfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox4);
                frame.add(dnfield4);
                frame.add(dcfield4);
                
                dbox4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox4.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield4.setText(null);
                        dcfield4.setText(null);
                    }
                }
                });
                dnfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield4.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield4.getText().equals(null))
                {
                    dcfield4.setText(null);
                }
                }
                });
                
                dnfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield4.getText().equals(null))
                {
                    dcfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox5= new JCheckBox(rs.getString("pname"));
                dbox5.setBounds(20, temp, 200, 30);
                dnfield5 = new JTextField();
                dnfield5.setBounds(230,temp,70,30);
                dcfield5 = new JTextField();
                dcfield5.setBounds(310, temp, 100, 30);
                dnfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox5);
                frame.add(dnfield5);
                frame.add(dcfield5);
                
                dbox5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox5.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield5.setText(null);
                        dcfield5.setText(null);
                    }
                }
                });
                dnfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield5.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield5.getText().equals(null))
                {
                    dcfield5.setText(null);
                }
                }
                });
                
                dnfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield5.getText().equals(null))
                {
                    dcfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox6= new JCheckBox(rs.getString("pname"));
                dbox6.setBounds(20, temp, 200, 30);
                dnfield6 = new JTextField();
                dnfield6.setBounds(230,temp,70,30);
                dcfield6 = new JTextField();
                dcfield6.setBounds(310, temp, 100, 30);
                dnfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox6);
                frame.add(dnfield6);
                frame.add(dcfield6);
                
                dbox6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox6.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield6.setText(null);
                        dcfield6.setText(null);
                    }
                }
                });
                dnfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield6.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield6.getText().equals(null))
                {
                    dcfield6.setText(null);
                }
                }
                });
                
                dnfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        dcfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield6.getText().equals(null))
                {
                    dcfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox7= new JCheckBox(rs.getString("pname"));
                dbox7.setBounds(20, temp, 200, 30);
                dnfield7 = new JTextField();
                dnfield7.setBounds(230,temp,70,30);
                dcfield7 = new JTextField();
                dcfield7.setBounds(310, temp, 100, 30);
                dnfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox7);
                frame.add(dnfield7);
                frame.add(dcfield7);
                
                dbox7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox7.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield7.setText(null);
                        dcfield7.setText(null);
                    }
                }
                });
                dnfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield7.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield7.getText().equals(null))
                {
                    dcfield7.setText(null);
                }
                }
                });
                
                dnfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield7.getText().equals(null))
                {
                    dcfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox8= new JCheckBox(rs.getString("pname"));
                dbox8.setBounds(20, temp, 200, 30);
                dnfield8 = new JTextField();
                dnfield8.setBounds(230,temp,70,30);
                dcfield8 = new JTextField();
                dcfield8.setBounds(310, temp, 100, 30);
                dnfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox8);
                frame.add(dnfield8);
                frame.add(dcfield8);
                
                dbox8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox8.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield8.setText(null);
                        dcfield8.setText(null);
                    }
                }
                });
                dnfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield8.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield8.getText().equals(null))
                {
                    dcfield8.setText(null);
                }
                }
                });
                
                dnfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield8.getText().equals(null))
                {
                    dcfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox9= new JCheckBox(rs.getString("pname"));
                dbox9.setBounds(20, temp, 200, 30);
                dnfield9 = new JTextField();
                dnfield9.setBounds(230,temp,70,30);
                dcfield9 = new JTextField();
                dcfield9.setBounds(310, temp, 100, 30);
                dnfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox9);
                frame.add(dnfield9);
                frame.add(dcfield9);
                
                dbox9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox9.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield9.setText(null);
                        dcfield9.setText(null);
                    }
                }
                });
                dnfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield9.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield9.getText().equals(null))
                {
                    dcfield9.setText(null);
                }
                }
                });
                
                dnfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield9.getText().equals(null))
                {
                    dcfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox10= new JCheckBox(rs.getString("pname"));
                dbox10.setBounds(20, temp, 200, 30);
                dnfield10 = new JTextField();
                dnfield10.setBounds(230,temp,70,30);
                dcfield10 = new JTextField();
                dcfield10.setBounds(310, temp, 100, 30);
                dnfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox10);
                frame.add(dnfield10);
                frame.add(dcfield10);
                
                dbox10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox10.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield10.setText(null);
                        dcfield10.setText(null);
                    }
                }
                });
                dnfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield10.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield10.getText().equals(null))
                {
                    dcfield10.setText(null);
                }
                }
                });
                
                dnfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield10.getText().equals(null))
                {
                    dcfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox11= new JCheckBox(rs.getString("pname"));
                dbox11.setBounds(20, temp, 200, 30);
                dnfield11 = new JTextField();
                dnfield11.setBounds(230,temp,70,30);
                dcfield11 = new JTextField();
                dcfield11.setBounds(310, temp, 100, 30);
                dnfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox11);
                frame.add(dnfield11);
                frame.add(dcfield11);
                
                dbox11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox11.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield11.setText(null);
                        dcfield11.setText(null);
                    }
                }
                });
                dnfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield11.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield11.getText().equals(null))
                {
                    dcfield11.setText(null);
                }
                }
                });
                
                dnfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield11.getText().equals(null))
                {
                    dcfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox12= new JCheckBox(rs.getString("pname"));
                dbox12.setBounds(20, temp, 200, 30);
                dnfield12 = new JTextField();
                dnfield12.setBounds(230,temp,70,30);
                dcfield12 = new JTextField();
                dcfield12.setBounds(310, temp, 100, 30);
                dnfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox12);
                frame.add(dnfield12);
                frame.add(dcfield12);
                
                dbox12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox12.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield12.setText(null);
                        dcfield12.setText(null);
                    }
                }
                });
                dnfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield12.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield12.getText().equals(null))
                {
                    dcfield12.setText(null);
                }
                }
                });
                
                dnfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield12.getText().equals(null))
                {
                    dcfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                dbox13= new JCheckBox(rs.getString("pname"));
                dbox13.setBounds(20, temp, 200, 30);
                dnfield13 = new JTextField();
                dnfield13.setBounds(230,temp,70,30);
                dcfield13 = new JTextField();
                dcfield13.setBounds(310, temp, 100, 30);
                dnfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dnfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dnfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dcfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                dcfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                dcfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                dbox13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(dbox13);
                frame.add(dnfield13);
                frame.add(dcfield13);
                
                dbox13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(dbox13.isSelected())
                    {
                        
                    }
                    else
                    {
                        dnfield13.setText(null);
                        dcfield13.setText(null);
                    }
                }
                });
                dnfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(dbox13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield13.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check dbox Item");
                   }
                     if(dnfield13.getText().equals(null))
                {
                    dcfield13.setText(null);
                }
                }
                });
                
                dnfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(dbox13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(dnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Chips' ORDER BY pname ASC ");
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
                        dcfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(dnfield13.getText().equals(null))
                {
                    dcfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              dntotal = new JTextField();
              dctotal = new JTextField();
              dntotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              dntotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              dntotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              dctotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              dctotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              dctotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              dntotal.setBounds(230,temp,70,30);
              dctotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(dbox1.isSelected())
                    {                       
                       if(dnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield1.getText());  
                       
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
                    if(dbox1.isSelected())
                    {                       
                        if(dcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield1.getText());  
                       
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
                    if(dbox2.isSelected())
                    {                       
                       if(dnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield2.getText());  
                       
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
                    if(dbox2.isSelected())
                    {                       
                        if(dcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield2.getText());  
                       
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
                    if(dbox3.isSelected())
                    {                       
                       if(dnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield3.getText());  
                       
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
                    if(dbox3.isSelected())
                    {                       
                        if(dcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield3.getText());  
                       
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
                    if(dbox4.isSelected())
                    {                       
                       if(dnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield4.getText());  
                       
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
                    if(dbox4.isSelected())
                    {                       
                        if(dcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield4.getText());  
                       
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
                    if(dbox5.isSelected())
                    {                       
                       if(dnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield5.getText());  
                       
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
                    if(dbox5.isSelected())
                    {                       
                        if(dcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield5.getText());  
                       
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
                    if(dbox6.isSelected())
                    {                       
                       if(dnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield6.getText());  
                       
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
                    if(dbox6.isSelected())
                    {                       
                        if(dcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield6.getText());  
                       
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
                    if(dbox7.isSelected())
                    {                       
                       if(dnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield7.getText());  
                       
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
                    if(dbox7.isSelected())
                    {                       
                        if(dcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield7.getText());  
                       
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
                    if(dbox8.isSelected())
                    {                       
                       if(dnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield8.getText());  
                       
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
                    if(dbox8.isSelected())
                    {                       
                        if(dcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield8.getText());  
                       
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
                    if(dbox9.isSelected())
                    {                       
                       if(dnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield9.getText());  
                       
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
                    if(dbox9.isSelected())
                    {                       
                        if(dcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield9.getText());  
                       
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
                    if(dbox10.isSelected())
                    {                       
                       if(dnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield10.getText());  
                       
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
                    if(dbox10.isSelected())
                    {                       
                        if(dcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield10.getText());  
                       
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
                    if(dbox11.isSelected())
                    {                       
                       if(dnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield11.getText());  
                       
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
                    if(dbox11.isSelected())
                    {                       
                        if(dcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield11.getText());  
                       
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
                    if(dbox12.isSelected())
                    {                       
                       if(dnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield12.getText());  
                       
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
                    if(dbox12.isSelected())
                    {                       
                        if(dcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield12.getText());  
                       
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
                    if(dbox13.isSelected())
                    {                       
                       if(dnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield13.getText());  
                       
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
                    if(dbox13.isSelected())
                    {                       
                        if(dcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield13.getText());  
                       
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
                    dntotal.setText(result1);
                    dctotal.setText(result2);
                    jChipsNumber.setText(result1);
                    jChipsCost.setText(result2);
                    
                }
            });
              frame.add(total);
              frame.add(dntotal);
              frame.add(dctotal);
              
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
                    if(dbox1.isSelected())
                    {                       
                       if(dnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield1.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox1.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox1.isSelected())
                    {                       
                        if(dcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield1.getText());  
                       
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
                    if(dbox2.isSelected())
                    {                       
                       if(dnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield2.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox2.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox2.isSelected())
                    {                       
                        if(dcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield2.getText());  
                       
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
                    if(dbox3.isSelected())
                    {                       
                       if(dnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield3.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox3.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox3.isSelected())
                    {                       
                        if(dcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield3.getText());  
                       
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
                    if(dbox4.isSelected())
                    {                       
                       if(dnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield4.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox4.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox4.isSelected())
                    {                       
                        if(dcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield4.getText());  
                       
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
                    if(dbox5.isSelected())
                    {                       
                       if(dnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield5.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox5.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox5.isSelected())
                    {                       
                        if(dcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield5.getText());  
                       
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
                    if(dbox6.isSelected())
                    {                       
                       if(dnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield6.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox6.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox6.isSelected())
                    {                       
                        if(dcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield6.getText());  
                       
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
                    if(dbox7.isSelected())
                    {                       
                       if(dnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield7.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox7.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox7.isSelected())
                    {                       
                        if(dcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield7.getText());  
                       
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
                    if(dbox8.isSelected())
                    {                       
                       if(dnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield8.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox8.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox8.isSelected())
                    {                       
                        if(dcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield8.getText());  
                       
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
                    if(dbox9.isSelected())
                    {                       
                       if(dnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield9.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox9.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox9.isSelected())
                    {                       
                        if(dcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield9.getText());  
                       
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
                    if(dbox10.isSelected())
                    {                       
                       if(dnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield10.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox10.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox10.isSelected())
                    {                       
                        if(dcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield10.getText());  
                       
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
                    if(dbox11.isSelected())
                    {                       
                       if(dnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield11.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox11.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox11.isSelected())
                    {                       
                        if(dcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield11.getText());  
                       
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
                    if(dbox12.isSelected())
                    {                       
                       if(dnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield12.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox12.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox12.isSelected())
                    {                       
                        if(dcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield12.getText());  
                       
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
                    if(dbox13.isSelected())
                    {                       
                       if(dnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(dnfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(dcfield13.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+dbox13.getText()+"',"+num+","+cos+",'Chips')");
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
                    if(dbox13.isSelected())
                    {                       
                        if(dcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(dcfield13.getText());  
                       
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
                    CMS.jChipsNumber.setText(result1);
                    CMS.jChipsCost.setText(result2);
                    
                    
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
        frame.setTitle("Chips");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
