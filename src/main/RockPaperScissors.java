package main;

public class RockPaperScissors {

    public static String rps(String p1, String p2) {

        String result;

        if(p1 == p2){
            result = "Draw!";
        }
        else if(p2.equals("paper") && p1.equals("rock") ||
                p2.equals("scissors") && p1.equals("paper") ||
                p2.equals("rock") && p1.equals("scissors")){
            result = "Player 2 won!";}
        else
            result = "Player 1 won!";
        return result;
    }

    //other method
    public static String rps2(String p1, String p2) {
        if(p1 == p2) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }
}
