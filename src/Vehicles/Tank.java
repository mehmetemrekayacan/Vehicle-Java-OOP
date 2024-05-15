package Vehicles;
import Class.MainFunction;
import VehiclesClass.LandVehicle;
public class Tank extends LandVehicle {

    public Tank() {
        MainFunction.count++;
        this.gasoline = 1500;
        this.maxSpeed = 60;
        this.speedVariation = 5;
        this.vehicleName = "Tank";
        this.burningFuelConstant = 0.8;
        this.burningFuelMobile = 1.2;
        this.velocity = 10;
    }

    @Override
    public double generateRandomSpeed() {
        int minSpeed = maxSpeed - speedVariation;
        int maXSpeed = maxSpeed + speedVariation;
        return minSpeed + Math.random() * (maXSpeed - minSpeed);
    }
}
