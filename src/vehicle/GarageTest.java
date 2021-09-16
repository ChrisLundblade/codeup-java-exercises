package vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Vehicle[] vehicleCollection = {new Truck("tundra"),
                new Minivan("oddyssey"),
                new SportySedan("some kind of BMW"),
                new SUV("chevrolet tahoe")};
        Garage myGarage = new Garage(vehicleCollection);
        myGarage.alarmCascade();
    }

}
