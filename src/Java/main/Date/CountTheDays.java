package Java.main.Date;

import java.util.Date;

public class CountTheDays {

    public String countDays(Date d){

        Date now = new Date();
        if(now.after(d))
            return "The day is in the past!";
        else if(now.equals(d))
            return "Today is the day!";
        else
            return ((d.getTime() - now.getTime())/1000/60/60/24) + " days";

    }
}
