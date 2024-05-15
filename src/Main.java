import java.util.Scanner;

import static Class.MainFunction.*;
import Vehicles.Tank;
import Vehicles.Truck;
import Vehicles.Jet;
import Vehicles.Boat;
import Vehicles.Helicopter;
import VehiclesClass.LandVehicle;
import VehiclesClass.AirVehicle;
import VehiclesClass.WaterVehicle;

public class Main {
    public static int vehicles;
    public static int typeVehicle;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        count++;
        System.out.println("What are you going to do?\n1. Land Vehicle\n2. Air Vehicle\n3. Water Vehicle");
        typeVehicle = input.nextInt();
        if (typeVehicle == 1) {
            System.out.println("Enter the number of vehicles: \n1. Truck\n2. Tank");
            vehicles = input.nextInt();
            if (vehicles == 1) {
                LandVehicle truck = new Truck();
                Go(truck, truck.getVelocity());
            } else if (vehicles == 2) {
                LandVehicle tank = new Tank();
                Go(tank, tank.getVelocity());
            } else {
                System.out.println("Invalid Input");
            }
        } else if (typeVehicle == 2) {
            System.out.println("Enter the number of vehicles: \n1. Jet\n2. Helicopter");
            vehicles = input.nextInt();
            if (vehicles == 1) {
                AirVehicle jet = new Jet();
                Go(jet, jet.getVelocity());
            } else if (vehicles == 2) {
                AirVehicle helicopter = new Helicopter();
                Go(helicopter, helicopter.getVelocity());
            } else {
                System.out.println("Invalid Input");
            }
        } else if (typeVehicle == 3) {
            System.out.println("Enter the number of vehicles: \n1. Boat");
            vehicles = input.nextInt();
            if (vehicles == 1) {
                WaterVehicle boat = new Boat();
                Go(boat, boat.getVelocity());
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
}
