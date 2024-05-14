package Vehicles;
import VehiclesClass.LandVehicle;
public class Truck extends LandVehicle {
    public Truck(double gasoline, int passengerCount) {
        this.wheelCount = 6;
        this.maxSpeed = 90;
        this.speedDeviation = 10;
        this.vehicleName = "Truck";
    }
}
