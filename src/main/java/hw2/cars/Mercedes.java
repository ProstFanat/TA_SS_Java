package hw2.cars;

public class Mercedes extends Car {
    public Mercedes(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
