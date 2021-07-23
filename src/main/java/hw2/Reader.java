package hw2;

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
