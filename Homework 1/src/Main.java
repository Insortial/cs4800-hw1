import courses.Course;
import employees.*;
import filesystem.File;
import filesystem.Folder;
import ships.CargoShip;
import ships.CruiseShip;
import ships.Ship;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void shipPart()
    {
        Ship listOfShips[] = new Ship[3];
        Ship ship1 = new Ship();
        ship1.setShipName("Diamond Ship");
        ship1.setShipYearBuilt(2000);
        listOfShips[0] = ship1;

        CruiseShip ship2 = new CruiseShip();
        ship2.setShipName("Emerald Ship");
        ship2.setShipYearBuilt(1999);
        ship2.setMaxPassengers(1250);
        listOfShips[1] = ship2;

        CargoShip ship3 = new CargoShip();
        ship3.setShipName("Rock Ship");
        ship3.setShipYearBuilt(1976);
        ship3.setCargoCapacity(2000);
        listOfShips[2] = ship3;

        for(int i = 0; i < listOfShips.length; i++)
        {
            listOfShips[i].printShip();
        }
    }

    public static void printFolderContents(Folder currentFolder, int level)
    {
        currentFolder.printContents(level);
        if(currentFolder.getSubFolders().isEmpty() && currentFolder.getFiles().isEmpty())
        {
            return;
        }
        HashMap<String, Folder> subFolders = currentFolder.getSubFolders();
        for (HashMap.Entry<String,Folder> subFolder : subFolders.entrySet())
        {
            printFolderContents(subFolder.getValue(), level + 1);
        }
    }

    public static void removeFolder(Folder folder, String key)
    {
        HashMap<String, Folder> subFolders = folder.getSubFolders();
        if(subFolders.containsKey(key))
        {
            subFolders.remove(key);
        } else
        {
            for (HashMap.Entry<String,Folder> subFolder : subFolders.entrySet())
            {
                removeFolder(subFolder.getValue(), key);
            }
        }
    }

    public static void employeePart()
    {
        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        SalariedEmployee joeJonas = new SalariedEmployee();
        joeJonas.setFirstName("Joe");
        joeJonas.setLastName("Jonas");
        joeJonas.setSSN("111-11-1111");
        joeJonas.setWeeklySalary(2500);
        listOfEmployees.add(joeJonas);

        HourlyEmployee stephSmith = new HourlyEmployee();
        stephSmith.setFirstName("Stephanie");
        stephSmith.setLastName("Smith");
        stephSmith.setSSN("222-22-2222");
        stephSmith.setWage(25);
        stephSmith.setNoOfHoursWorked(32);
        listOfEmployees.add(stephSmith);

        HourlyEmployee maryQuinn = new HourlyEmployee();
        maryQuinn.setFirstName("Mary");
        maryQuinn.setLastName("Quinn");
        maryQuinn.setSSN("333-33-3333");
        maryQuinn.setWage(19);
        maryQuinn.setNoOfHoursWorked(47);
        listOfEmployees.add(maryQuinn);

        CommissionEmployee nicoleDior = new CommissionEmployee();
        nicoleDior.setFirstName("Nicole");
        nicoleDior.setLastName("Dior");
        nicoleDior.setSSN("444-44-4444");
        nicoleDior.setCommRate(0.15F);
        nicoleDior.setGrossSales(50000);
        listOfEmployees.add(nicoleDior);

        SalariedEmployee renwaChanel = new SalariedEmployee();
        renwaChanel.setFirstName("Renwa");
        renwaChanel.setLastName("Chanel");
        renwaChanel.setSSN("555-55-5555");
        renwaChanel.setWeeklySalary(1700);
        listOfEmployees.add(renwaChanel);

        BaseEmployee mikeDaven = new BaseEmployee();
        mikeDaven.setFirstName("Mike");
        mikeDaven.setLastName("Davenport");
        mikeDaven.setSSN("666-66-666");
        mikeDaven.setBaseSalary(95000);
        listOfEmployees.add(mikeDaven);

        CommissionEmployee mahVaz = new CommissionEmployee();
        mahVaz.setFirstName("Mahnaz");
        mahVaz.setLastName("Vaziri");
        mahVaz.setSSN("777-77-7777");
        mahVaz.setCommRate(0.22f);
        mahVaz.setGrossSales(40000);
        listOfEmployees.add(joeJonas);

        for(int i = 0; i < listOfEmployees.size(); i++)
        {
            System.out.println(listOfEmployees.get(i).getFirstName() + " " + listOfEmployees.get(i).getLastName());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Part 1 of HW
        employeePart();

        //Part 2 of HW
        shipPart();

        //Part 3 of HW
        Course exampleCourse = new Course("CS4800");
        exampleCourse.printCourseInfo();

        //Part 4 of HW
        Folder demo1 = new Folder();
        demo1.setName("demo1");

        Folder inc = new Folder();
        inc.setName("Include Path");
        Folder rem = new Folder();
        rem.setName("Remote Files");

        Folder src = new Folder();
        src.setName("Source Files");
        Folder pub = new Folder();
        pub.setName("public");
        Folder pha = new Folder();
        pha.setName(".phaIcon");

        Folder app = new Folder();
        app.setName("app");
        Folder config = new Folder();
        config.setName("config");
        Folder control = new Folder();
        control.setName("controllers");
        Folder lib = new Folder();
        lib.setName("library");
        Folder mig = new Folder();
        mig.setName("migrations");
        Folder models = new Folder();
        models.setName("models");
        Folder views = new Folder();
        views.setName("views");

        Folder cache = new Folder();
        cache.setName("cache");

        File hta = new File();
        hta.setFilename(".htacess");
        File htr = new File();
        htr.setFilename(".htrouter.php");
        File ind = new File();
        ind.setFilename("index.html");

        pub.addFile(hta);
        pub.addFile(htr);
        pub.addFile(ind);

        app.addFolder(config);
        app.addFolder(control);
        app.addFolder(lib);
        app.addFolder(mig);
        app.addFolder(models);
        app.addFolder(views);

        src.addFolder(pha);
        src.addFolder(app);
        src.addFolder(cache);

        src.addFolder(pub);
        demo1.addFolder(inc);
        demo1.addFolder(rem);
        demo1.addFolder(src);

        printFolderContents(demo1, 0);
        removeFolder(demo1, "app");
        printFolderContents(demo1, 0);
        removeFolder(demo1, "public");
        printFolderContents(demo1, 0);
    }
}