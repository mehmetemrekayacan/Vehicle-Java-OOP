package Class;

public abstract class Vehicle {
    protected double gasoline;
    protected double speed;
    protected int velocity;

    public Vehicle() {
        MainFunction.count++;
        this.speed = 0;
    }

    public double getGasoline() {
        if (gasoline < 0) {
            return 0;
        }
        return gasoline;
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

    protected abstract void accelerate(double increase);

    protected abstract void start();

    protected abstract void decelerate(double decrease);

    protected abstract double generateRandomSpeed();

    protected void endGasoline(double goZero) {
        if (gasoline <= 0) {
            speed -= goZero;
            System.out.println("Out of gasoline.");
            System.exit(0);
        }
    }
}