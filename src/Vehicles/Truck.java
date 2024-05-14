package Vehicles;
import VehiclesClass.LandVehicle;
public class Truck extends LandVehicle {
    public Truck() {
        this.gasoline = 200;
        this.maxSpeed = 180;
        this.speedDeviation = 10;
        this.vehicleName = "Truck";
        this.burningFuelConstant = 0.2;
        this.burningFuelMobile = 0.4;
    }
}
