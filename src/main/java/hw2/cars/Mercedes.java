package hw2.cars;

public class Mercedes extends Car {
    public Mercedes(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public String getModel() {
        this.model = "e63";
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        this.brand = "Mercedes";
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        this.maxSpeed = 300;
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
