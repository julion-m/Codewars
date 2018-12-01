package Java.main;

public class Factorial {

    //recursive
    public int factorial(int n){

        if(n < 0 || n > 12)
            throw new IllegalArgumentException("input is to large or to small.");

        int factorial = 1;
        if(n == 0 )
            return factorial * 1;

        return n * factorial(n-1);
    }
}
