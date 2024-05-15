package Class;

import java.util.Scanner;

import Vehicles.Jet;

public class MainFunction {
    private int functionCounter = 0;
    private Scanner input = new Scanner(System.in);
    public static int count = 0;

    public MainFunction() {
        count++;
    }

    public void startJourney(Vehicle vehicle, int pace) {
        try {
            System.out.println("Start engine (1) or leave vehicle (2):");
            int function = input.nextInt();

            if (function == 2) {
                System.out.println("Leaving vehicle...");
                Thread.sleep(1000);
                System.out.println("Left vehicle");
                printActiveClasses();
                return;
            }

            vehicle.start();

            while (true) {
                System.out.println("Enter the function: \n1. Accelerate\n2. Decelerate:");
                function = input.nextInt();
                Thread.sleep(500);

                switch (function) {
                    case 1:
                        accelerateVehicle(vehicle, pace);
                        break;
                    case 2:
                        decelerateVehicle(vehicle, pace);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }

                functionCounter++;

                if (functionCounter % 10 == 0) {
                    if (askToExit()) {
                        stopVehicle(vehicle);
                        return;
                    } else {
                        System.out.println("Continuing...");
                        Thread.sleep(1000);
                    }
                }
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupted!");
        }
    }

    private void accelerateVehicle(Vehicle vehicle, int pace) {
        vehicle.accelerate(pace);
        System.out.println("Speed: " + vehicle.getSpeed() + " km/h");
        System.out.println("Gasoline: " + vehicle.getGasoline() + " liters");
        if (vehicle instanceof Jet jet) {
            jet.up();
        }
    }

    private void decelerateVehicle(Vehicle vehicle, int pace) {
        vehicle.decelerate(pace);
        System.out.println("Speed: " + vehicle.getSpeed() + " km/h");
        System.out.println("Gasoline: " + vehicle.getGasoline() + " liters");
        if (vehicle instanceof Jet jet) {
            jet.down();
        }
    }

    private boolean askToExit() {
        System.out.println("You've been in the car for too long. Do you want to exit? (1: Yes, 2: No)");
        int yesNo = input.nextInt();
        return yesNo == 1;
    }

    private void stopVehicle(Vehicle vehicle) {
        System.out.println("Stopping vehicle...");
        try {
            Thread.sleep(1000);
            vehicle.setSpeed(0);
            System.out.println("Speed: " + vehicle.getSpeed() + " km/h");
            System.out.println("Exiting...");
            Thread.sleep(1000);
            System.out.println("Exited");
            printActiveClasses();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupted!");
        }
    }

    private void printActiveClasses() {
        System.out.println("Number of active classes used in this process: " + count);
    }
}
