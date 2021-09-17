package vehicletwo;

public class Bicycle extends Vehicle {
    public Bicycle(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    public void moveForward(int distanceInMeters){
        System.out.println("Push pedals (and don't fall off) until you've gone " + distanceInMeters);
    }

    public void demolish(){
        System.out.println("Chunk it in a dumpster? Or smash it up with a hammer? Or a hydraulic press?");
    }

}
