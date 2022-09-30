package genericmenu;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    private String menuHeader; //den overskrift som skrives over menuen
    private String leadText; //den tekst som skrives når brugeren skal indtaste et valg, fx ”Vælg punkt”
    private String[] menuItems; //et array af Strings, som indeholder de mulige menupunkter

    public Menu(String menuHeader, String leadText, String[] menuItems){
        setMenuHeader(menuHeader);
        setLeadText(leadText);
        setMenuItems(menuItems);
    }

    public void printMenu(){
        System.out.println(getMenuHeader());
        System.out.println(Arrays.toString(getMenuItems()));
        System.out.println(getLeadText());
    }

    public int readChoice(){
        boolean keeprunning = true;
        int choice = 0;
        do{
            if(in.hasNextInt()){
                choice = in.nextInt();
                keeprunning = false;
            } else {
                in.nextLine();
                System.out.println(leadText);
            }
        } while (keeprunning);
        return choice;
        }

    public void setMenuHeader(String menuHeader){
        this.menuHeader = menuHeader;
    }
    public String getMenuHeader(){
        return menuHeader;
    }

    public void setLeadText(String leadText){
        this.leadText = leadText;
    }
    public String getLeadText(){
        return leadText;
    }

    public void setMenuItems(String[] menuItems){
        this.menuItems = menuItems;
    }
    public String[] getMenuItems(){
        return menuItems;
    }
}