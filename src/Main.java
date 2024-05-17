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
            System.out.println("What type of vehicle do you want to use?");
            System.out.println("1. Land Vehicle\n2. Air Vehicle\n3. Water Vehicle");
            int vehicleType = input.nextInt();
            VehicleType selectedType = null;

            switch (vehicleType) {
                case 1:
                    selectedType = VehicleType.LAND_VEHICLE;
                    startJourney(selectedType, mainFunction);
                    break;
                case 2:
                    selectedType = VehicleType.AIR_VEHICLE;
                    startJourney(selectedType, mainFunction);
                    break;
                case 3:
                    selectedType = VehicleType.WATER_VEHICLE;
                    startJourney(selectedType, mainFunction);
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

    private static void startJourney(VehicleType vehicleType, MainFunction mainFunction) throws InterruptedException {
        switch (vehicleType) {
            case LAND_VEHICLE:
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
                break;

            case AIR_VEHICLE:
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
                break;

            case WATER_VEHICLE:
                System.out.println("Which water vehicle do you want to use?");
                System.out.println("1. Boat");
                int waterVehicleType = input.nextInt();

                if (waterVehicleType == 1) {
                    WaterVehicle boat = new Boat();
                    mainFunction.startJourney(boat, boat.getVelocity());
                } else {
                    System.out.println("Invalid input. Please select a valid option.");
                }
                break;

            default:
                System.out.println("Invalid input. Please select a valid option.");
                break;
        }
    }
}
