import java.util.Scanner;

import Class.MainFunction;
import Class.VehicleType;
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
            boolean validInput = false;
            int vehicleType = 0;
            do {
                System.out.println("What type of vehicle do you want to use?");
                System.out.println("1. Land Vehicle\n2. Air Vehicle\n3. Water Vehicle");

                if (input.hasNextInt()) {
                    vehicleType = input.nextInt();
                    if (vehicleType >= 1 && vehicleType <= 3) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please select a valid option (1-3).");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();
                }
            } while (!validInput);

            switch (vehicleType) {
                case 1:
                    startJourney(VehicleType.LAND_VEHICLE, mainFunction);
                    break;
                case 2:
                    startJourney(VehicleType.AIR_VEHICLE, mainFunction);
                    break;
                case 3:
                    startJourney(VehicleType.WATER_VEHICLE, mainFunction);
                    break;
                default:
                    System.out.println("Unexpected error occurred.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            input.close();
        }
    }

    private static void startJourney(VehicleType vehicleType, MainFunction mainFunction) throws InterruptedException {
        boolean validInput = false;
        int vehicleSubType = 0;

        switch (vehicleType) {
            case LAND_VEHICLE:
                do {
                    System.out.println("Which land vehicle do you want to use?");
                    System.out.println("1. Truck\n2. Tank");

                    if (input.hasNextInt()) {
                        vehicleSubType = input.nextInt();
                        if (vehicleSubType == 1 || vehicleSubType == 2) {
                            validInput = true;
                        } else {
                            System.out.println("Invalid input. Please select a valid option (1-2).");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                } while (!validInput);

                if (vehicleSubType == 1) {
                    LandVehicle truck = new Truck();
                    mainFunction.startJourney(truck, truck.getVelocity());
                } else {
                    LandVehicle tank = new Tank();
                    mainFunction.startJourney(tank, tank.getVelocity());
                }
                break;

            case AIR_VEHICLE:
                do {
                    System.out.println("Which air vehicle do you want to use?");
                    System.out.println("1. Jet\n2. Helicopter");

                    if (input.hasNextInt()) {
                        vehicleSubType = input.nextInt();
                        if (vehicleSubType == 1 || vehicleSubType == 2) {
                            validInput = true;
                        } else {
                            System.out.println("Invalid input. Please select a valid option (1-2).");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                } while (!validInput);

                if (vehicleSubType == 1) {
                    AirVehicle jet = new Jet();
                    mainFunction.startJourney(jet, jet.getVelocity());
                } else {
                    AirVehicle helicopter = new Helicopter();
                    mainFunction.startJourney(helicopter, helicopter.getVelocity());
                }
                break;

            case WATER_VEHICLE:
                do {
                    System.out.println("Which water vehicle do you want to use?");
                    System.out.println("1. Boat");

                    if (input.hasNextInt()) {
                        vehicleSubType = input.nextInt();
                        if (vehicleSubType == 1) {
                            validInput = true;
                        } else {
                            System.out.println("Invalid input. Please select a valid option (1).");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                } while (!validInput);

                WaterVehicle boat = new Boat();
                mainFunction.startJourney(boat, boat.getVelocity());
                break;

            default:
                System.out.println("Invalid input. Please select a valid option.");
                break;
        }
    }
}
