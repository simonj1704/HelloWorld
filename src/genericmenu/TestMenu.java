package genericmenu;

public class TestMenu {
    public void run(){
        String[] menuItems = {"1. Choose ONE", "2. Choose TWO", "3. Choose THREE", "9. QUIT"};
        Menu menu = new Menu("MENU: ", "Please Choose",menuItems);
        menu.printMenu();
        int choice = menu.readChoice();
        boolean keepRunning = true;
        while (keepRunning){
            if (choice == 1 || choice == 2 || choice == 3 || choice == 9){
                keepRunning = false;
            } else {
                keepRunning = true;
                menu.readChoice();
                System.out.println("Choice not possible");
            }
        }

            switch (choice) {
                case 1 -> System.out.println("You choose ONE");
                case 2 -> System.out.println("You choose TWO");
                case 3 -> System.out.println("You choose THREE");
                case 9 -> System.out.println("You choose QUIT");
                default -> {
                    System.out.println("Choice not possible");
                    System.out.println(menu.getLeadText());
                    menu.readChoice();
                }
            }

    }
    public static void main(String[] args) {
        TestMenu testMenu = new TestMenu();
        testMenu.run();
    }
}
