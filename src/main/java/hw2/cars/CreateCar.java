package hw2.cars;

import hw2.Reader;

public class CreateCar {
    Reader reader = new Reader();

    public Car createCar(){
        String brand = reader.getCarBrand();
        String model = reader.getCarModel();
        int maxSpeed = reader.getCarMaxSpeed();

        Car car = new Car(brand, model, maxSpeed);

        return car;
    }
}
