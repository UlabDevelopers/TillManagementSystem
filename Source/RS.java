package canteenmanagementsystem;
public class RS
{
    private String proName;
    private int proNumber;
    private double proCost;
    private String proType;
    public RS(String ProName,int ProNumber,double ProCost,String ProType)
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

