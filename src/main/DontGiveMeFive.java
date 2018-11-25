package main;

import java.util.stream.IntStream;

public class DontGiveMeFive {

    public static int dontGiveMeFive(int start, int end){
        int result = 0;

        return IntStream.range(start, end).filter(n -> (n % 5 != 0) && (n % 10 != 0)).sum();
    }
}
