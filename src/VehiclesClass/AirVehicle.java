package VehiclesClass;

import Class.MainFunction;
import Class.Vehicle;

public class AirVehicle extends Vehicle{
    protected int maxSpeed;
    protected int speedDeviation;
    protected String vehicleName;
    protected double burningFuelConstant;
    protected double burningFuelMobile;

    public AirVehicle() {
        MainFunction.count++;
    }

    @Override
    public void accelerate(double increase) {
        super.endGasoline(increase);
        if ((maxSpeed - speedDeviation) <= speed && speed <= (maxSpeed + speedDeviation)) {
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
    public double generateRandomSpeed() {
        return random.nextInt((int) ((maxSpeed + speedDeviation) - (maxSpeed - speedDeviation)))
                + (maxSpeed - speedDeviation);
    }

    @Override
    public void start() {
        System.out.println(vehicleName + " started.");
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
    
}
