package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import static canteenmanagementsystem.CMS1.jTempCustomer;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ShowR11 {
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
    public ShowR11()
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
            
        }
                
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Calendar calobj = Calendar.getInstance();
                String date = df.format(calobj.getTime());
                JFrame frame = new JFrame(); 
                JLabel CName = new JLabel("Customer Name");
                JLabel CName1 = new JLabel(CMS1.jTempCustomer.getText());
                JLabel Datet = new JLabel("Date & Time");
                JLabel Datet1 = new JLabel(date);
                JLabel Seller = new JLabel("Seller Name");
                JLabel Seller1 = new JLabel(AdminLogIn.SellerName);
                JLabel TPro = new JLabel("Total Product");
                JLabel TPro1 = new JLabel(tProd);
                JLabel TCos = new JLabel("Total Money");
                JLabel TCos1 = new JLabel(tCost);
                JButton Close = new JButton("Close");
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
                Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
