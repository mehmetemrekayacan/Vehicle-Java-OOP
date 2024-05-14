package VehiclesClass;

import Class.Vehicle;
import Interface.Roll;

public class AirVehicle extends Vehicle implements Roll{
    protected int maxSpeed;
    protected int speedDeviation;
    protected String vehicleName;
    protected double burningFuelConstant;
    protected double burningFuelMobile;

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

    @Override
    public void roll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'roll'");
    }

    
}
