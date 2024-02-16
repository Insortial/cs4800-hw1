package employees;

public class CommissionEmployee extends Employee{
    private float commRate;
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String SSN, float commRate, int grossSales)
    {
        super(firstName, lastName, SSN);
        this.commRate = commRate;
        this.grossSales = grossSales;
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
