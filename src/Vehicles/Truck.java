package Vehicles;
import Class.MainFunction;
import VehiclesClass.LandVehicle;
public class Truck extends LandVehicle {

    public Truck() {
        MainFunction.count++;
        this.gasoline = 200;
        this.maxSpeed = 180;
        this.speedVariation = 10;
        this.vehicleName = "Truck";
        this.burningFuelConstant = 0.02;
        this.burningFuelMobile = 0.04;
        this.velocity = 15;
    }

    @Override
    public double generateRandomSpeed() {
        int minSpeed = maxSpeed - speedVariation;
        int maXSpeed = maxSpeed + speedVariation;
        return minSpeed + Math.random() * (maXSpeed - minSpeed);
    }
}
