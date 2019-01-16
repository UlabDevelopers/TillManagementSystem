package canteenmanagementsystem;
public class tempCustomer
{
    private String proName;
    private int proNumber;
    private double proCost;
    private String proType;
    public tempCustomer(String ProName,int ProNumber,double ProCost,String ProType)
    {
        this.proName=ProName;
        this.proNumber=ProNumber;
        this.proCost=ProCost;
        this.proType=ProType;
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
    public String getProType()
    {
        return proType;
    }
}

