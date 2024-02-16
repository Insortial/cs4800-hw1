package employees;

public class CruiseShip extends Ship{
    private int maxPassengers;

    public CruiseShip(String shipName, int shipYearBuilt, int maxPassengers) {
        super(shipName, shipYearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void printShip() {
        System.out.println("Ship Name: " + super.getShipName());
        System.out.println("Max Passengers: " + this.maxPassengers);
        System.out.println();
    }
}
