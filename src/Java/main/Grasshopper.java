package Java.main;

public class Grasshopper {

    //adds positive integers from a range from 0 - n
    public static int summation(int n){
        int sum = 0;
        int x = 0;
        for(int i = 0; i <= n; i++){
            sum += x;
            x++;
        }
        return sum;
    }
}
