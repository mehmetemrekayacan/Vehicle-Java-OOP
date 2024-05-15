package Vehicles;

import Class.MainFunction;
import VehiclesClass.WaterVehicle;

public class Boat extends WaterVehicle{
    public Boat() {
        MainFunction.count++;
        this.gasoline = 100;
        this.maxSpeed = 30;
        this.speedDeviation = 5;
        this.vehicleName = "Bot";
        this.burningFuelConstant = 0.1;
        this.burningFuelMobile = 0.2;
        this.velocity=5;
    }
    
}
