package Vehicles;
import Class.MainFunction;
import VehiclesClass.LandVehicle;
public class Truck extends LandVehicle {
    public Truck() {
        MainFunction.count++;
        this.gasoline = 200;
        this.maxSpeed = 180;
        this.speedDeviation = 10;
        this.vehicleName = "Truck";
        this.burningFuelConstant = 0.2;
        this.burningFuelMobile = 0.4;
        this.velocity=15;
    }
}
