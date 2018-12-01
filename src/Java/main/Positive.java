package Java.main;

import java.util.Arrays;

public class Positive {

    //my solution
    public static int sum(int[] arr){

        int sum = 0;

        if(arr == null)
            return 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    //best practice
    public static int sum2(int[] arr){
         return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    //another good option
    public static int sum3(int[] arr){
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }

}