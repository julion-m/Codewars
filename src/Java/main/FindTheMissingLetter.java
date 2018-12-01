package Java.main;

public class FindTheMissingLetter {

    //this method goes through the given array and checks if a
    //letter through this array is missing and gives the missing letter out
    //array example --> {'a', 'b', 'd', 'e'} --> 'c'
    public static char findMissingLetter(char[] array){

        char firstLetter = array[0];
        char missingLetter = 0;
        boolean stop = false;

        for(int i = 0; i<array.length && !stop; i++){
            if(firstLetter == array[i]){
                firstLetter++;
            }
            else{
                missingLetter = firstLetter;
                stop = true;
            }
        }
        return missingLetter;
    }
}
