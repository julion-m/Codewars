package Java.test;

import Java.main.DontGiveMeFive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DontGiveMeFiveTest {
        @Test
        public void exampleTests() {
            assertEquals(8, DontGiveMeFive.dontGiveMeFive(1,9));
            assertEquals(12, DontGiveMeFive.dontGiveMeFive(4,17));
        }
    }
