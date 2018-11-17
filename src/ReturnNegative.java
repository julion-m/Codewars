public class ReturnNegative {

    //makes every int negative
    public static int makeNegative(final int x){
        int y = 0;
        if(x > 0){
            y = -x;
        }
        else
            y = x;
        return y;
    }
}
