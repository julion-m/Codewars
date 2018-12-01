package Java.main;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.StringDatatypeValidator;
import java.lang.Character;

public class CaesarCrypto {

    public static String encode(String text, int shift)
    {
        if(text == null || text == "")
            return "";

        char[] allChars = text.toCharArray();

        for(int i = 0; i < allChars.length; i++){

            int positionInASCII = allChars[i];
            int shiftedPosition = positionInASCII + shift;

            //if the shifted char is still in the a-aA-Z range
            if((shiftedPosition >= 65 && shiftedPosition <= 90) ||
                    (shiftedPosition >= 97 && shiftedPosition <= 122))
                allChars[i] = (char) (positionInASCII + shift);

            //else if(positionInASCII + shift < )
        }
        //a-zA-Z

        return allChars.toString();

    }
}
