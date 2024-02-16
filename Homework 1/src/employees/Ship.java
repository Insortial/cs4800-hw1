package employees;

public class Ship {
    private String shipName;
    private int shipYearBuilt;

    public Ship(String shipName, int shipYearBuilt) {
        this.shipName = shipName;
        this.shipYearBuilt = shipYearBuilt;
    }
    public int getShipYearBuilt() {
        return shipYearBuilt;
    }

    public void printShip() {
        System.out.println("Ship Name: " + this.shipName);
        System.out.println("Year Ship Built: " + this.shipYearBuilt);
        System.out.println();
    }
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipYearBuilt(int shipYearBuilt) {
        this.shipYearBuilt = shipYearBuilt;
    }
}
