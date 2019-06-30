package piggame;

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {

        Die dice1 = new Die();
        Die dice2 = new Die();

        final int VictoryNumber = 100;

        int humanScore; //This variable is to keep the total human score
        int computerScore = 0; //This variable is to keep the total computer score
        int roundScore; //This variable is to keep the score in individual rounds

        public String askRoll(){

        }
        while (humanScore < VictoryNumber || computerScore < VictoryNumber){

            boolean ControlFlow = true;

            if (ControlFlow = true){

                while(humanRoll){
                    humanScore = 0;
                    dice1.roll();
                    dice2.roll();

                    //The condition in which both values of the die can be added
                    if (dice1.getFaceValue() != 1 && dice2.getFaceValue() != 1){
                        int sum;
                        sum = dice1.getFaceValue() + dice2.getFaceValue();
                        humanScore = humanScore + sum;
                    }

                    //The condition in which one value of the die is 1, no points
                    //added for this round
                    if (dice1.getFaceValue() == 1 || dice2.getFaceValue() == 1){
                        int noPoints = 0;
                        humanScore = humanScore + noPoints;
                        ControlFlow = false;
                    }

                    //The condition in which both values of the die are 1
                    //Eliminates all accumulated points by assigning the points to 0
                    if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1){
                        int snakeEyes = 0;
                        humanScore = snakeEyes;
                        ControlFlow = false; //probably going to replace with a function that can control the methods
                    }

                    if (ControlFlow = false){
                        computerScore = 0;
                        int computerRoundScore; //This keeps track the score for the computer per round
                                                //If the
                    }

                } //While loop delimiter

            }
        }




        }//Delimiter for the main function
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

