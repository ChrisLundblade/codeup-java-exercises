package vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Vehicle[] vehicleCollection = {new Truck(), new Minivan(), new SportySedan()};
        Garage myGarage = new Garage(vehicleCollection);
        myGarage.alarmCascade();
    }

}
