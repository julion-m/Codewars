package main;

public class AgeDiff {

    public static String calculateAge(int birth, int yearTo)
    {

        if (birth == yearTo)
            return "You were born this very year!";
        else if(birth + 1 == yearTo)
            return "You are 1 year old.";
        else if(yearTo + 1 == birth)
            return "You will be born in 1 year.";
        else if(birth > yearTo)
            return "You will be born in " + (birth - yearTo) + " years.";
        else
            return "You are " + (yearTo - birth) + " years old.";

    }
}
