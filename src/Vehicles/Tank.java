package Vehicles;
import VehiclesClass.LandVehicle;
public class Tank extends LandVehicle {
    public Tank(double gasoline, int passengerCount) {
        this.wheelCount = 24;
        this.maxSpeed = 60;
        this.speedDeviation = 5;
        this.vehicleName = "Tank";
    }
}
