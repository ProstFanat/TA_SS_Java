package hw1;

import java.util.List;

public class BiggestNumbers {
    public static int getTheBiggestOddNumber(List<Integer> interval){
        for (int i = interval.get(1); i >= interval.get(0); i--){
            if( (i % 2) == 0 ){
                return i;
            }
        }
        return 0;
    }

    public static int getTheBiggestEvenNumber(List<Integer> interval){
        for (int i = interval.get(1); i >= interval.get(0); i--){
            if( !((i % 2) == 0) ){
                return i;
            }
        }
        return 0;
    }
}
