package employees;

public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee()
    {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}
