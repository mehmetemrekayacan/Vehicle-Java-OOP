package Vehicles;
import Class.MainFunction;
import VehiclesClass.LandVehicle;
public class Tank extends LandVehicle {
    public Tank() {
        MainFunction.count++;
        this.gasoline = 1500;
        this.maxSpeed = 60;
        this.speedDeviation = 5;
        this.vehicleName = "Tank";
        this.burningFuelConstant = 0.8;
        this.burningFuelMobile = 1.2;
        this.velocity=10;
    }
}
