package Vehicles;

import VehiclesClass.AirVehicle;

public class Plane extends AirVehicle{
    public Plane() {
        this.gasoline = 1000;
        this.maxSpeed = 1000;
        this.speedDeviation = 100;
        this.vehicleName = "Plane";
        this.burningFuelConstant = 0.1;
        this.burningFuelMobile = 0.2;
        this.velocity=100;
    }
    
}
