package nametheday;

public class TestNameOfDay {
    public void run(){
        NameTheDay theDay = new NameTheDay();
            System.out.print("Enter day of the week (1-7): ");
            theDay.day();
    }
    public static void main(String[] args) {
        TestNameOfDay testNameOfDay = new TestNameOfDay();
        testNameOfDay.run();
    }
}
