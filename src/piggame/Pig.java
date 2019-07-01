package piggame;

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {

        Die dice1 = new Die();
        Die dice2 = new Die();

        int humanScore = 0;         //Keeps track of total user score
        int computerScore = 0;      //Keeps track of total computer score
        int computerRoundScore = 0; //Keeps track of round score for computers
        int humanRoundScore = 0;    //Keeps track of round score for user
        int computerStopGap = 20;   //Threshold that computer round score cannot go above

        final int VictoryNumber = 100;  //Constant, points required to win the game
        String affirmation = "Y";       //Affirmative string response by the user
        String deconsecrated = "N";     //Negative string response by the user

        Scanner scan = new Scanner(System.in);  //Scanner object to take in user input
        String answer = scan.nextLine();        //Stores user input in reference variable

        System.out.println("PIG");
        System.out.println("User: " + humanScore + "  ||  " + "Computer: " + computerScore);
        System.out.println("Do you want to roll: (Y/N)");

        //This while loop keeps the whole game running until game winning conditions are met.
        while (humanScore < VictoryNumber || computerScore < VictoryNumber) {


            if (answer.equalsIgnoreCase(affirmation)) {

                do {
                    System.out.println("User's turn.");
                    //Rolls the dice
                    dice1.roll();
                    dice2.roll();
                    System.out.println();
                    System.out.println("You rolled a " + dice1.getFaceValue() + " and a "
                            + dice2.getFaceValue());

                    //The condition in which one value of the die is 1, no points
                    //added for this round
                    if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1) {
                        humanRoundScore = 0;
                        humanScore = humanScore + humanRoundScore;
                        break;
                    }

                    //The condition in which both values of the die are 1
                    //Eliminates all accumulated points by assigning the points to 0
                    else if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1) {
                        int snakeEyes = 0;
                        humanScore = snakeEyes;
                        break;
                    }

                    //The condition in which both values of the die can be added
                    else if (dice1.getFaceValue() != 1 && dice2.getFaceValue() != 1) {

                        humanRoundScore = dice1.getFaceValue() + dice2.getFaceValue();
                        humanScore = humanScore + humanRoundScore;
                        System.out.println("Human score is now " + humanScore + ".");
                        System.out.println("Do you want to roll: (Y/N)");
                        answer = scan.nextLine();

                        if (answer == deconsecrated) {
                            System.out.println("Human turn total ");
                            System.out.println("Human score: " + humanScore);
                            System.out.println("Computer score: " + computerScore);
                            break;
                        }
                    }

                } while (answer.equalsIgnoreCase(affirmation));
                //User turn While Loop delimiter. User turn ends when the input doesn't
                //match the affirmation string "Y"
            }

                //Conditional code block that checks to see if the user has won the game
                if(humanScore >= VictoryNumber) {
                    System.out.println("Your total score is " + humanScore);
                    System.out.println("The human wins!");
                    break;
                }

                //Code below this point mostly pertains to the functionality of the computer turn
                System.out.println();
                System.out.println("It's the Computer's turn.");

                do{
                    //Rolls the dice
                   dice1.roll();
                   dice2.roll();
                   System.out.println("The computer rolled " + dice1.getFaceValue()
                            + " and a " + dice2.getFaceValue());
                    //The condition in which one value of the die is 1, no points
                    //added for this round
                    if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1) {
                        computerRoundScore = 0;
                        computerScore = computerScore + computerRoundScore;
                        break;
                    }

                    //The condition in which both values of the die are 1
                    //Eliminates all accumulated points by assigning the points to 0
                    else if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1){
                        int snakeEyes = 0;
                        computerScore = snakeEyes;
                        break;
                    }

                    //The condition in which both values of the die can be added
                    else if((dice1.getFaceValue() != 1 && dice2.getFaceValue() != 1)){
                        computerRoundScore = dice1.getFaceValue() + dice2.getFaceValue();
                        computerScore = computerScore + computerRoundScore;
                    }

                }while(computerRoundScore < computerStopGap);
                //Computer turn while loop delimiter. Computer turn ends when it reaches more
                //than 20 points in one round

                //Conditional code block that checks to see if the computer has won the game
                if (computerScore >= VictoryNumber){
                    System.out.println("The computer score is " + computerScore);
                    System.out.println("The computer wins");
                    break;
                }

                //Conditional code blocks that check user/computer scores against
                //each other and the Victory Number in order to determine if the
                //game was won and who won the game
                /*if (humanScore > computerScore){
                    System.out.println("The User wins!");
                    break;
                } else if(humanScore == computerScore){
                    System.out.println("No one wins...");
                    break;
                } else if (humanScore < computerScore){
                    System.out.println("The Computer wins!");
                    break;
                }*/

        } //Game While Loop Delimiter

    } //Main Function Delimiter

} //Public Class Pig Delimiter


