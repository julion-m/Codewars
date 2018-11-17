import java.util.Arrays;

public class FindAverage {

    //this method goes through the array adds all the numbers and
    // returns the average
    public static double find_average(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        sum /= array.length;
        return sum;
    }

    //other method
    public static double find_average2(int[] array){
        return Arrays.stream(array).average().orElse(0);
    }
}
