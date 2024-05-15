package Class;

import java.util.Random;
import java.util.Scanner;

import Vehicles.Jet;

public class MainFunction {
    private static int function;
    private static int functionCounter = 0;
    private static int yesNo;
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);
    public static int count;

    public MainFunction() {
        count++;
    }

    public static void Go(Vehicle name, int pace) throws InterruptedException {
        System.out.println("Star engine for enter 1\nLeave vehicle for 2:");
        function = input.nextInt();
        if (function == 2) {
            System.out.println("Leaving vehicle...");
            Thread.sleep(1000);
            System.out.println("Left vehicle");
            System.out.println("Number of active classes used in this process: " + count);
            System.exit(0);
        }
        name.start();
        while (function != 3) {
            System.out.println("Enter the function: \n1. Accelerate\n2. Decelerate:");
            function = input.nextInt();
            Thread.sleep(500);
            if (function == 1) {
                name.accelerate(pace);
                System.out.println("Speed: " + name.getSpeed() + " km/h");
                System.out.println("Gasoline: " + name.getGasoline() + " liters");
                if (name instanceof Jet jet) {
                    jet.up();
                }
            } else if (function == 2) {
                name.decelerate(pace);
                System.out.println("Speed: " + name.getSpeed() + " km/h");
                System.out.println("Gasoline: " + name.getGasoline() + " liters");
                if (name instanceof Jet jet) {
                    jet.down();
                }
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
                    System.out.println("Number of active classes used in this process: " + count);
                    System.exit(0);
                } else {
                    System.out.println("Continuing...");
                    Thread.sleep(1000);
                }
            }
        }
    }
}
