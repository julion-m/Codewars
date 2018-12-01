package Java.test;

import Java.main.AgeDiff;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeDiffTest {

    AgeDiff age = new AgeDiff();

    @Test
    public void testAge() {

        assertEquals("You are 4 years old.", age.calculateAge(2012, 2016));
        assertEquals("You are 27 years old.", age.calculateAge(1989, 2016));
        assertEquals("You are 90 years old.", age.calculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", age.calculateAge(2000, 1990));
        assertEquals("You were born this very year!", age.calculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", age.calculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", age.calculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", age.calculateAge(2010, 1500));
        assertEquals("You are 1 year old.", age.calculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", age.calculateAge(2000, 1999));

    }
}
