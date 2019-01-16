package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AcHistory {
     public ArrayList<History1> HistoryList1(String SName)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History1> HList = new ArrayList<History1>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM History WHERE CName like '%"+SName+"%';");
            
            History1 tempC;
            while(rs.next())
            {
                tempC = new History1(
                                                    rs.getString("Date"),
                                                    rs.getString("CName"),                                                    
                                                    rs.getString("PName"),
                                                    rs.getInt("PNumber"),
                                                    rs.getDouble("PCost"),
                                                    rs.getString("CType"),
                                                    rs.getString("PType")
                                                    );
                HList.add(tempC);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            
        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        return HList;
         
    }
     public AcHistory(String CusName)
     {
        JDialog frame = new JDialog();        
        JLabel Tprod = new JLabel("Total Product");
        JLabel tProd = new JLabel();
        JLabel Tcost = new JLabel("Total Money");
        JLabel tCost = new JLabel();
        
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        table.setModel(model); 
        JScrollPane pane = new JScrollPane(table);
           
        Tprod.setFont(new java.awt.Font("Times New Roman", 0, 24));
        tProd.setFont(new java.awt.Font("Times New Roman", 0, 24));
        Tcost.setFont(new java.awt.Font("Times New Roman", 0, 24));
        tCost.setFont(new java.awt.Font("Times New Roman", 0, 24));
        
        frame.add(Tprod);
        frame.add(tProd);
        frame.add(Tcost);
        frame.add(tCost);
        Tprod.setBounds(20,20,150,40);
        tProd.setBounds(180,20,150,40);
        Tcost.setBounds(280, 20, 150, 40);
        tCost.setBounds(440,20,150,40);
        pane.setBounds(20, 80, 940, 650);
        Font font = new Font("Times New Roman",0,18);
        table.setFont(font);
        table.setRowHeight(25);
        model.setColumnIdentifiers(new Object[]{"Date","Customer Name","Product Name","Product Number","Product Cost","Customer Type","Product Type"});
                 Object[] row = new Object[7];
                   ArrayList<History1> tTable = HistoryList1(CusName);
                   int Produ=0;
                   double Costo=0;
                   for(int i=0;i<tTable.size();i++)
                {
                    row[0] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[1]=tTable.get(i).getCName();
                    row[2]=tTable.get(i).getProName();
                    row[3] =tTable.get(i).getProNumber();
                    row[4] =tTable.get(i).getProCost();
                    row[5] =tTable.get(i).getCType();
                    row[6] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
                
                frame.setLayout(null);
                frame.setTitle("Account Holder History");
                frame.add(pane);
                frame.setSize(1000,680);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
     }
}
