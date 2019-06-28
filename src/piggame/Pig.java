package piggame;

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {
        while (!Pig.){

        }
    }
    Die dice1 = new Die();
    Die dice2 = new Die();
    int PlayerTurn;

    String Player1 = "Human";
    String Player2 = "Computer";

    int WinThreshold = 100;

    int Player1Points;
    int Player2Points;

//Refer to player mechanics methodology on stack exchange codereview

    public int Rolls(){
        int RollPoints;
        dice1.roll();
        dice2.roll();
        RollPoints = dice1.getFaceValue() + dice2.getFaceValue();
        return RollPoints;
        }

    public int Roll(int RoundPoints){
        System.out.println("Do you want to roll again (Y/N):");
        Scanner keystroke = new Scanner(System.in);
        String RollOrNot = keystroke.nextLine();


    }

    public boolean Gameover(int WinThreshold, int Player1Points, int Player2Points){
        boolean Player1Victory = true;
        boolean Player2Victory = true;

        if (Player1Points >= WinThreshold){
            return Player1Victory;
        }

        if (Player2Points >= WinThreshold){
            return Player2Victory;
        }

        Pig(){
            Player1Points = 0;
            Player2Points = 0;
            PlayerTurn = 1;
        }
    }


}
