package stensaksogpapir;

import java.util.Random;

public class Computer {
    Random random = new Random();
    //TODO can change to one class. move to player class moveRandom()
    public int move(){
        return random.nextInt(3)+1;
    }
}
