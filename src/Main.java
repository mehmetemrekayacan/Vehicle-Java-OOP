import java.util.Scanner;

import Vehicles.Tank;
import Vehicles.Truck;
import VehiclesClass.LandVehicle;

public class Main {
    static int vehicles;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        LandVehicle landVehicle = new LandVehicle(0,0);
        System.out.println("Enter the number of vehicles: \n1. Truck\n2. Tank");
        vehicles = input.nextInt();
        if (vehicles == 1) {
            Truck truck = new Truck(100, 2);
            landVehicle.Go(truck);
        } else if (vehicles == 2) {
            Tank tank = new Tank(100, 3);
            landVehicle.Go(tank);
        } else {
            System.out.println("Invalid Input");
        }
    }  
}
