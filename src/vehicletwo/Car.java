package vehicletwo;

public class Car extends Vehicle implements PowerControllable{
    public Car(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    public void on(){
        System.out.println("Press down break and turn key clockwise");
    }

    public void off(){
        System.out.println("Place in 'Park' and turn key counter-clockwise");
    }
    public void moveForward(int distanceInMeters){
        System.out.println("Press accelerator gently with foot until you have gone " + distanceInMeters + " meters.");
    }

    public void demolish(){
        System.out.println("take it to the junk yard?");
    }
}
