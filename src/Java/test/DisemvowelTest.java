package Java.test;

import Java.main.Disemvowel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisemvowelTest {

    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", Disemvowel.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Disemvowel.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", Disemvowel.disemvowel("What are you, a communist?"));
    }
}
