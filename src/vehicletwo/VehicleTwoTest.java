package vehicletwo;

import java.util.Arrays;

public class VehicleTwoTest {
    public static void main(String[] args) {
        Car camry = new Car(123.17, 101);
        camry.on();
        camry.moveForward(15);
        System.out.println(Arrays.toString(camry.getCurrentLatLng()));
        camry.off();
        camry.demolish();


    }
}
