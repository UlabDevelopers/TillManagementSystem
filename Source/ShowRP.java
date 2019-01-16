package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import static canteenmanagementsystem.CMS.jAcHolderCustomer;
import static canteenmanagementsystem.CMS.jBiscuitsCost;
import static canteenmanagementsystem.CMS.jBiscuitsNumber;
import static canteenmanagementsystem.CMS.jChipsCost;
import static canteenmanagementsystem.CMS.jChipsNumber;
import static canteenmanagementsystem.CMS.jChocolateCost;
import static canteenmanagementsystem.CMS.jChocolateNumber;
import static canteenmanagementsystem.CMS.jColdDrinksCost;
import static canteenmanagementsystem.CMS.jColdDrinksNumber;
import static canteenmanagementsystem.CMS.jCookingCost;
import static canteenmanagementsystem.CMS.jCookingNumber;
import static canteenmanagementsystem.CMS.jNamakinCost;
import static canteenmanagementsystem.CMS.jNamakinNumber;
import static canteenmanagementsystem.CMS.jOtherCost;
import static canteenmanagementsystem.CMS.jOtherNumber;
import static canteenmanagementsystem.CMS.jSweetsCost;
import static canteenmanagementsystem.CMS.jSweetsNumber;
import static canteenmanagementsystem.CMS.jTempCustomer;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ShowRP {
    public ArrayList<tempCustomer> ListProduct()
    {
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<tempCustomer> proList = new ArrayList<tempCustomer>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM tempData");
            
            tempCustomer tempC;
            while(rs.next())
            {
                tempC = new tempCustomer(
                                                    rs.getString("pname"),
                                                    rs.getInt("pnumber"),
                                                    rs.getDouble("pcost"),
                                                    rs.getString("ptype")
                                                    );
                proList.add(tempC);
            }
        } catch (SQLException ex) {
            
        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        return proList;
         
    }
    public ShowRP()
    {
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException | SQLException ex) {
            
                }
                Statement st1;
                ResultSet rs1;
                int tPro=0;
                double tCos=0;
                String tProd=null;
                String tCost=null;
        try {
                st1 = con.createStatement();
                rs1 = st1.executeQuery("SELECT pnumber,pcost FROM tempData");
                while(rs1.next())
                {
                    tPro+=rs1.getInt("pnumber");
                    tCos+=rs1.getDouble("pcost");
                }
                tProd = Integer.toString(tPro);
                tCost = Double.toString(tCos);
        } catch (SQLException ex) {
            
        }
                
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Calendar calobj = Calendar.getInstance();
                String date = df.format(calobj.getTime());
                JFrame frame = new JFrame(); 
                JLabel CName = new JLabel("Customer Name");
                JLabel CName1 = new JLabel(CMS.jTempCustomer.getText());
                JLabel Datet = new JLabel("Date & Time");
                JLabel Datet1 = new JLabel(date);
                JLabel Seller = new JLabel("Seller Name");
                JLabel Seller1 = new JLabel(UserLogIn.SellerName);
                JLabel TPro = new JLabel("Total Product");
                JLabel TPro1 = new JLabel(tProd);
                JLabel TCos = new JLabel("Total Money");
                JLabel TCos1 = new JLabel(tCost);
                JButton Close = new JButton("Close");
                JButton Print = new JButton("Print");
                CName.setFont(new java.awt.Font("Times New Roman", 0, 19));
                CName1.setFont(new java.awt.Font("Times New Roman", 0, 19));
                Datet.setFont(new java.awt.Font("Times New Roman", 0, 19));
                Datet1.setFont(new java.awt.Font("Times New Roman", 0, 19));
                Seller.setFont(new java.awt.Font("Times New Roman", 0, 19));
                Seller1.setFont(new java.awt.Font("Times New Roman", 0, 19));
                TPro.setFont(new java.awt.Font("Times New Roman", 0, 19));
                TPro1.setFont(new java.awt.Font("Times New Roman", 0, 19));
                TCos.setFont(new java.awt.Font("Times New Roman", 0, 19));
                TCos1.setFont(new java.awt.Font("Times New Roman", 0, 19));
                Close.setFont(new java.awt.Font("Times New Roman", 0, 24));
                Print.setFont(new java.awt.Font("Times New Roman", 0, 24));
                Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                frame.add(CName);
                frame.add(CName1);
                frame.add(Datet);
                frame.add(Datet1);
                frame.add(Seller1);
                frame.add(Seller);
                frame.add(TPro);
                frame.add(TPro1);
                frame.add(TCos);
                frame.add(TCos1);
                frame.add(Close);
                frame.add(Print);
                CName.setBounds(13, 10, 170,30);
                Seller.setBounds(13, 42, 170,30);
                TPro.setBounds(13, 74, 170,30);
                TCos.setBounds(13, 106, 170,30);
                Datet.setBounds(13, 138, 170,30);
                CName1.setBounds(190, 10, 100,30);
                Seller1.setBounds(190, 42, 100,30);
                TPro1.setBounds(190, 74, 100,30);
                TCos1.setBounds(190, 106, 100,30);
                Datet1.setBounds(190, 138, 199,30);
                Close.setBounds(380,605,88,38);
                Print.setBounds(298,605,88,38);
                DefaultTableModel model = new DefaultTableModel();
                JTable table = new JTable(model);
                ArrayList<tempCustomer> tempCus = ListProduct();
                model.setColumnIdentifiers(new Object[]{"Name","Numbers","Cost","Type"});
                Object[] row = new Object[4];
                Font font = new Font("",1,13);
                table.setFont(font);
                table.setRowHeight(20);
                for(int i=0;i<tempCus.size();i++)
                {
                    row[0] =tempCus.get(i).getProName();
                    row[1] =tempCus.get(i).getProNumber();
                    row[2] =tempCus.get(i).getProCost();
                    row[3] =tempCus.get(i).getProType();
                    model.addRow(row);
                }
                table.setModel(model);
                JScrollPane pane = new JScrollPane(table);
                pane.setBounds(10, 165, 460, 435);
                Close.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                }
                });
                Print.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
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
                Statement st6;
                int prod = 0;
                int prod1 = 0;
                try {
                    st3=con.createStatement();
                    st4=con.createStatement();
                    st5=con.createStatement();
                    st6=con.createStatement();
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
                            st6.executeUpdate("DELETE FROM tempData where pname like '"+rs3.getString("pname")+"'");
                        }
                        else
                        {
                            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Calendar calobj = Calendar.getInstance();
                String date = df.format(calobj.getTime());
        Statement st;
        Statement st1;
        ResultSet rs;
        try {
            st=con.createStatement();
            rs=st.executeQuery("select * from tempData");
            
            st1=con.createStatement();
            while(rs.next())
            {
            st1.executeUpdate("insert into History values ("+rs.getInt("pnumber")+","+rs.getDouble("pcost")+",'"+rs.getString("ptype")+"','Temporary','"+date+"','"+rs.getString("pname")+"','"+jTempCustomer.getText()+"','"+UserLogIn.SellerName+"')");
            }
            
    
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,ex);
        }    
                Statement st2;
                
                
            try {
            st2=con.createStatement();
            st2.executeUpdate("DELETE FROM tempData");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
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
        CMS.jTempProducts.setText(null);
        CMS.jAcHolderProducts.setText(null);
        CMS.jAcHolderCost.setText(null);
        CMS.jTempCost.setText(null);
        CMS.jTotalNumber.setText(null);
        CMS.jTotalCost.setText(null);
                        }
                    rs4.close();
                    rs5.close();
                    }
                } catch (SQLException ex) {
                    
                }
                frame.dispose();
                try {
                    con.close();
                } catch (SQLException ex) {
                    
                }
        
                
                   
            }
                    
                });
                frame.setLayout(null);
        frame.setTitle("Money Paid");
                frame.add(pane);
                frame.setSize(500,690);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
    }
    
}

