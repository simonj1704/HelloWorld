package mytime;

import java.util.Scanner;

public class MyTime {
    Scanner in = new Scanner(System.in);

    private int hours;
    private int minutes;

    private void setHours(int hours){
        this.hours = hours;
    }
    public int getHours(){
        return hours;
    }

    private void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public int getMinutes(){
        return minutes;
    }

    public int inputHours(){
        System.out.print("Input Hours: ");
        int inputHours = in.nextInt();
        in.nextLine();
        if (inputHours < 0 ){
            System.out.println("Unacceptable input try again: ");
            inputHours = in.nextInt();
        }
        return inputHours;
    }

    public int inputMinutes(){
        System.out.print("Input Minutes: ");
        int inputMinutes = in.nextInt();
        in.nextLine();
        if (inputMinutes < 0 ){
            System.out.println("Unacceptable input try again: ");
            inputMinutes = in.nextInt();
        }
        return inputMinutes;
    }

    public void printTime(){
        setHours(inputHours());
        setMinutes(inputMinutes());
        System.out.printf("%d:%02d", getHours(), getMinutes());
    }

}
