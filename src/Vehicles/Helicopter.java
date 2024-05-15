package Vehicles;

import Class.MainFunction;
import VehiclesClass.AirVehicle;

public class Helicopter extends AirVehicle{
    public Helicopter() {
        MainFunction.count++;
        this.gasoline = 2000;
        this.maxSpeed = 300;
        this.speedVariation = 25;
        this.vehicleName = "Helicopter";
        this.burningFuelConstant = 0.5;
        this.burningFuelMobile = 0.8;
        this.velocity = 50;
    }

    @Override
    public double generateRandomSpeed() {
        int minSpeed = maxSpeed - speedVariation;
        int maXSpeed = maxSpeed + speedVariation;
        return minSpeed + Math.random() * (maXSpeed - minSpeed);
    }
    
}
