package piggame;

import java.util.Scanner;

public class Pig {

    private static String Player1 = "Human";
    private static String Player2 = "Computer";

    private static int WinThreshold = 100;

    private int Player1Points;
    private int Player2Points;

    public static void TheRolls(){

    }

    //private String GameStatus(){
    //}


    private void Roll(int RoundPoints){
        System.out.println("Do you want to roll again (Y/N):");
        Scanner keystroke = new Scanner(System.in);
        String RollOrNot = keystroke.nextLine();
    }

    private boolean Gameover(){

        boolean Player1Victory = Player1Points >= WinThreshold;
        boolean Player2Victory = Player2Points >= WinThreshold;
        return Player1Victory || Player2Victory;
    }

    public Pig(){
        Player1Points = 0;
        Player2Points = 0;
        PlayerTurn = 1;
    }
}
