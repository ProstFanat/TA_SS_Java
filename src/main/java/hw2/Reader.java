package hw2;

import hw2.cars.Car;
import hw2.resources.Constants;
import java.util.Scanner;

public class Reader {

    public String getCarBrand(){
        System.out.println("Input Brand of your car: ");
        return getString();
    }

    public String getCarModel(){
        System.out.println("Input Model of your car: ");
        return getString();
    }

    public int getCarMaxSpeed(){
        System.out.println("Input Max Speed of your car: ");
        return inputIntegerValue();
    }

    public String getAction(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose one Action: ");
        ConsoleMenu.showActionsList();
        String result;
        boolean isRight = false;
        do {
            result = in.nextLine();
            try {
                ConsoleMenu.consoleMenu.valueOf(result);
                isRight = true;
            } catch (Exception e){
                System.out.println("enter one of the given values : ");
            }
        } while (!isRight);
        return result;
    }

    public String[] getCar() {
        Scanner in = new Scanner(System.in);
        boolean isRight = false;
        String brand;
        String model;
        do {
            System.out.println("Brand: ");
            brand = in.nextLine();
            System.out.println("Model: ");
            model = in.nextLine();
            for (Car car : Constants.cars) {
                if (car.getBrand().equalsIgnoreCase(brand) && car.getModel().equalsIgnoreCase(model)) {
                    isRight = true;
                }
            }
            if(!isRight){
                System.out.println("Enter one car from exist: ");
                ConsoleMenu.showCarsList();
            }
        } while (!isRight);
        System.out.println("Car was Deleted!");
        return new String[]{brand, model};
    }

    private String getString(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    static int inputIntegerValue(){
        Scanner in = new Scanner(System.in);
        boolean isRight = false;
        int result = 0;
        do {
            try {
                String inputValue = in.nextLine();
                result = Integer.parseInt(inputValue);
                isRight = true;
            } catch (Exception e){
                System.out.println("Input Integer Value!");
            }
        } while (!isRight);
        return result;
    }


}
