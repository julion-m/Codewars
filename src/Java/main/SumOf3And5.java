package Java.main;

import java.util.stream.IntStream;

public class SumOf3And5 {

    //mine
    public int solution(int number) {
        int sum = 0;
        for(int i = 0; i < number; i++){
            if(i % 3 == 0)
                sum += i;
            if(i % 5 == 0 && i % 3 != 0)
                sum += i;
        }
        return sum;
    }

    //this one is easier
    public int solution2(int number) {
        int sum=0;

        for (int i=0; i < number; i++){
            if (i%3==0 || i%5==0){sum+=i;}
        }
        return sum;
    }

    //works with intStream
    public int solution3(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
