package lamps;

public class LampTest {
    public void run(){
        Lamp skriveBordsLampe = new Lamp();
        Lamp stueLampe = new Lamp(true);
        Lamp BadeVærelse = new Lamp(false);

        skriveBordsLampe.pushSwitch();
        System.out.println(stueLampe.getNumOfLamps());
    }
    public static void main(String[] args) {
        LampTest lampTest = new LampTest();
        lampTest.run();
    }
}
