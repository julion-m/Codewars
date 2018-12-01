package Java.test;

import Java.main.SumOf3And5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOf3And5Test {

    @Test
    public void test() {
        assertEquals(23, new SumOf3And5().solution(10));
    }
}
