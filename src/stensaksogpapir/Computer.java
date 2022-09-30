package stensaksogpapir;

import java.util.Random;

public class Computer {
    Random random = new Random();

    public int move(){
        return random.nextInt(3)+1;
    }
}
