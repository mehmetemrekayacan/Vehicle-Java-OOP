package Vehicles;

import Class.MainFunction;
import Interface.Roll;
import VehiclesClass.AirVehicle;

public class Jet extends AirVehicle implements Roll {
    public Jet() {
        MainFunction.count++;
        this.gasoline = 3200;
        this.maxSpeed = 700;
        this.speedVariation = 50;
        this.vehicleName = "Jet";
        this.burningFuelConstant = 0.1;
        this.burningFuelMobile = 0.2;
        this.velocity = 100;
    }

    @Override
    public void up() {
        if (getSpeed() > 700) {
            System.out.println("You will die !");
        } else if (getSpeed() > 600) {
            System.out.println("Rolling at the speed of really really danger...");
        } else if (getSpeed() > 500) {
            System.out.println("Rolling at the speed of really danger...");
        } else if (getSpeed() > 400) {
            System.out.println("Rolling at the speed of danger...");
        } else if (getSpeed() > 340) {
            System.out.println("Rolling extremely fast...");
        } else if (getSpeed() > 300) {
            System.out.println("Rolling very fast...");
        } else {
            System.out.println("Rolling fast...");
        }
    }

    @Override
    public void down() {
        if (getSpeed() < 300) {
            System.out.println("You will die !");
        } else if (getSpeed() < 340) {
            System.out.println("Rolling extremely slow...");
        } else if (getSpeed() < 400) {
            System.out.println("Rolling very slow...");
        } else if (getSpeed() < 500) {
            System.out.println("Rolling slow...");
        } else if (getSpeed() < 600) {
            System.out.println("Rolling at the speed of danger...");
        } else if (getSpeed() < 700) {
            System.out.println("Rolling at the speed of really danger...");
        } else {
            System.out.println("Rolling at the speed of really really danger...");
        }
    }

    @Override
    public double generateRandomSpeed() {
        int minSpeed = maxSpeed - speedVariation;
        int maXSpeed = maxSpeed + speedVariation;
        return minSpeed + Math.random() * (maXSpeed - minSpeed);
    }

}
