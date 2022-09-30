package friendswithdata;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsTest {
    public void run(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many friends do you want to enter: ");
        int input = in.nextInt();
        in.nextLine();
        Friend[] friends = new Friend[input];
        for (int i = 0; i < friends.length; i++) {
            System.out.print("What is the friends name: ");
            String name = in.nextLine();

            System.out.print("What is their phoneNumber: ");
            String phone = in.nextLine();

            System.out.print("What is their email: ");
            String email = in.nextLine();

            friends[i] = new Friend(name,phone,email);
            System.out.println();
        }

        System.out.println(Arrays.toString(friends));

    }
    public static void main(String[] args) {
        FriendsTest friendsTest = new FriendsTest();
        friendsTest.run();
    }
}
