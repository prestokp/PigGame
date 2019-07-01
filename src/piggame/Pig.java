package piggame;

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {

        Die dice1 = new Die();
        Die dice2 = new Die();

        int humanScore = 0;
        int computerScore = 0;
        int computerRoundScore = 0;

        final int VictoryNumber = 100;
        String affirmation = "Y";
        String deconsecrated = "N";

        Scanner scan


        while (humanScore < VictoryNumber || computerScore < VictoryNumber) {
            /*humanScore = 0;               //This variable is to keep the total human score
            computerScore = 0;            //This variable is to keep the total computer score

            boolean ControlFlow = true;       //Need the control flow to determine which players' turn it is
                                              //If it's the computer's turn, it rolls automatically until
                                              //conditional statements are activated
            if (ControlFlow = true) {*/

                while (humanScore < 100 /*ControlFlow = true*/) {
                    dice1.roll();
                    dice2.roll();

                    //The condition in which both values of the die can be added
                    if (dice1.getFaceValue() != 1 && dice2.getFaceValue() != 1) {
                        int sum;
                        sum = dice1.getFaceValue() + dice2.getFaceValue();
                        humanScore = humanScore + sum;

                        System.out.println("Do you want to roll: (Y/N)");
                        Scanner scan = new Scanner(System.in);
                        String answer = scan.nextLine();
                        answer = answer.toUpperCase();
                        if (answer.equals("Y")){      //The point is that if the user inputs Y, then they keep rolling
                            //ControlFlow = true;       //If they put N, then it becomes the computers turn to roll
                        }

                        else if(answer.equals("N")){
                            //ControlFlow = false;
                        }
                    }

                    //The condition in which one value of the die is 1, no points
                    //added for this round
                    if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1) {
                        int noPoints = 0;
                        humanScore = humanScore + noPoints;
                        //ControlFlow = false;
                    }

                    //The condition in which both values of the die are 1
                    //Eliminates all accumulated points by assigning the points to 0
                    if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1) {
                        int snakeEyes = 0;
                        humanScore = snakeEyes;
                        //ControlFlow = false; //probably going to replace with a function that can control the methods
                    }

                    //Code below this point mostly pertains to the functionality of the computer
                    if (ControlFlow = false) {
                        computerScore = 0;


                        while (ControlFlow = false){
                            int computerRoundScore = 0; //This keeps track the score for the computer per round
                                                        //If the score gets above 20 the computer no longer rolls
                            dice1.roll();
                            dice2.roll();

                            if (dice1.getFaceValue() != 1 && dice1.getFaceValue() != 1){
                                int sum;
                                sum = dice1.getFaceValue() + dice2.getFaceValue();
                                computerScore += sum;
                                computerRoundScore += sum;
                                if (computerRoundScore >= 20){
                                    //ControlFlow = true;
                                }
                            }

                            if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1){
                                int noPoints = 0; //I don't need a variable, but if the rules of the game changed, variables make
                                                  //modularity convenient
                                computerScore += noPoints;
                                //ControlFlow = true;
                            }

                            if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1) {
                                int snakeEyes = 0; //I don't need a variable, but if the rules of the game changed, variables make
                                                   //modularity convenient
                                computerScore = snakeEyes;
                                //ControlFlow = true;
                            }

                        } //Computer while loop delimiter

                    } //Computer Control flow delimiter

                } //While loop delimiter for the rolling humans

            } //Control flow conditional delimiter

        } //While loop delimiter for the entire game

    } //Delimiter for the main function

    public String askRoll(){
        boolean ControlFlow = true;
        System.out.println("Do you want to roll(Y/N): ");  //This code prompts the user if they want to run again
        Scanner scan = new Scanner(System.in);            //This reads in the input Y or N for Yes or No
        String answer = scan.nextLine();
        answer = answer.toUpperCase();

        if (answer.equals("Y")){      //The point is that if the user inputs Y, then they keep rolling
            ControlFlow = true;       //If they put N, then it becomes the computers turn to roll
            return ControlFlow;
        }

        else if(answer.equals("N")){
            ControlFlow = false;
            return ControlFlow;
        }
        System.out.println("Current score is: " + humanScore + " || " + computerScore);
    }

} //Delimiter for the Pig Public Class




















    /*
    public int rollDice(){
        dice1.roll();
        dice2.roll();
        dice1.getFaceValue();
        dice2.getFaceValue();

    }

    public void playerTurn(){

        do{
            rollDice();
            checkForOnes();
            modifyScores();
            promptContinue();
        } while()
    }





    public int checkForOnes(){

        if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1){
            int roundZeroing;
            roundZeroing = 0;
            return roundZeroing;
        }
        if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1){
            int pointZeroing;
            pointZeroing = 0;
            return pointZeroing;
        }
        if (dice1.getFaceValue() != 1 && dice2.getFaceValue() != 1){
            int sum;
            sum = dice1.getFaceValue() + dice2.getFaceValue();
            return sum;
        }
        return
        }

    public int modifyScore(int roundZeroing, int pointZeroing, int sum){
        int totalPoints;
        if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1){
            totalPoints = totalPoints + roundZeroing;
        }
        if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1){
            int totalPoints = pointZeroing;

        }

    }
}*/

