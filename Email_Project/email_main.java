package Email_Project;

import java.util.Scanner;

public class email_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        String fname = scanner.nextLine();
        System.out.println("Enter your lastname");
        String lname = scanner.nextLine();

        email user1 = new email(fname,lname);

        user1.getInfo();
    }
}
