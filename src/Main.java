import java.util.Scanner;

import Vehicles.Tank;
import Vehicles.Truck;

public class Main {
    static int vehicles;
    static int function;
    static int functionCounter = 0;
    static int yesNo;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the number of vehicles: \n1. Truck\n2. Tank");
        vehicles = input.nextInt();
        if (vehicles == 1) {
            Truck truck = new Truck(100, 2);
            Go(truck);
        } else if (vehicles == 2) {
            Tank tank = new Tank(100, 3);
            Go(tank);
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void Go(VehiclesClass.LandVehicle name) throws InterruptedException {
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
                name.accelerate(10);
                System.out.println("Speed: " + name.getSpeed() + " km/h");
                System.out.println("Gasoline: " + name.getGasoline() + " liters");
                
            } else if (function == 2) {
                name.decelerate(10);
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
}
