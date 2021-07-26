package hw2;


import hw2.cars.BMW;
import hw2.cars.Car;
import hw2.cars.CreateCar;
import hw2.cars.Mercedes;
import hw2.resources.Constants;
import java.util.Arrays;
import java.util.Comparator;

public class ConsoleMenu {

    CreateCar createCar = new CreateCar();
    BMW bmw = new BMW("BMW", "M5", 320);
    Mercedes mercedes = new Mercedes("Mercedes", "e63", 300);
    Reader reader = new Reader();

    public void run(){
        boolean exit = false;
        do {
            String action = reader.getAction();
            if (action.equals("add")) {
                add();
            } else if (action.equals("remove")) {
                remove();
            } else if (action.equals("show")) {
                showCarsList();
            } else if (action.equals("sortCars")) {
                sortCars();
            } else if (action.equals("exit")) {
                exit = true;
            }
        } while (!exit);
    }

    public enum consoleMenu {
        add,
        remove,
        show,
        sortCars,
        exit
    }

    public void add(){
        createCar.createCar();
    }

    public void remove(){
        String[] car = reader.getCar();
        for (int i = 0; i < Constants.cars.size(); i++){
            if(Constants.cars.get(i).getBrand().equalsIgnoreCase(car[0])
              && Constants.cars.get(i).getModel().equalsIgnoreCase(car[1]))
            {
                Constants.cars.remove(i);
            }
        }

    }

    public static void showActionsList(){
        System.out.println(Arrays.toString(consoleMenu.values()));
    }

    public static void showCarsList(){
        for (Car car : Constants.cars){
            System.out.println("Brand : " + car.getBrand() + " -> Model : " + car.getModel());
        }
    }

    public void sortCars(){
        System.out.println("hello");
        Constants.cars.sort((Comparator.comparing(Car::getBrand)));
    }


}
