package hw1;

import java.util.List;

public class SumPrinter {

    public static void printSumOfOddNumbers(List<Integer> interval){
        int sumOfOddNumbers = 0;
        for (int i = interval.get(0); i <= interval.get(1); i++){
            if( (i % 2) == 0 ){
                sumOfOddNumbers += i;
            }
        }
        System.out.println("Sum of odd Numbers: " + sumOfOddNumbers);
    }

    public static void printSumOfEvenNumbers(List<Integer> interval){
        int sumOffEvenNumbers = 0;
        for (int i = interval.get(0); i <= interval.get(1); i++){
            if( !((i % 2) == 0) ){
                sumOffEvenNumbers += i;
            }
        }
        System.out.println("Sum of even Numbers: " + sumOffEvenNumbers);
    }

}
