package nametheday;

import java.util.Scanner;

public class NameTheDay {
    Scanner in = new Scanner(System.in);
    private String day;
    private int input;

    private int dayInput(){
        input = in.nextInt();
        return input;
    }

    public void day(){

        do {
            day = checkDay(dayInput());
            System.out.println("I call that " + day);
        } while (!day.equals("Unknown day"));
    }

    private String checkDay(int input){
        switch (input){
            case 1 -> day = "Monday";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6 -> day = "Saturday";
            case 7 -> day = "Sunday";
            default -> day = "Unknown day";
        }
        return day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
