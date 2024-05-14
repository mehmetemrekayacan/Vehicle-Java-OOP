import java.util.Scanner;

import Class.Vehicle;
import Vehicles.Tank;
import Vehicles.Truck;
import Vehicles.Plane;
import Vehicles.Boat;
import VehiclesClass.LandVehicle;
import VehiclesClass.AirVehicle;
import VehiclesClass.WaterVehicle;

public class Main {
    static int vehicles;
    static int typeVehicle;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("What are you going to do?\n1. Land Vehicle\n2. Air Vehicle\n3. Water Vehicle");
        typeVehicle = input.nextInt();
        if (typeVehicle == 1) {
            Vehicle landVehicle = new LandVehicle();
            System.out.println("Enter the number of vehicles: \n1. Truck\n2. Tank");
            vehicles = input.nextInt();
            if (vehicles == 1) {
                LandVehicle truck = new Truck();
                landVehicle.Go(truck,truck.getVelocity());
            } else if (vehicles == 2) {
                LandVehicle tank = new Tank();
                landVehicle.Go(tank,tank.getVelocity());
            } else {
                System.out.println("Invalid Input");
            }
        } else if (typeVehicle == 2) {
            Vehicle airVehicle = new AirVehicle();
            System.out.println("Enter the number of vehicles: \n1. Truck\n2. Tank");
            vehicles = input.nextInt();
            if (vehicles == 1) {
                AirVehicle plane = new Plane();
                airVehicle.Go(plane,plane.getVelocity());
            }else {
                System.out.println("Invalid Input");
            }
        } else if (typeVehicle == 3) {
            Vehicle waterVehicle = new WaterVehicle();
            System.out.println("Enter the number of vehicles: \n1. Truck\n2. Tank");
            vehicles = input.nextInt();
            if (vehicles == 1) {
                WaterVehicle boat = new Boat();
                waterVehicle.Go(boat,boat.getVelocity());
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
}
