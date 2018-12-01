package Java.main;

import static java.util.Arrays.stream;

public class OddOrEven {

    public static String oddOrEven(int[] array){

        int sum= 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        if(sum % 2 == 0)
            return "even";
        else
            return "odd";

    }

    //best practice
    static String oddOrEven2(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    //another good solution
    public static String oddOrEven3 (int[] array) {
        int sum = 0;
        for (int n : array){
            sum += n;
        }
        return sum%2==0 ? "even" : "odd";
    }
}
