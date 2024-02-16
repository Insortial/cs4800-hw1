package employees;

public class HourlyEmployee extends Employee{
    private int wage;
    private int noOfHoursWorked;
    public HourlyEmployee(String firstName, String lastName, String SSN, int wage, int noOfHoursWorked)
    {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public void setWage(int wage)
    {
        this.wage = wage;
    }

    public int getWage()
    {
        return this.wage;
    }

    public void setNoOfHoursWorked(int noOfHoursWorked)
    {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public float getNoOfHoursWorked()
    {
        return this.noOfHoursWorked;
    }
}
