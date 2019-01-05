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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ColdDrinks1 {
     JCheckBox box1;
        JTextField nfield1;
        JTextField cfield1;
        JCheckBox box2;
        JTextField nfield2;
        JTextField cfield2;
        JCheckBox box3;
        JTextField nfield3;
        JTextField cfield3;
        JCheckBox box4;
        JTextField nfield4;
        JTextField cfield4;
        JCheckBox box5;
        JTextField nfield5;
        JTextField cfield5;
        JCheckBox box6;
        JTextField nfield6;
        JTextField cfield6;
        JCheckBox box7;
        JTextField nfield7;
        JTextField cfield7;
        JCheckBox box8;
        JTextField nfield8;
        JTextField cfield8;
        JCheckBox box9;
        JTextField nfield9;
        JTextField cfield9;
        JCheckBox box10;
        JTextField nfield10;
        JTextField cfield10;
        JCheckBox box11;
        JTextField nfield11;
        JTextField cfield11;
        JCheckBox box12;
        JTextField nfield12;
        JTextField cfield12;
        JCheckBox box13;
        JTextField nfield13;
        JTextField cfield13;
        JTextField ntotal;
        JTextField ctotal;
        
        public ColdDrinks1()
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
        
        
        String query="SELECT pname FROM pdata WHERE ptype='Cold drinks' ORDER BY pname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                box1 = new JCheckBox(rs.getString("pname"));
                box1.setBounds(20, temp, 200, 30);
                nfield1 = new JTextField();
                nfield1.setBounds(230,temp,70,30);
                cfield1 = new JTextField();
                cfield1.setBounds(310, temp, 100, 30);
                nfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box1);
                frame.add(nfield1);
                frame.add(cfield1);    
                box1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box1.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield1.setText(null);
                        cfield1.setText(null);
                        
                    }
                }
                });
                nfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield1.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield1.getText().equals(null))
                {
                    cfield1.setText(null);
                }
                }
                });
                
                nfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(nfield1.getText().equals(null))
                {
                    cfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                box2 = new JCheckBox(rs.getString("pname"));
                box2.setBounds(20, temp, 200, 30);
                nfield2 = new JTextField();
                nfield2.setBounds(230,temp,70,30);
                cfield2 = new JTextField();
                cfield2.setBounds(310, temp, 100, 30);
                nfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box2);
                frame.add(nfield2);
                frame.add(cfield2);
                
                box2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box2.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield2.setText(null);
                        cfield2.setText(null);
                    }
                }
                });
                nfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield2.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield2.getText().equals(null))
                {
                    cfield2.setText(null);
                }
                }
                });
                
                nfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield2.getText().equals(null))
                {
                    
                    cfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box3 = new JCheckBox(rs.getString("pname"));
                box3.setBounds(20, temp, 200, 30);
                nfield3 = new JTextField();
                nfield3.setBounds(230,temp,70,30);
                cfield3 = new JTextField();
                cfield3.setBounds(310, temp, 100, 30);
                nfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box3);
                frame.add(nfield3);
                frame.add(cfield3);
                
                box3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box3.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield3.setText(null);
                        cfield3.setText(null);
                    }
                }
                });
                nfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield3.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield3.getText().equals(null))
                {
                    cfield3.setText(null);
                }
                }
                });
                
                nfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield3.getText().equals(null))
                {
                    cfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box4 = new JCheckBox(rs.getString("pname"));
                box4.setBounds(20, temp, 200, 30);
                nfield4 = new JTextField();
                nfield4.setBounds(230,temp,70,30);
                cfield4 = new JTextField();
                cfield4.setBounds(310, temp, 100, 30);
                nfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box4);
                frame.add(nfield4);
                frame.add(cfield4);
                
                box4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box4.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield4.setText(null);
                        cfield4.setText(null);
                    }
                }
                });
                nfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield4.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield4.getText().equals(null))
                {
                    cfield4.setText(null);
                }
                }
                });
                
                nfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield4.getText().equals(null))
                {
                    cfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box5= new JCheckBox(rs.getString("pname"));
                box5.setBounds(20, temp, 200, 30);
                nfield5 = new JTextField();
                nfield5.setBounds(230,temp,70,30);
                cfield5 = new JTextField();
                cfield5.setBounds(310, temp, 100, 30);
                nfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box5);
                frame.add(nfield5);
                frame.add(cfield5);
                
                box5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box5.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield5.setText(null);
                        cfield5.setText(null);
                    }
                }
                });
                nfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield5.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield5.getText().equals(null))
                {
                    cfield5.setText(null);
                }
                }
                });
                
                nfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield5.getText().equals(null))
                {
                    cfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box6= new JCheckBox(rs.getString("pname"));
                box6.setBounds(20, temp, 200, 30);
                nfield6 = new JTextField();
                nfield6.setBounds(230,temp,70,30);
                cfield6 = new JTextField();
                cfield6.setBounds(310, temp, 100, 30);
                nfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box6);
                frame.add(nfield6);
                frame.add(cfield6);
                
                box6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box6.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield6.setText(null);
                        cfield6.setText(null);
                    }
                }
                });
                nfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield6.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield6.getText().equals(null))
                {
                    cfield6.setText(null);
                }
                }
                });
                
                nfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        cfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield6.getText().equals(null))
                {
                    cfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box7= new JCheckBox(rs.getString("pname"));
                box7.setBounds(20, temp, 200, 30);
                nfield7 = new JTextField();
                nfield7.setBounds(230,temp,70,30);
                cfield7 = new JTextField();
                cfield7.setBounds(310, temp, 100, 30);
                nfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box7);
                frame.add(nfield7);
                frame.add(cfield7);
                
                box7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box7.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield7.setText(null);
                        cfield7.setText(null);
                    }
                }
                });
                nfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield7.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield7.getText().equals(null))
                {
                    cfield7.setText(null);
                }
                }
                });
                
                nfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield7.getText().equals(null))
                {
                    cfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box8= new JCheckBox(rs.getString("pname"));
                box8.setBounds(20, temp, 200, 30);
                nfield8 = new JTextField();
                nfield8.setBounds(230,temp,70,30);
                cfield8 = new JTextField();
                cfield8.setBounds(310, temp, 100, 30);
                nfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box8);
                frame.add(nfield8);
                frame.add(cfield8);
                
                box8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box8.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield8.setText(null);
                        cfield8.setText(null);
                    }
                }
                });
                nfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield8.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield8.getText().equals(null))
                {
                    cfield8.setText(null);
                }
                }
                });
                
                nfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield8.getText().equals(null))
                {
                    cfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box9= new JCheckBox(rs.getString("pname"));
                box9.setBounds(20, temp, 200, 30);
                nfield9 = new JTextField();
                nfield9.setBounds(230,temp,70,30);
                cfield9 = new JTextField();
                cfield9.setBounds(310, temp, 100, 30);
                nfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box9);
                frame.add(nfield9);
                frame.add(cfield9);
                
                box9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box9.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield9.setText(null);
                        cfield9.setText(null);
                    }
                }
                });
                nfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield9.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield9.getText().equals(null))
                {
                    cfield9.setText(null);
                }
                }
                });
                
                nfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield9.getText().equals(null))
                {
                    cfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box10= new JCheckBox(rs.getString("pname"));
                box10.setBounds(20, temp, 200, 30);
                nfield10 = new JTextField();
                nfield10.setBounds(230,temp,70,30);
                cfield10 = new JTextField();
                cfield10.setBounds(310, temp, 100, 30);
                nfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box10);
                frame.add(nfield10);
                frame.add(cfield10);
                
                box10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box10.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield10.setText(null);
                        cfield10.setText(null);
                    }
                }
                });
                nfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield10.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield10.getText().equals(null))
                {
                    cfield10.setText(null);
                }
                }
                });
                
                nfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield10.getText().equals(null))
                {
                    cfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box11= new JCheckBox(rs.getString("pname"));
                box11.setBounds(20, temp, 200, 30);
                nfield11 = new JTextField();
                nfield11.setBounds(230,temp,70,30);
                cfield11 = new JTextField();
                cfield11.setBounds(310, temp, 100, 30);
                nfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box11);
                frame.add(nfield11);
                frame.add(cfield11);
                
                box11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box11.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield11.setText(null);
                        cfield11.setText(null);
                    }
                }
                });
                nfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield11.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield11.getText().equals(null))
                {
                    cfield11.setText(null);
                }
                }
                });
                
                nfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield11.getText().equals(null))
                {
                    cfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box12= new JCheckBox(rs.getString("pname"));
                box12.setBounds(20, temp, 200, 30);
                nfield12 = new JTextField();
                nfield12.setBounds(230,temp,70,30);
                cfield12 = new JTextField();
                cfield12.setBounds(310, temp, 100, 30);
                nfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box12);
                frame.add(nfield12);
                frame.add(cfield12);
                
                box12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box12.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield12.setText(null);
                        cfield12.setText(null);
                    }
                }
                });
                nfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield12.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield12.getText().equals(null))
                {
                    cfield12.setText(null);
                }
                }
                });
                
                nfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield12.getText().equals(null))
                {
                    cfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                box13= new JCheckBox(rs.getString("pname"));
                box13.setBounds(20, temp, 200, 30);
                nfield13 = new JTextField();
                nfield13.setBounds(230,temp,70,30);
                cfield13 = new JTextField();
                cfield13.setBounds(310, temp, 100, 30);
                nfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                nfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                nfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                cfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                cfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                cfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                box13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(box13);
                frame.add(nfield13);
                frame.add(cfield13);
                
                box13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(box13.isSelected())
                    {
                        
                    }
                    else
                    {
                        nfield13.setText(null);
                        cfield13.setText(null);
                    }
                }
                });
                nfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(box13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield13.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check Box Item");
                   }
                     if(nfield13.getText().equals(null))
                {
                    cfield13.setText(null);
                }
                }
                });
                
                nfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(box13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(nfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Cold drinks' ORDER BY pname ASC ");
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
                        cfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(nfield13.getText().equals(null))
                {
                    cfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              ntotal = new JTextField();
              ctotal = new JTextField();
              ntotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              ntotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              ntotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              ctotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              ctotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              ctotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              ntotal.setBounds(230,temp,70,30);
              ctotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(box1.isSelected())
                    {                       
                       if(nfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield1.getText());  
                       
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
                    if(box1.isSelected())
                    {                       
                        if(cfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield1.getText());  
                       
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
                    if(box2.isSelected())
                    {                       
                       if(nfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield2.getText());  
                       
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
                    if(box2.isSelected())
                    {                       
                        if(cfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield2.getText());  
                       
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
                    if(box3.isSelected())
                    {                       
                       if(nfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield3.getText());  
                       
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
                    if(box3.isSelected())
                    {                       
                        if(cfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield3.getText());  
                       
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
                    if(box4.isSelected())
                    {                       
                       if(nfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield4.getText());  
                       
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
                    if(box4.isSelected())
                    {                       
                        if(cfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield4.getText());  
                       
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
                    if(box5.isSelected())
                    {                       
                       if(nfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield5.getText());  
                       
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
                    if(box5.isSelected())
                    {                       
                        if(cfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield5.getText());  
                       
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
                    if(box6.isSelected())
                    {                       
                       if(nfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield6.getText());  
                       
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
                    if(box6.isSelected())
                    {                       
                        if(cfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield6.getText());  
                       
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
                    if(box7.isSelected())
                    {                       
                       if(nfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield7.getText());  
                       
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
                    if(box7.isSelected())
                    {                       
                        if(cfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield7.getText());  
                       
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
                    if(box8.isSelected())
                    {                       
                       if(nfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield8.getText());  
                       
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
                    if(box8.isSelected())
                    {                       
                        if(cfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield8.getText());  
                       
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
                    if(box9.isSelected())
                    {                       
                       if(nfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield9.getText());  
                       
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
                    if(box9.isSelected())
                    {                       
                        if(cfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield9.getText());  
                       
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
                    if(box10.isSelected())
                    {                       
                       if(nfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield10.getText());  
                       
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
                    if(box10.isSelected())
                    {                       
                        if(cfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield10.getText());  
                       
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
                    if(box11.isSelected())
                    {                       
                       if(nfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield11.getText());  
                       
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
                    if(box11.isSelected())
                    {                       
                        if(cfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield11.getText());  
                       
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
                    if(box12.isSelected())
                    {                       
                       if(nfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield12.getText());  
                       
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
                    if(box12.isSelected())
                    {                       
                        if(cfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield12.getText());  
                       
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
                    if(box13.isSelected())
                    {                       
                       if(nfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield13.getText());  
                       
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
                    if(box13.isSelected())
                    {                       
                        if(cfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield13.getText());  
                       
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
                    ntotal.setText(result1);
                    ctotal.setText(result2);
                    CMS.jColdDrinksNumber.setText(result1);
                    CMS.jColdDrinksCost.setText(result2);
                    
                }
            });
              frame.add(total);
              frame.add(ntotal);
              frame.add(ctotal);
              
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
                    if(box1.isSelected())
                    {                       
                       if(nfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield1.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box1.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box1.isSelected())
                    {                       
                        if(cfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield1.getText());  
                       
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
                    if(box2.isSelected())
                    {                       
                       if(nfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield2.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box2.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box2.isSelected())
                    {                       
                        if(cfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield2.getText());  
                       
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
                    if(box3.isSelected())
                    {                       
                       if(nfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield3.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box3.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box3.isSelected())
                    {                       
                        if(cfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield3.getText());  
                       
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
                    if(box4.isSelected())
                    {                       
                       if(nfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield4.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box4.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box4.isSelected())
                    {                       
                        if(cfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield4.getText());  
                       
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
                    if(box5.isSelected())
                    {                       
                       if(nfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield5.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box5.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box5.isSelected())
                    {                       
                        if(cfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield5.getText());  
                       
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
                    if(box6.isSelected())
                    {                       
                       if(nfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield6.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box6.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box6.isSelected())
                    {                       
                        if(cfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield6.getText());  
                       
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
                    if(box7.isSelected())
                    {                       
                       if(nfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield7.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box7.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box7.isSelected())
                    {                       
                        if(cfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield7.getText());  
                       
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
                    if(box8.isSelected())
                    {                       
                       if(nfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield8.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box8.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box8.isSelected())
                    {                       
                        if(cfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield8.getText());  
                       
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
                    if(box9.isSelected())
                    {                       
                       if(nfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield9.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box9.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box9.isSelected())
                    {                       
                        if(cfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield9.getText());  
                       
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
                    if(box10.isSelected())
                    {                       
                       if(nfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield10.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box10.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box10.isSelected())
                    {                       
                        if(cfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield10.getText());  
                       
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
                    if(box11.isSelected())
                    {                       
                       if(nfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield11.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box11.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box11.isSelected())
                    {                       
                        if(cfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield11.getText());  
                       
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
                    if(box12.isSelected())
                    {                       
                       if(nfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield12.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box12.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box12.isSelected())
                    {                       
                        if(cfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield12.getText());  
                       
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
                    if(box13.isSelected())
                    {                       
                       if(nfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(nfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(cfield13.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+box13.getText()+"',"+num+","+cos+",'Cold drinks')");
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
                    if(box13.isSelected())
                    {                       
                        if(cfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(cfield13.getText());  
                       
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
                    CMS1.jColdDrinksNumber.setText(result1);
                    CMS1.jColdDrinksCost.setText(result2);
                    
                    
                    
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
        frame.setTitle("Cold Drinks");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        

        }
}
