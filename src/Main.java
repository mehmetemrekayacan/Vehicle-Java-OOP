import java.util.Scanner;

import Class.MainFunction;

import Vehicles.Tank;
import Vehicles.Truck;
import Vehicles.Jet;
import Vehicles.Boat;
import Vehicles.Helicopter;
import VehiclesClass.LandVehicle;
import VehiclesClass.AirVehicle;
import VehiclesClass.WaterVehicle;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MainFunction mainFunction = new MainFunction();

        try {
            System.out.println("What type of vehicle do you want to use?");
            System.out.println("1. Land Vehicle\n2. Air Vehicle\n3. Water Vehicle");
            int vehicleType = input.nextInt();

            switch (vehicleType) {
                case 1:
                    startLandVehicleJourney(mainFunction);
                    break;
                case 2:
                    startAirVehicleJourney(mainFunction);
                    break;
                case 3:
                    startWaterVehicleJourney(mainFunction);
                    break;
                default:
                    System.out.println("Invalid input. Please select a valid option.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            input.close();
        }
    }

    private static void startLandVehicleJourney(MainFunction mainFunction) throws InterruptedException {
        System.out.println("Which land vehicle do you want to use?");
        System.out.println("1. Truck\n2. Tank");
        int landVehicleType = input.nextInt();

        if (landVehicleType == 1) {
            LandVehicle truck = new Truck();
            mainFunction.startJourney(truck, truck.getVelocity());
        } else if (landVehicleType == 2) {
            LandVehicle tank = new Tank();
            mainFunction.startJourney(tank, tank.getVelocity());
        } else {
            System.out.println("Invalid input. Please select a valid option.");
        }
    }

    private static void startAirVehicleJourney(MainFunction mainFunction) throws InterruptedException {
        System.out.println("Which air vehicle do you want to use?");
        System.out.println("1. Jet\n2. Helicopter");
        int airVehicleType = input.nextInt();

        if (airVehicleType == 1) {
            AirVehicle jet = new Jet();
            mainFunction.startJourney(jet, jet.getVelocity());
        } else if (airVehicleType == 2) {
            AirVehicle helicopter = new Helicopter();
            mainFunction.startJourney(helicopter, helicopter.getVelocity());
        } else {
            System.out.println("Invalid input. Please select a valid option.");
        }
    }

    private static void startWaterVehicleJourney(MainFunction mainFunction) throws InterruptedException {
        System.out.println("Which water vehicle do you want to use?");
        System.out.println("1. Boat");
        int waterVehicleType = input.nextInt();

        if (waterVehicleType == 1) {
            WaterVehicle boat = new Boat();
            mainFunction.startJourney(boat, boat.getVelocity());
        } else {
            System.out.println("Invalid input. Please select a valid option.");
        }
    }
}