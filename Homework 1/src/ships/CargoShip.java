package ships;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip()
    {
        super();
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void printShip() {
        System.out.println("Ship Name: " + super.getShipName());
        System.out.println("Cargo Capacity: " + this.cargoCapacity + " tonnes");
        System.out.println();
    }
}
