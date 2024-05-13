package VehiclesClass;

import Class.Vehicle;

public class LandVehicle extends Vehicle {
    
    protected int passengerCount;
    protected int wheelCount;
    protected int maxSpeed;
    protected int speedDeviation;
    protected String vehicleName;
    private int function;
    private int functionCounter = 0;
    private int yesNo;
    

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public LandVehicle(double gasoline, int passengerCount) {
        super(gasoline);
        this.passengerCount = passengerCount;
    }

    @Override
    public void accelerate(double increase) {
        endGasoline(increase);
        if ((maxSpeed - speedDeviation) <= speed && speed <= (maxSpeed + speedDeviation)) {
            double newSpeed = generateRandomSpeed();
            gasoline -= 0.05 * Math.abs(speed - newSpeed);
            this.speed = newSpeed;
        } else {
            speed += increase;
            gasoline -= 0.05 * increase;
        }
        gasoline -= 0.01 * speed;
    }

    @Override
    public double generateRandomSpeed() {
        return random.nextInt((int) ((maxSpeed + speedDeviation) - (maxSpeed - speedDeviation)))
                + (maxSpeed - speedDeviation);
    }

    @Override
    public void start() {
        System.out.println(vehicleName + " started.");
    }

    @Override
    public void decelerate(double decrease) {
        endGasoline(decrease);
        if (speed - decrease < 0) {
            System.out.println("Vehicle stopped.");
            System.exit(0);
        } else {
            speed -= decrease;
        }
        gasoline -= 0.01 * speed;
    }

    public void endGasoline(double goZero) {
        if (gasoline <= 0) {
            speed -= goZero;
            System.out.println("Out of gasoline.");
            System.exit(0);
        }
    }

    public void Go(VehiclesClass.LandVehicle name) throws InterruptedException {
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
