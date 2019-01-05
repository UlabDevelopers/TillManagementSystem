package canteenmanagementsystem;

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RemainingStock {
    public ArrayList<RS> ListProduct()
    {
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<RS> proList = new ArrayList<RS>();
        
        Statement st;
        ResultSet rs;
         Statement st1;
        
        try {
            st=con.createStatement();
            st1=con.createStatement();
            rs=st.executeQuery("SELECT * FROM pdata");
            
            RS tempC;
            while(rs.next())
            {
                ResultSet rs1=st1.executeQuery("SELECT PNumber FROM History where PName='"+rs.getString("pname")+"'");
                int produc = rs.getInt("pnumber");
                double costcost = rs.getDouble("pcost");
                
                while(rs1.next())
                {
                produc -=rs1.getInt("PNumber");
                
                }
                costcost*=produc;
                tempC = new RS(
                                                    rs.getString("pname"),
                                                    produc,
                                                    costcost,
                                                    rs.getString("ptype")
                                                    );
                proList.add(tempC);
                
            }
            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            
        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        return proList;
         
    }
    public RemainingStock()
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
                JFrame frame = new JFrame(); 
                JLabel TPro = new JLabel("Total Remaining Product");
                JLabel TPro1 = new JLabel(tProd);
                JLabel TCos = new JLabel("Total Remaining Money");
                JLabel TCos1 = new JLabel(tCost);
                TPro.setFont(new java.awt.Font("Times New Roman", 0, 24));
                TPro1.setFont(new java.awt.Font("Times New Roman", 0, 24));
                TCos.setFont(new java.awt.Font("Times New Roman", 0, 24));
                TCos1.setFont(new java.awt.Font("Times New Roman", 0, 24));
                frame.add(TPro);
                frame.add(TPro1);
                frame.add(TCos);
                frame.add(TCos1);
                TPro.setBounds(20, 20, 250,40);
                TPro1.setBounds(290, 20, 140,40);
                TCos.setBounds(350, 20, 250,40);
                TCos1.setBounds(620, 20, 140,40);
                DefaultTableModel model = new DefaultTableModel();
                JTable table = new JTable(model);
                ArrayList<RS> tempCus = ListProduct();
                model.setColumnIdentifiers(new Object[]{"Name","Numbers","Cost","Type"});
                Object[] row = new Object[4];
                Font font = new Font("Times New Roman",0,17);
                table.setFont(font);
                table.setRowHeight(27);
                for(int i=0;i<tempCus.size();i++)
                {
                    row[0] =tempCus.get(i).getProName();
                    row[1] =tempCus.get(i).getProNumber();
                    row[2] =tempCus.get(i).getProCost();
                    row[3] =tempCus.get(i).getProType();
                    model.addRow(row);
                tPro+=tempCus.get(i).getProNumber();
                    tCos+=tempCus.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(tPro);
                    String tempo2 = Double.toString(tCos);
                    TPro1.setText(tempo1);
                    TCos1.setText(tempo2);
                table.setModel(model);
                JScrollPane pane = new JScrollPane(table);
                pane.setBounds(20, 70, 740, 410);                            
                                frame.setLayout(null);
        frame.setTitle("Remaining Stock");
                frame.add(pane);
                frame.setSize(800,520);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
    }
}
