package canteenmanagementsystem;
import static canteenmanagementsystem.InsertMarketProduct.DRIVER;
import static canteenmanagementsystem.InsertMarketProduct.JDBC_URL;
import static canteenmanagementsystem.InsertMarketProduct.con;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Other {
        JCheckBox fbox1;
        JTextField fnfield1;
        JTextField fcfield1;
        JCheckBox fbox2;
        JTextField fnfield2;
        JTextField fcfield2;
        JCheckBox fbox3;
        JTextField fnfield3;
        JTextField fcfield3;
        JCheckBox fbox4;
        JTextField fnfield4;
        JTextField fcfield4;
        JCheckBox fbox5;
        JTextField fnfield5;
        JTextField fcfield5;
        JCheckBox fbox6;
        JTextField fnfield6;
        JTextField fcfield6;
        JCheckBox fbox7;
        JTextField fnfield7;
        JTextField fcfield7;
        JCheckBox fbox8;
        JTextField fnfield8;
        JTextField fcfield8;
        JCheckBox fbox9;
        JTextField fnfield9;
        JTextField fcfield9;
        JCheckBox fbox10;
        JTextField fnfield10;
        JTextField fcfield10;
        JCheckBox fbox11;
        JTextField fnfield11;
        JTextField fcfield11;
        JCheckBox fbox12;
        JTextField fnfield12;
        JTextField fcfield12;
        JCheckBox fbox13;
        JTextField fnfield13;
        JTextField fcfield13;
        JTextField fntotal;
        JTextField fctotal;
        
        public Other()
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
        
        String query="SELECT pname FROM pdata WHERE ptype='Other' ORDER BY pname ASC";
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs=st.executeQuery(query);
            
              if(rs.next())
              {
              fsizev+=40;
              temp+=40;
                fbox1 = new JCheckBox(rs.getString("pname"));
                fbox1.setBounds(20, temp, 200, 30);
                fnfield1 = new JTextField();
                fnfield1.setBounds(230,temp,70,30);
                fcfield1 = new JTextField();
                fcfield1.setBounds(310, temp, 100, 30);
                fnfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox1.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox1);
                frame.add(fnfield1);
                frame.add(fcfield1);    
                fbox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox1.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield1.setText(null);
                        fcfield1.setText(null);
                        
                    }
                }
                });
                fnfield1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox1.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC");
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield1.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield1.getText().equals(null))
                {
                    fcfield1.setText(null);
                }
                }
                });
                
                fnfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox1.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield1.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield1.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
                if(fnfield1.getText().equals(null))
                {
                    fcfield1.setText(null);
                }
            }
        });
                
                
              }
              if(rs.next())
              {
               fsizev+=40;
               temp+=40;
                fbox2 = new JCheckBox(rs.getString("pname"));
                fbox2.setBounds(20, temp, 200, 30);
                fnfield2 = new JTextField();
                fnfield2.setBounds(230,temp,70,30);
                fcfield2 = new JTextField();
                fcfield2.setBounds(310, temp, 100, 30);
                fnfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox2.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox2);
                frame.add(fnfield2);
                frame.add(fcfield2);
                
                fbox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox2.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield2.setText(null);
                        fcfield2.setText(null);
                    }
                }
                });
                fnfield2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox2.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield2.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield2.getText().equals(null))
                {
                    fcfield2.setText(null);
                }
                }
                });
                
                fnfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox2.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
                
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield2.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield2.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield2.getText().equals(null))
                {
                    
                    fcfield2.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox3 = new JCheckBox(rs.getString("pname"));
                fbox3.setBounds(20, temp, 200, 30);
                fnfield3 = new JTextField();
                fnfield3.setBounds(230,temp,70,30);
                fcfield3 = new JTextField();
                fcfield3.setBounds(310, temp, 100, 30);
                fnfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox3.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox3);
                frame.add(fnfield3);
                frame.add(fcfield3);
                
                fbox3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox3.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield3.setText(null);
                        fcfield3.setText(null);
                    }
                }
                });
                fnfield3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox3.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield3.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield3.getText().equals(null))
                {
                    fcfield3.setText(null);
                }
                }
                });
                
                fnfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox3.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield3.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield3.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield3.getText().equals(null))
                {
                    fcfield3.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox4 = new JCheckBox(rs.getString("pname"));
                fbox4.setBounds(20, temp, 200, 30);
                fnfield4 = new JTextField();
                fnfield4.setBounds(230,temp,70,30);
                fcfield4 = new JTextField();
                fcfield4.setBounds(310, temp, 100, 30);
                fnfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox4.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox4);
                frame.add(fnfield4);
                frame.add(fcfield4);
                
                fbox4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox4.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield4.setText(null);
                        fcfield4.setText(null);
                    }
                }
                });
                fnfield4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox4.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield4.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield4.getText().equals(null))
                {
                    fcfield4.setText(null);
                }
                }
                });
                
                fnfield4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox4.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield4.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield4.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield4.getText().equals(null))
                {
                    fcfield4.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox5= new JCheckBox(rs.getString("pname"));
                fbox5.setBounds(20, temp, 200, 30);
                fnfield5 = new JTextField();
                fnfield5.setBounds(230,temp,70,30);
                fcfield5 = new JTextField();
                fcfield5.setBounds(310, temp, 100, 30);
                fnfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox5.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox5);
                frame.add(fnfield5);
                frame.add(fcfield5);
                
                fbox5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox5.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield5.setText(null);
                        fcfield5.setText(null);
                    }
                }
                });
                fnfield5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox5.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield5.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield5.getText().equals(null))
                {
                    fcfield5.setText(null);
                }
                }
                });
                
                fnfield5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox5.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield5.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield5.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield5.getText().equals(null))
                {
                    fcfield5.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox6= new JCheckBox(rs.getString("pname"));
                fbox6.setBounds(20, temp, 200, 30);
                fnfield6 = new JTextField();
                fnfield6.setBounds(230,temp,70,30);
                fcfield6 = new JTextField();
                fcfield6.setBounds(310, temp, 100, 30);
                fnfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox6.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox6);
                frame.add(fnfield6);
                frame.add(fcfield6);
                
                fbox6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox6.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield6.setText(null);
                        fcfield6.setText(null);
                    }
                }
                });
                fnfield6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox6.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield6.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield6.getText().equals(null))
                {
                    fcfield6.setText(null);
                }
                }
                });
                
                fnfield6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox6.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield6.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
                        rs1.next();
                        rs1.next();
                        rs1.next();                        
                        rs1.next();
                        rs1.next();
                        rs1.next();
                        double cost =rs1.getDouble("pcost");
                        double all = temp*cost;
                        
                        String result = String.format("%.0f",all);
                        fcfield6.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield6.getText().equals(null))
                {
                    fcfield6.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox7= new JCheckBox(rs.getString("pname"));
                fbox7.setBounds(20, temp, 200, 30);
                fnfield7 = new JTextField();
                fnfield7.setBounds(230,temp,70,30);
                fcfield7 = new JTextField();
                fcfield7.setBounds(310, temp, 100, 30);
                fnfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox7.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox7);
                frame.add(fnfield7);
                frame.add(fcfield7);
                
                fbox7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox7.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield7.setText(null);
                        fcfield7.setText(null);
                    }
                }
                });
                fnfield7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox7.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield7.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield7.getText().equals(null))
                {
                    fcfield7.setText(null);
                }
                }
                });
                
                fnfield7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox7.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield7.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield7.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield7.getText().equals(null))
                {
                    fcfield7.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox8= new JCheckBox(rs.getString("pname"));
                fbox8.setBounds(20, temp, 200, 30);
                fnfield8 = new JTextField();
                fnfield8.setBounds(230,temp,70,30);
                fcfield8 = new JTextField();
                fcfield8.setBounds(310, temp, 100, 30);
                fnfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox8.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox8);
                frame.add(fnfield8);
                frame.add(fcfield8);
                
                fbox8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox8.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield8.setText(null);
                        fcfield8.setText(null);
                    }
                }
                });
                fnfield8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox8.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield8.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield8.getText().equals(null))
                {
                    fcfield8.setText(null);
                }
                }
                });
                
                fnfield8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox8.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield8.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield8.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield8.getText().equals(null))
                {
                    fcfield8.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox9= new JCheckBox(rs.getString("pname"));
                fbox9.setBounds(20, temp, 200, 30);
                fnfield9 = new JTextField();
                fnfield9.setBounds(230,temp,70,30);
                fcfield9 = new JTextField();
                fcfield9.setBounds(310, temp, 100, 30);
                fnfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox9.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox9);
                frame.add(fnfield9);
                frame.add(fcfield9);
                
                fbox9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox9.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield9.setText(null);
                        fcfield9.setText(null);
                    }
                }
                });
                fnfield9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox9.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield9.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield9.getText().equals(null))
                {
                    fcfield9.setText(null);
                }
                }
                });
                
                fnfield9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox9.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield9.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield9.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield9.getText().equals(null))
                {
                    fcfield9.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox10= new JCheckBox(rs.getString("pname"));
                fbox10.setBounds(20, temp, 200, 30);
                fnfield10 = new JTextField();
                fnfield10.setBounds(230,temp,70,30);
                fcfield10 = new JTextField();
                fcfield10.setBounds(310, temp, 100, 30);
                fnfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox10.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox10);
                frame.add(fnfield10);
                frame.add(fcfield10);
                
                fbox10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox10.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield10.setText(null);
                        fcfield10.setText(null);
                    }
                }
                });
                fnfield10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox10.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield10.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield10.getText().equals(null))
                {
                    fcfield10.setText(null);
                }
                }
                });
                
                fnfield10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox10.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield10.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield10.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield10.getText().equals(null))
                {
                    fcfield10.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox11= new JCheckBox(rs.getString("pname"));
                fbox11.setBounds(20, temp, 200, 30);
                fnfield11 = new JTextField();
                fnfield11.setBounds(230,temp,70,30);
                fcfield11 = new JTextField();
                fcfield11.setBounds(310, temp, 100, 30);
                fnfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox11.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox11);
                frame.add(fnfield11);
                frame.add(fcfield11);
                
                fbox11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox11.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield11.setText(null);
                        fcfield11.setText(null);
                    }
                }
                });
                fnfield11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox11.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield11.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield11.getText().equals(null))
                {
                    fcfield11.setText(null);
                }
                }
                });
                
                fnfield11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox11.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield11.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield11.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield11.getText().equals(null))
                {
                    fcfield11.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox12= new JCheckBox(rs.getString("pname"));
                fbox12.setBounds(20, temp, 200, 30);
                fnfield12 = new JTextField();
                fnfield12.setBounds(230,temp,70,30);
                fcfield12 = new JTextField();
                fcfield12.setBounds(310, temp, 100, 30);
                fnfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox12.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox12);
                frame.add(fnfield12);
                frame.add(fcfield12);
                
                fbox12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox12.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield12.setText(null);
                        fcfield12.setText(null);
                    }
                }
                });
                fnfield12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox12.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield12.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield12.getText().equals(null))
                {
                    fcfield12.setText(null);
                }
                }
                });
                
                fnfield12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox12.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield12.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield12.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield12.getText().equals(null))
                {
                    fcfield12.setText(null);
                }
            }
        });
                
              }
              if(rs.next())
              {
                
                fsizev+=40;
                temp+=40;
                fbox13= new JCheckBox(rs.getString("pname"));
                fbox13.setBounds(20, temp, 200, 30);
                fnfield13 = new JTextField();
                fnfield13.setBounds(230,temp,70,30);
                fcfield13 = new JTextField();
                fcfield13.setBounds(310, temp, 100, 30);
                fnfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fnfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fnfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fcfield13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                fcfield13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                fcfield13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                fbox13.setFont(new java.awt.Font("Times New Roman", 0, 20));
                frame.add(fbox13);
                frame.add(fnfield13);
                frame.add(fcfield13);
                
                fbox13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(fbox13.isSelected())
                    {
                        
                    }
                    else
                    {
                        fnfield13.setText(null);
                        fcfield13.setText(null);
                    }
                }
                });
                fnfield13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(fbox13.isSelected())
                   {
                       try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield13.setText(result); 
                        
                        
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
                       JOptionPane.showMessageDialog(null,"Select Check fbox Item");
                   }
                     if(fnfield13.getText().equals(null))
                {
                    fcfield13.setText(null);
                }
                }
                });
                
                fnfield13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(fbox13.isSelected())
                   {
                try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                } 
                Statement st1;
                ResultSet rs1;
                    int temp = Integer.parseInt(fnfield13.getText());
                    
                    try {
                        st1 = con.createStatement();
                        rs1=st1.executeQuery("select pcost from pdata where ptype='Other' ORDER BY pname ASC ");
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
                        fcfield13.setText(result);                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    
                        
                    try {      
                        con.close();
                    } catch (SQLException ex) {
                        
                    }
                   }
				   if(fnfield13.getText().equals(null))
                {
                    fcfield13.setText(null);
                }
            }
        });
                
              }
              fsizev+=40;
              temp+=40;
              JButton total = new JButton("Total");
              fntotal = new JTextField();
              fctotal = new JTextField();
              fntotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              fntotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              fntotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              fctotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
              fctotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
              fctotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
              total.setFont(new java.awt.Font("Times New Roman", 0, 20));
              total.setBounds(45,temp,100,30);
              fntotal.setBounds(230,temp,70,30);
              fctotal.setBounds(310,temp,100,30);
              total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int tnum=0;
                    double tcos=0;
                    try{
                    if(fbox1.isSelected())
                    {                       
                       if(fnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield1.getText());  
                       
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
                    if(fbox1.isSelected())
                    {                       
                        if(fcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield1.getText());  
                       
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
                    if(fbox2.isSelected())
                    {                       
                       if(fnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield2.getText());  
                       
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
                    if(fbox2.isSelected())
                    {                       
                        if(fcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield2.getText());  
                       
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
                    if(fbox3.isSelected())
                    {                       
                       if(fnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield3.getText());  
                       
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
                    if(fbox3.isSelected())
                    {                       
                        if(fcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield3.getText());  
                       
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
                    if(fbox4.isSelected())
                    {                       
                       if(fnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield4.getText());  
                       
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
                    if(fbox4.isSelected())
                    {                       
                        if(fcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield4.getText());  
                       
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
                    if(fbox5.isSelected())
                    {                       
                       if(fnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield5.getText());  
                       
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
                    if(fbox5.isSelected())
                    {                       
                        if(fcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield5.getText());  
                       
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
                    if(fbox6.isSelected())
                    {                       
                       if(fnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield6.getText());  
                       
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
                    if(fbox6.isSelected())
                    {                       
                        if(fcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield6.getText());  
                       
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
                    if(fbox7.isSelected())
                    {                       
                       if(fnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield7.getText());  
                       
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
                    if(fbox7.isSelected())
                    {                       
                        if(fcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield7.getText());  
                       
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
                    if(fbox8.isSelected())
                    {                       
                       if(fnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield8.getText());  
                       
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
                    if(fbox8.isSelected())
                    {                       
                        if(fcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield8.getText());  
                       
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
                    if(fbox9.isSelected())
                    {                       
                       if(fnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield9.getText());  
                       
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
                    if(fbox9.isSelected())
                    {                       
                        if(fcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield9.getText());  
                       
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
                    if(fbox10.isSelected())
                    {                       
                       if(fnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield10.getText());  
                       
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
                    if(fbox10.isSelected())
                    {                       
                        if(fcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield10.getText());  
                       
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
                    if(fbox11.isSelected())
                    {                       
                       if(fnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield11.getText());  
                       
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
                    if(fbox11.isSelected())
                    {                       
                        if(fcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield11.getText());  
                       
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
                    if(fbox12.isSelected())
                    {                       
                       if(fnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield12.getText());  
                       
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
                    if(fbox12.isSelected())
                    {                       
                        if(fcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield12.getText());  
                       
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
                    if(fbox13.isSelected())
                    {                       
                       if(fnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield13.getText());  
                       
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
                    if(fbox13.isSelected())
                    {                       
                        if(fcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield13.getText());  
                       
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
                    fntotal.setText(result1);
                    fctotal.setText(result2);
                    
                    CMS.jOtherNumber.setText(result1);
                    CMS.jOtherCost.setText(result2);
                    
                    
                }
            });
              frame.add(total);
              frame.add(fntotal);
              frame.add(fctotal);
              
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
                    if(fbox1.isSelected())
                    {                       
                       if(fnfield1.getText().equals(null))
                       {
                           
                            int num=0;
                            tnum=tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield1.getText());                       
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield1.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox1.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox1.isSelected())
                    {                       
                        if(fcfield1.equals(null))
                        {
                            double num = 0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield1.getText());  
                       
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
                    if(fbox2.isSelected())
                    {                       
                       if(fnfield2.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield2.getText());         
                           tnum = tnum+num;
                           try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield2.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox2.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox2.isSelected())
                    {                       
                        if(fcfield2.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield2.getText());  
                       
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
                    if(fbox3.isSelected())
                    {                       
                       if(fnfield3.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield3.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield3.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox3.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox3.isSelected())
                    {                       
                        if(fcfield3.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield3.getText());  
                       
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
                    if(fbox4.isSelected())
                    {                       
                       if(fnfield4.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield4.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield4.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox4.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox4.isSelected())
                    {                       
                        if(fcfield4.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield4.getText());  
                       
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
                    if(fbox5.isSelected())
                    {                       
                       if(fnfield5.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield5.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield5.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox5.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox5.isSelected())
                    {                       
                        if(fcfield5.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield5.getText());  
                       
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
                    if(fbox6.isSelected())
                    {                       
                       if(fnfield6.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield6.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield6.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox6.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox6.isSelected())
                    {                       
                        if(fcfield6.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield6.getText());  
                       
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
                    if(fbox7.isSelected())
                    {                       
                       if(fnfield7.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield7.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield7.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox7.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox7.isSelected())
                    {                       
                        if(fcfield7.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield7.getText());  
                       
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
                    if(fbox8.isSelected())
                    {                       
                       if(fnfield8.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield8.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield8.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox8.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox8.isSelected())
                    {                       
                        if(fcfield8.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield8.getText());  
                       
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
                    if(fbox9.isSelected())
                    {                       
                       if(fnfield9.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield9.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield9.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox9.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox9.isSelected())
                    {                       
                        if(fcfield9.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield9.getText());  
                       
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
                    if(fbox10.isSelected())
                    {                       
                       if(fnfield10.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield10.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield10.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox10.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox10.isSelected())
                    {                       
                        if(fcfield10.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield10.getText());  
                       
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
                    if(fbox11.isSelected())
                    {                       
                       if(fnfield11.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield11.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield11.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox11.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox11.isSelected())
                    {                       
                        if(fcfield11.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield11.getText());  
                       
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
                    if(fbox12.isSelected())
                    {                       
                       if(fnfield12.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield12.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield12.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox12.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox12.isSelected())
                    {                       
                        if(fcfield12.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield12.getText());  
                       
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
                    if(fbox13.isSelected())
                    {                       
                       if(fnfield13.getText().equals(null))
                       {
                         int num = 0;  
                         tnum = tnum+num;
                       }
                       else
                       {
                           int num = Integer.parseInt(fnfield13.getText());  
                       
                       tnum = tnum+num;
                       try
                           {
                               st1=con.createStatement();
                               double cos = Double.parseDouble(fcfield13.getText());
                               st1.executeUpdate("INSERT INTO tempData VALUES('"+fbox13.getText()+"',"+num+","+cos+",'Other')");
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
                    if(fbox13.isSelected())
                    {                       
                        if(fcfield13.equals(null))
                        {
                            double num=0;
                            tcos = tcos+num;
                        }
                        else
                        {
                            double num = Integer.parseInt(fcfield13.getText());  
                       
                            tcos = tcos+num;
                        }
                    }
                    }
                    catch(Exception eq)
                    {
                     double num=0;
                     tcos=tcos+num;
                    }
                    result1 = Integer.toString(tnum);
                    result2 = Double.toString(tcos);
                    CMS.jOtherNumber.setText(result1);
                    CMS.jOtherCost.setText(result2);
                    
                    
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
        frame.setTitle("Other");
        frame.setSize(fsizeh,fsizev);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        

        }
        String result1;
        String result2;
        
}
