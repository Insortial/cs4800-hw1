package employees;

public class SalariedEmployee extends Employee{
    private int weeklySalary;
    public SalariedEmployee()
    {
        super();
    }

    public void setWeeklySalary(int weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary()
    {
        return this.weeklySalary;
    }
}
