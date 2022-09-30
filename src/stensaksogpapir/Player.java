package stensaksogpapir;

import java.util.Scanner;

public class Player {
    private int choice;

    public int choice(){
        Scanner in = new Scanner(System.in);
        String input;
        do {
            System.out.print("Do you play rock/paper/scissor: ");
            input = in.nextLine();
            switch (input){
                case "rock" -> choice = 1;
                case "paper" -> choice = 2;
                case "scissor" -> choice = 3;
                default -> System.out.println("Unknown choice try again");
            }
        } while (input.equals("Unknown choice try again"));

        return choice;
    }

}
