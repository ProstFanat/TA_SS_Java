package hw1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reader {

    public static List<Integer> readInterval(){
            Scanner in = new Scanner(System.in);
            List<Integer> interval = new ArrayList<>();
            System.out.println("Enter the start value for the interval: ");
            interval.add(in.nextInt());
            System.out.println("Enter the ending value of the interval: ");
            interval.add(in.nextInt());
            interval = interval.stream().sorted().collect(Collectors.toList());
            System.out.println(" ");
            return interval;
    }

    public static int readSizeOfSetFibonacciNumbers(){
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the size of set Fibonacci numbers: ");
        int size = in.nextInt();
        return size;
    }
}
