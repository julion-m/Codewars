package Java.main;

public class Square {

    public static boolean isSquare(int n) {

        double m = (double) n;
        boolean check = false;

        if(n < 0)
            check = false;
        else if (n == 0)
            check = true;
        else{
            Math.sqrt(m);
            if(m % Math.sqrt(m) == 0)
                check = true;
        }
        return check;
    }

    //best practice
    public static boolean isSquare2(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
