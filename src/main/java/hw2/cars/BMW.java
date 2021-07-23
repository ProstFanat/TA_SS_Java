package hw2.cars;

public class BMW extends Car {
    public BMW(String brand, String model, int maxSpeed) {
        super(brand, model, maxSpeed);
    }

    public String getModel() {
        this.model = "M5";
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        this.brand = "BMW";
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        this.maxSpeed = 320;
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
