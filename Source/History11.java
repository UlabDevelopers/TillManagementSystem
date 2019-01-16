package canteenmanagementsystem;

import static canteenmanagementsystem.CMS.DRIVER;
import static canteenmanagementsystem.CMS.JDBC_URL;
import static canteenmanagementsystem.CMS.con;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class History11
{
    private String user;
    private String date;
    private String cName;
    private String proName;
    private int proNumber;
    private double proCost;
    private String cType;
    private String proType;
    public History11(String User,String Date,String CName,String ProName,int ProNumber,double ProCost,String CType,String ProType)
    {
        this.user=User;
        this.date=Date;
        this.cName=CName;        
        this.proName=ProName;
        this.proNumber=ProNumber;
        this.proCost=ProCost;
        this.cType=CType;
        this.proType=ProType;
    }
    public String getUser()
    {
        return user;
    }
    public String getDate()
    {
        return date;
    }
    public String getCName()
    {
        return cName;
    }
    public String getProName()
    {
        return proName;
    }
    public int getProNumber()
    {
        return proNumber;
    }
    public double getProCost()
    {
        return proCost;
    }
    public String getCType()
    {
        return cType;
    }
    public String getProType()
    {
        return proType;
    }
}





