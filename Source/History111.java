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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class History111 {
    public ArrayList<History11> HistoryList()
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM History;");
            
            History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                                                    rs.getString("SellerName"),
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
    public ArrayList<History11> HistoryList8(String Date)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM History where Date like '%"+Date+"%';");
            
            History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                                                    rs.getString("SellerName"),
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
    public ArrayList<History11> HistoryList1(String SName)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM History WHERE CName like '%"+SName+"%';");
            
            History11 tempC;
            while(rs.next())
            {
                tempC = new History11(               
                                                    rs.getString("SellerName"),
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
    public ArrayList<History11> HistoryList2(String SName)
    {
       
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM History WHERE SellerName like '%"+SName+"%';");
            
            History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                                                    rs.getString("SellerName"),
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
    public ArrayList<History11> HistoryList3(String SName,String Type)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM History WHERE CName like '%"+SName+"%' and SellerName like '%"+Type+"%';");
            
            History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                                                    rs.getString("SellerName"),
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
    public ArrayList<History11> HistoryList4(String HisName)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Calendar calobj = Calendar.getInstance();
        String date = df.format(calobj.getTime());
        DateFormat df1 = new SimpleDateFormat("MM/yy");
        Calendar calobj1 = Calendar.getInstance();
        String date1 = df1.format(calobj.getTime());         
        DateFormat df2 = new SimpleDateFormat("yy");
        Calendar calobj2 = Calendar.getInstance();
        String date2 = df2.format(calobj.getTime()); 
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            if(HisName.equals("Today"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if(HisName.equals("This Month"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date1+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if (HisName.equals("This Year")) {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date2+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            
            
           
        } catch (SQLException ex) {
            
        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        return HList;
         
    }
    public ArrayList<History11> HistoryList5(String SName,String HisName)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Calendar calobj = Calendar.getInstance();
        String date = df.format(calobj.getTime());
        DateFormat df1 = new SimpleDateFormat("MM/yy");
        Calendar calobj1 = Calendar.getInstance();
        String date1 = df1.format(calobj.getTime());         
        DateFormat df2 = new SimpleDateFormat("yy");
        Calendar calobj2 = Calendar.getInstance();
        String date2 = df2.format(calobj.getTime()); 
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            if(HisName.equals("Today"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date+"%' and CName like '%"+SName+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if(HisName.equals("This Month"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date1+"%' and CName like '%"+SName+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if (HisName.equals("This Year")) {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date2+"%' and CName like '%"+SName+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
        } catch (SQLException ex) {
            
        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        return HList;
         
    }
    public ArrayList<History11> HistoryList6(String HisName,String Type)
    {
        
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Calendar calobj = Calendar.getInstance();
        String date = df.format(calobj.getTime());
        DateFormat df1 = new SimpleDateFormat("MM/yy");
        Calendar calobj1 = Calendar.getInstance();
        String date1 = df1.format(calobj.getTime());         
        DateFormat df2 = new SimpleDateFormat("yy");
        Calendar calobj2 = Calendar.getInstance();
        String date2 = df2.format(calobj.getTime()); 
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            if(HisName.equals("Today"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date+"%' and SellerName like '%"+Type+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if(HisName.equals("This Month"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date1+"%' and SellerName like '%"+Type+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if (HisName.equals("This Year")) {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date2+"%' and SellerName like '%"+Type+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
        } catch (SQLException ex) {
            
        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        return HList;
         
    }
    public ArrayList<History11> HistoryList7(String HisName,String Type,String SName)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Calendar calobj = Calendar.getInstance();
        String date = df.format(calobj.getTime());
        DateFormat df1 = new SimpleDateFormat("MM/yy");
        Calendar calobj1 = Calendar.getInstance();
        String date1 = df1.format(calobj.getTime());         
        DateFormat df2 = new SimpleDateFormat("yy");
        Calendar calobj2 = Calendar.getInstance();
        String date2 = df2.format(calobj.getTime()); 
        try {
                 Class.forName(DRIVER);
                con=DriverManager.getConnection(JDBC_URL);
                } catch (ClassNotFoundException ex) {
            
                } catch (SQLException ex) {
            
                }
        ArrayList<History11> HList = new ArrayList<History11>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            if(HisName.equals("Today"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date+"%' and SellerName like '%"+Type+"%'and CName like '%"+SName+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if(HisName.equals("This Month"))
            {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date1+"%' and SellerName like '%"+Type+"%' and CName like '%"+SName+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
            else if (HisName.equals("This Year")) {
                rs=st.executeQuery("SELECT * FROM History WHERE Date like '%"+date2+"%' and SellerName like '%"+Type+"%' and CName like '%"+SName+"%';");
                 History11 tempC;
            while(rs.next())
            {
                tempC = new History11(
                        rs.getString("SellerName"),
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
            }
        } catch (SQLException ex) {
            
        }
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
        return HList;
         
    }
    public History111()
    {
        JFrame frame = new JFrame();
        JComboBox HistoryBox = new JComboBox();
        JLabel Tprod = new JLabel("Total Product");
        JLabel tProd = new JLabel();
        JLabel Tcost = new JLabel("Total Cost");
        JLabel tCost = new JLabel();
        HistoryBox.addItem("History");
        HistoryBox.addItem("Today");
        HistoryBox.addItem("This Month");
        HistoryBox.addItem("This Year");
        JComboBox HistoryBox1 = new JComboBox();
        HistoryBox1.addItem("Seller Name");
        HistoryBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HistoryBox1.removeAllItems();
        HistoryBox1.addItem("Seller Name");
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        Statement st;
        ResultSet rs;
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT username FROM Login");
            while(rs.next())
            {
                HistoryBox1.addItem(rs.getString("username"));
            }
        } catch (SQLException ex) {

        }

        try {
            con.close();
        } catch (SQLException ex) {

        } 
            }
        });
        JTextField HistoryField = new JTextField("Customer Name");
        JButton Search = new JButton("Search");
        JTextField datea = new JTextField("DD/MM/YY");
        HistoryBox.setFont(new java.awt.Font("Times New Roman", 0, 24));
        HistoryBox1.setFont(new java.awt.Font("Times New Roman", 0, 24));
        HistoryField.setFont(new java.awt.Font("Times New Roman", 0, 24));
        Search.setFont(new java.awt.Font("Times New Roman", 0, 24));   
        Tprod.setFont(new java.awt.Font("Times New Roman", 0, 24));
        tProd.setFont(new java.awt.Font("Times New Roman", 0, 24));
        Tcost.setFont(new java.awt.Font("Times New Roman", 0, 24));
        tCost.setFont(new java.awt.Font("Times New Roman", 0, 24));
        datea.setFont(new java.awt.Font("Times New Roman", 0, 24));
        
        frame.add(Tprod);
        frame.add(tProd);
        frame.add(Tcost);
        frame.add(tCost);
        frame.add(Search);
        frame.add(HistoryBox);
        frame.add(HistoryBox1);
        frame.add(HistoryField);
        frame.add(datea);
        HistoryBox.setBounds(20, 10, 150, 40);
        datea.setBounds(190,10,130,40);
        HistoryBox1.setBounds(330, 10, 200, 40);
        HistoryField.setBounds(580, 10, 516, 40);
        Search.setBounds(1110, 10, 200, 40);
        Tprod.setBounds(20,60,150,40);
        tProd.setBounds(180,60,150,40);
        Tcost.setBounds(340, 60, 150, 40);
        tCost.setBounds(500,60,150,40);
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        table.setModel(model); 
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(20, 110, 1325, 620);
        Font font = new Font("Times New Roman",0,18);
        table.setFont(font);
        table.setRowHeight(25);
        model.setColumnIdentifiers(new Object[]{"Username","Date","Customer Name","Product Name","Product Number","Product Cost","Customer Type","Product Type"});
        int Produ=0;
                 double Costo=0;
                Object[] row = new Object[8];
        ArrayList<History11> tTable = HistoryList();
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                    row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
        
        Search.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                 int Produ=0;
                 double Costo=0;
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged(); 
                Object[] row = new Object[8];
                if(HistoryBox.getSelectedItem().equals("History")&&datea.getText().equals("DD/MM/YY")&&HistoryBox1.getSelectedItem().equals("Seller Name")&&HistoryField.getText().equals("Customer Name"))
                {
                    JOptionPane.showMessageDialog(null,"Please Select any Data To Search");
                }
                
                else if(HistoryBox.getSelectedItem()!=("History")&&HistoryBox1.getSelectedItem().equals("Seller Name")&&HistoryField.getText().equals("Customer Name"))
                {
                    ArrayList<History11> tTable = HistoryList4((String) HistoryBox.getSelectedItem());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                   row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
                }
                else if(HistoryBox.getSelectedItem()!=("History")&&HistoryBox1.getSelectedItem()!=("Seller Name")&&HistoryField.getText().equals("Customer Name"))
                {
                     ArrayList<History11> tTable = HistoryList6((String) HistoryBox.getSelectedItem(),(String) HistoryBox1.getSelectedItem());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                    row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);   
                }
                else if(HistoryBox.getSelectedItem()!=("History")&&HistoryBox1.getSelectedItem().equals("Seller Name")&&HistoryField.getText()!=("Customer Name"))
                {
                     ArrayList<History11> tTable = HistoryList5(HistoryField.getText(),(String) HistoryBox.getSelectedItem());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                    row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
                }
                
                else if(HistoryBox.getSelectedItem()!=("History")&&HistoryBox1.getSelectedItem()!=("Seller Name")&&HistoryField.getText()!=("Customer Name"))
                {
                    ArrayList<History11> tTable = HistoryList7((String) HistoryBox.getSelectedItem(),(String) HistoryBox1.getSelectedItem(),HistoryField.getText());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                    row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);

                }
                else if(HistoryBox.getSelectedItem().equals("History")&&HistoryBox1.getSelectedItem()!=("Seller Name")&&HistoryField.getText()!=("Customer Name"))
                {
                    ArrayList<History11> tTable = HistoryList3(HistoryField.getText(),(String) HistoryBox1.getSelectedItem());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                    row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
                }
                
                else if(HistoryBox.getSelectedItem().equals("History")&&HistoryBox1.getSelectedItem().equals("Seller Name")&&HistoryField.getText()!=("Customer Name"))
                {
                     
                    ArrayList<History11> tTable = HistoryList1(HistoryField.getText());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                    row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
                }
                if(HistoryBox.getSelectedItem().equals("History")&&datea.getText().equals("DD/MM/YY")&&HistoryBox1.getSelectedItem()!="Seller Name"&&HistoryField.getText().equals("Customer Name"))
                {
                    ArrayList<History11> tTable = HistoryList2((String) HistoryBox1.getSelectedItem());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                   row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
                }
                
                if(datea.getText().equals("DD/MM/YY")||datea.getText().equals(null))
                {
                    
                }
                else
                {
                    
                    
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
                    ArrayList<History11> tTable = HistoryList8((String) datea.getText());
                    for(int i=tTable.size()-1;i>=0;i--)
                {
                    row[0] =tTable.get(i).getUser();
                    row[1] =tTable.get(i).getDate();//tTable.get(i).getDate();
                    row[2]=tTable.get(i).getCName();
                    row[3]=tTable.get(i).getProName();
                    row[4] =tTable.get(i).getProNumber();
                    row[5] =tTable.get(i).getProCost();
                    row[6] =tTable.get(i).getCType();
                    row[7] =tTable.get(i).getProType();
                    model.addRow(row);
                
                    Produ+=tTable.get(i).getProNumber();
                    Costo+=tTable.get(i).getProCost();
                }
                    String tempo1 = Integer.toString(Produ);
                    String tempo2 = Double.toString(Costo);
                    tProd.setText(tempo1);
                    tCost.setText(tempo2);
                }
                }
        });
        
                
                frame.setLayout(null);
        frame.setTitle("History");
                frame.add(pane);
                frame.setSize(1366,768);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
                
                
    }
}
