package vehicle;

public class Garage {
    private Vehicle[] vehiclesInGarage;

    public void setVehiclesInGarage(Vehicle[] vehiclesInGarage) {
        this.vehiclesInGarage = vehiclesInGarage;
    }

    public void alarmCascade(){
        for(Vehicle vehicle : this.vehiclesInGarage){
            System.out.println(vehicle.getName() + " goes ");
            vehicle.alarm();
        }
    }
//    public void setVehiclesInGarage(Vehicle vehicleInGarage, int index) {
//        this.vehiclesInGarage[index] = vehiclesInGarage;
//    }
    public Garage(Vehicle[] arrayOfVehiclesToBeInGarage){
        setVehiclesInGarage(arrayOfVehiclesToBeInGarage);
    }


}
