package Java;

import Java.main.*;

public class Main {

    public static void main(String[] args){

        char[] array = {'a', 'c', 'd', 'e'};
        int[] numbers = {12, 7, 19, 21, 120};
        int x = -12;
        int y = 12;
        Boolean[] sheeps = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println(FindTheMissingLetter.findMissingLetter(array));
        System.out.println(FindAverage.find_average(numbers));
        System.out.println(ReturnNegative.makeNegative(x));
        System.out.println(ReturnNegative.makeNegative(y));
        System.out.println(CountingSheep.countSheep(sheeps));

        char a = 'a';
        char z = 'z';
        char a2 = 'A';
        char z2 = 'Z';
        int i = 65+25;
        System.out.println((char) i);

        ReversedStrings.solution("world");
    }
}
