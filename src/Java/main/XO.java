package Java.main;

public class XO {

    public static boolean getXO (String str) {

        str = str.toLowerCase();
        int x = 0;
        int o = 0;
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == 'x')
                x++;
            if(chars[i] == 'o')
                o++;
        }
        if(x == o){
            return true;
        }
        else
            return false;

    }
}
