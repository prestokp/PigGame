package piggame;

import java.util.Scanner;

public class Pig {

    public static Scanner scan = new Scanner(System.in);

    Die dice1 = new Die();
    Die dice2 = new Die();

    public static int Player1Points = 0;
    public static int Player2Points = 0;
    public static int PointCounter;
    int WinThreshold = 100;

    public String Player1 = "Human";
    public String Player2 = "Computer";

    public static void main(String[] args) {

        System.out.println("This is the Dice Game");
        System.out.println("Player 1 is up first...");
        p1GameLogic();

    }

    int PlayerTurn;



    public void p1GameLogic(){
        PointCounter = 0;
        System.out.println("Do you want to roll: (Y/N)");
        String answer = scan.nextLine();
        answer = answer.toUpperCase();

        if (answer.equals("N")){
            System.out.println("Player 2's turn");
            p2GameLogic();
        }

        int Rolls = Roll();
        dice1.roll();
        dice2.roll();
        System.out.println("Rolled Numbers: " + Rolls);
        while (Player1Points + PointCounter < 100){
            while (dice1.getFaceValue() != 1 || dice2.getFaceValue() != 2){
                PointCounter = PointCounter + Rolls;
                System.out.println("Do you want to roll: (Y/N)");
                answer = scan.nextLine();
                answer = answer.toUpperCase();
            }
            if (answer.equals("N")){
                Player1Points = Player1Points + PointCounter;
                System.out.println("Player 1 ended their turn");
                //System.out.println("Scores for the game");
                System.out.println("Player 2 roll");
                p2GameLogic();
            }

        }
        if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1){
            PointCounter = 0;
        }
        System.out.println("Player 1 rolled a One.");
        System.out.println("Scores for the game");
        System.out.println("Player 2 roll");
        p2GameLogic();


    }

    public void p2GameLogic(){
        dice2.roll();
        dice1.roll();
        PointCounter = 0;
        System.out.println("Do you want to roll: (Y/N)");
        String answer = scan.nextLine();
        answer = answer.toUpperCase();
        if (answer.equals("N")){
            System.out.println("Player 2 skipped their turn");
            System.out.println("Player 1 turn to roll");
            p1GameLogic();
        }
        int Rolls = Roll();
        System.out.println("You rolled a " + Roll());
        while (Player2Points < 100){
            while (dice2.getFaceValue() != 1 || dice1.getFaceValue() != 1){
                Player2Points = Player2Points + PointCounter;
                System.out.println("Do you want to roll: (Y/N)");
                answer = answer.toUpperCase();

            }
            if (Player2Points > 20){
                System.out.println("Player 2 Turn ended");
                System.out.println("Here is game score");
                p1GameLogic();
            }
            if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1){
                PointCounter = 0;
            }
            if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1){
                Player2Points = 0;
            }
        }
    }

//Refer to player mechanics methodology on stack exchange codereview

    public int Roll(){
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


}
