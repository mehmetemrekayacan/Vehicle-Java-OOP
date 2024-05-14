package Class;

import java.util.Random;
import java.util.Scanner;

public abstract class Vehicle {
    protected double gasoline;
    protected double speed;
    protected int velocity;
    private int function;
    private int functionCounter = 0;
    private int yesNo;
    public Random random = new Random();
    public Scanner input = new Scanner(System.in);

    public float getGasoline() {
        if (gasoline < 0) {
            return 0;
        }
        return (float) gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public int getSpeed() {
        if (speed < 0) {
            return 0;
        }
        return (int) speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Vehicle() {
        this.speed = 0;
    }

    public void endGasoline(double goZero) {
        if (gasoline <= 0) {
            speed -= goZero;
            System.out.println("Out of gasoline.");
            System.exit(0);
        }
    }

    public void Go(VehiclesClass.LandVehicle name) throws InterruptedException {
        System.out.println("Star engine for enter 1\nLeave vehicle for 2:");
        function = input.nextInt();
        if (function == 2) {
            System.out.println("Leaving vehicle...");
            Thread.sleep(1000);
            System.out.println("Left vehicle");
            System.exit(0);
        }
        name.start();
        while (function != 3) {
            System.out.println("Enter the function: \n1. Accelerate\n2. Decelerate:");
            function = input.nextInt();
            Thread.sleep(500);
            if (function == 1) {
                name.accelerate(velocity);
                System.out.println("Speed: " + name.getSpeed() + " km/h");
                System.out.println("Gasoline: " + name.getGasoline() + " liters");

            } else if (function == 2) {
                name.decelerate(velocity);
                System.out.println("Speed: " + name.getSpeed() + " km/h");
                System.out.println("Gasoline: " + name.getGasoline() + " liters");

            } else {
                System.out.println("Invalid Input");
            }
            functionCounter++;
            if (functionCounter % 10 == 0) {
                System.out.println("You've been in the car for too long. Do you want to exit? (1: Yes, 2: No)");
                yesNo = input.nextInt();
                if (yesNo == 1) {
                    System.out.println("Stopping vehicle...");
                    Thread.sleep(1000);
                    name.setSpeed(0);
                    System.out.println("Speed: " + name.getSpeed() + " km/h");
                    System.out.println("Exiting...");
                    Thread.sleep(1000);
                    System.out.println("Exited");
                    System.exit(0);
                } else {
                    System.out.println("Continuing...");
                    Thread.sleep(1000);
                }
            }
        }
    }

    protected abstract void accelerate(double increase);

    protected abstract void start();

    protected abstract void decelerate(double decrease);

    protected abstract double generateRandomSpeed();
}
