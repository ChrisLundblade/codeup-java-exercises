package vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Truck tacoma = new Truck("tacoma");
        //tacoma.setName("tacoma");

        tacoma.makeNoise();
        tacoma.breakingDownNoise();

        SportySedan mySedan = new SportySedan("Jeff");
        System.out.println(mySedan.name);
        mySedan.setName("BMW something or another");
        System.out.println(mySedan.name);

        Minivan newMinivan = new Minivan();
        System.out.println(newMinivan.name);
        newMinivan.setName("honda oddyssey");
        System.out.println(newMinivan.name);

    }


}
