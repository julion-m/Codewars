package Java.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Disemvowel {

    public static String disemvowel(String str){

        Pattern pt = Pattern.compile("[^aeiou]");
        Matcher matcher = pt.matcher(str);
        int i = 0;
        while(matcher.find() || i < str.length()){
            str = str.replace(Character.toString(str.charAt(matcher.start())), "");
            i++;
        }
        return str;
    }
}

