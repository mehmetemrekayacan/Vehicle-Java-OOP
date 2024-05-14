package Class;

import java.util.Random;

public abstract class Vehicle {
    protected double gasoline;
    protected double speed;
    protected int velocity;
    public Random random = new Random();
    

    public float getGasoline() {
        if (gasoline < 0) {
            return 0;
        }
        return (float) gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public int getSpeed() {
        if (speed < 0) {
            return 0;
        }
        return (int) speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public Vehicle() {
        this.speed = 0;
    }

    public void endGasoline(double goZero) {
        if (gasoline <= 0) {
            speed -= goZero;
            System.out.println("Out of gasoline.");
            System.exit(0);
        }
    }

    protected abstract void accelerate(double increase);

    protected abstract void start();

    protected abstract void decelerate(double decrease);

    protected abstract double generateRandomSpeed();
}
