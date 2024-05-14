package VehiclesClass;

import Class.Vehicle;

public class LandVehicle extends Vehicle {

    protected int passengerCount;
    protected int wheelCount;
    protected int maxSpeed;
    protected int speedDeviation;
    protected String vehicleName;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public void accelerate(double increase) {
        super.endGasoline(increase);
        if ((maxSpeed - speedDeviation) <= speed && speed <= (maxSpeed + speedDeviation)) {
            double newSpeed = generateRandomSpeed();
            gasoline -= 0.05 * Math.abs(speed - newSpeed);
            this.speed = newSpeed;
        } else {
            speed += increase;
            gasoline -= 0.05 * increase;
        }
        gasoline -= 0.01 * speed;
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
        gasoline -= 0.01 * speed;
    }

}
