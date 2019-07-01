package piggame;

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {

        Die dice1 = new Die();
        Die dice2 = new Die();

        int humanScore = 0;
        int computerScore = 0;
        int computerRoundScore = 0;
        int humanRoundScore = 0;
        int computerStopGap = 20;

        final int VictoryNumber = 100;
        String affirmation = "Y";
        String deconsecrated = "N";

        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();



        while (humanScore < VictoryNumber || computerScore < VictoryNumber) {

                do {
                    dice1.roll();
                    dice2.roll();
                    System.out.println();
                    System.out.println("You rolled a " + dice1.getFaceValue() + " & a "
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
                    else if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1){
                        int snakeEyes = 0;
                        humanScore = snakeEyes;
                        break;
                    }

                        //The condition in which both values of the die can be added
                    else if (dice1.getFaceValue() != 1 && dice2.getFaceValue() != 1){

                        humanRoundScore = dice1.getFaceValue() + dice2.getFaceValue();
                        humanScore = humanScore + humanRoundScore;
                        System.out.println("Human score is now " + humanScore + ".");
                        System.out.println("Do you want to roll: (Y/N)");
                        answer = scan.nextLine();

                        if (answer == deconsecrated){
                            System.out.println("Human turn total ");
                            System.out.println("Human score: " + humanScore);
                            System.out.println("Computer score: " + computerScore);
                            break;
                        }
                    }

                }while (answer.equalsIgnoreCase(affirmation));

                if(humanScore >= VictoryNumber) {
                    System.out.println("Your total score is " + humanScore);
                    System.out.println("The human wins!");
                    break;
                }

                //Code below this point mostly pertains to the functionality of the computer
                System.out.println();
                System.out.println("It's the Computer's turn.");

                do{
                   dice1.roll();
                   dice2.roll();

                    if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1) {
                        computerRoundScore = 0;
                        computerScore = computerScore + computerRoundScore;
                        break;
                    }

                    else if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1){
                        int snakeEyes = 0;
                        computerScore = snakeEyes;
                        break;
                    }

                    else if((dice1.getFaceValue() != 1 && dice2.getFaceValue() != 1)){
                        computerRoundScore = dice1.getFaceValue() + dice2.getFaceValue();
                        computerScore = computerScore + computerRoundScore;
                        System.out.println("The computer rolled " + dice1.getFaceValue()
                        + " & a " + dice2.getFaceValue());
                    }

                }while(computerRoundScore < computerStopGap);

                if (computerScore >= VictoryNumber){
                    System.out.println("The computer score is " + computerScore);
                    System.out.println("The computer wins");
                    break;
                }

                if (humanScore > computerScore){
                    System.out.println("The Human wins!");
                    break;
                } else if(humanScore == computerScore){
                    System.out.println("No one wins...");
                    break;
                } else if (humanScore < computerScore){
                    System.out.println("The Computer wins!");
                    break;
                }

        }

    }

}


