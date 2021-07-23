package hw2;


import hw2.cars.BMW;
import hw2.cars.CreateCar;
import java.util.Arrays;

public class ConsoleMenu {

    CreateCar createCar = new CreateCar();

    public ConsoleMenu(){

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

    }

    public static void show(){
        System.out.println(Arrays.toString(consoleMenu.values()));
    }

    public void sortCars(){

    }


}
