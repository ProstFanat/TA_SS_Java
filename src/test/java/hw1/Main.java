package hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> interval = Reader.readInterval();

        SumPrinter.printSumOfOddNumbers(interval);
        SumPrinter.printSumOfEvenNumbers(interval);

        int biggestOddNumber = BiggestNumbers.getTheBiggestOddNumber(interval);
        int biggestEvenNumber = BiggestNumbers.getTheBiggestEvenNumber(interval);

        List<Integer> fibonacciNumbers = Fibonacci.getFibonacciNumbers(biggestOddNumber, biggestEvenNumber);
        Fibonacci.printFibonacciNumbers(fibonacciNumbers);

        System.out.println("");
        System.out.println("Percentage of odd Fibonacci numbers = " + Fibonacci.getPercentageOfOddNumbers(fibonacciNumbers) + "%");
        System.out.println("Percentage of even Fibonacci numbers = " + Fibonacci.getPercentageOfEvenNumbers(fibonacciNumbers) + "%");
    }
}
