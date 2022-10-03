package stensaksogpapir;

import java.util.Scanner;

public class Game {
    Computer com = new Computer();
    Player player = new Player();
    Scanner in = new Scanner(System.in);

    private int choice;
    private int comChoice;
    private int playerRoundsWon;
    private int comRoundsWon;
    private String comChoiceString;
    private String playerChoiceString;

    public void play(){
        System.out.println("Press ENTER to Play");
        in.nextLine();
    }

    public void setchoices(){
         choice = player.choice();
         comChoice = com.move();
    }


    public void checkWinner(){
            if (getChoice() == 1 && getComChoice() == 3){
            System.out.println("You won this round");
            playerRoundsWon++;
        } else if (getChoice() == 2 && getComChoice() == 1){
            System.out.println("You won this round");
            playerRoundsWon++;
        } else if (getChoice() == 3 && getComChoice() == 2){
            System.out.println("You won this round");
            playerRoundsWon++;
        } else if (getChoice() == getComChoice()){
            System.out.println("It was a draw");
        } else {
            System.out.println("The Computer won this round");
        }
    }

    public int getChoice(){
        return choice;
    }
    public int getComChoice(){
        return comChoice;
    }

    public int getPlayerRoundsWon(){
        return playerRoundsWon;
    }
    public int getComRoundsWon(){
        return comRoundsWon;
    }

    public String translateChoice(){
        switch (getChoice()){
            case 1 -> playerChoiceString = "rock";
            case 2 -> playerChoiceString = "paper";
            case 3 -> playerChoiceString = "scissor";
        }
        return playerChoiceString;
    }

    public String translateComChoice(){
        switch (getComChoice()){
            case 1 -> comChoiceString = "rock";
            case 2 -> comChoiceString = "paper";
            case 3 -> comChoiceString = "scissor";
        }
        return comChoiceString;
    }

    public void winner(){
        if(getPlayerRoundsWon() == 3){
            System.out.println("CONGRATULATIONS!! \nYOU WON!!");
        }
        if (getComRoundsWon() == 3){
            System.out.println("YOU LOST TO THE COMPUTER!!");
        }
    }
}
