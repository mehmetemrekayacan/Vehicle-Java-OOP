package VehiclesClass;

import Class.Vehicle;
import Interface.Roll;

public class AirVehicle extends Vehicle implements Roll {
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

    public void up() {

        if (getSpeed() > 1000) {
            System.out.println("You will die !");
        } else if (getSpeed() > 900) {
            System.out.println("Rolling at the speed of really really danger...");
        } else if (getSpeed() > 800) {
            System.out.println("Rolling at the speed of really danger...");
        } else if (getSpeed() > 700) {
            System.out.println("Rolling at the speed of danger...");
        } else if (getSpeed() > 600) {
            System.out.println("Rolling extremely fast...");
        } else if (getSpeed() > 500) {
            System.out.println("Rolling very fast...");
        } else if (getSpeed() > 400) {
            System.out.println("Rolling fast...");
        } else if (getSpeed() > 340) {
            System.out.println("You are higher than the sound speed.");
            System.out.println("Rolling...");
        }

    }

    public void down() {
        if (getSpeed()>=300 && getSpeed() < 340) {
            System.out.println("You are lower than the sound speed.");
            System.out.println("No Rolling...");
        } else if (getSpeed() < 400) {
            System.out.println("Rolling slow...");
        } else if (getSpeed() < 500) {
            System.out.println("Rolling little slow...");
        } else if (getSpeed() < 600) {
            System.out.println("Rolling no slow...");
        } else if (getSpeed() < 700) {
            System.out.println("Rolling at the speed of danger...");
        } else if (getSpeed() < 800) {
            System.out.println("Rolling at the speed of really danger...");
        } else if (getSpeed() < 900) {
            System.out.println("Rolling at the speed of really really danger...");
        } else if (getSpeed() < 1000) {
            System.out.println("You will die !");
        }
    }
}
