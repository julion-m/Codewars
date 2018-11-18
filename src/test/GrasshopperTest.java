package test;

import main.Grasshopper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperTest {

    @Test
    public void test1(){
        assertEquals("The sum of 1-3 is 6", 6, Grasshopper.summation(3));
        assertEquals("The sum of 1-8 is 36", 36, Grasshopper.summation(8));
    }

    @Test
    public void test2(){
        assertEquals("The sum of 0 is 0", 0, Grasshopper.summation(0));
    }
}
