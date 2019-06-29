package piggame;

import java.util.Scanner;

public class Pig {

    public static Scanner scan = new Scanner(System.in);

    Die dice1 = new Die();
    Die dice2 = new Die();

    final int WinThreshold = 100;

    public String Player1 = "Human";
    public String Player2 = "Computer";

    public static void main(String[] args) {

        System.out.println("This is the Dice Game");
        System.out.println("Player 1 is up first...");

    }

    public void p1GameLogic(){
        int Player1Points = 0;
        int PointCounter = 0;
        System.out.println("Do you want to roll: (Y/N)");
        String answer = scan.nextLine();
        answer = answer.toUpperCase();

        if (answer.equals("N")){
            System.out.println("Player 2's turn");
            //p2GameLogic();
        }

        Roll();
        System.out.println("Rolled Numbers: " + dice1.getFaceValue() + " " + dice2.getFaceValue());
        while (Player1Points < WinThreshold){
            while (dice1.getFaceValue() != 1 || dice2.getFaceValue() != 1){
                Player1Points = Player1Points + ;
                System.out.println("Do you want to roll: (Y/N)");
                answer = scan.nextLine();
                answer = answer.toUpperCase();
            }
            if (answer.equals("N")){
                Player1Points = Player1Points + PointCounter;
                System.out.println("Player 1 ended their turn");
                //System.out.println("Scores fo
                // r the game");
                System.out.println("Player 2 roll");
                //p2GameLogic();
            }
            if (answer.equals("Y")){
                Roll();
            }

        }
        if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1){
            PointCounter = 0;
        }
        System.out.println("Player 1 rolled a One.");
        System.out.println("Scores for the game");
        System.out.println("Player 2 roll");
        //p2GameLogic();


    }

    /*public void p2GameLogic(){
        Roll();
        int PointCounter = 0;
        System.out.println("Do you want to roll: (Y/N)");
        String answer = scan.nextLine();
        answer = answer.toUpperCase();
        if (answer.equals("N")){
            System.out.println("Player 2 skipped their turn");
            System.out.println("Player 1 turn to roll");
            p1GameLogic();
        }

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
            System.out.println("Player score is...");
            p1GameLogic();
        }
        System.out.println("Player 2's score reached 100");
    }*/

//Refer to player mechanics methodology on stack exchange codereview

    public int Roll(){
        int sum;
        dice1.roll();
        dice2.roll();
        sum = dice1.getFaceValue() + dice2.getFaceValue();
        return sum;
        }

    public void GameConditional(){
        if (answer.equals("N")){
            Player1Points = Player1Points + PointCounter;
            System.out.println("Player 1 ended their turn");
            //System.out.println("Scores for the game");
            System.out.println("Player 2 roll");
            //p2GameLogic();
        }
        if (answer.equals("Y")){
            Roll();
        }
    }

}
