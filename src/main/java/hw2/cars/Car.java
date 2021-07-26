package hw2.cars;

import hw2.intefaces.Alarm;
import hw2.intefaces.Vehicle;
import hw2.resources.Constants;


public class Car implements Alarm, Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected String model;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.maxSpeed = Math.max(speed, 0);
        this.model = model;
        Constants.cars.add(this);
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
