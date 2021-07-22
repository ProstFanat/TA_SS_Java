package hw1;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void printFibonacciNumbers(List<Integer> fibonacciNumbers){
        System.out.println("");
        System.out.println("Fibonacci numbers: ");
        fibonacciNumbers.stream().forEach(System.out::println);
    }

    public static List<Integer> getFibonacciNumbers(int f1, int f2){
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int n = Reader.readSizeOfSetFibonacciNumbers();

        fibonacciNumbers.add(f1);
        System.out.println("f1" + fibonacciNumbers.get(0));
        fibonacciNumbers.add(f2);
        System.out.println("f2" + fibonacciNumbers.get(1));
        for (int i = 2; i < n; ++i) {
            System.out.println("teseeest");
            System.out.println("f1" + fibonacciNumbers.get(0));
            System.out.println("f2" + fibonacciNumbers.get(1));
            fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
        }
        return fibonacciNumbers;
    }

    public static int getPercentageOfOddNumbers(List<Integer> fibonacciNumbers){
        List<Integer> oddNumbersList = new ArrayList<>();

        for (int i = 0; i < fibonacciNumbers.size(); i++){
            if( (fibonacciNumbers.get(i) % 2) == 0 ){
                oddNumbersList.add(fibonacciNumbers.get(i));
            }
        }
        float result = (float) oddNumbersList.size() / fibonacciNumbers.size() * 100;
        return (int) result;
    }

    public static int getPercentageOfEvenNumbers(List<Integer> fibonacciNumbers){
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int i = 0; i < fibonacciNumbers.size(); i++){
            if(!((fibonacciNumbers.get(i) % 2) == 0)){
                evenNumbersList.add(fibonacciNumbers.get(i));
            }
        }
        float result = (float) evenNumbersList.size() / fibonacciNumbers.size() * 100;
        return (int) result;
    }

}
