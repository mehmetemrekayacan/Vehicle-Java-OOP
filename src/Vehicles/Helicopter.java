package Vehicles;

import VehiclesClass.AirVehicle;

public class Helicopter extends AirVehicle{
    public Helicopter() {
        this.gasoline = 2000;
        this.maxSpeed = 300;
        this.speedDeviation = 25;
        this.vehicleName = "Helicopter";
        this.burningFuelConstant = 0.5;
        this.burningFuelMobile = 0.8;
        this.velocity = 50;
    }
    
}
