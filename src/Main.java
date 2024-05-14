import java.util.Scanner;

import Class.Vehicle;
import Vehicles.Tank;
import Vehicles.Truck;
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
                LandVehicle truck = new Truck(100, 2);
                landVehicle.Go(truck);
            } else if (vehicles == 2) {
                LandVehicle tank = new Tank(100, 3);
                landVehicle.Go(tank);
            } else {
                System.out.println("Invalid Input");
            }
        } else if (typeVehicle == 2) {
            Vehicle airVehicle = new AirVehicle();
        } else if (typeVehicle == 3) {
            Vehicle waterVehicle = new WaterVehicle();
        } else {
            System.out.println("Invalid Input");
        }

    }
}
