package vehicletwo;

public abstract class Vehicle {
    protected double latitude;
    protected double longitude;
    public abstract void moveForward(int distanceInMeters);
    //could be common to all, but hard to know where to dispose of a plane?
    public abstract void demolish();

    //doesn't seem like this would be different for any of them
    public double[] getCurrentLatLng() {
        double[] location = {this.latitude, this.longitude};
        return location;
    }
}
