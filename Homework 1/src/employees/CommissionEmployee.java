package employees;

public class CommissionEmployee extends Employee{
    private float commRate;
    private int grossSales;

    public CommissionEmployee()
    {
        super();
    }

    public void setCommRate(float commRate)
    {
        this.commRate = commRate;
    }

    public float getCommRate()
    {
        return this.commRate;
    }

    public void setGrossSales(int grossSales)
    {
        this.grossSales = grossSales;
    }

    public float getGrossSales()
    {
        return this.grossSales;
    }
}
