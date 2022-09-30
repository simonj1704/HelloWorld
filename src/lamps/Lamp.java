package lamps;

public class Lamp {
    boolean isOn;

    private static int numOfLamps;

    public Lamp(boolean isOn){
        this.isOn = isOn;
        numOfLamps++;
    }

    public Lamp(){
        isOn = false;
        numOfLamps++;
    }

    public void pushSwitch(){
        if (isOn == true){
            isOn = false;
        } else {
            isOn = true;
        }
    }

    public int getNumOfLamps(){
        return numOfLamps;
    }

    public boolean isOn(){
        return isOn;
    }
}
