package employees;

public class BaseEmployee extends Employee {
    private int baseSalary;

    public BaseEmployee()
    {
        super();
    }


    public void setBaseSalary(int baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary()
    {
        return this.baseSalary;
    }
}
