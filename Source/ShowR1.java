package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.AcCName;
import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ShowR1 {
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
    public ShowR1()
    {
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
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
            
        }       double MR = 0;
                int PP = 0;                
                ResultSet rs2;
                Statement st2;
        try {
            st2=con.createStatement();
            rs2= st2.executeQuery("SELECT MR,PP FROM AcHolderMoney Where CName='"+(String) CMS.jAcHolderCustomer.getSelectedItem()+"'");
                rs2.next();
                MR = rs2.getDouble("MR");
                PP=rs2.getInt("PP");
                rs2.close();
                st2.close();
        } catch (SQLException ex) {
            Logger.getLogger(ShowR1.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Calendar calobj = Calendar.getInstance();
                String date = df.format(calobj.getTime());
                JFrame frame = new JFrame(); 
                JLabel CName = new JLabel("Customer Name");
                JLabel CName1 = new JLabel((String) CMS.jAcHolderCustomer.getSelectedItem());
                JLabel Datet = new JLabel("Date & Time");
                JLabel Datet1 = new JLabel(date);
                JLabel Seller = new JLabel("Seller Name");
                JLabel Seller1 = new JLabel(UserLogIn.SellerName);
                JLabel TPro = new JLabel("Total Product");
                JLabel TPro1 = new JLabel(tProd+" + "+PP+"(Old Product Brought)");
                JLabel TCos = new JLabel("Total Money");
                JLabel TCos1 = new JLabel(tCost+" + "+MR+"(Old Money Remaining)");
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
                CName1.setBounds(190, 10, 150,30);
                Seller1.setBounds(190, 42, 100,30);
                TPro1.setBounds(190, 74, 250,30);
                TCos1.setBounds(190, 106, 250,30);
                Datet1.setBounds(190, 138, 199,30);
                Close.setBounds(380,605,88,38);
                Print.setBounds(292,605,88,38);
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
               
                    frame.dispose();
                   
            }
                    
                });
                frame.setLayout(null);
        frame.setTitle("Show Recipt");               

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
