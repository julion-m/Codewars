package Java.test.Date;

import Java.main.Date.MinutesToMidnight;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Date;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinutesToMidnightTest {

    @Test
    public void exampleTests(){
        MinutesToMidnight m = new MinutesToMidnight();
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date d = cal.getTime();
        assertEquals("720 minutes", m.countMinutes(d));

        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        d = cal.getTime();
        assertEquals("1 minute", m.countMinutes(d));
    }

}