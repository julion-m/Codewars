package Java.test;

import Java.main.CountingSheep;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingSheepTest {

    Boolean[] array1 = {true, false, true, true, true, false, true, false, true,
                        true, true , true, false, true, false, true, true, true,
                        false, true, true, true, false, false, true};

    Boolean[] array2 = {true};

    Boolean[] array3 = null;


    @Test
    public void test(){
        assertEquals("There are 17 sheeps in total", 17, new CountingSheep().countSheep(array1));
        assertEquals("There are 1 sheeps in total", 1, new CountingSheep().countSheep(array2));
        assertEquals("There are 0 sheeps in total", 0, new CountingSheep().countSheep(array3));
    }

}
