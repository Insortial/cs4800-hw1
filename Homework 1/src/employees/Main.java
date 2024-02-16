package employees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void shipPart() {
        Ship listOfShips[] = { new Ship("Diamond Ship", 2000), new CruiseShip("Emerald Ship", 1999, 1250), new CargoShip("Rock Ship", 1976, 2000)};
        for(int i = 0; i < listOfShips.length; i++)
        {
            listOfShips[i].printShip();
        }
    }

    public static void main(String[] args) {
        //Part 1 of HW
        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500));
        listOfEmployees.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32));
        listOfEmployees.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47));
        listOfEmployees.add(new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15F, 50000));
        listOfEmployees.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700));
        listOfEmployees.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000));
        listOfEmployees.add(new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22F, 40000));
        for(int i = 0; i < listOfEmployees.size(); i++)
        {
            System.out.println(listOfEmployees.get(i).getFirstName() + " " + listOfEmployees.get(i).getLastName());
        }

        //Part 2 of HW
        shipPart();
    }
}