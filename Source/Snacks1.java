package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import static canteenmanagementsystem.CMS1.jNamakinCost;
import static canteenmanagementsystem.CMS1.jNamakinNumber;
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


public class Namakin1 {
    JCheckBox ebox1;
        JTextField enfield1;
        JTextField ecfield1;
        JCheckBox ebox2;
        JTextField enfield2;
        JTextField ecfield2;
        JCheckBox ebox3;
        JTextField enfield3;
        JTextField ecfield3;
        JCheckBox ebox4;
        JTextField enfield4;
        JTextField ecfield4;
        JCheckBox ebox5;
        JTextField enfield5;
        JTextField ecfield5;
        JCheckBox ebox6;
        JTextField enfield6;
        JTextField ecfield6;
        JCheckBox ebox7;
        JTextField enfield7;
        JTextField ecfield7;
        JCheckBox ebox8;
        JTextField enfield8;
        JTextField ecfield8;
        JCheckBox ebox9;
        JTextField enfield9;
        JTextField ecfield9;
        JCheckBox ebox10;
        JTextField enfield10;
        JTextField ecfield10;
        JCheckBox ebox11;
        JTextField enfield11;
        JTextField ecfield11;
        JCheckBox ebox12;
        JTextField enfield12;
        JTextField ecfield12;
        JCheckBox ebox13;
        JTextField enfield13;
        JTextField ecfield13;
        JTextField entotal;
        JTextField ectotal;
    public Namakin1()
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
        
        String query="SELECT pname FROM pdata WHERE ptype='Namakin' ORDER BY pname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                ebox1 = new JCheckBox(rs.getString("pname"));
                ebox1.setBounds(20, temp, 200, 30);
                enfield1 = new JTextField();
                enfield1.setBounds(230,temp,70,30);
                ecfield1 = new JTextField();
                ecfield1.setBounds(310, temp, 100, 30);
                enfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox1);
                frame.add(enfield1);
                frame.add(ecfield1);    
                ebox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox1.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield1.setText(null);
                        ecfield1.setText(null);
                        
                    }
                }
                });
                enfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield1.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield1.getText().equals(null))
                {
                    ecfield1.setText(null);
                }
                }
                });
                
                enfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(enfield1.getText().equals(null))
                {
                    ecfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                ebox2 = new JCheckBox(rs.getString("pname"));
                ebox2.setBounds(20, temp, 200, 30);
                enfield2 = new JTextField();
                enfield2.setBounds(230,temp,70,30);
                ecfield2 = new JTextField();
                ecfield2.setBounds(310, temp, 100, 30);
                enfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox2);
                frame.add(enfield2);
                frame.add(ecfield2);
                
                ebox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox2.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield2.setText(null);
                        ecfield2.setText(null);
                    }
                }
                });
                enfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield2.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield2.getText().equals(null))
                {
                    ecfield2.setText(null);
                }
                }
                });
                
                enfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield2.getText().equals(null))
                {
                    
                    ecfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox3 = new JCheckBox(rs.getString("pname"));
                ebox3.setBounds(20, temp, 200, 30);
                enfield3 = new JTextField();
                enfield3.setBounds(230,temp,70,30);
                ecfield3 = new JTextField();
                ecfield3.setBounds(310, temp, 100, 30);
                enfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox3);
                frame.add(enfield3);
                frame.add(ecfield3);
                
                ebox3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox3.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield3.setText(null);
                        ecfield3.setText(null);
                    }
                }
                });
                enfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield3.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield3.getText().equals(null))
                {
                    ecfield3.setText(null);
                }
                }
                });
                
                enfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield3.getText().equals(null))
                {
                    ecfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox4 = new JCheckBox(rs.getString("pname"));
                ebox4.setBounds(20, temp, 200, 30);
                enfield4 = new JTextField();
                enfield4.setBounds(230,temp,70,30);
                ecfield4 = new JTextField();
                ecfield4.setBounds(310, temp, 100, 30);
                enfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox4);
                frame.add(enfield4);
                frame.add(ecfield4);
                
                ebox4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox4.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield4.setText(null);
                        ecfield4.setText(null);
                    }
                }
                });
                enfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield4.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield4.getText().equals(null))
                {
                    ecfield4.setText(null);
                }
                }
                });
                
                enfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield4.getText().equals(null))
                {
                    ecfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox5= new JCheckBox(rs.getString("pname"));
                ebox5.setBounds(20, temp, 200, 30);
                enfield5 = new JTextField();
                enfield5.setBounds(230,temp,70,30);
                ecfield5 = new JTextField();
                ecfield5.setBounds(310, temp, 100, 30);
                enfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox5);
                frame.add(enfield5);
                frame.add(ecfield5);
                
                ebox5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox5.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield5.setText(null);
                        ecfield5.setText(null);
                    }
                }
                });
                enfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield5.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield5.getText().equals(null))
                {
                    ecfield5.setText(null);
                }
                }
                });
                
                enfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield5.getText().equals(null))
                {
                    ecfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox6= new JCheckBox(rs.getString("pname"));
                ebox6.setBounds(20, temp, 200, 30);
                enfield6 = new JTextField();
                enfield6.setBounds(230,temp,70,30);
                ecfield6 = new JTextField();
                ecfield6.setBounds(310, temp, 100, 30);
                enfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox6);
                frame.add(enfield6);
                frame.add(ecfield6);
                
                ebox6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox6.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield6.setText(null);
                        ecfield6.setText(null);
                    }
                }
                });
                enfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield6.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield6.getText().equals(null))
                {
                    ecfield6.setText(null);
                }
                }
                });
                
                enfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        ecfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield6.getText().equals(null))
                {
                    ecfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox7= new JCheckBox(rs.getString("pname"));
                ebox7.setBounds(20, temp, 200, 30);
                enfield7 = new JTextField();
                enfield7.setBounds(230,temp,70,30);
                ecfield7 = new JTextField();
                ecfield7.setBounds(310, temp, 100, 30);
                enfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox7);
                frame.add(enfield7);
                frame.add(ecfield7);
                
                ebox7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox7.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield7.setText(null);
                        ecfield7.setText(null);
                    }
                }
                });
                enfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield7.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield7.getText().equals(null))
                {
                    ecfield7.setText(null);
                }
                }
                });
                
                enfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield7.getText().equals(null))
                {
                    ecfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox8= new JCheckBox(rs.getString("pname"));
                ebox8.setBounds(20, temp, 200, 30);
                enfield8 = new JTextField();
                enfield8.setBounds(230,temp,70,30);
                ecfield8 = new JTextField();
                ecfield8.setBounds(310, temp, 100, 30);
                enfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox8);
                frame.add(enfield8);
                frame.add(ecfield8);
                
                ebox8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox8.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield8.setText(null);
                        ecfield8.setText(null);
                    }
                }
                });
                enfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield8.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield8.getText().equals(null))
                {
                    ecfield8.setText(null);
                }
                }
                });
                
                enfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield8.getText().equals(null))
                {
                    ecfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox9= new JCheckBox(rs.getString("pname"));
                ebox9.setBounds(20, temp, 200, 30);
                enfield9 = new JTextField();
                enfield9.setBounds(230,temp,70,30);
                ecfield9 = new JTextField();
                ecfield9.setBounds(310, temp, 100, 30);
                enfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox9);
                frame.add(enfield9);
                frame.add(ecfield9);
                
                ebox9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox9.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield9.setText(null);
                        ecfield9.setText(null);
                    }
                }
                });
                enfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield9.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield9.getText().equals(null))
                {
                    ecfield9.setText(null);
                }
                }
                });
                
                enfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield9.getText().equals(null))
                {
                    ecfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox10= new JCheckBox(rs.getString("pname"));
                ebox10.setBounds(20, temp, 200, 30);
                enfield10 = new JTextField();
                enfield10.setBounds(230,temp,70,30);
                ecfield10 = new JTextField();
                ecfield10.setBounds(310, temp, 100, 30);
                enfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox10);
                frame.add(enfield10);
                frame.add(ecfield10);
                
                ebox10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox10.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield10.setText(null);
                        ecfield10.setText(null);
                    }
                }
                });
                enfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield10.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield10.getText().equals(null))
                {
                    ecfield10.setText(null);
                }
                }
                });
                
                enfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield10.getText().equals(null))
                {
                    ecfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox11= new JCheckBox(rs.getString("pname"));
                ebox11.setBounds(20, temp, 200, 30);
                enfield11 = new JTextField();
                enfield11.setBounds(230,temp,70,30);
                ecfield11 = new JTextField();
                ecfield11.setBounds(310, temp, 100, 30);
                enfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox11);
                frame.add(enfield11);
                frame.add(ecfield11);
                
                ebox11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox11.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield11.setText(null);
                        ecfield11.setText(null);
                    }
                }
                });
                enfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield11.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield11.getText().equals(null))
                {
                    ecfield11.setText(null);
                }
                }
                });
                
                enfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield11.getText().equals(null))
                {
                    ecfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox12= new JCheckBox(rs.getString("pname"));
                ebox12.setBounds(20, temp, 200, 30);
                enfield12 = new JTextField();
                enfield12.setBounds(230,temp,70,30);
                ecfield12 = new JTextField();
                ecfield12.setBounds(310, temp, 100, 30);
                enfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox12);
                frame.add(enfield12);
                frame.add(ecfield12);
                
                ebox12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox12.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield12.setText(null);
                        ecfield12.setText(null);
                    }
                }
                });
                enfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield12.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield12.getText().equals(null))
                {
                    ecfield12.setText(null);
                }
                }
                });
                
                enfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield12.getText().equals(null))
                {
                    ecfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                ebox13= new JCheckBox(rs.getString("pname"));
                ebox13.setBounds(20, temp, 200, 30);
                enfield13 = new JTextField();
                enfield13.setBounds(230,temp,70,30);
                ecfield13 = new JTextField();
                ecfield13.setBounds(310, temp, 100, 30);
                enfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                enfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                enfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ecfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                ecfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                ecfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                ebox13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(ebox13);
                frame.add(enfield13);
                frame.add(ecfield13);
                
                ebox13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(ebox13.isSelected())
                    {
                        
                    }
                    else
                    {
                        enfield13.setText(null);
                        ecfield13.setText(null);
                    }
                }
                });
                enfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(ebox13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield13.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check ebox Item");
                   }
                     if(enfield13.getText().equals(null))
                {
                    ecfield13.setText(null);
                }
                }
                });
                
                enfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(ebox13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(enfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Namakin' ORDER BY pname ASC ");
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
                        ecfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(enfield13.getText().equals(null))
                {
                    ecfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              entotal = new JTextField();
              ectotal = new JTextField();
              entotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              entotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              entotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              ectotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              ectotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              ectotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              entotal.setBounds(230,temp,70,30);
              ectotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(ebox1.isSelected())
                    {                       
                       if(enfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield1.getText());  
                       
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
                    if(ebox1.isSelected())
                    {                       
                        if(ecfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield1.getText());  
                       
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
                    if(ebox2.isSelected())
                    {                       
                       if(enfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield2.getText());  
                       
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
                    if(ebox2.isSelected())
                    {                       
                        if(ecfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield2.getText());  
                       
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
                    if(ebox3.isSelected())
                    {                       
                       if(enfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield3.getText());  
                       
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
                    if(ebox3.isSelected())
                    {                       
                        if(ecfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield3.getText());  
                       
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
                    if(ebox4.isSelected())
                    {                       
                       if(enfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield4.getText());  
                       
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
                    if(ebox4.isSelected())
                    {                       
                        if(ecfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield4.getText());  
                       
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
                    if(ebox5.isSelected())
                    {                       
                       if(enfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield5.getText());  
                       
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
                    if(ebox5.isSelected())
                    {                       
                        if(ecfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield5.getText());  
                       
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
                    if(ebox6.isSelected())
                    {                       
                       if(enfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield6.getText());  
                       
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
                    if(ebox6.isSelected())
                    {                       
                        if(ecfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield6.getText());  
                       
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
                    if(ebox7.isSelected())
                    {                       
                       if(enfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield7.getText());  
                       
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
                    if(ebox7.isSelected())
                    {                       
                        if(ecfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield7.getText());  
                       
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
                    if(ebox8.isSelected())
                    {                       
                       if(enfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield8.getText());  
                       
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
                    if(ebox8.isSelected())
                    {                       
                        if(ecfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield8.getText());  
                       
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
                    if(ebox9.isSelected())
                    {                       
                       if(enfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield9.getText());  
                       
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
                    if(ebox9.isSelected())
                    {                       
                        if(ecfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield9.getText());  
                       
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
                    if(ebox10.isSelected())
                    {                       
                       if(enfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield10.getText());  
                       
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
                    if(ebox10.isSelected())
                    {                       
                        if(ecfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield10.getText());  
                       
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
                    if(ebox11.isSelected())
                    {                       
                       if(enfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield11.getText());  
                       
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
                    if(ebox11.isSelected())
                    {                       
                        if(ecfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield11.getText());  
                       
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
                    if(ebox12.isSelected())
                    {                       
                       if(enfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield12.getText());  
                       
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
                    if(ebox12.isSelected())
                    {                       
                        if(ecfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield12.getText());  
                       
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
                    if(ebox13.isSelected())
                    {                       
                       if(enfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield13.getText());  
                       
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
                    if(ebox13.isSelected())
                    {                       
                        if(ecfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield13.getText());  
                       
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
                    entotal.setText(result1);
                    ectotal.setText(result2);
                    jNamakinNumber.setText(result1);
                    jNamakinCost.setText(result2);
                    
                }
            });
              frame.add(total);
              frame.add(entotal);
              frame.add(ectotal);
              
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
                    if(ebox1.isSelected())
                    {                       
                       if(enfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield1.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox1.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox1.isSelected())
                    {                       
                        if(ecfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield1.getText());  
                       
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
                    if(ebox2.isSelected())
                    {                       
                       if(enfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield2.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox2.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox2.isSelected())
                    {                       
                        if(ecfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield2.getText());  
                       
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
                    if(ebox3.isSelected())
                    {                       
                       if(enfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield3.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox3.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox3.isSelected())
                    {                       
                        if(ecfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield3.getText());  
                       
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
                    if(ebox4.isSelected())
                    {                       
                       if(enfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield4.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox4.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox4.isSelected())
                    {                       
                        if(ecfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield4.getText());  
                       
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
                    if(ebox5.isSelected())
                    {                       
                       if(enfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield5.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox5.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox5.isSelected())
                    {                       
                        if(ecfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield5.getText());  
                       
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
                    if(ebox6.isSelected())
                    {                       
                       if(enfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield6.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox6.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox6.isSelected())
                    {                       
                        if(ecfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield6.getText());  
                       
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
                    if(ebox7.isSelected())
                    {                       
                       if(enfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield7.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox7.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox7.isSelected())
                    {                       
                        if(ecfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield7.getText());  
                       
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
                    if(ebox8.isSelected())
                    {                       
                       if(enfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield8.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox8.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox8.isSelected())
                    {                       
                        if(ecfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield8.getText());  
                       
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
                    if(ebox9.isSelected())
                    {                       
                       if(enfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield9.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox9.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox9.isSelected())
                    {                       
                        if(ecfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield9.getText());  
                       
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
                    if(ebox10.isSelected())
                    {                       
                       if(enfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield10.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox10.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox10.isSelected())
                    {                       
                        if(ecfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield10.getText());  
                       
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
                    if(ebox11.isSelected())
                    {                       
                       if(enfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield11.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox11.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox11.isSelected())
                    {                       
                        if(ecfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield11.getText());  
                       
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
                    if(ebox12.isSelected())
                    {                       
                       if(enfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield12.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox12.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox12.isSelected())
                    {                       
                        if(ecfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield12.getText());  
                       
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
                    if(ebox13.isSelected())
                    {                       
                       if(enfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(enfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(ecfield13.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+ebox13.getText()+"',"+num+","+cos+",'Namakin')");
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
                    if(ebox13.isSelected())
                    {                       
                        if(ecfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(ecfield13.getText());  
                       
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
                    CMS1.jNamakinNumber.setText(result1);
                    CMS1.jNamakinCost.setText(result2);
                    
                    
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
        frame.setTitle("Namakin");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
