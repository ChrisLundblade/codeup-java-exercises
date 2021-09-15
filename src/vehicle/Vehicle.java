package vehicle;

public class Vehicle {
    protected String name;

    public String getName() {
        return name;
    }

    public Vehicle findVehicle(String name, Vehicle[] vehicles){
        for (Vehicle vehicle: vehicles){
            if(vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
            }
        }
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String name){
        this.name = name;
    }

    public Vehicle(){
    }

    public void makeNoise(){
        System.out.println("vrooooooom");
    }

    public void alarm(){
        System.out.println("WAAOOO WAAAOOO WAAOOO WAOOO");
    }
}
