package vehicletwo;

public class Plane extends Vehicle implements PowerControllable{
    public Plane(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    public void on(){

    }
    public void off(){

    }

    public void moveForward(int distanceInMeters){

    }

    public void demolish(){
        System.out.println("Yeah there's gotta be a special way to handle demolishing/disposing of a plane but it's not taking it to an ordinary junk yard.");
    }
}
