package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reader {

    public static List<Integer> readInterval(){
            List<Integer> interval = new ArrayList<>();
            System.out.println("Enter the start value for the interval: ");
            interval.add(inputIntegerValue());
            System.out.println("Enter the ending value of the interval: ");
            interval.add(inputIntegerValue());
            interval = interval.stream().sorted().collect(Collectors.toList());
            System.out.println(" ");
            return interval;
    }

    public static int readSizeOfSetFibonacciNumbers(){
        System.out.println("");
        System.out.println("Enter the size of set Fibonacci numbers: ");
        return inputIntegerValue();
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
