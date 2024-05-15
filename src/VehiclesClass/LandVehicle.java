package VehiclesClass;

import java.util.Random;

import Class.MainFunction;
import Class.Vehicle;

public abstract class LandVehicle extends Vehicle {
    protected int maxSpeed;
    protected int speedVariation;
    protected String vehicleName;
    protected double burningFuelConstant;
    protected double burningFuelMobile;
    protected Random random = new Random();

    public LandVehicle() {
        super();
        MainFunction.count++;   
    }

    @Override
    public void accelerate(double increase) {
        super.endGasoline(increase);
        if ((maxSpeed - speedVariation) <= speed && speed <= (maxSpeed + speedVariation)) {
            double newSpeed = generateRandomSpeed();
            gasoline -= burningFuelMobile * Math.abs(speed - newSpeed);
            this.speed = newSpeed;
        } else {
            speed += increase;
            gasoline -= burningFuelMobile * increase;
        }
        gasoline -= burningFuelConstant * speed;
    }

    @Override
    public void decelerate(double decrease) {
        super.endGasoline(decrease);
        if (speed - decrease < 0) {
            System.out.println("Vehicle stopped.");
            System.exit(0);
        } else {
            speed -= decrease;
        }
        gasoline -= burningFuelConstant * speed;
    }

    public abstract double generateRandomSpeed();

    @Override
    public void start() {
        System.out.println(vehicleName + " started.");
    }
}