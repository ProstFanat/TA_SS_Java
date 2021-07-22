package hw1;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void printFibonacciNumbers(List<Integer> fibonacciNumbers){
        System.out.println("");
        System.out.println("Fibonacci numbers: ");
        fibonacciNumbers.forEach(System.out::println);
    }

    public static List<Integer> getFibonacciNumbers(int f1, int f2){
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int n = Reader.readSizeOfSetFibonacciNumbers();

        fibonacciNumbers.add(f1);
        fibonacciNumbers.add(f2);
        for (int i = 2; i < n; ++i) {
            fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
        }
        return fibonacciNumbers;
    }

    public static int getPercentageOfOddNumbers(List<Integer> fibonacciNumbers){
        List<Integer> oddNumbersList = new ArrayList<>();

        for (Integer fibonacciNumber : fibonacciNumbers) {
            if ((fibonacciNumber % 2) == 0) {
                oddNumbersList.add(fibonacciNumber);
            }
        }
        float result = (float) oddNumbersList.size() / fibonacciNumbers.size() * 100;
        return (int) result;
    }

    public static int getPercentageOfEvenNumbers(List<Integer> fibonacciNumbers){
        List<Integer> evenNumbersList = new ArrayList<>();
        for (Integer fibonacciNumber : fibonacciNumbers) {
            if (!((fibonacciNumber % 2) == 0)) {
                evenNumbersList.add(fibonacciNumber);
            }
        }
        float result = (float) evenNumbersList.size() / fibonacciNumbers.size() * 100;
        return (int) result;
    }

}
