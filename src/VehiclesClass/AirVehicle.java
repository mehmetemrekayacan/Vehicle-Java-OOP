package VehiclesClass;

import Class.Vehicle;
import Interface.Roll;

public class AirVehicle extends Vehicle implements Roll{

    @Override
    protected void accelerate(double increase) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }

    @Override
    protected void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    protected void decelerate(double decrease) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decelerate'");
    }

    @Override
    protected double generateRandomSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateRandomSpeed'");
    }

    @Override
    public void roll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'roll'");
    }

    
}
