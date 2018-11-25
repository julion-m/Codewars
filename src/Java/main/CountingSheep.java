package main;

import java.util.Arrays;

public class CountingSheep {

    public static int countSheep(Boolean[] arraysOfSheeps){
        int n = 0;

        try {

            for(int i = 0; i < arraysOfSheeps.length; i++){
                if(arraysOfSheeps[i])
                    n++;
            }
        }
        catch (NullPointerException e){
            return n;
        }
        return n;
    }

    //other method not mine
    public int countSheeps2(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(Boolean::booleanValue).count();
    }
}
