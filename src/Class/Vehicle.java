package Class;

public abstract class Vehicle {
    protected double gasoline;
    protected double speed;

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

    public Vehicle(double gasoline) {
        this.gasoline = gasoline;
        this.speed = 0;
    }

    protected abstract void accelerate(double increase);

    protected abstract void start();

    protected abstract void decelerate(double decrease);

    protected abstract double generateRandomSpeed();
}

